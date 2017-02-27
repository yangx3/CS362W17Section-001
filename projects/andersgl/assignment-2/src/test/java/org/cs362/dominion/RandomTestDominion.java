package org.cs362.dominion;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class RandomTestDominion {

	@Test
	public void test0() throws Throwable{
		//We will generate random numbers of players and kingdom cards, then play game normally to achieve
		//good code coverage. We will run multiple games in an attempt to do this. Note: In PlayDominion, if
		//no arguments are passed, it will play a default game with 2 players.
		int numPlays = 3;	
		Random rand = new Random();
		for(int i = 0; i < numPlays; i++){
			
			
			int numplayers = rand.nextInt(3) + 2; //between 2 and 4 players
			String[] args = {Integer.toString(numplayers)};
			PlayDominion.main(args);
		}
		
	
	
	
	}

}
