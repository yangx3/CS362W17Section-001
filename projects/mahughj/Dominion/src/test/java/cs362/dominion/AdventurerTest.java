package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class AdventurerTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

//	 // initialize a game state and player cards
	    System.out.println("Begin Adventurer Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand coins = " + state.players.get(0).coins);
      

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 't');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 7+ ");
	      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
	      System.out.println("numCoins = " + state.players.get(0).coins);
	      
	      if (state.players.get(0).hand.size() == 7 && state.players.get(0).coins >= 4){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	     }

}
