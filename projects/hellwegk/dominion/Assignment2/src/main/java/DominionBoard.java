import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DominionBoard {

	private HashMap<Card, Integer> supply = new HashMap<Card, Integer>();
	private List<Card> trash = new ArrayList<Card>();
	public List<Player> players = new ArrayList<Player>();
	
	
	
	public DominionBoard(int number, int seed)
	{
		Randomness.reset(seed);
		List<Card> kingdom = new ArrayList<Card>();
		if (number <= 1)
		{
			number = 2;
		}
		kingdom = kingdomCards(seed);
		setUpGame(kingdom, number);
		players = new ArrayList<Player>();
		for (int i = 0; i < number; i++)
		{
			players.add(new Player("Player" + (i + 1), i, this));
		}
	}
	
	public int play()
	{
		int turn = 0;
		List<Integer> actionCardIndices;
		System.out.println("");
		System.out.println("STARTING NEW GAME!");
		while(!gameOver())
		{
			System.out.println("");
			players.get(turn).newTurn();
			
			//ACTION
			while(players.get(turn).actionInHand() && players.get(turn).actionsLeft())
			{
				actionCardIndices = players.get(turn).actionCardIndices();
				if (actionCardIndices.size() > 0)
				{
					int index = Randomness.nextRandomInt(actionCardIndices.size());
					players.get(turn).playCard(actionCardIndices.get(index), this);
				}
			}
			
			//BUY
			players.get(turn).treasureInHand();
			while(players.get(turn).currentBuys())
			{
				if(getHighestValueCards(players.get(turn).getCoins()).size() > 0)
				{
					players.get(turn).buyCard(players.get(turn).buyRandomCard(this), this);
				}
			}
			
			//CLEAN UP
			players.get(turn).discardCardsEndTurn();
			
			
			
			//NEXT PLAYER
			turn++;
			if(turn >= players.size())
			{
				turn = 0;
			}
		}
		
		//END GAME
		finalScores();
		return 1;
	}
	
	public List<Player> getPlayers()
	{
		return players;
	}
	
	//function that adds a card to the trash pile
	public void trashCard(Card c)
	{
		trash.add(c);
	}
	
	public void takeCard(Card c) 
	{
		supply.put(c, supply.get(c) - 1);
	}
	
	public void returnCard(Card c)
	{
		supply.put(c,  supply.get(c) + 1);
	}
	
	
	//returns a list of all the possible kingdom cards that can be played with
	public List<Card> allKC()
	{
		List<Card> kingdom = new ArrayList<Card>();
		kingdom.add(Card.adventurer);
		kingdom.add(Card.ambassador);
		kingdom.add(Card.baron);
		kingdom.add(Card.council_room);
		kingdom.add(Card.cutpurse);
		kingdom.add(Card.embargo);
		kingdom.add(Card.feast);
		kingdom.add(Card.gardens);
		kingdom.add(Card.great_hall);
		kingdom.add(Card.mine);
		kingdom.add(Card.smithy);
		kingdom.add(Card.village);
		kingdom.add(Card.seahag);

		return kingdom;
	}
	
	public List<Card> kingdomCards(int seed)
	{
		Randomness.reset(seed);
		List<Card> kingdom = new ArrayList<Card>();
		List<Card> allKingdom = allKC();
		Card card;
		while(kingdom.size() < 10)
		{
			card = Randomness.randomMember(allKingdom);
					if (!kingdom.contains(card))
					{
						kingdom.add(card);
					}
		}
		return kingdom;
	}
	
	public List<Card> kingdomCards(Card k1, Card k2, Card k3, Card k4, Card k5, Card k6, Card k7, Card k8, Card k9, Card k10)
	{
		List<Card> k = new ArrayList<Card>();
		k.add(k1);
		k.add(k2);
		k.add(k3);
		k.add(k4);
		k.add(k5);
		k.add(k6);
		k.add(k7);
		k.add(k8);
		k.add(k9);
		k.add(k10);
		return k;
	}
	
	
	
	public void setUpGame(List<Card> kingdomCards, int players)
	{
		//Setting up treasure cards
		supply.put(Card.copper, 60);
		supply.put(Card.silver, 40);
		supply.put(Card.gold, 30);

		//Setting up victory cards
		
		if (players== 2)
		{
			supply.put(Card.estate, 14);
			supply.put(Card.duchy, 8);
			supply.put(Card.province, 8);
			supply.put(Card.curse, 10);
		}
		else if (players == 3)
		{
			supply.put(Card.estate, 21);
			supply.put(Card.duchy, 12);
			supply.put(Card.province, 12);
			supply.put(Card.curse, 20);
		}
		
		else if (players == 4)
		{
			supply.put(Card.estate, 24);
			supply.put(Card.duchy, 12);
			supply.put(Card.province, 12);
			supply.put(Card.curse, 30);
		}
		
		//Setting up kingdom cards
		for (Card c: kingdomCards)
		{
			if (c.getTypes().contains("victory"))
			{
				if (players == 2)
				{
					supply.put(c,  8);
				}
				else if (players == 3 || players == 4)
				{
					supply.put(c, 12);
				}
			}
			else 
			{
				supply.put(c,  10);
			}
		}
	}
	
	public List<Card> getHighestValueCards(int coins)
	{
		List<Card> cardsYouCanBuy = new ArrayList<Card>();
		
		for (Card c: supply.keySet())
		{
			if (supply.get(c) > 0)
			{
				if (c.getCost() <= coins)
				{
					cardsYouCanBuy.add(c);
				}
			}
		}
		
		List<Card> highestValueCards = new ArrayList<Card>();
		int maxCost = 0;
		
		for(Card c: cardsYouCanBuy)
		{
			if(c.getCost() > maxCost)
			{
				maxCost = c.getCost();
			}
		}
		
		for(Card c: cardsYouCanBuy)
		{
			if (c.getCost() == maxCost)
			{
				highestValueCards.add(c);
			}
		}
		
		return highestValueCards;
	}
	
	public List<Card> getNonEmptySupplyPiles()
	{
		List<Card> nonEmpty = new ArrayList<Card>();
		
		for(Card c : supply.keySet())
		{
			if (supply.get(c) > 0)
			{
				nonEmpty.add(c);
			}
		}
		
		return nonEmpty;
	}
	
	//tells if a supply pile has available cards or not
	public  boolean availableCards(Card c)
	{
		return supply.get(c) > 0;
	}
	
	//makes players with a copper discard that copper
	public  void cutpurseHelper(int player)
	{
		for(int i=0; i < players.size(); i++)
		{
			if (i!=player)
			{
				if(players.get(i).hasCard(Card.copper))
				{
					System.out.println(players.get(i).getName() + " discarded copper. ");
					players.get(i).discard(Card.copper);
				}
				else
				{
					System.out.println(players.get(i).getName() + " had no coppers to discard. ");
				}
			}
		}
	}
	
	
	//for the council room action card, all other players draw a card
	public void councilRoomHelper(int player)
	{
		for (int i = 0; i < players.size(); i++)
		{
			if (i != player)
			{
				players.get(i).drawCardFromDeck();
			}
		}
	}
	
	public void seaHagHelper(int player)
	{
		for(int i = 0; i < players.size(); i++)
		{
			if (i != player)
			{
				Card card = players.get(i).drawCardFromDeck();
				players.get(i).discard(card);
				players.get(i).gainCardToTopOfDeck(Card.curse, this);
			}
		}
	}
	
	public void ambassadorHelper(int player, Card c)
	{
		for (int i = 0; i < players.size(); i++)
		{
			if (i != player)
			{
				if (availableCards(c))
				{
					players.get(i).gainCard(c, this);
				}
			}
		}
	}

	//Game ends if 3 piles are empty or province pile is empty
	public boolean gameOver()
	{
		boolean gameover = false;
		if (supply.get(Card.province)==0)
		{
			System.out.println("GAME OVER! Province card pile is empty. ");
			gameover = true;
		}
		else 
		{
			int empty = 0;
			for (Integer i :supply.values())
			{
				if(i == 0)
				{
					empty = empty + 1;
				}
			}
			if(empty >=3)
			{
 				System.out.println("GAME OVER! 3 supply piles are empty. ");
				gameover = true;
			}
		}
		return gameover;
	}
	
	
	//Prints final scores of each player
	public void finalScores()
	{
		int victory;
		for (Player p: players)
		{
			victory = p.getTotalVictoryPoints();
			System.out.println(p.getName() + ": " + victory);
		}
	}
}
