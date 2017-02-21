package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class MineNothingTest {

	@Test
	public void test() {List<Card> cards;
    GameState state;
	Randomness.reset(10);	   

// // initialize a game state and player cards
    System.out.println("--Begin Mine Nothing Test--");
	cards = new ArrayList<Card>(Card.createCards());
	 state = new GameState(cards);  
//	
      Player player = new Player(state, "player-1");
  
      player.hand.add(Card.getCard(cards, Card.CardName.Mine));
      
         state.addPlayer(player);
       player = new Player(state, "player-2");
         state.addPlayer(player);
         
      //Initialize the game!
      state.initializeGame();
      int numCopper = 0;
      for (Card c : state.players.get(0).hand) {
    	  	 if (c.getCardName().toString() == "Copper") {
    	  		 numCopper++;
	        }
	      }
      for (int o = 0; o < numCopper; o++){
    	 state.players.get(0).hand.remove(Card.getCard(cards,Card.CardName.Copper));
         System.out.println("Removing Copper");
      }

	     //	play the game 
      HashMap<Player, Integer> winners=state.playTest(1, 'a');
      
      
      int numdis = state.players.get(0).discard.size();
      boolean noCop = state.players.get(0).discard.contains(Card.getCard(cards, "Copper"));
      boolean noSilv =  state.players.get(0).discard.contains(Card.getCard(cards, "Silver"));
      boolean noGold = state.players.get(0).discard.contains(Card.getCard(cards, "Gold"));
      assertEquals(noCop || noSilv || noGold, false);
      assertEquals(numdis, 1);
      System.out.println("------TEST PASSED-------");
	}

}
