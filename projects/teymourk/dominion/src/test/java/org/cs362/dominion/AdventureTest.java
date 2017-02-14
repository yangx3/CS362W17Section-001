package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kia on 2/13/17.
 */
public class AdventureTest {

    @Test
    public void adventure() throws Exception {

        int treasureReavead = 2;

        List<Card> cards;
        GameState state, testState;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "player-1");
        player.hand.add(Card.getCard(cards, Card.CardName.Adventurer));

        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);

        state.initializeGame();

        System.out.println(" --------Player 1 Status--------");
        System.out.println("|                               ");
        System.out.println("|Cards In Hand: " + (state.players.get(0).hand.size()));
        System.out.println("|Cards In Discard: " + state.players.get(0).discard.size());
        System.out.println("|Coins: " + state.players.get(0).coins);

        testState = (GameState) state.clone();

        HashMap<Player, Integer> winners = state.play();

        int handSize = testState.players.get(0).hand.size();

        System.out.println("-------Player 1 HAND-------");
        System.out.println("Actual: " + state.players.get(0).hand.size() + " Expected : " + (handSize -= handSize - treasureReavead));

        System.out.println("-------Player 1 UPDATED HAND-------");
        System.out.println("Actual: " + state.players.get(0).hand);

        assertEquals(state.players.get(0).hand.size(), (handSize -= handSize - treasureReavead));
    }
}
