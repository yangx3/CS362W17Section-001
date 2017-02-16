package org.cs362.dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class cardTest {

	private board b;
	private player p;
	private userInterface ui;
	private List<card> deck;

	@Before
	public void initializeTest(){

		b = new board();
		p = new player("Test");
		ui = new userInterface();


	}

	@Test
	public void testGetters(){

		card c = new card(card.CardName.Copper, card.Type.TREASURE, 0,0,1);

		
		assertEquals( c.getScore(), 0 );
		assertEquals( c.getCost(), 0 );
		assertEquals( c.getTreasureValue(),1 );	
		assertEquals(1,1);
	}

	@Test
	public void testDeckInitialization(){
		
		List<card> drawDeck = card.initDeck();
		List<card> silverDeck = card.initSilverStock();
		List<card> copperDeck = card.initCopperStock();
		List<card> goldDeck = card.initGoldStock();

		List<card> v1 = card.initVictoryStock( 1 );
		List<card> v2 = card.initVictoryStock(2);
		List<card> v3 = card.initVictoryStock(3);

		assertEquals( copperDeck.size(), 10);
		assertEquals( drawDeck.size(), 10);
		assertEquals( silverDeck.size(), 10);
		assertEquals( goldDeck.size(), 10);

		assertEquals( v1.size(),10);
		assertEquals(v2.size(),10);
		assertEquals(v3.size(),10);
	}
}
