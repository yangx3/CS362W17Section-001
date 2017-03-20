
public class PlayGame {
	
	public static void main(String args[])
	{
		int seed = Randomness.nextRandomInt(1000);
		DominionBoard game = new DominionBoard(3, seed);		
		game.play();
	}
	
}
