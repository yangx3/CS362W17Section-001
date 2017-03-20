package org.cs362.dominion;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class TestMutants
{
	@Test
	public void test() throws Throwable {
		// Set up a test game
		Randomness.reset(System.currentTimeMillis());
		GameState state;
		List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		// Set up some test players
		Random randomnum = new Random(System.currentTimeMillis());
		int numplayers = randomnum.nextInt(4 - 2 + 1) + 2;	// Randomly choose 2,3,4
		System.out.println("** Setting up a " + numplayers + " player game **");
		Player addplayer = new Player(state, "test-player-1");
		state.addPlayer(addplayer);
		addplayer = new Player(state, "test-player-2");
		state.addPlayer(addplayer);
		if (numplayers == 3)
		{
			addplayer = new Player(state, "test-player-3");
			state.addPlayer(addplayer);
		}
		if (numplayers == 4)
		{
			addplayer = new Player(state, "test-player-3");
			state.addPlayer(addplayer);
			addplayer = new Player(state, "test-player-4");
			state.addPlayer(addplayer);
		}
		state.initializeGame();

		// Kill player number mutants
		assertTrue( state.players.size() != 2 || state.players.size() != 3 || state.players.size() != 4 );
		if (state.players.size() == 2)
		{
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Province)) == 8 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Duchy)) == 8 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Estate)) == 8 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Curse)) == 10 );
		}
		if (state.players.size() == 3)
		{
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Province)) == 12 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Duchy)) == 12 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Estate)) == 12 );
		}
		if (state.players.size() == 4)
		{
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Province)) == 12 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Duchy)) == 12 );
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Estate)) == 12 );
		}
		if (state.players.size() == 3)
		{
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Curse)) == 20 );
		}
		if (state.players.size() == 4)
		{
			assertTrue( state.gameBoard.get(Card.getCard(state.cards,Card.CardName.Curse)) == 30 );
		}
		
		HashMap<Player, Integer> winners=state.play();
		for(Player p: winners.keySet())
		{System.out.println (p.player_username + " Score: "+ winners.get(p) );}
	}
}
