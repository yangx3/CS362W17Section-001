/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominion;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kin-Ho Lam
 */
public class AdventureTest {
    
    public AdventureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class Adventure.
     */
    public void give_cards(Player p, Adventure c)
    {
        
    }
    
    @Test
    public void testPlay() {
        System.out.println("play");
        Game game = new Game(); //create game object
	game.initilize_game(2,10); //int players, int number of kingdom cards
        Random rand = ThreadLocalRandom.current();
       
        for(int i = 6; i < 16; i++)
        {
            System.out.println("Here");

            game.player[0].hand = game.player[0].append(game.player[0].hand, new Adventure(i));
          //  give_cards(game.player[0], new Card(i));
        }
        game.player[0].debug_print();
        for(int i = 0; i < 10; i++)
        {
            game.player[0].action_turns = 1;

                int play_c = game.randInt(rand, 0);
                game.player_play(0, play_c, rand, game); //(int t, int hand, Random rand, Game g)
           
        }
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
