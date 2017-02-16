package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class GameStateTest {

	@Test
	public void GameStateFunction()
	{
		ArrayList<Card> availableCards = Builder.buildGeneralDecks();
		GameState game = new GameState(Builder.buildGeneralDecks());
		
		for(int i = 0; i < 20; i++)
		{
			assertEquals(availableCards.get(i).toString(), game.availableCards.get(i).toString());
		}
	}

	@Test
	public void AddPlayers()
	{
		Player player1 = new Player();
		Player player2 = new Player();
		
		GameState game = new GameState(Builder.buildGeneralDecks());
		
		assertEquals(0,game.players.size());
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		assertEquals(2,game.players.size());
		
	}

	@Test
	public void InitializeGame()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		try {
			game.initializeGame();
			fail("Expected exception to be thrown");
		}catch(Exception e)
		{
			assertEquals(e.getMessage(), "Error: This game must be played by 2 - 4 players, please restart");
		}
		
		assertTrue(game.game.isEmpty());
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		game.initializeGame();
		
		assertEquals(20, game.game.size());
		assertEquals("Billy", game.players.get(0).username);
		assertEquals("Connor", game.players.get(1).username);
		
		
	}

	@Test
	public void Play()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		try{
			game.initializeGame();
		}catch(Exception e)
		{
			fail("Game should not throw exception now");
		}
		
		Player winner = null;
		
		try {
			winner = game.play();
			assertNotNull(winner);
		}catch(Exception e)
		{
			fail("Game should not have crashed");
		}
	}
	
	@Test
	public void AWinner()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		try{
			game.initializeGame();
		}catch(Exception e)
		{
			fail("Game should not throw exception now");
		}
		
		game.game.remove(0);
		game.game.remove(0);
		
		player1.addPoints(10);
		player2.addPoints(12);
		
		assertEquals(18, game.game.size());
		
		Player winner = game.aWinner();
		
		assertEquals("Bug 1: winner is the player who has least number of points. ",player2.username ,winner.username);
	}
	
	@Test
	public void Feast()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		try{
			game.initializeGame();
		}catch(Exception e)
		{
			fail("Game should not throw exception now");
		}
		
		player1.setCoins(3);
		assertEquals(3, player1.getCoins());
		
		player1.getDiscard().addCardToTop(new Card(Card.Name.Feast, Card.Type.Action, 4, 0, 0, 0, 0, 0));
		game.feast(player1);
		assertEquals("Bug 2: Player's coins not stored properly when playing Feast. ",3, player1.getCoins());
	}

	@Test
	public void Gardens()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		try{
			game.initializeGame();
		}catch(Exception e)
		{
			fail("Game should not throw exception now");
		}
		
		assertEquals(0, player1.getPoints());
		game.gardens(player1);
		assertEquals("Bug 3: Garden should give 1 point per 10 cards, this give 10 points per 1 card. ",1, player1.getPoints());
	}

	@Test
	public void Council_Room()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		try{
			game.initializeGame();
		}catch(Exception e)
		{
			fail("Game should not throw exception now");
		}
		
		assertEquals(0, player2.getHand().size());
		game.councilRoom(player1);
		assertEquals("Bug 4: When a player plays the council room card, other players should only draw 1 card. ", 1, player2.getHand().size());
		
	}

	@Test
	public void CutPurse()
	{
		GameState game = new GameState(Builder.buildGeneralDecks());
		Player player1 = new Player();
		Player player2 = new Player();
		
		game.addPlayer(player1);
		game.addPlayer(player2);
		
		try{
			game.initializeGame();
		}catch(Exception e)
		{
			fail("Game should not throw exception now");
		}
		
		player2.draw(10);
		assertEquals(10, player2.getHand().size());
		game.cutpurse(player1);
		assertEquals("Bug 5: Cutpurse card should remove 1 copper from another players hand, "
				+ "not all. ", 9, player2.getHand().size());
	}

}
