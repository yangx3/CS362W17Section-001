package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmbargoTest {

	@Test
	public void testValues() {
		
		Card test = new Embargo();
		assertEquals("Embargo name doesn't match",
				"Embargo", test.getName());
		assertEquals("Embargo cost doesn't match",
				2, test.getCost());
		assertEquals("Embargo victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Embargo value doesn't match",
				0, test.getTreasure());
		assertTrue("Embargo type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
