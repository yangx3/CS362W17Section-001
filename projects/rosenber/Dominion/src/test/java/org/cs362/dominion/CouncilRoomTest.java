package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class CouncilRoomTest {

	@Test
	public void testValues() {
		
		Card test = new CouncilRoom();
		assertEquals("Council Room name doesn't match",
				"Council Room", test.getName());
		assertEquals("Council Room cost doesn't match",
				5, test.getCost());
		assertEquals("Council Room victory points doesn't match",
				0, test.getVictoryPoints());
		assertEquals("Council Room value doesn't match",
				0, test.getTreasure());
		assertTrue("Council type doesn't match",
				test.isCardType(CardType.Action));
		
	}

}
