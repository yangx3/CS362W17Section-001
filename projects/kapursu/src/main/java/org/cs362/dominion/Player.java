package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
	   
	   //public void playTtreasureCard() {
		  // System.out.println(" --- --------------------------- --- ");
    		//System.out.println("Playing Treasure Card ");
		 
    		//System.out.println(" --- --------------------------- --- ");
	  
		
	//	System.out.println("Player.playTreasureCard Card: " + c.toString()); 
		
	  // }

	   public void buyCard() {
		 //  while(numBuys > 0){
			List<Card> buycards = Card.filter(deck, Type.VICTORY); 
		  
			if (buycards.size() == 0)
				return; 
			int can_afford = 0; 
			int i =0; 
			while(i ==0 ){	
				Card c = (Card)buycards.get(i); 
					if(c == null)
						return;
				if (c.cost<= 10){
					System.out.println("Player.buyphase buying card: " + c.toString());
					can_afford = 1; 
					this.hand.add(c); 
					coins = coins - c.cost;
				} 
				i++; 
			}
	//	}
			//	return; 
			
		// System.out.println(" --- --------------------------- --- ");
   		//	System.out.println("Buying Card "); 
   		//	System.out.println(" --- --------------------------- --- "); 

			  
	   }
	   final void endTurn() {
		   //System.out.println(" --- --------------------------- --- ");
  			System.out.println("Turn Ending "); 
  		//	System.out.println(" --- --------------------------- --- ");      
	
		
		  
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
	    	clonePlayer.hand = new ArrayList<Card>(hand);
			clonePlayer.deck = new LinkedList<Card>(deck);// int
															
			clonePlayer.discard = new ArrayList<Card>(discard);
														
			clonePlayer.playedCards = new ArrayList<Card>(playedCards);
			return clonePlayer;
	    } 	   


	   
}
