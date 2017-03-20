package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomPlayDominionTest {

	private static ArrayList<Card> cards;
	private static GameState gs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cards = new ArrayList<Card>(Card.createCards());
		gs = new GameState(cards);
		int players_n = Randomness.nextRandomInt(3)+1;
		System.out.println("*** DEBUG "+players_n);
		Randomness.reset(10);
		
		for(int i = 0;i < players_n;i++){
			Player player = new RandPlayer(gs, "player-"+i);
			gs.addPlayer(player);
		}
		//Initialize the game!
		gs.initializeGame();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void RandomPlaytest() {
		//Gamestate initialized handles the random set of kingdom cards
		gs.play();
		//fail("Not yet implemented");
	}

}
