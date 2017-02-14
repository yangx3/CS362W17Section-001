package org.cs362.dominion;
import java.util.ArrayList;

public class PlayDominion {
	
	public static void main() {
		try{
			ArrayList<Card> cards = new ArrayList<Card>(Builder.buildGeneralDecks());
			
			GameState game = new GameState(cards);
			
			Player p1 = new Player();
			Player p2 = new Player();
			
			game.addPlayer(p1);
			game.addPlayer(p2);
			
			try{
				game.initializeGame();
			}catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
			
			
			Player winner = game.play();
			
			System.out.printf("The winner is %s with %d points!\n", winner.username, winner.getPoints());
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
		}	
	}
}
