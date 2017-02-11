package org.cs362.dominion;
import java.util.ArrayList;

public final class Card {
	private Name name;
	private Type type;
	private int cost;
	private int points;
	private int coinsWorth;
	private int actions;
	private int buys;
	private int cards;
	
	public enum Name {
		// kingdoms
		Witch, Cellar, Market, Village, Smithy, Adventurer, Ambassador, Baron, 
		Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Salvager,
	
		// money
		Gold, Silver, Copper, 
		// victory
		Curse, Province, Duchy, Estate;
	}
	
	public enum Type {
		Action, ActionAttack, ActionVictory, Curse, Treasure, Victory;
	}

	Card()
	{
		name = null;
		cost = 0;
		type = null;
		coinsWorth = 0;
		actions = 0;
		buys = 0;
		cards = 0;
	}
	
	Card(Name name, Type type, int cost, int coinsWorth, int points, int actions, int buys, int cards)
	{
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.points = points;
		this.coinsWorth = coinsWorth;
		this.actions = actions;
		this.buys = buys;
		this.cards = cards;
	}
	
	// Gets
	public Name getName(){ return name; }
	public Type getType(){ return type!=null?type:null; }
	public Integer getCost(){ return cost; }
	public Integer getCoinsWorth(){ return coinsWorth; }
	public Integer getPoints(){ return points; }
	public Integer getActions(){ return actions; }
	public Integer getBuys(){ return buys; }
	public Integer getCards(){ return cards; }
	
	// toString()
	public String toString(){
		return ""+this.name;
	}
}
