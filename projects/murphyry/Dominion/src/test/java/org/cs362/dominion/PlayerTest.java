package org.cs362.dominion;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	
	private List<Card> cards;
    private GameState gs;
    private Player p1;
    private Player p2;
    
    @Before
    public void initializeGame() {

        cards = new ArrayList<Card>(Card.createCards());
        gs = new GameState(cards);
        p1 = new Player(gs, "PLAYER 1");
        gs.addPlayer(p1);
        p2 = new Player(gs, "PLAYER 2");
        gs.addPlayer(p2);
        //gs.initializeGame();
    }


	@Test
	public void drawCard() {
		gs.initializeGame();
		assertEquals(p1.discard.size(), 10);
		assertEquals(p1.hand.size(), 0);
		assertEquals(p1.deck.size(), 0);
		assertEquals(p1.playedCards.size(), 0);
		assertEquals(p2.discard.size(), 10);
		assertEquals(p2.hand.size(), 0);
		assertEquals(p2.deck.size(), 0);
		assertEquals(p2.playedCards.size(), 0);
		
		p1.initializePlayerTurn();
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 5);
		assertEquals(p1.deck.size(), 5);
		assertEquals(p1.playedCards.size(), 0);
		
		p2.initializePlayerTurn();
		assertEquals(p2.discard.size(), 0);
		assertEquals(p2.hand.size(), 5);
		assertEquals(p2.deck.size(), 5);
		assertEquals(p2.playedCards.size(), 0);
		
		for(int i = 0; i < 5; i++){
			p1.drawCard();
			assertEquals(p1.hand.size(), (6+i));
			assertEquals(p1.deck.size(), (4-i));
		}
	}
	
	@Test
	public void initializePlayerTurn() {
		assertEquals(p1.coins, 0);
		assertEquals(p1.numActions, 0);
		assertEquals(p1.numBuys, 0);
		gs.initializeGame();
		assertEquals(p1.discard.size(), 10);
		assertEquals(p1.hand.size(), 0);
		assertEquals(p1.deck.size(), 0);
		
		p1.initializePlayerTurn();
		
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 5);
		assertEquals(p1.deck.size(), 5);
		assertEquals(p1.coins, 0);
		assertEquals(p1.numActions, 1);
		assertEquals(p1.numBuys, 1);		

	}
	
	@Test
	public void GainTest() {
		gs.initializeGame();
		assertEquals(p1.discard.size(), 10);
		assertEquals(p1.hand.size(), 0);
		p1.gain(Card.getCard(cards, CardName.Smithy));
		assertEquals(p1.discard.size(), 11);
		assertEquals(p1.hand.size(), 0);
	
	}
	
	@Test
	public void discardTest() {
		gs.initializeGame();
		assertEquals(p1.discard.size(), 10);
		assertEquals(p1.hand.size(), 0);
		
		p1.initializePlayerTurn();
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 5);

		p1.discard(Card.getCard(cards, CardName.Copper));
		assertEquals(p1.discard.size(), 1);
		assertEquals(p1.hand.size(), 4);
	
	}
	
	@Test
	public void playKingdomCardTest() {
		gs.initializeGame();
		p1.initializePlayerTurn();
		p1.hand.add(Card.getCard(cards,  Card.CardName.Laboratory));
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 6);
		assertEquals(p1.deck.size(), 5);
		assertEquals(p1.playedCards.size(), 0);
		assertEquals(p1.coins, 0);
		assertEquals(p1.numActions, 1);
		assertEquals(p1.numBuys, 1);
		
		p1.playKingdomCard();
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 7);
		assertEquals(p1.deck.size(), 3);
		assertEquals(p1.playedCards.size(), 1);
		assertEquals(p1.coins, 0);
		assertEquals(p1.numActions, 1);
		assertEquals(p1.numBuys, 1);

	}
	
	@Test
	public void scoreForTest() {
		gs.initializeGame();
		p1.initializePlayerTurn();
		assertEquals(p1.scoreFor(), 3);  //3 from Estate
		p1.hand.add(Card.getCard(cards,  Card.CardName.Gardens));
		for(int i = 0; i<5; i++){
			p1.deck.add(Card.getCard(cards,  Card.CardName.Province));
		}
		assertEquals(p1.scoreFor(), 34); //30 from Province, 3 from Estate, 1 from Gardens
		
		p1.deck.add(Card.getCard(cards,  Card.CardName.Gardens));
		assertEquals(p1.scoreFor(), 36); //30 from Province, 3 from Estate, 2 from Gardens
	}
	
	@Test
	public void playTreasureCardTest() {
		gs.initializeGame();
		p1.hand.add(Card.getCard(cards,  Card.CardName.Copper));
		p1.hand.add(Card.getCard(cards,  Card.CardName.Silver));
		p1.hand.add(Card.getCard(cards,  Card.CardName.Gold));

		assertEquals(p1.coins, 0);
		assertEquals(p1.hand.size(), 3);
		assertEquals(p1.playedCards.size(), 0);
		
		p1.playTtreasureCard();
		assertEquals(p1.coins, 6);
		assertEquals(p1.hand.size(), 0);
		assertEquals(p1.playedCards.size(), 3);

	}
	
	@Test
	public void BuyCardTest() {
		gs.initializeGame();
		p1.coins=8;
		p1.buyCard(gs);
		assertEquals(p1.scoreFor(), 9);  //Buys Province card (6) + (3) from Estate cards in discard		

	}
	
	@Test
	public void EndTurnTest() {
		gs.initializeGame();
		p1.initializePlayerTurn();
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 5);
		assertEquals(p1.deck.size(), 5);
		assertEquals(p1.playedCards.size(), 0);
		
		p1.endTurn();
		
		assertEquals(p1.discard.size(), 5);
		assertEquals(p1.hand.size(), 0);
		assertEquals(p1.deck.size(), 5);
		assertEquals(p1.playedCards.size(), 0);

	}

	 @After
	    public void EraseStuffPlayer() {
	        p1.deck.clear();
	        p1.hand.clear();
	        p1.discard.clear();
	        p1.playedCards.clear();
	        p1.coins=0;
	        p1.numActions=0;
	        p1.numBuys=0;
	        p2.deck.clear();
	        p2.hand.clear();
	        p2.discard.clear();
	        p2.playedCards.clear();
	        p2.coins=0;
	        p2.numActions=0;
	        p2.numBuys=0;
	    }
	 
}
