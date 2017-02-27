package org.cs362.dominion;

//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public class PlayDominion {

	   public  static void main(String args[]){
		   System.out.println("Starting up Dominion...");
		    List<Card> cards;
		    GameState state;
			Randomness.reset();	 
			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			 
		      Player player = new Player(state, "Player-1");
//		      player.printStateGame();
		         //player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		         //player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		      state.addPlayer(player);
		      System.out.println("Player-1 has joined the game!");
		       player = new Player(state, "Player-2");
		         //player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         //player.hand.add(Card.getCard(cards,Card.CardName.Village));
		      state.addPlayer(player);		      
		      //Initialize the game!
		      System.out.println("Player-2 has joined!");
		      state.initializeGame();
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );  
		      }	      
		     
		      player.printStateGame();
		      
		      
			System.exit(0);  

	   }
	
	
}
