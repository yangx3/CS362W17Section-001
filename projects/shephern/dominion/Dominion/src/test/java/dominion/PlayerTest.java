package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	private GameState state;
	private Player player1;
	private Player player2;
	
	@Before
	public void initPlayer(){
		Randomness.reset(10);
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		player1 = new Player(state, "p1");
		state.addPlayer(player1);
		
		player2 = new Player(state, "p2");
		state.addPlayer(player2);
		state.initializeGame(13);
	}
	
	@Test
	public void testInitPlayer() {
		System.out.println("---Test Init---");
		player1.hand.clear();
		player1.initializePlayerTurn();
		assertEquals(player1.coins, 0);
		assertEquals(player1.hand.size(), 5);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
	}
	
	@Test
	public void testDraw(){
		System.out.println("---Test Draw---");
		player1.hand.clear();
		int size = player1.deck.size();
		player1.drawCard();
		
		assertEquals(player1.hand.size(), 1);
		assertEquals(player1.deck.size(), size - 1);
		assertEquals(player1.discard.size(), 0);
		
		player1.deck.clear();
		player1.discard.clear();
		player1.hand.clear();
		
		Card c = player1.drawCard();
		assertEquals(c, null);
		assertEquals(player1.hand.size(), 0);
		assertEquals(player1.deck.size(), 0);
		assertEquals(player1.discard.size(), 0);
	}
	
	@Test
	public void testGain(){
		System.out.println("---Test Gain---");
		player1.gain(Card.getCard(state.cards, Card.CardName.Adventurer));
		
		assertEquals(player1.discard.size(), 1);
		assertEquals(player1.hand.size(), 5);
		assertTrue(player1.discard.contains(Card.getCard(state.cards, Card.CardName.Adventurer)));
	}
	
	@Test
	public void testDiscard(){
		System.out.println("---Test Discard---");
		Card tmp = Card.getCard(state.cards, Card.CardName.Baron);
		player1.discard.clear();
		
		player1.hand.add(tmp);
		assertTrue(player1.hand.contains(tmp));
		assertEquals(player1.discard.size(), 0);
		player1.discard(tmp);
		assertFalse(player1.hand.contains(tmp));
		assertEquals(player1.discard.size(), 1);
		assertTrue(player1.discard.contains(tmp));
	}
	
	@Test
	public void testPlayKingdom(){
		System.out.println("---Test PlayKingdom---");
		Card tmp = Card.getCard(state.cards, Card.CardName.Cutpurse);
		
		player1.hand.add(tmp);
		assertEquals(player1.hand.size(), 6);
		assertEquals(player1.discard.size(), 0);
		assertEquals(player1.playedCards.size(), 0);
		assertEquals(player1.numActions, 1);
		
		player1.playKingdomCard(state);
		
		assertEquals(player1.hand.size(), 5); 
		assertEquals(player1.discard.size(), 0);
		assertEquals(player1.playedCards.size(), 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.coins, 2);
		assertTrue(player1.playedCards.contains(tmp));
	}
	
	@Test
	public void testPlayTreasure(){
		System.out.println("---Test PlayTreasure---");
		Card tmp = Card.getCard(state.cards, Card.CardName.Copper);
		player1.hand.clear();
		
		player1.playTreasureCard();
		assertEquals(player1.coins, 0);
		assertEquals(player1.hand.size(), 0);
		
		player1.hand.add(tmp);
		player1.playTreasureCard();
		assertEquals(player1.coins, 1);
		assertEquals(player1.hand.size(), 1);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testBuyCard(){
		System.out.println("---Test BuyCard---");
		Card tmp = Card.getCard(state.cards, Card.CardName.Copper);
		player1.discard.clear();
		player1.coins = 0;
		player1.buyCard(state, 0);
		
		//Buys copper when there is 0 coins
		assertTrue(state.gameBoard.get(tmp) == 45);
		assertTrue(player1.discard.contains(tmp));
		assertEquals(player1.numBuys, 0);
		
		player1.discard.clear();
		player1.coins = 0;
		player1.numBuys = 1;
		state.gameBoard.replace(tmp, 0);
		player1.buyCard(state, 0);
		
		//Buys nothing when there is 0 coins and 0 copper
		assertTrue(state.gameBoard.get(tmp) == 0);
		assertFalse(player1.discard.contains(tmp));
		assertEquals(player1.numBuys, 1); //Still has buy, skips
		
		player1.coins = 4;
		player1.numBuys = 1;
		player1.discard.clear();
		//Buy random
		player1.buyCard(state, 12);  //Buys embargo
		Card bought = player1.discard.get(0);
			
		assertEquals(player1.coins, 4-bought.getCost());
		assertTrue(player1.discard.contains(bought));
		assertEquals(player1.numBuys, 0);
		
	}
	
	@Test
	public void testBuyTokenedCard(){
		System.out.println("---Test Tokened Buy---");
		
		Card bought = Card.getCard(state.cards, Card.CardName.Embargo);
		player1.discard.clear();
		player1.coins = 4;
		state.tokensPlaced.replace(bought, 1);
		player1.buyCard(state, 12); //More embargo, now with token
		
		assertEquals(player1.coins, 4-bought.getCost());
		assertTrue(player1.discard.contains(bought));
		assertEquals(player1.numBuys, 0);
		assertTrue(player1.discard.contains(Card.getCard(state.cards, Card.CardName.Curse)));
		
		player1.discard.clear();
		player1.coins = 4;
		player1.numBuys = 1;
		state.tokensPlaced.replace(bought, 3);
		player1.buyCard(state, 12); //More embargo, now with token
		
		assertEquals(player1.coins, 4-bought.getCost());
		assertTrue(player1.discard.contains(bought));
		assertEquals(player1.numBuys, 0);
		assertTrue(player1.discard.contains(Card.getCard(state.cards, Card.CardName.Curse)));
		assertTrue(player1.scoreFor() == 0); //
	}
	
	@Test
	public void testEndTurn(){
		player1.discard.clear();
		System.out.println("---Test EndTurn---");
		for(int i = 0; i < 12; i++)
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Adventurer));
		player1.playedCards.add(Card.getCard(state.cards, Card.CardName.Baron));
		player1.playedCards.add(Card.getCard(state.cards, Card.CardName.Embargo)); //Gets trashed
		player1.coins = 2000000;
		player1.numActions = -12;
		player1.numBuys = 9;
		
		player1.endTurn();
		
		assertEquals(player1.coins, 0);
		assertTrue(player1.discard.contains(Card.getCard(state.cards, Card.CardName.Adventurer)));
		assertTrue(player1.discard.contains(Card.getCard(state.cards, Card.CardName.Baron)));
		assertFalse(player1.discard.contains(Card.getCard(state.cards, Card.CardName.Embargo)));
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
	}
	
	@Test
	public void testScoreFor(){
		System.out.println("---Test ScoreFor---");
		player1.deck.clear();
		player1.hand.clear();
		player1.discard.clear();
		
		Card tmp = Card.getCard(state.cards, Card.CardName.Estate);
		Card gardens = Card.getCard(state.cards, Card.CardName.Gardens);
		player1.deck.add(gardens);
		player1.deck.add(tmp);
		player1.hand.add(tmp);
		player1.discard.add(tmp);
		player1.playedCards.add(tmp);
		
		int score = player1.scoreFor();
		
		assertEquals(score, 4);
		assertEquals(player2.scoreFor(), 3); //7copper 3 estates
	}
	
	@Test
	public void testPrintString(){
		System.out.println("---Test printScreen---");
		
		player1.printHand();
		assertEquals(player1.hand.size(), 5);
		
		String a = player1.toString();
		assertTrue(a.contains("Estate"));
	}
	
	@Test
	public void testClone() throws CloneNotSupportedException{
		Player pClone = player1.clone();
		assertEquals(pClone.coins, player1.coins);
		assertEquals(pClone.deck, player1.deck);
		assertEquals(pClone.discard, player1.discard);
		assertEquals(pClone.hand, player1.hand);
		assertEquals(pClone.numActions, player1.numActions);
		assertEquals(pClone.numBuys, player1.numBuys);
		assertEquals(pClone.playedCards, player1.playedCards);
		assertEquals(pClone.player_username, player1.player_username);
	}
}
