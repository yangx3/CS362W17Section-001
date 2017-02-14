package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import org.junit.Test;

public class GardensTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	    int newCards = 3;  
	// // initialize a game state and player cards
	    System.out.println("Begin Gardens Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         player.hand.add(Card.getCard(cards,Card.CardName.Gardens));
	         
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	      System.out.println("hand coins = " + state.players.get(0).coins);
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	  
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	     // System.out.println(winners.toString());
	      HashMap<Player, Integer> theWin = state.getWinners();
	      //System.out.println(theWin.toString());
	      Collection<Integer> theWin2 = theWin.values();
	      
	      if (theWin2.contains(23) == true && theWin2.contains(9) == true) {
	    	  properNumLeft = true;
	      }
	      
	      
	     
	      assertEquals(properNumLeft, true);
	     // assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - 1))      ;
	      //assertEquals(state.players.get(
	}

}
