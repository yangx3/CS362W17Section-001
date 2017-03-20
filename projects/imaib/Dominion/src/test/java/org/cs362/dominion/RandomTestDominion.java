package org.cs362.dominion;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import java.util.Random;
import java.util.HashMap;

public class RandomTestDominion
{
	@Test
	public void test() throws Throwable {
		Randomness.reset(System.currentTimeMillis());
		GameState state;
		List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Random rp = new Random(System.currentTimeMillis());
		int numplayers = rp.nextInt(4 - 2 + 1) + 2;
		if (numplayers == 2)
		{
			Player p = new Player(state, "test-player-1");
			state.addPlayer(p);
			p = new Player(state, "test-player-2");
			state.addPlayer(p);
		}
		if (numplayers == 3)
		{
			Player p = new Player(state, "test-player-1");
			state.addPlayer(p);
			p = new Player(state, "test-player-2");
			state.addPlayer(p);
			p = new Player(state, "test-player-3");
			state.addPlayer(p);
		}
		if (numplayers == 4)
		{
			Player p = new Player(state, "test-player-1");
			state.addPlayer(p);
			p = new Player(state, "test-player-2");
			state.addPlayer(p);
			p = new Player(state, "test-player-3");
			state.addPlayer(p);
			p = new Player(state, "test-player-4");
			state.addPlayer(p);
		}
		state.initializeGame();
		System.out.println("Initial Dominion Board:\n " + state.toString());
		for (Player player : state.players)
		{
			System.out.println(player.player_username + "hand size is " + player.hand.size() + ", Should be 5");
			System.out.println(player.player_username + "deck size is " + player.deck.size() + ", Should be 5");
			System.out.println(player.player_username + "discard pile is size " + player.discard.size() + ", Should be 0");
			System.out.println(player.player_username + "trash pile is size " + player.trashpile.size() + ", Should be 0");
		}
		HashMap<Player, Integer> winners=state.play();
		for(Player p: winners.keySet())
		{
			System.out.println (p.player_username + " Score: "+ winners.get(p) );
		}
	}
}
