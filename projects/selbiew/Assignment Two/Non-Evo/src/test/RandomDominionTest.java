import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomDominionTest {
	@Test
	public void testGame() {
		for(int h = 0; h < 5; h++) {
			Random rand = new Random();
			int seed = 10;							//Player Count
			int playerNum = rand.nextInt(3) + 2;	//Between 2 and 4 (inclusive)
			DomGame table = new DomGame(seed, playerNum, true);
			table.play();
		
			assertTrue(table.playerCount >= 2 && table.playerCount <= 4);				//Check correct number of players
			for(int i = 0; i < table.playerCount; i++) {								//Ensure correct winner
				assertTrue(table.getWinner().VP >= table.players[i].VP);
			}
		
			assertTrue(table.basicCards.get(6).size == 0);		//Provinces have all been taken						//Check that the (only likely) win condition is met
		}
	}
}
