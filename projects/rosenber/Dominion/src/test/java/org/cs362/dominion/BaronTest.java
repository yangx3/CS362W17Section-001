package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaronTest {

	@Test
	public void testValues() {
		
		Card test = new Baron();
		assertEquals("Baron name doesn't match",
				"Baron", test.getName());
		assertEquals("Baron cost doesn't match",
				4, test.getCost());
		assertEquals("Baron victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Baron value doesn't match",
				0, test.getTreasure());
		assertTrue("Baron type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
