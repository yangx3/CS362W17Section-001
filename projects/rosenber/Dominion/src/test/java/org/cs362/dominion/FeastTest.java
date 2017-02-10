package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FeastTest {

	@Test
	public void testValues() {
		
		Card test = new Feast();
		assertEquals("Feast name doesn't match",
				"Feast", test.getName());
		assertEquals("Feast cost doesn't match",
				4, test.getCost());
		assertEquals("Feast victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Feast value doesn't match",
				0, test.getTreasure());
		assertTrue("Feast type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
