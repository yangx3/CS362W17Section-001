package org.cs362.dominion;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;

public class DeckTest {
	private Deck deck;
	
	@Before 
	public void beforeEach()
	{
		deck = new Deck();
	}
	
	@Test
	public void Size()
	{
		assertEquals(0, deck.size());
		deck.addCardToTop(new Card());
		assertEquals(1, deck.size());
	}
	
	@Test
	public void Embargoed()
	{
		assertFalse(deck.getEmbargoStatus());
		deck.toggleEmbargo();
		assertTrue(deck.getEmbargoStatus());
		deck.toggleEmbargo();
		assertFalse(deck.getEmbargoStatus());
	}
	
	@Test
	public void EmptyDeck()
	{
		assertTrue(deck.isEmpty());
		deck.addCardToBottom(new Card());
		assertFalse(deck.isEmpty());
	}
	
	@Test
	public void CardAt()
	{
		try {
			deck.cardAt(0);
			fail("Expecting IndexOutOfBoundsException");
		}catch(IndexOutOfBoundsException e){
			assertEquals("Error: index out of bounds", e.getMessage());
		}
		
		try {
			deck.cardAt(-1);
			fail("Expecting IndexOutOfBoundsException");
		}catch(IndexOutOfBoundsException e){
			assertEquals("Error: index out of bounds", e.getMessage());
		}
		
		Card card1 = new Card(Card.Name.Adventurer, Card.Type.Action, 6, 0, 0, 0, 0, 0);
		deck.addCardToTop(card1);
		
		try {
			Card card = deck.cardAt(0);
			assertEquals(card1, card);
		}catch(IndexOutOfBoundsException e){
			fail("Expecting card to exist");
		}
		
	}
	
	@Test
	public void GetTopCard()
	{
		try {
			deck.getTopCard();
			fail("Expecting IndexOutOfBoundsException");
		}catch(IndexOutOfBoundsException e){
			assertEquals("Error: index out of bounds", e.getMessage());
		}
		
		Card card1 = new Card(Card.Name.Adventurer, Card.Type.Action, 6, 0, 0, 0, 0, 0);
		Card card2 = new Card(Card.Name.Ambassador, Card.Type.Action, 6, 0, 0, 0, 0, 1);
		
		deck.addCardToTop(card1);
		deck.addCardToBottom(card2);
		
		try {
			Card card = deck.getTopCard();
			assertEquals(card1, card);
		}catch(IndexOutOfBoundsException e){
			fail("Expecting card to exist");
		}
	}
	
	@Test
	public void GetBottomCard()
	{
		try {
			deck.getBottomCard();
			fail("Expecting IndexOutOfBoundsException");
		}catch(IndexOutOfBoundsException e){
			assertEquals("Error: index out of bounds", e.getMessage());
		}
		
		Card card1 = new Card(Card.Name.Adventurer, Card.Type.Action, 6, 0, 0, 0, 0, 0);
		Card card2 = new Card(Card.Name.Ambassador, Card.Type.Action, 6, 0, 0, 0, 0, 1);
		
		deck.addCardToTop(card1);
		deck.addCardToBottom(card2);
		Card card;
		try {
			card = deck.getBottomCard();
			assertEquals(card2, card);
		}catch(IndexOutOfBoundsException e){
			fail("Expecting card to exist");
		}
		
		
	}

	@Test
	public void Constructor()
	{
		deck = null;
		assertNull(deck);
		deck = new Deck(Builder.buildGeneralDecks());
		assertNotNull(deck);
		assertEquals(20, deck.size());
		for(int itr = 0; itr < deck.size(); itr++)
		{
			assertNotNull(deck.cardAt(itr));
		}
	}

	@Test
	public void Draw()
	{
		
		try {
			deck.draw();
			fail("Expecting IndexOutOfBoundsException");
		}catch(IndexOutOfBoundsException e){
			assertEquals("Error: index out of bounds", e.getMessage());
		}
		
		deck = new Deck(Builder.buildGeneralDecks());
		Card card = null;
		try {
			card = deck.draw();
			assertNotNull(card);
		}catch(IndexOutOfBoundsException e){
			fail("Expecting card to exist");
		}
	}

