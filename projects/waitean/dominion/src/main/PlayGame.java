package waitean.DominionMaven;
import java.util.ArrayList;

public class PlayGame {
	public static void main(String[] args) {
		Randomness.reset(10);
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("Player_1"));
		players.add(new Player("Player_2"));
		GameBoard board = new GameBoard(players);
		board.play();
		
		System.exit(0);
	}
}
