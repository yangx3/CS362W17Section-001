package org.thenellb;

import java.util.ArrayList;
import java.util.*;

public class Deck {
    public List<Card> cardDeck; // list of cards
    public List<Card> discard;  // discard pile
    public List <Card> trash;   // trash pile
    public int deckSize;        // number of cards inside the deck
    public int discardSize;     //number of cards inside discard pile
    public int deckIndex;       // index of what card player is on
    public int remainingCards;  // cards left in draw pile
    public int victoryCards;    // number of victory cards inside deck
    public int treasureCards;   // number of treasure cards inside deck
    public int actionCards;     // number of action cards inside deck

    //constructor
    public Deck() {
        cardDeck = new ArrayList<Card>();
        discard = new ArrayList<Card>();
        trash = new ArrayList<Card>();
        deckSize = 0;
        victoryCards = 0;
        treasureCards = 0;
        actionCards = 0;
        remainingCards = 0;
    }

    //Adds card to deck array
    public void addCardToDeck(Card addedCard) {
        cardDeck.add(addedCard);    //appends card to deck
        deckSize = cardDeck.size();

    }
    public void addCardToDiscard(Card addedCard) {
        discard.add(addedCard);    //appends card to deck
        discardSize = discard.size();

    }
    public void shuffle() {
        cardDeck.clear();   //removes all held elements in card deck
        Collections.shuffle(discard);
        for (int i=0; i<discardSize; i++) { //copies card from shuffled discard pile to empty deck
            cardDeck.add(discard.get(i));
        }
        discard.clear();                    //clears discard pile
    }
    public Card drawCard(){
        return cardDeck.get(deckIndex++);
    }



}
