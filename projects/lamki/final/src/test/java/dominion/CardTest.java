/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominion;

import java.util.Random;
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
public class CardTest {
    
    public CardTest() {
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
     * Test of print method, of class Card.
     */
    @Test
    public void testPrint() {
        System.out.println("Test print");
        for(int i  = 0; i < 17; i++)
        {
            Card instance = new Card(i);
            assertNotNull(instance);
            instance.print();
        }
    }

    /**
     * Test of play method, of class Card.
     */
    @Test
    public void testPlay() {
        System.out.println("Test play");
        int card = 0;
        Random rand = null;
        int hand = 0;
        Player p = null;
        Game g = null;
        for(int i = 0; i < 17; i++)
        {
	        Card instance = new Card(i);
	        assertNotNull(instance);
        }
    }

}
