package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BoardTest {

	private Board test;
	
	private Card createCard(String name){
		ArrayList<CardType> type = new ArrayList<CardType>();
		type.add(CardType.Action);
		return new Card(name, 1, 2, 3, type);
	}
	
	@Test
	public void testConstructors() {
		
		test = new Board();
		assertEquals("Board didn't get initialized with a deck",
				1, test.numDecks());
		assertEquals("Initialzed deck in board isn't named 'Trash'",
				"Trash", test.getName(0));
	}
	
	@Test
	public void testCreatingDeck(){
		
		test = new Board();
		Card c = createCard("one");
		
		test.createDeck(c, 5);
		assertEquals("New deck wasn't added to the board",
				2, test.numDecks());
		assertEquals("New deck's name set properly",
				"one", test.getName(1));
		assertEquals("Number of cards in new deck wrong",
				test.numCardsInDeck(1), 5);	
	}
	
	@Test
	public void testPrint(){
		test = new Board();
		try{
			test.print();
		}
		catch(Exception e){
			fail("Print function crashes");
		}
	}

}
