package org.cs362.dominion;

import java.util.*;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int deck[MAX_PLAYERS][MAX_DECK];											// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();
	
	//Used for randomly generating a number to pick certain cards
	private Random gen;
	String player_username;

	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;
	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
		deck = new LinkedList<Card>();
		hand = new ArrayList<Card>();
		playedCards = new ArrayList<Card>();
		discard = new ArrayList<Card>();		
	}

	final Card drawCard() {
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw);// Add card to hand and hand count automatically will
							// be incremented since we use List
		System.out.println("draw: " + toDraw);
		Collections.sort(hand);
		return toDraw;
	}
	
	   final void initializePlayerTurn() {
		   //initialize first player's turn
//		   state->numnumActions = 1;
//		   state->numnumBuys = 1;
		      numActions = 1;
		      coins = 0;
		      numBuys = 1;
		      //Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
		      //5 cards as your starting hand
		      for (int i = 0; i < 5; i++) {
		    	  drawCard();
		      }
		   }

	 //card goes in discard,
	   final boolean gain(Card card) {
		      discard.add(card);
		      System.out.println("Player: "+this.player_username+" gains "+card);
		      return true;
		   }		   
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }
	   public void playKingdomCard() {
		   System.out.println("-------- Playing Kingdom Card ---------");
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);
		   
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         
		         if (c == null)
			           return;
		         
		         System.out.println(player_username + " played ability: " + c.toString());
			      playedCards.add(c);
			      hand.remove(c);
			      numActions--;
			      
			      //play the kingdom card
			      c.play(this, gameState);
			      
			      System.out.println("^^^^^^^ Playing Kingdom Card ^^^^^^^^");
		      }
		      
		   }
	   final int scoreFor() { 
		   int score = 0;
		   //score from hand
		      for (Card c : hand)
		    	  score += c.score();
		      //score from discard
		      for (Card c : discard)
		    	  score += c.score();
		      //score from deck
		      for (Card c : deck)
		    	  score += c.score();

		      
		    
		      return score;
	   }    
	   
	   public void playTreasureCard() {
		   	/*
		   	 * Filters through the players hand for treasure cards, then for each treasure card
		   	 * it finds it will play it and add it to the players coin 'purse', removing it from
		   	 * their hand.
		   	 */
		   
		   System.out.println("------ Playing Treasure Card ------");
    		List<Card> treasureCards = Card.filter(hand, Card.Type.TREASURE);
    		if(treasureCards.size() == 0) {
    			return;
    		}
    		for(Card c : treasureCards) {
    			coins += c.getTreasureValue();
    			System.out.println(player_username + " played: " + c.toString());
    			playedCards.add(c);
    			hand.remove(c);
    		}
    		System.out.println(player_username + "'s Coins: " + coins + "\n");
    		System.out.println("^^^^^^^ Playing Treasure Card ^^^^^^^^");
	   }
	   public void buyCard(GameState state) {
		   /*
		    * As long as the player has the ability to buy they can buy cards until they have no more
		    * buy's left, however if they have buy's left but no coins they can still buy copper
		    * treasure cards until they run out of buy's.
		    */
		   while(numBuys > 0 && coins > 0) {
			   //can only afford a Copper with 1 or 0coins, of course that depends if you 
			   //have any Buy left at all.
			   if (coins == 0 || coins == 1) {
				   gain(Card.getCard(state.cards, Card.CardName.Copper));
				   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) - 1);
				   if(coins == 1) {
					   coins--;
				   }
			   }//end conditional for 0 or 1 coins
			   
			   //Two coins can only buy an Embargo or Estate, so just randomly choose one of the
			   //two to buy.
			   else if (coins == 2) {
				   int rand1 = gen.nextInt(2);
				   if(rand1 == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Estate)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Estate));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Estate), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) - 1);
					   coins = coins - 2;
				   }
				   else if(rand1 == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Embargo)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Embargo));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Embargo), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) - 1);
					   coins = coins - 2;
				   }
			   }//ends conditional for 2 coins
			   
			   //Three coins can buy an Ambassador, a Silver, a Great_Hall, or a Village
			   else if (coins ==3) {
				   int rand2 = gen.nextInt(4);
				   if(rand2 == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Ambassador)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Ambassador));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Ambassador), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) - 1);
					   coins = coins - 3;
				   }
				   else if(rand2 == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Silver)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Silver));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) - 1);
					   coins = coins - 3;
				   }
				   else if(rand2 == 2 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Great_Hall)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Great_Hall)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Great_Hall));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Great_Hall), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Great_Hall)) - 1);
					   coins = coins - 3;
				   }
				   else if(rand2 == 3 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Village)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Embargo));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Village), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) - 1);
					   coins = coins - 3;
				   }
			   }//ends conditional for 3 coins
			   
			   //Four coins can buy a Baron, Cutpurse, Feast, Gardens, Remodel, or a Smithy
			   else if (coins ==4) {
				   int rand3 = gen.nextInt(6);
				   if(rand3 == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Baron)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Baron));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Baron), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) - 1);
					   coins = coins - 4;
				   }
				   else if(rand3 == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Cutpurse)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Cutpurse));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Cutpurse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) - 1);
					   coins = coins - 4;
				   }
				   else if(rand3 == 2 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Feast)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Feast));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Feast), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) - 1);
					   coins = coins - 4;
				   }
				   else if(rand3 == 3 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gardens)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gardens)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Gardens));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gardens), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gardens)) - 1);
					   coins = coins - 4;
				   }
				   else if(rand3 == 4 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Remodel)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Remodel)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Remodel));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Remodel), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Remodel)) - 1);
					   coins = coins - 4;
				   }
				   else if(rand3 == 5 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Smithy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Smithy));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) - 1);
					   coins = coins - 4;
				   }
			   }//ends conditional for four coins
			   
			   //Five coins can buy a Duchy, Council_Room, or Mine
			   else if (coins ==5) {
				   int rand4 = gen.nextInt(3);
				   if(rand4 == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Duchy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Duchy));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Duchy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) - 1);
					   coins = coins - 5;
				   }
				   else if(rand4 == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Council_Room)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Council_Room)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Council_Room));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Council_Room), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Council_Room)) - 1);
					   coins = coins - 5;
				   }
				   else if(rand4 == 2 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Mine)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Mine));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Mine), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) - 1);
					   coins = coins - 5;
				   }
			   }//ends conditional for five coins
			   
			   //Six coins can buy Gold, or a Adventurer.
			   else if (coins == 6) {
				   int rand5 = gen.nextInt(2);
				   if(rand5 == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Gold));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
					   coins = coins - 6;
				   }
				   else if(rand5 == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Adventurer)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Adventurer));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) - 1);
					   coins = coins - 6;
				   }
			   }//ends conditional for six coins
			   
			   //I did not implement any kingdom cards that cost 7 coins so I'm just going to reuse the six coin conditional
			   else if (coins == 7) {
				   int rand5 = gen.nextInt(2);
				   if(rand5 == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Gold));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
					   coins = coins - 6;
				   }
				   else if(rand5 == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Adventurer)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Adventurer));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) - 1);
					   coins = coins - 6;
				   }
			   }//ends conditional for seven coins
			   
			   //Eight coins or more coins can buy a Province
			   else if (coins >= 8) {
				   if(state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Province)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) > 0) {
					   gain(Card.getCard(state.cards, Card.CardName.Province));
					   state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1);
					   coins = coins - 8;
				   }
			   }//ends conditional for eight or more coins
			   
			   //decrement number of Buy's the player have left
			   numBuys--;
			   
		   }//end while
		   
	   }
	   
	   final void endTurn() {
		   /*
		    * Discard everything in the player's hand and cards they have already played.
		    * Then reset their state so that they have no coins available, with one buy and one action
		    * ready for the next turn.
		    */
  			for(Card c : hand) {
  				discard.add(c);
  			}
  			for(Card c : playedCards) {
  				discard.add(c);
  			}
  			playedCards.clear();
  			hand.clear();
  			
  			coins = 0;
  			numActions = 1;
  			numBuys = 1;
  			
  			//initializePlayerTurn() will allow to player to draw five cards, so hopefully this doesn't break the game...
	   }
	   
	   
	   public void printStateGame(){
		   System.out.println(" --- " + this.player_username + " --- ");
		   System.out.println(" --- --------------------------- --- ");
     		System.out.println(this.gameState.toString()); 
     		System.out.println(" --- --------------------------- --- ");
	   }
	   @Override
		public String toString() {
		     StringBuilder sb = new StringBuilder();
		     
       	 sb.append(" --- " + this.player_username + " --- ");
       	 sb.append(" --- --------------------------- --- ");

       	 sb.append("Hand: " + this.hand);
       	 sb.append("Discard: " + this.discard);
       	 sb.append("Deck: " + this.deck);
       	 sb.append("Played Cards: " + this.playedCards);
       	 sb.append("numActions: " + this.numActions);
       	 sb.append("coinss: " + this.coins);
       	 sb.append("numBuys: " + this.numBuys);
       	 sb.append("\n");     

		     return sb.toString();

		}
	   
	    protected Player clone() throws CloneNotSupportedException {
	    	Player clonePlayer=(Player) super.clone();
	    	clonePlayer.hand = new ArrayList<Card>(hand);// int hand[MAX_PLAYERS][MAX_HAND];
			clonePlayer.deck = new LinkedList<Card>(deck);// int
															// deck[MAX_PLAYERS][MAX_DECK];
			clonePlayer.discard = new ArrayList<Card>(discard); // int
														// discard[MAX_PLAYERS][MAX_DECK];
			clonePlayer.playedCards = new ArrayList<Card>(playedCards);
			return clonePlayer;
	    } 	   
}
