package cs362.dominion.Cards;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import cs362.dominion.Exceptions.ConfiguationException;
import cs362.dominion.Resources.Game;
import cs362.dominion.Helpers.*;

public class GreatHallTest {

	private Class<? extends Card> cardType = GreatHall.class;
	private Game game;

	@Before
	public void setUp() throws Exception {
		ArrayList<Class<? extends Card>> kingdomCards = new ArrayList<Class<? extends Card>>();	
		kingdomCards.add(Adventurer.class);
		kingdomCards.add(Ambassador.class);
		kingdomCards.add(Baron.class);
		kingdomCards.add(CouncilRoom.class);
		kingdomCards.add(Cutpurse.class);
		kingdomCards.add(Embargo.class);
		kingdomCards.add(Feast.class);
		kingdomCards.add(Gardens.class);
		kingdomCards.add(GreatHall.class);
		//kingdomCards.add(Mine.class);
		/** 3 extra card types **/
		//kingdomCards.add(Smithy.class);
		//kingdomCards.add(Bazaar.class);
		kingdomCards.add(Village.class);
		// Create a new game
		try {
			this.game = new Game(2, kingdomCards);
		} catch (ConfiguationException e) {
			fail("Could not initialize game");
		}
	}

	
	
	@Test
	public void testActions() {	
		Cards.testActions(game, cardType, 1);
	}
	
	@Test
	public void testCards(){
		Cards.testCards(game, cardType, 1);
	}
	
	@Test 
	public void testDescription(){
		Cards.testDescription(game, cardType);
	}
	

}
