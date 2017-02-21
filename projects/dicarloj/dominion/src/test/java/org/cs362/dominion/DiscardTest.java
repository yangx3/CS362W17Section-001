package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class DiscardTest {

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
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();
		      state.players.get(0).drawCard();
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		      Card estate = state.cards.get(5);
		 
		    		  
  		     //	use cards
		      state.players.get(0).discard(estate);
		      
		      int estInHand = 0 ;
		      int estInDiscard = 0;
		      for(Card c : state.players.get(0).hand)
		    	  if (c.equals(estate))
		    		  estInHand += 1;
		      for(Card c : state.players.get(0).discard)
		    	  if (c.equals(estate))
		    		  estInDiscard += 1;
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() -1 ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()  ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()+1  ) );
		      System.out.println("num estates in discard  = " + estInDiscard + ", expected = "+ ( 1  ) );
		      System.out.println("num estates in Hand  = " + estInHand + ", expected = "+ ( 2 ) );
		      
		      
		     
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() -1))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()+1))      ;
		      assertEquals(estInHand,( 2))      ;
		      assertEquals(estInDiscard,( 1))      ;
		      
		      state.players.get(0).discard(estate);
		      state.players.get(0).discard(estate);

		      estInHand = 0 ;
		      estInDiscard = 0;
		      for(Card c : state.players.get(0).hand)
		    	  if (c.equals(estate))
		    		  estInHand += 1;
		      for(Card c : state.players.get(0).discard)
		    	  if (c.equals(estate))
		    		  estInDiscard += 1;
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() -3 ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()  ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()+3  ) );
		      System.out.println("num estates in discard  = " + estInDiscard + ", expected = "+ ( 3  ) );
		      System.out.println("num estates in Hand  = " + estInHand + ", expected = "+ ( 0  ) );
		      
		      
		     
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() -3))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()+3))      ;
		      assertEquals(estInHand,( 0))      ;
		      assertEquals(estInDiscard,( 3))      ;
		      
		      
		      state.players.get(0).discard(estate);
		      
		      estInHand = 0 ;
		      estInDiscard = 0;
		      for(Card c : state.players.get(0).hand)
		    	  if (c.equals(estate))
		    		  estInHand += 1;
		      for(Card c : state.players.get(0).discard)
		    	  if (c.equals(estate))
		    		  estInDiscard += 1;
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() -3 ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()  ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()+3  ) );
		      System.out.println("num estates in discard  = " + estInDiscard + ", expected = "+ ( 3  ) );
		      System.out.println("num estates in Hand  = " + estInHand + ", expected = "+ ( 0  ) );
		      
		      
		     
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() -1))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()+1))      ;
		      assertEquals(estInHand,( 0))      ;
		      assertEquals(estInDiscard,( 3))      ;

		      
		      

	   }
	
	
}
