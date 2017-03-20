package ORG.CS362.DOMINION;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class RandomTestDominion {

	@Test
	public void test() {
	    List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   
		
		
		//Alright, this is setup to handle 4 players! 
		
		int playernum = 10;
	
		playernum = Randomness.nextRandomInt(4);			//AI will try and choose number of players that won't work	
		
		if(playernum > 0 && playernum < 5){
				System.out.println("---------------PLAYERNUM TEST PASSED-------------------");
		}
		else{
			System.out.println("----------------------------PLAYERNUM TEST FAIL---------------------------");
		}
		
		
		cards = new ArrayList<Card>(Card.createCards());	
		state = new GameState(cards);

	     
		 Player player = new Player(state, "player-1");									
	         	
	      state.addPlayer(player);
	       player = new Player(state, "player-2");
	        		
	      state.addPlayer(player);		      
	      
	      if(playernum == 3){															//if there are 3 players in the game, this will add an extra
	    	  
		       player = new Player(state, "player-3");
		   		
		   	   state.addPlayer(player); 
	      }
	      if(playernum == 4){															//4 players will mean 2 extra players added
		       player = new Player(state, "player-3");
		       	
		      state.addPlayer(player);		      
		       player = new Player(state, "player-4");
		    	
		      state.addPlayer(player);		      
		      
	      }
	    
	      
	      
	      System.out.println("Before Initialization");
	      state.initializeGame();
	      System.out.println("Initialization DominionBoard:\n " + state.toString());


	      
	//      HashMap<Player, Integer> winners=state.play();
	      int k;
	      int l;
	  
	      
	   	  int turn =0;	
	      while (!state.isGameOver()) {
	    	  turn++;
	         for (Player playert  : state.players) {
	      
	        	 	System.out.println("Player: "+ player.player_username + " is playing");
	   				//player p plays action card
	        	 	player.playKingdomCard();
	        	 	System.out.println("-----------------------------PLAY KINGDOM CARD PASS-----------------------------");
	        	 	//player plays treasure card
	   			    player.playTtreasureCard();
	   			    System.out.println("----------------------------PLAY TREASURE CARD PASS----------------------------------");
	   			    //player buy cards
	   			    
	   			    k = player.coins;
	   			    player.buyCard();
	   			    System.out.println("-----------------------------BUY CARD PASS -------------------------------------");
	   			    l = player.coins;
	   			    if(k > l){
	   			    	System.out.println("-------------------------COINS TEST PASS---------------------------------");
	   			    }
	   			    else
	   			    	System.out.println("--------------------COINS TEST FAIL----------------------------");
	   			    
	   			    
	        	  //player ends turn
	        	    player.endTurn();
	        	    
	         }
	        if(turn==3)				//Limited to 3 turns
	        	 break;
	      }
	      
	      System.out.println ("Finished game.\n");
	    
	//     for(Player p: winners.keySet()){
	//   	  System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
	 //     }
	      

	     System.out.println("-----------------------------END OF GAME-> TEST PASS------------------------------ ");
		System.exit(0);  

	}

}
