import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;

public class playerTest
{
	@Test
	public void testPlayerConstructor()
	{
		Player testPlayer = new Player(99);
		assertEquals(99, testPlayer.playerID);
		assertEquals(10, testPlayer.deck.getSize());
		assertEquals(0, testPlayer.hand.getSize());
		assertEquals(0, testPlayer.discard.getSize());
		for(int i=0; i < 10; i++)
		{
			testPlayer.hand.addCard(testPlayer.deck.drawCard());
		}
		assertEquals(10, testPlayer.hand.getSize());
	}

	@Test
	public void testPlayerReset()
	{
		Player testPlayer = new Player(999,999,999);
		testPlayer.reset();
		assertEquals(1, testPlayer.buy);
		assertEquals(1, testPlayer.actions);
		assertEquals(0, testPlayer.money);
	}

	@Test
	public void testPlayerBuy()
	{
		Dominion testGame = new Dominion(100);
		Player testPlayer = new Player(999,999,999);
		testPlayer.buyCard(testGame, testPlayer.money, "Province");
		assertEquals(1,testPlayer.discard.getSize());
	}
}	
		
		

