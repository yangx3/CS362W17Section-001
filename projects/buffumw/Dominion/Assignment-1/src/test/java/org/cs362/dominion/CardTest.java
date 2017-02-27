package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void defaultConstructor() {
		Card card = new Card();
		assertNull(card.getName());
		assertNull(card.getType());
		assertEquals(Integer.valueOf(0), card.getCost());
		assertEquals(Integer.valueOf(0), card.getCoinsWorth());
		assertEquals(Integer.valueOf(0), card.getPoints());
		assertEquals(Integer.valueOf(0), card.getActions());
		assertEquals(Integer.valueOf(0), card.getBuys());
		assertEquals(Integer.valueOf(0), card.getCards());
		assertNull(card.getDescription());
	}
	
	@Test
	public void nonDefaultConstructor()
	{
		//Name name, Type type, int cost, int coinsWorth, int points, int actions, int buys, int cards
		Card card = new Card(Card.Name.Province, Card.Type.Victory, 8, 0, 8, 0, 0, 0);
		assertEquals(Card.Name.Province, card.getName());
		assertEquals(Card.Type.Victory, card.getType());
		assertEquals(Integer.valueOf(8), card.getCost());
		assertEquals(Integer.valueOf(0), card.getCoinsWorth());
		assertEquals(Integer.valueOf(8), card.getPoints());
		assertEquals(Integer.valueOf(0), card.getActions());
		assertEquals(Integer.valueOf(0), card.getBuys());
		assertEquals(Integer.valueOf(0), card.getCards());
		assertEquals("+6 Victory points", card.getDescription());
		assertEquals(Card.Name.Province.toString(), card.toString());
	}

}
