package dominion;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class AmbassadorTest {

    //   public  static void main(String args[]) throws CloneNotSupportedException{
    @Test
    public void test0() throws Throwable {
        List < Card > cards;
        GameState state, testState;
        Randomness.reset(7);

        int newCards = 0;
        //		 // initialize a game state and player cards
        cards = new ArrayList < Card > (Card.createCards());
        state = new GameState(cards);
        testState = new GameState(cards);
        //			
        Player player = new Player(state, "player-1");
        Player player3 = new Player(testState, "player-1");
        player.numActions = 1;
        state.addPlayer(player);
        testState.addPlayer(player3);
        Player player2 = new Player(state, "player-2");
        Player player4 = new Player(testState, "player-2");
        state.addPlayer(player2);
        testState.addPlayer(player4);

        //Initialize the game!
        state.initializeGame();
        testState.initializeGame();
        //copy or clone the game state to a test case
        //testState = (GameState) state.clone();
        
        //	play the game 
        System.out.println("hand count = " + state.players.get(0).hand.size());
        state.players.get(0).hand.add(Card.getCard(state.cards, Card.CardName.Ambassador));
        System.out.println("hand count = " + state.players.get(0).hand.size());
        state.players.get(0).playKingdomCard();
        
        //HashMap < Player, Integer > winners = state.play();
        
        System.out.println("  *****    Player-1 Status ***** ");
        System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = between 3-4");
        System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = " + (testState.players.get(0).deck.size() - newCards));
        System.out.println("numActions = " + state.players.get(0).numActions + ", expected = " + (testState.players.get(0).numActions - 1));

        System.out.println("  *****    Player-2 Status *****" );
	    System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()));
	    System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()));
	    System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = 1");
	    System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions));
	    assertTrue(state.players.get(0).hand.size() <= 4 && state.players.get(0).hand.size() >= 3);
	    assertEquals(state.players.get(0).discard.size(), 1);
	    assertEquals(state.players.get(1).discard.size(), 1);
	    int numCards = state.gameBoard.get(Card.getCard(cards, Card.CardName.Cooper));
	    int testCards = testState.gameBoard.get(Card.getCard(cards, Card.CardName.Cooper));
	    System.out.println(numCards + " aaaaa " + testCards);
	    
	    if(state.players.get(0).hand.size() == 3){
	    	assertEquals(numCards, testCards + 1);
	    	}
    }
}