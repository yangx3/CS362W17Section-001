package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class GameStateTest {
    @Test
    public void test0() throws Throwable {
	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);

	Player player = new Player(state, "player-1");
	state.addPlayer(player);

	player = new Player(state, "player-2");
	state.addPlayer(player);

	state.initializeGame();

	assertEquals(17, state.gameBoard.size());
    }
    @Test
    public void test1() throws Throwable {
	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);

    	Player player = new Player(state, "player-1");
	state.addPlayer(player);

	player = new Player(state, "player-2");
	state.addPlayer(player);

	state.initializeGame();

	for(Player p : state.players)
	    assertEquals(p.numBuys, 1);
    }
}
