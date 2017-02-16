package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by kia on 2/11/17.
 */
public class FeastTest {

    @Test
    public void feastTest() throws Exception {

        List<Card> cards;
        GameState state,testState;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Card feast = Card.getCard(cards,Card.CardName.Feast);
        int feastPrice = feast.getCost();

        Player player = new Player(state, "player-1");
        player.hand.add(feast);


        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);

        state.initializeGame();


        testState=(GameState) state.clone();

        HashMap<Player, Integer> winners=state.play();

        System.out.println("--------Player 1 Coins + Hands--------");

        System.out.println("Cards In Hand: " + state.players.get(0).hand.size() + " Expected: " + (testState.players.get(0).hand.size() + 1));

        int cardsInHand = state.players.get(0).hand.size();

        Card bought = state.players.get(0).hand.get(cardsInHand - 1);

        assertTrue(bought.getTreasureValue() <= 5);

    }
}
