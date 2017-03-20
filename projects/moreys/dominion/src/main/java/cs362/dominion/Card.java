package cs362.dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public final class Card implements Comparable<Card>{
	public enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Cooper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Smithy, Village, Council_room, Baron, Mine, Cutpurse, Great_Hall, Steward, Gardens, Ambasador, Embargo, Feast;
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (cooper, silver, and gold cards)
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

	public int getTreasureValue() { return treasureValue; }
	public int score(Player player) { return score; }

	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.Province,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	

		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(CardName.Council_room,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse, Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall, Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.Steward, Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Gardens, Type.ACTION,4,1,0);
		ret.add(o);
		o = new Card(CardName.Ambasador, Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo, Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION,4,0,0);
		ret.add(o);
		return ret;
	}

	public void play(Player player, GameState state) {

		switch(this.cardName) {
		case Adventurer:
			int T_card = 0;
			System.out.println("Player Draws until gaining two treasure cards, discards others");
			while(T_card < 2) {
				Card c = player.deck.get(0);
				player.drawCard();
				if(c.getType() == Type.TREASURE) {
					T_card++;
				}
				else {
					player.discard(c);
				}
			}
			return;
		case Council_room:
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.numBuys++;
			if(state.players.get(0).player_username == player.player_username) {
				state.players.get(1).drawCard();
			}
			else {
				state.players.get(0).drawCard();
			}
			return;
		case Cutpurse:
			player.coins += 2;
			if(state.players.get(0).player_username == player.player_username) {
				state.players.get(1).discard(state.players.get(1).hand.get(0));
			}
			else {
				state.players.get(0).discard(state.players.get(0).hand.get(0));
			}
			return;
		case Baron:
			int supply_value; 
			for(Card c : player.hand) {
				if (c.getCardName() == CardName.Estate) {
					player.discard(c);
					player.coins += 4;
					return;
				}
			}
			if (state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate))!=0){
				player.discard.add(Card.getCard(state.cards, Card.CardName.Estate));
				supply_value = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate));
				state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Estate), supply_value-1);
				return;
			}
			else {
				return;
			}
		case Great_Hall:
			player.drawCard();
			player.numActions++;
			return;
		case Embargo:
			player.coins += 2;
			return;
		case Feast:
			return;
		case Ambasador:
			return;
		case Gardens:
			return;
		case Mine:
			for(Card c : player.hand) {
				if (c.getCardName() == CardName.Cooper) {
					if (state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver))==0) {
						return;
					}
					player.hand.remove(c);
					player.buy_hand(getCard(state.cards, CardName.Silver));
					return;
				}
				else if (c.getCardName() == CardName.Silver) {
					if (state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Gold))==0) {
						return;
					}
					player.hand.remove(c);
					player.buy_hand(getCard(state.cards, CardName.Gold));
					return;
				}
			}
			return;
		case Smithy:
			player.drawCard();
			player.drawCard();
			player.drawCard();
			return;
		case Steward:
			int trashed = 0;
			int r = Randomness.random.nextInt(2) + 1;
			int counter = 0;
			/*for(Card c : player.hand) {
				if (c == null) {
					return;
				}
				if (c.getCardName() == CardName.Curse) {
					player.hand.remove(c);
					trashed ++;
					if (trashed == 2){
						return;
					}
					else if(trashed < 2) {
						continue; 
					}
				}
				else if (c.getCardName() == CardName.Estate) {
					player.hand.remove(c);
					trashed ++;
					if (trashed == 2){
						return;
					}
					else if(trashed < 2) {
						continue; 
					}
				}
				else if (c.getCardName() == CardName.Cooper) {
					player.hand.remove(c);
					trashed ++;
					if (trashed == 2){
						return;
					}
					else if(trashed < 2) {
						continue; 
					}
				}
				if (counter == player.hand.size()) {
					if (trashed == 1){
						return;
					}
					else{
						break;
					}
				}	
				
			}*/
			if (r == 1) {
				player.drawCard();
				player.drawCard();
			}
			if (r == 2) {
				player.coins += 2;
			}
			return;
		case Village:
			System.out.println("The player draw +1 Card.");
			player.drawCard();
			System.out.println("The player gets +2 play Actions.");
			player.numActions += 2;
			return;

		default: return;
		}
	}

	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName))
				return 	cards.get(i);
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
	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" \t" + this.getCardName());
		sb.append("-" + this.getType() + " ");
		sb.append("\t\t Cost: " + this.cost + " ");
		sb.append("\t\t Score: " + this.score + " ");
		sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();

	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}


}
