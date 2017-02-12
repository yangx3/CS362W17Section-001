package com.omalleya.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Card implements Comparable<Card>{
    public static enum Type {
        ACTION, TREASURE, VICTORY;
    }

    public static enum CardName {
        //Treasure Cards
        Gold, Silver, Copper,

        //Victory Cards
        Province, Duchy, Estate, Curse,

        //Kingdom Cards
        Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, 
        Gardens, Great_Hall, Mine, Militia, Smithy, Village;
    }

    private final Type cardType;
    private final CardName cardName; 
    private final int cost, score, treasureValue;

    //card ability for kingdom cards

    Card(CardName cardName, Type type, int cost, int score, int treasureValue){
        this.cost = cost; 
        this.score = score; 
        this.treasureValue = treasureValue; 
        this.cardType = type; 
        this.cardName = cardName;
    }

    public Type getType() { return cardType; }

    public CardName getCardName() { return cardName; }

    public int getTreasureValue() { return treasureValue; }

    public int getScore() { return score; }

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
		o = new Card(CardName.Province,Type.VICTORY, 8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY, 5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY, 2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY, 0, -1, 0);
		ret.add(o);	

		/** The Kingdom cards*/ 	
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
        o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);
        o = new Card(CardName.Baron, Type.ACTION, 4, 0, 0);
        ret.add(o);
        
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	

		return ret;
    }

	public void play(Player player) {
		switch(this.cardName) {
			case Adventurer:
				return;
			case Ambassador:
				return;
			case Smithy:
				for(int i=0; i<3; i++) {
					player.drawCard();
				}
				return;
			default:
				return;
		}
	}

    public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName))
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

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
}