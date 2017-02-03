package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class HandTest {

	private Hand test;
	
	private Card createCard(String name){
		ArrayList<CardType> type = new ArrayList<CardType>();
		type.add(CardType.Action);
		return new Card(name, 1, 2, 3, type);
	}
	
	@Test
	public void testHand() {
		
		test = new Hand();
		assertEquals("New hand isn't size 0",
				test.size(), 0);
		
		Card c = createCard("one");
		test.addCard(c);
		assertEquals("Hand didn't update size with one card added",
				test.size(), 1);
		assertTrue("Card not found in hand", test.inHand(c));
		
		test.removeCard(c);
		assertFalse("Card found in hand after being removed",
				test.inHand(c));
		
		test.addCard(c);
		test.removeCard(0);
		assertFalse("Card found in hand after being removed by idx",
				test.inHand(c));
		
		test.addCard(c);
		assertEquals("Didn't get card from hand",
				c, test.getCard(c));
		assertEquals("Didn't get card from hand by idx",
				c, test.getCard(0));
		
		Card drawn = test.playCard(c);
		assertEquals("Card not removed after played",
				0, test.size());
		assertEquals("Card played doesn't match card chosen",
				drawn, c);
		
		c = createCard("two");
		test.addCard(c);
		drawn = test.playCard(0);
		assertEquals("Card not removed after played",
				0, test.size());
		assertEquals("Card played doesn't match card chosen",
				drawn, c);
		
		try{
			test.print();
		}
		catch(Exception e){
			fail("Print function crashed");
		}
		try{
			test.removeCard(createCard("fake"));
		}
		catch(Exception e){
			fail("removeCard crashed when trying to remove card not in hand");
		}
	}
}



















