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
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				//int ndx = (int) Randomness.nextRandomInt(discard.size());
				int ndx = (int)(Math.random() * discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		if(toDraw != null){
			hand.add(toDraw);// Add card to hand and hand count automatically will
		}					// be incremented since we use List
		System.out.println("draw " + toDraw);
		if(hand.size() > 0){	
			Collections.sort(hand);
		}
		return toDraw;
	}
	
	final void initializePlayerTurn() {
		// initialize first player's turn
		// state->numnumActions = 1;
		// state->numnumBuys = 1;
		numActions = 1;
		coins = 0;
		numBuys = 1;
		//Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
		//5 cards as your starting hand
		for(int i = 0; i < 5; i++) {
			drawCard();
		}
	}

	//card goes in discard,
	final boolean gain(Card card){
		if(card != null){
		   	discard.add(card);
	    	System.out.println("Player: "+this.player_username+" gains "+card);
	    }
	    return true;
	}		   
		
	//Discard hand
	public void discard(Card card){
	    hand.remove(card);
	    discard.add(card);
		System.out.println("Player:  "+player_username+" discards "+card);
	}

	public void playKingdomCard(){
	    while(numActions > 0){
	        List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);
		   
		    if (actionCards.size() == 0)
		        return;
		         
		    Card c = (Card)actionCards.get(0);
		    if (c == null)
			    return;
		    System.out.println("Player.actionPhase Card:" + c.toString());

			playedCards.add(c);
			numActions -= 1;

			c.play(this, gameState);
			hand.remove(c);
		}
	}
	final int scoreFor(){ 
		int score = 0;
		//score from hand
		for(Card c : hand)
			score += c.score();
		//score from discard
		for(Card c : discard)
			score += c.score();
		//score from deck
		for(Card c : deck)
			score += c.score();   
		return score;
	}    
	   
	public void playTreasureCard(){
		List<Card> treasure = Card.filter(hand, Card.Type.TREASURE);

		for(Card card : treasure){
			coins += card.getTreasureValue();
			playedCards.add(card);
			hand.remove(card);
		}
	}
	
	public void buyCard(){
		List<Card> validCards = new ArrayList<Card>();

		while(numBuys > 0 && coins > 0){
			if(coins >= 8){
				Card buy = Card.getCard(gameState.cards, Card.CardName.Province);
				gain(buy);
				gameState.gameBoard.put(buy, gameState.gameBoard.get(buy) - 1);
				coins -= buy.getCost();
			}
			else{
				validCards.clear();

				for(int i = 0; i < gameState.cards.size(); i++){
					Card cur = gameState.cards.get(i);
					if(cur.getCost() <= coins){
						if(gameState.gameBoard.containsKey(cur) && gameState.gameBoard.get(cur) > 0){
							validCards.add(cur);
						}
					}
				}

				if(validCards.size() == 0){
					break;
				}

				//Card buy = validCards.get(Randomness.nextRandomInt(validCards.size()));
				Card buy = validCards.get((int)(Math.random() * validCards.size()));
				gain(buy);
				gameState.gameBoard.put(buy, gameState.gameBoard.get(buy) - 1);
				coins -= buy.getCost();
			}
		}
	}
	
	final void endTurn(){
		for(Card card : hand){
			discard.add(card);
		}
		for(Card card : playedCards){
			discard.add(card);
		}
		hand.clear();
		playedCards.clear();
		initializePlayerTurn();
	}
	   
	   
	public void printStateGame(){
		System.out.println(" --- " + this.player_username + " --- ");
		System.out.println(" --- --------------------------- --- ");
     	System.out.println(this.gameState.toString()); 
     	System.out.println(" --- --------------------------- --- ");
	}

	@Override
	public String toString(){
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
