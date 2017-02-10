import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class Card implements Comparable<Card>, Cloneable{
	public enum Type {
		ACTION, TREASURE, VICTORY
	}

	public enum CardName {
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
	private Random gen = new Random();

	private Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
	}

	Type getType() {
		return realType;
	}

	CardName getCardName() {
		return cardName;
	}

    int getTreasureValue() {
		return treasureValue; 
	}

	int score() {
			return score; 
		}
	
	static List<Card> createCards() {
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
	
	void play(Player player, GameState state) {
		
		switch(this.cardName) {
		    case Adventurer: //--------------------
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
	    	  System.out.println("TODO Adventurer Code******************************************");
	    	  System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
	    	  		"Put those Treasure cards into player hand and discard the other revealed cards.");
			return;

            case Smithy: //DONE
                System.out.println("+3 Cards.");
                player.drawCard();
                player.drawCard();
                player.drawCard();
                return;

            case Village: //DONE
                System.out.println("+1 Card. +2 Actions.");
                player.drawCard();
                player.numActions = player.numActions + 2;
                return;

            case Ambassador: //----------------
                System.out.println("TODO Ambassador Code******************************************");
                /*Reveal a card from your hand.
                Return up to 2 copies of it from your hand to the Supply.
                Then each other player gains a copy of it.*/
                int rand = gen.nextInt(5);
                int num = 0;
                List<Card> actionCards = filter(player.hand, Type.ACTION);
                for(Card c : actionCards)
                {
                    if(num == rand){
                        System.out.println("This is Ambassador Code to do shiny things");
                    }
                    num++;
                }
                return;

            case Baron://DONE
                System.out.println("+1 Card. +2 Actions.");
                System.out.println("+4 coins or gains Estate.");
                if(getCard(player.hand, CardName.Estate) != null) {
                    player.discard(getCard(player.hand, CardName.Estate));
                    player.coins = player.coins + 4;
                } else player.gain(getCard(state.cards, CardName.Estate));
                return;

            case Council_Room://DONE
                System.out.println("+4 Card. +1 Buys. Every other player +1 Card.");
                player.drawCard();
                player.drawCard();
                player.drawCard();
                player.numBuys++;
                for (Player players : state.players)
                {
                    players.drawCard();
                }
                return;

            case Cutpurse://DONE
                System.out.println("+2 Coins. Every other player discards Copper.");
                player.coins = player.coins + 2;
                for (Player players : state.players)
                {
                    if(players != player && getCard(players.hand, CardName.Copper) != null) players.discard(getCard(player.hand, CardName.Copper));
                }
                return;

            case Embargo: //----------------------
                System.out.println("+2 Coins. Trash this Card. Place Embargo Token on Supply Pile");
                System.out.println("When a player buys a card, he gains a Curse card per Embargo token on that pile");
                player.coins = player.coins + 2;
                player.hand.remove(getCard(player.hand, CardName.Embargo));//trashes the Embargo card
                GameState.addEmbargo();//does nothing yet
                return;

            case Feast: //-------------------------
                System.out.println("Trash this Card. Gain a card costing up to 5 coins.");
                //buy card up to 5 coins.
                //Player.buyCard(state);
                return;

            case Gardens: //-----------------------
                System.out.println("Worth 1 VICTORY for every 10 cards.");
                return;

            case  Great_Hall: //
                System.out.println("+1 Card. +1 Action. Worth 1 VICTORY point.");
                player.drawCard();
                player.numActions++;
                return;

            case Mine:
                System.out.println("Trash a Treasure Card. Gain Next Level of Treasure Card ");
                if(getCard(player.hand, CardName.Silver) != null) {
                    player.hand.remove(getCard(player.hand, CardName.Silver));
                    player.gain(getCard(state.cards, CardName.Gold));
                } else if(getCard(player.hand, CardName.Copper) != null)
                {
                    player.hand.remove(getCard(player.hand, CardName.Copper));
                    player.gain(getCard(state.cards, CardName.Silver));
                }
                return;

            case Remodel:
                System.out.println("Trash the Card. Gain Card costing up to 2 more than Trashed Card");
                int cost = this.cost;
                player.hand.remove(this);
                //player buys card (cost + 2);]
                return;

            default:
        }
	}

	static Card getCard(List<Card> cards,CardName cardName) {
        for (Card card : cards) {
            if (card.cardName.equals(cardName))
                return card;
        }
		return null;
	}

	static List<Card> filter(Iterable<Card> cards, Type target) {
	      List<Card> out = new ArrayList<Card>();
	      for (Card c : cards)
	         if (c.getType() == target)
	            out.add(c);
	      return out;
	}

	@Override
	public String toString() {
        return ("\t" + this.getCardName());
	}

	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj instanceof Card) if (cardName.equals(((Card) obj).cardName)) return true;
        return false;
    }

	public int compareTo(Card o) {
		return cardName.compareTo(o.cardName);
	}

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}