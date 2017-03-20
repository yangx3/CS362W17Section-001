package Dominion.RandomTestDominion;

public class driver {

	public static void main(String[] args)
	{
		//playGame plays either the number of turns given as input, or, if input is 0, a full game
		for (int i = 0; i < 1000; i++)
			Play.playGame(0, 4);
	}

}
