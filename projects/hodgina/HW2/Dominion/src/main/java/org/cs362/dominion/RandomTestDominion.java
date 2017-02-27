package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;

import java.util.Random;

public class RandomTestDominion {

    public  static void main(String args[]){

        List<Card> cards;
        GameState state;

        Random gen = new Random();

        String[] names = {"Player_1", "Player_2", "Player_3", "Player_4"};

        int num_players = gen.nextInt(3)+2;


        //the cards  are achieved by each element/constant in the enum class
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString());


        for(int i = 0; i < num_players; i++){
            Player player = new Player(state, names[i]);
            state.addPlayer(player);
        }

        if(state.players.size() < 2  || state.players.size() > 4){
            System.out.println("You need at least 2 to 4 players");
        }else {
            System.out.println("The number of charates are correct");
        }

        //Initialize the game!
        state.initializeGame();



        System.out.println("Initialization DominionBoard:\n " + state.toString());

        HashMap<Player, Integer> winners = state.play();
        System.out.println ("Finished game.\n");

        for(Player p: winners.keySet()){
            System.out.println ("Player name: " + p.player_username + " , Score: "+ winners.get(p) );
        }

        //	      player.printStateGame();


        System.exit(0);

    }


}
