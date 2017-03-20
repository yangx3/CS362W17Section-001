package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Collections;


public class PlayDominion {

	   public  static void main(String args[]){
		   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			Random rand = new Random(); 
			int num_players = rand.nextInt(4) +2; 
			//Random rand2 = new Random(); 
		
			for (int i = 0; i < num_players; i++){
				Player player = new Player(state, "player-1" ); 
					for (int j = 0; j <10; j++){
						Random rand2 = new Random(); 
						int add_card = rand2.nextInt(10)+1; 
							if(add_card ==1)		
		         					player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
							if(add_card ==2)
		         					player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         				if(add_card ==3)	
								player.hand.add(Card.getCard(cards,Card.CardName.Mine));
		         				if(add_card ==4)	
								player.hand.add(Card.getCard(cards,Card.CardName.CouncilRoom));
		         				if(add_card == 5)
								player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
		         				if(add_card == 6)	
								player.hand.add(Card.getCard(cards,Card.CardName.Feast));
		        				if(add_card == 7)	
								player.hand.add(Card.getCard(cards,Card.CardName.Village));
		        				if(add_card ==8)
								player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
		         				if(add_card ==9)
								player.hand.add(Card.getCard(cards,Card.CardName.Baron));
							if(add_card == 10)
								player.hand.add(Card.getCard(cards,Card.CardName.Cutpurse));
					}
				state.addPlayer(player); 
			}

					
		  /*    Player player = new Player(state, "player-1");
//		      player.printStateGame();
		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         player.hand.add(Card.getCard(cards,Card.CardName.Mine));
		         player.hand.add(Card.getCard(cards,Card.CardName.CouncilRoom));
		         player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
		         player.hand.add(Card.getCard(cards,Card.CardName.Feast));
		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		         player.hand.add(Card.getCard(cards,Card.CardName.Feast));
		         player.hand.add(Card.getCard(cards,Card.CardName.Village));

		         player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
		         player.hand.add(Card.getCard(cards,Card.CardName.CouncilRoom));
		         player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
		         player.hand.add(Card.getCard(cards,Card.CardName.Baron));
		         player.hand.add(Card.getCard(cards,Card.CardName.Mine));
		         player.hand.add(Card.getCard(cards,Card.CardName.Cutpurse));
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		      state.addPlayer(player);		      
		      
			*/
		
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
