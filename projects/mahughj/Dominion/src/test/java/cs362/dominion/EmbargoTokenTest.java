package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

import org.junit.Test;

public class EmbargoTokenTest {

	@Test
	public void test() {
		 List<Card> cards;
		 cards = Card.createCards();
		 GameState state = new GameState(cards);
		 Player p1 = new Player(state, "p1");
		 state.addPlayer(p1);
		 Player p2 = new Player(state, "p2");
		 state.addPlayer(p2);
		 Randomness.reset(10);	
		 System.out.println("Begin Embargo Token Test");
		 /*
		 Card cur = Card.getCard(cards, "Curse");
		 Card est = Card.getCard(cards, "Estate");
		 Card cop = Card.getCard(cards, "Copper");
		 List<Player> playList = Arrays.asList(p1, p2);
		 List<Card> testCards = Arrays.asList(cur, est, cop);
		 HashMap<Card, Integer> gmBrd = new HashMap<Card, Integer>();
		 gmBrd.put(cur, 10);
		 gmBrd.put(cop, 50);
		 gmBrd.put(est, 12);
		 HashMap<Card, Integer> emBrd = new HashMap<Card, Integer>();
		 gmBrd.put(cur, 3);
		 gmBrd.put(cop, 3);
		 gmBrd.put(est, 3);		 
		 state = new GameState(testCards, playList, gmBrd, emBrd);
	
		 */	
		 state.initializeGame('e', 3);

	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("hand deck = " + state.players.get(0).deck.size());
	     
		 HashMap<Player, Integer> winners=state.playTest(1, 'b');
	     
	      
	      System.out.println("  *****    Player-1 Status ***** " );
	      System.out.println("hand count = " + state.players.get(0).hand.size());
	      System.out.println("deck count = " + state.players.get(0).deck.size());
	      System.out.println("numActions = " + state.players.get(0).numActions);
	      assertEquals(p1.scoreFor(), 0);
     
	}

}
