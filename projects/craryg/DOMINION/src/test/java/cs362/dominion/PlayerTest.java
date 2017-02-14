package cs362.dominion;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cs362.dominion.Card.CardName;
import cs362.dominion.Card.Type;

public class PlayerTest {

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
		Randomness.reset(10);
		Player player = new Player(gs, "player-1");
		gs.addPlayer(player);
		player = new Player(gs, "player-2");
		gs.addPlayer(player);		      
		//Initialize the game!
		gs.initializeGame();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGainMute(){
		//redirect the System-err-output so we can assert against it 
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));

	    gs.players.get(0).gain(cards.get(0), true);
	    assertTrue(outContent.toString().length() == 0);
	    gs.players.get(0).gain(cards.get(0), false);
	    assertTrue(outContent.toString().length() > 0);
	}

	@Test
	public void testGardensGetsScored(){
		Player p = gs.players.get(0);
		int score_before = p.scoreFor();
		p.hand.add(new Card(CardName.Garden, Type.ACTION,4,0,0));
		for(int i =0; i< 400; i++){
			p.hand.add(new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1));
		}
		assertTrue(score_before != p.scoreFor());
		
	}
	
	@Test
	public void testPlayKingdomCardNoHand(){
		Player p = gs.players.get(0);
		p.hand.clear();
		int num_actions_before = p.numActions;
		p.playKingdomCard();
		assertTrue(num_actions_before == p.numActions);
	}
	@Test
	public void testPlayKingdomCardBranchesTest() {
		Player p = gs.players.get(0);
		
		p.numActions = 3;
		Card c = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		p.hand.add(c);
		p.hand.add(c);
		p.hand.add(c);
		p.deck.add(c);
		p.deck.add(c);
		p.deck.add(c);
		
		int discard_before = p.discard.size();
		p.playKingdomCard();
		assertEquals("Card pulled and put into ", p.discard.size(), discard_before + 1);
		
	}
	
	@Test
	public void testPrintStateGame(){
		//redirect the System-err-output so we can assert against it 
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    gs.players.get(0).printStateGame();
	    
	    assertTrue(outContent.toString().length() > 0);
	}
	
	@Test
	public void testRevealHand(){
		//redirect the System-err-output so we can assert against it 
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    gs.players.get(0).revealHand();
	    
	    assertTrue(outContent.toString().length() > 0);
	}
	
	@Test
	public void testBuyCard(){
		Player p = gs.players.get(0);
		p.coins+=420;
		p.numBuys+=3;
		
		int n_coins_before = p.coins;
		p.buyCard();
		int n_coins_after = p.coins;
		assertTrue(n_coins_before > n_coins_after);
	}
	
	@Test
	public void testEndTurn(){
		Player p = gs.players.get(0);
		p.hand.add(new Card(CardName.Gold, Type.TREASURE, 6, 0, 3));
		assertTrue(!(p.hand.isEmpty()));
		p.endTurn();
		assertTrue(p.hand.size()==5);
		assertTrue(p.numActions == 1);
		assertTrue(p.coins == 0);
		assertTrue(p.numBuys == 1);
	}
	@Test
	public void testPlayTreasures(){
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    Player p = gs.players.get(0);
		p.hand.clear();
		p.hand.add(new Card(CardName.Gold, Type.TREASURE, 6, 0, 3));
		int n_coins_before = p.coins;
		p.playTtreasureCard();
		assertTrue(p.hand.isEmpty());
		assertTrue(p.coins == n_coins_before + 3);
	    
	    assertTrue(outContent.toString().length() > 0);
	}
}
