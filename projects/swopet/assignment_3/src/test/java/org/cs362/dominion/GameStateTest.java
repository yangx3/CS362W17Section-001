package org.cs362.dominion;
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class GameStateTest {
    @Test
    public void testConstructor(){
        int numPlayers = 2;
        GameState game = new GameState(2,10);
        assertEquals(2,game.numPlayers);
        assertEquals(10,game.kingdomCards.size());
        for (int i = 0; i < 10; i++){
            if (game.kingdomCards.get(i).get(0).isVictory() == true){
                assertEquals(8,game.kingdomCards.get(i).size());
            }
            else{
                assertEquals(10,game.kingdomCards.get(i).size());
            }
        }
        assertEquals(3,game.treasureCards.size());
        assertEquals(4,game.victoryCards.size());
        assertEquals(8,game.victoryCards.get(0).size());
        GameState game2 = new GameState(4,10);
        assertEquals(12,game2.victoryCards.get(0).size());
        assertEquals(30,game2.treasureCards.get(0).size());
        assertEquals(40,game2.treasureCards.get(1).size());
        assertEquals(32,game2.treasureCards.get(2).size());
    }
    
    @Test
    public void testTurn(){
        GameState game = new GameState(2,10);
        int whoseTurn = game.whoseTurn;
        assertEquals(false,game.turn());
        assertEquals(2,game.turnNumber);
        assertEquals((whoseTurn + 1)%game.numPlayers,game.whoseTurn);
    }
    
    @Test
    public void testGameOver(){
        GameState game1 = new GameState(2,10);
        while (!GameState.emptyPile(game1.victoryCards.get(0))){
            game1.victoryCards.get(0).remove(0);
        }
        assertEquals(true,GameState.emptyPile(game1.victoryCards.get(0)));
        assertEquals(true,game1.turn());
        
        GameState game2 = new GameState(2,10);
        for (int i = 0; i < 3; i++){
            while (!GameState.emptyPile(game2.kingdomCards.get(i))){
                game2.kingdomCards.get(i).remove(0);
            }
            assertEquals(true,GameState.emptyPile(game2.kingdomCards.get(i)));
        }
        assertEquals(true,game2.turn());
        
        GameState game3 = new GameState(2,10);
        for (int i = 0; i < 3; i++){
            while (!GameState.emptyPile(game3.victoryCards.get(i))){
                game3.victoryCards.get(i).remove(0);
            }
            assertEquals(true,GameState.emptyPile(game3.victoryCards.get(i)));
        }
        assertEquals(true,game3.turn());
    }
    
    @Test
    public void testPlayDom(){ //to give coverage to PlayDom
        PlayDom.main(new String[]{"2"});
    }
    
    @Test
    public void testWinner(){
        GameState game = new GameState(2,10);
        game.players[0].deck.add(new Province());
        game.players[0].numCards++;
        int [] winnerData = game.getWinner();
        assertEquals(0,winnerData[0]); //player ID
        assertEquals(9,winnerData[1]); //score
        assertEquals(0,winnerData[2]); //turns taken
    }
}