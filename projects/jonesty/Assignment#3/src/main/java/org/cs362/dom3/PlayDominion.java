package dom3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import dom3.Card;
import dom3.GameState;
import dom3.Player;
import dom3.Randomness;

public class PlayDominion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Card> cards;
	    int [] piles;
	    GameState state;
		Randomness.reset(10);	   
		Random rn = new Random();
		int answer = rn.nextInt((4-2)+1) + 2;
		cards = new ArrayList<Card>(Card.createCards());
		piles= new int[17];
		state = new GameState(cards, piles);

		
		for(int counter = 0; counter<answer; counter=counter+1){
			Player player = new Player(state, "player"+counter);
			state.addPlayer(player);
		}

	      state.initializeGame();
	      
	      System.out.println("Initialization DominionBoard:\n " + state.toString());
	      
	      HashMap<Player, Integer> winners=state.play(state);
	      System.out.println ("Finished game.\n");
	    
	      for(Player p: winners.keySet()){
	    	  System.out.println ("Player name: "+p + " , Score: "+ winners.get(p) );
	      }
	      
	      
	      
		System.exit(0);  
	}

}
