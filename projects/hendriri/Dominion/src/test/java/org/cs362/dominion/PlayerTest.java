package org.cs362.dominion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * These tests cases have been implemented last, for that reason there are functions missing, that is because card
 * has already used them and it they had not worked as intended then most aspects of the card functionality in the
 * card tests would not have worked
 */

public class PlayerTest {


    private GameState state;
    private Player player1;
    private Player player2;
    private List<Card> cards;

    @Before
    public void initialize() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        state.initializeGame();
    }

    @Test
    public void drawCard() throws Exception {
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);

        player2.drawCard();

        assertEquals(player2.hand.size(), 6);
        assertEquals(player2.deck.size(), 4);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);
    }


    @Test
    public void gain() throws Exception {
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);

        player2.gain(Card.getCard(cards, Card.CardName.Silver));

        assertEquals(player2.discard.get(0).getCardName(), Card.CardName.Silver);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 1);
        assertEquals(player2.playedCards.size(), 0);
    }

    @Test
    public void discard() throws Exception {
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);

        player2.discard(Card.getCard(cards, Card.CardName.Cooper));

        assertEquals(player2.discard.get(0).getCardName(), Card.CardName.Cooper);
        assertEquals(player2.hand.size(), 4);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 1);
        assertEquals(player2.playedCards.size(), 0);
    }

    @Test
    public void playKingdomCard() throws Exception {
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);

        //this is already tested in cards thoroughly so check that for ones that are not the default
        player2.playKingdomCard();

        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);
    }


    @Test
    //Tests for gardens is in the cards tests please check that.
    public void scoreFor() throws Exception {
        assertEquals(9, player1.scoreFor());
    }


}
