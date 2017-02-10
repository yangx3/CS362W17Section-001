package cs362.dominion;
import java.util.ArrayList;
import java.util.Random;

import cs362.dominion.Resources.*;
import cs362.dominion.Cards.*;
import cs362.dominion.Exceptions.ConfiguationException;
import cs362.dominion.Exceptions.InvalidOptionException;
import cs362.dominion.Exceptions.InvalidSelectionException;


public class Play {
		
	
	public static void main(String args[]) throws ConfiguationException{
		
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
		
		
		Game game = new Game(2, kingdomCards);
		game._debug_GameState=true;
		game._debug_PlayableCards=true;
		game._debug_CurrentHand=true;
		game._debug_EmptyPiles=true;
		Boolean printCardOptions=true;
		
		while(!game.isOver()){
			game._printAllDebugs();
			// Get an array of cards which are playable in the given game state
			ArrayList<Class<? extends Card>> playableCardTypes = game.getPlayableCardTypes();
			// If there is no playable cards, end turn and move to the next phase
			if(playableCardTypes.size()<1){
				game.nextPhase();
				continue;
			}
			// From the list of playable cards, pick a random card to play
			Class<? extends Card> playCard = playableCardTypes.get(new Random().nextInt(playableCardTypes.size()));
			try {
				Option cardOptions = game.playCard(playCard);
				selectCardOptions(cardOptions, printCardOptions);
			} catch (InvalidSelectionException e) {
				// TODO Auto-generated catch block
				System.out.println("Tried to play invalid card: " + playCard.getName());
			}
		}
		
		System.out.println("***************************************************************");
		System.out.println("GAME OVER");
		System.out.println("***************************************************************");
		game._printPlayerDecks();
		game._printPlayerScores();
		System.out.println("Winner is " + game.getLeadingPlayer().getName());

		
	}
	
	
	public static void selectCardOptions(Option cardOptions, Boolean printOptions){
		while(cardOptions!=null){
			if(printOptions){
				System.out.println("SHOWING " + cardOptions.numOptions() + " OPTIONS FOR " + cardOptions.description());
			}
			for(String optionStr : cardOptions.optionDescriptions()){
				if(printOptions){ System.out.println(cardOptions.optionDescriptions().indexOf(optionStr) + ": " + optionStr); }
			}
			int optionChosen = new Random().nextInt(cardOptions.numOptions());
			if(printOptions){ System.out.println("Chose Option: " + optionChosen); }
			try {
				cardOptions = cardOptions.decide(optionChosen);
			} catch (InvalidOptionException e) {
				if(printOptions){ System.out.println("INVALID OPTION EXCEPTION: " + e.getMessage()); }
			}		
		}
	}
	
	
	
}
