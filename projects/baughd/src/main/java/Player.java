import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();
	Random gen = new Random();

	String player_username;
	int numActions;
	int numBuys;
	int coins;
	final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState = gameState;
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
		System.out.println(this.player_username + " gains " + card);
		return true;
	}

	//Discard hand
	public void discard(Card card) {
		hand.remove(card);
		discard.add(card);
		System.out.println(player_username + " discards " + card);
	}

	public void playKingdomCard() {
		while (numActions > 0) {
			List<Card> actionCards = Card.filter(hand, Card.Type.ACTION);

			if (actionCards.size() == 0)
				return;

			Card c = (Card) actionCards.get(0);
			if (c == null)
				return;
			System.out.println("Player.actionPhase Card:" + c.toString());

			playedCards.add(c);
			hand.remove(c);

			numActions -= 1;

			c.play(this, gameState);//plays the kingdom card
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
		List<Card> treasureCards = Card.filter(hand, Card.Type.TREASURE);

		if(treasureCards.size() == 0) return;

		System.out.println("Treasure Cards Played:");
		for(Card c: treasureCards)
		{
			coins += c.getTreasureValue();
			System.out.println(c.toString());
			playedCards.add(c);
			hand.remove(c);
		}
		System.out.println(player_username + "'s COINS: " + coins + "\n");
	}

	public void buyCard(GameState state) {
		while(numBuys > 0 && coins > 0) {
			if (coins == 0){
				gain(Card.getCard(state.cards, Card.CardName.Copper));
				state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) - 1 );
			}
			else if (coins == 1) {
				gain(Card.getCard(state.cards, Card.CardName.Copper));
				state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Copper)) - 1 );
			}
			else if (coins == 2) {
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Embargo)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Embargo));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Embargo), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Embargo)) - 1);
					coins = coins - 2;
				}
			}
			else if (coins == 3) {//randomly choose 3 cost cards?
				int rand = gen.nextInt(3);
				if (rand == 0 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Village)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Village));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Village), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Village)) - 1);
					coins = coins - 3;
				} else if (rand == 1 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Ambassador)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Ambassador));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Ambassador), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Ambassador)) - 1);
					coins = coins - 3;
				} else if (rand == 2 && state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Great_Hall)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Great_Hall)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Great_Hall));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Great_Hall), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Great_Hall)) - 1);
					coins = coins - 3;
				}

			} else if (coins == 4) {//randomly choose one of these
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Smithy)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Smithy));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) - 1);
					coins = coins - 4;
				} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Baron)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Baron));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Baron), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Baron)) - 1);
					coins = coins - 4;
				} else if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Cutpurse)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Smithy));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Smithy)) - 1);
					coins = coins - 4;
				}
				//gain(Card.getCard(state.cards, Card.CardName.Baron));
				//gain(Card.getCard(state.cards, Card.CardName.Cutpurse));
				//gain(Card.getCard(state.cards, Card.CardName.Feast));
				//gain(Card.getCard(state.cards, Card.CardName.Remodel));

			} else if (coins == 5) {//randomly choose one of these
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Mine)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Mine));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Mine), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Mine)) - 1);
					coins = coins - 5;
				}
			} else if (coins == 6) {
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Gold));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
					coins = coins - 6;
				}
			} else if (coins == 7){
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Adventurer)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Adventurer));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Adventurer), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Adventurer)) - 1);
					coins = coins - 7;
				}
			} else if (coins >= 8){
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Province)) && state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) > 0) {
					gain(Card.getCard(state.cards, Card.CardName.Province));
					state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1);
					coins = coins - 8;
				}
		}
			numBuys--;
		}
	}

	final void endTurn() {
		coins = 0;
		numActions = 1;
		numBuys = 1;
		for(Card c: playedCards)
		{
			discard.add(c);
		}
		for(Card c: hand)
		{
			discard.add(c);
		}
		playedCards.clear();
		hand.clear();
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

		sb.append("\n------- " + this.player_username + " -------");
		sb.append("\nnumActions: " + this.numActions);
		sb.append(", coins: " + this.coins);
		sb.append(", numBuys: " + this.numBuys);
		sb.append("\nHand: " + this.hand);
		sb.append("\nDiscard: " + this.discard);
		sb.append("\nDeck: " + this.deck);
		sb.append("\nPlayed Cards: " + this.playedCards);

		sb.append("\n");

		return sb.toString();
	}
	   
	protected Player clone() throws CloneNotSupportedException {
		Player clonePlayer = (Player) super.clone();
		clonePlayer.hand = new ArrayList<Card>(hand);// int hand[MAX_PLAYERS][MAX_HAND];
		clonePlayer.deck = new LinkedList<Card>(deck);// int
		// deck[MAX_PLAYERS][MAX_DECK];
		clonePlayer.discard = new ArrayList<Card>(discard); // int
		// discard[MAX_PLAYERS][MAX_DECK];
		clonePlayer.playedCards = new ArrayList<Card>(playedCards);
		return clonePlayer;
	}
}
