import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Random;
public class RandomTestDominion {

	@Test
	public void test() {
		GameBoard board = new GameBoard();
		Random gen = new Random();
		int playerTurn = 0;
		int numPlayers = gen.nextInt(10)%3 + 2;
		//Card cardSelect = null;
		//Card actionSelect = null;
		board.Setup(numPlayers);
		
		assertEquals("Action count isn't 1 at the beginning", 1 ,board.player(playerTurn).getActionCount());
		assertEquals("Action count isn't 1 at the beginning", 1 ,board.player(playerTurn).getBuyCount());
		board.player(0).getHand().scroll(false);
		board.player(0).getHand().scroll(true);
		
		while (!(board.gameSupply.getEnd()))
		{		
			assertEquals(false , board.gameSupply.getEnd());
			while (board.player(playerTurn).getActionCount() > 0)
			{
				board.player(playerTurn).getHand().getRandomAction();
				board.player(playerTurn).getSelected();
				board.nextPhase();
			}
			// Attempt Buy
			// Try three times, if fail 3 times then give up.
			int TOTALTRIAL = 3;
			int trial = TOTALTRIAL;
			
			while(board.player(playerTurn).getBuyCount() > 0)
			{
				if (trial > 0)
				{
					trial--;
					if (board.player(playerTurn).getCoins() >= 6 && trial == 0)
					{
						board.supply().setSelected(3);
						board.nextPhase();
						trial = TOTALTRIAL;
					}
					else if (board.player(playerTurn).getCoins() >= 3 && trial == 0)
					{
						board.supply().setSelected(2);
						board.nextPhase();
						trial = TOTALTRIAL;
					}
					else if (board.player(playerTurn).getCoins() < 3)
					{
						board.supply().setSelected(1);
						board.nextPhase();
						trial = TOTALTRIAL;
					}
					else
					{
						board.supply().setSelected(gen.nextInt(17));
						board.nextPhase();
						trial = TOTALTRIAL;
					}	
				}
				else
				{
					board.nextPhase();
					trial = TOTALTRIAL;
				}
			}
			// Cleanup
			board.nextPhase();
			for (int i = 0; i < 5; i++)
			{
				// Tests previously untested code
				assertNotEquals("Must not be null", null, board.player(playerTurn).selectHandIndex(0));
			}
			playerTurn = (playerTurn + 1) % numPlayers;
			//System.out.println(board.player(playerTurn).get);
		}
	}
}
