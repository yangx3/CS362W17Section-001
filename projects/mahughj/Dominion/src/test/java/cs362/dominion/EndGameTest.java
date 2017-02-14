package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;

import org.junit.Test;

public class EndGameTest {

	@Test
	public void test() {
		   
	    List<Card> cards;
	    GameState state;
		Randomness.reset(7);	   

		
		//the cards  are achieved by each element/constant in the enum class 
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
//		 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
		
	      Player player = new Player(state, "player-1");
//	      player.printStateGame();
	      //   player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
	      //   player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

	      state.addPlayer(player);
	       player = new Player(state, "player-2");
	      //   player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
	      //   player.hand.add(Card.getCard(cards,Card.CardName.Village));
	      state.addPlayer(player);		      
	      //Initialize the game!
	      state.initializeGame();
	      
	      System.out.println("Initialization DominionBoard:\n " + state.toString());
	      
	      HashMap<Player, Integer> winners=state.play();
	      System.out.println ("Finished game.\n");
	    
	      for(Player p: winners.keySet()){
	    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
	      }
	      
//	      player.printStateGame();
	    boolean properEnd = false;
	    Collection<Integer> myvar = state.gameBoard.values();
	    int numEmp = 0;
	    for (int num: myvar) {
	    	if (num == 0) {
	    		numEmp++;
	    	}
	    }
	    if (numEmp < 3) {
	    	if (state.gameBoard.get(Card.getCard(cards, "Province")) == 0){
	    		properEnd = true;
	    	}
	    } else {
	    	properEnd = true;
	    }
	    assertEquals(true, properEnd);
	    System.out.println("EndGameTestConcluded");
		//System.exit(0); 
	}

}
