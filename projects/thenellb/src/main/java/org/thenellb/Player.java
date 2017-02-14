package org.thenellb;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Player {
    public Deck playerDeck;
    public List<Card> playerHand;
    public int cardsInHand;
    public int playerNumber;   //used in game initialization for indexing purposes
    public int numActions;
    public int numBuys;
    public int numDraws;
    public int numCoins;

    //constructor

    public Player(){
        playerDeck = new Deck();
        playerHand =  new ArrayList<Card>();
        playerNumber = 0;
        numActions = 1;
        numBuys = 1;
        numDraws = 0;
        numCoins = 0;

    }
    public void playerTurn() {
        for (int i = 0; i<5; i++){  // draws 5 cards to start turn
            playerHand.add(playerDeck.drawCard());
            cardsInHand++;
            System.out.println("\n\nCard number " + i + ":  \n");
            playerHand.get(i).printCard();

        }


        action();       // Action phase
        buy();          // Buy phase
    }
    public void action(){
        Scanner scan = new Scanner(System.in);
        int userChoice=0;
       boolean flag = false;
        System.out.println("_____________________________________________________\n");
        System.out.println("____________________ACTION PHASE_____________________\n");
        System.out.println("_____________________________________________________\n");
        for (int i=0; i< numActions; i++) {
            System.out.println("Please choose a card to play:  ");
            for (int j=0; j<cardsInHand; j++) {
                if (playerHand.get(j).get_cardType() == "ACTION") {
                    System.out.println("\n\nCard number " + j + ":  \n");
                    playerHand.get(j).printCard();
                }  // Prints card if it is an action card
            } // Iterates through hand
            while (!flag){
                System.out.println("\n\nCard to play:  ");
                userChoice = scan.nextInt();
                if (userChoice >=0 && userChoice < cardsInHand)
                    if (playerHand.get(userChoice).get_cardType()=="ACTION")
                        flag = true;
                    else
                        System.out.println("\nThat card isn't an action card. Please try again!");
                else
                    System.out.println("\nSomething is wrong with your input. Please try again!");
            } // Until flag is marked true
            play(userChoice);




        }  // This loop can increase iterations  based on what card is played
        System.out.println("\n\n_____________YOU ARE OUT OF ACTIONS_______________\n\n");



    }
    public void play(int userChoice) {

        playerDeck.addCardToDiscard(playerHand.get(userChoice));
        numActions += playerHand.get(userChoice).get_plusActionValue();
        numBuys += playerHand.get(userChoice).get_plusBuyValue();
        numDraws += playerHand.get(userChoice).get_plusCardValue();
        numCoins += playerHand.get(userChoice).get_plusTreasuryValue();
        playerHand.get(userChoice).activate();
        playerHand.remove(userChoice);
        cardsInHand--;

    }
    public void buy() {
        System.out.println("_____________________________________________________\n");
        System.out.println("_____________________BUY PHASE_______________________\n");
        System.out.println("_____________________________________________________\n");
        System.out.println("Playing your treasury cards!\n");
        for (int i=0; i<cardsInHand; i++){
            if (playerHand.get(i).get_cardType() == "TREASURE")
                play(i);
        }



    }






}
