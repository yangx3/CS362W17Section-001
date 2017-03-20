package org.cs362.dominion.Dominion;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	GameState g;
	Player p;
	
	@Before
	public void beforePlayerTest() {
		g = new GameState(1, 1, false);
		p = g.players.get(0);
		g.clean();
		p.clean();
	}
	
	@Test
	public void testPlayer() {
		p = new Player("Tester", true, g, 1, 1);
		assertEquals(p.name, "Tester");
		assertEquals(p.bot, true);
		assertEquals(p.gameState, g);
		assertEquals(p.getHandSize(), 2);
		assertTrue(p.handContains(Card.COPPER));
		assertTrue(p.handContains(Card.ESTATE));
		
		p = new Player("", false, g, 0, 0);
		assertEquals(p.name, "");
		assertEquals(p.bot, false);
		assertEquals(p.getHandSize(), 0);
	}

}
