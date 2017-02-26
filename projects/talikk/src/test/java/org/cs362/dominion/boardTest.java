package org.cs362.dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class boardTest {
	
	@Before
	public void testInitialization(){
		board b = new board();
	}

	@Test
	public void testProvidenceOperations(){
	
		board b = new board();
		List<card> tempHand = new ArrayList<card>();


		for( int i = 0; i < 10;i++ ){
			tempHand.add( b.takeProvidence() );
		}

		assertEquals(tempHand.size(), 10);
		assertEquals( b.getNumberOfEmptyDecks(), 1);
		assertEquals( b.isProvidenceEmpty(), true);
	}

	@Test
	public void testDuchyOperations(){

	
		board b = new board();
		List<card> tempHand = new ArrayList<card>();

		for(int i = 0; i < 10; i++){
			tempHand.add( b.takeDuchy()  );
		}


		assertEquals(tempHand.size(), 10);
		assertEquals( b.getNumberOfEmptyDecks(), 1);
	}

	@Test
	public void testEstateOperations(){
	
		board b = new board();
		List<card> tempHand = new ArrayList<card>();

		for(int i = 0; i < 10; i++){
			tempHand.add( b.takeEstate() );	
		}
		assertEquals(tempHand.size(), 10);
		assertEquals( b.getNumberOfEmptyDecks(), 1);
	}

	@Test
	public void testGoldOperations(){
		board b = new board();
		List<card> tempHand = new ArrayList<card>();

		for(int i = 0; i < 10; i++){
			tempHand.add( b.takeGold() );
		}
		assertEquals(tempHand.size(), 10);
		assertEquals( b.getNumberOfEmptyDecks(), 1);
	}

	@Test
	public void testSilverOperations(){
		board b = new board();
		List<card> tempHand = new ArrayList<card>();

		for(int i = 0; i < 10; i++){	
			tempHand.add( b.takeSilver() );
		}
		assertEquals(tempHand.size(), 10);
		assertEquals( b.getNumberOfEmptyDecks(), 1);
	}

	@Test
	public void testCopperOperations(){
		board b = new board();
		List<card> tempHand = new ArrayList<card>();

		for(int i = 0; i < 10; i++){
			tempHand.add( b.takeCopper() );
		}
		assertEquals(tempHand.size(), 10);
		assertEquals( b.getNumberOfEmptyDecks(), 1);
	}

}
