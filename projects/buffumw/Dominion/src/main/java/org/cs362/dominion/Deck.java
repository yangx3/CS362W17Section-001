package org.cs362.dominion;
import java.util.ArrayList;
import java.util.Random;

import com.sun.tools.javac.code.Type;

import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	boolean embargoed = false;
	
	Deck()
	{
		cards = new ArrayList<Card>();
	}
	
	Deck(ArrayList<Card> cards)
	{
		this.cards = new ArrayList<Card>();
		this.cards.addAll(cards);
	}
	
	// Getters
	public int size() // returns size of the deck
	{
		return this.cards.size();
	}
	
	public boolean getEmbargoStatus()
	{
		return embargoed;
	}
	
	public Card cardAt(int index)
	{
		if(cards.size() <= index || index < 0)
		{
			throw new IndexOutOfBoundsException("Error: index out of bounds");
		}
		return this.cards.get(index);
	}
	
	public boolean isEmpty()
	{
		return this.cards.size()==0;
	}
	
	public Card draw() // removes card from the deck
	{
		
		Card card = null;
		if(size() <= 0){
			throw new IndexOutOfBoundsException("Error: index out of bounds");
		}
		card = this.cards.remove(0);
		
		return card;
	}
	
	public Card getTopCard() // returns the top card, does not remove
	{
		if(cards.isEmpty())
		{
			throw new IndexOutOfBoundsException("Error: index out of bounds");
		}
		return this.cards.get(0);
	}
	
	public Card getBottomCard() // returns the bottom card, does not remove
	{
		if(cards.isEmpty())
		{
			throw new IndexOutOfBoundsException("Error: index out of bounds");
		}
		
		return this.cards.get(this.cards.size()-1);
	}
	
	public ArrayList<Card> getDeck()
	{
		return cards;
	}
	
	public void removeNull()
	{
		for(int itr = 0; itr < this.cards.size(); itr++)
		{
			if(cards.get(itr) == null)
			{
				cards.remove(itr);
			}
		}
	}
	
	public Deck filterBy(Card.Type... types)
	{
		Deck temp = new Deck();
		if(cards.size() == 0)
		{
			throw new IndexOutOfBoundsException("Error: index out of bounds");
		}
		for(Card card: cards)
		{
			if(card == null)
			{
				throw new IndexOutOfBoundsException("Error: index out of bounds");
			}
			if(card.getType() != null)
			{
				for(Card.Type type: types)
				{
					if(card.getType() == type)
					{
						temp.addCardToBottom(card);
					}
				}
			}
		}
		
		return temp;
	}
	
	public Card compare(String choice)
	{
		for(Card card: cards)
		{
			if(choice.compareTo(card.getName().toString()) == 0)
			{
				return card;
			}
		}
		throw new IndexOutOfBoundsException("Error: index out of bounds");
	}
	
	public Card removeCard(Card card)
	{
		for(int itr = 0; itr < this.cards.size(); itr++)
		{
			if(this.cards == null || this.cards.get(itr) == null){
				throw new IndexOutOfBoundsException("Error: index out of bounds");
			}
			if(this.cards.get(itr).getName() == card.getName())
			{
				return this.cards.remove(itr);
			}
		}
		throw new IndexOutOfBoundsException("Error: index out of bounds");
	}
	
	
	// Adders
	public void addCardToBottom(Card card) // adds card to the bottom (end of list)
	{
		this.cards.add(card);
	}
	
	public void addCardToTop(Card card) // adds card to top (beginning of list)
	{
		this.cards.add(0, card);
	}
	
	// Methods
	
	public boolean toggleEmbargo()
	{
		embargoed = !embargoed;
		return embargoed;
	}
	
	public void shuffle() // shuffles the list
	{
		Collections.shuffle(this.cards, new Random(System.nanoTime()));
	}
	
	// override toString()
	public String toString(){
		
		return this.cards.toString();
	}
}
