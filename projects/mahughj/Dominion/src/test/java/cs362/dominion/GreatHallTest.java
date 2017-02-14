package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class GreatHallTest {

	@Test
	public void test() {

		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	// // initialize a game state and player cards
	    System.out.println("Begin Great Hall Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));
	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	      
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 6 ");
	      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = 4");
	      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 1" );
	       //assertEquals(state.players.get(1).discard.size(), 1);
	     
	      
	      if (state.players.get(0).coins == 0 && state.players.get(0).hand.size() == 6 && state.players.get(0).deck.size() == 4 && state.players.get(1).hand.size() == 5 && state.players.get(1).deck.size() == 5 && state.players.get(0).contains("Great_Hall") == false){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	      
	      int numWin = winners.size();
	      
	      assertEquals(numWin, 1); //Fails b/c great halls aren't counted as VP, creating a tie
	  
	}

}
