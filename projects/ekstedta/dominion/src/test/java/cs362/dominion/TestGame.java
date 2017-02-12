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

        assertEquals(2, game.getNumPlayers());

        // player 1 starts
        assertEquals(0, game.getCurrentPlayer());

        // Each player starts with 3 estates
        assertEquals(3, game.scoreFor(0));
        assertEquals(3, game.scoreFor(1));

        // Each player should start with 5 cards in their hand
        assertEquals(5, game.numHandCards());

        // ending the turn should advance the player
        game.endTurn();
        assertEquals(1, game.getCurrentPlayer());
        assertEquals(5, game.numHandCards());

        // check supply
        assertEquals(24-6, game.supplyCount(Card.Estate));
    }

    @Test
    public void testGameOver() {
        ArrayList<Card> k = Game.standardCards();
        Game game = new Game(2, k, seed);

        // game shouldn't be over yet
        assertEquals(false, game.isGameOver());

        // give player 1 all the Provinces
        for (int i = 0; i < 12; i++) {
            game.takeForTesting(0, Card.Province);
        }

        // all provinces are gone - game over
        assertEquals(true, game.isGameOver());
    }

    @Test
    public void testBaron() {
        ArrayList<Card> k = Game.standardCards();
        Game game = new Game(2, k, seed);
        game.setHandCardForTesting(0, 0, Card.Baron);
        game.playAction(0, false);
        // discarded Baron, gained Estate
        assertEquals(5, game.numHandCards());
        assertEquals(0, game.getCoins());

        game.setHandCardForTesting(0, 0, Card.Baron);
        game.setHandCardForTesting(0, 1, Card.Estate);
        game.playAction(0, true);
        // discarded Baron, discarded Estate
        assertEquals(3, game.numHandCards());
        assertEquals(4, game.getCoins());
    }
}
