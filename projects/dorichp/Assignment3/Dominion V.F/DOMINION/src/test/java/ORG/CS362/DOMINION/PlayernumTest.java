package ORG.CS362.DOMINION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class PlayernumTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	  
		  
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
			 System.out.println("  *****    Player-1 Status ***** " );
			    Player player = new Player(state, "player-1");
			    state.addPlayer(player);
			    player = new Player(state, "player-2");
			    state.addPlayer(player);
			    int size = state.players.size();
			    assertEquals(size, 2);




		      
//		      System.out.println("  *****    Player-1 Status ***** " );
//		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards ) );
//		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
//		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
//		      
//		      System.out.println("  *****    Player-2 Status *****" );
//		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
//		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
//		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
//		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards ))      ;
//		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
//	      
//		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
//		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;

		      
		      

	   }
	
	
}
