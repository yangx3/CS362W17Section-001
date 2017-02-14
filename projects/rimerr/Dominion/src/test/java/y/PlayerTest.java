package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class PlayerTest {

	@Test
	public void testGetName() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    assertEquals(player.getName(), "player-1");
	    }

	@Test
	public void testPlayer() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
		assertNotNull(player);
	    }

	@Test
	public void testDrawCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
        player.gain(Card.getCard(cards, Card.CardName.Copper));
        player.gain(Card.getCard(cards, Card.CardName.Copper));
        player.gain(Card.getCard(cards, Card.CardName.Copper));
        player.gain(Card.getCard(cards, Card.CardName.Copper));
		assertNotNull(player.drawCard());
	    }

	@Test
	public void testInitializePlayerTurn() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");	
	    state.addPlayer(player);	
	    player = new Player(state, "player-2");	
	    state.addPlayer(player);	
	    state.initializeGame();
	    player.initializePlayerTurn();
	    assertEquals(player.numActions, 1);
	    }

	@Test
	public void testGain() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
        player.gain(Card.getCard(cards, Card.CardName.Copper));
        assertEquals(player.discard.size(), 1);
	    }

	@Test
	public void testDiscard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    player.hand.add(Card.getCard(cards, Card.CardName.Copper));
	    player.discard(Card.getCard(cards, Card.CardName.Copper));
	    assertEquals(player.hand.size(), 0);
	    }

	@Test
	public void testGetRandHandCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    player.hand.add(Card.getCard(cards, Card.CardName.Copper));
	    assertNotNull(player.getRandHandCard());
	    }

	@Test
	public void testScoreFor() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");	
	    state.addPlayer(player);	
	    player = new Player(state, "player-2");	
	    state.addPlayer(player);	
	    state.initializeGame();
	    player.initializePlayerTurn();
	    assertEquals(player.scoreFor(), 3);
	    }

	@Test
	public void testPlayTreasureCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    player.hand.add(Card.getCard(cards, Card.CardName.Copper));
	    player.playTreasureCard();
	    assertEquals(player.coins, 1);
	    }

	@Test
	public void testBuyCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    assertEquals(player.buyCard(Card.getCard(cards, Card.CardName.Copper)), 0);
	    }

	@Test
	public void testEndTurn() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
	    player.hand.add(Card.getCard(cards, Card.CardName.Copper));
	    player.endTurn();
	    assertEquals(player.hand.size(), 0);
	    }

	@Test
	public void testPrintStateGame() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");	
	    assertNotNull(player);
	    }

	@Test
	public void testToString() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");	
	    assertNotNull(player.toString());
	    }

}
