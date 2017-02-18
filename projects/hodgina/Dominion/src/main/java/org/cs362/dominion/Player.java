package org.cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.cs362.dominion.Card.Type;


public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
													// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int
												// discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();

	private Random rand_gen = new Random();

	String player_username;

	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;


	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
	}



	final Card drawCard() {
	    if(discard.isEmpty() && deck.isEmpty()) {
            return null;
        }
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

            Card toDraw = deck.removeFirst();//poll();
            hand.add(toDraw);// Add card to hand and hand count automatically will
            // be incremented since we use List
            System.out.println("draw " + toDraw);
            Collections.sort(hand);
            return toDraw;
	}

	   final void initializePlayerTurn() {
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
		      System.out.println("-----------------------------------");
		      System.out.println(this.player_username + " gains "+card);
              System.out.println("-----------------------------------");
		      return true;
		   }
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  " + player_username + " discards "+card);
		   }
	   public void playKingdomCard() {
           System.out.println("-----------------------------------");
           System.out.println("        Playing Kingdom Cards      ");
           System.out.println("-----------------------------------");
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);

		         if (actionCards.size() == 0)
		            return;

		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println(player_username + " is playing: " + c.toString());

			      playedCards.add(c);
			      hand.remove(c);
			      numActions -= 1;

			      c.play(this, gameState);
		      }
		   }
	   final int scoreFor() {
           int numGardens = 0;
           int numCards = 0;
           int score = 0;
           //score from hand
           for (Card c : hand)
               score += c.score();
           numCards++;
           //score from discard
           for (Card c : discard){
               if(Card.getCard(discard, Card.CardName.Gardends) != null) {
                   if(c == Card.getCard(discard ,Card.CardName.Gardends)) numGardens++;
               }
               score += c.score();
               numCards++;
           }
           //score from deck
           for (Card c : deck){
               if(Card.getCard(deck, Card.CardName.Gardends) != null){
                   if(c == Card.getCard(discard ,Card.CardName.Gardends)) numGardens++;
               }
               score += c.score();
               numCards++;
           }
           //System.out.println("numGardens: " + numGardens);
           if(numGardens > 0){
               score += numGardens*(numCards/10);
           }

           return score;
       }

	   public void playTreasureCard() {
           System.out.println("-----------------------------------");
           System.out.println("        Playing TreasureCards      ");
           System.out.println("-----------------------------------");
		  List<Card> T_Cards = Card.filter(hand, Card.Type.TREASURE);
		  if(T_Cards.size() == 0) {
              return;
          }
		  System.out.println("Treasure Cards Played: ");

		  for(Card current_card : T_Cards){ //goes through and adds up all the treasure and puts them in the played cards pile
		  	coins += current_card.getTreasureValue();
		  	System.out.println(current_card.toString());
		  	playedCards.add(current_card);
		  	hand.remove(current_card);
		  	//System.out.println("Current Number of Coins is: " + coins);
		  }
		  System.out.println(player_username + " has " + coins + " to use in Buy Round.");
	   }
	   public void buyCard(GameState current_state) {



           System.out.println("-----------------------------------");
           System.out.println("            Buying Cards           ");
           System.out.println("-----------------------------------");


        while(coins > 0 && numBuys > 0){

            List<Card> buyable = new ArrayList<Card>(); //list of cards that the player will be able to choose from to buy cards

            for(Card cards : current_state.cards){ //find all cards that you can buy that are not copper, curse or provinces and puts them into a buyable list
            	if((cards.getCardName() != Card.CardName.Curse) && (cards.getCardName() != Card.CardName.Province) && (cards.getCardName() != Card.CardName.Copper)) {
					if (cards.getCost() <= coins && (current_state.gameBoard.containsKey(Card.getCard(current_state.cards, cards.getCardName())) && current_state.gameBoard.get(Card.getCard(current_state.cards, cards.getCardName())) > 0)) {
						buyable.add(cards);
					}
				}
			}

			while(numBuys > 0 && coins > 0 ){ //while coins is greater than 0 and number buys is greater than 0 keep buying cards
            	if(coins == 0 || coins == 1){ //if you have no coins or you only have 1 coin just buy a copper

					gain(Card.getCard(current_state.cards, Card.CardName.Copper));
					current_state.gameBoard.put(Card.getCard(current_state.cards, Card.CardName.Copper), current_state.gameBoard.get(Card.getCard(current_state.cards, Card.CardName.Copper)) - 1);
					coins = coins - 8;
				}else if(coins == 2) { //if you have 2 coins buy either an embargo or an estate
            		//I got help with this section from David Baugh
					int rand = rand_gen.nextInt(2);
					if (rand == 0 && current_state.gameBoard.containsKey(Card.getCard(current_state.cards, Card.CardName.Embargo)) && current_state.gameBoard.get(Card.getCard(current_state.cards, Card.CardName.Embargo)) > 0) {
						gain(Card.getCard(current_state.cards, Card.CardName.Embargo));
						current_state.gameBoard.put(Card.getCard(current_state.cards, Card.CardName.Embargo), current_state.gameBoard.get(Card.getCard(current_state.cards, Card.CardName.Embargo)) - 1);
						coins = coins - 2;
					} else if (rand == 1 && current_state.gameBoard.containsKey(Card.getCard(current_state.cards, Card.CardName.Estate)) && current_state.gameBoard.get(Card.getCard(current_state.cards, Card.CardName.Estate)) > 0) {
						gain(Card.getCard(current_state.cards, Card.CardName.Estate));
						current_state.gameBoard.put(Card.getCard(current_state.cards, Card.CardName.Estate), current_state.gameBoard.get(Card.getCard(current_state.cards, Card.CardName.Estate)) - 1);
						coins = coins - 2;
					}

				}else if(coins >= 8){ //if you have more thatn 8 coins buy a province
					gain(Card.getCard(current_state.cards, Card.CardName.Province));
					current_state.gameBoard.put(Card.getCard(current_state.cards, Card.CardName.Province), current_state.gameBoard.get(Card.getCard(current_state.cards, Card.CardName.Province)) - 1);
					coins = coins - 8;
				}else { //else find a card to buy and buy it
					int rand = rand_gen.nextInt(coins);
						gain(buyable.get(rand));
						current_state.gameBoard.put(Card.getCard(current_state.cards, buyable.get(rand).getCardName()), current_state.gameBoard.get(Card.getCard(current_state.cards, buyable.get(rand).getCardName())));
						coins = coins - buyable.get(rand).getCost();
				}
				numBuys--; //subtract from number of buys
			}

			}



        }
	   final void endTurn() {
           System.out.println("-----------------------------------");
           System.out.println("              End Turn             ");
           System.out.println("-----------------------------------");


           //reset all coins, actions and buys back to the start values
           coins = 0;
            numActions = 1;
            numBuys = 1;
            //discards all played cards
            for(Card current_card : playedCards){
                discard.add(current_card);
            }
            //discards everything in the hand
           for(Card current_card : hand){
               discard.add(current_card);
           }
           hand.clear(); //clears the hand list
           playedCards.clear(); //clears the played cards list
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
