package cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PlayDominion {
	public static void main(String args[]){

		List<Card> cards;
		GameState state;
		//Randomness.reset(10);	   
		//the cards  are achieved by each element/constant in the enum class 
		cards = new ArrayList<Card>(Card.createCards());	
		state = new GameState(cards); 
		
		Player player = new Player(state, "player-1");
		state.addPlayer(player);
		player = new Player(state, "player-2");
		state.addPlayer(player);		      
		//Initialize the game!
		state.initializeGame();

		System.out.println("Initialization DominionBoard:\n " + state.toString() + "\n******* GAME STARTING *******");

		HashMap<Player, Integer> winners=state.play();
		System.out.println ("Finished game.\n");

		for(Player p: winners.keySet()){
			System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
		}
		
		System.out.println("\n\n\n*************************\nGAME FINISHED. PRINTING STATE.");
		System.out.println(state.toString());


		System.exit(0);  

	}


}
