package org.cs362.dominion;

import static org.junit.Assert.*;
import org.junit.Test;

public class AIPlayerTest {

	Player test;
	
	@Test
	public void testConstructor() {
		
		test = new AIPlayer(1);
		
		assertEquals("Name doesn't match name given",
				"Player_1", test.getName());
		assertEquals("Hand isn't empty",
				0, test.hand.size());
		assertEquals("Deck isn't empty",
				0, test.deck.size());
		assertEquals("Discard isn't empty",
				0, test.discard.size());
	}

	@Test
	public void testDiscard(){
		
		test = new AIPlayer(1);
		try{
			test.discardCard();
		}
		catch(Exception e){
			fail("Discard crashed when discarding card with hand empty");
		}
		test.giveCard(new Copper());
		test.drawCard();
		test.discardCard();
		assertEquals("Hand didn't lose card when discarding",
				0, test.numCardsHand());
		assertEquals("Discard didn't gain card when discarding",
				1, test.numCardsDiscard());
	}
	
	@Test
	public void testPlayCard(){
		
		test = new AIPlayer(1);
		
		try{
			assertNull("Play card didn't return null when hand empty",
					test.playCard());
		}
		catch(Exception e){
			fail("Play card crashed when hand empty");
		}
		Card c = new Copper();
		test.giveCard(c);
		test.drawCard();
		Card result = null;
		while(result == null)
			result = test.playCard();
		assertEquals("Player didn't play a card they had",
				c, result);
		
	}
}
