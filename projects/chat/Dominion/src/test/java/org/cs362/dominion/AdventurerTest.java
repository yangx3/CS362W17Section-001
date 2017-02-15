package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class AdventurerTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {
		  	System.out.println("\n" + "------------ Adventurer Test ------------");
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
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

  		      //	play the game 
		      
		      //Crashes if I attempt to actually run the game through, inidivual tests only
		      //HashMap<Player, Integer> winners = state.play();
		      
		      /*
		       * Add Adventurer into the players hand then play it, check to make sure they have
		       * more than 6 cards, the deck should have been depleted of cards to draw the 
		       * treasure cards (Bronze) in this case, the discard should be greater than 0
		       * if the player had to discard cards (Estates).  Played cards should be 1 since
		       * we just played Adventurer and left with no more actions.
		       */
		     state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		     state.players.get(0).playKingdomCard();
		     assertTrue(state.players.get(0).hand.size() >= 6);
		     assertTrue(state.players.get(0).deck.size() >= 1);
		     assertTrue(state.players.get(0).discard.size() >= 0);
		     assertEquals(state.players.get(0).playedCards.size(), 1);
		     assertEquals(state.players.get(0).numActions, 0);
		      
		      System.out.println("^^^^^^^^^^^^ Adventurer Test ^^^^^^^^^^^^" + "\n");
	   }
	
	
}