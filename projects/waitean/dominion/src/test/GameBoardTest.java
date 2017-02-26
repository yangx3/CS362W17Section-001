package waitean.DominionMaven;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;


public class GameBoardTest {

	@Test
	public void testInitializeGame() {
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("One"));
		players.add(new Player("Two"));
		GameBoard board = new GameBoard(players);
		assertEquals(board.getPiles().size(), 17);
		assertEquals(board.getPlayers().size(), 2);
	}

	@Test
	public void testIsGameOver() {
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("One"));
		players.add(new Player("Two"));
		GameBoard board = new GameBoard(players);
		ArrayList<Pile> piles = board.getPiles();
		for (int i = 0; i < 8; i++)	
			piles.get(0).aquireCard();
		assertEquals(board.isGameOver(), true);
		board.initializeGame(players);
		assertEquals(board.isGameOver(), false);
		for (int i = 0; i < 10; i++) {
			piles.get(piles.size()-1).aquireCard();
			piles.get(piles.size()-2).aquireCard();
			piles.get(piles.size()-3).aquireCard();
		}
		assertEquals(board.isGameOver(), true);
	}
}
