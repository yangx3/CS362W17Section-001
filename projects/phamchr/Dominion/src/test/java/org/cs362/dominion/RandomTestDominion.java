package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import java.util.Collections;


public class RandomTestDominion {
	@Test
	public void main() throws Throwable{
		List<Card> cards;
		GameState state;
		Randomness.reset(10);	   
		//the cards  are achieved by each element/constant in the enum class 
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		System.out.println("Initialization DominionBoard:\n " + state.toString());
	
		Player player = new Player(state, "player-1");
		player.printStateGame();
		state.addPlayer(player);
		player = new Player(state, "player-2");
		state.addPlayer(player);	
		player = new Player(state, "player-3");
		state.addPlayer(player);	
		//Initialize the game!
		state.initializeGame();

		System.out.println("Initialization DominionBoard:\n " + state.toString());
		
		//HashMap<Player, Integer> winners=state.play();
		while(!state.isGameOver()){
			for (Player curPlayer : state.players) {
	    	 	System.out.println("Player: "+ curPlayer.player_username + " is playing");
	    	 	curPlayer.numActions = 1;
	    	 	curPlayer.numBuys = 1;
	    	 	curPlayer.playKingdomCard();
				curPlayer.playTreasureCard();
	    	    curPlayer.buyCard();
	    	    curPlayer.endTurn();
	    	    System.out.println(curPlayer.toString());
			}
		}
		
		//Instead of playing the state, force the system to play.
		
		HashMap<Player, Integer> winners = state.getWinners();
		System.out.println ("Finished game.\n");
		int counter = 1;
		for(Player p: winners.keySet()){
			System.out.println ("Player name: player-"+counter+", Score: "+ winners.get(p) );
			counter++;
		}
		player.printStateGame();
 }
}
