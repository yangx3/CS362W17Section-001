package org.cs362.dominion;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import java.util.Random;
import java.util.HashMap;

public class RandomTestDominion
{
	@Test
	// Runs a game with a random number of players (2-4)
	public void test() throws Throwable {
		// Set up a test game
		Randomness.reset(System.currentTimeMillis());
		GameState state;
		//GameState startstate;	// Clone game state if needed
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
		// Set up game board and display the result
		state.initializeGame();
		System.out.println("Initial Dominion Board:\n " + state.toString());
		//startstate=(GameState) state.clone();	// Original state to compare changes against
		int goodtest = 0;
		int badtest = 0;
		// Test the game setup for correct configuration
		for (Player player : state.players)
		{
			System.out.println("** Testing setup of " + player.player_username + "**");
			if (player.hand.size() == 5)
				{System.out.println("TEST PASSED -- Hand size = 5"); goodtest+=1;}
			else
				{System.out.println("TEST FAILED -- Hand size = " + player.hand.size() + " (Should be 5)"); badtest+=1;}
			if (player.deck.size() == 5)
				{System.out.println("TEST PASSED -- Deck size = 5"); goodtest+=1;}
			else
				{System.out.println("TEST FAILED -- Deck size = " + player.deck.size() + " (Should be 5)"); badtest+=1;}
			int coppercount = 0;
			int estatecount = 0;
			for (int i=0; i<5; i++)
			{
				Card checkcard = player.deck.get(i);
				if (checkcard.getCardName() == Card.CardName.Copper)
					{coppercount++;}
				if (checkcard.getCardName() == Card.CardName.Estate)
					{estatecount++;}
			}
			for (int i=0; i<5; i++)
			{
				Card checkcard = player.hand.get(i);
				if (checkcard.getCardName() == Card.CardName.Copper)
					{coppercount++;}
				if (checkcard.getCardName() == Card.CardName.Estate)
					{estatecount++;}
			}
			if (coppercount == 7)
				{System.out.println("TEST PASSED -- Started with 7 Copper"); goodtest+=1;}
			else
				{System.out.println("TEST FAILED -- Started with " + coppercount + " Copper (Should be 7)"); badtest+=1;}
			if (estatecount == 3)
				{System.out.println("TEST PASSED -- Started with 3 Estates"); goodtest+=1;}
			else
				{System.out.println("TEST FAILED -- Started with " + estatecount + " Estates (Should be 3)"); badtest+=1;}
			if (player.discard.size() == 0)
				{System.out.println("TEST PASSED -- Discard pile is empty"); goodtest+=1;}
			else
				{System.out.println("TEST FAILED -- Discard size = " + player.discard.size() + " (Should be 0)"); badtest+=1;}
			if (player.trashpile.size() == 0)
				{System.out.println("TEST PASSED -- Trash pile is empty"); goodtest+=1;}
			else
				{System.out.println("TEST FAILED -- Trash size = " + player.trashpile.size() + " (Should be 0)"); badtest+=1;}
		}
		// Play the game - card actions can be tested by viewing the statements they print
		System.out.println ("** Starting game **");
		HashMap<Player, Integer> winners=state.play();
		// state.players.get(0);	// player1
		// state.players.get(1);	// player2
		// state.players.get(2);	// player3
		// state.players.get(3);	// player4
		System.out.println ("Game over after " + state.totalturns + " turns.");
		for(Player p: winners.keySet())
			{System.out.println (p.player_username + " Score: "+ winners.get(p) );}
		// Test that game was not ended prematurely
		boolean shouldend = false;
		if (state.gameBoard.get(Card.getCard(cards,Card.CardName.Province))==0)
			{shouldend = true;}
		int emptySupplyPile = 0;
		for (int i : state.gameBoard.values())
		{
			if (i <= 0)
				{emptySupplyPile++;}
			if ( emptySupplyPile >= 3)
				{shouldend = true;}
		}
		if (shouldend == true)
			{System.out.println("TEST PASSED -- Game is over"); goodtest+=1;}
		else
			{System.out.println("TEST FAILED -- Game should not be over yet"); badtest+=1;}
		// Show total testing results
		System.out.println ("\nTESTS PASSED: " + goodtest + " -- TESTS FAILED: " + badtest);
	}
}
