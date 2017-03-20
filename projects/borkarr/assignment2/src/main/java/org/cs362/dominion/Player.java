package dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import dominion.Card.CardName;
import dominion.Card.Type;


public class Player implements Cloneable{
	List < Card > hand = new ArrayList < Card > (); // int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList < Card > deck = new LinkedList < Card > (); // int
	// deck[MAX_PLAYERS][MAX_DECK];
	List < Card > discard = new ArrayList < Card > (); // int
	// discard[MAX_PLAYERS][MAX_DECK];
	List < Card > playedCards = new ArrayList < Card > ();

	String player_username;
	int numActions;
	int numBuys;
	int coins;

	final GameState gameState;


	public Player(GameState gameState, String player_username) {
		this.player_username = player_username;
		this.gameState = gameState;
	}

	final Card drawCard() {
		if (deck.isEmpty()) { // Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			//System.out.println("reshuffle the deck of the player " +
			//	player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw); // Add card to hand and hand count automatically will
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
			//System.out.println("Player: " + this.player_username + " gains " + card);
			return true;
		}
		//Discard hand
	public void discard(Card card) {
		hand.remove(card);
		discard.add(card);
		//System.out.println("Player:  " + player_username + " discards " + card);
	}
	public void playKingdomCard() {
		while (numActions > 0) {
			List < Card > actionCards = Card.filter(hand, Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card) actionCards.get(0);
			if (c == null)
				return;
			//System.out.println("Player.actionPhase Card:" + c.toString());

			playedCards.add(c);
			numActions -= 1;

			c.play(this, gameState);
		}
	}
	final int scoreFor() {
		int score = 0;
		//score from hand
		for (Card c: hand)
			score += c.score(this);
		//score from discard
		for (Card c: discard)
			score += c.score(this);
		//score from deck
		for (Card c: deck)
			score += c.score(this);
		


		return score;
	}

	public void playTtreasureCard() {
		List < Card > treasureCards = Card.filter(hand, Type.TREASURE);
		for (int i=0; i < treasureCards.size(); i++){
			coins += treasureCards.get(i).getTreasureValue();
		}
	}
	public void buyCard() {
		while (this.numBuys > 0){
			List < Card > availableCards = new ArrayList < Card > (gameState.gameBoard.keySet());
			List < Card > buyableCards = Card.availableCostFilter(availableCards, this.coins, gameState);
			//System.out.println("Buyable cards: ");
			//System.out.println("Name, cost, quantity");
			//for(int i = 0; i < buyableCards.size(); i++){
			//	System.out.println(buyableCards.get(i).toString() + " " + buyableCards.get(i).getCost() + " " + gameState.gameBoard.get(buyableCards.get(i)));
			//}
			if(buyableCards.size() > 0){
				Card bought = Randomness.randomMember(buyableCards);
				this.gain(gameState.boardTakeCard(bought));
				this.coins -= bought.getCost();
				this.numBuys -= 1;
				for(int i = 0; i < gameState.embargos.get(bought); i++){
					if(gameState.gameBoard.get(Card.getCard(gameState.cards, Card.CardName.Curse)) != 0){
						this.gain(gameState.boardTakeCard(Card.getCard(gameState.cards, Card.CardName.Curse)));
					}
				}
			}
		}
	}
	
	final void endTurn() {
		for (int i = 0; i < this.hand.size(); i++){
			this.discard(hand.get(0));
		}
		for (int i = 0; i < 5; i++){
			this.drawCard();
		}
		this.coins = 0;
		this.numBuys = 1;
		this.numActions = 1;
	}


	public void printStateGame() {
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