	@Test
	public void GetDeck()
	{
		assertEquals(true, deck.isEmpty());
		deck = new Deck(Builder.buildGeneralDecks());
		assertEquals(false, deck.isEmpty());
	}

	@Test
	public void FilterBy()
	{
		
		Deck tempDeck = null;
		
		try {
			tempDeck = deck.filterBy(Card.Type.Victory, Card.Type.ActionVictory);
			fail("Expecting exception to throw");
		}catch(IndexOutOfBoundsException e)
		{
			assertEquals("Error: index out of bounds", e.getMessage());
			assertNull(tempDeck);
		}
		
		deck = Builder.buildPlayerStartDeck();
		
		try {
			tempDeck = deck.filterBy(Card.Type.Victory, Card.Type.ActionVictory);
			assertNotNull(tempDeck);
		}catch(IndexOutOfBoundsException e)
		{
			fail("Expecting card to exist");
		}
		
		for(int itr = 0; itr < tempDeck.size(); itr++)
		{
			boolean good = false;
			try {
				if(tempDeck.cardAt(itr).getType() == Card.Type.Victory || 
						tempDeck.cardAt(itr).getType() == Card.Type.ActionVictory)
				{
					good = true;
				}
			}catch(IndexOutOfBoundsException e)
			{
				fail("Expecting all cards to exist");
			}
			
			assertTrue(good);	
		}
	}

	@Test
	public void Compare()
	{
		Card card = null;
		try {
			card = deck.compare("Witch");
			fail("Expecting thrown exception");
		}catch(IndexOutOfBoundsException e)
		{
			assertEquals("Error: index out of bounds", e.getMessage());
			assertNull(card);
		}
		
		deck = new Deck(Builder.buildGeneralDecks());
		
		try {
			card = deck.compare("Adventurer");
			assertNotNull(card);
			assertEquals(Card.Name.Adventurer, card.getName());	
		}catch(IndexOutOfBoundsException e)
		{
			fail("Expecting card to exist");
		}
			
		
	}

	@Test
	public void RemoveCard()
	{
		Deck tempDeck = null;
		Card card = new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0);
		
		try {
			
			for(int itr = 0; itr < 6; itr++)
			{
				tempDeck.addCardToTop(deck.removeCard(card));
			}
			fail("Expecting exception to throw");
			
		}catch(IndexOutOfBoundsException e)
		{
			assertEquals("Error: index out of bounds", e.getMessage());
		}
		
	}

//	@Test
//	public void AddCardToTop()
//	{
//		assertTrue(deck.isEmpty());
//		deck.addCardToTop(new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0));
//		assertFalse(deck.isEmpty());
//		
//		Card card = new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0);
//		assertEquals(card.getName(), deck.getTopCard().getName());
//	}
//
//	@Test
//	public void AddCardToBottom()
//	{
//		assertTrue(deck.isEmpty());
//		deck.addCardToBottom(new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0));
//		assertFalse(deck.isEmpty());
//		
//		Card card = new Card(Card.Name.Copper, Card.Type.Treasure, 0, 1, 0, 0, 0, 0);
//		assertEquals(card.getName(), deck.getBottomCard().getName());
//	}
//
//	@Test
//	public void Shuffle()
//	{
//		deck = Builder.buildPlayerStartDeck();
//		Deck compareDeck = Builder.buildPlayerStartDeck();
//		boolean equal = true;
//		
//		for(int itr = 0; itr < deck.size(); itr++)
//		{
//			assertEquals(deck.cardAt(itr).getName(), compareDeck.cardAt(itr).getName());
//			equal = true;
//		}
//		
//		deck.shuffle();
//		
//		for(int itr = 0; itr < deck.size(); itr++)
//		{
//			if(deck.cardAt(itr).getName() != compareDeck.cardAt(itr).getName())
//			{
//				equal = false;
//			}
//		}
//		
//		assertFalse(equal);
//	}
//
//	@Test
//	public void ToString()
//	{
//		deck = Builder.buildPlayerStartDeck();
//		assertEquals(deck.cardAt(0).toString(), "Copper");
//	}
}
