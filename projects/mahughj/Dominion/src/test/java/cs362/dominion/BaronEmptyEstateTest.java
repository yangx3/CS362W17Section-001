package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class BaronEmptyEstateTest {
//Tests to see if baron works on a hand w/o estates
	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	// // initialize a game state and player cards
	    System.out.println("--Begin Baron Empty Estate Test--");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	  
	      player.hand.add(Card.getCard(cards, Card.CardName.Baron));
	      
	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      int numEst = 0;
	      for (Card c : state.players.get(0).hand) {
	    	  	 if (c.getCardName().toString() == "Estate") {
	    	  		 numEst++;
		        }
		      }
	      for (int o = 0; o < numEst; o++){
	    	 state.players.get(0).hand.remove(Card.getCard(cards,Card.CardName.Estate));
	         System.out.println("Removing Estate");
	      }

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	      int numdis = state.players.get(0).discard.size();
	      properNumLeft = state.players.get(0).discard.contains(Card.getCard(cards, "Estate"));
	       
	      assertEquals(properNumLeft, true);
	      assertEquals(numdis, 2);
	      System.out.println("------TEST PASSED-------");
	}

}
