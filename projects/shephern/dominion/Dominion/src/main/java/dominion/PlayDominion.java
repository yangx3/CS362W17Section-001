package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;


public class PlayDominion {

	public static void main(String args[]){

		List<Card> cards;
		GameState state;
		Randomness.reset(10);	   


		//the cards  are achieved by each element/constant in the enum class 
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 

		Player player = new Player(state, "Evrett");
		//		      player.printStateGame();

		state.addPlayer(player);
		player = new Player(state, "Gordon");
		state.addPlayer(player);
		player = new Player(state, "Morgan");
		state.addPlayer(player);
		player = new Player(state, "Bertie");
		state.addPlayer(player);
		//Initialize the game!
		state.initializeGame(10);

		System.out.println("Initialization DominionBoard:\n " + state.toString());


		HashMap<Player, Integer> winners=state.play(0);
		System.out.println ("Finished game.\n");

		for(Player p: winners.keySet()){
			System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
		}

		System.exit(0);  

	}


}
