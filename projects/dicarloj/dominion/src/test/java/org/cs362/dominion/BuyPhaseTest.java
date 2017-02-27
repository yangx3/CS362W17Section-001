package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.Type;
import org.junit.Test;
import static org.junit.Assert.*;


public class BuyPhaseTest {

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
		      	player.hand.add(Card.getCard(cards,Card.CardName.Baron));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		      
		      
		         
		      //Initialize the game!
		      state.initializeGame();
		      state.players.get(0).playKingdomCard();
		      state.players.get(0).playTtreasureCard();
		      
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println(" deck = " + state.players.get(0).deck.size());
		      System.out.println("coins = " + state.players.get(0).coins);
		      System.out.println("numBuys = " + state.players.get(0).numBuys);
		      System.out.println("discard count = " + state.players.get(0).discard.size());
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

  		     //	use cards
		      state.players.get(0).buyCard();
		      
		      List<Card> tem = new ArrayList<Card>(state.players.get(0).discard);
		      for (Card c : testState.players.get(0).discard)
		    	  tem.remove(c);
		      
		      int buyCost = 0;
		      for (Card c : tem)
		    	  buyCost += c.getCost();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()  ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() +  testState.players.get(0).numBuys) );
		      System.out.println("coins = " + state.players.get(0).coins + ", expected = "+ ( testState.players.get(0).coins -  buyCost ) );//only has copper
		      System.out.println("numBuys = " + state.players.get(0).numBuys + ", expected = "+ ( testState.players.get(0).numBuys - (state.players.get(0).discard.size() - testState.players.get(0).discard.size())  ) );
		      
		      
		      
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() ))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size()  ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() +   testState.players.get(0).numBuys ))      ;
		      assertEquals(state.players.get(0).coins,( testState.players.get(0).coins -buyCost ))      ;
		      assertEquals(state.players.get(0).numBuys,( testState.players.get(0).numBuys - (state.players.get(0).discard.size() - testState.players.get(0).discard.size()) ))      ;
	      
		      
		      
		      

	   }
	
	
}
