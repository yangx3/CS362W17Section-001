package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class PlayerTest {
	Player player;
	
	@Before
	public void BeforeEach()
	{
		player = new Player();
		player.setDeck(Builder.buildPlayerStartDeck());
	}

	@Test 
	public void Constructor()
	{
		Player player = new Player();
		Deck tempDeck = player.getHand();
		assertEquals(0,tempDeck.size());
		
		tempDeck = player.getDraw();
		assertEquals(0,tempDeck.size());
		
		tempDeck = player.getDiscard();
		assertEquals(0,tempDeck.size());
		
		assertEquals("", player.username);
		assertEquals(0, player.getPoints());
	}
	
	//Testing Getters
	@Test
	public void GetDraw()
	{
		Deck draw;
		draw = player.getDraw();
		for(int itr = 0; itr < draw.size(); itr++)
		{
			assertNotNull(draw.cardAt(itr));
		}
	}
	
	@Test
	public void GetDiscard()
	{
		Deck draw;
		draw = player.getDiscard();
		for(int itr = 0; itr < draw.size(); itr++)
		{
			assertNotNull(draw.cardAt(itr));
		}
	}
	
	@Test
	public void GetHand()
	{
		Deck draw;
		draw = player.getHand();
		for(int itr = 0; itr < draw.size(); itr++)
		{
			assertNotNull(draw.cardAt(itr));
		}
	}

	@Test
	public void GetCoins()
	{
		assertEquals(0,player.getCoins());
	}
	
	@Test
	public void GetPoints()
	{
		assertEquals(0, player.getPoints());
	}
	
	@Test
	public void DrawNum()
	{
		Deck draw = player.getDraw();
		Deck hand = player.getHand();
		Deck discard = player.getDiscard();
		Deck temp = null;
		
		assertEquals(10, draw.size());
		assertEquals(0, hand.size());
		
		player.draw(5);
		
		assertEquals(5, draw.size());
		assertEquals(5, hand.size());
		
		for(int itr = 0; itr < 5; itr++)
		{
			player.discardTopHandCard();
		}
		
		assertTrue(hand.isEmpty());
		assertEquals(5, discard.size());
		
		player.draw(5);
		
		assertEquals(0, draw.size());
		assertEquals(5, hand.size());
		
		temp = player.draw(5);
		
		assertEquals(0, draw.size());
		assertEquals(10, hand.size());
		assertEquals(0, discard.size());
		assertEquals(hand, temp);
		
		
	}

	@Test
	public void Draw()
	{
		Deck draw = player.getDraw();
		Deck hand = player.getHand();
		Deck discard = player.getDiscard();
		Card temp = null;
		
		assertEquals(10, draw.size());
		assertTrue(hand.isEmpty());
		assertTrue(discard.isEmpty());
		
		temp = player.draw();
		
		assertEquals(9, draw.size());
		assertEquals(1, hand.size());
		assertTrue(discard.isEmpty());
		assertEquals(temp, hand.cardAt(0));
		
		player.discardTopHandCard();
		
		assertEquals(1, discard.size());
		
		for(int itr = 0; itr < 10; itr++)
		{
			player.draw();
		}
		
		assertTrue(draw.isEmpty());
		assertEquals(10, hand.size());
		assertTrue(discard.isEmpty());
		
		
	}

	@Test
	public void Discard()
	{
		assertEquals(10, player.getDraw().size());
		assertEquals(0, player.getDiscard().size());
		
		player.discard(player.getDraw().removeCard(player.getDraw().cardAt(0)));
		
		assertEquals(9, player.getDraw().size());
		assertEquals(1, player.getDiscard().size());
	}

	@Test
	public void SetDeck()
	{
		Deck draw = player.getDraw();
		Deck discard = player.getDiscard();
		
		int num = draw.size();
		
		for(int i = 0; i < num; i++)
		{
			discard.addCardToTop(draw.removeCard(draw.cardAt(0)));
		}
		
		assertEquals(0, player.getDraw().size());
		player.setDeck(player.getDiscard());
		assertEquals(10, player.getDraw().size());
	}

	@Test
	public void AddCoins()
	{
		assertEquals(0, player.getCoins());
		player.addCoins(5);
		assertEquals(5,player.getCoins());
	}

	@Test
	public void SetCoins()
	{
		assertEquals(0, player.getCoins());
		player.setCoins(10);
		assertEquals(10, player.getCoins());
	}

	@Test
	public void AddPoints()
	{
		assertEquals(0, player.getPoints());
		player.addPoints(5);
		assertEquals(5, player.getPoints());
	}
//
//	@Test
//	public void PlayGoodActions()
//	{
//		Deck hand = player.getHand();
//		hand.addCardToTop(new Card(Card.Name.Village, Card.Type.Action, 3, 0, 0, 2, 0, 1));
//		
//		ArrayList<String> result = player.playActions();
//		assertEquals("Village", result.get(0));
//	}
//
//	@Test 
//	public void PlayBadActions()
//	{
//		Deck hand = player.getHand();
//		hand.addCardToTop(new Card(Card.Name.Village, Card.Type.Action, 3, 0, 0, 2, 0, 1));
//		
//		String input = "Villag\n";
//		InputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//		
//		ArrayList<String> result = player.playActions();
//		assertTrue(result.isEmpty());
//	}

//	@Test
//	public void PlayGoodBuys()
//	{
//		
//		Player player = new Player();
//		Player player2 = new Player();
//		
//		GameState game = new GameState(Builder.buildGeneralDecks());
//		
//		game.initializeGame();
//		
//		player.playPurchasing(game.game);
//		
//		
//		
//	}
	
	@Test
	public void ToString()
	{
		assertEquals(0, player.toString().compareTo("10"));
	}
	
	
	
	
	
	
	
	
	
	
}
