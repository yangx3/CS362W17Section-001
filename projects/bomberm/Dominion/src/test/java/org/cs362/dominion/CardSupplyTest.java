import org.junit.Test;

public class CardSupplyTest {

	@Test
	public void testRemoveCard() {
		CardSupply testDeck = new CardSupply();
		testDeck.removeCard("copper");
		assert(testDeck.copper.quantity<46);
	}

	@Test
	public void testAddCardString() {
		CardSupply testDeck = new CardSupply();
		testDeck.addCard("copper");
		assert(testDeck.copper.quantity>46);
	}

	@Test
	public void testHowMany() {
		CardSupply testDeck = new CardSupply();
		int howMany=testDeck.howMany("province");
		assert(howMany==12);
	}

	@Test
	public void testCardVP() {
		CardSupply testDeck = new CardSupply();
		assert(testDeck.cardVP("province")==6);
	}

	@Test
	public void testAddCardStringInt() {
		CardSupply testDeck = new CardSupply();
		testDeck.addCard("copper", 54);
		assert(testDeck.copper.quantity==100);
	}

	@Test
	public void testEndgame() {
		CardSupply testDeck = new CardSupply();
		testDeck.province.quantity=0;
		assert(testDeck.endgame());
		testDeck = new CardSupply();
		testDeck.copper.quantity=0;
		testDeck.silver.quantity=0;
		testDeck.estate.quantity=0;
		assert(testDeck.endgame());
	}

}
