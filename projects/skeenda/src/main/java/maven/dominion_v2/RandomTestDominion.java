package maven.dominion_v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomTestDominion {

	public  static void main(String[] args){
		for(int j =0; j < 15; j++){
		List<Card> cards;
		GameState state;
		Randomness.reset(10);
		
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		
		Random rand = new Random();
		int randomNum = rand.nextInt((4-1)+1)+1;
		
		if(randomNum == 1 || randomNum == 2)
		{
			Player player = new Player(state, "player-1");
			state.addPlayer(player);
			player = new Player(state, "player-2");
			state.addPlayer(player);
		}
		else if(randomNum == 3)
		{
			Player player = new Player(state, "player-1");
			state.addPlayer(player);
			player = new Player(state, "player-2");
			state.addPlayer(player);
			player = new Player(state, "player-3");
			state.addPlayer(player);
		}
		else if(randomNum == 4)
		{
			Player player = new Player(state, "player-1");
			state.addPlayer(player);
			player = new Player(state, "player-2");
			state.addPlayer(player);
			player = new Player(state, "player-3");
			state.addPlayer(player);
			player = new Player(state, "player-4");
			state.addPlayer(player);
		}
		
		Random test = new Random();
		int rNum = test.nextInt((10-1)+1)+1;
		state.initializeGame(rNum);
		
		System.out.println("Init Dominion Board: \n" + state.toString());
		HashMap<Player, Integer> winners=state.play();
		System.out.println ("Finished game.\n");
		int i = 1;
		for(Player p: winners.keySet())
		{
			System.out.println ("Player name: "+ i + " , Score: "+ winners.get(p) );
			i++;
		}
		
		System.exit(0);
	}
	}
}
