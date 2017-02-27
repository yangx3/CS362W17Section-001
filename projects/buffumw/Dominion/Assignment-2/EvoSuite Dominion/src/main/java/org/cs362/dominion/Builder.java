package org.cs362.dominion;
import java.util.ArrayList;
import java.util.HashSet;

public final class Builder {
	
	public static Deck buildBoard(Card card)
	{
		Deck buildDeck = new Deck();
		int numCard = 0;
		
		if(card.getName() == Card.Name.Copper) numCard = 60;
		else if(card.getName() == Card.Name.Silver) numCard = 40;
		else if(card.getName() == Card.Name.Gold) numCard = 30;
		else numCard = 10;
	
		for(int itr = 0; itr < numCard; itr++)
		{
			buildDeck.addCardToTop(new Card(
					card.getName(), 
					card.getType(), 
					card.getCost(),
					card.getCoinsWorth(),
					card.getPoints(),
					card.getActions(),
					card.getBuys(),
					card.getCards()
			));
		}
			
		return buildDeck;
	}
	
	public static ArrayList<Card> buildNonKingdomCardDecks()
	{
		ArrayList<Card> decks = new ArrayList<Card>();
		
		// money cards
		decks.add(new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0));
		decks.add(new Card(Card.Name.Silver, Card.Type.Treasure, 3, 2, 0, 0, 0, 0));
		decks.add(new Card(Card.Name.Gold, Card.Type.Treasure, 6, 3, 0, 0, 0, 0));
		
		// victory cards
		decks.add(new Card(Card.Name.Estate, Card.Type.Victory, 2, 0, 1, 0, 0, 0));
		decks.add(new Card(Card.Name.Duchy, Card.Type.Victory, 5, 0, 3, 0, 0, 0));
		decks.add(new Card(Card.Name.Province, Card.Type.Victory, 8, 0, 8, 0, 0, 0));
		decks.add(new Card(Card.Name.Curse, Card.Type.Victory, 0, 0, -1, 0, 0, 0));
		
		return decks;
	}
	
	public static ArrayList<Card> buildKindomDecks()
	{
		ArrayList<Card> decks = new ArrayList<Card>();
		
		//Done
				decks.add(new Card(Card.Name.Adventurer, Card.Type.Action, 6, 0, 0, 0, 0, 0));
				
				//Done
				decks.add(new Card(Card.Name.Ambassador, Card.Type.Action, 6, 0, 0, 0, 0, 1));
				
				//Done
				decks.add(new Card(Card.Name.Baron, Card.Type.Action, 4, 0, 0, 0, 1, 0));
				
				//Done
				decks.add(new Card(Card.Name.Council_Room, Card.Type.Action, 5, 0, 0, 0, 1, 4));
				
				//Done
				decks.add(new Card(Card.Name.Cutpurse, Card.Type.ActionAttack, 4, 2, 0, 0, 0, 0));
				
				//Done
				decks.add(new Card(Card.Name.Embargo, Card.Type.Action, 2, 2, 0, 0, 0, 0));
				
				//Done
				decks.add(new Card(Card.Name.Feast, Card.Type.Action, 4, 0, 0, 0, 0, 0));
				
				//Done
				decks.add(new Card(Card.Name.Gardens, Card.Type.Victory, 4, 0, 0, 0, 0, 0));
				
				//Done
				decks.add(new Card(Card.Name.Great_Hall, Card.Type.ActionVictory, 3, 0, 1, 1, 0, 1));
				
				//Done
				decks.add(new Card(Card.Name.Mine, Card.Type.Action, 5, 0, 0, 0, 0, 0));
				
				//Done
				decks.add(new Card(Card.Name.Village, Card.Type.Action, 3, 0, 0, 2, 0, 1));
				
				//Done
				decks.add(new Card(Card.Name.Smithy, Card.Type.Action, 4, 0, 0, 0, 0, 3));
				
				//Done
				decks.add(new Card(Card.Name.Salvager, Card.Type.Action, 4, 0, 0, 0, 1, 0));
				
				return decks;
	}
	
	public static ArrayList<Card> buildGeneralDecks()
	{
		ArrayList<Card> decks = new ArrayList<Card>();
		
		//Name name, Type type, int cost, int coinsWorth, int points, int actions, int buys, int cards
		// money cards
		decks.add(new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0));
		decks.add(new Card(Card.Name.Silver, Card.Type.Treasure, 3, 2, 0, 0, 0, 0));
		decks.add(new Card(Card.Name.Gold, Card.Type.Treasure, 6, 3, 0, 0, 0, 0));
		
		// victory cards
		decks.add(new Card(Card.Name.Estate, Card.Type.Victory, 2, 0, 1, 0, 0, 0));
		decks.add(new Card(Card.Name.Duchy, Card.Type.Victory, 5, 0, 3, 0, 0, 0));
		decks.add(new Card(Card.Name.Province, Card.Type.Victory, 8, 0, 8, 0, 0, 0));
		decks.add(new Card(Card.Name.Curse, Card.Type.Victory, 0, 0, -1, 0, 0, 0));
		
		// kindom cards
		
		//Done
		decks.add(new Card(Card.Name.Adventurer, Card.Type.Action, 6, 0, 0, 0, 0, 0));
		
		//Done
		decks.add(new Card(Card.Name.Ambassador, Card.Type.Action, 6, 0, 0, 0, 0, 1));
		
		//Done
		decks.add(new Card(Card.Name.Baron, Card.Type.Action, 4, 0, 0, 0, 1, 0));
		
		//Done
		decks.add(new Card(Card.Name.Council_Room, Card.Type.Action, 5, 0, 0, 0, 1, 4));
		
		//Done
		decks.add(new Card(Card.Name.Cutpurse, Card.Type.ActionAttack, 4, 2, 0, 0, 0, 0));
		
		//Done
		decks.add(new Card(Card.Name.Embargo, Card.Type.Action, 2, 2, 0, 0, 0, 0));
		
		//Done
		decks.add(new Card(Card.Name.Feast, Card.Type.Action, 4, 0, 0, 0, 0, 0));
		
		//Done
		decks.add(new Card(Card.Name.Gardens, Card.Type.Victory, 4, 0, 0, 0, 0, 0));
		
		//Done
		decks.add(new Card(Card.Name.Great_Hall, Card.Type.ActionVictory, 3, 0, 1, 1, 0, 1));
		
		//Done
		decks.add(new Card(Card.Name.Mine, Card.Type.Action, 5, 0, 0, 0, 0, 0));
		
		//Done
		decks.add(new Card(Card.Name.Village, Card.Type.Action, 3, 0, 0, 2, 0, 1));
		
		//Done
		decks.add(new Card(Card.Name.Smithy, Card.Type.Action, 4, 0, 0, 0, 0, 3));
		
		//Done
		decks.add(new Card(Card.Name.Salvager, Card.Type.Action, 4, 0, 0, 0, 1, 0));
		
		
		
		return decks;
	}
	public static Deck buildPlayerStartDeck()
	{
		ArrayList<Card> card = new ArrayList<Card>();
		for(int itr = 0; itr < 7; itr++)
		{
			card.add(new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0));
		}
		
		for(int itr = 0; itr < 3; itr++)
		{
			card.add(new Card(Card.Name.Estate, Card.Type.Victory, 2, 0, 1, 0, 0, 0));
		}
		
		Deck deck = new Deck(card);
		
		return deck;
	}
}
