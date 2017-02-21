package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class MineTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test9()  throws Throwable  {
		  	System.out.println("\n" + "------------ Mine Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
			//Council_Room gives the player 4 new cards
		    int newCoins = 5;  
		    
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
  		       * The player should swap a Copper out for Silver.
  		       */
		      assertEquals(state.players.get(0).hand.size(), 5);
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Mine));
		      //assertEquals(state.players.get(0).hand.size(), 6);
		      state.players.get(0).playKingdomCard();
		      assertEquals(state.players.get(0).hand.size(), 5);
		      assertTrue(state.players.get(0).discard.size() > 0);	       
		      assertEquals(state.players.get(0).numActions,( testState.players.get(0).numActions -1 ));
		      
		      System.out.println("^^^^^^^^^^^^ Mine Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}