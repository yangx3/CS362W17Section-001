package org.cs362.dominion;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

//@Test goes over functions
//assertEquals("THIS IS TEXT", testTheThing, what it should be);

public class DeckTest {
    @Test
    public void createDeckAndTestSize() {
        Deck test = new Deck();

        assertEquals("The empty deck is not 0", test.deck.size(), 0);
        assertTrue("The empty() does not return true for an empty deck", test.empty());
        assertEquals("DrawCard() returns a card on an empty deck", test.drawCard(), null);
        assertFalse("The empty deck has a treasure type in it", test.hasType("treasure"));

        test.addCard(new Card("copper"));

        assertFalse("The empty() returns true for a non-empty deck", test.empty());
        assertEquals("The deck with one copper does not have a size of 1", test.deck.size(), 1);
        assertEquals("The deck.size() and deck.numCards() dont match", test.deck.size(), test.numCards());
    }


    @Test
    public void testSingleCardDeck() {
        Deck test = new Deck();

        test.addCard(new Card("copper"));

        assertEquals("The copper card is not named a copper card", test.cardInfo(0).getName(), "copper");
        assertTrue("The deck with a single copper card does not contain a treasure card", test.hasType("treasure"));
        assertEquals("The deck with one copper card does not return an index of 0 for a treasure card", test.indexOfType("treasure"), 0);
    }


    @Test
    public void addAndRemoveCards() {
        Deck test = new Deck();

        Random rand = new Random();
        int n;

        for (int x = 0; x < 1000; x++) {
            n = rand.nextInt(3);
            if (n == 0) {
                test.addCard(new Card("copper"));
            }
            else if (n == 1) {
                test.addBottomCard(new Card("copper"));
            }
            else {
                test.drawCard();
            }
        }
    }

    @Test
    public void starterDeck() {
        Deck test = new Deck("starter");
    }

    @Test
    public void oneOfEachDeck() {
        Deck test = new Deck("oneofeach");
    }

    @Test
    public void addRandomCards() {
        Deck test = new Deck();

        for (int x = 0; x < 50; x++) {
            test.addCard(randomCard());
        }

        Random rand = new Random();
        for (int x = 0; x < 100; x++) {
            int n = rand.nextInt(4) + 1;
            test = new Deck(n, randomCard());
        }

    }

    public Card randomCard() {
        String[] cardList = { "gold", "silver", "copper", "estate", "dutchy", "province", "adventurer", "ambassador", "baron", "council room", "cutpurse", "embargo", "feast", "gardens", "great hall", "mine", "witch", "cellar", "market", "village", "smithy", "salvager" };

        Random rand = new Random();
        int n = rand.nextInt(22);
        return new Card(cardList[n]);
    }
}
