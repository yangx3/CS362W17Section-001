package Dominion.RandomTestDominion;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Play 
{
	/*play maintains turn order and handling, communicates between the different
	 * classes, and acts as the main
	 * 
	 * Play initializes the game by calling the constructors at the 
	 * start of the game
	 * it then begins a loop which checks the status of the game (whether or not it is done)
	 * It then begins the next player's turn
	 */
	
	public static String state;
	
	public static void playGame(int rounds, int players)
	{
		if (players < 2 || players > 4)
		{
			System.out.println("This version of dominion only allows for two to four players. Ending game.");
			return;
		}
		
		state = "Initializing";
		Board b = new Board(players);
		
		List<Player> p = new ArrayList();
		
		for (int i = 0; i < players; i++)
		{
			p.add(new Player(i + 1));
		}
		
		for (int i = 0; i < players; i++)
		{
			for (int j = 0; j < players; j++)
			{
				if (j != i)
					p.get(i).opponents.add(p.get(j));
			}
		}
		
		boolean control = true;
		int turn = 0;
		
		if (rounds == 0)
		{
			while (control == true)
			{
				state = "run game";
				p.get(turn).turn(b, state);
				turn++;
				if (turn >= players)
					turn = 0;
				if (b.gameEnd() == true)
				{
					System.out.println("Game is over");
					control = false;
				}
			}
		}
		else
		{
			while (rounds > 0)
			{
				state = "Test turn run";
				p.get(turn).turn(b, state);
				turn++;
				if (turn > players)
					turn = 0;
				rounds--;
			}
			
		}
		
		for (int i = 0; i < p.size(); i++)
		{
			state = "Count points player" + String.format("%d", i + 1);
			p.get(i).discardAll(p.get(i).hand);
			p.get(i).discardAll(p.get(i).deck);
			for (int j = 0; j < p.get(i).discard.size(); j++)
			{
				if (p.get(i).discard.get(j).getType() == "Victory" || p.get(i).discard.get(j).getName() == "Great Hall")
					p.get(i).vPoints += p.get(i).discard.get(j).getPoints();
				else if (p.get(i).discard.get(j).getName() == "Gardens")
					p.get(i).vPoints += p.get(i).discard.size()/10;
				else if (p.get(i).discard.get(j).getType() == "Curse")
					p.get(i).vPoints -= 1;
			}
		}
		
		int winner = 0;
		for (int i = 0; i < players; i++)
		{
			if (p.get(i).vPoints > p.get(winner).vPoints)
				winner = i;
		}
		
		System.out.println("The winner is player " + (winner + 1) + " with " + p.get(winner).vPoints);
		System.out.println("The other players scored as follows:");
		for (int i = 0; i < players; i++)
		{
			if (i != winner)
				System.out.println("Player " + (i + 1) + " with " + p.get(i).vPoints + " points");
		}
	}
	
		
	
	
}
