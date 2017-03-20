package org.cs362.dominion;

//package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Collections;


public class RandomTestDominion {

	   public static void main(String args[]){
		   
		    GameState gameState; 
		   	List<Card> cardList;
		   	
		   //	private GameState gameState;
		   	 List<Card> cardList1;
		   	Player playerA1;
		   	 Player playerB1;
		   	 GameState gameState1;
		   	
			cardList= new ArrayList<Card>(Card.createCards());

		           //cardList = Card.createCards();
		           //List<Card> cards;
		   	   // GameState gameState;
		   		Randomness.reset(10);
		   		//system.out.print(Randomness);
		   		
		   		cardList = new ArrayList<Card>(Card.createCards());
		   		gameState = new GameState(cardList);
		   		Random rnd = new Random();
		   		rnd.setSeed(10);
		   		//rnd.nextInt()
		   		System.out.print(rnd.nextInt(10));
		   		int num = rnd.nextInt(3);
		   		if (num==0){
		   			Player playerA = new Player(gameState, "player A");
		   		    gameState.addPlayer(playerA);
		   		    Player playerB = new Player(gameState, "player B");
		   	        gameState.addPlayer(playerB);	
		   		}
		   		else if (num== 1){
		   			Player playerA = new Player(gameState, "player A");
		   		    gameState.addPlayer(playerA);
		   		   Player playerB = new Player(gameState, "player B");
		   	        gameState.addPlayer(playerB);
		   	       Player playerC = new Player(gameState, "player C");
		   	        gameState.addPlayer(playerC);
		   		}
		   		else if(num == 2){
		   			Player playerA = new Player(gameState, "player A");
		   		    gameState.addPlayer(playerA);
		   		    Player playerB = new Player(gameState, "player B");
		   	        gameState.addPlayer(playerB);
		   	       Player playerC = new Player(gameState, "player C");
		   	        gameState.addPlayer(playerC);
		   	        Player playerD = new Player(gameState, "player D");
		   	        gameState.addPlayer(playerD);
		   		}
		   		else {
		   			System.err.println("the number of players mus be between 2 and 4 ");
		   		    return ;
		   		}
		   	    	      
		           gameState.initializeGame();
		       
		   
		   		 HashMap<Player, Integer> winners=gameState.play();
		   	     System.out.println ("Finished game.\n");
		   	    
		   	      for(Player p: winners.keySet()){
		   	    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		   	      }
		   	      
		   	

		   

		   /*   List<Card> cards;
		    GameState state; 
			Randomness.reset(10);	   

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			
		      Player player = new Player(state, "player-1");
//		      player.printStateGame();

		       //  player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		       //  player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		         //player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		        // player.hand.add(Card.getCard(cards,Card.CardName.Village));
		      state.addPlayer(player);		      
		      //Initialize the game!
		      //System.out.print("before");
		      state.initializeGame();
		      
		     // System.out.print("before");

		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		      }*/
		      
	//	      player.printStateGame();
		      
		      
			System.exit(0);  

	   }
	
	
}
