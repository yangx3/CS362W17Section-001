package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class TieTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	    //int newCards = 4;  
	// // initialize a game state and player cards
	    System.out.println("Begin Province End Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	      for (Card c : player.hand) {
	         player.hand.remove(c);
	         player.discard.add(c);
	      }
	      
	      
	      
	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
		   for (Card c : player.hand) {
			         player.hand.remove(c);
			         player.discard.add(c);			      
			}
	      //Initialize the game!
	      state.initializeGame();
	      for (int p1 = 0; p1 < 3; p1++){
	    	  state.players.get(0).gain(Card.getCard(cards, "Province"));
		      state.players.get(0).gainToHand(Card.getCard(cards, "Gold"));
	      }  for (int p2 = 0; p2 < 3; p2++){
	    	  state.players.get(1).gain(Card.getCard(cards, "Province"));
		      state.players.get(1).gainToHand(Card.getCard(cards, "Gold"));
	      }
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	      System.out.println("hand coins = " + state.players.get(0).coins);
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	  
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.play();
	      boolean properNumLeft = false;
	      
	      int numWin = winners.size();
		    if (state.gameBoard.get(Card.getCard(cards, "Province")) == 0 && numWin == 2){
		    		properNumLeft = true;
		    	}
	      //assertEquals(state.players.get(1).discard.size(), 1);
	      //if (state.players.get(0).coins == 2 && state.players.get(0).hand.size() == 5 && state.players.get(0).deck.size() == 5 && state.players.get(1).hand.size() == 4 && state.players.get(1).deck.size() == 5 && state.players.get(1).discard.size() == 1){
	    	//  properNumLeft = true;
	    //  } 
	      assertEquals(properNumLeft, true);
	     // assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - 1))      ;
	      //assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
	  
	      //assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
	      //assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;
	
	}

}
