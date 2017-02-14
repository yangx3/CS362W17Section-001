package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {
	private GameState state;
    private Player player1;
    private Player player2;
    private ArrayList<Card> cards;

    @Before
    public void initializeGame() {
    	cards = new ArrayList<Card>(Card.createCards());
    	state = new GameState(cards);
    	Randomness.reset();
    	player1 = new Player(state, "player-1");
    	state.addPlayer(player1);
    	player2 = new Player(state, "player-2");
    	state.addPlayer(player2);
    	//Initialize the game
    	state.initializeGame();
    }

	@Test
	public void PlayerInitializationTest() {
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numTurns, 0);
		assertEquals(player1.player_username, "player-1");
		assertEquals(player1.hand.size(), 5);
		assertEquals(player1.deck.size(), 5);
		assertEquals(player1.discard.size(), 0);
		assertEquals(player1.playedCards.size(), 0);
		assertEquals(player1.scoreFor(), 3);
		assertEquals(player1.gameState, state);
		assertEquals(player2.numActions, 1);
		assertEquals(player2.numBuys, 1);
		assertEquals(player2.coins, 0);
		assertEquals(player2.numTurns, 0);
		assertEquals(player2.player_username, "player-2");
		assertEquals(player2.hand.size(), 5);
		assertEquals(player2.deck.size(), 5);
		assertEquals(player2.discard.size(), 0);
		assertEquals(player2.playedCards.size(), 0);
		assertEquals(player2.scoreFor(), 3);	
		assertEquals(player2.gameState, state);
	}
	
	@Test
	public void drawCardTest() {
		for (Card c: player1.deck)
			player1.discard.add(c);
		player1.deck.clear();
		assertEquals(player1.deck.size(), 0);
		int handSize = player1.hand.size();
		player1.drawCard();
		assertTrue(player1.deck.size() > 0);
		assertEquals(player1.discard.size(), 0);
		assertEquals(player1.hand.size(), handSize + 1);
	}
	
	@Test 
	public void initializePlayerTurnTest() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.numActions, 1);	
    	player1.hand.add(Card.getCard(state.cards, Card.CardName.Smithy));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 8);
    	player1.endTurn();
    	player1.initializePlayerTurn();
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.coins, 0);	
	}
	
	@Test
	public void gainCardTest() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	player1.gain(Card.getCard(state.cards, Card.CardName.Village));
    	assertEquals(player1.discard.size(), 1);
	}
	
	@Test 
	public void discardCardTest() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	player1.discard(Card.getCard(player1.hand, Card.CardName.Copper));
    	assertEquals(player1.discard.size(), 1);
	}
	
	@Test 
	public void scoreForTest() {
		player1.deck.add(Card.getCard(state.cards, Card.CardName.Gardens));
		player1.deck.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.deck.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.deck.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.deck.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.discard.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		assertEquals(player1.deck.size() + player1.hand.size() + player1.discard.size(), 20);
		assertEquals(player1.scoreFor(), 5);
	}
	
	@Test 
	public void playKingdomCardTest() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	List<Card> kingCards = Card.filter(player1.hand, Card.Type.ACTION);
    	assertEquals(kingCards.size(), 0);
        player1.playKingdomCard();
        assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);   
	}
	
	@Test
	public void playTtreasureCardTest() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.coins, 0);
        player1.playTtreasureCard();
        int currCoins = player1.coins;
        assertTrue(currCoins > 0);
        assertTrue(player1.hand.size() < 5);
        assertTrue(player1.playedCards.size() > 0);
        player1.coins = 0;
        assertEquals(player1.coins, 0);
        player1.playTtreasureCard();
        assertEquals(player1.coins, 0);
	}
	
	@Test 
	public void buyCardTest0_1() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		player1.buyCard(state);
		assertEquals(player1.discard.size(), 1);	
		player1.coins++;
		player1.numBuys++;
		assertEquals(player1.coins, 1);
		player1.buyCard(state);
		assertEquals(player1.discard.size(), 2);	
		assertEquals(player1.coins, 1);
		for(Card c: player1.discard)
			assertEquals(c.getCardName(), Card.CardName.Copper);		
	}
	
	@Test 
	public void buyCardTest2() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 2;
		player1.coins = testCoins;
		assertEquals(player1.coins, 2);
		assertEquals(player1.discard.size(), 0);	
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 0);
	}
		
	@Test 
	public void buyCardTest3() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 3;
		player1.coins = testCoins;
		assertEquals(player1.coins, 3);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 0);
	}
	
	@Test 
	public void buyCardTest4() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 4;
		player1.coins = testCoins;
		assertEquals(player1.coins, 4);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 0);
	}
	
	@Test 
	public void buyCardTest5() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 5;
		player1.coins = testCoins;
		assertEquals(player1.coins, 5);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 0);
	}
	
	@Test 
	public void buyCardTest6() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 6;
		player1.coins = testCoins;
		assertEquals(player1.coins, 6);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 0);
	}
	
	@Test 
	public void buyCardTest7() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 7;
		player1.coins = testCoins;
		assertEquals(player1.coins, 7);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 1);
	}
	
	@Test 
	public void buyCardTest8() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		int testCoins = 8;
		player1.coins = testCoins;
		assertEquals(player1.coins, 8);
		assertTrue(Card.getCard(state.cards, CardName.Province) != null);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 1);	
		assertEquals(player1.coins, 0);
		assertEquals(player1.discard.get(0).getCardName(), Card.CardName.Province);	
		player1.numBuys++;
		testCoins = 9;
		player1.coins = testCoins;
		assertEquals(player1.coins, 9);
		player1.buyCard(state);
		assertEquals(player1.numBuys, 0);
		assertEquals(player1.discard.size(), 2);
		for(Card c: player1.discard)
			assertEquals(c.getCardName(), Card.CardName.Province);
		assertEquals(player1.coins, 1);	
	}
		
	@Test 
	public void endTurnTest() {
		assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 1);
		player1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
		player1.playKingdomCard();
		assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 8);
		player1.playTtreasureCard();
		assertTrue(player1.coins > 0);
		player1.buyCard(state);
		assertEquals(player1.discard.size(), 1);
    	player1.endTurn();
    	assertEquals(player1.hand.size(), 0);
    	assertEquals(player1.deck.size(), 2);
    	assertTrue(player1.discard.size() > 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.playedCards.size(), 0);		
	}

}
