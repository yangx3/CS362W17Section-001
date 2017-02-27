package dominion;

import java.util.Random;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomTestDominion {
	static int games = 100;  //This is where you'd change the number of times it ran
	static boolean debug = false;
	
	public static void main(String[] args){
		GameState state;
		String a[] = {"Howard", "Gordon", "Frederick", "Margot", "Daneil", "Samson"};
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		Random rand = new Random();
		Randomness.reset(10);//rand.nextInt(games));
		for(int i = 0; i < games; i++){
			int players = rand.nextInt(3) + 2;  //Between 2-4
			state = new GameState(cards);
			for(int j = 0; j < players; j++){
				Player p = new Player(state,a[j]);
				state.addPlayer(p);
			}		
			if(!debug){
				//No system output
				ByteArrayOutputStream buffer = new ByteArrayOutputStream();
				System.setOut(new PrintStream(buffer));
				//A solution adopted from Vic Seedoubleyew@Stackoverflow
			}
			state.initializeGame(10);
			HashMap<Player, Integer> winners=state.play(0);
			if(!debug)
				System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
			
			System.out.println ("Finished game.\n");

			for(Player p: winners.keySet()){
				System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
}
