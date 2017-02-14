package org.cs362.dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;


public final class Card implements Comparable<Card>{
	public enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Smithy, Steward, Village;
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
  
	public static int countCardName (List<Card> cards, CardName cardName) {
		int count = 0;
		for(int i = 0; i < cards.size(); i++)
			if(cards.get(i).getCardName().equals(cardName))
				count++;
		return count;
	}
	
	public int getCost() { return cost; }
	public int getTreasureValue() { return treasureValue; }
	public int getScore() {return score;}
	public int score(Player player) { return score; }
	
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
		o = new Card(CardName.Province,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0); //score should be 1, not 2
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
		o = new Card(CardName.Council_Room,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo,Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Feast,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Gardens,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall,Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Steward,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	
		return ret;
	}
	
	public void play(Player player, GameState state) {
		String currPlayer=player.player_username; 
		CardName currCardName=cardName;
	    if(player.hand.size() > 0) {
	    	currCardName = player.hand.get(0).getCardName();
	    }
		Card currCard=getCard(player.hand, currCardName);
		switch(this.cardName) {
		case Adventurer:
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
			int tCount = 0;
			//Traverse through the deck until tCount = 2. With each increment of tCount, add that Treasure card to the hand pile and discard the other cards.
			for(int i = 0; i < player.deck.size(); i++) {
			    if(player.deck.get(i).getType().equals(Type.TREASURE)) {
			    	player.hand.add(player.deck.remove(i));	
			    	tCount++;
			    	if(tCount == 2)
			    		break;
			    }
			    else
			    	player.discard.add(player.deck.remove(i));
			}
			return;
			
		case Ambassador:
			//Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it. (3; Action - Attack)
		    int returned = 0;
		    for(int i = 0; i < player.hand.size(); i++) {    	
			    if(player.hand.get(i).getCardName().equals(currCardName)) {
			        player.hand.remove(i);
			    	Card ckey = Card.getCard(state.cards, currCardName);
			    	int n = state.gameBoard.get(ckey) + 1; 
			    	state.gameBoard.put(ckey, n);
				    returned++;
				    if(returned == 2) 
				        break;
			        }
		        
		    }
		    //for the other players, add the revealed card to their discard, subtract from supply.
		    for(int i = 0; i < state.players.size(); i++) {
		    	if(!state.players.get(i).player_username.equals(currPlayer)) {
		    		Card ckey = Card.getCard(state.cards, currCardName);
		    		int left = state.gameBoard.get(ckey); 
		    		if(left > 0) {
		    		    state.players.get(i).discard.add(currCard);
			    	    int n = state.gameBoard.get(ckey) - 1; 
			    	    state.gameBoard.put(ckey, n);
		    		}
		    		else
		    			break;
		    	}
		    }
			return;
		    
		case Baron: 
			//+1 Buy. You may discard an Estate card. If you do, +4 for next buy. Otherwise, gain an Estate card. (4; Action)
			boolean discarded = false;
			player.numBuys++;
		    for(int i = 0; i < player.hand.size(); i++) {
			    if(player.hand.get(i).getCardName().equals(CardName.Estate)) {
					player.discard.add(player.hand.remove(i));
					player.coins = player.coins + 4;
					discarded = true;
					break;
				}
		    }
			if(discarded == false) {
			    int numCards = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate));
			    Card ckey = Card.getCard(state.cards, CardName.Estate);
			    if(numCards > 0) {
			    	player.deck.add(Card.getCard(state.cards, Card.CardName.Estate));
			    	int n = numCards - 1; 
			    	state.gameBoard.put(ckey, n);
			    }
			}	
			return; 
		
		case Council_Room:
			//+4 Cards. +1 Buy. Each other player draws a card. (5; Action)
			 player.drawCard();
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
	         //player.numBuys++;
	         for(int i = 0; i < state.players.size(); i++) 
	        		if(!state.players.get(i).player_username.equals(currPlayer))
	        			state.players.get(i).drawCard();
			return;
			
