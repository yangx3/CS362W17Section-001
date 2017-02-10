package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class MineTest {

	@Test
	public void testValues() {
		
		Card test = new Mine();
		assertEquals("Mine name doesn't match",
				"Mine", test.getName());
		assertEquals("Mine cost doesn't match",
				5, test.getCost());
		assertEquals("Mine victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Mine value doesn't match",
				0, test.getTreasure());
		assertTrue("Mine type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
