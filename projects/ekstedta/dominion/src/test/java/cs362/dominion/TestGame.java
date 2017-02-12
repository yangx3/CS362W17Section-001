package cs362.dominion;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGame {
    static final int seed = 1;

    private static Game newGame() {
        ArrayList<Card> k = Game.standardCards();
        return new Game(2, k, seed);
    }

    private static Game newGame(Card kingdomCard) {
        ArrayList<Card> k = Game.standardCards();
        if (!k.contains(kingdomCard)) {
            k.set(0, kingdomCard);
        }
        return new Game(2, k, seed);
    }

    @Test
    public void testInit() {
        Game game = newGame();

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
        Game game = newGame();

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
    public void testEndTurn() {
        Game game = newGame();

        // game starts with player 0
        assertEquals(0, game.getCurrentPlayer());

        // ending a turn moves to the next player
        game.endTurn();
        assertEquals(1, game.getCurrentPlayer());

        // ending the last player's turn wraps around to the start
        game.endTurn();
        assertEquals(0, game.getCurrentPlayer());
    }

    @Test
    public void testBaron() {
        Game game = newGame(Card.Baron);

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

    @Test
    public void testCouncilRoom() {
        Game game = newGame(Card.CouncilRoom);

        game.setHandCardForTesting(0, 0, Card.CouncilRoom);
        game.playAction(0);
        assertEquals(8, game.numHandCards()); // +4 cards
        assertEquals(2, game.getBuys()); // +1 buy
        // and each other player draws a card
    }

    @Test
    public void testCutpurse() {
        Game game = newGame(Card.Cutpurse);
        game.setHandCardForTesting(0, 0, Card.Cutpurse);
        int copper = game.handCount(1, Card.Copper);
        game.playAction(0);
        if (copper > 0) {
            copper--;
        }
        assertEquals(copper, game.handCount(1, Card.Copper));
        assertEquals(2, game.getCoins());
    }
}
