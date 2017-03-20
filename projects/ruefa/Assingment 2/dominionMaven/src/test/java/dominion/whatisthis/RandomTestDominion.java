package dominion.whatisthis;

import dominion.Card;
import dominion.Player;
import dominion.dominionBoard;
import dominion.Card.Name;
import dominion.Card.Type;
import java.util.Random;

public class RandomTestDominion {
	public static void main(String args[]){
		Random rand = new Random();
		int numPlayers;
		for(int i=0;i<20;i++)
		{
			numPlayers = rand.nextInt(3)+2;
			new dominionBoard(numPlayers);
			dominionBoard.start();
		}
	}
}
