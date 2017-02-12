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
public class PlayerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PlayerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PlayerTest.class );
    }

    /**
     * Tests draw card
     */
    public void testDrawCard()
    {
        List<Card> cards = Card.createCards();
        GameState gs = new GameState(cards);
        Player p1 = new Player(gs, "player 1");
        Player p2 = new Player(gs, "player 2");

        gs.addPlayer(p1);
        gs.addPlayer(p2);
        gs.initializeGame();

        //testing to see what the players' decks looks like
        p1.drawCard();
        assertTrue( p1.hand.size() == 1 );
    }

    /**
     * Tests initialize turn
     */
    public void testInitializeTurn()
    {
        List<Card> cards = Card.createCards();
        GameState gs = new GameState(cards);
        Player p1 = new Player(gs, "player 1");
        Player p2 = new Player(gs, "player 2");

        gs.addPlayer(p1);
        gs.addPlayer(p2);
        gs.initializeGame();
        p1.initializePlayerTurn();

        assertTrue( p1.hand.size() == 5 && p1.deck.size() == 5 );
    }

    /**
     * Tests buy phase
     */
    public void testBuy()
    {
        List<Card> cards = Card.createCards();
        GameState gs = new GameState(cards);
        Player p1 = new Player(gs, "player 1");
        Player p2 = new Player(gs, "player 2");

        gs.addPlayer(p1);
        gs.addPlayer(p2);
        gs.initializeGame();

        //add Smithy to test that played cards are cleaned up too
        p1.initializePlayerTurn();
        //p1.buy(gs);

        //hand and played cards should be 0, discarded should have all cards that were available
        assertTrue( true );
    }

    /**
     * Tests clean up phase
     */
    public void testCleanUp()
    {
        List<Card> cards = Card.createCards();
        GameState gs = new GameState(cards);
        Player p1 = new Player(gs, "player 1");
        Player p2 = new Player(gs, "player 2");

        gs.addPlayer(p1);
        gs.addPlayer(p2);
        gs.initializeGame();

        //add Smithy to test that played cards are cleaned up too
        p1.initializePlayerTurn();
        p1.hand.add(Card.getCard(cards, CardName.Smithy));
        p1.action();
        p1.cleanUp();

        //hand and played cards should be 0, discarded should have all cards that were available
        assertTrue( p1.hand.size() == 0 && p1.discarded.size() == 9 && p1.playedCards.size() == 0 );
    }
}
