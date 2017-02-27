import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by Zaengle on 2/26/2017.
 */
public class RandomTestDominion {

    @Test
    public void rTest(){
        List<Card> cards;
        GameState state;
        Randomness.reset(10);

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        Random rand = new Random();
        int rando =  rand.nextInt(5);
        if(rando < 2){//Two players
            Player player = new Player(state, "player-1");
            state.addPlayer(player);

            Player player2 = new Player(state, "player-2");
            state.addPlayer(player2);

            state.initializeGame();
            System.out.println("Starting game.\nBoard:\n" + state.toString());

            HashMap<Player, Integer> players = state.play();

            for(Player p: players.keySet()){
                System.out.println("Player: " + p.player_username + " Score: " + players.get(p));
            }

        }else if (rando == 2){//Three players
            Player player = new Player(state, "player-1");
            state.addPlayer(player);

            Player player2 = new Player(state, "player-2");
            state.addPlayer(player2);

            Player player3 = new Player(state, "player-3");
            state.addPlayer(player3);

            state.initializeGame();
            System.out.println("Starting game.\nBoard:\n" + state.toString());

            HashMap<Player, Integer> players = state.play();

            for(Player p: players.keySet()){
                System.out.println("Player: " + p.player_username + " Score: " + players.get(p));
            }
        } else{//Four players
            Player player = new Player(state, "player-1");
            state.addPlayer(player);

            Player player2 = new Player(state, "player-2");
            state.addPlayer(player2);

            Player player3 = new Player(state, "player-3");
            state.addPlayer(player3);

            Player player4 = new Player(state, "player-4");
            state.addPlayer(player4);

            state.initializeGame();
            System.out.println("Starting game.\nBoard:\n" + state.toString());

            HashMap<Player, Integer> players = state.play();

            for(Player p: players.keySet()){
                System.out.println("Player: " + p.player_username + " Score: " + players.get(p));
            }
        }
    }

}
