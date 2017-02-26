package test.org.cs362.dominion;

import main.org.cs362.dominion.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class testCARD
{
	@Test
	public void test() throws Throwable {
		Randomness.reset(System.currentTimeMillis());
		GameState state;
		List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Player testPlayer = new Player(state, "test-player-1");
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Baron));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Council_Room));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Feast));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Gardens));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Mine));

		
		state.addPlayer(testPlayer);
		testPlayer = new Player(state, "test-player-2");
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Baron));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Council_Room));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Feast));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Gardens));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Mine));
		state.addPlayer(testPlayer);
		state.prepTestGame();
		
		assertEquals( state.players.get(0).hand.size(), 8);
	}
}
