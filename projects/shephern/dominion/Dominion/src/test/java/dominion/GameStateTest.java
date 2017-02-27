package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GameStateTest {
	private GameState state;
	private List<Card> cards;
	
	@Before
	public void init(){
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
	}
	@Test
	public void testInit() {
		System.out.println("---Test Init---");		
		assertEquals(state.cards, cards);
		assertEquals(state.players.size(), 0);
	}
	
	@Test
	public void testAddPlayer(){
		System.out.println("---Test addPlayer---");
		Player p = new Player(state, "Testing1");

		state.addPlayer(p);
		assertEquals(state.players.size(), 1);
		assertTrue(state.players.get(0).player_username == "Testing1");
	}

	@Test
	public void testInitGame(){
		System.out.println("---Test initGame---");
		//Test error
		state.initializeGame(13);
		assertTrue(state.gameBoard.isEmpty());
		
		Player p = new Player(state, "Testing1");
		state.addPlayer(p);
		p = new Player(state, "Testing2");
		state.addPlayer(p);
		
		state.initializeGame(13);
		
		assertEquals(state.players.get(0).hand.size(), 5);
		assertEquals(state.players.get(1).hand.size(), 5);
		assertEquals(state.players.get(0).deck.size(), 5);
		assertEquals(state.players.get(1).deck.size(), 5);
		assertEquals(state.players.get(0).numActions, 1);
		assertEquals(state.players.get(1).numActions, 1);
		assertEquals(state.players.get(0).numBuys, 1);
		assertEquals(state.players.get(1).numBuys, 1);
		assertEquals(state.players.get(0).coins, 0);
		assertEquals(state.players.get(1).coins, 0);
		
		List<Card> tester = new ArrayList<Card>(state.gameBoard.keySet());
		
		assertTrue(tester.containsAll(cards));
		assertEquals(state.gameBoard.size(), cards.size());
		assertTrue(state.gameBoard.get(cards.get(0)) == 30);
		assertEquals(state.tokensPlaced.size(), cards.size());
	}
	
	@Test
	public void testTakeCard(){
		System.out.println("---Test TakeCard---");
		
		Player p = new Player(state, "Testing1");
		state.addPlayer(p);
		p = new Player(state, "Testing2");
		state.addPlayer(p);
		
		state.initializeGame(13);
		Card tmp = Card.getCard(cards,Card.CardName.Adventurer);
		Card tmp1 = Card.getCard(cards,Card.CardName.Baron);

		assertTrue(state.gameBoard.get(tmp) == 10);
		assertTrue(state.gameBoard.get(tmp1) == 10);
		
		Card check = state.takeCard(tmp);
		assertTrue(state.gameBoard.get(tmp) == 9);
		assertTrue(state.gameBoard.get(tmp1) == 10); //Others are unchanged
		assertEquals(check, tmp);
	}
	
	@Test
	public void testTakeCard1(){
		//Test take card with name given
		System.out.println("---Test TakeCard1---");
		
		Player p = new Player(state, "Testing1");
		state.addPlayer(p);
		p = new Player(state, "Testing2");
		state.addPlayer(p);
		
		state.initializeGame(13);
		Card tmp = Card.getCard(cards,Card.CardName.Adventurer);
		Card tmp1 = Card.getCard(cards,Card.CardName.Baron);

		assertTrue(state.gameBoard.get(tmp) == 10);
		assertTrue(state.gameBoard.get(tmp1) == 10);
		
		Card check = state.takeCard(Card.CardName.Adventurer);
		assertTrue(state.gameBoard.get(tmp) == 9);
		assertTrue(state.gameBoard.get(tmp1) == 10); //Others are unchanged
		assertEquals(check, tmp);
	}
	
	@Test
	public void testAddCard(){
		System.out.println("---Test addCard---");
		
		Player p = new Player(state, "Testing1");
		state.addPlayer(p);
		p = new Player(state, "Testing2");
		state.addPlayer(p);
		state.initializeGame(13);
		
		Card tmp = Card.getCard(cards,Card.CardName.Adventurer);
		Card tmp1 = Card.getCard(cards,Card.CardName.Baron);

		assertTrue(state.gameBoard.get(tmp) == 10);
		assertTrue(state.gameBoard.get(tmp1) == 10);
		
		Card check = state.addCard(tmp);
		assertTrue(state.gameBoard.get(tmp) == 11);
		assertTrue(state.gameBoard.get(tmp1) == 10); //Others are unchanged
		assertEquals(check, tmp);	
	}
	
	@Test
	public void testPlay(){
		System.out.println("---Test Play---");
		Player p = new Player(state, "Testing1");
		state.addPlayer(p);
		p = new Player(state, "Testing2");
		state.addPlayer(p);
		state.initializeGame(13);
		int cardTotal = 0;
		int cardTotalAfter = 0;
		for(Card c: cards){
			cardTotal = cardTotal + state.gameBoard.get(c);
		}
		assertEquals(state.players.get(0).scoreFor(), 3);
		assertEquals(state.players.get(1).scoreFor(), 3);
		
		HashMap<Player, Integer> results = state.play(2);
		
		for(Card c: cards){
			cardTotalAfter = cardTotalAfter + state.gameBoard.get(c);
		}		
		assertTrue(cardTotal > cardTotalAfter);  //Cards have been bought
	}
	
	@Test
	public void testGameOver(){
		System.out.println("---Test GameOver---");
		Player p = new Player(state, "Testing1");
		state.addPlayer(p);
		p = new Player(state, "Testing2");
		state.addPlayer(p);
		state.initializeGame(13);
		//Game isn't over
		assertFalse(state.isGameOver());
		//Province case
		state.gameBoard.replace(Card.getCard(cards, Card.CardName.Province), 0);
		assertTrue(state.isGameOver());
		
		state.gameBoard.replace(Card.getCard(cards, Card.CardName.Province), 10);
		state.gameBoard.replace(Card.getCard(cards, Card.CardName.Adventurer), 0);
		state.gameBoard.replace(Card.getCard(cards, Card.CardName.Ambassador), 0);
		state.gameBoard.replace(Card.getCard(cards, Card.CardName.Copper), 0);
		//3 empty case
		assertTrue(state.isGameOver());
	}
	
	@Test
	public void testGetWinners(){
		System.out.println("---Test getWinners---");
		Player p1 = new Player(state, "Testing1");
		state.addPlayer(p1);
		Player p2 = new Player(state, "Testing2");
		state.addPlayer(p2);
		state.initializeGame(13);
		
		HashMap<Player, Integer> results = state.play(2);

		assertEquals(results.size(), 2);
		assertTrue(results.get(p1) == p1.scoreFor());
		assertTrue(results.get(p2) == p2.scoreFor());
	}
	
	@Test
	public void testPrintState(){
		System.out.println("---Test print---");
		String s = state.toString();
		
		assertTrue(s.contains("The board game is empty"));
		
		Player p1 = new Player(state, "Testing1");
		state.addPlayer(p1);
		Player p2 = new Player(state, "Testing2");
		state.addPlayer(p2);
		state.initializeGame(13);
		
		s = state.toString();
		assertTrue(s.contains("gameBoard"));		
	}
}
