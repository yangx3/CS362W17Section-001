package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class CutpurseTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test4()  throws Throwable  {
		  	System.out.println("\n" + "------------ Cutpurse Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
			//Cutpurse gives the player 2 coins
		    int newCoins = 2;  
		    
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
  		       * Alice should gain 2 coins while Bob discards a Copper from his hand.
  		       */
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Cutpurse));
		      assertEquals(state.players.get(0).numActions, 1);
		      state.players.get(0).playKingdomCard();
		      assertEquals(state.players.get(0).numActions, 0);
		      assertEquals(state.players.get(0).coins, 2);
		      
		      System.out.println("  ***** Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).coins + ", expected = "+ ( testState.players.get(0).coins + newCoins ) );
		      //System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCoins ) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1) );
		      
		      System.out.println("  ***** Player-2 Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size() - 1));
		      //System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()));
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions));
		      
		      assertEquals(state.players.get(0).coins,( testState.players.get(0).coins + newCoins ));
		      //assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCoins ));
		      //assertEquals(state.players.get(0).numActions,( testState.players.get(0).numActions));
	      
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size() - 1));
		      assertEquals(state.players.get(1).numActions,( testState.players.get(1).numActions));

		      
		      System.out.println("^^^^^^^^^^^^ Cutpurse Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
