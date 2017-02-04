package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	private Board test;
	
	@Test
	public void testConstructors() {
		
		test = new Board();
		assertEquals("Board didn't get initialized with a deck",
				1, test.numDecks());
		
	}

}
