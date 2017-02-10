package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class CutpurseTest {

	@Test
	public void testValues() {
		
		Card test = new Cutpurse();
		assertEquals("Cutpurse name doesn't match",
				"Cutpurse", test.getName());
		assertEquals("Cutpurse cost doesn't match",
				4, test.getCost());
		assertEquals("Cutpurse victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Cutpurse value doesn't match",
				0, test.getTreasure());
		assertTrue("Cutpurse type doesn't match",
				test.isCardType(CardType.Action));
		assertTrue("Cutpurse type doesn't match",
				test.isCardType(CardType.Attack));
		
	}

}
