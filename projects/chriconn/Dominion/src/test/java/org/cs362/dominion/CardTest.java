package org.cs362.dominion;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

//@Test goes over functions
//assertEquals("THIS IS TEXT", testTheThing, what it should be);

public class CardTest {
    @Test
    public void CreateCard() {
        Card test = new Card();
        assertEquals("The new card is not initialized to null", test.getName(), "null");
    }

    @Test
    public void CreateNamedCards() {
        // gold
        // silver
        // copper
        // estate
        // dutchy
        // province


        Card test = new Card("gold");
        assertEquals("The new card does not have the name gold", test.getName(), "gold");
        test = new Card("silver");
        assertEquals("The new card does not have the name silver", test.getName(), "silver");
        test = new Card("curse");
        assertEquals("The new card does not have the name curse", test.getName(), "curse");
        test = new Card("copper");
        assertEquals("The new card does not have the name copper", test.getName(), "copper");
        test = new Card("estate");
        assertEquals("The new card does not have the name estate", test.getName(), "estate");
        test = new Card("dutchy");
        assertEquals("The new card does not have the name dutchy", test.getName(), "dutchy");
        test = new Card("province");
        assertEquals("The new card does not have the name province", test.getName(), "province");
        test = new Card("Adventurer");
        assertEquals("The new card does not have the proper name", test.getName(), "adventurer");
        test = new Card("Ambassador");
        assertEquals("The new card does not have the proper name", test.getName(), "ambassador");
        test = new Card("Baron");
        assertEquals("The new card does not have the proper name", test.getName(), "baron");
        test = new Card("Council room");
        assertEquals("The new card does not have the proper name", test.getName(), "council room");
        test = new Card("Cutpurse");
        assertEquals("The new card does not have the proper name", test.getName(), "cutpurse");
        test = new Card("Embargo");
        assertEquals("The new card does not have the proper name", test.getName(), "embargo");
        test = new Card("Feast");
        assertEquals("The new card does not have the proper name", test.getName(), "feast");
        test = new Card("Gardens");
        assertEquals("The new card does not have the proper name", test.getName(), "gardens");
        test = new Card("Great hall");
        assertEquals("The new card does not have the proper name", test.getName(), "great hall");
        test = new Card("Mine");
        assertEquals("The new card does not have the proper name", test.getName(), "mine");
        test = new Card("Witch");
        assertEquals("The new card does not have the proper name", test.getName(), "witch");
        test = new Card("Cellar");
        assertEquals("The new card does not have the proper name", test.getName(), "cellar");
        test = new Card("Market");
        assertEquals("The new card does not have the proper name", test.getName(), "market");
        test = new Card("Village");
        assertEquals("The new card does not have the proper name", test.getName(), "village");
        test = new Card("Smithy");
        assertEquals("The new card does not have the proper name", test.getName(), "smithy");
        test = new Card("Salvager");
        assertEquals("The new card does not have the proper name", test.getName(), "salvager");



        //Adventurer
        //Ambassador
        //Baron
        //Council room
        //Cutpurse
        //Embargo
        //Feast
        //Gardens
        //Great hall
        //Mine
        //Witch
        //Cellar
        //Market
        //Village
        //Smithy
        //Salvager
    }
}
