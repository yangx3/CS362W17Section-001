import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Card implements Comparable<Card>, Cloneable{
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper,
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Smithy, Village, Remodel
    }

	/**
	// * @param enum CardName the name of the card (GOLD, SILVER, COPPER,
	// * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	// * @param int cost the cost of the card
	// * @param int score the score of the card, when the game is finished
	// * @param treasureValue  the treasure value of the treasure cards (cooper, silver, and gold cards)
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

	public Type getType() {
		return realType;
	}

	public CardName getCardName() {
		return cardName;
	}

	public int getCost() {
		return cost;
	}

	public int getTreasureValue() {
		return treasureValue; 
	}

	public int score() { 
			return score; 
		}
	
	public static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

        // The Treasure cards
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

        // The Victory cards
		o = new Card(CardName.Province,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);

        // The Kingdom cards
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);
        o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
        ret.add(o);
        o = new Card(CardName.Baron,Type.ACTION,4,0,0);
        ret.add(o);
        o = new Card(CardName.Council_Room,Type.ACTION,5,0,0);
        ret.add(o);
        o = new Card(CardName.Cutpurse,Type.ACTION,4,0,2);
        ret.add(o);
        o = new Card(CardName.Embargo,Type.ACTION,2,0,2);
        ret.add(o);
        o = new Card(CardName.Feast,Type.ACTION,4,0,0);
        ret.add(o);
        o = new Card(CardName.Gardens,Type.ACTION,4,0,0);
        ret.add(o);
        o = new Card(CardName.Great_Hall,Type.ACTION,3,1,0);//
        ret.add(o);
        o = new Card(CardName.Mine,Type.ACTION,5,0,0);
        ret.add(o);
        o = new Card(CardName.Remodel,Type.ACTION,4,0,0);
        ret.add(o);

        return ret;
	}
	
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
	    	  System.out.println("TODO Adventurer Code******************************************");
	    	  System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
	    	  		"Put those Treasure cards into player hand and discard the other revealed cards.");
			return;

		case Smithy:
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			return;

		case Village:
	    	 player.drawCard();
	    	 player.numActions = player.numActions + 2;
            return;

		case Ambassador:
            System.out.println("TODO Village Code******************************************");
            System.out.println("The player draw +1 Card.");
            System.out.println("The player gets +2 play Actions.");
            return;

        case Baron:
            if(getCard(player.hand, CardName.Estate) != null) {
                player.discard(getCard(player.hand, CardName.Estate));
                player.coins = player.coins + 4;
            }else //player.gain(getCard(GameState.cards, CardName.Estate)); // the GameState is initialized after the Cards...
            System.out.println("The player draws +1 Card.");
            System.out.println("The player gets +2 Actions.");
            System.out.println("If player has an Estate in hand, they get +4 coins or they gain an Estate.");
            return;

        case Council_Room:
        	player.drawCard();
            player.drawCard();
            player.drawCard();
            player.drawCard();
            player.numBuys++;
            //for (Player players : GameState.players)
            {
                //players.drawCard();
            }
            System.out.println("The player draws +4 Card.");
            System.out.println("The player gets +1 Buys.");
            System.out.println("Every other player draws +1 Card.");
            return;

        case Cutpurse:
            //for (Player players : GameState.players)
            {
               //players.discard(getCard(players.hand, CardName.Estate));
            }
            System.out.println("The player gets +2 Coins.");
            System.out.println("Every other player discards a Copper Card.");
            return;

        case Embargo:
            player.coins = player.coins + 2;
            player.hand.remove(getCard(player.hand, CardName.Embargo));//trashes the Embargo card
            GameState.addEmbargo();//does nothing yet
            System.out.println("The player gets +2 Coins.");
            System.out.println("The player trashes this Card.");
            System.out.println("The player puts a Embargo token on top of a Supply Pile.");
            System.out.println("When a player buys a card, he gains a Curse card per Embargo token on that pile");
            return;

        case Feast:
            //buy card up to 5 coins.
            System.out.println("The player trashes this Card.");
            System.out.println("The player gains a card costing up to 5 coins.");
            return;

        case Gardens:
            System.out.println("Worth 1 VICTORY for every 10 cards the player has.");
            return;

        case  Great_Hall:
            player.drawCard();
            player.numActions++;
            System.out.println("Worth 1 VICTORY point.");
            System.out.println("The player draw +1 Card.");
            System.out.println("The player gets +1 Action.");
            return;

        case Mine:
            if(getCard(player.hand, CardName.Silver) != null) {
                player.hand.remove(getCard(player.hand, CardName.Silver));
                //player.gain(getCard(GameState.gameBoard.card, CardName.Gold));
            } else if(getCard(player.hand, CardName.Copper) != null)
            {
                player.hand.remove(getCard(player.hand, CardName.Copper));
                //player.gain(getCard(GameState.gameBoard.card, CardName.Silver));
            }
            System.out.println("The player trashes a Treasure card.");
            System.out.println("The player gets a Treasure card one level higher than the trashed Card.");
            return;

        case Remodel:
            int cost = this.cost;
            player.hand.remove(this);
            //player buys card (cost + 2);
            System.out.println("The player trashes the Card.");
            System.out.println("The player gains a card costing up to more than trashed Card.");
            return;

		default: return;
		}
	}

	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++) {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\t" + this.getCardName());
//		sb.append("-" + this.getType() + " ");
//		sb.append("\t\t Cost: " + this.cost + " ");
//		sb.append("\t\t Score: " + this.score + " ");
//		sb.append("\tTreasure Value: " + this.treasureValue);

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
		return cardName.compareTo(o.cardName);
	}

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}