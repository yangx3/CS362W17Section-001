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
        assertEquals(0, game.getPhase());

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

        int pos = game.takeForTesting(0, Card.Baron);
        game.playAction(pos, false);
        // gained Baron, discarded Baron, gained Estate
        assertEquals(6, game.numHandCards());
        assertEquals(0, game.getCoins());

        game.takeForTesting(0, Card.Estate);
        pos = game.takeForTesting(0, Card.Baron);
        game.playAction(pos, true);
        // gained Baron, gained Estate, discarded Baron, discarded Estate
        assertEquals(6, game.numHandCards());
        assertEquals(4, game.getCoins());
    }

    @Test
    public void testCouncilRoom() {
        Game game = newGame(Card.CouncilRoom);

        int pos = game.takeForTesting(0, Card.CouncilRoom);
        game.playAction(pos);
        assertEquals(9, game.numHandCards()); // +4 cards
        assertEquals(2, game.getBuys()); // +1 buy
        // and each other player draws a card
    }

    @Test
    public void testCutpurse() {
        Game game = newGame(Card.Cutpurse);
        int pos = game.takeForTesting(0, Card.Cutpurse);
        int copper = game.handCount(1, Card.Copper);
        game.playAction(pos);
        if (copper > 0) {
            copper--;
        }
        assertEquals(copper, game.handCount(1, Card.Copper));
        assertEquals(2, game.getCoins());
    }

    @Test
    public void testEmbargo() {
        Game game = newGame(Card.Embargo);
        int pos = game.takeForTesting(0, Card.Embargo);
        game.playAction(pos, Card.Estate);
        assertEquals(2, game.getCoins()); // +2 coins
        assertEquals(0, game.fullDeckCount(0, Card.Embargo)); // trashed
        
        // buying the embargoed card gives a curse
        game.buyCard(Card.Estate);
        assertEquals(1, game.fullDeckCount(0, Card.Curse));
        assertEquals(5, game.numHandCards()); // curse and estate in discard
        game.endTurn();

        // buying an unembargoed card gives no curses
        game.buyCard(Card.Copper);
        assertEquals(0, game.fullDeckCount(1, Card.Curse));
    }

    @Test
    public void testFeast() {
        Game game = newGame(Card.Feast);
        int pos = game.takeForTesting(0, Card.Feast);
        try {
            game.playAction(pos, Card.Gold);
            fail("expected GameError");
        } catch (GameError e) {
        }

        game = newGame(Card.Feast);
        pos = game.takeForTesting(0, Card.Feast);
        game.playAction(pos, Card.Duchy);
        assertEquals(1, game.fullDeckCount(0, Card.Duchy));
        assertEquals(0, game.fullDeckCount(0, Card.Feast)); // trashed
        assertEquals(5, game.numHandCards()); // duchy in discard
    }

    @Test
    public void testGreatHall() {
        Game game = newGame(Card.GreatHall);
        int pos = game.takeForTesting(0, Card.GreatHall);
        game.playAction(pos);
        assertEquals(6, game.numHandCards()); // +1 cards
        assertEquals(1, game.getActions()); // +1 actions
        game.endTurn();
        assertEquals(4, game.scoreFor(0)); // worth 1 VP
    }

    @Test
    public void testMarket() {
        Game game = newGame(Card.Market);
        int pos = game.takeForTesting(0, Card.Market);
        game.playAction(pos);
        assertEquals(6, game.numHandCards()); // +1 cards
        assertEquals(1, game.getActions()); // +1 actions
        assertEquals(2, game.getBuys()); // +1 buys
        assertEquals(1, game.getCoins()); // +1 coins
    }

    @Test
    public void testSmithy() {
        Game game = newGame(Card.Smithy);
        int pos = game.takeForTesting(0, Card.Smithy);
        game.playAction(pos);
        assertEquals(8, game.numHandCards()); // +3 cards
    }

    @Test
    public void testVillage() {
        Game game = newGame(Card.Village);
        int pos = game.takeForTesting(0, Card.Village);
        game.playAction(pos);
        assertEquals(6, game.numHandCards()); // +1 cards
        assertEquals(2, game.getActions()); // +2 actions
    }

    @Test
    public void testTreasure() {
        Game game = newGame();
        int pos = game.takeForTesting(0, Card.Copper);
        game.takeForTesting(0, Card.Silver);
        game.takeForTesting(0, Card.Gold);
        game.playTreasure(pos);
        game.playTreasure(pos);
        game.playTreasure(pos);
        assertEquals(6, game.getCoins());
        assertEquals(1, game.getPhase());
    }

    @Test
    public void testPhase() {
        Game game = newGame(Card.Smithy);
        int pos = game.takeForTesting(0, Card.Copper);
        game.playTreasure(0);

        pos = game.takeForTesting(0, Card.Smithy);
        try {
            game.playAction(pos);
            fail("expected GameError");
        } catch (GameError err) {
            assertEquals(err.getMessage(), "can only play actions during the action phase");
        }
    }

    @Test
    public void testFullDeckCount() {
        Game game = newGame();
        game.endTurn();
        assertEquals(7, game.fullDeckCount(0, Card.Copper));
        assertEquals(3, game.fullDeckCount(0, Card.Estate));
        assertEquals(0, game.fullDeckCount(1, Card.Province));

        assertEquals(7, game.fullDeckCount(1, Card.Copper));
        assertEquals(3, game.fullDeckCount(1, Card.Estate));
        assertEquals(0, game.fullDeckCount(1, Card.Province));
    }
}
