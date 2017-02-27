package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by dog on 2/26/17.
 */
public class Randomtest {

    /**
     * I did not know what to do so i straight up copied the playdominion file and it will run ten times
     * and sees if it crashes, if it does not then we are probably good to go.
     * @throws Exception
     */

    @Test
    public void play() throws Exception {
        for(int z = 0; z <10; z++) {
            List<Card> cards;
            GameState state;

            Randomness.reset(10);


            //the cards  are achieved by each element/constant in the enum class -bad
            //new list of cards and a new gamestate that takes teh list of cards
            cards = new ArrayList<Card>(Card.createCards());
            state = new GameState(cards);
            System.out.println("Initialization DominionBoard:\n " + state.toString());

            //get a random number of players
            Random getfucked = new Random();
            int randomNum = getfucked.nextInt((4 - 2) + 1) + 2;
            System.out.println("RANDOM FUCKING NUMBER: " + randomNum + "\n");

            //there are not between 2 and 4 players that are possible
            //this for loop creates all the players
            int oopop = randomNum;
            System.out.println(oopop);
            //oopop -= 1;
            System.out.println(oopop);
            for (int i = 1; i <= randomNum; i++) {
                System.out.println(i);
                Player player = new Player(state, "player-" + i);
                assertEquals(player.player_username, "player-" + i);
                state.addPlayer(player);
                System.out.println(player);
            }

            //Initialize the game!
            state.initializeGame();

            //test that the players all got cards
            List<Player> player = state.players;
            System.out.println(player);
            System.out.println(oopop);
            System.out.println(randomNum);
            for(int x = 1; x < oopop; x++ ){
                //System.out.println(player);
                assertEquals(player.get(x).hand.size(), 5);
                assertEquals(player.get(x).discard.size(), 0);
                assertEquals(player.get(x).deck.size(), 5);
                assertEquals(player.get(x).Trash.size(), 0);
                assertEquals(player.get(x).playedCards.size(), 0);
            }

            System.out.println("Initialization DominionBoard:\n " + state.toString());

            HashMap<Player, Integer> winners = state.play();
            System.out.println("Finished game.\n");

            for (Player p : winners.keySet()) {
                System.out.println("Player name: " + winners.get(p) + " , Score: " + winners.get(p));
            }

            assertNotEquals(winners, null);

        }

    }

}