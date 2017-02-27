package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import java.util.Collections;

public class RandomTestDominion {

	public  static void main(String args[]){
		   
	    List<Card> cards;
	    GameState state;
		Random gwen = new Random();
		int additionalPlayers = gwen.nextInt(3);

		
		//the cards  are achieved by each element/constant in the enum class 
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
//		 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
		
	      Player player = new Player(state, "player-1");
//	      player.printStateGame();
//	         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
//	         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

	      state.addPlayer(player);
	       player = new Player(state, "player-2");
//	         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
//	         player.hand.add(Card.getCard(cards,Card.CardName.Village));
	      state.addPlayer(player);		      
	      //Initialize the game!
	      
	      for(int i = 0; i<additionalPlayers; i++){
	    	  player = new Player(state, "player-" + (i + 2));
	    	  state.addPlayer(player);
	      }
	      state.initializeGame();
	      
	      System.out.println("Initialization DominionBoard:\n " + state.toString());
	      
	      HashMap<Player, Integer> winners=state.play();
	      System.out.println ("Finished game.\n");
	    
	      for(Player p: winners.keySet()){
	    	  System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
	      }
	      
//	      player.printStateGame();
	      
	      
		System.exit(0);  

   }
	
	
}
