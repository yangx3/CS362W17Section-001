package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kia on 2/13/17.
 */
public class AmbassadorTest {

    @Test
    public void AmbassadorTest() throws Exception {

        List<Card> cards;
        GameState state,testState;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "player-1");
        player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));

        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);

        Card revealed = state.players.get(0).hand.get(0);

        state.initializeGame();

        System.out.println(" --------Initial Card Revealed Card Value--------");
        System.out.println(revealed.getCardName() + " : " + state.gameBoard.get(revealed));

        testState=(GameState) state.clone();

        HashMap<Player, Integer> winners=state.play();

        System.out.println(" --------Player 1 Hand--------");

        System.out.println(state.players.get(0).hand);

        System.out.println(" --------Reveal Card And Remove--------");

        System.out.println("Cards In Hand: " + state.players.get(0).hand.size() + " Expected: " + (testState.players.get(0).hand.size() - 1));

        assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() - 1));

        System.out.println(" --------Add 2 Copies to Supply--------");

        System.out.println(revealed.getCardName() + " : " + (state.gameBoard.get(revealed) + 2));
        assertEquals(state.gameBoard.get(revealed), state.gameBoard.get(revealed));

        System.out.println(" --------Give A Copy To Another Player--------");

        System.out.println("Cards In Hand: " + state.players.get(1).hand.size() + " Expected: " + (testState.players.get(1).hand.size() + 1));

        System.out.println(state.players.get(1).hand);

        assertEquals(state.players.get(1).hand.size(), (testState.players.get(1).hand.size() + 1));
    }
}
