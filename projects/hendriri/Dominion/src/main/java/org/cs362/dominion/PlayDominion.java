package org.cs362.dominion;

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


		      //creates a new player (player) player which gets a state and the username
		      Player player = new Player(state, "player-1");
//		      player.printStateGame();
		   			//player.hand.add(Card.getCard(cards,Card.CardName.embargo));
		   			//player.hand.add(Card.getCard(cards,Card.CardName.gardens));
		   			//player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		   			//player.hand.add(Card.getCard(cards,Card.CardName.feast));
				   	//player.hand.add(Card.getCard(cards,Card.CardName.salvager));
		   			//player.hand.add(Card.getCard(cards,Card.CardName.mine));
		   			//player.hand.add(Card.getCard(cards,Card.CardName.Baron));
		   			//player.hand.add(Card.getCard(cards,Card.CardName.cutpurse));
		            //player.hand.add(Card.getCard(cards,Card.CardName.CouncilRoom));
		            //player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		            //player.hand.add(Card.getCard(cards,Card.CardName.greathall));


		      //adds player to the gamestate list
		      state.addPlayer(player);
		       player = new Player(state, "player-2");

		   //??
		         //player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         //player.hand.add(Card.getCard(cards,Card.CardName.Village));

		      state.addPlayer(player);		      
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
