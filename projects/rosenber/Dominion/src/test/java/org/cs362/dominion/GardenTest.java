package org.cs362.dominion;

import static org.junit.Assert.*;
import org.junit.Test;

public class GardenTest {

	@Test
	public void testValues() {
		
		Card test = new Garden();
		assertEquals("Garden name doesn't match",
				"Garden", test.getName());
		assertEquals("Garden cost doesn't match",
				4, test.getCost());
		assertEquals("Garden victory points doesn't match",
				1, test.getVictoryPoints());
		assertEquals("Garden value doesn't match",
				0, test.getTreasure());
		assertTrue("Garden type doesn't match",
				test.isCardType(CardType.Victory));
		
	}

	@Test
	public void testVictoryPointCalculation(){
		Player p = new AIPlayer(1);
		Card c = new Garden();
		p.giveCard(c);
		for(int j=1; j<11; j++){
			assertEquals("Garden point value ("+p.getVictoryPoints()+
					") doesn't match expected ("+j/10+")",
					j/10, p.getVictoryPoints());
			p.giveCard(new Copper());
		}
	}
	
}
