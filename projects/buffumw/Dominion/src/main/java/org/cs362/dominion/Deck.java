package org.cs362.dominion;
import java.util.ArrayList;
import java.util.Random;

import com.sun.tools.javac.code.Type;

import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	private int currentIndex;
	boolean embargoed = false;
	
	Deck()
	{
		cards = new ArrayList<Card>();
		this.currentIndex = 0;
	}
	
	Deck(ArrayList<Card> cards)
	{
		this.cards = new ArrayList<Card>();
		this.cards.addAll(cards);
		this.currentIndex = 0;
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
		return this.cards.get(index);
	}
	
	public boolean isEmpty()
	{
		return this.cards.size()==0;
	}
	
	public int currentIndex() // returns current index of "iterator"
	{
		return currentIndex;
	}
	
	public Card draw() // removes card from the deck
	{
		Card card = null;
		if(size() > 0){
			card = this.cards.remove(0);
		}
		
		return card;
	}
	
	public Card getTopCard() // returns the top card, does not remove
	{
		return this.cards.get(0);
	}
	
	public Card getCardAt(int index)
	{
		return cards.get(index);
	}
	
	public Card getBottomCard() // returns the bottom card, does not remove
	{
		//Card card = this.cards.get(this.cards.size()-1);
		
		return this.cards.get(this.cards.size()-1);
	}
	
	public ArrayList<Card> getDeck()
	{
		return cards;
	}
	
	public Deck filterBy(Card.Type... types)
	{
		Deck temp = new Deck();
		for(Card card: cards)
		{
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
		return null;
	}
	
	public Card removeCard(Card card)
	{
		for(int itr = 0; itr < this.cards.size(); itr++)
		{
			if(this.cards.get(itr) == card)
			{
				Card newCard = this.cards.get(itr);
				this.cards.remove(itr);
				return newCard;
			}
		}
		return null;
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
	public void resetCurrentIndex() // resets the currentIndex "iterator"
	{
		currentIndex = 0;
	}
	
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
