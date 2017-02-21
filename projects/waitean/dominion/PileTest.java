package waitean.DominionMaven;
import static org.junit.Assert.*;

import org.junit.Test;


public class PileTest {

	@Test
	public void testAquireCard() {
		Card newCard = new Card(Card.CardName.Estate, Card.CardType.VICTORY, 2);
		Pile newPile = new Pile(newCard, 10);
		assertEquals(newPile.getNumber(), 10);
		newPile.aquireCard();
		assertEquals(newPile.getNumber(), 9);
		newPile = new Pile(newCard, 0);
		newPile.aquireCard();
		assertEquals(newPile.getNumber(), 0);
	}

	@Test
	public void testBuyCard() {
		Card newCard = new Card(Card.CardName.Estate, Card.CardType.VICTORY, 2);
		Pile newPile = new Pile(newCard, 10);
		assertEquals(newPile.buyCard(2), 1);
		assertEquals(newPile.getNumber(), 9);
		newPile.embargoPile();
		assertEquals(newPile.buyCard(2), 2);
		assertEquals(newPile.buyCard(0), 0);
		newPile = new Pile(newCard, 0);
		assertEquals(newPile.buyCard(2), 0);
	}
}
