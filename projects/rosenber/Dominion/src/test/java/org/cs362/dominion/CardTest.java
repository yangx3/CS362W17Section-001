package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
public class CardTest {

	Card testCard;
	
	@Test
	public void testConstructors() {
		ArrayList<CardType> type = new ArrayList<CardType>();
		type.add(CardType.Action);
		
		testCard = new Card("James", 1, 2, 3, type);
		Card other = new Card(testCard);
		
		assertFalse("The card constructor doesn't create a new object",
				testCard == other);
		
		assertEquals("The names aren't the same", 
				testCard.getName(), other.getName());
		
		assertEquals("The costs aren't the same",
				testCard.getCost(), other.getCost());
		
		assertEquals("The victory points aren't the same",
				testCard.getVictoryPoints(), other.getVictoryPoints());
		
		assertEquals("The treasure amount isn't the same",
				testCard.getTreasure(), other.getTreasure());
		
		assertTrue("The test card is the wrong type", 
				testCard.isCardType(CardType.Action));
		
		assertTrue("The other card is the wrong type",
				other.isCardType(CardType.Action));
	}

}
