package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import java.util.*;

public class RandomTestDominionTest {
	@Test
	public void TestGameDominion() {
		List<Card> cards;
		GameState state;
		Randomness.reset(10);
		
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Random randomer = new Random();
		int numplayers = randomer.nextInt(2)+2; //this gives us 2 - 4 players	
		int AI_mode;
		for(int i = 0; i < numplayers; i++) {
			AI_mode = randomer.nextInt(1)+1;
			Player player = new Player(state, "Player"+i, AI_mode);
			state.addPlayer(player);
		}
		state.initializeGame();
		
		HashMap<Player, Integer> winners=state.play();
		System.out.println ("Finished game.\n");
		for(Player p: winners.keySet()){
			System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
		}
		System.out.println("TEST SUCCESFULLY COMPLETED");
		//System.exit(0);
	}
}