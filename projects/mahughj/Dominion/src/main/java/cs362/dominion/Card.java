package cs362.dominion;
//package org.cs362.dominion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public final class Card implements Comparable<Card>, Cloneable{
	public static enum Type {
		ACTION, TREASURE, VICTORY, ACTION_ATTACK, ACTION_VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse, Gardens,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Great_Hall, Mine, Salvager, Smithy, Tribute, Village;
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
		o = new Card(CardName.Gardens,Type.VICTORY,		4, 0, 0);
		ret.add(o);
		
		/** The Kingdom cards , it should more than 10 cards*/
		/**Implemented Gardens, so 12 action cards with Gardens being the 13th Kingdom card*/
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);			
		o = new Card(CardName.Ambassador,Type.ACTION_ATTACK,3,0,0);
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
		o = new Card(CardName.Great_Hall,Type.ACTION_VICTORY,3,0,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);	
		o = new Card(CardName.Salvager,Type.ACTION,4,0,0);
		ret.add(o);		
		return ret;
	}
	
	public void play(Player player, GameState state) {
		player.discard.add(this);
		player.hand.remove(this);
		switch(this.cardName) {
		case Adventurer:
	    	  boolean fir = false, sec = false;
	    	  do {
	    		  Card chk1 = player.drawCard();
	    		  if (chk1.getType() != Card.Type.TREASURE){
	    			  player.discard(chk1);
	    		  } else {
	    			  fir = true;
	    		  }
	    	  } while (fir == false);
	    	  
	    	  do {
	    		  Card chk2 = player.drawCard();
	    		  if (chk2.getType() != Card.Type.TREASURE){
	    			  player.discard(chk2);
	    		  } else {
	    			  sec = true;
	    		  }
	    	  } while (sec == false);
	    	  
			return;
		case Smithy:
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
	         player.drawCard(); //Oh no! An error! Whatever shall I do?
	         //TODO: fix this
			return;
			
		case Village:
	    	  player.drawCard();
	    	  player.plusAction();
	    	  player.plusAction();
			return;
		
		case Ambassador:
			//This algorithm will prioritize curses, because that's just good strat right there
			Card ret = null;
			boolean fnd = false;
			for (Card c: player.hand) {
				if (c.getCardName().toString() == "Curse") {
					ret = c;
					fnd = true;
				}
			}
			if (fnd == false){
				ret = player.hand.get(0);
			}
			System.out.println("Hand size 1: " + player.hand.size());
			player.retCard(ret);
			System.out.println("Hand size 2: " + player.hand.size());
			
			for (Card c : player.hand) {
				System.out.println("Hunting for dupes of " + c.getCardName().toString());
				if (c == ret) {
					System.out.println("Hand size 3: " + player.hand.size());
					System.out.println("Found one!");
					player.retCard(c);
					System.out.println("Hand size 4: " + player.hand.size());
					break;
				}
			}
			List<Player> l = state.getOtherPlayers(player);
			for (Player p : l) {
				p.gain(ret);
			}
			return;
			
		case Baron:
			player.plusBuy();
			if (player.contains("Estate")){
				Card o = player.getContainedCard("Estate");
				player.discard(o);
				player.plusCoins(4);
			} else {
				if (state.isPileEmp("Estate")){
					player.gain(getCard(state.cards, "Estate"));
				}
			}
			return;
			
		case Council_Room:
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.plusBuy();
			//Init q as player list
			List<Player> q = state.getOtherPlayers(player);
			int i = q.size();
			for (int j = 0; j < i; j++) {
				Player drw = q.get(j);
				drw.drawCard();
			}
			return;
			
		case Cutpurse:
			player.plusCoins(4); //Whoops! this should probably be 2 coins...
			//TODO: Fix this
			List<Player> otp = state.getOtherPlayers(player);
			int i2 = otp.size();
			for (int j = 0; j < i2; j++){
				Player atk = otp.get(j);
				if (atk.contains("Copper")) {
					Card rmvd = atk.getContainedCard("Copper");
					atk.discard(rmvd);
				} else {
					atk.revealAll();
				}
			}
			// for each player in other players, if possible discard a copper else print hand
			return;
			
		case Embargo:
			//TODO: Embargo doesn't trash itself! Oh no!
			player.plusCoins(2);
			Card c = state.randomCard(12);
			state.embargo(c);
			System.out.println("Embargoed " + c.getCardName().toString());
			//special Embargo function - add a token to a supply pile; when that pile is bought from next, that player gains a curse per token
			return;
			
		case Feast:
			player.trash(this);
			player.gain(state.randomCard(5));
			return;
			
		case Great_Hall:
			player.drawCard();
			player.plusAction();
			return;
			
			
		case Mine:			
			if (player.contains("Copper") && state.isPileEmp("Silver")){
				Card x = player.getContainedCard("Copper");
				player.trash(x);
				Card o = getCard(state.cards, "Silver");
				player.gainToHand(o);
			} else if (player.contains("Silver") && state.isPileEmp("Gold")){
				Card x = player.getContainedCard("Silver");
				player.trash(x);
				Card o = getCard(state.cards, "Gold");
				player.gainToHand(o);
			}
			return;
			
		case Salvager:
			player.plusBuy();
			Card o = player.trashRandomCard();
			int morcoyn = o.getCost();
			player.plusCoins(morcoyn);
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
	
	public static Card getCard(List<Card> cards, String cardName) {
		for(int i=0; i < cards.size(); i++){
			if (cards.get(i).getCardName().toString() == cardName) {
				return cards.get(i);
			}
		}
		return null;
	}
	
		public static Type toEnumType(String s) {
			if (s == "Action") {
				return Card.Type.ACTION;
			} else if (s == "Action-Attack") {
				return Card.Type.ACTION_ATTACK;
			} else if (s == "Action-Victory") {
				return Card.Type.ACTION_VICTORY;
			} else if (s == "Victory") {
				return Card.Type.VICTORY;
			} else if (s == "Treasure") {
				return Card.Type.TREASURE;
			}
			return null;
		}
	
/*	   public static List<Card> filte(Iterable<Card> cards, List<Type> targets) {
		      List<Card> out = new ArrayList<Card>();
		      for (Card c : cards)
		         if (targets.contains(c))
		            out.add(c);
		      return out;
		   }*/
	   
	   public static List<Card> filter(Iterable<Card> cards, String[] types) {
		      List<Card> out = new ArrayList<Card>();
		      for (String i : types) {
		    	  for (Card c : cards) {
		    		  if (c.getType() == Card.toEnumType(i)){
		    			  out.add(c);
		    		  }
		    	  }
		      }
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
