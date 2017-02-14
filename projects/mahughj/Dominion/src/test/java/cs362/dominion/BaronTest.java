package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class BaronTest {

	@Test
	public void test() {
	List<Card> cards;
    GameState state;
	Randomness.reset(10);	   

// // initialize a game state and player cards
    System.out.println("Begin Baron Test");
	cards = new ArrayList<Card>(Card.createCards());
	 state = new GameState(cards);  
	
      Player player = new Player(state, "player-1");
         player.hand.add(Card.getCard(cards,Card.CardName.Baron));

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
  
     
	     //	play the game 
      HashMap<Player, Integer> winners=state.playTest(1, 't');
      boolean properNumLeft = false;
      
      System.out.println("  *****    Player-1 Status ***** " );
      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 4 or 5 ");
      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = 5");
      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 2");
      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
      System.out.println("numCoins = " + state.players.get(0).coins);
      System.out.println("numBuys = " + state.players.get(0).numBuys);
      if (state.players.get(0).coins >= 5 && state.players.get(0).numBuys == 2){
    	  properNumLeft = true;
      } 
      assertEquals(properNumLeft, true);
     }
	}


