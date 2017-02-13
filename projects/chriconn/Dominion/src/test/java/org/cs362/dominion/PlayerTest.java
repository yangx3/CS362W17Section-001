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


        test.modifyActions(1);
        test.modifyValues(1);
        test.modifyBuys(1);

        assertEquals("Player with modified +1 actions does not have 1 actions", test.getActions(), 1);
        assertEquals("Player with modified +1 values does not have 1 values", test.getValues(), 1);
        assertEquals("Player with modified +1 buys does not have 1 buys", test.getBuys(), 1);

        test.starterPoints();
        assertEquals("Player with starterPoints() does not have proper actions points", test.getActions(), 1);
        assertEquals("Player with starterPoints() does not have proper buys points", test.getBuys(), 1);
        assertEquals("Player with starterPoints() does not have proper values points", test.getValues(), 0);

        test.sumTreasure();
        if (test.hand.hasType("treasure")) {
            assertNotEquals("Player treasure cards in their hand did not have the values added past 0", test.getValues(), 0);
        }
    }
}
