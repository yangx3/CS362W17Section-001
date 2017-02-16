package org.cs362.dominion;
import java.util.*;
import java.util.LinkedList;
import java.util.List;


public final class Card implements Comparable<Card>{
	public static enum Type{
		ACTION, TREASURE, VICTORY;
	}
	
	public static enum CardName {
		//Treasure Cards
		Gold, Silver, Copper,
		//Victory Cards
		Province, Duchy, Estate, Curse,
		//Kingdom Cards
		Adventurer, Ambassador, Baron, CouncilRoom, Cutpurse, Embargo, Feast, Gardens, 
		GreatHall, Mine, Smithy, Village, Laboratory;
	}
	
	private Random generator = new Random();
	private final Type realType;
	private final CardName cardName;
	private int cost, score, treasureValue;
	
	private Card(CardName cardName, Type type, int cost, int score, int treasureValue){
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
	public int getScore() {
		return score;
	}
	public int getTreasureValue() {
		return treasureValue;
	}
	
	public static List<Card> createCards(){
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
		
		/** The Kingdom cards , it should more than 10 cards*/ 			
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
				
		o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);		
		
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
				
		o = new Card(CardName.CouncilRoom,Type.ACTION,5,0,0);
		ret.add(o);
				
		o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0);
		ret.add(o);		
		
		o = new Card(CardName.Embargo,Type.ACTION,2,0,0);
		ret.add(o);
				
		o = new Card(CardName.Feast,Type.ACTION,4,0,0);
		ret.add(o);
				
		o = new Card(CardName.Gardens,Type.ACTION,4,0,0);
		ret.add(o);
				
		o = new Card(CardName.GreatHall,Type.ACTION,3,1,0);
		ret.add(o);
				
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);
		
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);
		
		o = new Card(CardName.Laboratory,Type.ACTION,5,0,0);
		ret.add(o);
	
		return ret;		
	}
	
public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.

	    	  int numTreasureDraws = 0;
	    	  Iterator<Card> temp = player.deck.iterator();
	    	  
	    	  while (temp.hasNext()) {
	    		  Card c = temp.next();
	    		  if(c == getCard(state.cards, CardName.Gold) || c == getCard(state.cards, CardName.Silver) || c == getCard(state.cards, CardName.Copper)){
	    			  numTreasureDraws += 1;
	    			  player.hand.add(c);
	    			  temp.remove();
	    			  if(numTreasureDraws >= 2)
	    				  break;
	    		  }
	    		  else player.discard(c);
	    		  
	    	  }
	    	  return;

		
		
		case Ambassador:
			//Cost $3, Reveal a card from your hand, and return up to 2 copies of it to the supply. Then each other player gains a copy
			
			if(player.hand.size() > 0) {
				Card c = player.hand.get(1);
				player.hand.remove(c);
				
				for (Player other_players : state.players) {
					if (other_players != player){
						other_players.gain(c);
					}
				}
			}
			
			
			return;
			
		case Baron:
			//Cost $4. +1 Buy. You may discard an estate card. If you do, +$4. Otherwise gain an estate card.
			
			if(getCard(player.hand, CardName.Estate) != null) {
				player.discard(getCard(player.hand, CardName.Estate));
				player.coins +=4;
				
			}
			else
				player.gain(getCard(state.cards, CardName.Estate));
			return;
			
		case CouncilRoom:
			//Cost: $5, +4 cards. +1 buy. Each other player draws a card.
			
			
			for (int i = 0; i < 3; i++) {
				player.drawCard();
			}
			player.numBuys++;
			for (Player players : state.players){
				players.drawCard();
			}
			return;
			
		case Cutpurse:
			//Cost: $4, +$2. Each other player discards a copper card (or reveals a hand w/ no copper)
			
			player.coins += 2;
			
			for (Player players : state.players){
				if(players == player); //do nothing
				else {
					if(getCard(players.hand, CardName.Copper) != null)
						players.discard(getCard(players.hand, CardName.Copper));
				}
					
			}
			return;
			
		case Embargo:
			//Cost: $2, Trash this card. Put an embargo token on top of a supply pile. When a player buys that card he gains a curse card per embargo token on that pile.
			
			player.coins += 2;		
			player.playedCards.remove(getCard(player.playedCards, CardName.Embargo));	

			return;
			
		case Feast:
			//Cost: $4. Trash this card. Gain a card costing up to $5.

			player.coins +=5;
			player.numBuys++;
		case Gardens:
			//Costs: $4. Worth 1 victory point for every 10 cards in your deck (rounded down)
			//Done in player.scoreFor() at end of game
			return;
			
		case GreatHall:
			//+1 VICTORY point. +1 Card. +1 Action
			
			//Victory point already accounted for
			player.drawCard();
			player.numActions++;
			return;
			
		case Laboratory:
			//+2 cards, +1 action
			
			player.drawCard();
			player.drawCard();
			player.numActions++;
			return;
			
		case Mine:
			//Cost: $5. Trash a treasure card from your hand. Gain a treasure card costing up to $3 more. Put it in your hand
			
			if(getCard(player.hand, CardName.Copper) != null){
				player.hand.remove(getCard(player.hand, CardName.Copper));
				player.hand.add(getCard(state.cards, CardName.Silver));
			}
			else if(getCard(player.hand, CardName.Silver) != null){
				player.hand.remove(getCard(player.hand, CardName.Silver));
				player.hand.add(getCard(state.cards, CardName.Gold));
			}
			else if(getCard(player.hand, CardName.Gold) != null){ //Not sure if necessary to discard gold
				player.hand.remove(getCard(player.hand, CardName.Gold));
				player.hand.add(getCard(state.cards, CardName.Gold));
			}
			return;
			
		case Smithy:
			//Cost: $4. +3 Cards
			
			player.drawCard();
			player.drawCard();
			player.drawCard();
			return;
			
		case Village:
			//Cost: $3. +1 Card. +2 Actions
			
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

	@Override
	public int compareTo(Card o) {
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 
}
