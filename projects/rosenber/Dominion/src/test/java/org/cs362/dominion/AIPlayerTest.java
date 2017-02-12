package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class AIPlayerTest {

	Player test;
	
	@Test
	public void testConstructorString() {
		
		test = new AIPlayer(1);
		
		assertEquals("Name doesn't match name given",
				"Robert", test.getName());
		assertEquals("Hand isn't empty",
				0, test.hand.size());
		assertEquals("Deck isn't empty",
				0, test.deck.size());
		assertEquals("Discard isn't empty",
				0, test.discard.size());
	}

}
