package dominion;

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

		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);

		Player player = new Player(state, "player-1");

		state.addPlayer(player);
		System.out.println("Added first player!");


		player = new Player(state, "player-2");
		state.addPlayer(player);
		System.out.println("Added second player!");

		//Initialize the game!
		System.out.println("initializing the game!");
	 	state.initializeGame();
		System.out.println("Finished initializing the game!");


		HashMap<Player, Integer> winners = state.play();
		System.out.println ("Finished game.\n");

		System.out.println("Players:       player-1       player-2");
		System.out.printf("Scores:       ");
		for(Player p: winners.keySet()){
			System.out.printf ("  "+winners.get(p)+"    " );
			System.out.printf("         ");
		}
		System.out.println("");
		//  player.printStateGame();


		System.exit(0);

	}


}
