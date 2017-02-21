package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class RemodelTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {
		  	System.out.println("\n" + "------------ Remodel Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
			//Smithy gives the player 3 new cards
		    int newCards = 3;  
		    
		    // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);  
		
		      	Player player = new Player(state, "Alice");
		        //player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
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
  		      * Alice should trash a card in her hand then gain one costing two more coins
  		      * then it.
  		      */
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Remodel));
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()));
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + 1));
		      
		      state.players.get(0).playKingdomCard();
		      
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() + 1));
		      assertEquals(state.players.get(0).numActions,( testState.players.get(0).numActions - 1));
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() - 1));

		      
		      System.out.println("^^^^^^^^^^^^ Remodel Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
