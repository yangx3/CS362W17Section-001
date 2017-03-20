package org.cs362.dominion;

import java.util.*;

public class RandomTestDominion{

    public  static void main(String args[]){
        //members
        List<Card> cards;
        GameState state;
        //set seed
        Randomness.reset(10);

        //initialize
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        //print initial state of gameboard
        System.out.println("Initial DominionBoard:\n " + state.toString());
        System.out.println("Adding players:\n ");
        Player player1 = new Player(state,"Player1");
        state.addPlayer(player1);
        Player player2 = new Player(state,"Player2");
        state.addPlayer(player2);

        Random rand = new Random();
        int  n = rand.nextInt(4) + 2;
        if(n>2){
            if(n==3){
                Player player3 = new Player(state,"Player3");
                state.addPlayer(player3);

            }
            else if(n==4)
            {
                Player player3 = new Player(state,"Player3");
                state.addPlayer(player3);
                Player player4 = new Player(state,"Player4");
                state.addPlayer(player4);
            }
        }
        System.out.println("Players added:\n ");
        System.out.println("Initializing game. Random kingdom cards generated in initializeGame():\n ");
        state.initializeGame();

        HashMap<Player, Integer> winners = state.play();
        System.out.println ("Finished game.\n");

        //Print winners
        for(Player p: winners.keySet()){
            System.out.println ("Player name: " +p.player_username+", Score: " + winners.get(p) );
        }
        System.exit(0);

    }

}

