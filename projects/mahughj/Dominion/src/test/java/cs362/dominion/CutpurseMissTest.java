package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class CutpurseMissTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	// // initialize a game state and player cards
	    System.out.println("--Begin Cutpurse Miss Test--");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	  
	      player.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
	      
	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      int numCop = 0;
	      for (Card c : state.players.get(1).hand) {
	    	  	 if (c.getCardName().toString() == "Copper") {
	    	  		 numCop++;
		        }
		      }
	      for (int o = 0; o < numCop; o++){
	    	 state.players.get(1).hand.remove(Card.getCard(cards,Card.CardName.Copper));
	         System.out.println("Removing Copper");
	      }

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      int properNumLeft = 0;
	      
	      int numdis = state.players.get(1).discard.size();
	      properNumLeft = state.players.get(1).hand.size();
	       
	      assertEquals(properNumLeft, 5 - numCop);
	      assertEquals(numdis, 0);
	      System.out.println("------TEST PASSED-------");
	}

}
