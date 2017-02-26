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

	final GameState state;
	
	public Player(GameState input, String player_username) {
		this.player_username = player_username;
		this.state = input;
	}

	final Card drawCard() {
		if (deck.isEmpty()) { // Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			//System.out.println("reshuffle the deck of the player " + player_username + " to draw cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw); // Add card to hand and hand count automatically will
		// be incremented since we use List
		//System.out.println(this.player_username + ".draws " + toDraw.toString());
		//Collections.sort(hand);
		return toDraw;
	}
	
	final void initializePlayerTurn() {
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
			//System.out.println(this.player_username + ".gains: " + card.toString());
			return true;
		}
		//Discard hand
	public void discard(Card card) {
		hand.remove(card);
		discard.add(card);
		//System.out.println(player_username + ".discards: " + card.toString()+ "\n" + this.toString());
		
	}

	public void trash(Card card) {
		hand.remove(card);
		//System.out.println(this.player_username + ".trashes; " + card.toString());
	}

	public void playKingdomCard() {
		System.out.println(this.player_username + " Playing Actions.");
		while (numActions > 0) {
			System.out.println(this.player_username + ".numAction:" + this.numActions);
			List < Card > actionCards = Card.filter(hand, Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card) actionCards.get(0); //IMPLEMENT PICKING
			if (c == null)
				return;
			System.out.println(this.player_username + ".action:" + c.toString());

			playedCards.add(c);
			numActions -= 1;

			c.play(this, this.state);
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

	public void playTreasureCard() {
		System.out.println(this.player_username + " Playing Treasures.");
		List < Card > treasureCards = Card.filter(hand, Type.TREASURE);
		for (int i = 0; i < treasureCards.size(); i++) {
			this.coins += treasureCards.get(i).getTreasureValue();
			this.discard(treasureCards.get(i));
		}
		System.out.println(this.player_username + ".coins: " + this.coins);
		return;
	}
	public void buyCard() {
		System.out.println(this.player_username + " Buying cards.");
		while (this.numBuys > 0) {
			System.out.println(this.player_username + ".numBuys: " + this.numBuys);
			List < Card > affordableCards = Card.priceCheck(state.pileRetrieve(), this.coins);
			if(affordableCards.size() == 0){
				return;
			}
			//System.out.println("Available to purchase: ");
			//System.out.println("Card Name | Cost | Quantity");
			//for (int i = 0; i < affordableCards.size(); i++) {
			//	System.out.println(affordableCards.get(i).toString() + " | " + affordableCards.get(i).getCost() + " | " + state.gameBoard.get(affordableCards.get(i)));
			//}
			Card buying = Randomness.randomMember(affordableCards);
			//System.out.println(buying.toString() + state.embargoTokens.get(buying));
			List < Card > embargoPiles = new ArrayList < Card > (state.embargoTokens.keySet());
			for(int i = 0; i < state.embargoTokens.get(Card.getCard(embargoPiles, buying.getCardName())) ; i++){
				//System.out.println(state.embargoTokens.get(Card.getCard(embargoPiles, buying.getCardName())));
				//state.pollPile(this,Card.getCard(state.cards, CardName.Curse)); //BUG HERE
			}
			state.pollPile(this,buying);
			this.coins -= buying.getCost();
			this.numBuys --;
		}
		return;
	}
	final void endTurn() {
		int handSize = this.hand.size();
		for (int i = 0; i < handSize; i++) {
			this.discard(this.hand.get(0));
		}
		this.initializePlayerTurn();
	}


	public void printStateGame() {
		System.out.println(" --- " + this.player_username + " --- ");
		System.out.println(" --- --------------------------- --- ");
		System.out.println(this.state.toString());
		System.out.println(" --- --------------------------- --- ");
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" --- " + this.player_username + " --- ");
		//sb.append("\n --- --------------------------- --- ");

		sb.append("\nHand: " + this.hand);
		sb.append("\nDiscard: " + this.discard);
		sb.append("\nDeck: " + this.deck);
		sb.append("\nPlayed Cards: " + this.playedCards);
		sb.append("\nnumActions: " + this.numActions);
		sb.append("\ncoins: " + this.coins);
		sb.append("\nnumBuys: " + this.numBuys);
		sb.append("\n");

		return sb.toString();

	}
	
	protected Player clone(GameState input) throws CloneNotSupportedException {
		Player clonePlayer=new Player(input, ("cloned" + this.player_username));
		clonePlayer.hand = new ArrayList<Card>(hand);// int hand[MAX_PLAYERS][MAX_HAND];
		clonePlayer.deck = new LinkedList<Card>(deck);// int
														// deck[MAX_PLAYERS][MAX_DECK];
		clonePlayer.discard = new ArrayList<Card>(discard); // int
													// discard[MAX_PLAYERS][MAX_DECK];
		clonePlayer.playedCards = new ArrayList<Card>(playedCards);
		clonePlayer.coins = this.coins;
		clonePlayer.numActions = this.numActions;
		clonePlayer.numBuys = this.numBuys;
		return clonePlayer;
	}
}


/*
				Boolean validPurchase = false;
				while(!validPurchase){
					Scanner reader = new Scanner(System.in);  // Reading from System.in
					System.out.println("Enter a Card Name (or enter \"Skip\" to pass): ");
					String purchase = reader.next(); // Scans the next token of the input
					if (purchase == "Skip"){
						return;
					}
					for(int i = 0; i < availableCards.size(); i++){
						if(purchase == availableCards.get(i).toString()){
							if(availableCards.get(i).getCost() <= this.coins){
								Integer quantity = state.gameBoard.get(availableCards.get(i));
								if(quantity == 1){
									state.gameBoard.remove(availableCards.get(i));
								}
								else{
									state.gameBoard.put(availableCards.get(i),(quantity-1));
								}
								validPurchase = true;
								this.gain(availableCards.get(i));
								this.numBuys -= 1;
								this.coins -= availableCards.get(i).getCost();
								break;
							}
							else{
								System.out.println("Insuffecient funds. Available: " + this.coins + " Required: " + availableCards.get(i).getCost());
							}
						}
					}
					if(!validPurchase){
						System.out.println("Did not recognize the card name, try again.");
					}
				}
*/