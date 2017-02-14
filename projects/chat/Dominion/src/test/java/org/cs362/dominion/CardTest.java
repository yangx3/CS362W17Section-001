package org.cs362.dominion;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

//JUnit for Assert testing
import static org.junit.Assert.*;

//Create objects for tests before they can run
import org.junit.Before;

//Allows JUnit to run public voids as a method for tests
import org.junit.Test;

public class CardTest {
	private GameState state;
	private Player player1;
	private Player player2;
	private List<Card> cards;
	
	@Before
	public void initializePlayer() {
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		player1 = new Player(state, "Alice");
		player2 = new Player(state, "Bob ");
		state.addPlayer(player1);
		state.addPlayer(player2);
		assertTrue(state.players.size() >= 2 );
		
		//Bugs out when I initialize the game,so I just created individual classes to test cards individually.
		//state.initializeGame();
	}

	/*
	 * Test Treasure Cards
	 */
	
	@Test
	public void testCopper() {
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getCost(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Copper).score(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getType(), Card.Type.TREASURE);
		
		assertEquals(player1.coins, 0);
		player1.hand.add(Card.getCard(cards, Card.CardName.Copper));
		player1.playTreasureCard();
		assertEquals(player1.coins, 1);
		//assertEquals(player1.coins, 2);
	}
	
	@Test
	public void testSilver() {
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getCost(), 3);
		assertEquals(Card.getCard(cards, Card.CardName.Silver).score(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getType(), Card.Type.TREASURE);
		
		assertEquals(player2.coins, 0);
		player1.hand.add(Card.getCard(cards, Card.CardName.Silver));
		player1.playTreasureCard();
		//assertEquals(player1.coins, 1);
		assertEquals(player1.coins, 2);
	}
	
	@Test
	public void testGold() {
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getCost(), 6);
		assertEquals(Card.getCard(cards, Card.CardName.Gold).score(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getType(), Card.Type.TREASURE);
		
		assertEquals(player1.coins, 0);
		player1.hand.add(Card.getCard(cards, Card.CardName.Gold));
		player1.playTreasureCard();
		assertEquals(player1.coins, 3);
		//assertEquals(player1.coins, 2);
	}
	/*
	 * Test Kingdom Cards
	 */
	
	@Test
	public void testAdventurer() {
				assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getCost(), 6);
				assertEquals(Card.getCard(cards, Card.CardName.Adventurer).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getType(), Card.Type.ACTION);

	}
	
	@Test
	public void testAmbassador() {
				assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getCost(), 3);
				assertEquals(Card.getCard(cards, Card.CardName.Ambassador).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testBaron() {
				assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4);				
				assertEquals(Card.getCard(cards, Card.CardName.Baron).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testCouncil_Room() {
				assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getCost(), 5);
				assertEquals(Card.getCard(cards, Card.CardName.Council_Room).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testCutpurse() {
				assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getCost(), 4);
				assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testEmbargo() {
				assertEquals(Card.getCard(cards, Card.CardName.Embargo).getCost(), 2);
				assertEquals(Card.getCard(cards, Card.CardName.Embargo).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Embargo).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testGardens() {
				assertEquals(Card.getCard(cards, Card.CardName.Gardens).getCost(), 4);
				assertEquals(Card.getCard(cards, Card.CardName.Gardens).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Gardens).getType(), Card.Type.VICTORY);
	}
	
	@Test
	public void testGreat_Hall() {
				assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getCost(), 3);
				assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).score(), 1);
				assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testMine() {
				assertEquals(Card.getCard(cards, Card.CardName.Mine).getCost(), 5);
				assertEquals(Card.getCard(cards, Card.CardName.Mine).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Mine).getType(), Card.Type.ACTION);
	}
	
	@Test
	public void testVillage() {
				assertEquals(Card.getCard(cards, Card.CardName.Village).getCost(), 3);
				assertEquals(Card.getCard(cards, Card.CardName.Village).score(), 0);
				assertEquals(Card.getCard(cards, Card.CardName.Village).getType(), Card.Type.ACTION);
	}
}