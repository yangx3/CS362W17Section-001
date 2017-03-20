package com.mycompany.dimc_dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;


public class PlayDominion {

	   public  static void main(int numPlayers, int numKingdomCards){
	   		//args [numplayers,numkingdomcards]
		   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			
		     if (numPlayers > 4 || numPlayers < 2)
			    {
				   System.err.println("the number of players must be between 2 and 4 ");
			      return ;
			    }

		      int i;
			      for(i=0;i<numPlayers;i++){
			      	String pname="player-"+Integer.toString(i+1);
			      	Player player = new Player(state, pname);
			        player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
			        player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
			        state.addPlayer(player);

			      }
		  	   



		      //Initialize the game!
		  	  state.initializeGame(numKingdomCards);
		     
		      
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
