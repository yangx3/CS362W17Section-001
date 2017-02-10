package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreatHallTest {

	@Test
	public void testValues() {
		
		Card test = new GreatHall();
		assertEquals("Great Hall name doesn't match",
				"Great Hall", test.getName());
		assertEquals("Great Hall cost doesn't match",
				3, test.getCost());
		assertEquals("Great Hall victory points doesn't match",
				1, test.getVictoryPoints());
		assertEquals("Great Hall value doesn't match",
				0, test.getTreasure());
		assertTrue("Great Hall type doesn't match",
				test.isCardType(CardType.Action));
		assertTrue("Great Hall type doesn't match",
				test.isCardType(CardType.Victory));
		
	}

}
