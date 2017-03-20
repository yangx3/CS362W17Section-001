package dominion;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class initGameTest {

	@Test
	public void test() {
		List < Card > cards;
        GameState state, testState;
        Randomness.reset(10);

        //		 // initialize a game state and player cards
        cards = new ArrayList < Card > (Card.createCards());
        state = new GameState(cards);
        //			
        Player player = new Player(state, "player-1");
        player.numActions = 1;
        state.addPlayer(player);
        Player player2 = new Player(state, "player-2");
        state.addPlayer(player2);

        //Initialize the game!
        state.initializeGame();
        assertTrue(state.players.size() < 5);
        assertTrue(state.players.size() > 1);
        assertFalse(state.isGameOver());
        state.players.get(0).initializePlayerTurn();
        for(int i = 0; i < state.players.get(0).hand.size(); i++){
        	state.players.get(0).discard(state.players.get(0).hand.get(0));
        }
        assertEquals(state.players.get(0).hand.size(), 5);
        state.players.get(0).playTtreasureCard();
        assertEquals(state.players.get(0).coins, 2);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 0);
        assertTrue(state.isGameOver());
	}

}
