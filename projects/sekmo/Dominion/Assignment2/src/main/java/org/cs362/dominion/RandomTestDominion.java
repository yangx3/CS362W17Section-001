package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomTestDominion {
	public static void main(String args[]){
		List<Card> cards;
		GameState state;
		Random rand = new Random();
		Randomness.reset(10);
		
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		
		Player player = new Player(state, "player-1");
		state.addPlayer(player);
		player = new Player(state, "player-2");
        state.addPlayer(player);
		int numPlayers = rand.nextInt(3)+2;
		if(numPlayers > 3){
			player = new Player(state, "player-3");
	        state.addPlayer(player);
		}
		if(numPlayers > 4){
			player = new Player(state, "player-4");
	        state.addPlayer(player);
		}
		
		state.initializeGame();
		
		System.out.println("Initialization DominionBoard:\n " + state.toString());
	      
	      HashMap<Player, Integer> winners=state.play();
	      System.out.println ("Finished game.\n");
	    
	      for(Player p: winners.keySet()){
	    	  System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
	      }
	      
	      player.printStateGame();
	      
	      
		System.exit(0);  

	}
}
