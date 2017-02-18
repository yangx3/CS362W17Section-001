package dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import dominion.Card.CardName;
import dominion.Card.Type;

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
		   
		         if (actionCards.size() == 0){
		        	 System.out.println("Player:  "+player_username+" has no action card on hand!");
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
		   int counter = 0;
		   int isGardens = 0;
		   //score from hand
		      for (Card c : hand){
		    	  score += c.score();
		      	  counter++;
		      	  if(c.getCardName()==CardName.Gardens){
		      		isGardens = 1;
		      	  }
		      }
		      //score from discard
		      for (Card c : discard){
		    	  score += c.score();
		      	  counter++;
		      	  if(c.getCardName()==CardName.Gardens){
		      		isGardens = 1;
		      	  }
		      }
		      //score from deck
		      for (Card c : deck){
		    	  score += c.score();
		      	  counter++;
		      	  if(c.getCardName()==CardName.Gardens){
		      		isGardens = 1;
		      	  }
		      }

		      if(isGardens == 1){
		    	  score = score + (counter/10);
		      }
		      
		    
		      return score;
	   }    
	   
	   public void playTtreasureCard() {
		   System.out.println();
		   System.out.println("Player: "+this.player_username+" play TtreasureCard");
		   System.out.println(" --- --------------------------- --- ");
		   List<Card> treasurecards = Card.filter(hand, Type.TREASURE);
		   for(Card c : treasurecards){
			   if(c.getCardName() == CardName.Cooper){
				   System.out.println("Player: "+this.player_username+" used cooper card");
				   coins++;
			   }else if(c.getCardName() == CardName.Silver){
				   coins = coins +2;
				   System.out.println("Player: "+this.player_username+" used silver card");
			   }else if(c.getCardName() == CardName.Gold){
				   coins = coins +3;
				   System.out.println("Player: "+this.player_username+" used gold card");
			   }
			   hand.remove(c);
			   discard.add(c);
		   }
    		System.out.println(" --- --------------------------- --- ");
	   }
	   public void buyCard(int embargoCoin) {
		   System.out.println();
		   System.out.println("Player: "+this.player_username+" buy Card");
		   System.out.println(" --- --------------------------- --- ");
		   while(numBuys > 0 && coins >0){
			   
			   Card randcard;
			   while( true ){
				   int ndx = (int) Randomness.nextRandomInt(this.gameState.cards.size());
				   randcard = this.gameState.cards.get(ndx);
				   if(this.gameState.gameBoard.get(randcard) != null){
					   if(randcard.getCardName()!=CardName.Curse){
						   if(this.gameState.gameBoard.get(randcard) > 0){
							   break;
						   }
					   }
				   }
			   }
				if(randcard.getCost() < coins){
					coins = coins - randcard.getCost();
					numBuys --;
					discard.add(randcard);
					System.out.println("Player: "+this.player_username+" bught Card: " + randcard);
					int numrandcard = this.gameState.gameBoard.get(randcard);
					numrandcard = numrandcard - 1;
					//System.out.println(numrandcard);
					this.gameState.gameBoard.put(randcard,numrandcard);
					if(embargoCoin > 0){
						//embargoCoin = 0;
						System.out.println("There was " + embargoCoin + " of embargo coins!");
						System.out.println("Player: "+this.player_username+" gain " + embargoCoin + " of curse cards!");
						if(this.gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Curse))!=null && this.gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Curse))>0){
							
							for(int i = 0; i < embargoCoin;i++){
								discard.add(Card.getCard(gameState.cards,Card.CardName.Curse));
							}
							int numrandcard2 = this.gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Curse));
							numrandcard2 = numrandcard2 - embargoCoin;
							this.gameState.gameBoard.put(Card.getCard(gameState.cards,Card.CardName.Curse),numrandcard2);
							//embargoCoin = 0;
						}else{
							System.out.println("There was no Curse card in Game Board");
						}
						embargoCoin = 0;
						gameState.embargoCoin = 0;
					}
				}
		   } 
   			System.out.println(" --- --------------------------- --- ");   
	   }
	   final void endTurn() {
		   System.out.println();
		   System.out.println("Player: "+this.player_username+" end turn");
		   System.out.println(" --- --------------------------- --- ");
		   for(Card c : hand){
			   discard.add(c);
		   }
		   hand.clear();
		   playedCards.clear();
		   initializePlayerTurn();
		   System.out.println(" --- --------------------------- --- ");;      
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
