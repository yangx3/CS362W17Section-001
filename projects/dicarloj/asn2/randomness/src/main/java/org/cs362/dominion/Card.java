package org.cs362.dominion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//import Card.Type;



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
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Remodle, Smithy, Village;
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
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
//
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
		o = new Card(CardName.Gardens,Type.VICTORY,4,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall,Type.ACTION,3,1,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Remodle,Type.ACTION,4,0,0);
		ret.add(o);
//
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	
		return ret;
	}
	
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
			System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
		  			"Put those Treasure cards into player hand and discard the other revealed cards.");
			System.out.println("\n[Adventurer]");
			System.out.println(player.player_username);
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
			  	int count = 0;
			  	int breac = 0;
			  	int trig = player.discard.size()+player.deck.size();
			  	while (count < 2 ) {
			  		breac += 1;
			  		Card tempCard =  player.drawCard();
			  		if (tempCard.realType != Type.TREASURE){
			  			player.discard(tempCard);
			  		}else{count = count + 2;}// intentional Bug
			  		if (breac == trig){
			  			System.out.println("Not enoughf Treasure in your deck");
			  			break;}
			  	}
			  //	System.out.println("TODO Adventurer Code******************************************");
			  	
		
			return;

		case Ambassador:
			System.out.println("\n[Ambassador]");
			System.out.println(player.player_username);
			if (player.hand.size()>0){
				Card c = null;
				Card cs = this.getCard(state.cards, Card.CardName.Curse);
				List<Card> temHand = new ArrayList<Card>(player.hand);
				if(temHand.contains(cs))
					c = (Card)cs;
				else {
					for(Card c2 : temHand){
							c = c2;
							break;
					}
				}
				
				player.hand.remove(c);
				System.out.println("Put "+ c +" into supply");
				state.gameBoard.replace(c, state.gameBoard.get(c)+1);
				if(temHand.contains(c)){
					player.hand.remove(c);
					System.out.println("Put "+ c +" into supply");
					state.gameBoard.replace(c, state.gameBoard.get(c)+1);
				}
				for ( Player p : state.players){
					if (p != player){
						System.out.println("\n"+p.player_username);
						if ( state.gameBoard.get(c) > 0){
							p.gain(c);	
							state.gameBoard.replace(c, state.gameBoard.get(c)-1);
						}	
					}
				}
				
				
				
					
			}else System.out.println("Look no hand");
			
			
			
			return;
		case Baron:
			System.out.println("\n[Baron]");
			System.out.println(player.player_username);
			player.addBuy(1);
			count = 0;
			Card es = this.getCard(state.cards, Card.CardName.Estate); 
			for (Card c : player.hand )
				if (c.getCardName() == Card.CardName.Estate)
					count = count + 1;
			if (count > 0){
				player.discard(es);
				player.addCoins(4);
			}else{
				if(state.gameBoard.get(es) > 0){ 
					player.gain(es);
					state.gameBoard.replace(es, state.gameBoard.get(es)-1);
				}else
				System.out.println("No Estates Left");
			}
			
			return;
		case Council_Room:
			System.out.println("\n[Council Room]");
			System.out.println(player.player_username);
			
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.drawCard();
		
			player.addBuy(1);
			
			for ( Player p : state.players)
				if (p != player){
					System.out.println("\n"+p.player_username);
					p.drawCard();}
			System.out.println("\n");
			return;
		case Cutpurse:
			int fg = 1;
		//	Card cp = this.getCard(player.hand, Card.CardName.Cooper);
		//	Card cp = new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1);
			System.out.println("\n[Cutpurse]");
			System.out.println(player.player_username);
			player.addCoins(2);
			for ( Player p : state.players){
				if (p != player){
					System.out.println("\n"+p.player_username);
					Card cp = this.getCard(p.hand, Card.CardName.Cooper);
					if (cp != null)
						p.discard(cp);		
					else{System.out.println("Hand: "+p.hand);}
				}
			};
			System.out.println("\n");	
			return;
		case Embargo:
			player.addCoins(2);
			if (state.embargod.containsKey(this))
				state.embargod.replace(this, state.gameBoard.get(this)-1);
			else
				state.embargod.put(this, 1);
			
			return;
		case Feast:
			System.out.println("\n[Feast]");
			System.out.println(player.player_username);
			
			Card f = this.getCard(player.playedCards, Card.CardName.Feast);
			System.out.println("Trashes "+ f);
			player.playedCards.remove(f);
			
			List<Card> posible = new ArrayList<Card>(state.useingCards);
            Collections.shuffle(posible);
            for (Card c : posible)
            	if ((state.gameBoard.get(c)) > 0 && (c.getCost() <= 5) && (c.getCardName() != Card.CardName.Curse)){
            		player.gain(c);
            		System.out.println("hi1");
            		state.gameBoard.replace(c, state.gameBoard.get(c)-1);
            		System.out.println("hi2");
            		return;}
            System.out.println("hi3");
            
            System.out.println("No low enoughf card costs");
			return;
		case Gardens:
			//nothing happens 
			return;
		case Great_Hall:
			System.out.println("\n[Great Hall]");
			System.out.println(player.player_username);
			player.drawCard();
			player.drawCard();//bug adds 2 cards
			player.addAction(1);
