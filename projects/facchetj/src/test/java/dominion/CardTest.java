package dominion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CardTest {
	Player player1, player2;
	Board plateau;

	@Before
	public void initialize() {
		plateau = new Board(2);
		player1 = new Player(plateau, 1);
		player2 = new Player(plateau, 2);
	}

	@Test
	public void testValue() {
		assertEquals(plateau.pioche_card[0].getValeur(), 1);
		assertEquals(plateau.pioche_card[1].getValeur(), 2);
		assertEquals(plateau.pioche_card[0].getPointV(), 0);

	}

	@Test
	public void testPrix() {
		assertEquals(plateau.pioche_card[0].getPrix(), 0);
		assertEquals(plateau.pioche_card[1].getPrix(), 3);

	}

	@Test
	public void testName() {
		assertEquals(plateau.pioche_card[0].getNom(), "copper");
	}

	@Test
	public void testId() {
		int i;
		for (i = 0; i < 17; i++) {
			assertEquals(plateau.pioche_card[i].getId(), i + 1);
		}
	}

	@Test
	public void testType() {
		assertEquals(plateau.pioche_card[1].getType(), "tresor");
	}

	@Test
	public void testExtraCards() {
		Card carte = new Card(18);
		assertEquals(carte.getNom(), "village");
		carte = new Card(19);
		assertEquals(carte.getNom(), "smithy");
		carte = new Card(20);
		assertEquals(carte.getNom(), "salvager");
		carte = new Card(25);
	}

	@Test
	public void testType2() {
		int i;
		Card carte;
		for (i = 1; i < 21; i++) {
			carte = new Card(i);
			carte.getType();
		}
	}

	@Test
	public void testCurseBug() {
		Card curse = new Card(7);
		assertEquals("curse", curse.getNom());
	}

	@Test
	public void testBugAventurer() {
		Card adventurer = new Card(8);
		assertEquals(0, adventurer.getPointV());
	}
}