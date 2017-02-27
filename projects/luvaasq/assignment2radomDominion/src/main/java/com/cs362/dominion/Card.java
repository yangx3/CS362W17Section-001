package dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Card implements Comparable<Card>, Cloneable {
	public enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper,
		/** The Victory cards */
		Province, Duchy, Estate, Curse, Gardens,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Great_Hall, Mine, Smithy, Steward, Village;
	}

	/**
	 * @param enum
	 *            CardName the name of the card (GOLD, SILVER, COPPER,
	 * @param enum
	 *            Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int
	 *            cost the cost of the card
	 * @param int
	 *            score the score of the card, when the game is finished
	 * @param treasureValue
	 *            the treasure value of the treasure cards (cooper, silver, and
	 *            gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
	}

	public int getCost() {
		return cost;
	}

	/**
	 * Returns the type
	 */
	public Type getType() {
		return realType;
	}

	/**
	 * Returns the cardName
	 */
	public CardName getCardName() {
		return cardName;
	}

	public int getTreasureValue() {
		return treasureValue;
	}

	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards */
		o = new Card(CardName.Province, Type.VICTORY, 8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy, Type.VICTORY, 5, 3, 0);
		ret.add(o);
		o = new Card(CardName.Estate, Type.VICTORY, 2, 1, 0);
		ret.add(o);
		o = new Card(CardName.Curse, Type.VICTORY, 0, -1, 0);
		ret.add(o);
		o = new Card(CardName.Gardens, Type.VICTORY, 4, 0, 0);
		ret.add(o);

		o = new Card(CardName.Great_Hall, Type.ACTION, 4, 1, 0);
		ret.add(o);

		/** The Kingdom cards , it should more than 10 cards */
		o = new Card(CardName.Adventurer, Type.ACTION, 6, 0, 0);
		ret.add(o);
		o = new Card(CardName.Ambassador, Type.ACTION, 3, 0, 0);
		ret.add(o);
		o = new Card(CardName.Baron, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Council_Room, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Cutpurse, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Embargo, Type.ACTION, 2, 0, 0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Great_Hall, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Mine, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Smithy, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Steward, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Village, Type.ACTION, 3, 0, 0);
		ret.add(o);
		return ret;
	}

	public int score(Player player) {
		if (this.cardName.equals(CardName.Gardens)) {
			int scoreGarden = (player.hand.size() + player.discard.size() + player.deck.size()) / 10;
			return scoreGarden;
		} else {
			return score;
		}
	}

	public void play(Player player, GameState state) {

		switch (this.cardName) {
		case Adventurer:
			player.discard(Card.getCard(state.cards, CardName.Adventurer));
			int treasure = 0;
			while (treasure < 2) {
				Card card = player.drawCard();
				if (card.getType().equals(Type.TREASURE))
					treasure++;
				else
					player.discard(card);
			}
			return;

		case Ambassador:

			player.discard(Card.getCard(state.cards, CardName.Ambassador));

			if (player.hand.size() < 1)
				return;

			Card pick = player.hand.get(Randomness.nextRandomInt(player.hand.size()));

			System.out.println(player.toString());
			player.trashCard(pick);
			System.out.println(player.toString());

			int count = 0;
			try {
				count = state.gameBoard.get(pick);
			} catch (NullPointerException e) {
				count = 0;

			}

			System.out.println(player.toString());
			state.gameBoard.put(pick, count + 1);

			player.hand.contains(pick);

			if (Randomness.nextRandomInt(2) == 1) {
				player.trashCard(pick);
				count = 0;
				try {
					count = state.gameBoard.get(pick);
				} catch (NullPointerException e) {
					count = 0;

				}
				state.gameBoard.put(pick, count + 1);
			}

			for (Player currPlayer : state.players) {
				if (!currPlayer.player_username.equals(player.player_username)) {
					if (state.gameBoard.get(pick) > 0) {
						currPlayer.gain(state.getGameboard(pick));
						return;
					}
				}
			}
			return;

		case Baron:
			player.discard(Card.getCard(state.cards, CardName.Baron));
			player.numBuys++;
			if (player.hand.contains(Card.getCard(state.cards, Card.CardName.Estate))
					&& Randomness.nextRandomInt(2) == 1) {
				player.discard(Card.getCard(state.cards, Card.CardName.Estate));
				player.coins += 4; 
				return;
			} 
			else {
				if (state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate)) > 0)
					player.gain(state.getGameboard(Card.getCard(state.cards, Card.CardName.Estate)));
					
				return;
			}

		case Council_Room:
			player.discard(Card.getCard(state.cards, CardName.Council_Room));
			player.drawCard();
			player.drawCard();
			player.drawCard(); 
			//[BUG] Should draw 4 cards total
			player.numBuys++;
			for (Player active : state.players)
				if (!active.equals(player))
					active.drawCard();
			return;

		case Cutpurse:
			player.discard(Card.getCard(state.cards, CardName.Cutpurse));
			player.coins += 1; //[BUG] Should be 2
			for (Player active : state.players)
				if (!active.player_username.equals(player.player_username))
					if (active.hand.contains(Card.getCard(state.cards, CardName.Copper)))
						active.discard(Card.getCard(state.cards, CardName.Copper));
			return;

		case Embargo:
			player.trashCard(Card.getCard(state.cards, CardName.Embargo));
			player.coins += 2; 
			Card pickedCard = Randomness.randomMember(state.cards);
			int embargos = state.embTokens.get(pickedCard);
			//[BUG] state.embTokens.put(pickedCard, embargos + 1);
			return;

		case Feast:
			player.trashCard(Card.getCard(state.cards, Card.CardName.Feast));
			List<Card> cardOptions = new ArrayList<Card>(state.gameBoard.keySet());
			List<Card> buyableCards = Card.checkPrice(cardOptions, 5);
			Card picked = buyableCards.get(Randomness.nextRandomInt(buyableCards.size()));
			while (state.gameBoard.get(picked) == 0) {
				picked = buyableCards.get(Randomness.nextRandomInt(buyableCards.size()));
			}
			player.gain(picked);
			return;

		case Great_Hall:
			player.discard(this);		
			//player.drawCard();			
			player.numActions++;
			System.out.println(player.toString());
			
			return;

		case Mine:
			player.discard(Card.getCard(state.cards, CardName.Mine));
			List<Card> treasureCards = Card.filter(player.hand, Type.TREASURE);

			if (treasureCards.size() == 0)
				return;

			if (treasureCards.contains(Card.getCard(state.cards, Card.CardName.Copper)))
				if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Silver))) {
					player.trashCard(Card.getCard(state.cards, Card.CardName.Copper));
					if (state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) > 0)
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver)) - 1);
						player.hand.add(state.getGameboard(Card.getCard(state.cards, Card.CardName.Silver)));
					return;
				} else if (treasureCards.contains(Card.getCard(state.cards, Card.CardName.Silver)))
					if (state.gameBoard.containsKey(Card.getCard(state.cards, Card.CardName.Gold))) {
						player.trashCard(Card.getCard(state.cards, Card.CardName.Silver));
						if (state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) > 0)
							state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold)) - 1);
							player.hand.add(state.getGameboard(Card.getCard(state.cards, Card.CardName.Gold)));
						return;
					}
			return;

		case Smithy: 
			player.discard(Card.getCard(state.cards, CardName.Smithy));
			player.drawCard();
			player.drawCard();
			player.drawCard();			
			
			return;

		case Steward:
			player.trashCard(Card.getCard(state.cards, CardName.Steward));
			int randChoice = Randomness.nextRandomInt(3);
			if (randChoice == 0){
				player.drawCard();
				player.drawCard();
			}
			if (randChoice == 1){
				player.coins += 2;
			}
			if (randChoice == 2){
				player.trashCard(Randomness.randomMember(player.hand));
				player.trashCard(Randomness.randomMember(player.hand));
			}
			return;

		case Village:
			player.discard(Card.getCard(state.cards, CardName.Village));
			player.drawCard();
			player.numActions += 2;
			return;

		default:
			return;
		}
	}

	public static Card getCard(List<Card> cards, CardName cardName) {
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).cardName.equals(cardName))
				return cards.get(i);
		}

		return null;

	}

	public static List<Card> filter(Iterable<Card> cards, Type target) {
		List<Card> out = new ArrayList<Card>();
		for (Card c : cards)
			if (c.getType() == target)
				out.add(c);
		return out;
	}
	public static int filterQTY(Iterable<Card> cards, Card.CardName target) {
		int out = 0;
		
		for (Card c : cards)
			if (c.cardName == target)
				out++;
		System.out.println(out);
		
		return out;
	}
	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" " + this.getCardName());
		// sb.append("-" + this.getType() + " ");
		// sb.append("\t\t Cost: " + this.cost + " ");
		// sb.append("\t\t Score: " + this.score + " ");
		// sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Card))
			return false;

		return cardName.equals(((Card) obj).cardName);
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}

	public static List<Card> checkPrice(Iterable<Card> cards, Integer price) {
		List<Card> out = new ArrayList<Card>();
		for (Card c : cards)
			if (c.getCost() <= price)
				out.add(c);
		return out;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}