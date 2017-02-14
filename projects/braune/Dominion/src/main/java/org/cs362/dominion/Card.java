	package org.cs362.dominion;
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
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Salvager, Smithy, Village;
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (copper, silver, and gold cards)
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
		o = new Card(CardName.Province, Type.VICTORY, 8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy, Type.VICTORY, 5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate, Type.VICTORY, 2, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Curse, Type.VICTORY, 0, -1, 0);
		ret.add(o);

		/** The Kingdom cards , there should be more than 10 cards*/
		o = new Card(CardName.Adventurer, Type.ACTION, 6, 0, 0);
		ret.add(o);
		o = new Card(CardName.Ambassador, Type.ACTION, 3, 0, 0);
		ret.add(o);
		o = new Card(CardName.Baron, Type.ACTION, 4, 2, 0);		// Bug -- Baron is worth 2 VP
		ret.add(o);
		o = new Card(CardName.Council_Room, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Cutpurse, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Embargo, Type.ACTION, 2, 0, 0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION, 4, 0, 3);		// Bug -- Feast is worth 3 coins
		ret.add(o);
		o = new Card(CardName.Gardens, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Great_Hall, Type.ACTION, 3, 1, 0);
		ret.add(o);
		o = new Card(CardName.Mine, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Salvager, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Smithy, Type.ACTION, 4, 0, 0);
		ret.add(o);	
		o = new Card(CardName.Village, Type.ACTION, 3, 0, 0);
		ret.add(o);

		return ret;
	}

	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
	    	System.out.println("Reveal cards from your deck until you reveal 2 Treasure cards. " +
	    		"Put those Treasure cards into your hand and discard the other revealed cards.");

			int treasureCount = 0;

			for(int i = 0; i < player.deck.size(); i++){
				Card current = player.deck.get(i);
				System.out.println("Revealing " + current.toString());
				if(current.getCardName() == CardName.Copper || current.getCardName() == CardName.Silver || current.getCardName() == CardName.Gold){
					player.hand.add(player.deck.get(i));
					treasureCount += 1;
				}
				else{
					player.discard(player.deck.get(i));
				}
				if(treasureCount == 2){
					break;
				}
			}

			return;

		case Ambassador:
			System.out.println("Reveal a card from your hand." + "Return up to 2 copies of it from your hand to the Supply." + "Then each other player gains a copy of it.");
	        player.coins += 2;
	        // Bug -- not intended behavior

			return;
			
		case Baron:
			System.out.println("+1 Buy" + "You may discard an Estate for +4." + "If you don't, gain an Estate.");
	        player.numBuys += 1;

	        if(getCard(player.hand, CardName.Estate) != null){
	        	player.discard(getCard(player.hand, CardName.Estate));
	        	player.coins += 4;
	        }
	        else{
	        	player.gain(getCard(state.cards, CardName.Estate));
	        }
	        
			return;
	
		case Council_Room:
			System.out.println("+4 Cards." + "+1 Buy" + "Each other player draws a card.");
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.numBuys += 1;

			for(Player p : state.players){
				p.drawCard();
			}
				        
			return;
			
		case Cutpurse:
			System.out.println("+2" + "Each other player discards a Copper card (or reveals a hand with no Copper)");
	        
	        player.coins += 2;

	        String playerID = player.toString();
	        for(Player p : state.players){
	        	if(p.toString() != playerID){
	        		if(getCard(p.hand, CardName.Copper) != null){
	        			p.discard(getCard(p.hand, CardName.Copper));
	        		}
	        		else{
	        			for(int i = 0; i < p.hand.size(); i++){
	        				Card current = p.hand.get(i);
	        				System.out.println("Revealing " + current.toString());
	        			}
	        		}
	        	}
	        }

			return;
		
		case Embargo:
			System.out.println("+2" + "Trash this card.  Put an Embargo token on top of a Supply pile." + "When a player buys a card, he gains a Curse card per Embargo token on that pile.");
	        
			player.coins += 2;
			player.playedCards.remove(getCard(player.playedCards, CardName.Embargo));
			// Bug -- no embargo token

			return;
			
		case Feast:
			System.out.println("Trash this card." + "Gain a card costing up to 5");

			player.playedCards.remove(getCard(player.playedCards, CardName.Feast));
			for(int i = 0; i < state.cards.size(); i++){
				if(state.cards.get(i).getCost() < 6){
					player.gain(state.cards.get(i));
					state.cards.remove(state.cards.get(i));
					break;
				}
			}
	        
			return;
			
		case Gardens:
			System.out.println("Worth 1 victory point per 10 cards you have (round down)");
			// Bug -- not worth victory points
	        
			return;
			
		case Great_Hall:
			System.out.println("+1 Card." + "+1 Action");
			player.drawCard();
			player.numActions += 1;
	        
			return;
			
		case Mine:
			System.out.println("You may trash a Treasure from your hand." + "Gain a Treasure to your hand costing up to 3 more than it.");

			if(getCard(player.hand, CardName.Copper) != null){
				player.hand.remove(getCard(player.hand, CardName.Copper));
				player.gain(getCard(state.cards, CardName.Silver));
				state.cards.remove(getCard(state.cards, CardName.Silver));	
			}
			else if(getCard(player.hand, CardName.Silver) != null){
				player.hand.remove(getCard(player.hand, CardName.Silver));
				player.gain(getCard(state.cards, CardName.Gold));
				state.cards.remove(getCard(state.cards, CardName.Gold));	
			}
	        
			return;
			
		case Salvager:
			System.out.println("+1 Buy" + "Trash a card from your hand. Gain coins equal to its cost");

			player.numBuys += 1;
			Card card = player.hand.get(0);
			player.coins += card.getCost();
			player.hand.remove(card);
	        
			return;
		
		case Smithy:
			System.out.println("+3 Cards");

	        player.drawCard();
	        player.drawCard();
	        player.drawCard();

			return;
			
		case Village:
	    	System.out.println("+1 Card");
	    	System.out.println("+2 Actions");

	    	player.drawCard();
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

		sb.append(" \n\t" + this.getCardName());
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

	//@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}
