package ORG.CS362.DOMINION;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;


import java.util.Random;
public class PlayDominion {

	   public  static void main(String args[]){
//MAIN		   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   
			
			
			//Alright, this is setup to handle 4 players! 
			
			int playernum;
		
			
			playernum = Randomness.nextRandomInt(4);
			
			System.out.println("Random Number " +playernum);
			
			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());										
			state = new GameState(cards);
			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
		     
			 Player player = new Player(state, "player-1");									//By default, the game will add 2 players
		      player.printStateGame();
		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));		
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));			
		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));			
		         player.hand.add(Card.getCard(cards,Card.CardName.Village));		
		      state.addPlayer(player);		      
		      
		      if(playernum == 3){															//if there are 3 players in the game, this will add an extra
		    	  
			       player = new Player(state, "player-3");
			         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));			
			         player.hand.add(Card.getCard(cards,Card.CardName.Village));		
			   	   state.addPlayer(player); 
		      }
		      if(playernum == 4){															//4 players will mean 2 extra players added
		    	  
			       player = new Player(state, "player-3");
			         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));			
			         player.hand.add(Card.getCard(cards,Card.CardName.Village));		
			      state.addPlayer(player);		      
			       player = new Player(state, "player-4");
			         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));			
			         player.hand.add(Card.getCard(cards,Card.CardName.Village));		
			      state.addPlayer(player);		      
			      
		      }
		    
		      
		      
		      System.out.println("Before Initialization");
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
