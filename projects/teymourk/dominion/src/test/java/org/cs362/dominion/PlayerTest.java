package org.cs362.dominion;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kia on 2/13/17.
 */
public class PlayerTest {

    private Player player1;
    private Player player2;
    private List<Card> cards;
    private GameState state;

    @Before
    public void initGame() throws CloneNotSupportedException {

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        player1 = new Player(state, "player-1");
        state.addPlayer(player1);

        player2 = new Player(state, "player-2");
        state.addPlayer(player2);

        state.initializeGame();
    }

    @Test
    public void drawCard() {

        System.out.print("Player Initial Hand: " + player1.hand);

        assertEquals(player1.hand.size(), 5);

        player1.drawCard();

        System.out.print("Actual: " + player1.hand.size() + " Expected: " + 6);

        System.out.print("Player UPDATED Hand: " + player1.hand);

        assertEquals(player1.hand.size(), 6);
    }

    @Test
    public void discard() throws Exception {

        System.out.println("Actual Hand: " + player1.hand.size() + " Expected: " + 5);
        System.out.println("Actual Dicard: " + player1.discard.size() + " Expected: " + 0);

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.discard.size(), 0);

        player1.discard(Card.getCard(cards, Card.CardName.Cooper));

        System.out.println("Actual Hand: " + player1.hand.size() + " Expected: " + 4);
        System.out.println("Actual Dicard: " + player1.discard.size() + " Expected: " + 1);

        assertEquals(player1.hand.size(), 4);
        assertEquals(player1.discard.size(), 1);
    }

    @Test
    public void gain() throws Exception {

        System.out.println("Player Discard Hand: " + player1.discard);

        assertEquals(player1.discard.size(), 0);

        player1.gain(Card.getCard(cards, Card.CardName.Ambassador));

        System.out.println("Actual: " + player1.discard.size() + " Expected: " + 1);

        System.out.println("Player UPDATED Hand: " + player1.discard);

        assertEquals(player1.discard.size(), 1);
    }

    @Test
    public void kingDomCard() {

        System.out.println("Player Hand: " + player1.hand);

        assertEquals(player1.hand.size(), 5);

        player1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
        player1.playKingdomCard();

        System.out.println("Actual: " + player1.hand.size() + " Expected: " + 9);

        System.out.println("Player UPDATED Hand: " + player1.hand);

        assertEquals(player1.hand.size(), 9);
    }

    @Test
    public void buyCards() {

        player1.coins = 10;
        System.out.println("Player Hand: " + player1.hand);
        System.out.println("Player Coins: " + player1.coins);

        assertEquals(player1.hand.size(), 5);

        //Get Card
        Card bought = player1.hand.get(player1.hand.size() - 1);

        player1.buyCard(state.gameBoard);

        System.out.println("Actual: " + player1.hand.size() + " Expected: " + 6);
        System.out.println("Actual Coins: " + player1.coins + " Expected: " + (player1.coins - bought.getTreasureValue()));

        System.out.println("Player UPDATED Hand: " + player1.hand);

        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.coins, (player1.coins - bought.getTreasureValue()));
    }

    @Test
    public void EndTurns() {

        System.out.println("BEFORE ENDING PLAYER TURN");

        System.out.println("Player Hand: " + player1.hand.size());
        System.out.println("Player Discard: " + player1.hand.size());
        System.out.println("Player Deck: " + player1.hand.size());

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.deck.size(), 5);

        player1.endTurn();

        System.out.println("AFTER ENDING PLAYER TURN");

        System.out.println("Player Hand: " + player1.hand.size());
        System.out.println("Player Discard: " + player1.hand.size());
        System.out.println("Player Deck: " + player1.hand.size());

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.discard.size(), 5);
        assertEquals(player1.deck.size(), 0);
    }
}
