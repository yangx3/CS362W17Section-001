package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kia on 2/11/17.
 */
public class CouncilRoomTest {

    @Test
    public void CouncilRoomTest() throws Exception {

        List<Card> cards;
        GameState state,testState;

        int newCards = 4;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "player-1");
        player.hand.add(Card.getCard(cards,Card.CardName.Council_Room));

        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);

        state.initializeGame();


        testState=(GameState) state.clone();

        HashMap<Player, Integer> winners=state.play();

        System.out.println("--------Player 1 Status--------");

        System.out.println("Cards In Hand: " + state.players.get(0).hand.size() + " Expected: " + (testState.players.get(0).hand.size() + newCards + 1));

        System.out.println("--------Player 2 Draws A Card--------");

        System.out.println("Cards In Hand: " + state.players.get(1).hand.size() + " Expected: " + (testState.players.get(1).hand.size() + 1));

        assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() + newCards + 1));
        assertEquals(state.players.get(1).hand.size(), (testState.players.get(1).hand.size() + 1));
    }
}
