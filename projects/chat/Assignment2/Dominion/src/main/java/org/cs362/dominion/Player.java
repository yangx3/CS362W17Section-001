package org.cs362.dominion;

import java.util.*;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int deck[MAX_PLAYERS][MAX_DECK];											// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();
	
	String player_username;

	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;
	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
		deck = new LinkedList<Card>();
		hand = new ArrayList<Card>();
		playedCards = new ArrayList<Card>();
		discard = new ArrayList<Card>();		
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
		System.out.println("draw: " + toDraw);
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
		   System.out.println("-------- Playing Kingdom Card ---------");
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);
		   
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         
		         if (c == null)
			           return;
		         
		         System.out.println(player_username + " played ability: " + c.toString());
			      playedCards.add(c);
			      hand.remove(c);
			      numActions--;
			      
			      //play the kingdom card
			      c.play(this, gameState);
			      
			      System.out.println("^^^^^^^ Playing Kingdom Card ^^^^^^^^");
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
	   
	   public void playTreasureCard() {
		   	/*
		   	 * Filters through the players hand for treasure cards, then for each treasure card
		   	 * it finds it will play it and add it to the players coin 'purse', removing it from
		   	 * their hand.
		   	 */
		   
		   System.out.println("------ Playing Treasure Card ------");
    		List<Card> treasureCards = Card.filter(hand, Card.Type.TREASURE);
    		if(treasureCards.size() == 0) {
    			return;
    		}
    		for(Card c : treasureCards) {
    			coins += c.getTreasureValue();
    			System.out.println(player_username + " played: " + c.toString());
    			playedCards.add(c);
    			hand.remove(c);
    		}
    		System.out.println(player_username + "'s Coins: " + coins + "\n");
    		System.out.println("^^^^^^^ Playing Treasure Card ^^^^^^^^");
	   }
	   public void buyCard() {
		   /*
		    * As long as the player has the ability to buy they can buy cards until they have no more
		    * buy's left, however if they have buy's left but no coins they can still buy copper
		    * treasure cards until they run out of buy's.
		    */
		   int rand = Randomness.nextRandomInt(10);
		   while(numBuys > 0){
			   if(coins >= 8){
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Province)) != 0){
					   gain(Card.getCard(gameState.cards,CardName.Province));
					   coins -= 8;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Province), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Province))-1);
				   }
			   } 
			   else if (coins >= 6){
				   rand = Randomness.nextRandomInt(1);
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Gold)) != 0 && rand == 0){
					   gain(Card.getCard(gameState.cards,CardName.Gold));
					   coins -= 6;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Gold), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Gold))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Adventurer))!= null && gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Adventurer))!= 0 && rand == 1){
					   gain(Card.getCard(gameState.cards,CardName.Adventurer));
					   coins -= 6;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Adventurer), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Adventurer))-1);
				   }
			   } else if (coins >= 5){
				   rand = Randomness.nextRandomInt(2);
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Duchy)) != 0 && rand == 0){
					   gain(Card.getCard(gameState.cards,CardName.Duchy));
					   coins -= 5;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Duchy), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Duchy))-1);
				   } 
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Council_Room))!= null && gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Council_Room))!= 0 && rand == 1){
					   gain(Card.getCard(gameState.cards,CardName.Council_Room));
					   coins -= 5;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Council_Room), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Council_Room))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Mine)) != null && rand == 2 && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Mine)) != null){
					   gain(Card.getCard(gameState.cards,CardName.Mine));
					   coins -= 5;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Mine), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Mine))-1);
				   } 
				   
			   } else if (coins >= 4) {
				   rand = Randomness.nextRandomInt(5);
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Baron)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Baron)) != 0 && rand == 0){
					   gain(Card.getCard(gameState.cards,CardName.Baron));
					   coins -= 4;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Baron), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Baron))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Cutpurse)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Cutpurse)) != 0 && rand == 1){
					   gain(Card.getCard(gameState.cards,CardName.Cutpurse));
					   coins -= 4;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Cutpurse), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Cutpurse))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Feast)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Feast)) != 0 && rand == 2){
					   gain(Card.getCard(gameState.cards,CardName.Feast));
					   coins -= 4;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Feast), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Feast))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Gardens)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Gardens)) != 0 && rand == 3){
					   gain(Card.getCard(gameState.cards,CardName.Gardens));
					   coins -= 4;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Gardens), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Gardens))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Remodel)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Remodel)) != 0 && rand == 4){
					   gain(Card.getCard(gameState.cards,CardName.Remodel));
					   coins -= 4;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Remodel), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Remodel))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Smithy)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Smithy)) != 0 && rand == 5){
					   gain(Card.getCard(gameState.cards,CardName.Smithy));
					   coins -= 4;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Smithy), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Smithy))-1);
				   }
			   }
			   else if (coins >= 3){
				   rand = Randomness.nextRandomInt(4);
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Silver)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Silver)) != 0 && rand == 0){
					   gain(Card.getCard(gameState.cards,CardName.Silver));
					   coins -= 3;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Silver), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Silver))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Village)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Village)) != 0 && rand == 1){
					   gain(Card.getCard(gameState.cards,CardName.Village));
					   coins -= 3;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Village), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Village))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Ambassador)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Ambassador)) != 0 && rand == 2){
					   gain(Card.getCard(gameState.cards,CardName.Ambassador));
					   coins -= 3;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Ambassador), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Ambassador))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Great_Hall)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Great_Hall)) != 0 && rand == 3){
					   gain(Card.getCard(gameState.cards,CardName.Great_Hall));
					   coins -= 3;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Great_Hall), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Great_Hall))-1);
				   }
			   }
			   else if (coins >= 2){
				   rand = Randomness.nextRandomInt(2);
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Embargo)) != null && gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Embargo)) != 0 && rand == 0){
					   gain(Card.getCard(gameState.cards,CardName.Embargo));
					   coins -= 2;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Embargo), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Embargo))-1);
				   }
				   else if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Estate)) != 0 && rand == 1){
					   gain(Card.getCard(gameState.cards,CardName.Estate));
					   coins -= 2;
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Estate), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Estate))-1);
				   }
			   } 
			   else {
				   if(gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Copper)) != 0){
					   gain(Card.getCard(gameState.cards,CardName.Copper));
					   numBuys--;
					   gameState.gameBoard.put(Card.getCard(gameState.cards, Card.CardName.Copper), gameState.gameBoard.get(Card.getCard(gameState.cards,Card.CardName.Copper))-1); 
				   }
			   }
		   }
		   
	   }
	   
	   final void endTurn() {
		   /*
		    * Discard everything in the player's hand and cards they have already played.
		    * Then reset their state so that they have no coins available, with one buy and one action
		    * ready for the next turn.
		    */
  			for(Card c : hand) {
  				discard.add(c);
  			}
  			for(Card c : playedCards) {
  				discard.add(c);
  			}
  			playedCards.clear();
  			hand.clear();
  			
  			coins = 0;
  			numActions = 1;
  			numBuys = 1;
  			
  			//initializePlayerTurn() will allow to player to draw five cards, so hopefully this doesn't break the game...
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
