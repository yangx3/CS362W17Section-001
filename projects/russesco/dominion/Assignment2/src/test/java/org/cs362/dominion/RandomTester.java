package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;


public class RandomTester {

	@Test
	public void RandomTest()  throws Throwable{
		// Run through the game 50 times. Each time creating random seeds for players
		// Since we create all the variables on the backend code coverage will not
		// include the PlayDominion Class sbut instead start with the GameState.
		// All of the code below simulates what the PlayDominion Class does
		// but with randomly selected cards and inputs based on seeds.
		// This allows for very high coverage outside of the PlayDominion Class
		for(int j = 0; j < 50; j++){
			List<Card> cards;
		    GameState state;
			Random R1 = new Random();
			int additionalPlayers = R1.nextInt(3);//generates a random number of players between 2 and 5
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
		      Player player = new Player(state, "player-1");
		      int additionalCards = R1.nextInt(5);
		      // Create a Number of Plyaers randomly from the seed
		      for(int l = 0; l < additionalCards; l++){
		    	   int random = R1.nextInt(cards.size());
			        Card tmp = state.cards.get(random);//cards.get(random);
			        player.hand.add(tmp);
		       }

		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		       for(int k = 0; k < additionalCards; k++){
		       	// Randomlly add cards to hand from random seed
		    	   int random = R1.nextInt(cards.size());
			        Card tmp = state.cards.get(random);
			        player.hand.add(tmp);
		       }

		      state.addPlayer(player);
		      for(int i = 0; i<additionalPlayers; i++){
		    	  player = new Player(state, "player-" + (i + 2));
		    	  state.addPlayer(player);
		      }
		      if(state.players.size() != (2+additionalPlayers)){
		      	// Check for Valid player count input.
		    	  System.out.println("Did not Properly Incriment Player Count:");
		      }

		      // run game. After print out game over and winner
		      state.initializeGame();
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Game over.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
		      }
		      		      
		      
		}
	}
}