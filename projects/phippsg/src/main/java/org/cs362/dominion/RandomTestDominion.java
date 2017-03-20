package org.cs362.dominion;
import java.util.Random;

public class RandomTestDominion {

	public static void main( String[] args ) {
		Random r = new Random();
		int numPlayers = r.nextInt(2) + 2;		
		
		GameState test = new GameState(numPlayers);
		test.initializeGame();
		
		test.play();
		
		System.exit(0);
    }
}
