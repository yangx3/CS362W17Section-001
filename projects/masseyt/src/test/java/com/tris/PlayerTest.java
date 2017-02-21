package com.tris;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {
    Game g;
    Player p1, p2;
    List<Card> cards;

    @Before
    public void init() {
        cards = new ArrayList<Card>(Card.generate());
        g = new Game(cards);
        p1 = new Player(g, "testP1");
        g.addPlayer(p1);
        p2 = new Player(g, "testP2");
        g.addPlayer(p2);
        g.initGame();
    }

    @Test
    public void testDraw() {
        p1.draw();
        assertEquals(p1.hand.size(), 6);
    }

    @Test
    public void testGain() {
        p1.gain(cards.get(0));
        assertEquals(p1.discard.size(), 1);
    }

    @Test
    public void testDiscard() {
        p1.discard(p1.hand.get(0));
        assertEquals(p1.discard.size(), 1);
    }

    @Test
    public void testScore() {
        assertEquals(p1.score(), 3);
    }

    @Test
    public void testPlayAction() {
        p1.hand.add(Card.getCard(cards, Card.Name.SMITHY));
        p1.playAction();
        assertEquals(p1.hand.size(), 8);
        assertEquals(p1.played.size(), 1);
    }

    @Test
    public void testBuy() {
        p1.hand.add(Card.getCard(cards, Card.Name.GOLD));
        p1.hand.add(Card.getCard(cards, Card.Name.GOLD));
        p1.hand.add(Card.getCard(cards, Card.Name.GOLD));
        p1.buy();
        assertTrue(p1.discard.size() == 1 || p1.discard.size() == 0); //1 if something was chosen or 0 if buy phase was skipped
    }

    @Test
    public void testListCards() {
        for (int i = 0; i < 5; i++)
            p1.hand.remove(0);
        p1.hand.add(Card.getCard(cards, Card.Name.ADVENTURER));
        List<Card> c = p1.listCards(p1.hand);
        assertEquals(c.get(0).getName(), Card.Name.ADVENTURER);
    }

    @Test
    public void testEndTurn() {
        p1.endTurn();
        assertEquals(p1.hand.size(), 5);
        assertEquals(p1.actions, 1);
        assertEquals(p1.buys, 1);
        assertEquals(p1.coins, 0);
        assertEquals(p1.discard.size(), 5);
    }
}
