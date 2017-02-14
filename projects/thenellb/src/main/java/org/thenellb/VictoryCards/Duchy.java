package org.thenellb;


// template made for all cards
// All cards will now have same format


public class Duchy extends Card {


    //constructor
    public Duchy() {
        cardName ="Duchy";
        text =       ""; // official description from dominion website
        victoryValue = 3;         // number of Victory points the card gives
        plusBuyValue = 0;         // number of +Buys the card gives
        plusTreasuryValue = 0;    // number of +Coins the card gives
        plusActionValue = 0;      // number of +Actions the card gives
        plusCardValue = 0;        // number of +Cards drawn
        cost = 0;                 // how many coins it costs to buy
        cardType = "VICTORY";

    }
    public int activate() {
        System.out.println("Playing the card:  " + cardName);
        return 18;
        //add things that will allow me to look through deck once deck is made
    }




}