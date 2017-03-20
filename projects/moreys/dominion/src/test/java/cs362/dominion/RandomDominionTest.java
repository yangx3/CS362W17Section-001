package cs362.dominion;

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
	
	private static GameState gameState;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Random rand = new Random();
		int n = rand.nextInt(3) + 2;
		cards = new ArrayList<Card>(Card.createCards());
		gameState = new GameState(cards);
		Randomness.reset();
		for (int i = 1; i <= n; i++) {
			Player player = new Player(gameState, "Player " + i);
			gameState.addPlayer(player);
		}
		gameState.initializeGame();
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
	public void test() {
		HashMap<Player, Integer> winners=gameState.playRandom();
		for (Player p : winners.keySet()){
			System.out.println("Player name: " + p.player_username + "Score: " + winners.get(p));
		}
		System.out.println(gameState.toString());
		if (gameState.Empty_Piles() > 2  && gameState.Empty_Piles() < 4) {
			assertTrue(gameState.Empty_Piles() == 3);
		}
		else
			assertTrue(gameState.Empty_Piles() >= 1);
		
	}

}
