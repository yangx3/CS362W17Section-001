package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class CutpurseTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	    int newCards = 4;  
	// // initialize a game state and player cards
	    System.out.println("Begin Cutpurse Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Cutpurse));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("hand coins = " + state.players.get(0).coins);
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	     
		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 5 ");
	      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
	      System.out.println("numCoins = " + state.players.get(0).coins + ", expected = 2");
	      
	      System.out.println("  *****    Player-2 Status *****" );
	      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = 4");
	      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = 5");
	      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = 1");
	      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = 1");
	      //assertEquals(state.players.get(1).discard.size(), 1);
	      if (state.players.get(0).coins == 2 && state.players.get(0).hand.size() == 5 && state.players.get(0).deck.size() == 5 && state.players.get(1).hand.size() == 4 && state.players.get(1).deck.size() == 5 && state.players.get(1).discard.size() == 1){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	     // assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - 1))      ;
	      //assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
	  
	      //assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
	      //assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;
	
	}

}
