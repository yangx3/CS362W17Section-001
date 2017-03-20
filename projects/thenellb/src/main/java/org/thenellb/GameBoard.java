package org.thenellb;
import java.util.ArrayList;
import java.util.*;

import static javafx.application.Platform.exit;


/* Modified game mode that will work explicitly between bots with no humans */
public class GameBoard {
    public CardShop myCardShop;
    public List<Player> myPlayers;
    public int userChoice;
    public int numberPlayers;


    public GameBoard(){

        //automatic game of dominion between bots
        Scanner scan = new Scanner(System.in);
        userChoice=0;
        myCardShop = new CardShop();
        myPlayers = new ArrayList<Player>();
        userChoice= Random.getRandomInt(2,5);
        numberPlayers=userChoice;
        System.out.println("User choice:  "+userChoice+"\n");
        for (int j=0; j<userChoice; j++){
            myPlayers.add(new Player(myCardShop));
        }
        for (int i=0; i<100; i++){

            System.out.println("Playing another round of turns between bots\n");

                for (int j=0; j<numberPlayers; j++){
                    myPlayers.get(j).playerTurn();
                } // for each player
        }  // play a round of turns
      // tallies score at end of turns
        int max=0;
        int index=0;
        for (int k=0; k<numberPlayers; k++){
            System.out.println("Player " +  k + " has " + myPlayers.get(k).playerDeck.tallyVictoryPoints()+ " Points.\n");
            if (myPlayers.get(k).playerDeck.tallyVictoryPoints()> max) {
                max = myPlayers.get(k).playerDeck.tallyVictoryPoints();
                index=k;
            }
        }
        System.out.println("\n\n\nWinner at index:  "+index+"!!!!!!!!!!!!!!\n\n\n\n");
        exit();
    }



}
