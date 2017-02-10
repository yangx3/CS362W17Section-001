package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalvagerTest {

	@Test
	public void testValues() {
		
		Card test = new Salvager();
		assertEquals("Salvager name doesn't match",
				"Salvager", test.getName());
		assertEquals("Salvager cost doesn't match",
				4, test.getCost());
		assertEquals("Salvager victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Salvager value doesn't match",
				0, test.getTreasure());
		assertTrue("Salvager type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
