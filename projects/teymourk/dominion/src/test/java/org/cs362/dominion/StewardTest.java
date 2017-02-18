package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kia on 2/12/17.
 */
public class StewardTest {

    @Test
    public void stewardTest() throws Exception {

        List<Card> cards;
        GameState state,testState;
        Randomness.reset(10);

        int newCards = 2;
        int extraCoins = 2;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "player-1");

        Card steward = Card.getCard(cards,Card.CardName.Steward);

        player.hand.add(steward);

        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);

        state.initializeGame();

        System.out.println("hand count = " + state.players.get(0).hand.size());
        System.out.println("hand deck = " + state.players.get(0).deck.size());
        System.out.println("hand coins = " + state.players.get(0).coins);

        testState=(GameState) state.clone();

        HashMap<Player, Integer> winners=state.play();

        if(state.players.get(0).decision) {

            System.out.println("--------Player Decided To Add 2 Cards--------" );
            System.out.println("Hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards ));
            System.out.println("Discard count = " + state.players.get(0).deck.size() + ", expected = "+ (testState.players.get(0).deck.size() - newCards));

            assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() + newCards));
            assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards));

        } else {

            System.out.println("--------Player Decided To Get 2 Coins--------");

            System.out.println("Coins = " + state.players.get(0).coins + ", expected = " + (testState.players.get(0).coins + extraCoins));

            assertEquals(state.players.get(0).coins,( testState.players.get(0).coins + extraCoins));

        }
    }
}
