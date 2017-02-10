package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdventurerTest {

	@Test
	public void testValues() {
		
		Card test = new Adventurer();
		assertEquals("Adventurer name doesn't match",
				"Adventurer", test.getName());
		assertEquals("Adventurer cost doesn't match",
				6, test.getCost());
		assertEquals("Adventurer victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Adventurer value doesn't match",
				0, test.getTreasure());
		assertTrue("Adventurer type doesn't match",
				test.isCardType(CardType.Action));
		
	}
}
