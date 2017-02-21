package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.Type;
import org.junit.Test;
import static org.junit.Assert.*;


public class EndTurnTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		      
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		     	

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		      
		      
		         
		      //Initialize the game!
		      state.initializeGame();
		      state.players.get(0).playKingdomCard();
		      state.players.get(0).playTtreasureCard();
		      state.players.get(0).buyCard();
		      
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println(" deck = " + state.players.get(0).deck.size());    
		      System.out.println("discard count = " + state.players.get(0).discard.size());
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		      state.players.get(0).endTurn();
		      
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ 5 );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - 5  ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() + testState.players.get(0).hand.size()  ) );
		    
		      
		      
		      assertEquals(state.players.get(0).hand.size(),( 5 ))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() -5 ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() +  testState.players.get(0).hand.size() ))      ;
		     
		      
		      
		      
		      
		      
		      testState.players.get(0).drawCard();
		      
		      state = (GameState) testState.clone();
		      
		      state.players.get(0).endTurn();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ 5 );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() + testState.players.get(0).hand.size() + testState.players.get(0).discard.size()-5 ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( 0 ));
		    
		      
		      
		      assertEquals(state.players.get(0).hand.size(),( 5 ))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() + testState.players.get(0).hand.size() + testState.players.get(0).discard.size()-5 ))      ;
		      assertEquals(state.players.get(0).discard.size(),( 0 ))      ;
		      

	   }
	
	
}
