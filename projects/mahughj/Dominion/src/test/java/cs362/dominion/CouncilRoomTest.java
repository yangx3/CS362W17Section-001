package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class CouncilRoomTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	// // initialize a game state and player cards
	    System.out.println("Begin Council Room Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
		
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Council_Room));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	  
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 9 ");
	      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = 1");
	      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
	      System.out.println("numBuys = " + state.players.get(0).numBuys);
	      
	      System.out.println("  *****    Player-2 Status *****" );
	      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = 6");
	      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = 4");
	      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = 1");
	      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = 0");
	      if (state.players.get(0).numBuys == 2 && state.players.get(0).hand.size() == 9 && state.players.get(0).deck.size() == 1 && state.players.get(1).hand.size() == 6 && state.players.get(1).deck.size() == 4){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	}

}
