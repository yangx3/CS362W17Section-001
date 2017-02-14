package dominion;

import java.util.*;

public final class Card implements Comparable<Card>{
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Remodel, Adventurer, Smithy, Village, Ambassador, GreatHall, Baron, CouncilRoom, Cutpurse, Embargo, Feast, Mine, Salvager;
	}
	
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
	 * Returns the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * Returns the treasureValue
	 */
	public int getTreasureValue() {
		return treasureValue; 
	}
	public int score() { 
			return score; 
	}
	
	public static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
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
	    o = new Card(CardName.CouncilRoom,Type.ACTION,5,0,0);
	    ret.add(o);
	    o = new Card(CardName.Cutpurse,Type.ACTION,4,0,2);
	    ret.add(o);
	    o = new Card(CardName.Embargo,Type.ACTION,2,0,2);
	    ret.add(o);
	    o = new Card(CardName.Feast,Type.ACTION,4,0,0);
	    ret.add(o);
	    o = new Card(CardName.Salvager,Type.ACTION,4,0,0);
	    ret.add(o);
	    o = new Card(CardName.GreatHall,Type.ACTION,3,1,0);
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
	    	  System.out.println("Draw cards until 2 treasure cards are revealed. Put the treasure cards into your hand and discard the rest");
	    	  Iterator<Card> temp = player.deck.iterator();
	    	  int treasureCards = 0;
	    	  while(temp.hasNext()){
	    		  Card cur = temp.next();
	    		  if(cur == getCard(state.cards, CardName.Copper) || cur == getCard(state.cards, CardName.Silver) || cur == getCard(state.cards, CardName.Gold)){
	    			 treasureCards++;
	    			 player.hand.add(cur);
	    			 if(treasureCards == 2){
	    				 break;
	    			 }
	    		  } else{
	    			  player.discard(cur);
	    			  temp.remove();
	    		  }
	    	  }
	    	return;
		case Smithy:
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			return;
			
		case Village:
	    	  player.drawCard();
	    	  player.numActions += player.numActions + 2;
			return;
		case Remodel:
			System.out.println("Trash a card and gain a card costing up to 2 more than it");
			int tempCoins = player.hand.get(0).getCost();
			System.out.println(player.hand.get(0) + " Trashed with cost " + tempCoins + ".\n");
			player.hand.remove(0);
			player.coins = player.coins + 2 + tempCoins;
			player.buyCard(state);
			player.numBuys = player.numBuys + 1;
			player.coins = 0;
			return;
		case Ambassador:
			System.out.println("Reveal a card from your hand. Return up to two copies of it from your hamd to the Supply. Give every other player a copy of it.\n");
			return;
		case Baron:
            System.out.println("+4 coins if u discard an Estate.");
            player.numBuys = player.numBuys + 1;
            if(getCard(player.hand, CardName.Estate) != null){
                player.discard(getCard(player.hand, CardName.Estate));
                player.coins = player.coins + 4;
            } 
            else{
            	player.gain(getCard(state.cards, CardName.Estate));
            }
            return;
		case CouncilRoom:
			 player.drawCard();
             player.drawCard();
             player.drawCard();
             player.numBuys++;
             for (Player players : state.players){
                 players.drawCard();
             }
             return;
		case Cutpurse:
			 System.out.println("+2 Coins. Every other player discards Copper.");
             player.coins = player.coins + 2;
             for (Player players : state.players)
             {
                 if(players != player && getCard(players.hand, CardName.Copper) != null) players.discard(getCard(player.hand, CardName.Copper));
             }
             return;

         case Embargo:
             return;

         case Feast:
             System.out.println("Trash this Card. Gain a card costing up to 5 coins.");
             player.playedCards.remove(getCard(player.playedCards, CardName.Feast));
             player.coins = player.coins + 5;
             player.buyCard(state);
             player.numBuys = 1;
             player.coins = 0;
             return;
         case GreatHall:
             System.out.println("+1 Card. +1 Action. Worth 1 VICTORY point.");
             player.drawCard();
             player.numActions++;
             return;
         case Mine:
             System.out.println("Trash a Treasure Card. Gain Next Level of Treasure Card ");
             if(getCard(player.hand, CardName.Silver) != null) {
                 player.hand.remove(getCard(player.hand, CardName.Silver));
                 player.gain(getCard(state.cards, CardName.Gold));
             } 
             else if(getCard(player.hand, CardName.Copper) != null) {
                 player.hand.remove(getCard(player.hand, CardName.Copper));
                 player.gain(getCard(state.cards, CardName.Silver));
             }
             return;
         case Salvager:
        	 System.out.println("Trash a card from your hand gain coins equal to its value. Gain a buy.");
        	 int cost = player.hand.get(0).getCost();
        	 System.out.println(player.hand.get(0) + " Trashed with cost " + cost + ".\n");
        	 player.hand.remove(0);
        	 player.coins = player.coins + cost;
        	 player.numBuys++;
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
	public String toString() {
		return ("\t" + this.getCardName());

	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	@Override
	public int compareTo(Card o) {
//TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}
