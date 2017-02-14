package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



	

import org.junit.Test;

public class GamestateTest {
	private List<Card> cards;
    private GameState gs;
    private Player p1;
    private Player p2;
    private Player p3;
    private Player p4;
    private Player p5;
    
    @Before
    public void initTestPlayer() {
        cards = new ArrayList<Card>(Card.createCards());
        gs = new GameState(cards);
        gs.initializeGame();
    }

//Test for adding a player
	@Test
	public void addPlayertest() {
		p3 = new Player(gs, "player-3");
		gs.addPlayer(p3);

	}
	
	//Test for invalid number of players
	@Test
	public void InitializeGametest_number_players() {
		p1 = new Player(gs, "player-1");
		gs.addPlayer(p1);
		
		gs.initializeGame(); //run with too few people
		System.err.println("the number of players must be between 2 and 4 ");
		assertEquals(p1.discard.size(), 0);
		
		p2 = new Player(gs, "player-2");
	    gs.addPlayer(p2);
	    p3 = new Player(gs, "player-3");
	    gs.addPlayer(p3);
	    p4 = new Player(gs, "player-4");
	    gs.addPlayer(p4);
	    p5 = new Player(gs, "player-5");
	    gs.addPlayer(p5);
	    
	    gs.initializeGame(); //run game with too many people
	    assertEquals(p1.discard.size(), 0);

	}
	
	@Test
	public void InitializeGametest_Set_Up_Decks() {
		p1 = new Player(gs, "player-1");
		gs.addPlayer(p1);
		
		p2 = new Player(gs, "player-2");
	    gs.addPlayer(p2);
	    
	    assertEquals(p1.discard.size(), 0);
	    gs.initializeGame(); 
		assertEquals(p1.discard.size(), 10);

		int numCoppers = 0;
		int numEstates = 0;
		for (Card c : p1.discard) {
			if (c.getTreasureValue()== 1){
				numCoppers++;
			}
			else if (c.getScore() == 1 ){
				numEstates++;
			}
		}
		assertEquals(numCoppers, 7);
		assertEquals(numEstates, 3);
	}

	
	//Test for checking hand, deck, discard, and playedCards size
	@Test
	public void InitializeGametest_EmptyHands() {
		p1 = new Player(gs, "player-1");
		gs.addPlayer(p1);		
		p2 = new Player(gs, "player-2");
	    gs.addPlayer(p2);
	    
		assertEquals(p1.discard.size(), 0);
		assertEquals(p1.hand.size(), 0);
		assertEquals(p1.deck.size(), 0);
		assertEquals(p1.playedCards.size(), 0);
		assertEquals(p2.discard.size(), 0);
		assertEquals(p2.hand.size(), 0);
		assertEquals(p2.deck.size(), 0);
		assertEquals(p2.playedCards.size(), 0);
		
	    gs.initializeGame(); 
	    
		assertEquals(p1.discard.size(), 10);
		assertEquals(p1.hand.size(), 0);
		assertEquals(p1.deck.size(), 0);
		assertEquals(p1.playedCards.size(), 0);
		assertEquals(p2.discard.size(), 10);
		assertEquals(p2.hand.size(), 0);
		assertEquals(p2.deck.size(), 0);
		assertEquals(p2.playedCards.size(), 0);

	}


//Test for isGameOver()
@Test
public void isGameOverTest() {
	p1 = new Player(gs, "player-1");
	gs.addPlayer(p1);		
	p2 = new Player(gs, "player-2");
    gs.addPlayer(p2);
    
    assertTrue(gs.isGameOver());
    gs.initializeGame(); 
    assertFalse(gs.isGameOver());
    assertEquals(p1.deck.size(), 0);
    //First way to end game: no province cards
    for(int i = 0; i < 8; i++) {
        p1.deck.add(Card.getCard(gs.cards, Card.CardName.Province));
        gs.gameBoard.put(Card.getCard(gs.cards, Card.CardName.Province), gs.gameBoard.get(Card.getCard(gs.cards, Card.CardName.Province)) - 1 );
    }
    assertEquals(p1.deck.size(), 8);
    assertTrue(gs.isGameOver());
    
    gs.gameBoard.put(Card.getCard(gs.cards, Card.CardName.Province), 8 );
    
  //Second way is to exhaust 3 supply piles
    assertFalse(gs.isGameOver());
    
    gs.gameBoard.put(Card.getCard(gs.cards, Card.CardName.Adventurer), 0 );
    gs.gameBoard.put(Card.getCard(gs.cards, Card.CardName.GreatHall), 0 );
    gs.gameBoard.put(Card.getCard(gs.cards, Card.CardName.Village), 0 );
    assertTrue(gs.isGameOver());
    
}

//Test for getWinners()
@Test
public void getWinnersTest() {
	p1 = new Player(gs, "player-1");
	gs.addPlayer(p1);		
	p2 = new Player(gs, "player-2");
    gs.addPlayer(p2);
    gs.initializeGame(); 
    
    for(int i = 0; i < 8; i++) {
        p1.deck.add(Card.getCard(gs.cards, Card.CardName.Province));
        gs.gameBoard.put(Card.getCard(gs.cards, Card.CardName.Province), gs.gameBoard.get(Card.getCard(gs.cards, Card.CardName.Province)) - 1 );
    }

    assertEquals(p1.scoreFor(), 51); //8 province + 3 estate = (8*6) + 3 = 51
    assertEquals(p2.scoreFor(), 3);  //3 estate
   
}

@Test
public void playTest() {  //any Black Mirror fans?
	p1 = new Player(gs, "player-1");
	gs.addPlayer(p1);		
	p2 = new Player(gs, "player-2");
    gs.addPlayer(p2);
    gs.initializeGame(); 
    p1.initializePlayerTurn();
 	p1.playKingdomCard();
	    p1.playTtreasureCard();
    p1.buyCard(gs);
    p1.endTurn();

}



}

