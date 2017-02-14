package org.cs362.dominion;

import java.util.*;

public final class Card implements Comparable<Card>, Cloneable{
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province, Duchy, Estate, Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Remodel, Smithy, Village;
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
	private Random gen = new Random();
	
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
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);		
		
		/** The Kingdom cards , it should more than 10 cards*/ 	
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);	
		o = new Card(CardName.Ambassador, Type.ACTION, 3, 0, 0);
		ret.add(o);
		o = new Card(CardName.Baron,Type.ACTION, 4, 0, 0);
        ret.add(o);
		o = new Card(CardName.Council_Room, Type.ACTION, 5, 0, 0);
		ret.add(o);
		o = new Card(CardName.Cutpurse, Type.ACTION, 4, 0, 0);
		ret.add(o);
		o = new Card(CardName.Embargo, Type.ACTION, 2, 0, 0);
		ret.add(o);
		o = new Card(CardName.Feast, Type.ACTION, 4, 0, 0);
		ret.add(o);
		
		//A victory card that is bought from the Supply pile
		o = new Card(CardName.Gardens,Type.VICTORY, 4, 0, 0);
        ret.add(o);
        
        o = new Card(CardName.Great_Hall,Type.ACTION, 3, 1, 0);
        ret.add(o);
        o = new Card(CardName.Mine,Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.Remodel,Type.ACTION, 4, 0, 0);
        ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION, 4, 0, 0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION, 3, 0, 0);
		ret.add(o);
		return ret;
	}
	
	public void play(Player player, GameState state) {
		
		int treasureCount = 2;
		int gardenPoints = 1;
		
		switch(this.cardName) {
		
		case Adventurer:
			
			/*
			 * Iterate through the players deck.  If they find a treasure card (Copper, Silver, or Gold) add them into
			 * their hand, then increase the count.  If they find anything else those cards get discarded.
			 * The ability ends when the player has gain two treasure cards.
			 */
			
			System.out.println("Adventurer was played." + "\n");
	    	  while (treasureCount != 0) {
	    		  Card tCard = player.drawCard();
	    		  if(tCard.getType() != Card.Type.TREASURE) {
	    			  player.discard(tCard);
	    			  continue;
	    		  }
	    		  player.drawCard();
	    		  treasureCount--;
	    	  }
			return;
		
		case Ambassador:
			
			/*
			 * The player reveals a card from their hand (not implemented as of right now), ideally they would  
			 * want to return a Curse card.  Then the player returns two copies of that card back to the supply.
			 * Then every other player gains one copy of it.
			 */
			
			System.out.println("Ambassador was played." + "\n");
			
			//Implement card reveal HERE - Touku
			
			 if(getCard(player.hand, CardName.Curse) != null) {
				 player.hand.remove(getCard(player.hand, CardName.Curse));
				 if(getCard(player.hand, CardName.Curse) != null) {
					 player.hand.remove(getCard(player.hand, CardName.Curse));
					 state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Curse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) + 1);
					 
					 //state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Curse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) + 2);
					 
				 }
				 state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Curse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) + 1);
				 for(Player p:state.players) {
					 if(state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) > 0) {
						 state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Curse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) - 1);
						 if(p != player) {
							 p.gain(getCard(player.hand, CardName.Curse));
							 
						 }
					 }
				 }
			 }
			 else {
				 Card choose = player.hand.get(0);
				 state.gameBoard.put(choose, state.gameBoard.get(choose) + 1);
				 
				 //state.gameBoard.put(choose, state.gameBoard.get(choose) + 2);
				 
				 for(Player p:state.players) {
					 if(p != player) {
						 p.gain(choose);
						 state.gameBoard.put(choose, state.gameBoard.get(choose) - 1);
					 }
				 }
				 player.hand.remove(choose);
				 
			 }
			 return;
		
		case Baron:
			
			/*
			 * The player gains an additional Buy, if they (can?) discard an estate card,
			 * they gain +4 coins.  If no estate cards are discarded the player gains one instead.
			 */
			
			System.out.println("Baron was played." + "\n");
			 player.numBuys++;
			 if(getCard(player.hand, CardName.Estate) != null) {
				 player.discard(getCard(player.hand, CardName.Estate));
				 player.coins = player.coins + 4;
			 }
			 else {
				 player.gain(getCard(state.cards, CardName.Estate));
			 }
			 return;
			 
		case Council_Room:
			
			/*
			 * The player draws 4 cards and gains an additional Buy, then all other
			 * players get to draw a card.
			 */
			
			 System.out.println("Council Room was played." + "\n");
			 player.drawCard();
			 player.drawCard();
			 player.drawCard();
			 player.drawCard();
			 player.numBuys++;
			 for(Player players : state.players) {
				 if(players != player)
					 players.drawCard();
			 }
			 return;
			 
		case Cutpurse:
			
			/*
			 * The play gains 2 coins, then each other player discards a copper card.
			 * If they can't discard a copper card then they have to show their
			 * hands (not currently implemented).
			 */
			
			System.out.println("Cutpurse was played." + "\n");
			player.coins = player.coins + 2;
			for(Player players : state.players) {
				if(players != player && getCard(players.hand, CardName.Copper) != null) {
					players.discard(getCard(player.hand, CardName.Copper));
				}
				
				//Implement reveal here - Touku
				
			}
			return;
			
		case Embargo:
			
			/*
			 * The player gains two coins, after being played Embargo is trashed.
			 * Once trashed the player can put an Embargo Token on top of a Supply
			 * pile, if a player buys a card from that pile they gain a Curse card
			 * per token on that pile
			 */
			
			System.out.println("Embargo was p]layed." + "\n");
			player.coins = player.coins + 2;
			player.playedCards.remove(getCard(player.playedCards, CardName.Embargo));
			
			//need to include a way to generate random numbers before hand ^^^
			/*int randToken = gen.nextInt(10);
			int card = 0;
			for(Card c : filter(state.cards, Type.ACTION)) {
				if(card == randToken) {
					GameState.addEmbargo(c);
				}
			}
			*/
			
			return;
			
		case Feast:
			System.out.println("The player trashes this card");
			System.out.println("The player gain a card costing up to 5 Gold");
			player.playedCards.remove(getCard(player.playedCards, CardName.Feast));
			
			//buy a card >= 5 coins
			
			player.coins = player.coins + 5;
			return;
		
		case Gardens:
			System.out.println("Worth 1 victory point per 10 cards you have. (rounded down)");
			gardenPoints = player.deck.size() / 10;
			
			return;
		
		case Great_Hall:
			
			/*
			 * Player draws one card, and gains an additional Action.
			 */
			
			System.out.println("=Great Hall was played." + "\n");
			player.drawCard();
			player.numActions = player.numActions + 1;
			//also worth one victory point
			return;
		
		case Mine:
			
			/*
			 * Strategically if the player has a silver in hand it would be best to trade it for gold rather than trading a copper for 
			 *a silver first. The worse case is having only a gold in hand and trading it for another gold...
			 */
			
			System.out.println("Mine was played." + "\n");
			for(int i = 0; i < player.hand.size(); i++) {
				Card isTreasure = player.hand.get(i);
				if(isTreasure.realType == Type.TREASURE) {
					if(isTreasure.cardName == CardName.Copper) {
						player.discard(isTreasure);
						player.hand.add(getCard(state.cards, CardName.Silver));
						return;
					}
					else if(isTreasure.cardName == CardName.Silver) {
						player.discard(isTreasure);
						player.hand.add(getCard(state.cards, CardName.Gold));
						return;
					}
				}
			}
	
			return;
			
		case Remodel:
			System.out.println("The player trashes a card from their hand");
			System.out.println("The player gains a card costing up to 2 coins more than it.");
			
			Card reCard = player.hand.get(0);
			int rePrice = reCard.cost;
			player.hand.remove(0);
			for(int j = 0; j < state.cards.size(); j++) {
				if(state.cards.get(j).cost <= rePrice + 2) {
					player.gain(state.cards.get(j));
					return;
				}
			}
			
			//player.hand.remove(index)
			
			return;
			
		case Smithy:
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			return;
			
		case Village:
			
			/*
			 * Player draws one card, and gains two additional Action.
			 */
			
	    	  System.out.println("Village was played." + "\n");
	    	  player.drawCard();
	    	  player.numActions = player.numActions + 2;
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
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}
