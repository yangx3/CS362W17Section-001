import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Test;


public class GameBoardTest {
// tests the variable changing during the game-play
	@Test
	public void test() {
//		JFrame board = new JFrame ("Dominion Board Test");
//		board.getContentPane().add(new GameBoard());
//		board.pack();
		GameBoard board = new GameBoard();
		
		board.Setup();
		for (int i = 0; i < 100; i++)
		{
			board.nextPhase();
		}
	}

}
