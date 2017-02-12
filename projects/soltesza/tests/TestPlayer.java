import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Vector;

public class TestPlayer {
	@Test
	public void testPlayer() {
		DominionBoard board = new DominionBoard();
		GameState state = new GameState(board);
		Player player = new Player("Player", board);
		
		assert player.GetName() == "Player";
		
		int count = player.deck.GetCardCount();
		player.TakeTurn(state);
		assert count < player.deck.GetCardCount();
		
		//test GainCurse
		int score = player.GetScore();
		player.GainCurse();
		assert score > player.GetScore();
		
		//test TrashFromHand
		int handSize = player.deck.GetHand().size();
		player.TrashFromHand();
		assert handSize > player.deck.GetHand().size();
		
	}
}
