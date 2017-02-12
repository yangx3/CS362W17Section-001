package org.thenellb;

public class Adventurer extends Card {


    //constructor
    public Adventurer() {
        String cardName = "Adventurer";
        String text = "Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.";       // official description from dominion website
        int victoryValue = 0;         // number of Victory points the card gives
        int plusBuyValue = 0;         // number of +Buys the card gives
        int plusTreasuryValue = 0;    // number of +Coins the card gives
        int plusActionValue = 0;      // number of +Actions the card gives
        int plusCardValue = 0;        // number of +Cards drawn
        int cost = 6;                 // how many coins it costs to buy
        String cardType = "ACTION";

    }
    public activate() {
        System.out.println("Playing the card:  " + name);

        //add things that will allow me to look through deck once deck is made
    }




}
