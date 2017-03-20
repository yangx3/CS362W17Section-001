import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;

public class pileTest
{
	@Test
	public void testPileDefualtConstructor()
	{
		Pile testPile = new Pile();
		assertEquals(0,testPile.size);
		assertEquals(0,testPile.value);
		assertEquals(0,testPile.points);
		assertEquals(0,testPile.embargos);
	}

	@Test
	public void testPileNamedConstructor()
	{
		Pile testPile = new Pile(new Copper(), 100, "Copper");
		assertEquals(100,testPile.size);
		assertEquals("Copper",testPile.name);
	}

	@Test
	public void testPileAddRemoveCard()
	{
		Pile testPile = new Pile();
		assertEquals(0,testPile.size);
		testPile.addCard(new Copper());
		assertEquals(1,testPile.size);
		testPile.removeCard(0);
		assertEquals(0, testPile.size);
	}
}

