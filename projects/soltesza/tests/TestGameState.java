import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Vector;

public class TestGameState {
	@Test
	public void testGameState() {
		DominionBoard board = new DominionBoard();
		GameState state = new GameState(board);
		
		Player curr = state.currentPlayer;
		state.TakeTurn();
		assertFalse(curr.equals(state.currentPlayer));
		assertTrue(curr.equals(state.otherPlayer));
	}
}
