
public class PlayGame {

	public static void main(String[] args) {
		int seed = Integer.parseInt(args[0]);				//Player Count
		int playerNum = Integer.parseInt(args[1]);
		DomGame table = new DomGame(seed, playerNum, false);
		table.play();

	}
}
