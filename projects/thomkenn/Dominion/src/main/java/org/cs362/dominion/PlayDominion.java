//*************************
//Name: Kenny Thompson
//Project: Assignment 1
//File: PlayDominioin.java
//Class: CS362
//*************************
package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Collections;


public class PlayDominion {

	   public  static void main(String args[]){
		    System.out.println("starting game");
		    List<Card> cards;
		    GameState state;
			Randomness.reset(System.currentTimeMillis());
		    System.out.println("randomness reset");

			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);

			System.out.println("array list and game state initialized");
		      Player player = new Player(state, "player-1");
		      state.addPlayer(player);
		      int random = (int)  Randomness.random.nextInt(3);
		      random = random + 1;

				switch (random) {
				case 1: player = new Player(state, "player-2");
						state.addPlayer(player);
			      		break;
				case 2: player = new Player(state, "player-2");
			      		state.addPlayer(player);
					    player = new Player(state, "player-3");
					    state.addPlayer(player);
	      				break;
				case 3: player = new Player(state, "player-2");
			      		state.addPlayer(player);
			    		player = new Player(state, "player-3");
					    state.addPlayer(player);
			    		player = new Player(state, "player-4");
					    state.addPlayer(player);
	      				break;
	      		default:
	      				System.out.println("ERROR! ERROR! INVALID ENTRY! ERROR!");
	      				System.out.println(random);
	      				System.exit(0);  
				}
		      System.out.println("players added");
		      //Initialize the game!
		      state.initializeGame();
		      System.out.println("game initialized");
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Game over.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println (p.player_username + " Score: "+ winners.get(p) );
		      }      
	   }
}
