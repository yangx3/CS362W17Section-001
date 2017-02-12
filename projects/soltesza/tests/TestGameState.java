import org.junit.Test;

import java.util.Vector;

public class TestGameState {
	@Test
	public void testGameState() {
		DominionBoard board = new DominionBoard();
		GameState state = new GameState(board);
		
		Player curr = state.currentPlayer;
		state.TakeTurn();
		assert !curr.equals(state.currentPlayer);
		assert curr.equals(state.otherPlayer);
	}
}
