package org.cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;


public class Player {
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
	int numTurns;

	   final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
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
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }
	   public void playKingdomCard() {
			while (numActions > 0) {
				List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);
				Iterator<Card> it = actionCards.iterator();
				while(it.hasNext()){
					Card c = it.next();
					if(c == Card.getCard(gameState.cards, Card.CardName.Gardens)){
						it.remove();
					}
				}
				if (actionCards.size() == 0)
					return;

				Card c = actionCards.get(0);

	            if (c == null)
					return;
				System.out.println("Player.actionPhase Card:" + c.toString());

				playedCards.add(c);
				hand.remove(c);

				numActions -= 1;

				c.play(this, gameState);//plays the kingdom card
			}
		}
		  
	   
	   final int scoreFor() { 
		      int score = 0;
		      int num = Math.floorDiv(deck.size() + hand.size() + discard.size(), 10);
		      int numGardens = Card.countCardName(hand, CardName.Gardens) + Card.countCardName(discard, CardName.Gardens) + Card.countCardName(deck, CardName.Gardens);
		      //score from hand
		      score = num * numGardens;
		      for (Card c : hand)
		    	  score += c.score(this);
		      //score from discard
		      for (Card c : discard)
		    	  score += c.score(this);
		      //score from deck
		      for (Card c : deck)
		    	  score += c.score(this);    
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
		   //play money cards to see how many coins
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
			System.out.println(player_username + "'s coins: " + coins + "\n");
	   }

	   void buyCard(GameState state) {
			while(numBuys > 0 && coins >= 0) {
				if (coins == 0 || coins == 1){
					gain(Card.getCard(state.cards, Card.CardName.Copper));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) - 1 );
				}
				else if (coins == 2) {
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Embargo)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Embargo));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Embargo), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) - 1);
						coins = coins - 2;
						//continue;
					} else if(state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Estate)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Estate));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Estate), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) - 1);
	                    coins = coins - 2;
	                }
				}
				else if (coins == 3) {
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Village)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Village));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Village), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) - 1);
						coins = coins - 3;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Ambassador)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Ambassador));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Ambassador), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) - 1);
						coins = coins - 3;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Great_Hall)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Great_Hall)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Great_Hall));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Great_Hall), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Great_Hall)) - 1);
						coins = coins - 3;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Silver)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Silver));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) - 1);
	                    coins = coins - 3;
	                    //continue;
	                }
				} else if (coins == 4) {
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Smithy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Smithy));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) - 1);
						coins = coins - 4;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Baron)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Baron));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Baron), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) - 1);
						coins = coins - 4;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Cutpurse)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Cutpurse));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Cutpurse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Cutpurse)) - 1);
						coins = coins - 4;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Feast)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Feast));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Feast), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Feast)) - 1);
						coins = coins - 4;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Steward)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Steward)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Steward));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Steward), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Steward)) - 1);
	                    coins = coins - 4;
	                    //continue;
	                } else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gardens)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gardens)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Gardens));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gardens), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gardens)) - 1);
						coins = coins - 4;
						//continue;
					}
				} else if (coins == 5) {
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Mine)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Mine));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Mine), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) - 1);
						coins = coins - 5;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Council_Room)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Council_Room)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Council_Room));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Council_Room), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Council_Room)) - 1);
	                    coins = coins - 5;
	                    //continue;
	                } else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Duchy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Duchy));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Duchy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Duchy)) - 1);
	                    coins = coins - 5;
	                    //continue;
	                }
				} else if (coins == 6) {
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Gold));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
						coins = coins - 6;
						//continue;
					} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Adventurer)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Adventurer));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) - 1);
	                    coins = coins - 6;
	                    //continue;
	                }
				} else if (coins == 7) {
	                if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
	                    gain(Card.getCard(state.cards, Card.CardName.Gold));
	                    state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
	                    coins = coins - 6;
	                }
				} else if (coins >= 8){
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Province)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) > 0) {
						gain(Card.getCard(state.cards, Card.CardName.Province));
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1);
						coins = coins - 8;
					}
					
			    }
				numBuys--;
			}
		}
	   
	   final void endTurn() {
		   //all played cards and cards in hand go to discard
		    coins = 0;
			numActions = 1;
			numBuys = 1;
			for(Card c: playedCards)
			{
				discard.add(c);
			}
			for(Card c: hand)
			{
				discard.add(c);
			}
			playedCards.clear();
         	hand.clear();
         	 
	   }
	  
	   public void printStateGame(){
		   //System.out.println(" --- " + this.player_username + " --- ");
		   //System.out.println(" --- --------------------------- --- ");
     		System.out.println(this.gameState.toString()); 
     		System.out.println(" --- --------------------------- --- ");
	   }
	   @Override
		public String toString() {
		     StringBuilder sb = new StringBuilder();
		     
       	 sb.append(" --- " + this.player_username + " --- ");
       	 sb.append(" --- " + "\n");

       	 sb.append("Total Turns: " + this.numTurns + "\n");
       	 sb.append("Hand: " + this.hand + "\n");
       	 sb.append("Discard: " + this.discard + "\n");
       	 sb.append("Deck: " + this.deck + "\n");
       	 sb.append("Played Cards: " + this.playedCards + "\n");
       	 sb.append("Actions: " + this.numActions + "\n");
       	 sb.append("Coins: " + this.coins + "\n");
       	 sb.append("Buys: " + this.numBuys);
       	 sb.append("\n");     

		     return sb.toString();

		}
	   
}