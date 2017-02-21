package test;

import dominion.Player;
import dominion.GameState;
import dominion.Card;
import dominion.Card.Type;
import dominion.Card.CardName;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


//Created by Arman Hastings on 2/13/2017.

public class GameStateTest
{
    private GameState gameState;


    @Before
    public void initGameState()
    {
        gameState = new GameState(Card.createCards());
        gameState.addPlayer(new Player(gameState, "Arnold"));
        gameState.addPlayer(new Player(gameState, "Bill"));
        gameState.addPlayer(new Player(gameState, "Catherine"));
        gameState.initializeGame();
    }


    @Test
    public void playTest()
    {
        HashMap<Player, Integer> map = gameState.play();
        for (Integer i : map.values())
        {
            assertEquals(new Integer(9), i);
        }
    }


    @Test
    public void isGameOver()
    {
        assertFalse(gameState.isGameOver());
    }


    @Test
    public void getWinnersTest()
    {
        HashMap<Player, Integer> map = gameState.getWinners();
        for (Integer i : map.values())
        {
            assertEquals(new Integer(9), i);
        }
    }

}
