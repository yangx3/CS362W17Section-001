package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class DrawTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 0;  
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
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

  		     //	use cards
		      state.players.get(0).drawCard();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + 1 ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - 1 ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()  ) );
		      
		      
		     
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() +1))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() -1))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() ))      ;
	      
		      
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();

		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( 10 ));
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( 0 ));
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()  ) );
		      
		      
		      assertEquals(state.players.get(0).hand.size(),( 10))      ;
		      assertEquals(state.players.get(0).deck.size(),( 0))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() )) ;
		      
		      
		      state.players.get(0).drawCard();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( 10 ));
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( 0 ));
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()  ) );
		      
		      
		      assertEquals(state.players.get(0).hand.size(),( 10))      ;
		      assertEquals(state.players.get(0).deck.size(),( 0))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() )) ;

		      
		      

	   }
	
	
}
