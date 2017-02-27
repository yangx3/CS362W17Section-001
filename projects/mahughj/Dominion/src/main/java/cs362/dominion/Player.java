package cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

	final void plusAction() {
		numActions += 1;
	}
	
	final void plusBuy() {
		numBuys += 1;
	}
	
	final void plusCoins(int i) {
		coins += i;
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
	
/*	   final void initializePlayerTurn() {
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
		   }*/
	   final void startTurn() { //Cards should be drawn at end of turn, so provided function doesn't work, so made my own
		   numActions = 1;
		   coins = 0;
		   numBuys = 1;
	   }
	 //card goes in discard,
	   final boolean gain(Card card) {
		   	  //Can technically gain from an empty pile. However, this has been accounted for everywhere
		      //gaining happens
		   	  if (gameState.gameBoard.get(card) <= 0) {
		   		  System.out.println("EUREKA!<--------------------"); //Shouldn't trigger, purely for debugging
		   	  }
		      discard.add(card);
		      System.out.println("Player: "+this.player_username+" gains "+card);
		      //Must decrement the amount in the gameboard
		      gameState.decrementCard(card);
		      return true;
		   }		   
		 //Discard hand
	   public void retCard(Card card) {
		   hand.remove(card);
		   gameState.incrementCard(card);
	   }
	   
	   public void discard(Card card) {
		      hand.remove(card);
		      discard.add(card);
		      System.out.println("Player:  "+player_username+" discards "+card);
		   }
	   public boolean trash(Card card){
		   	  hand.remove(card);
		   	  System.out.println("Player: "+player_username+" trashes "+card);
		   	  return true;
	   }
	   
	   public boolean contains(String cardName){
		   Card o;
		   int i = hand.size();
		   for (int j = 0; j < i; j++){
			   o = hand.get(j);
			   if (o.getCardName().toString() == cardName) {
				   return true;
			   }
		   }
		   return false;
	   }
	   public Card getContainedCard(String cardName){
		   //for each card in hand
		   //if card's name == cardName, return card
		   //Only called after it is known to be contained
		   int s = hand.size();
		   Card o;
		   for (int i = 0; i < s; i++){
			   o = hand.get(i);
			   if (o.getCardName().toString() == cardName) {
				   return o;
			   }
		   }
		   return null;
	   }
	   public void gainToHand(Card card) {
		   hand.add(card);
		   gameState.decrementCard(card);
		   return;
	   }
	   public Card trashRandomCard() {
		   Card o = hand.get(0);
		   trash(o);
		   return o;
		   
	   }
	   public void revealAll() {
		   System.out.println(player_username+"'s hand: ");
		   int i = hand.size();
		   for (int j = 0; j < i; j++) {
			   System.out.println(hand.get(j));
		   }
	   }
	   
	   public void playKingdomCard() {
		    String[] accept = {"Action", "Action-Victory", "Action-Attack"};
		   	while (numActions > 0) {
		    	 System.out.println("Num Actions: " + numActions);
		         List<Card> actionCards = Card.filter(hand, accept);
		   
		         if (actionCards.size() == 0){
			    	 System.out.println("No more poss plays");
		            return;
		         }
		         
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
		   int gardCnt = 0;
		   int deckCnt = 0;
		   //score from hand
		      for (Card c : hand) {
		    	  deckCnt++;
		    	  score += c.score();
		      	  if (c.getCardName().toString() == "Gardens") {
		      		  gardCnt++;		      		  
		      	  }
		      }
		      //score from discard
		      for (Card c : discard){
		    	  deckCnt++;
		    	  score += c.score();
		      	  if (c.getCardName().toString() == "Gardens") {
		      		  gardCnt++;		      		  
		      	  }
		      }
		      //score from deck
		      for (Card c : deck){
		    	  deckCnt++;
		    	  score += c.score();
		      	  if (c.getCardName().toString() == "Gardens") {
		      		  gardCnt++;		      		  
		      	  }
		      }
		      
		      int gardPnt = Math.floorDiv(deckCnt, 10);
		      score += gardCnt*gardPnt;
		      System.out.println("Deck Count, Gardens Count, then Gardens Value for " + this.player_username);
		      System.out.print(deckCnt);
		      System.out.println();
		      System.out.print(gardCnt);
		      System.out.println();
		      System.out.print(gardPnt);
		      System.out.println();
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
    		for (Card c : hand){
    			coins += c.getTreasureValue();
    		}
	   }
	   public void buyCard() {   
   			do {
   				if (coins >= 8 && (gameState.gameBoard.get(Card.getCard(gameState.cards, "Province")) > 0)) {
   				  Card card = Card.getCard(gameState.cards, Card.CardName.Province);
   			      discard.add(card);
   			      System.out.println("Player: "+this.player_username+" bought "+card);
   			      gameState.decrementCard(card);
   			      numBuys -= 1;
   			      coins -= 8;
   			      if (gameState.isPileEmp("Curse")){
   			       Card curse = Card.getCard(gameState.cards, Card.CardName.Curse);
    			      for (int i = 0; i < gameState.embargoCheck(card); i++) {
    			    	  System.out.println("________---------__________");
    			    	  discard.add(curse);
    			    	  gameState.decrementCard(curse); 
    			      }  
   			      }
   			 
   				} else {
   					System.out.print(coins);
   					System.out.print(numBuys);
   					System.out.println("Hoping for no loop!");
     				Card card = gameState.randomCard(coins);
     				System.out.println(card.toString() + " was chosen");
     				discard.add(card);
     			    System.out.println("Player: "+this.player_username+" bought "+card);
       			    gameState.decrementCard(card);
       			    numBuys -= 1;
       			    coins -= card.getCost();
       			    System.out.println("Embargo Check");
       			    if (gameState.isPileEmp("Curse")){
       			     System.out.println("There are curses");
       			     Card curse = Card.getCard(gameState.cards, Card.CardName.Curse);
       			     int numTok = gameState.embargoCheck(card);
       			     System.out.println("Giving " + numTok + " curses");
       			     for (int i = 0; i < numTok; i++){
       			    	 	  System.out.println("________---------__________");
        			    	  discard.add(curse);
        			    	  gameState.decrementCard(curse);
        			    }	
       			    }
     			   
     			}
   			} while(numBuys > 0 && coins > 1);
   			//I chose to not buy anything if you have no coins (or 1, which is essentially the same thing). While technically legal, and a strategy in a gain
   			//based deck potentially (especially in conjunction with Gardens) in the vast majority of scenarios you don't want to be diluting your deck with copper. 
	   }
	   
	   //TODO endTurn
	   final void endTurn() {  
  			
  			if (gameState.isGameOver() == true) {
  				//end game
  				List<Player> winner = new ArrayList<Player>();
  				int winval = -100; //literally impossible to do worse than this
  				HashMap<Player, Integer> win = gameState.getWinners();
  				List<Player> l = gameState.getOtherPlayers(this);
  				l.add(this);
  				for (Player p : l) {
  					if (win.get(p) > winval) {
  						winval = win.get(p);
  						winner.clear();
  						winner.add(p);
  					} else if (win.get(p) == winval) {
  						winner.add(p);
  					}
  				}
  				if (winner.size() == 1) {
  					System.out.println("The winner is: " + winner.get(0).player_username + "with " + win.get(winner.get(0)) + " victory points.");
  					List<Player> nonWin = gameState.getOtherPlayers(winner.get(0));
  					for (Player j : nonWin) {
  						System.out.println(j.player_username + " got " + win.get(j) + " victory points.");
  					}
  				} else if (winner.size() > 1) {
  					System.out.println("There is a tie!");
  					for (Player j: winner) {
  	  					System.out.println(j.player_username + " with " + win.get(j) + " victory points,");
  					}
  					System.out.println("All tied for first!");
  					System.out.println("Score summary: ");
  					for (Player j : l) {
  						System.out.println(j.player_username + " got " + win.get(j) + " victory points.");
  					}
  				}
  			} else {
  				//Make other player's turn
  				//Discard hand, draw 5
  				Card e = null;
  				for (Iterator<Card> it = hand.iterator(); it.hasNext();){
  					e = it.next();
  					discard.add(e);
  					it.remove();
  				}
  				for (int i = 0; i < 5; i++) {
  					this.drawCard();
  				}
  				//other players will go automatically thru the play function in GameState
  			}
	   }
	   
	   
	   /*public void printStateGame(){
		   System.out.println(" --- " + this.player_username + " --- ");
		   System.out.println(" --- --------------------------- --- ");
     		System.out.println(this.gameState.toString()); 
     		System.out.println(" --- --------------------------- --- ");
	   }*/
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
       	 sb.append("coins: " + this.coins);
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
