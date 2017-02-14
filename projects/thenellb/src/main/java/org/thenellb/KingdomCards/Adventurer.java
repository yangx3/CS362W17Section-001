package org.thenellb;


// template made for all cards
// All cards will now have same format


public class Adventurer extends Card {


    //constructor
    public Adventurer() {
        cardName = "Adventurer";
        text = "Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.";       // official description from dominion website
        victoryValue = 0;         // number of Victory points the card gives
        plusBuyValue = 0;         // number of +Buys the card gives
        plusTreasuryValue = 0;    // number of +Coins the card gives
        plusActionValue = 0;      // number of +Actions the card gives
        plusCardValue = 0;        // number of +Cards drawn
        cost = 6;                 // how many coins it costs to buy
        cardType = "ACTION";
        plusDiscardValue = 0;

    }
    public int activate() {
        System.out.println("Playing the card:  " + cardName);
        return 1;

        //add things that will allow me to look through deck once deck is made
    }




}
