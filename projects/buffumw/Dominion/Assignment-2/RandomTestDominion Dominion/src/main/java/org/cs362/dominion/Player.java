package org.cs362.dominion;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;

public class Player {
	public String username = "";
	private Deck hand = null;
	private Deck draw = null;
	private Deck discard = null;
	private int points = 0;
	private int actions = 0;
	private int values = 0;
	private int buys = 0;
	private int cards = 0;
	private int coins = 0;
	
	Player()
	{
		hand = new Deck();
		draw = new Deck();
		discard = new Deck();
		username = "";
		points = 0;
	}

	// Getters
	public Deck getDraw()
	{
		return draw;
	}
	
	public Deck getHand()
	{
		return hand;
	}
	
	public Deck getDiscard()
	{
		return discard;
	}
	
	public int getCoins()
	{
		return coins;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	
	// Mutators
	public Deck draw(int numDraws)
	{
		
		for(int itr = 0; itr < numDraws; itr++)
		{
			if(draw.isEmpty())
			{
				reShuffle();
			}
			Card card = draw.draw();
			if(card != null)
			{
				hand.addCardToTop(card);
			}
		}
		
		return hand;
	}
	
	public Card draw(){
		if(draw.isEmpty())
		{
			reShuffle();
		}
		Card card = draw.draw();
		if(card != null)
		{
			hand.addCardToTop(card);
		}
		
		return hand.getTopCard();
	}
	
	public void discardTopHandCard()
	{
		discard.addCardToTop(hand.draw());
	}
	
	public void discard(Card card)
	{
		discard.addCardToTop(card);
	}
	
	private void reShuffle()
	{
		while(!discard.isEmpty())
		{
			draw.addCardToTop(discard.draw());
		}
		draw.shuffle();
	}
	
	// Adders
	public void setDeck(Deck deck)
	{
		this.draw = deck;
		this.draw.shuffle();
	}
	
	public void addCoins(int numCoins)
	{
		coins += numCoins;
	}
	
	public void setCoins(int numCoins)
	{
		coins = numCoins;
	}
	
	public void addPoints(int numPoints)
	{
		points += numPoints;
	}
	
	// Play
	public ArrayList<String> playActions()
	{
		Deck temp = new Deck();
		Deck goAway = new Deck();
		ArrayList<String> names = new ArrayList<String>();
		String choice;
		
		actions = 1;
		buys = 0;
		cards = 0;
		coins = 0;
		
		while(actions > 0)
		{
			try{
				temp = hand.filterBy(Card.Type.Action, Card.Type.ActionAttack);
			}catch(Exception e)
			{
				break;
			}
			
			System.out.print("You have " + actions + " actions left, ");
			if(temp.size() <= 0)
			{
				System.out.println("but you have no action cards in your hand. Time for the buying phase.\n\n");
				actions = 0;
				choice = null;
				break;
			}else{
				choice = getChoice(temp);
				System.out.printf("here are your choices: %s\n\n", temp);
				System.out.printf("Which card would you like to play?: %s\n", choice);
			}
			
			if(temp.compare(choice) != null)
			{
				Card playCard = temp.compare(choice);
				actions+=playCard.getActions();
				buys+=playCard.getBuys();
				cards+=playCard.getCards();
				coins+=playCard.getCoinsWorth();
				names.add(playCard.getName().toString());
				goAway.addCardToTop(hand.removeCard(playCard));
				
			}
			for(int itr = 0; itr < cards; itr++)
			{
				try {
					hand.addCardToTop(draw.draw());
				}catch(Exception e)
				{
					continue;
				}
				
			}
			
			System.out.printf("You get %d actions\n", actions);
			
			cards = 0;
			actions--;
		}
		for(int itr = 0; itr < goAway.size(); itr++)
		{
			try {
				discard.addCardToTop(goAway.draw());
			}catch(Exception e)
			{
				continue;
			}
		}
		for(int itr = 0; itr < hand.size(); itr++)
		{
			
			if(hand.cardAt(itr) != null && hand.cardAt(itr).getType() == Card.Type.Treasure)
			{
				coins += hand.cardAt(itr).getCoinsWorth();
			}
		}
		return names;
	}
	
	public String getChoice(Deck temp)
	{
		int number = 0;
		boolean good = false;
		do{
			Random random = new Random(10);
			number = random.nextInt(temp.size());
			if(temp.cardAt(number) != null)
			{
				good = true;
			}
		}while(!good);
		
		return temp.cardAt(number).toString();
	}
	
	public void playPurchasing(ArrayList<Deck> board)
	{
		Random random = new Random(10);
		int number; 
		boolean purchase = false;
		Deck drawPile;
		Card drawnCard = null;
		
		do{
			do{
				
				number = random.nextInt(board.size());
				drawPile = board.get(number);
				if(drawPile.size() <= 0)
				{
					System.out.println("Sorry, there are no more of that card available.");
					board.remove(number);
				}
				
			}while(drawPile.size() == 0);
			purchase = true;
			try {
				drawnCard = drawPile.getTopCard();
			}catch(Exception e)
			{
				purchase = false;
			}
			
//			if(coins-drawnCard.getCost() < 0)
//			{
//				purchase = false;
//				System.out.printf("Sorry, you don't have enough coins for that card. You only have %d coins\n", coins);
//			}else{
//				purchase = true;
//			}
		}while(!purchase);
		
		System.out.printf("What card would you like?: %s\n", drawnCard);
		
		discard.addCardToTop(drawPile.draw());
		
		while(!hand.isEmpty())
		{
			discard.addCardToBottom(hand.draw());
		}
		
	}
	
	public String toString()
	{
		return ""+draw.size();
	}
	
	
}
