package org.cs362.dominion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by kia on 2/11/17.
 */
public class VillageTest {

    @Test
    public void villageTest() throws  Throwable{

        List<Card> cards;
        GameState state,testState;
        Randomness.reset(10);

        int newActions = 2;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "Kiarash Teymoury");
        player.hand.add(Card.getCard(cards, Card.CardName.Village));
        state.addPlayer(player);

        player = new Player(state, "Ryan");
        state.addPlayer(player);

        state.initializeGame();

        //copy or clone the game state to a test case
        testState=(GameState) state.clone();

        //	play the game
        HashMap<Player, Integer> winners=state.play();

        System.out.println("--------Add One Card--------");
        System.out.println("--------Add 2 Action--------");

        System.out.println("  *****    Player-1 Status ***** " );
        System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = " + (testState.players.get(0).hand.size() + 1));
        System.out.println("numActions = " + state.players.get(0).numActions + ", expected = " + (testState.players.get(0).numActions - 1 + newActions));

        assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() + 1));
        assertEquals(state.players.get(0).numActions,(testState.players.get(0).numActions - 1 + newActions));
    }
}
