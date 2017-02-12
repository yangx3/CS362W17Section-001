import java.util.*;

public class Dominion
{
	public int playerCount;
	public int seed;
	public Player[] players;
	public List<Pile> kingdomCards;
	public List<Pile> basicCards;
	public Board gameBoard;

	public Dominion(int randomSeed)
	{
		seed = randomSeed;
		playerCount = 2;
		players = new Player[playerCount];
		for(int i=0; i < playerCount; i++)
		{
			players[i] = new Player(i);
			System.out.println("Player " + i + " has joined the game.");
			initializeBoard();
		}
	}

	public void initializeBoard()
	{
		basicCards = new ArrayList<Pile>();
		basicCards.add(new Pile(new Copper(), 50));
		basicCards.add(new Pile(new Silver(), 40));
		basicCards.add(new Pile(new Gold(), 30 ));
		basicCards.add(new Pile(new Estate(), 8));
		basicCards.add(new Pile(new Duchy(), 8));
		basicCards.add(new Pile(new Province(), 8));
		basicCards.add(new Pile(new Curse(), 10));	

		kingdomCards = new ArrayList<Pile>();
		kingdomCards.add(new Pile(new Cutpurse(), 10));
	       	kingdomCards.add(new Pile(new Council_Room(), 10));

	}

	public void play()
	{
		
	}

}


