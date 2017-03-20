package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomTestDominion {

	   public  static void main(String args[]){
		   
			List<Card> cards;
			GameState state;
			Randomness.reset(10);	   
			int numPlayers = 2 + Randomness.nextRandomInt(3);
			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			for(Integer i = 0; i < numPlayers; i++){
				Player player = new Player(state, "player-" + i.toString());
				state.addPlayer(player);
			}		  
			  //Initialize the game!
			  state.initializeGame();
			  
			  System.out.println("Initialization DominionBoard:\n " + state.toString());
			  
			  HashMap<Player, Integer> winners=state.play();
			  System.out.println ("Finished game.\n");
			
			  for(Player p: winners.keySet()){
				  System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
			  }
			  
	//		  player.printStateGame();
			  
			  
			System.exit(0);  

	   }
	
	
}
