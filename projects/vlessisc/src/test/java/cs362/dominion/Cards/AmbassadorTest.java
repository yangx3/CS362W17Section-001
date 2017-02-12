package cs362.dominion.Cards;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import cs362.dominion.Exceptions.ConfiguationException;
import cs362.dominion.Exceptions.InvalidOptionException;
import cs362.dominion.Exceptions.InvalidSelectionException;
import cs362.dominion.Resources.Game;
import cs362.dominion.Resources.Option;
import cs362.dominion.Resources.Player;

public class AmbassadorTest {

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
		//kingdomCards.add(Gardens.class);
		//kingdomCards.add(GreatHall.class);
		//kingdomCards.add(Mine.class);
		/** 3 extra card types **/
		kingdomCards.add(Smithy.class);
		kingdomCards.add(Bazaar.class);
		kingdomCards.add(Village.class);
		// Create a new game
		try {
			this.game = new Game(2, kingdomCards);
		} catch (ConfiguationException e) {
			fail("Could not initialize game");
		}
	}

	
	/**
	 * Makes sure the baron returns cards to supply and gives other players instances of 
	 * those cards
	 * Card description:
	 * Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. 
	 * Then each other player gains a copy of it 
	 */
	@Test
	public void testPlayCard() {
				
		// Create a new game and get the current player
		
		this.game.getCurrentPlayer().deck.hand.addCard(this.game.supply.drawCard(Ambassador.class));
		this.game.getCurrentPlayer().deck.hand.addCard(this.game.supply.drawCard(Baron.class));
		this.game.getCurrentPlayer().deck.hand.addCard(this.game.supply.drawCard(Baron.class));
		
		try {
			Option cardOptions = this.game.playCard(Ambassador.class);
			cardOptions = this.playBaronOption(cardOptions);
			this.playCardOptions(cardOptions);
		} catch (InvalidSelectionException e) {
			fail("Failed to play card");
		}
		
		
		for(Player player : this.game.getPlayers()){
			if(this.game.getCurrentPlayer()!=player){
				assertTrue(player.deck.hand.handContainsCard(Baron.class)==true);
			}
		}
	
	}
	
	private Option playBaronOption(Option cardOption){
		int i=0;
		for(String iStr : cardOption.optionDescriptions()){
			if(iStr.contains("Baron")){ 
				try {
					return cardOption.decide(i);
				} catch (InvalidOptionException e) {}
			}
			i++;
		}
		fail("Could not find Baron option");
		return null;
	}

	private void playCardOptions(Option cardOptions){
		while(cardOptions!=null){
			int optionChosen = new Random().nextInt(cardOptions.numOptions());
			try {
				cardOptions = cardOptions.decide(optionChosen);
			} catch (InvalidOptionException e) {
				fail("Invalid decision made");
			}		
		}
	}
	
}
