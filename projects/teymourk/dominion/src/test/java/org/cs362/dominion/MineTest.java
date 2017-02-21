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
public class MineTest {

    @Test
    public void mineTest() throws Throwable {

        List<Card> cards;
        GameState state, testState;
        Randomness.reset(10);
        GameStateTest player_test;

        int trashCard = 1;
        int gainCard = 1;

        player_test = new GameStateTest();

        //the cards  are achieved by each element/constant in the enum class
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "Kiarash Teymoury");
        player.hand.add(Card.getCard(cards, Card.CardName.Mine));
        state.addPlayer(player);

        player = new Player(state, "Ryan Rodriguez");
        state.addPlayer(player);

        state.initializeGame();


        System.out.println("--------Player1 Status--------");

        System.out.println("Cards In Hand: " + state.players.get(0).hand.size());
        System.out.println("Actions: " + state.players.get(0).numActions);

        testState=(GameState) state.clone();

        HashMap<Player, Integer> winners=state.play();

        int boughtIndex =  state.players.get(0).hand.size() - 1;

        Card bought = state.players.get(0).hand.get(boughtIndex);

        System.out.println("--------Trash Treasure Card + Gain A Card--------");

        System.out.println("Cards In Hand: " + state.players.get(0).hand.size() + " Expected: " + (testState.players.get(0).hand.size() - trashCard + gainCard));

        assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() - trashCard + gainCard));
        assertTrue(bought.getTreasureValue() <= 3);
   }
}
