package com.mycompany.marksprousedominion;

import java.util.ArrayList;
import java.util.Random;

public class Player {

	
	private int victoryPoints = 0;	//The current number of victory points the player has
	private ArrayList<Card> hand;	//The current hand that the player has
	private ArrayList<Card> deck;	//The Deck of the player
	private ArrayList<Card> discard;//The discard pile
	private ArrayList<Card> played;	//The current cards that have been played this turn
	private Random rand;
	
	
	public Player(Random rand)
	{
		hand = new ArrayList<Card>();
		deck = new ArrayList<Card>();
		discard = new ArrayList<Card>();
		played = new ArrayList<Card>();
		this.rand = rand;
	}

	public void turnConclusion()//Gets hands ready for subsequent turns
	{
		resetVictoryPoints();
		while(!hand.isEmpty())//Dumps hand to discard
		{
			discard(hand.get(0), hand);
		}
		while(!played.isEmpty()) //Dumps played cards to discard
		{
			discard(played.get(0), played);
		}
		
		for (int l = 0; l < 5; l++) 
		{
			draw();
		}
		
	}
	
	public void draw()//draws a card from the deck
	{
		if(deck.isEmpty())
			shuffle();
		if(deck.isEmpty())//If the deck remains empty after shuffling, then there are no more cards
			return;
		hand.add(deck.get(0));
		deck.remove(0);
	}
	
	public void shuffle()//shuffles the discard pile into the deck
	{
		//Combine cards and deck
		for (int l = 0; l < deck.size(); l++) {
			
			addCard(0, 1, l);
		}
		
		while(!discard.isEmpty())//while there are cards that haven't been put back yet
		{
			Card temp = discard.get(rand.nextInt(discard.size()));//Takes a random card from the discard pile 
			discard.remove(temp);			//removes it from the discard pile
			deck.add(temp);					//adds it to the deck
		}
		
	}
	
	private void discard(Card card, ArrayList<Card> source)//Discards card from source to discard pile
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
	
	public void trashCard(int destination, Card card)
	{
		switch (destination)
		{
		case 0://Deck
			deck.remove(card);
			break;
		case 1://Discard
			discard.remove(card);
			break;
		case 2://Hand
			hand.remove(card);
			break;
		case 3://Played
			played.remove(card);
			break;
		default://Invalid
			System.out.println("Invalid destination");
			
		
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
			if(!deck.isEmpty())
				destination.add(deck.remove(index));
			break;
		case 1://Discard
			if(!discard.isEmpty())
				destination.add(discard.remove(index));
			break;
		case 2://Hand
			if(!hand.isEmpty())
				destination.add(hand.remove(index));
			break;
		case 3://Played
			if(!played.isEmpty())
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
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int count = 0;
		int gardenCount = 0;
		
		for (i = 0; i < deck.size(); i++) {
			count += deck.get(i).getVictory();
			if(deck.get(i).getName() == "Gardens")
				gardenCount ++;
			//System.out.println(deck.get(i).getName());
		}
		for (j = 0; j < hand.size(); j++) {
			count += hand.get(j).getVictory();
			if(hand.get(j).getName() == "Gardens")
				gardenCount ++;
			//System.out.println(hand.get(j).getName());
		}
		for (k = 0; k < discard.size(); k++) {
			count += discard.get(k).getVictory();
			if(discard.get(k).getName() == "Gardens")
				gardenCount ++;
			//System.out.println(discard.get(k).getName());
		}
		for (l = 0; l < played.size(); l++) {
			count += played.get(l).getVictory();
			if(played.get(l).getName() == "Gardens")
				gardenCount ++;
			//System.out.println(played.get(l).getName());
		}
		
		count += gardenCount*((i+j+k+l) / 10);
		
		this.victoryPoints = count;
		
	}
}
