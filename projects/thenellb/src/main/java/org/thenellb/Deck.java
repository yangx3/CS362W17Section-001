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
        initialization();
    }
    public void initialization() {
        for (int i = 0; i<7; i++){
            Card starterCoin = new Copper();
            addCardToDiscard(starterCoin);
        }
        for (int j = 0; j<3; j++) {
            Card starterEstate = new Estate();
            addCardToDiscard(starterEstate);
        }

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
        if (discard.size() == 0)
            return;
        cardDeck.clear();   //removes all held elements in card deck
        Collections.shuffle(discard);
        for (int i=0; i<discardSize; i++) { //copies card from shuffled discard pile to empty deck

            addCardToDeck(discard.get(i));


        }

        discard.clear();                    //clears discard pile

        deckIndex=0;
    }
    public Card drawCard(){

        if (deckIndex == deckSize)
            shuffle();
        return cardDeck.get(deckIndex++);
    }

    public int tallyVictoryPoints() {
        int total=0;
        shuffle();
        for (int i=0; i<cardDeck.size(); i++){
            total += cardDeck.get(i).get_victoryValue();
        }
        return total;

    }

    public Card scanForTreasure(){
        for (int j=deckIndex; j<deckSize; j++)
            if (cardDeck.get(j).get_cardType() == "TREASURE")
                return drawCard();
            else {
                System.out.println("Card being discarded: \n");
                cardDeck.get(deckIndex).printCard();
                addCardToDiscard(drawCard());
            }
    return null;
    }





}
