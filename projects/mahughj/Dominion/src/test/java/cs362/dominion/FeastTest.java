package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class FeastTest {

	@Test
	public void test() {
		
/**
 * This code does not properly test Feast. Feast should be trashed, and not discarded.
 * The discard pile should be 1 instead of 2. It is two because the Feast is added to
 * the discard as part of a normal action play. Feast is, in essence, not being trashed
 */
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	    int newCards = 4;  
	// // initialize a game state and player cards
	    System.out.println("Begin Feast Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Feast));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      
		     //	play the game for 1 action
	      HashMap<Player, Integer> winners=state.playTest(1, 'a');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 5 ");
	      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      assertEquals(state.players.get(0).discard.size(), 1); //OH NO! A BUG! WHATEVER SHALL I DO?
	     
	      for (Card e : state.players.get(0).discard) {
	    	  System.out.println(e.toString());
	      }
	      
	      if (state.players.get(0).coins == 0 && state.players.get(0).hand.size() == 5 && state.players.get(0).deck.size() == 5 && state.players.get(0).contains("Feast") == false){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	     // assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - 1))      ;
	      //assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
	  
	      //assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
	      //assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;
	
	}

}
