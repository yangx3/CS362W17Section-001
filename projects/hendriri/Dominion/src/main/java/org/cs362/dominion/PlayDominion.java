package org.cs362.dominion;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;

/**
 * This file is where everything is put together so that way we can play the game! basically it creates cards and gamestates and players and intializes the code in the other files
 */

public class PlayDominion {

	   public  static void main(String args[]){
		   
		    List<Card> cards;
		    GameState state;

			Randomness.reset(10);	   

			
			//the cards  are achieved by each element/constant in the enum class -bad
		    //new list of cards and a new gamestate that takes teh list of cards
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
		    System.out.println("Initialization DominionBoard:\n " + state.toString());

		    //get a random number of players
		    Random getfucked = new Random();
		    int randomNum = getfucked.nextInt((4 - 2) + 1) + 2;
		   	System.out.println("RANDOM FUCKING NUMBER: " + randomNum + "\n");

		   //there are not between 2 and 4 players that are possible
		   //this for loop creates all the players
		   for(int i = 1; i <= randomNum; i++){
		   		System.out.println(i);
		   		Player player = new Player(state, "player-" + i);
		   		state.addPlayer(player);
		   		System.out.println(player);
		   }

		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
		      }
		      
			System.exit(0);  

	   }
	
	
}
