package waitean.DominionMaven;
import java.util.ArrayList;

public class Card implements Cloneable{
	public static enum CardType {
		VICTORY, ACTION, TREASURE
	}

	public static enum CardName {
		//Standard Victory Cards
		Province, Duchy, Estate, Curse,
		//Standard Treasure Cards
		Gold, Silver, Copper,
		//Kingdom Cards
		Adventurer,
		Ambassador,
		Baron,
		Council_Room,
		Cutpurse,
		Embargo,
		Feast,
		Gardens,
		Great_Hall,
		Mine,
		Remodel,
		Smithy,
		Village
	}

	private CardName name;
	private CardType type;
	private int cost;
	
	public Card(CardName n, CardType t, int c) {
		this.name = n;
		this.type = t;
		this.cost = c;
	}
	
	public CardName getName() {
		return name;
	}
	
	public CardType getType() {
		return type;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void play(Player p, GameBoard board) {
		switch (this.name) {
		case Province:
			//Do nothing.
			return;
		case Duchy:
			//Do nothing.
			return;
		case Estate:
			//Do nothing.
			return;
		case Curse:
			//Do nothing
			return;
		case Gold:
			//+3g
			p.addTreasure(3);
			p.removeFromHand(this);
			p.addToPlay(this);
			return;
		case Silver:
			//+2g
			p.addTreasure(2);
			p.removeFromHand(this);
			p.addToPlay(this);
			return;
		case Copper:
			//+1g
			p.addTreasure(1);
			p.removeFromHand(this);
			p.addToPlay(this);
			return;
		case Adventurer:
			//Draw cards until you have drawn 2 treasures.
			//Discard the rest of the drawn cards.
			int treasureCount = 0;
			Card drawnCard;
			while (treasureCount < 2) {
				drawnCard = p.drawToAdventurer();
				if (drawnCard == null)
				{
					p.removeFromHand(this);
					p.addToPlay(this);
					return;
				}
				if (drawnCard.getType().equals(Card.CardType.TREASURE)) {
					treasureCount++;
					p.addToHand(drawnCard);
				} else {
					p.discard(drawnCard);
				}
			}
			return;
		case Ambassador:
			//Reveal a card in your hand. 
			//Put up to two copies of it from your hand into the supply.
			//Each other player gains a copy of it.
			return;
		case Baron:
			//+1 buy.
			//You may discard an estate for +4g.
			//If you don't, gain an estate.
			p.addBuys(1);
			Card baronTarget = getCard(p.getHand(), Card.CardName.Estate);
			if (baronTarget != null) {
				p.removeFromHand(baronTarget);
				p.addTreasure(4);
			} else {
				Card aquireCard = board.getCardFromPiles(Card.CardName.Estate).aquireCard();
				if (aquireCard != null) {
					p.discard(aquireCard);
				}
			}
			return;
		case Council_Room:
			//+4 cards.
			//+1 buy.
			//Each other player draws a card.
			p.draw();
			p.draw();
			p.draw();
			p.draw();
			for (Player q : board.getPlayers()) {
				q.draw();
			}
			return;
		case Cutpurse:
			//+2g.
			//Each other player discards a copper
			//or reveals a hand with no copper in it.
			p.addTreasure(2);
			for (Player q : board.getPlayers()) {
				Card targetCopper = getCard(q.getHand(), Card.CardName.Copper);
				if (targetCopper != null) {
					q.removeFromHand(targetCopper);
					q.discard(targetCopper);
				} 
			}
			return;
		case Embargo:
			//+2g.
			//Trash this card, put an embargo token on a supply pile.
			//When a player buys a card he gains a curse for every 
			//embargo token on that pile.
			p.addTreasure(2);
			
			return;
		case Feast:
			//Trash this card.
			//Gain a card costing up to 5.
			return;
		case Gardens:
			//Does nothing.
			return;
		case Great_Hall:
			//+1 card.
			//+1 action.
			p.draw();
			p.addActions(1);
			return;
		case Mine:
			//You may trash a treasure card from your hand.
			//Gain a treasure to your hand costing up to 3g 
			//more than the trashed treasure.
			return;
		case Remodel:
			//Trash a card from your hand, gain a card costing up to
			//2g more than it.
			return;
		case Smithy:
			//+3 cards.
			p.draw();
			p.draw();
			p.draw();
			return;
		case Village:
			//+1 card.
			//+2 actions.
			p.draw();
			p.addActions(2);
			return;
		}//End of switch statement.
	}//End of play()
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not supported");
			return this;
		}//End of try/catch
	}//End of clone()
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append("-" + this.getType() + " ");
		//Might want to include other fields in here.
		return sb.toString();
	}//End of toString()
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (!(obj instanceof Card)) return false;
		return  this.getName().equals(((Card) obj).getName());
	}//End of equals()
	
	public static ArrayList<Card> getKingdomCards() {
		ArrayList<Card> newList = new ArrayList<Card>();
		newList.add(new Card(CardName.Adventurer, CardType.ACTION, 6));
		newList.add(new Card(CardName.Ambassador, CardType.ACTION, 3));
		newList.add(new Card(CardName.Baron, CardType.ACTION, 4));
		newList.add(new Card(CardName.Council_Room, CardType.ACTION, 5));
		newList.add(new Card(CardName.Cutpurse, CardType.ACTION, 4));
		newList.add(new Card(CardName.Embargo, CardType.ACTION, 2));
		newList.add(new Card(CardName.Feast, CardType.ACTION, 4));
		newList.add(new Card(CardName.Gardens, CardType.VICTORY, 4));
		newList.add(new Card(CardName.Great_Hall, CardType.VICTORY, 3));
		newList.add(new Card(CardName.Mine, CardType.ACTION, 5));
		newList.add(new Card(CardName.Remodel, CardType.ACTION, 4));
		newList.add(new Card(CardName.Smithy, CardType.ACTION, 4));
		newList.add(new Card(CardName.Village, CardType.ACTION, 3));
		for (int i = 0; i < 3; i++) {
			int rand = Randomness.nextRandomInt(newList.size());
			newList.remove(rand);
		}
		return newList;
	}//End of getKingdomCards
	
	public static int getScoreCard(Card c) {
		switch (c.getName()) {
		case Province:
			return 6;
		case Duchy:
			return 3;
		case Estate:
		case Great_Hall:
			return 1;
		default:
			return 0;
			
		}//End switch
	}//End of get score card
	
	public static Card getCard(ArrayList<Card> cards, Card.CardName name) {
		for (Card c : cards) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}//End of get card by name
	
	public static ArrayList<Card> filterCards(ArrayList<Card> cards, Card.CardType type) {
		ArrayList<Card> ret = new ArrayList<Card>();
		for (Card c : cards) {
			if (c.getType().equals(type)) {
				ret.add(c);
			}
		}
		return ret;
	}//End of filter cards by type
	
	public static ArrayList<Card> filterCards(ArrayList<Card> cards, int cost) {
		ArrayList<Card> ret = new ArrayList<Card>();
		for (Card c : cards) {
			if (c.getCost() <= cost) {
				ret.add(c);
			}
		}
		return ret;
	}//End of filter cards by cost
}//End of class Card




