/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominion;

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
public class DomTest {
    
    public DomTest() {
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
     * Test of main method, of class Dominion.
     */


    @Test
    public void test_1p()
    {
        System.out.println("1 PLAYERS");
        String[] args = {"1", "10", "3"};
        assertEquals(Dominion.dominion_run(args), "Player0");
    }
    
    @Test
    public void test_2p()
    {
        System.out.println("2 PLAYERS");
        String[] args = {"2", "10", "1238161763"};
        assertEquals(Dominion.dominion_run(args), "Player0");
    }

    @Test
    public void test_3p()
    {
        System.out.println("3 PLAYERS");
        String[] args = {"3", "10", "3"};
        assertEquals(Dominion.dominion_run(args), "Player2");
    }

    @Test
    public void test_4p()
    {
        System.out.println("4 PLAYERS");
        String[] args = {"4", "10", "3"};
        assertEquals(Dominion.dominion_run(args), "Player3");
    }

    @Test
    public void test_5p()
    {
        System.out.println("5 PLAYERS");
        String[] args = {"5", "10", "3"};
        assertEquals(Dominion.dominion_run(args), "Player4");
    }

    @Test
    public void test_10p()
    {
        System.out.println("10 PLAYERS");
        String[] args = {"10", "10", "1244321"};
        assertEquals(Dominion.dominion_run(args), "Player8");
    }

    @Test
    public void test_50p()
    {
        System.out.println("4 PLAYERS");
        String[] args = {"50", "10", "69696"};
        assertEquals(Dominion.dominion_run(args), "Player30");
    }

    @Test
    public void test_tie1()
    {
        System.out.println("TEST tie 4 players 0 kc");
        String[] args = {"4", "0", "1441318518"};
        assertEquals(Dominion.dominion_run(args), "No_winner");
    }

    @Test
    public void test_tie2()
    {
        System.out.println("TEST tie 2 players 10 kc");
        String[] args = {"2", "10", "-1004384591"};
        assertEquals(Dominion.dominion_run(args), "No_winner");
    }

    @Test
    public void test_tie10()
    {
        System.out.println("TEST tie 10 players 10 kc");
        String[] args = {"10", "10", "-452988757"};
        assertEquals(Dominion.dominion_run(args), "No_winner");
    }

    @Test
    public void test_tie3()
    {
        System.out.println("TEST tie 5 players 10 kc");
        String[] args = {"5", "10", "1271032198"};
        assertEquals(Dominion.dominion_run(args), "No_winner");
    }

    @Test
    public void test_1p_no_kc()
    {
        System.out.println("1 PLAYERS NO KC");
        String[] args = {"1", "0", "3"};
        assertEquals(Dominion.dominion_run(args), "Player0");
    }


    @Test
    public void test_5p_no_kc()
    {
        System.out.println("5 PLAYERS NO KC");
        String[] args = {"5", "0", "3"};
        assertEquals(Dominion.dominion_run(args), "Player3");
    }

    @Test
    public void test_5p_7_kc()
    {
        System.out.println("5 PLAYERS 7 KC");
        String[] args = {"5", "7", "2010189702"};
        assertEquals(Dominion.dominion_run(args), "Player1");
    }

        @Test
    public void test_general_play()
    {
        System.out.println("Make Sure General Play Has a winner");
        String[] args = {"2", "10"};
        assertNotNull(Dominion.dominion_run(args));
    }

    @Test
    public void test_general_play0()
    {
        System.out.println("Make Sure General Play Has a winner");
        String[] args = {};
        assertNotNull(Dominion.dominion_run(args));
    }

}
