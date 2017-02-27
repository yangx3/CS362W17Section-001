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



	final Card drawCard() {
		if(deck.isEmpty() && discard.isEmpty()){
			System.out.println("No cards to draw");
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
			this.playedCards.clear();
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
	   public void addAction(int i) {
		   System.out.println("+ "+ i +" Actions");
			numActions = numActions + i;
	   }
	   public void addCoins(int i) {
		   System.out.println("+ "+ i +" Coins");
			coins = coins + i;
	   }
	   public void addBuy(int i) {
		   System.out.println("+ "+ i +" Buys");
		   numBuys = numBuys + 1;
	   }
		 //Discard hand
	   public void discard(Card card) {////Purposefull Bug #1 fails to fandle when there is not a card to discard.
		     hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }
	   public void playKingdomCard() {
		   
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);
		   
		         if (actionCards.size() - this.playedCards.size()  == 0)
		            return;
		         Collections.shuffle(actionCards);
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         int count = 0;
		         int count2 = 0;
		         for (Card ca : this.hand)
		        	 if (ca.equals(c))
		        		 count = count+1;
		         for (Card ca : this.playedCards)
		        	 if (ca.equals(c))
		        		 count2 = count2+1;
		         
		         if(count > count2){
		         	System.out.println("Player.actionPhase Card:" + c.toString());

			      	playedCards.add(c);
			      	numActions -= 1;

			      	c.play(this, gameState);
			      	if(playedCards.contains(c)){
			      		this.playedCards.remove(c);
			      		this.discard(c);}
			      }
		         
		      }
		   }
	   final int scoreFor() { 
		   int score = 0;
		   int count = 0;
		   
		   //score from hand
		      for (Card c : hand){
		    	  score += c.score();
		    	  if(c.getCardName() == Card.CardName.Gardens)
		    		  count += 2;
		      }
		      System.out.println("one "+count);
		      //score from discard
		      for (Card c : discard){
		    	  score += c.score();
		    	  if(c.getCardName() == Card.CardName.Gardens)
		    		  count += 2;
		      }
		      System.out.println("two "+ count);
		      //score from deck
		      for (Card c : deck){
		    	score += c.score();
		      	if(c.getCardName() == Card.CardName.Gardens)//bugs garden worth 2 per 10
		      		count += 2;
	   		}
		      System.out.println( "three "+count);
		   int numCards = hand.size()+discard.size()+deck.size();
		   score += Math.floor(numCards/10)*count;
		      
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
		   System.out.println(" --- --------------------------- --- ");
    		System.out.println("Play TtreasureCards "); 
    		System.out.println(" --- --------------------------- --- ");
    		for (Card c : Card.filter(hand, Type.TREASURE) ){
    			addCoins(c.getTreasureValue());	
    			this.discard(c);}
    			printStateGame();
   	   }
	   
	   public void buyCard() {
		   System.out.println(" --- --------------------------- --- ");
   			System.out.println("BuyCards "); 
   			System.out.println(" --- --------------------------- --- "); 
   			while(this.numBuys>0){
   		//		int witch = Randomness.nextRandomInt(30);
   		//		if (witch > 27){
   		//			System.out.println("Chose to do nothing");
   		//			break;
   			//	}else {
   					int ch = numBuys + coins;
   					Card cs = Card.getCard(this.gameState.cards, Card.CardName.Curse);
   					List<Card> posible = new ArrayList<Card>(gameState.cards);
   		            Collections.shuffle(posible);
   					for (Card c : posible){
   						System.out.println(c);
   						if ((this.gameState.gameBoard.get(c) > 0) && (this.coins >= c.getCost()) && !c.equals(cs)){
   							this.numBuys = this.numBuys - 1;
   							this.gain(c);
   							this.gameState.gameBoard.replace(c, this.gameState.gameBoard.get(c)-1);
   							this.coins = this.coins - c.getCost();
   							if(this.gameState.embargod.containsKey(c)){
   								for(int i =0; i<this.gameState.embargod.get(c) ; i++){
   									if (this.gameState.gameBoard.get(cs)>0){
   										this.gain(cs);
   										this.gameState.gameBoard.replace(cs, this.gameState.gameBoard.get(cs)-1);			
   									}else break;
   								}
   							}
   							break;
   						}
   					}
   					if (ch == numBuys + coins)
   						break;
   				}
   		//	}
	   }
	   final void endTurn() {
		   System.out.println(" --- --------------------------- --- ");
  			System.out.println("EndTurn "); 
  			System.out.println(" --- --------------------------- --- ");      
  			List<Card> tempHand = new ArrayList<Card>(hand);
  			for (Card  c : tempHand )
  				discard(c);
  			
  			for (int i = 0; i < 5; i++) {
		    	  drawCard();
		      }
  			
  			coins = 0;
  			numBuys = 1;
  			numActions = 1;
  			playedCards.clear();
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
