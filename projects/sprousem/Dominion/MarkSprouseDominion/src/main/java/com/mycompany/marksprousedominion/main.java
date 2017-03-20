package com.mycompany.marksprousedominion;

import java.util.Random;

/**
 * Created by MarkSprouse on 2/12/2017.
 */
public class main {

    public static void main(String[] args) {
        int numPlayers;
        int seed;

        numPlayers = Integer.parseInt(args[0]);
        seed = Integer.parseInt(args[1]);

        Random rand = new Random(seed);

        // TODO Auto-generated method stub
        playDominion game = new playDominion(numPlayers, rand);	//Start to play the game

        //Play the game
        while(true)
        {
            for (int i = 0;i < numPlayers; i++)
            {
                game.nextPlayer();
                game.executeTurn(game.getCurrent(), game.getPlayers(), game.getBoard());
                if(game.gameDone(game.getBoard()))
                   break;
            }
            if(game.gameDone(game.getBoard()))
                break;
        }
        //End of game


    }
}
