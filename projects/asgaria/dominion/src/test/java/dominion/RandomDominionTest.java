package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random; 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomDominionTest {

	private static ArrayList<Card> cards;
	
	
	private static GameState gs;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cards = new ArrayList<Card>(Card.createCards());
		gs = new GameState(cards);
		Randomness.reset(10);
		Player player = new Player(gs, "player-1");
		//gs.addPlayer(player);
		//player = new Player(gs, "player-2");
		//gs.addPlayer(player);		      
		Random rand = new Random();
		int n = rand.nextInt(3) + 2;
		//System.out.println(n);
		for (int i = 1; i <= n ; i++){
			player = new Player(gs, "player-" + (i));
			gs.addPlayer(player);
		}
		//Initialize the game!
		gs.initializeGame();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWholeGame() {
		 HashMap<Player, Integer> winners=gs.play();
		 for(Player p: winners.keySet()){
		    	System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		    }
		    
		 System.out.println(gs.toString());
		 
		 assertTrue(gs.empty_piles >= 1);
		 if(gs.empty_piles == 1)
			 assertTrue(gs.gameBoard.get(Card.getCard(gs.cards, Card.CardName.Province)) == 0);
	}

}
