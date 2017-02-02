package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class DeckTest {

	private Deck test;

	private Card createCard(String name){
		ArrayList<CardType> type = new ArrayList<CardType>();
		type.add(CardType.Action);
		return new Card(name, 1, 2, 3, type);
	}
	
	@Test
	public void testName() {
		test = new Deck("Test Deck");
		assertEquals("The deck's name didn't get set correctly",
				test.getName(), "Test Deck");
		
		test.setName("Changed Name");
		assertEquals("setName didn't change the name correctly",
				test.getName(), "Changed Name");
		
		test = new Deck();
		assertEquals("empty name not assigned in deck without String",
				test.getName(), "");
	}

	@Test 
	public void testAddingCards(){
		
		test = new Deck("Test Deck");
		assertEquals("The deck isn't empty",
				test.size(), 0);
		
		test.addTop(createCard("One"));
		assertEquals("There should be one card in the deck",
				test.size(), 1);
		assertEquals("One card in deck, top doesn't match bottom",
				test.getBottom(), test.getTop());
		
		Card c = createCard("Two");
		test.addBottom(c);
		assertEquals("Bottom card doesn't equal card added",
				test.getBottom(), c);
		assertFalse("Top card is the same as the bottom",
				test.getBottom() == test.getTop());
		
		test.removeBottom();
		assertFalse("The bottom card wasn't removed correctly",
				test.getBottom() == c);
		assertEquals("There should be 1 card", 
				test.size(), 1);
		
		assertTrue("The top card isn't in the deck",
				test.isCard(test.getTop()));
		assertEquals("Couldn't find the top card",
				test.getTop(), test.findSpecific(test.getTop()));
		
		test.removeTop();
		assertEquals("No cards should be in deck",
				test.size(), 0);
		
		c = createCard("Three");
		test.addTop(c);
		test.removeSpecific(c);
		assertFalse("Card shouldn't be found in the deck",
				test.isCard(c));

		assertNull("Found a card not in the deck", 
				test.findSpecific(c));
		assertNull("Returned a card not in the deck",
				test.getSpecific(c));
		
		test.addBottom(c);
		assertEquals("Couldn't find a specific card",
				c, test.getSpecific(c));
		
		test.removeSpecific(c);
		assertFalse("Found card in deck that isn't in the deck",
				test.isCard(c));
		try{
		test.removeSpecific(c);
		}
		catch(Exception e){
			fail("remove specific card crashed when removing card not in deck");
		}
		
		test.addBottom(c);
		Card drawn = test.drawBottom();
		assertEquals("Card not removed after drawn from bottom",
				test.size(), 0);
		assertEquals("Bottom drawn card doesn't equal added card",
				drawn, c);
		
		c = createCard("asdf");
		test.addTop(c);
		drawn = test.drawTop();
		assertEquals("Card not removed after drawn from top",
				test.size(), 0);
		assertEquals("Top drawn card doesn't equal added card",
				drawn, c);
		
	}
}
























