package org.thenellb;
import java.util.ArrayList;
import java.util.*;

import static javafx.application.Platform.exit;

public class GameBoard {
    public CardShop myCardShop;
    public List<Player> myPlayers;
    public int userChoice;
    public int numberPlayers;


    public GameBoard(){
        Scanner scan = new Scanner(System.in);
        userChoice=0;
        myCardShop = new CardShop();
        System.out.println("How many players:  ");
        userChoice= scan.nextInt();
        numberPlayers=userChoice;
        for (int j=0; j<userChoice; j++){
            myPlayers.add(new Player(myCardShop));
        }
        do {
            System.out.println("Would you like to do a round of turns? Hitting no will end the game.   1 - YES || ANY other key - NO     ");
            userChoice=scan.nextInt();
            if (userChoice == 1){
                for (int i=0; i<numberPlayers; i++){
                    myPlayers.get(i).playerTurn();
                } //for each player
            } // play a round of turns
        } while(userChoice == 1); //until otherwise stated
        int max=0;
        int index=0;
        for (int k=0; k<numberPlayers; k++){
            if (myPlayers.get(k).playerDeck.tallyVictoryPoints()> max) {
                max = myPlayers.get(k).playerDeck.tallyVictoryPoints();
                index=k;
            }
        }
        System.out.println("\n\n\n\n\nWinner at index:  "+index+"!!!!!!!!!!!!!!\n\n\n\n\n\n\n\n");
        exit();
    }



}
