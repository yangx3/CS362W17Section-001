import java.util.ArrayList;
import java.util.Random;

import Resources.*;
import Cards.*;
import Exceptions.ConfiguationException;
import Exceptions.InvalidSelectionException;


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
		kingdomCards.add(Gardens.class);
		kingdomCards.add(GreatHall.class);
		kingdomCards.add(Mine.class);
		
		
		Game game = new Game(2, kingdomCards);
		game._debug_GameState=true;
		game._debug_PlayableCards=true;
		game._debug_CurrentHand=true;
		game._debug_EmptyPiles=true;
		
		
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
				game.playCard(playCard);
			} catch (InvalidSelectionException e) {
				// TODO Auto-generated catch block
				System.out.println("Tried to play invalid card: " + playCard.getName());
			}
		}
		
		System.out.println("Game Over");
		System.out.println("Winner is " + game.getLeadingPlayer().getName());

		
	}
	
	
	
}