//			System.out.println("The player draw +1 Card.");
//	    	System.out.println("The player gets +1 play Action.");
			return;
		case Mine:
			System.out.println("\n[Mine]");
			System.out.println(player.player_username);
			List<Card> validUse = filter(player.hand, Type.TREASURE);
            List<Card> posibleGet = filter(state.cards, Type.TREASURE);
            if (validUse.isEmpty() || posibleGet.isEmpty() )
            	return;
            for(Card vu : validUse)
            	for (Card pg : posibleGet)
            		if ((pg.getCost() <= vu.getCost() +3 ) && (pg.getCost() > vu.getCost())){
            			System.out.println("Trashes "+ vu);
            			System.out.println("Gains "+ pg +" into hand");
            			player.hand.remove(vu);
            			player.hand.add(pg);
            			state.gameBoard.replace(pg, state.gameBoard.get(pg)-1);
            			return;
            		}
            System.out.println("No good moves\n");	
			return;
		case Remodle:
			System.out.println("\n[Remodle]");
			System.out.println(player.player_username);
			
			Card tra = null;
			List<Card> hand2 = new ArrayList<Card>(player.hand);
			Collections.shuffle(hand2);
			for(Card c : hand2){
				int cou = 0;
		        int cou2 = 0;
		        for (Card ca : player.hand)
		        	if (ca.equals(c))
		        		cou = cou+1;
		        for (Card ca : player.playedCards)
		        	if (ca.equals(c))
		        		cou2 = cou2+1;
				if(cou > cou2){
					tra = c;
					break;
				}
			}
			if (tra == null){
				System.out.println("No cards in hand");
				return;
			}
			int val = tra.getCost();
			System.out.println("Trashes "+ tra);
			player.hand.remove(tra);
			
			List<Card> pos = new ArrayList<Card>(state.useingCards);
            Collections.shuffle(pos);
            for (Card c : pos)
            	if ((state.gameBoard.get(c)) > 0 && (c.getCost() <= val + 2)){
            		player.gain(c);
            		state.gameBoard.replace(c, state.gameBoard.get(c)-1);
            		return;}
            
            System.out.println("No low enoughf card costs");
			return;
		case Smithy:
			System.out.println("\n[Smithy]");
			System.out.println(player.player_username);
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();//intentional bug
			return;
			
		case Village:
			System.out.println("\n[Village]");
			System.out.println(player.player_username);
	    //	  System.out.println("TODO Village Code******************************************");
	   // 	  System.out.println("The player draw +1 Card.");
	    //	  System.out.println("The player gets +2 play Actions.");
	    	player.drawCard();
	    	player.addAction(2);
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
	
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}
