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
	int AI_type;
	int numActions;
	int numBuys;
	int coins;
	int numSmithy;
	int numAdventurer;

	final GameState gameState;

	
	public Player(GameState gameState,String player_username, int AI_type) {
		this.player_username = player_username;
		this.gameState=gameState;
		this.AI_type = AI_type;
	}

	public void modifyAction(int num) {
		this.numActions += num;
	}
	public void modifyCoins(int num) {
		this.coins += num;
	}
	public void modifyBuy(int num) {
		this.numBuys += num;
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
	   public void playKingdomCard() {			//not done
	   		   System.out.println("Player: "+player_username+ "is playing kingdom cards.");
		    while (numActions > 0) {
		        List<Card> actionCards = Card.filter(hand, Type.ACTION);
				int x = 0;
		        if (actionCards.size() == 0)
		            return;
		        if (AI_type == 1) {			//play smithy. if smith = 0, play adventurer
					for (int i =0; i < actionCards.size(); i++) {
						if(actionCards.get(i).getCardName() == Card.CardName.Smithy) {
							Card C = actionCards.get(i);
							C.play(this, gameState, 0, 0);
							x = 1;
							discard(C);
							break;
						}
					}
					//if (x == 1)
					//	discard(C);
				}
				else if(AI_type == 2) {
					for ( int i = 0; i < actionCards.size(); i++) {
						if (actionCards.get(i).getCardName() == Card.CardName.Adventurer) {
							Card C = actionCards.get(i);
							C.play(this, gameState, 0, 0);
							x = 1;
							discard(C);
							break;
						}
					}
					//if (x == 1)
					//	discard(C);
				}

		        // Card c = (Card)actionCards.get(0);
		        // if (c == null)
			    //       return;
		        // System.out.println("Player.actionPhase Card:" + c.toString());

			    //  playedCards.add(c);
			    //  numActions -= 1;

			     // c.play(this, gameState);
				numActions -= 1;
		    }
			return;
		   }
	   final int scoreFor() { 
		   int score = 0;
		   //score from hand
		      for (Card c : hand) {
				  if(c.getCardName() == Card.CardName.Gardens) {
					score += (hand.size() + discard.size() + deck.size())/10;
				  }
		    	  score += c.score();
			  }
		      //score from discard
		      for (Card c : discard) {
				  if(c.getCardName() == Card.CardName.Gardens) {
					score += (hand.size() + discard.size() + deck.size())/10;
				  }
				  score += c.score();
			  }
		      //score from deck
		      for (Card c : deck) {
				  if(c.getCardName() == Card.CardName.Gardens) {
					score += (hand.size() + discard.size() + deck.size())/10;
				  }
		    	  score += c.score();
			  }
		      
		    
		      return score;
	   }    
	   
	    public void playTtreasureCard() {
					   System.out.println("\nPlayer: "+player_username+ "playing treasure cards.");
		    List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
			for (Card C : treasureCards) {
				if (C.getCardName() == Card.CardName.Cooper) {
					modifyCoins(1);
				}
				else if (C.getCardName() == Card.CardName.Silver) {
					modifyCoins(2);
				}
				else if (C.getCardName() == Card.CardName.Gold) {
					modifyCoins(3);
				}
			}
	   }
	   
	   public void buyCard(GameState state, Card card) {
		   System.out.println("\nPlayer: "+player_username+ "is buying.");
		    while (numBuys > 0) {  //set embargo
				int x = 0;
				if(AI_type == 1) {
					if(coins >= 8) {	//buy province
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Province));
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), x);
						}
					}
					else if (coins >= 6) {		//buy gold
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Gold));
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), x);
						}
					
					}
					else if ((coins >= 4) && (numSmithy < 2)) {		//buy smithy
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Smithy));
							numSmithy++;
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), x);
						}
					}
					else if (coins >= 3) {
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Silver));
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), x);
						}
					}
				}
				else if(AI_type == 2) {
					if(coins >= 8) {	//buy province
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Province));
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), x);
						}
					}
					else if (coins >= 6) {		//buy gold
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Gold));
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), x);
						}
					
					}
					else if ((coins >= 4) && (numAdventurer < 2)) {		//buy adventurers
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Adventurer));
							numAdventurer++;
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), x);
						}
					}
					else if (coins >= 3) {
						x = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver));
						if (x > 0) {
							gain(Card.getCard(state.cards, Card.CardName.Silver));
							x--;
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), x);
						}
					}
				}
				else {
					gain(card);
					coins -= card.getCost();
				}
			numBuys -= 1;
			}
	   }
	   final void endTurn() {
		   Card C2;
		   		   System.out.println("Player: "+player_username+ " ends his turn.");
		   while(hand.size() > 0) {
			   C2 = hand.get(0);
			   discard(C2);
		   }
		   /*for (playedCards.size() > 0) {				//playedCards is not used in my implementation
			   C2 = playedCards.get(0);
		     discard(C);
		   } */
			initializePlayerTurn();
			
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
