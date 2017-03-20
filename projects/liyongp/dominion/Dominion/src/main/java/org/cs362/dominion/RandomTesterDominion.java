

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomTesterDominion {
	 public  static void main(String args[]){
		   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);
			
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
			
			Random rand = new Random();
			int nPlayer = rand.nextInt(3); // 0 = 2 players, 1 = 3 players and 2 = 4 players
		      Player player = new Player(state, "player-1");
		      state.addPlayer(player);
		      player = new Player(state, "player-2");
		      state.addPlayer(player);
		      if(nPlayer == 1){
		    	  player = new Player(state, "player-3");
			      state.addPlayer(player);
		      }
		      else if(nPlayer == 2){
		    	  player = new Player(state, "player-3");
			      state.addPlayer(player);
			      player = new Player(state, "player-4");
			      state.addPlayer(player);
		      }
		      
		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ p.scoreFor() );
		      }
		      
//		      player.printStateGame();
		      
		      
			System.exit(0);  

	   }
}
