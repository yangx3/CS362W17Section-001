package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class AmbassadorTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test1()  throws Throwable  {
		  	System.out.println("\n" + "------------ Ambassador Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
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
  		       * Give the player an Ambassador and Curse card, curse since thats the only
  		       * card I implemented successfully.  The players should now have 7 cards, and
  		       * have 5 left after playing Ambassador since it would have gotten rid of the
  		       * curse card.
  		       */
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Ambassador));
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Curse));
		      assertEquals(state.players.get(0).hand.size(), 7);
		      state.players.get(0).playKingdomCard();

		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()));
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() ));
		      
		      //assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() + 1));


		      
		      System.out.println("^^^^^^^^^^^^ Ambassador Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
