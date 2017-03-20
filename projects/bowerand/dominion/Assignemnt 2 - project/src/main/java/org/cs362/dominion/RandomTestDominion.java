package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import java.util.Collections;


public class RandomTestDominion {

	   public  static void main(String args[]){
		Random randomGenerator = new Random();   
                List<Card> cards;
                GameState state;
                randomGenerator.setSeed(10);
                //Randomness.reset(10);	   


                //the cards  are achieved by each element/constant in the enum class 
                cards = new ArrayList<Card>(Card.createCards());
                state = new GameState(cards);
                //System.out.println("Initialization DominionBoard:\n " + state.toString()); 
                
                //Randomly select between 2 to 4 players
                int random = randomGenerator.nextInt(3) + 2; 
                int count = 0;
                //Player player;
                while (count < random) {
                    Player player = new Player(state, "player-"+(count+1));
                    state.addPlayer(player);
                    count++;
                }
                
                //Initialize the game!
                state.initializeGame();

                System.out.println("Initialization DominionBoard:\n " + state.toString());

                HashMap<Player, Integer> winners=state.play();
                System.out.println ("Finished game.\n");

                for(Player p: winners.keySet()){
                    System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
                }		      
                //	      player.printStateGame();


                System.exit(0);  

	   }
	
	
}
