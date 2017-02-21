package com.mycompany.marksprousedominion;

/**
 * Created by MarkSprouse on 2/12/2017.
 */
public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        playDominion game = new playDominion();	//Start to play the game

        //Play the game
        while(true)
        {
            game.executeTurn(game.getPlayer1(), game.getPlayer2(), game.getBoard());
            if(game.gameDone(game.getBoard()))
                break;
            game.executeTurn(game.getPlayer2(), game.getPlayer1(), game.getBoard());
            if(game.gameDone(game.getBoard()))
                break;
        }
        //End of game


    }
}
