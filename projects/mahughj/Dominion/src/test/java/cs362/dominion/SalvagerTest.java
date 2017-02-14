package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class SalvagerTest {

	@Test
	public void test() {

		List<Card> cards;
	    GameState state;
		Randomness.reset(5000);	   

	    int newCards = 4;  
	// // initialize a game state and player cards
	    System.out.println("Begin Salvager Test");
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  
	//	
	      Player player = new Player(state, "player-1");
	         player.hand.add(Card.getCard(cards,Card.CardName.Salvager));
	

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
	      state.initializeGame();         
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      state.players.get(0).hand.add(Card.getCard(cards, "Province"));
	      
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	      System.out.println("hand coins = " + state.players.get(0).coins);
	      System.out.println("hand numActions = " + state.players.get(0).numActions);
	      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
	      List<Card> p1hand = state.players.get(0).hand;
	      int numCop = 0, numEst = 0;
	      for (Card c : p1hand) {
	    	  if (c.getCardName().toString() == "Copper"){
	    		  numCop += 1;
	    	  } else if (c.getCardName().toString() == "Estate"){
	    		  numEst += 1;
	    	  }
	      }
	      
	      //copy or clone the game state to a test case
	      //testState=(GameState) state.clone();

		     //	play the game 
	      HashMap<Player, Integer> winners=state.playTest(1, 't');
	      boolean properNumLeft = false;
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 5 ");
	      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = 5");
	      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
	      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
	      System.out.println("numCoins = " + state.players.get(0).coins + ", expected = 3+");
	      System.out.println("Contains silver? " + state.players.get(0).contains("Silver"));
	      
	      System.out.println("  *****    Player-2 Status *****" );
	      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = 5");
	      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = 5");
	      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = 0");
	      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = 1");
	      //assertEquals(state.players.get(1).discard.size(), 1);
	      int numCop2 = 0, numEst2 = 0;
	      for (Card p1c : state.players.get(0).hand) {
	    	  if (p1c.getCardName().toString() == "Copper"){
	    		  numCop2 += 1;
	    	  } else if (p1c.getCardName().toString() == "Estate"){
	    		  numEst2 += 1;
	    	  }
	      }
	      int coi = 0;
	      int sum = 0;
	      boolean salvd = false;
	      if (numEst != numEst2) { //Estate was trashed, 2 coin value
	    	  salvd = true;
	    	  coi = 2;
	      } else if (numCop != numCop2) { //Copper was trashed, 0 coin val
	    	  salvd = true;
	    	  coi = 0;
	      } else { //Province was trashed, 8 coin value
	    	  salvd = true;
	    	  coi = 8;
	      }
	      for (Card o2 : state.players.get(0).hand){
	    	  if (o2.getCardName().toString() == "Copper"){
	    		  sum += 1;
	    	  }
	      }
	      System.out.println("Coi then Sum : " + coi + sum);
	      if ( state.players.get(0).coins == (sum + coi) && salvd == true){
	    	  properNumLeft = true;
	      } 
	      assertEquals(properNumLeft, true);
	     // assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - 1))      ;
	      //assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
	  
	      //assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
	      //assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;
	
	}

}
