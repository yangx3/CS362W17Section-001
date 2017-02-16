package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


import org.junit.*;

public class GameStateTest {

	@Test
	public void testGameState() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		assertNotNull(state);
	}

	@Test
	public void testAddPlayer() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    player = new Player(state, "player-1");
	    state.addPlayer(player);
	    assertEquals(state.players.size(), 2);
	}

	@Test
	public void testInitializeGame() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    player = new Player(state, "player-1");
	    state.addPlayer(player);	
	    state.initializeGame();
	    assertTrue(state.gameBoard.get(Card.getCard(cards, Card.CardName.Curse))== 10);
	    assertTrue(state.gameBoard.get(Card.getCard(cards, Card.CardName.Gold))== 30);
	    assertTrue(state.gameBoard.get(Card.getCard(cards, Card.CardName.Province))== 8);
	}

	@Test
	public void testGetRandCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    player = new Player(state, "player-1");
	    state.addPlayer(player);	
	    state.initializeGame();
	    assertNotNull(state.getRandCard());
	}

	@Test
	public void testPlay() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    player = new Player(state, "player-1");
	    state.addPlayer(player);	
	    state.initializeGame();
		assertNotNull(state.play());
	}

	@Test
	public void testPlayKingdomCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    state.addPlayer(player);
	    state.initializeGame();
	    player.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
	    state.playKingdomCard(player);
	    assertEquals(player.coins, 0);

	}

	@Test
	public void testIsGameOver() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    state.addPlayer(player);
	    state.initializeGame();
	    assertFalse(state.isGameOver());
	}

	@Test
	public void testGetWinners() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    state.initializeGame();	
		HashMap<Player, Integer> playerScore = new HashMap<Player, Integer>();

		    //get score for each player
		for (Player p : state.players) {
		    int score = p.scoreFor();
		    playerScore.put(p, score);
		}
	    assertEquals(state.getWinners(), playerScore);
	}

	@Test
	public void testToString() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    state.addPlayer(player);
	    state.addPlayer(player);
	    state.initializeGame();	
		assertNotNull(state.toString()); 
	}

}
