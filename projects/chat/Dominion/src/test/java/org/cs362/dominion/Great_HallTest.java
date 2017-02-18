package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class Great_HallTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test8()  throws Throwable  {
		  	System.out.println("\n" + "------------ Great_Hall Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
			//Great Hall allows the player to draw one card
		    int newCards = 1;  
		    
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
  		       * Alice should draw 1 card and gain 1 Action point.
  		       */
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Great_Hall));
		      state.players.get(0).playKingdomCard();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions) );
		      
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards ));
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ));
		      assertEquals(state.players.get(0).numActions,( testState.players.get(0).numActions));
		      
		      System.out.println("^^^^^^^^^^^^ Great_Hall Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
