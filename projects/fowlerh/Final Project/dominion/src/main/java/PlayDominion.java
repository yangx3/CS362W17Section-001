
public class PlayDominion {
	
	
		
	public  static void main(String args[])
	{
			// First 10
	       
	       int seed = Randomness.nextRandomInt(1000);
	       
	       GameBoard gb = new GameBoard(2, seed);
	       
	       gb.play();
	       
	       
	}
		
}
