package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;


public class PlayDominion {

	   public  static void main(String args[]){
		   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
			
			//set random number of players
		    Player player = new Player(state, "player-1");
		    int sample = 0;
			while(sample<=0){
				sample = (int) Randomness.nextRandomInt(4);
			}
			
			switch(sample){
			case 1:
				state.addPlayer(player);
				player = new Player(state, "player-2");
				state.addPlayer(player);
				break;
			case 2:
				state.addPlayer(player);
				player = new Player(state, "player-2");
				state.addPlayer(player);
				player = new Player(state, "player-3");
				state.addPlayer(player);
				break;
			case 3:
				state.addPlayer(player);
				player = new Player(state, "player-2");
				state.addPlayer(player);
				player = new Player(state, "player-3");
				state.addPlayer(player);
				player = new Player(state, "player-4");
				state.addPlayer(player);
				break;
			}
		      
		      //Initialize the game!
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
