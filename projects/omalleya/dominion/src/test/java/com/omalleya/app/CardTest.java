package com.omalleya.app;

import static junit.framework.Assert.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.List;

import com.omalleya.app.Card.CardName;

/**
 * Unit test for simple App.
 */
public class CardTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CardTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CardTest.class );
    }

    /**
     * Tests smithy
     */
    public void testSmithy()
    {
        List<Card> cards = Card.createCards();
        GameState gs = new GameState(cards);
        Player p1 = new Player(gs, "player 1");
        Player p2 = new Player(gs, "player 2");

        gs.addPlayer(p1);
        gs.addPlayer(p2);
        gs.initializeGame();

        //add smithy to hand and play it
        p1.initializePlayerTurn();
        p1.hand.add(Card.getCard(cards, CardName.Smithy));
        p1.action();

        //testing to see what the players' hand looks like
        //should be 8 because we start with 6, play smithy
        //giving us 5, add 3 cards from smithy giving 8
        assertTrue( p1.hand.size() == 8 && p1.playedCards.size() == 1 );
    }
}
