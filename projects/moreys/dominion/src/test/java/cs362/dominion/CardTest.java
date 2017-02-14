package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cs362.dominion.Card;
import cs362.dominion.GameState;
import cs362.dominion.Player;
import cs362.dominion.Randomness;
import cs362.dominion.Card.CardName;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CardTest {
	private static ArrayList<Card> cards;
	private static ArrayList<Card> cards2;
	
	private static GameState gameState;
	private static GameState gameState2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cards = new ArrayList<Card>(Card.createCards());
		gameState = new GameState(cards);
		Randomness.reset();
		Player player = new Player(gameState, "Player 1");
		gameState.addPlayer(player);
		player = new Player(gameState, "Player 2");
		gameState.addPlayer(player);
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
	public void testGame() {
		int emptypile;
		HashMap<Player, Integer> winners=gameState.play();
		for (Player p : winners.keySet()){
			System.out.println("Player name: " + p.player_username + "Score: " + winners.get(p));
		}
		System.out.println(gameState.toString());
		if (gameState.Empty_Piles() > 2  && gameState.Empty_Piles() < 4) {
			assertTrue(gameState.Empty_Piles() == 3);
		}
		else
			assertTrue(gameState.Empty_Piles() == 1);
		
	}
	@Test
	public void testTreasureCards() {
		int coin_value = 0;
		Player p = gameState.players.get(1);
		Card c = Card.getCard(gameState.cards, Card.CardName.Cooper);
		Card s = Card.getCard(gameState.cards, Card.CardName.Silver);
		Card g = Card.getCard(gameState.cards, Card.CardName.Gold);
		
		p.hand.add(c);
		p.hand.add(s);
		p.hand.add(g);
		
		for (Card x : p.hand) {
			coin_value += x.getTreasureValue();
		}
		p.playTtreasureCard();
		
		
		assertEquals(p.coins, coin_value);
	}
	/*@Test
	public void testKindomCards() {
		int coin_value;
		Player p = gameState.players.get(1);
		Card a = Card.getCard(gameState.cards, Card.CardName.Adventurer);
		Card s = Card.getCard(gameState.cards, Card.CardName.Smithy);
		Card v = Card.getCard(gameState.cards, Card.CardName.Village);
		Card g = Card.getCard(gameState.cards, Card.CardName.Council_room);
		Card c = Card.getCard(gameState.cards, Card.CardName.Baron);
		Card b = Card.getCard(gameState.cards, Card.CardName.Mine);
		Card m = Card.getCard(gameState.cards, Card.CardName.Cutpurse);
		Card cut = Card.getCard(gameState.cards, Card.CardName.Great_Hall);
		Card great = Card.getCard(gameState.cards, Card.CardName.Steward);
		Card stew = Card.getCard(gameState.cards, Card.CardName.Gardens);
		Card gard = Card.getCard(gameState.cards, Card.CardName.Ambasador);
		Card ambas = Card.getCard(gameState.cards, Card.CardName.Embargo);
		Card embar = Card.getCard(gameState.cards, Card.CardName.Feast);
		
		p.hand.add(stew);
		p.hand.add(m);
		p.hand.add(b);
		p.hand.add(cut);
		p.hand.add(great);
		p.hand.add(gard);
		p.hand.add(ambas);
		p.hand.add(embar);
		p.hand.add(a);
		p.hand.add(s);
		p.hand.add(v);
		p.hand.add(g);
		p.hand.add(c);
		
		p.numActions += 40;
		
		p.playKingdomCard();
		
		
	}*/


}
