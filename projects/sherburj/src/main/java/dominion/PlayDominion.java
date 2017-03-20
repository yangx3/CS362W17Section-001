package dominion;
//Main-Class: dominion.PlayDominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import java.util.Collections;


public class PlayDominion {

	   public  static void main(String args[]){
		   Random randomGenerator = new Random();
		    List<Card> cards;
		    GameState state;

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<>(Card.createCards());
			state = new GameState(cards);
		      int random = randomGenerator.nextInt(3);

		  		Player player = new Player(state, "player-1");
		   		state.addPlayer(player);
		 		player = new Player(state, "player-2");
		  		state.addPlayer(player);
		        while(random != 0){
					player = new Player(state, "player-"+ (random+2));
					state.addPlayer(player);
					random = random-1;
			 	 }

//		      player.printStateGame();

		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
                      winners.keySet().forEach((p) -> {
                          System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
               }); //	      player.printStateGame();
		      
		      
			System.exit(0);  

	   }
	
	
}
