import java.util.*;

public class Dominion
{
	public int playerCount;
	public int seed;
	public Player[] players;
	public List<Pile> kingdomCardList;
	public List<Pile> kingdomCards;
	public List<Pile> basicCards;

	public Dominion(int randomSeed)
	{
		Random rand = new Random();
		seed = randomSeed;
		playerCount = rand.nextInt(4-2) + 2;
		players = new Player[playerCount];
		for(int i=0; i < playerCount; i++)
		{
			players[i] = new Player(i);
			System.out.println("Player " + i + " has joined the game.");
		}
		initializeBoard();
	}

	public void initializeBoard()
	{
		basicCards = new ArrayList<Pile>();
		kingdomCards = new ArrayList<Pile>();
		basicCards.add(new Pile(new Copper(), 50, "Copper"));
		basicCards.add(new Pile(new Silver(), 40, "Silver"));
		basicCards.add(new Pile(new Gold(), 30, "Gold"));
		basicCards.add(new Pile(new Estate(), 8, "Estate"));
		basicCards.add(new Pile(new Duchy(), 8, "Duchy"));
		basicCards.add(new Pile(new Province(), 8, "Province"));
		basicCards.add(new Pile(new Curse(), 10, "Curse"));

		generateKingdomCards();

		System.out.println("Revealing the 10 kingdom cards.");
		for(int j=0; j < 10; j++)
		{
			kingdomCards.get(j).revealCard(j);
		}
	}

	public void playGame()
	{
		int turnCounter = 0;
		boolean gameState = false;
		for(int i=0; i < playerCount; i++)
		{
			gameState = gameOver();
			if(gameState == true)
			{
				Player temp = getWinner();
				System.out.println("Player " + temp.playerID + " Wins");
				System.out.println("Player " + temp.playerID + " has " + temp.getPoints() + " points.");
				System.exit(0);
			}
			System.out.println(turnCounter);
			System.out.println("Player " + i);
			players[i].takeTurn(this);
			turnCounter++;
			if(i == playerCount-1)
			{
				i = -1;
			}
		}
	}

	public boolean gameOver()
	{
		int emptyPiles = 0;
		if(basicCards.get(5).size == 0)
		{
			return true;
		}
		for(int i=0; i < 10; i++)
		{
			if(kingdomCards.get(i).size == 0)
			{
				emptyPiles += 1;
			}
		}
		if(emptyPiles >= 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Player getWinner()
	{
		if(players[0].getPoints() > players[1].getPoints())
		{
			return players[0];
		}
		else
		{
			return players[1];
		}
	}

	public void generateKingdomCards()
	{
		kingdomCardList = new ArrayList<Pile>();
		kingdomCardList.add(new Pile(new Adventurer(), 10, "Adventurer"));
		kingdomCardList.add(new Pile(new Ambassador(), 10, "Ambassador"));
		kingdomCardList.add(new Pile(new Baron(), 10, "Baron"));
		kingdomCardList.add(new Pile(new Council_Room(), 10, "Council Room"));
		kingdomCardList.add(new Pile(new Cutpurse(), 10, "Cutpurse"));
		kingdomCardList.add(new Pile(new Feast(), 10, "Feast"));
		kingdomCardList.add(new Pile(new Garden(), 10, "Garden"));
		kingdomCardList.add(new Pile(new Embargo(), 10, "Embargo"));
		kingdomCardList.add(new Pile(new Great_Hall(), 10, "Great Hall"));
		kingdomCardList.add(new Pile(new Mine(), 10, "Mine"));
		kingdomCardList.add(new Pile(new Remodel(), 10, "Remodel"));
		kingdomCardList.add(new Pile(new Smithy(), 10, "Smithy"));
		kingdomCardList.add(new Pile(new Steward(), 10, "Steward"));

		Collections.shuffle(kingdomCardList);
		for(int i=0; i < 10; i++)
		{
			kingdomCards.add(kingdomCardList.get(i));
		}
	}

	public Pile getRandomKingdomCard()
	{
		Random rand = new Random();
		boolean goodCard = false;
		Pile temp = new Pile();
		while(goodCard == false)
		{
			temp = kingdomCards.get(rand.nextInt(kingdomCards.size()));
			if(temp.getSize() != 0)
			{
				goodCard = true;
			}
			else
			{
				rand = new Random();
			}
		}
		return temp;
	}

	public int getKingdomCardIndex(String name)
	{
		for(int i=0; i < kingdomCards.size(); i++)
		{
			if(kingdomCards.get(i).getName() == name)
			{
				return i;
			}
		}
		return -1;
	}

	public int getBasicCardIndex(String name)
	{
		for(int i=0; i < basicCards.size(); i++)
		{
			if(basicCards.get(i).getName() == name)
			{
				return i;
			}
		}
		return -1;
	}
}


