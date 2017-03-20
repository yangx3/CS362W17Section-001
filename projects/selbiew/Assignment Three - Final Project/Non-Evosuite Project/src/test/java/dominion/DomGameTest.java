package dominion;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DomGameTest {
	@Test
	public void testConstructor() {	  
	  DomGame testDom = new DomGame(0, 2, false);																			//Check to make sure the constructor works
	  assertEquals(2, testDom.playerCount);
	  assertEquals(0, testDom.gameSeed);
	}
	
	@Test
	public void testSetupTable() {	  
	  DomGame testDom = new DomGame(0, 2, false);
	  assertEquals(50, testDom.basicCards.get(0).size);															//Check that the board was set up correctly
	  assertEquals(40, testDom.basicCards.get(1).size);
	  assertEquals(30, testDom.basicCards.get(2).size);
	  assertEquals(10, testDom.basicCards.get(3).size);
	  assertEquals(8, testDom.basicCards.get(4).size);
	  assertEquals(8, testDom.basicCards.get(5).size);
	  assertEquals(8, testDom.basicCards.get(6).size);
	  
	  assertEquals("Copper", testDom.basicCards.get(0).cards.get(0).name);
	  assertEquals("Silver", testDom.basicCards.get(1).cards.get(0).name);
	  assertEquals("Gold", testDom.basicCards.get(2).cards.get(0).name);
	  assertEquals("Curse", testDom.basicCards.get(3).cards.get(0).name);
	  assertEquals("Estate", testDom.basicCards.get(4).cards.get(0).name);
	  assertEquals("Duchy", testDom.basicCards.get(5).cards.get(0).name);
	  assertEquals("Province", testDom.basicCards.get(6).cards.get(0).name);	  
	  
	  for(int i = 0; i < 10; i++) {
	  	if(testDom.kingdomCards.get(i).cards.get(0).name == "Gardens") {
	  		assertTrue(testDom.kingdomCards.get(i).size == 8);
	  	}
	  	else {
	  		assertTrue(testDom.kingdomCards.get(i).size == 10);
	  	  	}
	  	}
	}
	
	@Test
	public void testGameOver() {																								
		DomGame testDom = new DomGame(0, 2, false);
		assertEquals(false, testDom.gameOver());																
		for(int i = 0; i < 8; i++) {
			testDom.basicCards.get(6).removeCard(0);
		}
		assertEquals(true, testDom.gameOver());																				//Check the game ends when Provinces run out
		testDom.basicCards.get(6).addCard(new Province());
		assertEquals(false, testDom.gameOver());
		for(int i = 0; i < 10; i++) {
			testDom.kingdomCards.get(0).removeCard(0);
			testDom.kingdomCards.get(1).removeCard(0);
			testDom.kingdomCards.get(2).removeCard(0);
		}
		assertEquals(true, testDom.gameOver());																				//Check the game ends when 3 supply piles are empty
	}
	
/*	@Test
	public void testGetWinner() {																							
		DomGame testDom = new DomGame(0, 2, false);
		Random rand = new Random();
		
		testDom.players[0].VP = rand.nextInt(100);
		testDom.players[1].VP = rand.nextInt(100);
		if(testDom.players[0].VP == testDom.players[1].VP) {
			assertEquals(testDom.players[0], testDom.getWinner());
			assertEquals(testDom.players[1], testDom.getWinner());
		 }
		assertEquals((testDom.players[0].VP > testDom.players[1].VP) ? testDom.players[0] : testDom.players[1], testDom.getWinner());		//Check that Player 0 wins if they have more points, otherwise Player 1 wins
	}																																		//In the event of a tie, two winners should be declared, but only Player 1 is the winner - Bug
	*/
}


