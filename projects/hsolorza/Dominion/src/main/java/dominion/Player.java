package dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();
	LinkedList<Card> deck = new LinkedList<Card>();
	List<Card> discard = new ArrayList<Card>();
	List<Card> playedCards = new ArrayList<Card>();

	String player_username;
	private Random gen = new Random();

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
			System.out.println("\nReshuffle the deck of the player "
			+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = gen.nextInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}
		Card toDraw = deck.poll();//card at top of deck
		// Add card to hand and hand count automatically will be incremented since we use List
		hand.add(toDraw);
		System.out.println(player_username + " draws" + toDraw);
		Collections.sort(hand);
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
			List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);

			if (actionCards.size() == 0)
			return;

			Card c = (Card)actionCards.get(0);
			if (c == null)
			return;
			//   System.out.println("Player.actionPhase Card:" + c.toString());

			playedCards.add(c);
			numActions -= 1;
			hand.remove(c);
			c.play(this, gameState);
		}
	}
	final int scoreFor() {
			   int score = 0;

			   //score from hand
			   for (Card c : hand) {
				   score += c.score();
			   }
			   //score from discard
			   for (Card c : discard)
				   score += c.score();
			   //check for gardens
			   if (discard.contains(Card.getCard(discard, Card.CardName.Gardens))) {
					 score = deck.size() * 10 / 10;
			   }
				 //score from deck
				 for (Card c : deck){
					 score += c.score();
					 //check for gardens
					 if (deck.contains(Card.getCard(deck, Card.CardName.Gardens))) {
						 score = deck.size() * 10 / 10;
					 }
				 }
			return score;
	}

	public void playTtreasureCard() {
		List<Card> treasureCards = Card.filter(hand, Card.Type.TREASURE);
		if(treasureCards.size() != 0){
			for(Card c : treasureCards){
				coins += c.getTreasureValue();
				playedCards.add(c);
				hand.remove(c);
			}
		}
	}

	public void buyCard() {
		System.out.println(" --- --------------------------- --- ");
		int randType = gen.nextInt(3);
		int randCard = gen.nextInt(3);

		if(coins>0 && coins<8 &&numBuys>=1){
			if(randType == 1){
				if (randCard == 1){
					gain(Card.getCard(gameState.cards, Card.CardName.Gold));
					System.out.println("Just bought Gold Card");}
					else if (randCard == 2){
						gain(Card.getCard(gameState.cards, Card.CardName.Silver));
						System.out.println("Just bought Silver Card");}
						else{
							gain(Card.getCard(gameState.cards, Card.CardName.Copper));
							System.out.println("Just bought Copper Card");}
						}
		 else if(randType == 2){
			if (randCard == 1){
				gain(Card.getCard(gameState.cards, Card.CardName.Estate));
				System.out.println("Just bought Estate Card");}
			else if (randCard == 2){
			  gain(Card.getCard(gameState.cards, Card.CardName.Smithy));
				System.out.println("Just bought Province Card");}
			else{
			  gain(Card.getCard(gameState.cards, Card.CardName.Duchy));
			  System.out.println("Just bought Duchy Card");}
		 }
		}
		else if(coins>8 && numBuys>=1){
			gain(Card.getCard(gameState.cards, Card.CardName.Province));
			System.out.println("Just bought Province Card");}

			System.out.println(" --- --------------------------- --- ");
		}

		final void endTurn() {
			// Put hand and played cards in discard, then

			for(Card c : hand){
				discard.add(c);
			}

			for(Card a : playedCards){
				discard.add(a);
			}

			// reset the players actions, buys, and coins
			numBuys = 1;
			numActions = 1;
			coins = 0;
			hand.clear();
			playedCards.clear();
		}



		void printStateGame() {
			System.out.println(" --- " + this.player_username + " --- ");
			System.out.println(" --- --------------------------- --- ");
			System.out.println(this.gameState.toString());
			System.out.println(" --- --------------------------- --- ");
		}

		@Override
		public String toString() {
			String sb = ("\n------- " + this.player_username + " -------") +
			"\nnumActions: " + this.numActions +
			", coins: " + this.coins +
			", numBuys: " + this.numBuys +
			"\nHand: " + this.hand +
			"\nDiscard: " + this.discard +
			"\nDeck: " + this.deck +
			"\nPlayed Cards: " + this.playedCards +
			"\n";

			return sb;
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
