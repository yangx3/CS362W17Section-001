package org.thenellb;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Platform.exit;

public class Player {
    public Deck playerDeck;
    public List<Card> playerHand;
    public int cardsInHand;
    public int playerNumber;   //used in game initialization for indexing purposes
    public int numActions;
    public int numBuys;
    public int numDraws;
    public int numCoins;
    public CardShop myCardShop;

    //constructor

    public Player(CardShop myCardShop){
        this.myCardShop = myCardShop;
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
        cleanUp();
        System.out.println("Turn successful!\n");
        //exit();
    }
    public void action(){

        int userChoice=0;

        System.out.println("_____________________________________________________\n");
        System.out.println("____________________ACTION PHASE_____________________\n");
        System.out.println("_____________________________________________________\n");
        for (int i=0; i< numActions; i++) {
            boolean flag1 = false;

            System.out.println("Please choose a card to play:  ");
            for (int j=0; j<cardsInHand; j++) {
                if (playerHand.get(j).get_cardType() == "ACTION") {
                    System.out.println("\n\nCard number " + j + ":  \n");
                    playerHand.get(j).printCard();
                }
                if (j == cardsInHand-1 && flag1 == false) {
                    System.out.println("No action cards in hand\n\n");
                    return;
            }
                }  // Prints card if it is an action card
             // Iterates through hand
            while (!flag1){
                System.out.println("\n\nCard to play:  ");
                userChoice=Random.getRandomInt(0,cardsInHand);
                if (userChoice >=0 && userChoice < cardsInHand)
                    if (playerHand.get(userChoice).get_cardType()=="ACTION")
                        flag1 = true;

            } // Until flag is marked true
            play(userChoice);




        }  // This loop can increase iterations  based on what card is played
        System.out.println("\n\n_____________YOU ARE OUT OF ACTIONS_______________\n\n");



    }
    public void effect (int input){
        switch (input){
            case 1:
                for (int i = 0; i<2; i++)
                    playerHand.add(playerDeck.scanForTreasure());
                break;
            case 2:
                break;
            case 3:
                numDraws += chooseDiscard();
                break;
            case 4:
                discardDeck();
                break;
            case 5:
                trashCards();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                numCoins+=trashCopper();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;



        }

    }


    public int trashCopper(){
        for (int i = 0; i<cardsInHand; i++)
            if (playerHand.get(i).get_cardName()=="Copper"){
                playerDeck.trash.add(playerHand.get(i));
                cardsInHand--;
                playerHand.remove(i);
                return 3;
            }
        return 0;

    }


    public void trashCards(){
        Scanner scan = new Scanner(System.in);
        int userChoice=0;
        int userChoice2=0;
        System.out.println("Please choose how many cards to trash:  ");
        userChoice=scan.nextInt();
        for (int j=0; j<cardsInHand; j++) {
            System.out.println("Index:  "+ j + "\n");
            playerHand.get(j).printCard();
        }
        for (int i=0; i<userChoice; i++){
            System.out.println("Which index of card would you like to dispose of?   ");
            System.out.println("Reminder: Index will shift down one each time you remove a card:   ");
            userChoice2 = scan.nextInt();
            playerDeck.trash.add(playerHand.get(userChoice2));
            playerHand.remove(userChoice2);
            cardsInHand--;
        }

    }
    public int chooseDiscard(){
        Scanner scan = new Scanner(System.in);
        int userChoice=0;
        int userChoice2=0;
        System.out.println("Please choose how many cards to discard:  ");
        userChoice=scan.nextInt();
        for (int j=0; j<cardsInHand; j++) {
            System.out.println("Index:  "+ j + "\n");
            playerHand.get(j).printCard();
        }
        for (int i=0; i<userChoice; i++){
            System.out.println("Which index of card would you like to dispose of?   ");
            System.out.println("Reminder: Index will shift down one each time you remove a card:   ");
            userChoice2 = scan.nextInt();
            playerDeck.addCardToDiscard(playerHand.get(userChoice2));
            playerHand.remove(userChoice2);
            cardsInHand--;
        }
        return userChoice;
    }
    public void discardDeck(){
        Scanner scan = new Scanner(System.in);
        int userChoice=0;
        System.out.println("Would you like to discard deck?  1 - Yes || Any other key - NO    ");
        userChoice = scan.nextInt();
        if (userChoice==1) {
            for (int i = playerDeck.deckIndex; i < playerDeck.deckSize; i++) ;
                playerDeck.addCardToDiscard(playerDeck.drawCard());
        }
        else
            return;

    }


    public void play(int userChoice) {

        playerDeck.addCardToDiscard(playerHand.get(userChoice));
        effect( playerHand.get(userChoice).activate());
        numActions += playerHand.get(userChoice).get_plusActionValue();
        numBuys += playerHand.get(userChoice).get_plusBuyValue();
        numDraws += playerHand.get(userChoice).get_plusCardValue();
        numCoins += playerHand.get(userChoice).get_plusTreasuryValue();

        playerHand.remove(userChoice);
        cardsInHand--;

    }
    public void buy() {


        int cardToBuy=0;


        System.out.println("_____________________________________________________\n");
        System.out.println("_____________________BUY PHASE_______________________\n");
        System.out.println("_____________________________________________________\n");
        System.out.println("Playing your treasury cards!\n");
        System.out.println("Cards in hand:  "+this.cardsInHand+"\n");

        for (int i = 0; i < cardsInHand; i++) {

           // System.out.println("Card type  at index "+i+":  "+playerHand.get(i).get_cardType()+"\n");
            if (playerHand.get(i).get_cardType() == "TREASURE") {
                play(i);
                i--;    // decrement since cardsInHand will be smaller after being played
            }
        } // Play all treasure cards in hard

        for (int i = 0; i < numBuys; i++){
            boolean flag = false;

            while (!flag) {
                if (numCoins < 2) // nothing costs less than two coins, ret out of function
                    return;
                cardToBuy = Random.getRandomInt(0,16);
                System.out.println("You have " + numCoins + " Coins. \n");


                for (int j = 0; j < 17; j++) {


                    if (cardToBuy == j ) {
                        if (numCoins >=  myCardShop.myCardPicker.finalList.get(j).get_cost()) {
                            playerDeck.addCardToDiscard(myCardShop.myCardPicker.finalList.get(j));
                            myCardShop.myCardPicker.finalList.get(j);//.set(j,j-1);
                            numCoins -= myCardShop.myCardPicker.finalList.get(j).get_cost();
                        }

                        else{
                           // System.out.println("Sorry, you can't afford that card or it doesn't exist.");
                           // System.out.println("Card you were trying to buy:  "+myCardShop.myCardPicker.finalList.get(j).get_cardName()+"    Cost:    "+myCardShop.myCardPicker.finalList.get(j).get_cost()+"\n");
                           // System.out.println("Value of i:  "+i+"\n");
                            i--;
                            flag=true;
                        }
                    }
                }

           // else
              //  flag = true;
            }
        }

        }
        public void cleanUp(){
            for (int i=0; i<cardsInHand; i++){
                playerDeck.addCardToDiscard(playerHand.get(i));
            }
            playerHand.clear();
            cardsInHand = 0;
            numActions = 1;
            numBuys = 1;
            numDraws = 0;
            numCoins = 0;
        }
    }

