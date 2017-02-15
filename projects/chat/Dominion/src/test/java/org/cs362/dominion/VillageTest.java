package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.Test;
import static org.junit.Assert.*;


public class VillageTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test1()  throws Throwable  {	   
		  System.out.println("\n" + "------------ Village Test ------------");
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   
			
			//Village gives the player 1 new cards
		    int newCards = 1;  
		   
		    // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);  
		
		      	Player player = new Player(state, "Alice");
		        //player.hand.add(Card.getCard(cards,Card.CardName.Village));
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

  		      //play the game 
		      //HashMap<Player, Integer> winners = state.play();
		      
		      /*
		       * Alice should draw one card. Then gain two Action points, should use up
		       * one action before gaining the other two action points, hench ending with
		       * two action points and not 3.
		       */
		    	 
		    	  state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Village));
			      state.players.get(0).playKingdomCard();
			  //state.players.get(0).initializePlayerTurn();    
		      //state.players.get(0).hand.remove(CardName.Embargo);
		      //state.players.get(0).playedCards.remove(getCard(state.players.get(0).playedCards, CardName.Embargo));
		      //player.playedCards.remove(getCard(player.playedCards, CardName.Embargo));
		      //player.hand.add(Card.getCard(cards,Card.CardName.Village));

		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions + 1 ) );

		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards ));
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ));
	      
		      System.out.println("^^^^^^^^^^^^ Village Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}
