package org.cs362.dominion;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

//@Test goes over functions
//assertEquals("THIS IS TEXT", testTheThing, what it should be);

public class PlayerTest {
    @Test
    public void CreatePlayer() {
        Player test = new Player();

        //test all three hands
        assertFalse("New player draw deck is empty", test.drawDeck.empty());
        assertTrue("New player hand is not empty", test.hand.empty());
        assertTrue("New player discard is not empty", test.discard.empty());

        //test the player stats
        assertEquals("New player actions is not 0", test.getActions(), 0);
        assertEquals("New player values is not 0", test.getValues(), 0);
        assertEquals("New player buys is not 0", test.getBuys(), 0);
        assertEquals("New player name is not null", test.getName(), "null");

        test = new Player("connor");
        //test all three hands
        assertFalse("New player draw deck is empty", test.drawDeck.empty());
        assertTrue("New player hand is not empty", test.hand.empty());
        assertTrue("New player discard is not empty", test.discard.empty());

        //test the player stats
        assertEquals("New player actions is not 0", test.getActions(), 0);
        assertEquals("New player values is not 0", test.getValues(), 0);
        assertEquals("New player buys is not 0", test.getBuys(), 0);
        assertEquals("New player name is not null", test.getName(), "connor");
    }
}
