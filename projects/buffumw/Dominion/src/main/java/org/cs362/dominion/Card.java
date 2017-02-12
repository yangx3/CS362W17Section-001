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
	private String description;
	
	public enum Name {
		// kingdoms 
		Village("+1 Card | +1 Action"), 
		Smithy("+3 Cards"), 
		Adventurer("Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other cards."),
		Ambassador("Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Each other player gains a copy of it."), 
		Baron("+1 Buy | You may discard an Estate for +4 coins. If you don't, gain an Estate."), 
		Council_Room("+4 Cards and +1 Buys | Each other player draws a card."), 
		Cutpurse("+2 Coins | Each other player discards a Copper card (or reveals a hand with no Copper)."), 
		Embargo("+2 Coins | Trash this card, put Embargo token on a Supply pile. When buying card, player gains 1 curse card per embargo token on pile"), 
		Feast("Trash this card. Gain a card costing up to 5 coins."), 
		Gardens("Worth +1 Victory points per 10 cards you have (round down)."), 
		Great_Hall("+1 Card | +1 Action | +1 Victory point"), 
		Mine("You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 coins more than it."), 
		Salvager("+1 Buy | Trash a card from your hand. + # of coins equal to its cost."),
		// money
		Gold("+3 Coins"), 
		Silver("+2 Coins"), 
		Copper("+1 Coin"), 
		// victory
		Curse("-1 Victory point"), 
		Province("+6 Victory points"), 
		Duchy("+3 Victory points"), 
		Estate("+1 Victory point");
		
		private final String description;
		
		Name(String description){ this.description = description; }
		public String getDesription(){ return this.description; }
	}
	
	public enum Type {
		Action, ActionAttack, ActionVictory, Curse, Treasure, Victory;
	}

	Card()
	{
		name = null;
		type = null;
		cost = 0;
		coinsWorth = 0;
		points = 0;
		actions = 0;
		buys = 0;
		cards = 0;
		description = null;
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
		this.description = this.name.getDesription();
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
	public String getDescription(){ return description; }
	
	// toString()
	public String toString(){
		return this.name.toString();
	}
}
