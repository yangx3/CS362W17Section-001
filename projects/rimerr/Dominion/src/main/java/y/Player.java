package dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;



import dominion.Card.Type;


public class Player {
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
													// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int
												// discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();

	String player_username;
	
	int score = 0;
	int numActions;
	int numBuys;
	int coins;

	   final GameState gameState;

	public String getName(){
		return this.player_username;
	}
	   
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
		System.out.println("DRAW: " + toDraw);
		Collections.sort(hand);
		return toDraw;
	}
	
	   final void initializePlayerTurn() { //initialize player's turn
		      numActions = 1;
		      coins = 0;
		      numBuys = 1;
		      for (int i = 0; i < 5; i++) { //5 cards as your starting hand
		    	  drawCard();
		      }
		   }

	   final boolean gain(Card card) {
		      discard.add(card); 	 //card goes in discard,
		      return true;
		   }		   

	   public void discard(Card card) {
		     hand.remove(card);
		     discard.add(card);
		     //System.out.println("Player:  "+player_username+" discards "+card);
	   }
	   
	   public Card getRandHandCard(){
		   int random = (int)  Randomness.random.nextInt(hand.size());//
		   Card c = hand.get(random);
		   return c;
	   }

	   final int scoreFor() { 
		   	int sumCards, numGardens=0;
		   		//score from hanf
		      for (Card c : hand){
		    	  score += c.score(this);
		    	  if (c.getCardName()==Card.CardName.Gardens){
		    		  numGardens+=1;
		    	  }
		      }
		      //score from discard
		      for (Card c : discard){
		    	  score += c.score(this);
		    	  if (c.getCardName()==Card.CardName.Gardens){
		    		  numGardens+=1;
		    	  }
		      }
		      //score from deck
		      for (Card c : deck){
		    	  score += c.score(this); 
		    	  if (c.getCardName()==Card.CardName.Gardens){
		    		  numGardens+=1;
		    	  }
		      }
		      sumCards = hand.size() + deck.size() + discard.size();
		      if(numGardens!=0){
		    	  score += sumCards/(10*numGardens);
		      }
		      return score;
	   }    
	   
	   public void playTreasureCard() {
  			//System.out.println("Untested play treasure **************************"); 
	         List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
			 int i = 0;  
	         if (treasureCards.size() == 0)
	            return;
	         while (treasureCards.size() > i){
		         Card c = (Card)treasureCards.get(i);
		         i++;
		         if (c == null){
		        	 System.out.println("there was a null card as a treasure");
			         return;
		         }
		         System.out.println("SPEND: " + c.toString());
			     playedCards.add(c);
			     this.coins += c.getTreasureValue();
			     this.discard(c);
	         }

	   }

	   public int buyCard(Card cardB) {   	
		   if(this.numBuys>0){
	   			if (cardB.getCost() <= this.coins){
	   				this.gain(cardB);
	   				this.coins = this.coins - cardB.getCost();
	   				System.out.println("BUY: "+ cardB);
	   				this.numBuys-=1;
	   				return 1;// bought card   			
	   			}
		   }
   			return 0; // couldn't buy
	   }
	   final void endTurn() { // Should change this to be discarding and drawing the new 5***********************************
		   System.out.println("endturn");
  			while(hand.size() > 0){
  				this.discard(hand.get(0));
  			}
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
	       	 sb.append("coins: " + this.coins);
	       	 sb.append("numBuys: " + this.numBuys);
	       	 sb.append("\n");     
	
			 return sb.toString();
		}
	   
}