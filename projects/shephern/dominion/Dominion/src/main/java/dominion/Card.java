package dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public final class Card implements Comparable<Card>, Cloneable{
	public enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, CouncilRoom, Cutpurse, 
		Embargo, Feast, Gardens, GreatHall, Mine,
		/** Plus the three of my choice */
		Village, Smithy, SeaHag;
		}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (Copper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	private Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
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
	
	/**
	 * Returns the treasureValue
	 */
	public int getTreasureValue(){
		return treasureValue;
	}
	
	/**
	 * Returns the cost
	 */
	public int getCost(){
		return cost;
	}
	
	/**
	 * Returns score
	 */
	public int getScore(){
		return score;
	}

	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.Province,Type.VICTORY, 8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY, 5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY, 2, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more that 10 cards*/ 	
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Ambassador, Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.CouncilRoom, Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse, Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo, Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Gardens, Type.VICTORY,4,0,0);
		ret.add(o);
		/* I will describe the greathall as an action card-- Needs to be action victory */
		o = new Card(CardName.GreatHall, Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.Mine, Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Village, Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.SeaHag, Type.ACTION,4,0,0);
		ret.add(o);
		return ret;
	}
	
	public void play(Player player, GameState state) {
		switch(this.cardName) {
		case Adventurer:
			//Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
			int treasureFound = 0;
			while(treasureFound < 2){
				Card tmp = player.drawCard();
				//If the card is a treasure, keep it, if its not discard
				if(tmp.getType() == Card.Type.TREASURE){
					treasureFound++;
	    		 } else {
	    			 player.discard(tmp);
	    		 }
	    	} 
			return;
		case Ambassador:
			//Reveal a card from your hand. Return up to two copies of it from your hand to the Supply.  Then each other player gains a copy of it.
			if(player.hand.size() > 0){
				Card first = player.hand.get(0);
				System.out.println("Revealed "+first.getCardName());
				state.addCard(first);
				player.hand.remove(first);
				
				Card second = Card.getCard(player.hand, first.getCardName());
				if(second != null){
					state.addCard(second);
					player.hand.remove(second);
				}
				
				for(Player p : state.players){
					if(p.player_username != player.player_username){
						//For other players
						if(state.gameBoard.get(first) > 0){
							state.takeCard(first);
							p.gain(first);
						}
					}
				}
			}
			return;
		case Baron:
			//+1 Buy, player may discard an estate to gain +4 coin. Otherwise gain an estate
			player.numBuys++;
			Card c = Card.getCard(player.hand, Card.CardName.Estate);
			if(c != null){
				player.discard(c);
				player.coins += 4;
			} else {
				Card es = getCard(state.cards, Card.CardName.Estate);
				if(state.gameBoard.get(es) <= 0){
					System.out.println("No remaining estate cards.");
				} else {
					state.takeCard(es);
					player.gain(es);
				}
			}
			return;
		case CouncilRoom:
			//+4 cards +1 buy. each other player draws a card.
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.numBuys++;
			
			for(Player p : state.players){
				if(p.player_username != player.player_username)
					p.drawCard();
			}
			return;
		case Cutpurse:
			//+2 Coin. Each other player discards a Copper from their hand, or reveals a hand with no copper
			player.coins += 2;

			for(Player p : state.players){
				if(p.player_username != player.player_username){
					Card toDiscard = Card.getCard(p.hand, Card.CardName.Copper);
					if(toDiscard != null){
						p.discard(toDiscard);
					}
				}
			}
			return;
		case Embargo:
			//+2 Coin. Trash this card, place an embargo token on top of a Supply pile
			player.coins += 2;
			Card toEmbargo = state.cards.get(Randomness.nextRandomInt(state.cards.size()));
			int tokes = state.tokensPlaced.get(toEmbargo) + 1;
			state.tokensPlaced.replace(toEmbargo, tokes);
			System.out.println("placed token on "+toEmbargo.getCardName()+".");
			return;
		case Feast:
			//Trash this card, gain a card costing up to +5 coin.
			boolean fulfilled = false;
			Card toGain = state.cards.get(Randomness.nextRandomInt(state.cards.size()));
			while(!fulfilled){
				if(state.gameBoard.get(toGain) > 0 && toGain.getCost() <= 5){
					//There is a card and it costs <= 5 coins
					player.gain(toGain);
					state.takeCard(toGain);
					fulfilled = true;
				} else {
					toGain = state.cards.get(Randomness.nextRandomInt(state.cards.size()));
					//Try another card
				}
			}
			return;
		case Gardens:
			//Worth 1 vp for every 10 cards, at the end of the game
			//Not reachable, as gardens is victory type
			return;
		case GreatHall:
			//+1 Card, +1 action, 1 vp at end of game
			player.drawCard();
			player.numActions++;
			return;
		case Mine:
			//Player may trash a treasure from their hand, and gain a treasure costing up to 3 more
			List<Card> treasure = Card.filter(player.hand, Card.Type.TREASURE);
			if(treasure.size() >0){
				Card treas = treasure.get(0);
				int cost = treas.getCost() + 3;
				System.out.print("Trashed a "+treas.getCardName()+" for a ");
				switch(cost){
				case 3:
					Card getSilver = state.takeCard(Card.CardName.Silver);
					System.out.print(" Silver.\n");
					player.hand.add(getSilver);
					break;
				case 6:
					Card getGold = state.takeCard(Card.CardName.Gold);
					System.out.print(" Gold.\n");
					player.hand.add(getGold);
					break;
				case 9:
					Card getGoldAgain = state.takeCard(Card.CardName.Gold);
					System.out.print(" Gold.\n");
					player.hand.add(getGoldAgain);
					break;
				default: break;
				}
				player.hand.remove(treas);
			}
			return;
		case Village:
			//Player draws a card and gains 2 actions.
			player.drawCard();
			player.numActions += 2;
			return;
		case Smithy:
			//Draw three cards
			player.drawCard();
			player.drawCard();
			player.drawCard();
			return;
		case SeaHag:
			//Each other player discards the top card of their deck, and gains a curse card
			if(state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) <= 0){
				System.out.println("No curses remain.");
				return;
			}
			for(Player p: state.players){
				Card toDiscard = p.deck.poll();
				p.discard.add(toDiscard);
				Card curse = state.takeCard(Card.CardName.Curse);
				p.deck.addFirst(curse);
			}
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

		return realType.equals(((Card) obj).realType);
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
