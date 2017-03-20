import org.cs362.dominion.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import java.util.Random;

public class RandomTester {
	@Test
	public void test() throws Throwable {
		Randomness.reset(System.currentTimeMillis());
		GameState state;
		List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Player testPlayer = new Player(state, "test-player-1");
		
		int random = (int)  Randomness.random.nextInt(8);
		
		switch (random) {
		
		case 1: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
				break;
		case 2: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
				break;
		case 3: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Baron));
			    break;
		case 4: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Council_Room));
				break;
		case 5: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Feast));
				break;
		case 6: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Gardens));
				break;
		case 7: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));
				break;
		case 8: testPlayer.hand.add(Card.getCard(cards,Card.CardName.Mine));
		default: 
			System.out.println(random);
		}
		state.addPlayer(testPlayer);

		System.out.println("Test 2 initialized");
		assertEquals( state.players.get(0).hand.size(), 1);
		System.out.println("Test 2 complete");

	}

}

