import org.junit.Test;

public class PlayerTest {

	@Test
	public void testShuffleDiscard() {
		CardSupply testSupply=new CardSupply();
		Player testPlayer= new Player(testSupply);
		testPlayer.discard.addCard("estate", 5);
		testPlayer.shuffleDiscard();
		assert(testPlayer.deckSize(testPlayer.discard)==0);
				
	}

	@Test
	public void testDrawCard() {
		CardSupply testSupply=new CardSupply();
		Player testPlayer= new Player(testSupply);
		Card card=testPlayer.drawCard();
		assert(card!=null);
	}

	@Test
	public void testDeckSize() {
		CardSupply testSupply=new CardSupply();
		Player testPlayer= new Player(testSupply);
		assert(testPlayer.deckSize(testPlayer.drawPile)==10);
	}


}
