package org.thenellb;


// template made for all cards
// All cards will now have same format




public class Cellar extends Card {


//constructor
    public Cellar() {
        cardName ="Cellar";
        text =    "";    // official description from dominion website
        victoryValue = 0;         // number of Victory points the card gives
        plusBuyValue = 0;         // number of +Buys the card gives
        plusTreasuryValue = 0;    // number of +Coins the card gives
        plusActionValue = 1;      // number of +Actions the card gives
        plusCardValue = 0;        // number of +Cards drawn
        cost = 2;                 // how many coins it costs to buy
        cardType = "ACTION";
        plusDiscardValue = 0;
    }
    public int activate() {
        System.out.println("Playing the card:  " + cardName+"\n");
        return 3;

    }
}