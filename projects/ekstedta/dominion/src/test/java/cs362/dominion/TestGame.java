package cs362.dominion;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGame {
    int seed = 1;

    @Test
    public void testInit() {
        ArrayList<Card> k = Game.standardCards();
        Game game = new Game(2, k, seed);

        assertEquals(game.getNumPlayers(), 2);

        // player 1 starts
        assertEquals(game.getCurrentPlayer(), 0);

        // Each player starts with 3 estates
        assertEquals(game.scoreFor(0), 3);
        assertEquals(game.scoreFor(1), 3);

        // Each player should start with 5 cards in their hand
        assertEquals(game.numHandCards(), 5);

        // ending the turn should advance the player
        game.endTurn();
        assertEquals(game.getCurrentPlayer(), 1);
        assertEquals(game.numHandCards(), 5);

        //
        // check supply
        // assertEquals(game.supplyCount(Card.Estate), 60-6);
    }

    @Test
    public void testMarket() {
        ArrayList<Card> k = Game.standardCards();
        Game game = new Game(2, k, seed);
        game.setHandCard(0, 0, Card.Baron);
        game.playAction(0, false);
        assertEquals(game.numHandCards(), 5);
    }
}
