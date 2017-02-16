package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class AmbassadorTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

//	 // initialize a game state and player cards
	    System.out.println("Begin Ambassador Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
		
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("hand count = " + state.players.get(0).hand.size());
      
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 3 or 4 ");
	      
	      System.out.println("  *****    Player-2 Status *****" );
	      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = 1");
	      assertEquals(state.players.get(1).discard.size(), 1);
	      if (state.players.get(0).hand.size() == 3 || state.players.get(0).hand.size() == 4){
	    	  properNumLeft = true;
	      }
	      assertEquals(properNumLeft, true);
	     
	      
	}

}