		case Cutpurse:
			//+2 for next buy. Each other player discards a Copper card (or reveals a hand with no Copper). (4; Action - Attack)
		    boolean flag = true;
			player.coins++;
			player.coins++;
		    for(int i = 0; i < state.players.size(); i++) {
		    	if(!state.players.get(i).player_username.equals(currPlayer))
		    		for(int j = 0; j < state.players.get(i).hand.size(); j++) {
						if(state.players.get(i).hand.get(j).getCardName().equals(CardName.Copper)) {
							state.players.get(i).discard.add(state.players.get(i).hand.remove(j));
							flag = true;
							break;
						}
						flag = false;
		    		}
		    	if(flag == false)
		    		 System.out.println(state.players.get(i).player_username + "does not have Copper.");
		    	
		    }
			return;
			
		case Embargo:
			//+2 for next buy. Trash this card. Put an Embargo token on top of a Supply pile. When a player buys a card, he gains a Curse card per Embargo token on that pile. (2; Action)
			//player.coins++;
			player.coins++;
			//increment embargo token for that supply pile (cards)
			for(Map.Entry<Card, Integer> key: state.gameBoard.entrySet()) {
				if(key.getValue() > 0) {
		    	    int tokens = state.supplyEmbargo.get(key.getKey()) + 1; 
		    	    state.supplyEmbargo.put(key.getKey(), tokens);
		    	    break;
				}
			}
			//add a function that checks for the embargo token (in the buy function), if the player buys that from a supply with and embargo token, add a curse card to the player's discard as well. 
			return;
		
		case Feast: 
			//Trash this card. Gain a card costing up to +5. (4; Action)
			int cVal = 5;
			for(Map.Entry<Card, Integer> key: state.gameBoard.entrySet()) {
				 if(key.getValue() > 0) {
				    if(key.getKey().cost <= cVal){
			    	    player.discard.add(Card.getCard(state.cards, key.getKey().cardName)); //should be player.deck
			    	    int n = state.gameBoard.get(key.getKey()) - 1; 
					    state.gameBoard.put(key.getKey(), n);
					    break;
			        }
				 }
			}
			
			return;
			
		case Gardens: 
			//Worth 1 VP for ever 10 cards in your deck, rounded down. (4; Victory)
			//Applies when final score is calculated
			return;
			
		case Great_Hall:
			//+1 Card. +1 Action. +1 VP. (3; Action - Victory)
			player.drawCard();
			player.numActions++;
			return;
			
		case Mine: 
			//Trash a Treasure card from your hand. Gain a Treasure card costing up to +3 more; put it into your hand. (5; Action)
			Card temp = null;
			for(int i = 0; i < player.hand.size(); i++) {
				if(player.hand.get(i).getType().equals(Type.TREASURE)) {
					temp = player.hand.remove(i);
					break;
				}
				else 
					return; //return if no treasure cards to trash
			}
			int tVal = temp.getCost() + 3;
			for(Map.Entry<Card, Integer> key: state.gameBoard.entrySet()) {
				if(key.getValue() > 0) {    
				    if(key.getKey().cost <= tVal && key.getKey().treasureValue >= 1){
			    	    player.hand.add(Card.getCard(state.cards, key.getKey().cardName));
			    	    int n = state.gameBoard.get(key.getKey()) - 1; 
					    state.gameBoard.put(key.getKey(), n);
					    System.out.println("Player has gained" + key.getKey() + "\n");
					    break;
				    }
			    }
			}
			return;
			
		case Smithy:
			//+3 Cards. (4; Action)
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			return;
		
		case Steward: 
			//Choose one: +2 Cards, or +2 next buy, or trash 2 cards from your hand. (3; Action)
			Random rand = new Random();
			int num = rand.nextInt(3) + 1;
			if(num == 1) {
				player.drawCard();
				player.drawCard();
			}
			else if(num == 2) {
				player.coins++;
				player.coins++;
			}
			else if(num == 3) {
				for(int i = 0; i < 2; i++)
				    if(player.hand.size() > 0)
				    	player.hand.remove(i);
			}
			return;
	
		case Village:
			//+1 Card. +2 Actions. (3; Action)
	    	  player.drawCard();
	    	  //player.numActions++;
	    	  player.numActions++;
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
