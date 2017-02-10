package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmbassadorTest {

	@Test
	public void testValues() {
		
		Card test = new Ambassador();
		assertEquals("Ambassador name doesn't match",
				"Ambassador", test.getName());
		assertEquals("Ambassador cost doesn't match",
				3, test.getCost());
		assertEquals("Ambassador victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Ambassador value doesn't match",
				0, test.getTreasure());
		assertTrue("Ambassador type doesn't match",
				test.isCardType(CardType.Action));
		assertTrue("Ambassador type doesn't match",
				test.isCardType(CardType.Attack));
		
	}

}
