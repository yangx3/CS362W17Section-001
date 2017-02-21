package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class AdventurerBadDrawTest {

	@Test
	public void test() {
	List<Card> cards;
    GameState state;
	Randomness.reset(10);	   

// // initialize a game state and player cards
    System.out.println("Begin Adventurer Bad Draw Test");
	cards = new ArrayList<Card>(Card.createCards());
	 state = new GameState(cards);  

      Player player = new Player(state, "player-1");
         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));

         state.addPlayer(player);
       player = new Player(state, "player-2");
         state.addPlayer(player);
         
      //Initialize the game!
      state.initializeGame();
      /*int numCop = 0, numEst = 0;
      for (Card de : state.players.get(0).deck){
    	  if (de.getCardName().toString() == "Copper")
    		  numCop++;
          else 
        	  numEst++;
      }*/
      for (int i = 0; i < 5; i++){
    	  state.players.get(0).deck.removeFirst();
      }
      for (int i = 0; i < 20; i++) {
    	  if (i % 4 == 3) {
    		  state.players.get(0).deck.add(Card.getCard(cards, "Copper"));
    	  } else {
    		  state.players.get(0).deck.add(Card.getCard(cards, "Estate"));
    		  state.players.get(0).deck.add(Card.getCard(cards, "Adventurer"));
    	  }
      }
      
      System.out.println("hand count = " + state.players.get(0).hand.size());
      System.out.println("hand coins = " + state.players.get(0).coins);
  

	     //	play the game 
      HashMap<Player, Integer> winners=state.playTest(1, 't');
      boolean properNumLeft = false;
      
      System.out.println("  *****    Player-1 Status ***** " );
      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = 7+ ");
      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = 1");
      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = 0" );
      System.out.println("numCoins = " + state.players.get(0).coins);
      
      assertEquals(state.players.get(0).discard.contains(Card.getCard(cards, "Copper")), false);
      if (state.players.get(0).hand.size() == 7 && state.players.get(0).coins >= 4){
    	  properNumLeft = true;
      } 
      assertEquals(properNumLeft, true);
	}

}
