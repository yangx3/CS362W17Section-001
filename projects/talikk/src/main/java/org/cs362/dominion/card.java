package org.cs362.dominion;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class card {

	private int cost,score,treasureValue;
	private CardName name;
	private Type type;

	public static enum CardName {
	
		Gold, Silver, Copper,

		Providence, Duchy, Estate,

		Curse;

	}
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	

	public card(CardName tname, Type ttype, int tcost, int tscore, int ttreasureValue){

		this.treasureValue = ttreasureValue;
		this.score = tscore;
		this.name = tname;
		this.type = ttype;
		this.cost = tcost;
	
	}

	public CardName getName(){
		return this.name;
	}
	public Type getType() {
		return this.type;
	}
	public int getCost() {
		return this.cost;
	}
	public int getScore() {
		return this.score;
	}
	public int getTreasureValue(){
		return this.treasureValue;
	}


	public static List<card> initDeck() {
		List<card> drawDeck = new ArrayList<card>();

		for(int i = 0; i<7;i++){
			card o = new card(CardName.Copper, Type.TREASURE, 0,0,1);
			drawDeck.add( o );
		}

		for(int i = 0; i<3; i++){
			card o = new card( CardName.Estate, Type.VICTORY, 2,1,0);
			drawDeck.add( o );
		}

		Collections.shuffle(drawDeck);
		return drawDeck;

	}

	public static List<card> initCopperStock(){
		
		List<card> deck = new ArrayList<card>();
		for(int i = 0; i < 10; i++){
			card o = new card(card.CardName.Copper, card.Type.TREASURE, 0,0,1);
			deck.add(o);
		}
		return deck;
		
	}


	public static List<card> initSilverStock(){
		
		List<card> deck = new ArrayList<card>();
		for(int i = 0; i < 10; i++){
			card o = new card(card.CardName.Silver, card.Type.TREASURE, 3,0,2);
			deck.add(o);
		}
		return deck;
		
	}

	
	public static List<card> initGoldStock(){
		
		List<card> deck = new ArrayList<card>();
		for(int i = 0; i < 10; i++){
			card o = new card(card.CardName.Copper, card.Type.TREASURE, 6,0,3);
			deck.add(o);
		}
		return deck;
		
	}

	public static List<card> initVictoryStock(int mode){
		
		List<card> deck = new ArrayList<card>();
		for(int i = 0; i < 10; i++){
			if(mode == 1){
				card o = new card(card.CardName.Estate, card.Type.VICTORY, 2,1,0);
				deck.add(o);
			}
			else if(mode == 2){
				card duchy = new card( card.CardName.Duchy,card.Type.VICTORY, 5,3,0 );
				deck.add(duchy);
			}
			else if(mode == 3){
				card providence = new card( card.CardName.Providence,card.Type.VICTORY,8,6,0);
				deck.add(providence);
			}
				
			
		}
		return deck;
		
	}


	public void displayCardInfo(){
		System.out.println("\n----------");
		System.out.println("NAME: " + this.name);
		System.out.println("TYPE: " + this.type);
		System.out.println("VICTORY POINTS: " + this.score);
		System.out.println("TREASURE VALUE: " + this.treasureValue);
		System.out.println("COST: " + this.cost);
		System.out.println("----------\n");

	}


	public void displaySimpleInfo(){
		System.out.println("--------------------");
		System.out.println("NAME: " + this.name + "| TYPE: " + this.type);
		System.out.println("V.P.: " + this.score + "| VALUE: " + this.treasureValue + "| COST: " + this.cost);
		System.out.println("--------------------");

	}

	public static void main( String args[] ){




	}

}
