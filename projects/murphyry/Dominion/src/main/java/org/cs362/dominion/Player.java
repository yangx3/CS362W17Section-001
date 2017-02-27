package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
													// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int
												// discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();

	String player_username;

	int numActions;
	int numBuys;
	int coins;
	private Random generator;
	
	public int getCoins() {
		return coins;
	}
	public int getnumActions(){
		return numActions;
	}
	public int getnumBuys(){
		return numBuys;
	}

	   final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
		generator = new Random();
	}

	final Card drawCard() {
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of "
					+ player_username + " who then draws FIVE cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw);// Add card to hand and hand count automatically will
							// be incremented since we use List
		System.out.println(player_username + " drew: " + toDraw);
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
		      System.out.println("Player: "+this.player_username+" gains "+card+"\n");
		      return true;
		   }		   
	   
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card+"\n");
		   }
	   
	   public void playKingdomCard() {
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);
		   
		         if (actionCards.size() == 0){
		        	 System.out.println("No ACTION cards to play \n");
		        	 return;
		         }
		            
		         
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("Player.actionPhase Card:" + c.toString());

			      playedCards.add(c);
			      numActions -= 1;
			      hand.remove(c);

			      c.play(this, gameState);
		      }
		   }
	   final int scoreFor() { 
		   int score = 0;
		   int totalCards = 0;
		   int totalGardens = 0;
		   
		   //score from hand
		      for (Card c : hand){
		    	  score += c.getScore();
		    	  totalCards++;
		    	  if(c == Card.getCard(hand ,Card.CardName.Gardens)) {
		    		  totalGardens++;
		    	  }
		      }
		      
		      //score from discard
		      for (Card c : discard){
		    	  score += c.getScore();
		    	  totalCards++;
		    	  if(c == Card.getCard(discard ,Card.CardName.Gardens)) {
		    		  totalGardens++;
		    	  }
		      }

		      //score from deck
		     for (Card c : deck){
		    	  score += c.getScore();
		    	  totalCards++;
		    	  if(c == Card.getCard(deck ,Card.CardName.Gardens)) {
		    		  totalGardens++;
		    	  }
		     }
		     
		     if (totalGardens > 0){
		    	 score += (totalGardens*totalCards/10); //rounds down by default
		     }
		      		    
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
		   List<Card> treasureCards = Card.filter(hand, Card.Type.TREASURE);


			if(treasureCards.size() == 0) return;


			System.out.println("Treasure Cards Played:");
			for(Card c: treasureCards)
			{
				coins += c.getTreasureValue();
				System.out.println(c.toString());
				playedCards.add(c);
				hand.remove(c);
			}
			System.out.println(player_username + "'s COINS: " + coins + "\n");
	   }
	   void buyCard(GameState state) {

		   int NoInfiniteLoop = 0;
		   while(numBuys > 0 && coins > 0 && NoInfiniteLoop < 8) {
			   
			   int random = generator.nextInt(state.cards.size());
			   Card tmp = state.cards.get(random);
			   if (coins >= 8){
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Province)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Province));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1);
						coins = coins - 8;
						numBuys --;
					}
			   }
			   else if(tmp.getCost() <= coins && tmp.getScore() != -1){
				   gain(tmp);
				   numBuys--;
				   NoInfiniteLoop = 0;
				   coins -= tmp.getCost();
				   
				   if(tmp.getCardName() == Card.CardName.Copper){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Copper)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Silver){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Silver)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Gold){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Estate){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Estate)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Estate), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Duchy){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Duchy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Duchy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Adventurer){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Adventurer)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Ambassador){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Ambassador)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Ambassador), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Baron){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Baron)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Baron), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.CouncilRoom){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.CouncilRoom)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.CouncilRoom)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.CouncilRoom), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.CouncilRoom)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Cutpurse){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Cutpurse)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Cutpurse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Embargo){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Embargo)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Embargo), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Feast){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Feast)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Feast), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Gardens){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gardens)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gardens)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gardens), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gardens)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.GreatHall){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.GreatHall)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.GreatHall)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.GreatHall), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.GreatHall)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Mine){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Mine)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Mine), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Laboratory){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Laboratory)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Laboratory)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Laboratory), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Laboratory)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Smithy){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Smithy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) - 1);
						}
					   
				   }
				   else if(tmp.getCardName() == Card.CardName.Village){
					   if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Village)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) > 0) {
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Village), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) - 1);
						}					   
				   }
			   }
			   else
				   NoInfiniteLoop++;
			   
		   }		   
	   }
	   final void endTurn() {
		   //reset actions, buys, coins
		   coins = 0;
		   numActions = 1;
		   numBuys = 1;
		   
		   for(Card c : playedCards)
			   discard.add(c);

		   for(Card c : hand)
			   discard.add(c);
		   hand.clear();
		   playedCards.clear();
		   
		   System.out.println( player_username + "'s turn is over. \n");
  			//System.out.println("TO-DO endTurn "); 
  			printStateGame();     
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
       	 sb.append(" \n ");

       	 sb.append("Hand: " + this.hand+"\n");
       	 sb.append("Discard: " + this.discard+"\n");
       	 sb.append("Deck: " + this.deck+"\n");
       	 sb.append("Played Cards: " + this.playedCards+"\n");
       	 sb.append("numActions: " + this.numActions+"\n");
       	 sb.append("coins: " + this.coins+"\n");
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

