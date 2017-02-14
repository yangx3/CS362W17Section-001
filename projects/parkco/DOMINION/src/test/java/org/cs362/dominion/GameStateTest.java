package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class GameStateTest {
	 private GameState state;
	 private Player player1;
	 private Player player2;
	 private ArrayList<Card> cards;

	@Before
	public void initializeGame() {
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Randomness.reset();
		player1 = new Player(state, "player-1");
    	state.addPlayer(player1);
    	player2 = new Player(state, "player-2");
    	state.addPlayer(player2);
    	//Initialize the game
    	state.initializeGame();
	}

	@Test
	public void isGameOverTest1() {
		state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), 0);
		assertEquals(state.isGameOver(), true);
	}

	@Test
	public void isGameOverTest2() {
		state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), 0);
		state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Estate), 0);
		state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Smithy), 0);
		assertEquals(state.isGameOver(), true);
	}
	
	@Test
	public void isGameOverTest3() {
		state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Copper), 0);
		assertEquals(state.isGameOver(), false);
	}	
	
	@Test
	public void toStringTest() {
		state.gameBoard.clear();
		assertTrue(state.gameBoard.isEmpty());
		assertEquals(state.toString(), "The board game is empty you need to initialize the game.");
	}
	
}
