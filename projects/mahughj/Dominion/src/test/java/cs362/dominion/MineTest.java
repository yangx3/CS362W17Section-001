package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class MineTest {

	@Test
	public void test() {

		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

	    int newCards = 4;  
	// // initialize a game state and player cards
	    System.out.println("Begin Mine Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Mine));
	         player.hand.add(Card.getCard(cards,Card.CardName.Mine));

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();
	      int copCnt = 0;
	      for (Card cop : state.players.get(0).hand) {
	    	  if (cop.getCardName().toString() == "Copper"){
	    		  copCnt++;
	    	  }
	      }
	      for (int j = 1; j < copCnt; j++){
	    	  state.players.get(0).hand.remove(Card.getCard(cards, "Copper"));
	      }
	      state.players.get(0).numActions++;
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	      System.out.println("hand coins = " + state.players.get(0).coins);
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	  
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 't', 1);
	      boolean properNumLeft = false;
	      
	      //System.out.println("  *****    Player-1 Status ***** " );
	      //System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 5 ");
	      //System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = 5");
	      //System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      //System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
	      //System.out.println("numCoins = " + state.players.get(0).coins + ", expected = 3+");
	      //System.out.println("Contains silver? " + state.players.get(0).contains("Silver"));
	      System.out.println("Contains gold? " + state.players.get(0).contains("Gold"));
	      /*
	      System.out.println("  *****    Player-2 Status *****" );
	      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = 5");
	      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = 5");
	      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = 0");
	      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = 1"); */
	      //assertEquals(state.players.get(1).discard.size(), 1);
	     
	      
	      if (state.players.get(0).deck.size() == 5 && state.players.get(1).deck.size() == 5 && state.players.get(0).contains("Gold") == true && state.players.get(0).discard.contains("Silver") == false){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	     // assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - 1))      ;
	      //assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
	  
	      //assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
	      //assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;
	
	}

}
