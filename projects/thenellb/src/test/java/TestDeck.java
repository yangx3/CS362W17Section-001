package org.cs362.dominion;
import org.thenellb.*;
import org.junit.Test;
//import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public class TestDeck {
    @Test
    public void addTestDeck(){
        Deck myDeck = new Deck();
        System.out.println("Deck at initialization:  \n");
        for (int k = 0; k<10; k++){
            System.out.println("Card at index "+k +" is " + myDeck.discard.get(k).get_cardName());
        }
        System.out.println("Deck after being shuffled:  \n");
        myDeck.shuffle();
        System.out.println("Size of discard:  "+ myDeck.discardSize + "\nSize of deck:  "+myDeck.deckSize+"\n");
        for (int q = 0; q<10; q++){

            System.out.println("Card at index "+q +" is " + myDeck.cardDeck.get(q).get_cardName());
        }
        for (int q = 0; q<10; q++){ //checking again to see if it reshuffles just fine
            myDeck.addCardToDiscard(myDeck.cardDeck.get(q));
        }
        myDeck.shuffle();
        for (int q = 0; q<11; q++) {    //trying to draw more cards than there are in deck, results in reshuffle
            myDeck.addCardToDiscard(myDeck.drawCard());

        }

    }




}
