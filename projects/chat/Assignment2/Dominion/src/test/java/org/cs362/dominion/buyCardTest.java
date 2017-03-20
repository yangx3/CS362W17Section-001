package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class buyCardTest {
	
	@Test
	public void testBuy() throws Throwable {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		GameState testState = (GameState) state.clone();
		Randomness.reset(10);
		
		//Create players
		Player player = new Player(state, "Alice");
        state.addPlayer(player);
        player = new Player(state, "Bob");
        state.addPlayer(player);
        
        //Initialize the game!
	    state.initializeGame();
		
	    state.players.get(0).coins = 5;
	    state.players.get(0).buyCard();
	    assertEquals(state.players.get(0).coins, 0);
	    state.players.get(0).printStateGame();
	}
}
