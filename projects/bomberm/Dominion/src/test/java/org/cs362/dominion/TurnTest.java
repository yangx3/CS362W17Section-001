import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

public class TurnTest {

	@Test
	public void testBuyCards() {
		CardSupply supply = new CardSupply();
		Player player = new Player(supply);
		Turn testPurchase= new Turn(player, supply);
		int previous = player.deckSize(player.discard);
		testPurchase.buyCards(player, supply);
		assertTrue(previous!=player.deckSize(player.discard));
		
	}

	@Test
	public void testEndTurn() {
		CardSupply supply = new CardSupply();
		Player player = new Player(supply);
		Turn testEndTurn= new Turn(player, supply);
		testEndTurn.endTurn(player);
		assert(testEndTurn.hand.size()==0);
	}

	@Test
	public void testPlayAction() {
		CardSupply supply = new CardSupply();
		Player player = new Player(supply);
		Turn testAction= new Turn(player, supply);
		testAction.hand.add(new Card("embargo"));
		int previous = testAction.hand.size();
		testAction.playAction(player, player, supply);
		assertTrue(previous!=testAction.hand.size());
	}

}
