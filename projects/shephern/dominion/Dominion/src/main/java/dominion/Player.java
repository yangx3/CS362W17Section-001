package dominion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;

import dominion.Card.Type;


public class Player implements Cloneable {
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int deck[MAX_PLAYERS][MAX_DECK];
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
	}

	final Card drawCard() {
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			if(discard.isEmpty()){
				System.out.println(player_username + " is out of cards.");
				return null;
			}
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw.");

			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}
		Card toDraw = deck.poll();
		if(toDraw != null){
			hand.add(toDraw);// Add card to hand and hand count automatically will
			// be incremented since we use List

			System.out.println("draw " + toDraw.getCardName());
			Collections.sort(hand);
			return toDraw;
		} else
			return null;
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
		return true;
	}
	
	//Discard hand
	public void discard(Card card) {
		hand.remove(card);
		discard.add(card);
		System.out.println(player_username+" discards "+card.getCardName());
	}
	
	public void playKingdomCard(GameState state) {
		while (numActions > 0) {
			List<Card> actionCards = Card.filter(hand, Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card)actionCards.get(0);//getRet();
			if (c == null)
				return;
			System.out.println(player_username + " plays card:" + c.getCardName());

			playedCards.add(c);
			hand.remove(c);
			
			numActions -= 1;

			c.play(this, state);
		}
	}
	
	public void playTreasureCard(){
		//Adds all treasure cards to value, for max purchase
		List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
		
		if (treasureCards.size() == 0)
			return;
		
		for(Card c: treasureCards){
			if(c == null)
				return;
			coins += c.getTreasureValue();
		}
		System.out.println(this.player_username+" played treasure for "+coins+" coins.");
	}
	
	public void buyCard(GameState state, int buyChoice){
		int i = 0;
		//20 possible cards to buy
		int choice = buyChoice % 20; //0-19
		if(coins == 0){
			Card copper = null;
			while(numBuys > 0){
				//Buy Copper
				if(state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) > 0){
					copper = state.takeCard(Card.CardName.Copper);
				} else {
					//No buy
					System.out.println(player_username + " buys nothing.");
					return;
				}
				this.gain(copper);
				numBuys--;
				System.out.println(player_username + " buys Copper.");
			}
		}
		while(coins > 0 && numBuys > 0){
			if(choice < 0) return;
			Card tmp = state.cards.get(choice);
			if(tmp.getCost() <= coins && state.gameBoard.get(tmp) > 0){
				//Buy it
				this.gain(tmp);
				state.takeCard(tmp);
				int tok = state.tokensPlaced.get(tmp);
				coins = coins - tmp.getCost();
				numBuys--;
				if(tok > 0){
					if(state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) <= 0){
						System.out.println("No curses remain");
					} else {
						System.out.println("Supply was embargoed.");
						for(i = 0; i < tok; i++){
							//For each token add a curse to players discard deck
							this.gain(Card.getCard(state.cards, Card.CardName.Curse));
							state.takeCard(Card.CardName.Curse); //Remove a value from the supply
						}
					}
				}
				//Successful buy, card bought
				System.out.println(this.player_username+" bought "+tmp.getCardName());
			}
			choice--;
		}
	}
	
	public void endTurn(){
		for(Card c : hand){
			Card tmp = c;
			discard.add(tmp);
		}
		for(Card c: playedCards){
			if(c.getCardName() != Card.CardName.Embargo && c.getCardName() != Card.CardName.Feast){
				Card tmp = c;
				discard.add(tmp);
			}
		}
		System.out.println("discards hand");
		numActions = 1;
		coins = 0;
		numBuys = 1;
		hand.clear();
		playedCards.clear();
		//5 cards as your starting hand
		drawCard();
		drawCard();
		drawCard();
		drawCard();
		drawCard();
	}
	
	public int scoreFor(){
		List<Card> allCards = new ArrayList<Card>(this.deck);
		allCards.addAll(this.discard);
		allCards.addAll(this.hand);
		allCards.addAll(this.playedCards);
		
		int score = 0;
		int gardenScore = allCards.size()/10;
		for(Card c: allCards){
			score += c.getScore();
			if(c.getCardName() == Card.CardName.Gardens){
				score += gardenScore;
			}
		}
		return score;
	}

	public void printHand(){
		System.out.print("{");
		for(Card c : hand){
			System.out.print(c.getCardName()+" ");
		}
		System.out.println("}");
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

	/*private GameState gameState(List<Card> cards, List<Player> players, HashMap<card, Integer> gameboard){
		this.playedCards=cards;
		this.players = players;
		this.gameboard = gameboard
	}*/
	
	/*Function to clone individual parts*/
	protected Player clone() throws CloneNotSupportedException {
		Player clonePlayer = (Player) super.clone();
		clonePlayer.hand = new ArrayList<Card>(hand);
		clonePlayer.deck = new LinkedList<Card>(deck);
		clonePlayer.discard = new ArrayList<Card>(discard);
		clonePlayer.playedCards = new ArrayList<Card>(playedCards);
		return clonePlayer;
	}
	
	
}
