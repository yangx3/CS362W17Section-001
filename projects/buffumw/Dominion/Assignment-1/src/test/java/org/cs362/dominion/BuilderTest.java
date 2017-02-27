package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class BuilderTest {

	@Test
	public void BuildBoard()
	{
		Card victory = new Card(Card.Name.Curse, Card.Type.Victory, 0, 0, -1, 0, 0, 0);
		Card ambassador = new Card(Card.Name.Adventurer, Card.Type.Action, 6, 0, 0, 0, 0, 0);
		Card silver = new Card(Card.Name.Silver, Card.Type.Treasure, 3, 2, 0, 0, 0, 0);
		Card copper = new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0);
		Card gold = new Card(Card.Name.Gold, Card.Type.Treasure, 6, 3, 0, 0, 0, 0);
		
		ArrayList<Deck> board = new ArrayList<Deck>();
		
		assertTrue(board.isEmpty());
		
		board.add(Builder.buildBoard(victory));
		board.add(Builder.buildBoard(silver));
		board.add(Builder.buildBoard(copper));
		board.add(Builder.buildBoard(gold));
		board.add(Builder.buildBoard(ambassador));
		
		assertEquals(board.get(0).size(), 10);
		assertEquals(board.get(1).size(), 40);
		assertEquals(board.get(2).size(), 60);
		assertEquals(board.get(3).size(), 30);
		assertEquals(board.get(4).size(), 10);
	}

	@Test
	public void BuildGeneralDecks()
	{
		ArrayList<Card> availableCards = new ArrayList<Card>();
		
		assertTrue(availableCards.isEmpty());
		
		availableCards.addAll(Builder.buildGeneralDecks());
		
		assertEquals(20, availableCards.size());
	}

	@Test
	public void BuildPlayerStartDeck()
	{
		Deck deck = new Deck();
		assertTrue(deck.isEmpty());
		
		deck = Builder.buildPlayerStartDeck();
		
		assertEquals(10, deck.size());
		
		for(int itr = 0; itr < 7; itr++)
		{
			assertEquals("Copper", deck.cardAt(itr).getName().toString());
		}
		
		for(int itr = 9; itr >= 7; itr--)
		{
			assertEquals("Estate", deck.cardAt(itr).getName().toString());
		}
	}
}
