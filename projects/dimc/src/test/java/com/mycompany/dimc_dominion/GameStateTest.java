/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dimc_dominion;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author San Dim
 */
public class GameStateTest {
    
    public GameStateTest() {
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
     * Test of addPlayer method, of class GameState.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        
        state.addPlayer(instance);
        int expected=1;
        assertEquals(expected,state.players.size());
    }


    
}
