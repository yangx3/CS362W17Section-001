package cs362.dominion;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cs362.dominion.Card.CardName;
import cs362.dominion.Card.Type;

public class GameStateTest {

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
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlayerLimitsLow(){
		//redirect the System-err-output so we can assert against it 
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setErr(new PrintStream(outContent));
	    
	    gs.players.remove(0);
	    gs.initializeGame();
	    
	    assertEquals("the number of players mus be between 2 and 4 \n", outContent.toString());
	}
	@Test
	public void testPlayerLimitsHigh(){
		//redirect the System-err-output so we can assert against it 
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setErr(new PrintStream(outContent));
	    
		gs.addPlayer(new Player(gs, "player-3"));
		gs.addPlayer(new Player(gs, "player-4"));
		gs.addPlayer(new Player(gs, "player-5"));
		gs.initializeGame();
	    
	    assertEquals("the number of players mus be between 2 and 4 \n", outContent.toString());
	}
	
	@Test
	public void testInitGame(){
		gs.initializeGame();
		
		Set<Card> cardsOnGameBoard = gs.gameBoard.keySet();
		assertTrue(cardsOnGameBoard.size() >= 13); //Assert that there at least 10 Kingdom cards on the gameboard + 3 Estate types.
	}
	
	@Test
	public void testGSGameboardEmptyToString(){
		gs.gameBoard.clear();
		assertEquals(gs.toString(),"The board game is embty you need to intialize the game!!!!");
	}

	@Test
	public void testGSGameboardToString(){
		gs.initializeGame();
		assertTrue(gs.toString().length() != 0);
	}
	@Test
	public void testScoring(){
		gs.initializeGame();
		for(Player p : gs.players){
			p.hand.add(new Card(CardName.Province,Type.VICTORY,8, 6, 0));
		}
		for(Integer i : gs.getWinners().values()){
			assertTrue(i != 0);
		}
	}
	
	@Test
	public void testGameOverNullP(){
		gs.initializeGame();
		Card province = Card.getCard(cards, Card.CardName.Province);
		gs.gameBoard.remove(province);
		assertTrue(gs.isGameOver());
	}
	@Test
	public void testGameOverZeroP(){
		gs.initializeGame();
		Card province = Card.getCard(cards, Card.CardName.Province);
		gs.gameBoard.put(province, 0);
		assertTrue(gs.isGameOver());
	}
	@Test
	public void testExhaustedPiles(){
		gs.initializeGame();
		Set<Card> keys = gs.gameBoard.keySet();
		for(Card c : keys){
			if(c.getCardName() != CardName.Province){
				gs.gameBoard.put(c, 0);
			}else{
				gs.gameBoard.put(c, 420);
			}
		}
		assertTrue(gs.isGameOver());
	}
	@Test
	public void testGameNotOver(){
		gs.initializeGame();
		assertFalse(gs.isGameOver());
	}
	
	@Test
	public void dryRunNoNPES(){
		try{
			gs.initializeGame();
			gs.play();
		}catch(NullPointerException e){
			fail("There was an NPE...");
		}
		
		assertTrue(true);
	}
}
