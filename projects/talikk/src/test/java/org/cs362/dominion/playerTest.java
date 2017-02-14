package org.cs362.dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class playerTest {


	@Before
	public void initPlayer(){
		
		player p = new player("TestName");


	}

	@Test
	public void testHandOperations(){
	
		player p = new player("TestName");

		List<card> allCopperDeck = card.initCopperStock();

		assertEquals( p.countGold( allCopperDeck ), 10);

		p.trashHand();
		assertEquals( p.getHand().size(), 0);

		p.refillHand();
		assertEquals( p.getHand().size(), 5);

		//p.addToDiscard( p.getHand().get(0) );
		//assertEquals( p.getHand().size(), 4);

	}

}
