
public class playDominion
{
	public static void main(String[] args)
	{
		int seed = Integer.parseInt(args[0]);

		Dominion newGame = new Dominion(seed);
		newGame.playGame();
	}
}

