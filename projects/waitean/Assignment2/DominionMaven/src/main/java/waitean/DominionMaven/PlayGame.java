package waitean.DominionMaven;
import java.util.ArrayList;

public class PlayGame {
	public static void main(String[] args) {
		Randomness.reset(10);
		ArrayList<Player> players = new ArrayList<Player>();
		int numPlayers;
		numPlayers = Randomness.nextRandomInt(3) + 2;
		for (int i = 0; i < numPlayers; i++) {
			players.add(new Player("Player_" + i));
		}
		System.out.println("Main player size" + players.size());
		GameBoard board = new GameBoard(players);
		board.play();
		System.exit(0);
	}
	
	public static void run() {
		Randomness.reset(10);
		ArrayList<Player> players = new ArrayList<Player>();
		int numPlayers;
		numPlayers = Randomness.nextRandomInt(3) + 2;
		for (int i = 0; i < numPlayers; i++) {
			players.add(new Player("Player_" + i));
		}
		GameBoard board = new GameBoard(players);
		board.play();
		System.exit(0);
	}
}
