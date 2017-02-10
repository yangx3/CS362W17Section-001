package cs362.dominion.Cards;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cs362.dominion.Exceptions.ConfiguationException;
import cs362.dominion.Exceptions.InvalidSelectionException;
import cs362.dominion.Resources.Game;
import cs362.dominion.Resources.Player;

public class AdventurerTest {

	@Before
	public void setUp() throws Exception {
	}

	private Game newGame(){
		ArrayList<Class<? extends Card>> kingdomCards = new ArrayList<Class<? extends Card>>();	
		kingdomCards.add(Adventurer.class);
		kingdomCards.add(Ambassador.class);
		kingdomCards.add(Baron.class);
		kingdomCards.add(CouncilRoom.class);
		kingdomCards.add(Cutpurse.class);
		kingdomCards.add(Embargo.class);
		kingdomCards.add(Feast.class);
		//kingdomCards.add(Gardens.class);
		//kingdomCards.add(GreatHall.class);
		//kingdomCards.add(Mine.class);
		/** 3 extra card types **/
		kingdomCards.add(Smithy.class);
		kingdomCards.add(Bazaar.class);
		kingdomCards.add(Village.class);
		// Create a new game
		
		try {
			return new Game(2, kingdomCards);
		} catch (ConfiguationException e) {
			fail("Could not initialize game");
		}
		return null;
	}
	
	/**
	 * Makes sure the baron adds exactly one buy to the hand 
	 */
	@Test
	public void testBuys() {
		int expectedBuys=0;
		Class<? extends Card> cardType=Adventurer.class;
		// Create a new game and get the current player
		Game game = newGame();
		Player player = game.getCurrentPlayer();
		// Add this card the players hand to ensure they can play it
		player.deck.hand.addCard(game.supply.drawCard(cardType));
		// Get the number of buys in the hand before the play
		int beforePlay = player.deck.hand.getBuys();
		// Play the card
		try {
			game.playCard(cardType);
		} catch (InvalidSelectionException e) {
			fail("Invalid Selection");
		}
		// Get the number of buys after the play
		int afterPlay=player.deck.hand.getBuys();
		// Make sure the value meets expectations
		assertTrue(afterPlay-beforePlay==expectedBuys);
	}


}
