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
		Gold, Silver, Cooper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_room, Cutpurse, Embargo, Feast, Gardens, Great_hall, Mine, Smithy, Village, Tribute;
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
		o = new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1);
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
		//Adventurer, Ambassador, Baron, Council_room, Cutpurse, Embargo, Feast, Gardens, Great_hall, Mine, Smithy, Village, Tribute;
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Council_room,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo,Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Feast,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Gardens,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Great_hall,Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Tribute,Type.ACTION,5,0,0);
		return ret;
	}
	
	public void play(Player player, GameState state, int choice1, int choice2) {
		Card x;
		int y = 0;
		System.out.println("Player "+player.player_username+" plays "+this.cardName);
		switch(this.cardName) {
		case Adventurer:
		int numTreasure = 0;
			Card toDraw = null;
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
			while(true) {
				toDraw = player.deck.poll();
				if (toDraw.getCardName() == Card.CardName.Cooper) {
					numTreasure++;
					player.hand.add(toDraw);
				}
				else if (toDraw.getCardName() == Card.CardName.Silver) {
					numTreasure++;
					player.hand.add(toDraw);
				}
				else if (toDraw.getCardName() == Card.CardName.Gold) {
					numTreasure++;
					player.hand.add(toDraw);
				}
				else {
					player.discard.add(toDraw);
				}
				if (numTreasure == 2) {
					break;
				}
			}
			return;
		case Ambassador:		//done
			//reveals a card from your hand. Return up to two copies of it from your hand to the supply. Then each player gains a copy of it.
			System.out.println(String.format("Player %s reveals his card number %d", player.player_username,choice1));
			x = player.hand.get(choice1);
			y = state.gameBoard.get(x);
			y = y+ choice2;
			state.gameBoard.put(x, y);
			for (int i = 0; i < choice2; i++) {
				player.hand.remove(x);
			}
			for (Player playerx: state.players) {
				playerx.gain(x);
				y = state.gameBoard.get(x);
				y--;
				state.gameBoard.put(x, y);
				/*if (y == 0) {			//this section will be a bug for the homework
					break;
				} */
			}
			
			return;
		case Baron:			//done
			player.modifyBuy(1);
			if (choice1 == 1) { // discard estate
					player.discard(Card.getCard(state.cards, Card.CardName.Estate));
					player.modifyCoins(4);
				}
			else {
				player.gain(Card.getCard(state.cards, Card.CardName.Estate));
				y = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Estate));
				y--;
				state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Estate), y);
			}
			// +1 buy. you may discard an estate for +4 gold. If you don't, gain an Estate.
			return;
		case Council_room:		//done
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.drawCard(); // this is a bug, the player will draw 5 cards instead
			player.modifyBuy(1);
			for (Player playerx : state.players) {
				playerx.drawCard();
			}
			// +4 cards, +1 buy, each other player draws a card
			return;
		case Cutpurse:  //done
			player.modifyCoins(2);
			for (Player playerx: state.players) {
				if (playerx.player_username != player.player_username) {
					for(int i = 0; i < playerx.hand.size(); i++) {
						if (playerx.hand.get(i).getCardName() == Card.CardName.Cooper) {
							playerx.discard(Card.getCard(state.cards,Card.CardName.Cooper));
							break;
						}
					}
					for(int i = 0; i < playerx.hand.size(); i++) {
						System.out.println(String.format("Player %s reveals his card number %d",player.player_username,i));
					}
				}
			}
			//+2 gold, each other player discards a Copper card (or reveals a hand with no copper.
			return;
		case Embargo:
			player.modifyCoins(2);
			player.hand.remove(Card.getCard(state.cards, Card.CardName.Embargo));
			state.embargo = choice1;
			//+2 trash this card. Put an Embargo token on top of a supply pile. When a player buys a card, he gains a curse card per embargo token on that pile.
							//bug = the curse card is not given to the players
			return;
		case Feast:		//done
			player.hand.remove(Card.getCard(state.cards, Card.CardName.Feast));
			/*for(int i; i < player.hand.size(); i++) {
				if (player.hand.get(i).getCardName() == "Feast") {
					player.hand.remove(i);
					break;
				}
			} */
			int tempcoins = player.coins;
			player.coins = 5;
			player.buyCard(state, null);
			player.coins = tempcoins;	
			//Trash this card. Gain a card costing up to 5 gold.
			return;
		case Gardens:			//done
			player.modifyAction(1);
			// Worth 1 victory point per 10 card you have.
			return;
		case Great_hall:
			// +1 card, +1 action, 1 victory points
			player.drawCard();
			player.modifyAction(1);
			return;
		case Mine:			//done
			int z;
			// you may trash a treasure from your hand. Gain a treasure to your hand costing up to 3 gold more than it.
			if (choice1 == 1) {		//better code
				player.hand.remove(Card.getCard(state.cards, Card.CardName.Cooper));
				player.gain(Card.getCard(state.cards, Card.CardName.Silver));
				z = state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Silver));
				z--;
				state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Silver), z);
			}
			else if (choice1 == 2) {
				player.hand.remove(Card.getCard(state.cards, Card.CardName.Silver));
				player.gain(Card.getCard(state.cards, Card.CardName.Gold));
				z = state.gameBoard.get(Card.getCard(state.cards, CardName.Gold));
				z--;
				state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Gold), z);
			}

			return;
		case Tribute:
			//Card x;
			
			for(int i = 0; i < state.players.size(); i++) {
				if(state.players.get(i).player_username == player.player_username) {
					if(i == (state.players.size() - 1)) {
						if (state.players.get(0).deck.size() >0 ) {
						x = state.players.get(0).deck.poll();
						if(x.realType == Type.ACTION) {
							player.modifyAction(2);
						}
						else if(x.realType == Type.TREASURE) {
							player.modifyCoins(2);
						}
						else if(x.realType == Type.VICTORY) {
							player.drawCard();
							player.drawCard();
						}
						state.players.get(0).discard.add(x);
						}
						if (state.players.get(0).deck.size() >0 ) {
						x = state.players.get(0).deck.poll();
						if(x.realType == Type.ACTION) {
							player.modifyAction(2);
						}
						else if(x.realType == Type.TREASURE) {
							player.modifyCoins(2);
						}
						else if(x.realType == Type.VICTORY) {
							player.drawCard();
							player.drawCard();
						}
						state.players.get(0).discard.add(x);
						}
					}
					else {
						if (state.players.get(i).deck.size() >0 ) {
						x = state.players.get(i).deck.poll();
						if(x.realType == Type.ACTION) {
							player.modifyAction(2);
						}
						else if(x.realType == Type.TREASURE) {
							player.modifyCoins(2);
						}
						else if(x.realType == Type.VICTORY) {
							player.drawCard();
							player.drawCard();
						}
						state.players.get(i).discard.add(x);
						}
						if (state.players.get(i).deck.size() >0 ) {
						x = state.players.get(i).deck.poll();
						if(x.realType == Type.ACTION) {
							player.modifyAction(2);
						}
						else if(x.realType == Type.TREASURE) {
							player.modifyCoins(2);
						}
						else if(x.realType == Type.VICTORY) {
							player.drawCard();
							player.drawCard();
						}
						state.players.get(i).discard.add(x);
						}
					}
					break;
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
			player.modifyAction(2); //bug: only adds 2 but the program adds 3
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
