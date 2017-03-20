import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;
import org.junit.Test;

public class dominionTest
{
	@Test
	public void testDominionConstructor()
	{
		Dominion testGame = new Dominion(100);
		assertNotNull(testGame.playerCount);
		assertEquals(7, testGame.basicCards.size());
		assertEquals(10, testGame.kingdomCards.size());
	}

	@Test
	public void testDominionProvinceGameOver()
	{
		Dominion testGame = new Dominion(100);
		assertNotNull(testGame.playerCount);
		assertFalse(testGame.gameOver());
		testGame.basicCards.get(5).setSize(0);
		assertTrue(testGame.gameOver());
	}

	@Test
	public void testDominionPileGameOver()
	{
		Dominion testGame = new Dominion(100);
		assertNotNull(testGame.playerCount);
		assertFalse(testGame.gameOver());
		testGame.kingdomCards.get(0).setSize(0);
		testGame.kingdomCards.get(1).setSize(0);
		testGame.kingdomCards.get(2).setSize(0);
		testGame.kingdomCards.get(3).setSize(0);
		testGame.kingdomCards.get(4).setSize(0);
		assertTrue(testGame.gameOver());
	}
}

