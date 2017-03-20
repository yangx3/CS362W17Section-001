package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTestDominion {

	@Test
	public void testGame() {
	  	System.out.println("\n" + "------------ Start Random Game Test ------------");
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		
		//http://stackoverflow.com/questions/363681/generating-random-integers-in-a-specific-range
		int playerNum = ThreadLocalRandom.current().nextInt(2, 4 + 1);
		assertTrue((playerNum > 1) && (playerNum < 5));
		System.out.println("There are " + playerNum + " players");
		
		//adding players into the game depending on how many were determined by the random generator
		if(playerNum == 2) {
			Player player = new Player(state, "Alice-1");
			state.addPlayer(player);
			player = new Player(state, "Bob-2");
			state.addPlayer(player);
		}
		else if(playerNum == 3) {
			Player player = new Player(state, "Alice-1");
			state.addPlayer(player);
			player = new Player(state, "Bob-2");
			state.addPlayer(player);
			player = new Player(state, "Charlie-3");
			state.addPlayer(player);
		}
		else if(playerNum == 4) {
			Player player = new Player(state, "Alice-1");
			state.addPlayer(player);
			player = new Player(state, "Bob-2");
			state.addPlayer(player);
			player = new Player(state, "Charlie-3");
			state.addPlayer(player);
			player = new Player(state, "David-4");
			state.addPlayer(player);
		}
		//assertTrue(state.players() > 1);
		
		//start
		state.initializeGame();
		
		int numTurns = 1;
		//int endGame = ThreadLocalRandom.current().nextInt(3, 10 + 1);
		int endGame = 4;
		while(!state.isGameOver()) {
			for(Player playerTurn : state.players) {
				//int whoseTurn = 0;
				System.out.println("It's " + playerTurn.player_username + " turn");
				playerTurn.numActions = 1;
				playerTurn.numBuys = 1;
				playerTurn.playKingdomCard();
				playerTurn.playTreasureCard();
				playerTurn.buyCard();
				playerTurn.endTurn();
			}
			numTurns++;
			if(numTurns == endGame) {
				System.out.println("Game is finished after " + endGame + " turns");
				break;
			}
			else
				continue;
		}
		
	}
}