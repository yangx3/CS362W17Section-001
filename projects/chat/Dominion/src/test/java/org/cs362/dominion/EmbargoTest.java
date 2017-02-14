package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.Test;
import static org.junit.Assert.*;


public class EmbargoTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test5()  throws Throwable  {	   
		  System.out.println("\n" + "------------ Embargo Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
			//Village gives the player 1 new cards
		    int newCards = 1;  
		   
		    // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);  
		
		      	Player player = new Player(state, "Alice");
		        //player.hand.add(Card.getCard(cards,Card.CardName.Village));
		        state.addPlayer(player);
		        player = new Player(state, "Bob");
		        state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

  		      /*
  		       * Alice should gain two coins, then trash Embargo.  Didn't implement the 
  		       * token part of Embargo.
  		       */
		    state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Embargo));
			state.players.get(0).playKingdomCard();
   
		      assertEquals(state.players.get(0).coins,( testState.players.get(0).coins + 2));
		      
		      System.out.println("^^^^^^^^^^^^ Embargo Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
