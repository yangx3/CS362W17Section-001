package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class VillageTest {

	@Test
	public void testValues() {
		
		Card test = new Village();
		assertEquals("Village name doesn't match",
				"Village", test.getName());
		assertEquals("Village cost doesn't match",
				3, test.getCost());
		assertEquals("Village victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Village value doesn't match",
				0, test.getTreasure());
		assertTrue("Village type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
