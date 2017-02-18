package maven.dominion_v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

public class GameStateTest extends TestCase {

	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);
	int random = (int)Randomness.random.nextInt(cards.size());
	Card tmp = cards.get(random);
	Player player1 = new Player(state, "player-1");
	Player player2 = new Player(state, "player-2");
	
	
	public void testAddPlayer() {
		state.addPlayer(player1);
		state.addPlayer(player2);
		assert(state.players.size() == 2);
	}

	
	public void testInitializeGame() {
		state.initializeGame(10);
		//System.out.println(GameState.gameBoard.size());
		if(GameState.gameBoard.size() == 60)
		{
			System.out.println("Board created correctly");
		}
	}
		

	
	public void testPlay() {
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame(10);
		HashMap<Player, Integer> winners=state.play();
		if(winners.get(player1) == player1.scoreFor())
		{
			System.out.println("Player 1 score is correct");
		}
		if(winners.get(player2) == player2.scoreFor())
		{
			System.out.println("Player 2 score is correct");
		}
		
		
	}
}
