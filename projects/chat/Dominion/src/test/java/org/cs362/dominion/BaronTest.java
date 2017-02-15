package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class BaronTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test2()  throws Throwable  {
		  	System.out.println("\n" + "------------ Baron Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
		    
		    // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);  
		
		      	Player player = new Player(state, "Alice");
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
  		       * Give the player a Baron card.  If they have an Estate in their hand it 
  		       * should be discarded in favor of the +4 coins, if not they gain an Estate.
  		       * Check to make sure they gain an additional buy and if they gain more coins
  		       * or an extra card (Estate).
  		       */
		     state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Baron));

		     if(Card.getCard(state.players.get(0).hand, Card.CardName.Estate) != null) {
		    	 state.players.get(0).playKingdomCard();
		    	 assertEquals(state.players.get(0).hand.size(), 4);
		    	 assertEquals(state.players.get(0).deck.size(), 5);
		    	 assertEquals(state.players.get(0).discard.size(), 1);
		    	 assertEquals(state.players.get(0).playedCards.size(), 1);
		         assertEquals(state.players.get(0).numActions, 0);
		         assertEquals(state.players.get(0).coins, 4);
		     }
		     else {
		    	 state.players.get(0).playKingdomCard();
		    	 assertEquals(state.players.get(0).hand.size(), 6);
		    	 assertEquals(state.players.get(0).deck.size(), 5);
		    	 assertEquals(state.players.get(0).discard.size(), 0);
		    	 assertEquals(state.players.get(0).playedCards.size(), 1);
		         assertEquals(state.players.get(0).numActions, 0);
		         assertEquals(state.players.get(0).coins, 0);
		     }
		    
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - 1));
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() ) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
	/*	      
		      System.out.println("  *****    Player-2 Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()));
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()));
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions));
		 */     
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() - 1));
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() ));
	    /*  
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()));
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size()));
*/
		      
		      System.out.println("^^^^^^^^^^^^ Baron Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
