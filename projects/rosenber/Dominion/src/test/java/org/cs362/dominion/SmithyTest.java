package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmithyTest {

	@Test
	public void testValues() {
		
		Card test = new Smithy();
		assertEquals("Smithy name doesn't match",
				"Smithy", test.getName());
		assertEquals("Smithy cost doesn't match",
				3, test.getCost());
		assertEquals("Smithy victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Smithy value doesn't match",
				0, test.getTreasure());
		assertTrue("smithy type doesn't match",
				test.isCardType(CardType.Action));
		
	}
}
