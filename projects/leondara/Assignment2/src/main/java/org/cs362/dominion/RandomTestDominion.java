import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomDominion {

    public static void main(String args[]) {

        List<Card> cards;
        GameState state;
        Random gen = new Random();
        
		cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
		
        Player player;
        player = new Player(state, "Player 1");
        state.addPlayer(player);
        player = new Player(state, "Player 2");
        state.addPlayer(player);
        
		int numPlayers = gen.nextInt(3);
        
		while(numPlayers > 0) {
            player = new Player(state, "Player " + (numPlayers+2));
            state.addPlayer(player);
            numPlayers--;
        }
		
        state.initializeGame();
        System.out.println("\nDominion Status:\n" + state.toString());
        HashMap<Player, Integer> winners = state.play();
        System.out.println ("Game Over!\n\n");
        
		for(Player p: winners.keySet()) {
            System.out.println ("Player: " + p.player_username + "'s Score: " + winners.get(p) );
        }
		
        player.printStateGame();
        System.exit(0);
    }
}