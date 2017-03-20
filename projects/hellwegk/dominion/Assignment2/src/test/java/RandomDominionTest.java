import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RandomDominionTest {

	@Test
	public void DominionRandomTest(){
		//Play 8 complete games of dominion
		for (int i = 0; i < 8; i++)
		{
			int seed = 10 + i; //Increase the seed by 1 each game
			Randomness.reset(seed);
			List<Integer> numPlayers = new ArrayList<Integer>();
			numPlayers.add(2);
			numPlayers.add(3);
			numPlayers.add(4);
			int numPlayersForGame = Randomness.randomMember(numPlayers); // Chooses 2, 3, or 4 player game
			
			DominionBoard game = new DominionBoard(numPlayersForGame, seed); // Sets up a new game
			
			int totalCardsBefore;
			int totalCardsAfter;
			
			int turn = 0;
			List<Integer> actionCardIndices;
			System.out.println("");
			System.out.println("STARTING NEW GAME!");
			while(!game.gameOver())
			{
				System.out.println("");
				game.players.get(turn).newTurn();
				
				//ACTION
				while(game.players.get(turn).actionInHand() && game.players.get(turn).actionsLeft())
				{
					actionCardIndices = game.players.get(turn).actionCardIndices();
					if (actionCardIndices.size() > 0)
					{
						int index = Randomness.nextRandomInt(actionCardIndices.size());
						game.players.get(turn).playCard(actionCardIndices.get(index), game);
						assertTrue(true, game);
					}
				}
				
				//BUY
				totalCardsBefore = game.players.get(turn).getDeck().size() + game.players.get(turn).getDiscard().size() + 
						game.players.get(turn).getCardsPlayed().size() + game.players.get(turn).getHand().size();
				game.players.get(turn).treasureInHand();
				while(game.players.get(turn).currentBuys())
				{
					if(game.getHighestValueCards(game.players.get(turn).getCoins()).size() > 0)
					{
						game.players.get(turn).buyCard(game.players.get(turn).buyRandomCard(game), game);
					}
				}
				totalCardsAfter = game.players.get(turn).getDeck().size() + game.players.get(turn).getDiscard().size() + 
						game.players.get(turn).getCardsPlayed().size() + game.players.get(turn).getHand().size();
				assertTrue(totalCardsAfter >= totalCardsBefore + 1, game); //Checks to make sure at least one card is bought, so overall number of cards should be greater
				//CLEAN UP
				game.players.get(turn).discardCardsEndTurn();
				assertTrue(game.players.get(turn).getHand().size() == 0, game); //Checks to make sure hand size is 0 after cleanup phase

				
				//NEXT PLAYER
				turn++;
				if(turn >= game.players.size())
				{
					turn = 0;
				}
			}
			
			//END GAME
			game.finalScores();
			
		}
	}
	
	
	public void assertTrue(boolean b, DominionBoard board)
	{
		if (b)
		{
			System.out.println("TEST SUCCESSFUL!!!");
			printGameState(board);
		}
		else 
		{
			System.out.println("TEST FAILED...");
			printGameState(board);
			
		}
	}
	
	public void printGameState(DominionBoard board)
	{
		for(Player player : board.getPlayers())
		{
			System.out.println("Player: " + player.getName());
			System.out.println("Coins: " + player.getCoins());
			System.out.println("Actions: " + player.getActions());
			System.out.println("Buys: " + player.getBuys());
			System.out.println("Hand size: " + player.getHand().size());
			System.out.println("Deck size: " + player.getDeck().size());
			System.out.println("Discard pile size: " + player.getDiscard());
			System.out.println("Number of cards player: " + player.getCardsPlayed());
		}
	}
	
}
