package cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmbargoTest {
	
	   @Test
	   public void test(){
		   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

			//SmithyTest.test0();
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			
		      Player player = new Player(state, "player-1");
//		      player.printStateGame();
		      player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
		      //   player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		       player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
		      //   player.hand.add(Card.getCard(cards,Card.CardName.Village));
		      state.addPlayer(player);		      
		      //Initialize the game!
		      state.initializeGame();
		      
		      //System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.playTest(1, 'a');
		      System.out.println(state.toString());
		      Collection<Integer> myvar = state.embargoBoard.values();
		      
		      int mysum = 0;
		      for (int i : myvar){
		    	  mysum += i;
		      }
		      System.out.println(mysum + " compared to 1");
		      assertEquals(mysum, 1);
		      
		      //check if discarded, and if coins are added
		      assertEquals(state.players.get(0).coins, 2);
		      assertEquals(state.players.get(0).discard.contains(Card.getCard(cards, "Embargo")), false);
		      
		      System.out.println("End Test");
			//System.exit(0);  

	   }
	
	
}

