package myDominion;

import java.util.ArrayList;

public class Player {

	
	private int victoryPoints = 0;	//The current number of victory points the player has
	private ArrayList<Card> hand;	//The current hand that the player has
	private ArrayList<Card> deck;	//The Deck of the player
	private ArrayList<Card> discard;//The discard pile
	private ArrayList<Card> played;	//The current cards that have been played this turn
	
	
	public Player()
	{
		hand = new ArrayList<Card>();
		deck = new ArrayList<Card>();
		discard = new ArrayList<Card>();
		played = new ArrayList<Card>();
		
		
		
		
	}

	
	public void turnSetup()
	{
		
	}
	
	public void turnConclusion()
	{
		for (Card card : hand) // Dumps hand 
		{ 
			discard(card, hand);
		}
		for (Card card : played) //Dumps played cards to discard
		{
			discard(card, played);
		}
		
		for (int i = 0; i < 5; i++) 
		{
			draw();
		}
		
	}
	
	public void draw()//draws a card from the deck
	{
		if(deck.isEmpty())
			shuffle();
		hand.add(deck.get(0));
		deck.remove(0);
	}
	
	public void shuffle()//shuffles the discard pile into the deck
	{
		//Combine cards and deck
		for (Card card : deck) {
			deck.remove(card);
			discard.add(card);
		}
		
		while(!discard.isEmpty())//while there are cards that haven't been put back yet
		{
			Card temp = discard.get((int)(Math.random() * discard.size() + 1));//Takes a random card from the discard pile 
			discard.remove(temp);			//removes it from the discard pile
			deck.add(temp);					//adds it to the deck
		}
	}
	
	public void discard(Card card, ArrayList<Card> source)//Discards card from source to discard pile
	{
		discard.add(card);
		if(!source.remove(card))
			System.out.println("That card didn't belong in the source!");
	}
	
	public int getSize(int destination)
	{
		switch (destination)
		{
		case 0://Deck
			return deck.size();
		case 1://Discard
			return discard.size();
		case 2://Hand
			return hand.size();
		case 3://Played
			return played.size();
		default://Invalid
			System.out.println("Invalid destination");
			return 0;
		}
	}
	
	public Card getCard(int destination, int index) //gets the given card from the proper location
	{
		switch (destination)
		{
		case 0://Deck
			return deck.get(index);
		case 1://Discard
			return discard.get(index);
		case 2://Hand
			return hand.get(index);
		case 3://Played
			return played.get(index);
		default://Invalid
			System.out.println("Invalid destination");
			return null;
		
		}
	}
	
	public void addCard(int destination, Card card) //Adds the given card to the proper location
	{
		switch (destination)
		{
		case 0://Deck
			deck.add(card);
			break;
		case 1://Discard
			discard.add(card);
			break;
		case 2://Hand
			hand.add(card);
			break;
		case 3://Played
			played.add(card);
			break;
		default://Invalid
			System.out.println("Invalid destination");
			break;
		
		}
	}
	
	public void addCard(int source, int destination, int index) //Adds card at index from source to destination
	{
		switch (destination)
		{
		case 0://Deck
			moveCard(source, deck, index);
			break;
		case 1://Discard
			moveCard(source, discard, index);
			break;
		case 2://Hand
			moveCard(source, hand, index);
			break;
		case 3://Played
			moveCard(source, played, index);
			break;
		default://Invalid
			System.out.println("Invalid destination");
			break;
		
		}
	}
	
	private void moveCard(int source, ArrayList<Card> destination, int index)
	{
		switch (source)
		{
		case 0://Deck
			destination.add(deck.remove(index));
			break;
		case 1://Discard
			destination.add(discard.remove(index));
			break;
		case 2://Hand
			destination.add(hand.remove(index));
			break;
		case 3://Played
			destination.add(played.remove(index));
			break;
		default://Invalid
			System.out.println("Invalid destination");
			break;
		
		}
	}
	
	public int getVictoryPoints() {
		return victoryPoints;
	}


	public void resetVictoryPoints() 
	{
		//Traverse the deck, hand, and discard pile and tally victory points
		int count = 0;
		
		for (Card card : deck) {
			count += card.getVictory();
		}
		for (Card card : hand) {
			count += card.getVictory();
		}
		for (Card card : discard) {
			count += card.getVictory();
		}
		for (Card card : played) {
			count += card.getVictory();
		}
		
		this.victoryPoints = count;
		
	}
	
	
	
	
	
	
	

}
