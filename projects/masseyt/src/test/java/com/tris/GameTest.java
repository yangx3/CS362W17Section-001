package com.tris;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

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
    public void testListBoard() {
        List<Card> c = g.listBoard();
        assertEquals(c.size(), 17);
    }

    @Test
    public void testListEmbargo() {
        p1.hand.add(Card.getCard(cards, Card.Name.EMBARGO));
        p1.playAction();
        List<Card> c = g.listEmbargo();
        assertEquals(c.size(), 10);
    }

}
