import java.util.*;

public class Player
{
	public int playerID;
	public int victoryPoints = 0;
	int buy = 1;
	int actions = 1;
	int money = 0;	
	public Pile deck;
	public Pile hand;
	public Pile discard;

	//Player constructor
	public Player(int ID)
	{
		System.out.println("Player has been initialized.");
		playerID = ID;
		deck = new Pile();
		hand = new Pile();
		discard = new Pile();

		for(int i=0; i <= 10; i++)
		{
			if(i < 7)
			{
				deck.addCard(new Copper());
			}
			else if(i > 7)
			{
				deck.addCard(new Estate());
			}
		}
	}
	
	//Player draws a card from their deck.
	public Card drawCard()
	{
		return deck.drawCard();
	}

	//Player discards a card from their hand and adds that card into their discard pile.
	public void discardCard(Pile searchPile, int index)
	{
		discard.addCard(searchPile.getCard(index));
		searchPile.removeCard(index);
	}

	//Player trashes a card from their hand. Removes the card from the game.
	public void trashCard(int index)
	{
		hand.removeCard(index);
	}

	//Player takes his turn. 
	public void takeTurn(Dominion game)
	{
		reset();
		for(int i=0; i < 5; i++)
		{
			if(deck.getSize() == 0)
			{
				rebuildDeck();
			}
			hand.addCard(drawCard());
		}
	}

	//Resets the Players buy, actions and money back to defualt.
	public void reset()
	{
		buy = 1;
		actions = 1;
		money = 0;
	}

	//Recreates the main deck. Happens only when the main deck runs out of cards.
	//The deck is recreated by using the discard pile.
	public void rebuildDeck()
	{
		while(!discard.isEmpty())
		{
			deck.addCard(discard.drawCard());
		}
		deck.shufflePile();
	}

	//Returns of the index of the card that is looked for.
	//Returns -1 if the card is not in that pile.
	public int getCardIndexbyName(Pile searchPile, String cardName)
	{
		for(int i=0; i < searchPile.getSize(); i++)
		{
			if(searchPile.getCard(i).name == cardName)
			{
				return i;
			}
		}
		return -1;
	}

	//Returns the index of a random card.
	public int getRandomCardIndex(Pile searchPile)
	{
		Random rand = new Random();
		int randomIndex = rand.nextInt(searchPile.getSize());
		return randomIndex;
	}

	//For debugging. Prints the contents of the deck.
	public void printDeck()
	{
		System.out.println(deck.cards.size());
		for(int i=0; i < deck.cards.size(); i++)
		{	
			deck.cards.get(i).print();
		}
		deck.print();
	}
}	
