package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;


import org.junit.Test;

public class RandomTestDominionTest {

	@Test
	public void test() {
		List<Card> cards;
	    GameState state;
	    HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	    List<Player> players = new ArrayList<Player>();
	    int seed = 10;
	    
	    Random ranNum = new Random(seed);
	    
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		
		int numPlayers = Randomness.nextRandomInt(3);
		
		for(int i = 0; i < (2 + numPlayers); i++){
			Player player = new Player(state, "player-" + (i+1));
			state.addPlayer(player);
			System.out.println("Added player-" + (i+1));
		}
		
		
		
		  int selectedKindom=0;
		  int Kingdom_Cards_Selected=10;
		   
     while (selectedKindom < Kingdom_Cards_Selected) {
	         int random = (int)  ranNum.nextInt(cards.size());//
	         Card tmp = cards.get(random);
	         if(tmp.getType()!=Card.Type.ACTION) continue;
	         if(gameBoard.containsKey(tmp)) continue;
	         gameBoard.put(tmp, 10);
	         selectedKindom++;
	      }

		
		
		state.initializeGame();
	      
	      System.out.println("Initializating the Dominion Board:\n " + state.toString());
	      
	      HashMap<Player, Integer> winners=state.play();
	      System.out.println ("Finished game.\n");
	    
	      for(Player p: winners.keySet()){
	    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
	      }
		
	}

}
