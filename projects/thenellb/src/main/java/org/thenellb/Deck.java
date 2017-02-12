package org.thenellb;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public List<Card> cardDeck;    // list of cards
    public int deckSize;        // number of cards inside the deck
    public int victoryCards;    // number of victory cards inside deck
    public int treasureCards;   // number of treasure cards inside deck
    public int actionCards;     // number of action cards inside deck

    public Deck() {
        cardDeck = new ArrayList<Card>();
        deckSize = 0;
        victoryCards = 0;
        treasureCards = 0;
        actionCards = 0;
    }


}
