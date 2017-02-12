package org.thenellb;


// template made for all cards
// All cards will now have same format


public class Bazaar extends Card {


    //constructor
    public Bazaar() {
        String cardName ="Bazaar";
        String text = "";             // official description from dominion website
        int victoryValue = 0;         // number of Victory points the card gives
        int plusBuyValue = 0;         // number of +Buys the card gives
        int plusTreasuryValue = 1;    // number of +Coins the card gives
        int plusActionValue = 2;      // number of +Actions the card gives
        int plusCardValue = 1;        // number of +Cards drawn
        int cost = 5;                 // how many coins it costs to buy
        String cardType = "ACTION";

    }
    public void activate() {
        System.out.println("Playing the card:  " + cardName);

        //add things that will allow me to look through deck once deck is made
    }




}