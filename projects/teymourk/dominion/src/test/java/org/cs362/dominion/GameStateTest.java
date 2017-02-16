package org.cs362.dominion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kia on 2/11/17.
 */
public class GameStateTest {
    @Test
    public void addPlayer() throws Exception {

        GameState state;

        state = new GameState(null);

        Player player = new Player(state, "Kiarash Teymoury");
        state.addPlayer(player);

        player = new Player(state, "Ryan Rodriguez");
        state.addPlayer(player);

        System.out.println("-------Player-------");
        System.out.println("Actual: " + state.players.size() + " Expected : " + 2);

        assertEquals(state.players.size(), 2);
    }
}
