package org.cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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

	   final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
	}
            
        
        final Card checkCardType(Card input) {
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
                boolean x = true;
                Card toDraw = null;
                while(x) {
                    toDraw = deck.poll();
                    if(toDraw.getType() == input.getType()) {
                        hand.add(toDraw);// Add card to hand and hand count automatically will
							// be incremented since we use List
                        //System.out.println("draw " + toDraw);
                        Collections.sort(hand);
                        x = false;
                    }
                    else {
                        discard(toDraw);
                    }
                }
		return toDraw;
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
		System.out.println("draw " + toDraw);
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
           public void trash(Card card) {
               hand.remove(card);
               System.out.println("Player:  "+player_username+" threw away this card: "+card);
           }
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }
	   public void playKingdomCard() {
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);
		   
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("Player.actionPhase Card:" + c.toString());

			      playedCards.add(c);
			      numActions -= 1;

			      c.play(this, gameState);
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
	   
	   public void playTtreasureCard() {
		/*
                System.out.println(" --- --------------------------- --- ");
    		System.out.println("TO-DO playTtreasureCard "); 
    		System.out.println(" --- --------------------------- --- ");
                */
                
                List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
                int count = treasureCards.size(); //size of hand
                
                while (count > 0) {     
                    if (treasureCards.size() == 0) {
                        return;
                    }

                    Card c = (Card)treasureCards.get(count - 1);
                    if (c == null)
                               return;
                    System.out.println(player_username+" is using "+c.toString());

                    playedCards.add(c);
                    coins = coins + c.getTreasureValue();
                    discard(c);
                    count = count - 1;
                  }
	   }
           
	   public void buyCard(GameState gState) {
                    /*
                    System.out.println(" --- --------------------------- --- ");
                    System.out.println("TO-DO buyCard "); 
                    System.out.println(" --- --------------------------- --- ");
                    */
                    
                    if (numBuys == 0) {
                        System.out.println("You have used up all of your buys. You can only make one purchase per turn.");
                    }
                    else {
                        while (numBuys > 0) {
                            int x;
                            int randCost =  (int) Randomness.random.nextInt(coins + 1); //randomly s9elect a card within the range of available cards
                            System.out.println(player_username+" is buying...\n");
                            if (randCost == 0 || randCost == 1) {
                                x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Copper)); // get index of card
                                if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                    gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                    gState.cards.get(x).supplyPile -= 1;
                                }
                                gain(Card.getCard(gState.cards, Card.CardName.Copper));
                                numBuys = numBuys - 1; // reduce number of buys
                            }
                            else if (randCost == 2) {
                                randCost =  (int) Randomness.random.nextInt(2); // 2 = number of different cards to choose from (with same value)
                                if (randCost == 0) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Embargo)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Embargo));
                                }
                                else {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Estate)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Estate));
                                }
                                
                                numBuys = numBuys - 1; // reduce number of buys
                                coins = coins - 2; // reduce by coins spent
                            }
                            else if (randCost == 3) {
                                randCost =  (int) Randomness.random.nextInt(4); // 4 = number of different cards to choose from (with same value)
                                if (randCost == 0) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Ambassador)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Ambassador));
                                }
                                else if (randCost == 1) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Great_Hall)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Great_Hall));
                                }
                                else if (randCost == 2) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Village)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Village));
                                }
                                else if (randCost == 3) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Silver)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Silver));
                                }
                                
                                numBuys = numBuys - 1; // reduce number of buys
                                coins = coins - 3; // reduce by coins spent
                            }
                            else if (randCost == 4) {
                                randCost =  (int) Randomness.random.nextInt(6); // 6 = number of different cards to choose from (with same value)
                                if (randCost == 0) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Baron)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Baron));
                                }
                                else if (randCost == 1) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Cutpurse)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Cutpurse));
                                }
                                else if (randCost == 2) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Feast)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Feast));
                                }
                                else if (randCost == 3) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Gardens)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Gardens));
                                }
                                else if (randCost == 4) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Salvager)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Salvager));
                                }
                                else if (randCost == 5) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Smithy)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Smithy));
                                }
                                
                                numBuys = numBuys - 1; // reduce number of buys
                                coins = coins - 4; // reduce by coins spent
                            }
                            else if (randCost == 5) {
                                randCost =  (int) Randomness.random.nextInt(3); // 3 = number of different cards to choose from (with same value)
                                if (randCost == 0) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Duchy)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Duchy));
                                }
                                else if (randCost == 1) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Council_Room)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Council_Room));
                                }
                                else if (randCost == 2) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Mine)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Mine));
                                }
                                
                                numBuys = numBuys - 1; // reduce number of buys
                                coins = coins - 5; // reduce by coins spent
                            }
                            else if (randCost == 6) {
                                randCost =  (int) Randomness.random.nextInt(2); // 2 = number of different cards to choose from (with same value)
                                if (randCost == 0) {
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Adventurer)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Adventurer));
                                }
                                else if (randCost == 1) { 
                                    x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Gold)); // get index of card
                                    if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                        gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                        gState.cards.get(x).supplyPile -= 1;
                                    }
                                    gain(Card.getCard(gState.cards, Card.CardName.Gold));
                                }
                                
                                numBuys = numBuys - 1; // reduce number of buys
                                coins = coins - 6; // reduce by coins spent
                            }
                            else if (randCost >= 8) {
                                x = gState.cards.indexOf(Card.getCard(gState.cards, Card.CardName.Province)); // get index of card
                                if (gState.cards.get(x).supplyPile > 0) { // check if supply pile has curse
                                    gain(Card.getCard(gState.cards, Card.CardName.Curse));
                                    gState.cards.get(x).supplyPile -= 1;
                                }
                                gain(Card.getCard(gState.cards, Card.CardName.Province));
                                
                                numBuys = numBuys - 1; // reduce number of buys
                                coins = coins - 8; // reduce by coins spent
                            }
                        }
                    }
	   }
           
	   final void endTurn() {
                    /*
                    System.out.println(" --- --------------------------- --- ");
                    System.out.println("TO-DO endTurn "); 
                    System.out.println(" --- --------------------------- --- ");
                    */
                    
                    System.out.println("Player ended turn, discarding hand...\n");
                    int count = 0;
                    while (!hand.isEmpty()) {
                        discard(hand.get(0));
                    }
                    System.out.println("Drawing new hand...\n");
                    while (count < 5) {
                        drawCard();
                        count = count + 1;
                    }
                    
                    System.out.println("End of turn.\n");
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
