package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class RandomTestDominion{


    public  static void main(String args[]){

        List<Card> cards;
        GameState state;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        Random rand = new Random();
        int robot = rand.nextInt(3);

        Player player = new Player(state, "player-1");//at least 2 players
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        for(int i=0; i<robot; i++){
            player = new Player(state, "player-"+(i+3));
            state.addPlayer(player);
        }



        state.initializeGame();

        System.out.println("Initialization DominionBoard:\n " + state.toString());

        HashMap<Player, Integer> winners=state.play();
        System.out.println ("Finished game.\n");

        for(Player p: winners.keySet()){
            System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
        }

        System.exit(0);

    }
}