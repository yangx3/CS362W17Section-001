package org.cs362.dominion;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

import org.cs362.dominion.board;
import org.cs362.dominion.card;
import org.cs362.dominion.game;
import org.cs362.dominion.player;



public class RandomTestDominion {

	@Before
	public void testInit(){
		board b = new board();

	}

	@Test
	public void briefGame(){
	
		board b = new board();
		player p1 = new player("Kevin");
		player p2 = new player("John");

		Random rand = new Random();

		int n = rand.nextInt(30) +1;
	
		int i = 0;
		while( i < n  || (game.checkVictoryConditions( b) == true)){

			game.takeTurn( p1,b);
			game.takeTurn( p2,b);
			game.checkVictoryConditions( b);

			i++;
		


		}


	}

}
