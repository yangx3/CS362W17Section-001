package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomTestDominion {
	public static void myAssertTrue(boolean result) {
		if(result == true) {
			System.out.println("Random Dominion Test success");
		}
		else {
			System.out.println("Random Dominion Test fail");
			Scanner in = new Scanner(System.in);
			System.out.println("Continue running (1 for yes, 0 for no)?");
			System.exit(0);
			}		   
		}
	

	public boolean play(){	
	
		System.out.println("\n" +"New Game..." + "\n");
		List<Card> cards;
		GameState state;	 
		Player player;
		
		
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		int num = 2;
		myAssertTrue(num <= 4 && num >= 2);
		
		for(int i = 1; i <= num; i++) {
			player = new Player(state, "Player-" + i);
			state.addPlayer(player);
			System.out.println("Player-" + i + " has joined the game!");
		}

		state.initializeGame();

		System.out.println("Initialization DominionBoard:\n " + state.toString());

		HashMap<Player, Integer> winners=state.play();
		System.out.println ("Finished game.\n");

		for(Player p: winners.keySet()){
			System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );  
		}	   
		
		state.players.get(0).printStateGame();
		
		return(true);  
	}
	
	public static void main(String[] args) {

		RandomTestDominion randGame = new RandomTestDominion();
		myAssertTrue(randGame.play());
	
	}
}