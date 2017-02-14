/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dimc_dominion;

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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        instance.deck.add(new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3));
        Card expResult = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3);
        Card result = instance.drawCard();
        assertEquals(expResult, result);

    }

    /**
     * Test of initializePlayerTurn method, of class Player.
     */
    @Test
    public void testInitializePlayerTurn() {
      //  numActions = 1;
	//	      coins = 0;
	//	      numBuys = 1;
          //            vp=0;
        System.out.println("initializePlayerTurn");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        for(int i=0;i<5;i++){
            instance.deck.add(new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3));
        }
        instance.initializePlayerTurn();
        int numAExpected=1;
        int coinsExpected=0;
        int numBuysExpected=1;
        int vpExpected=0;
        assertEquals(numAExpected,instance.numActions);
        assertEquals(coinsExpected,instance.coins);
        assertEquals(numBuysExpected,instance.numBuys);
        assertEquals(vpExpected,instance.vp);
       
    }

    /**
     * Test of gain method, of class Player.
     */
    @Test
    public void testGain() {
        System.out.println("gain");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        
        Card card = new Card(Card.CardName.Province,Card.Type.VICTORY, 	8, 6, 0);
        boolean expResult = true;
        boolean result = instance.gain(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of discard method, of class Player.
     */
    @Test
    public void testDiscard() {
        System.out.println("discard");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        Card card = new Card(Card.CardName.Curse,Card.Type.VICTORY,0, -1, 0);
        instance.hand.add(card);
        instance.discard(card);
        int expected = 1;
        assertEquals(expected,instance.hand.size());
      
    }

   

    /**
     * Test of scoreFor method, of class Player.
     */
    @Test
    public void testScoreFor() {
        System.out.println("scoreFor");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        Card card = new Card(Card.CardName.Curse,Card.Type.VICTORY,0, -1, 0);
        instance.hand.add(card);
        
        int expResult = -1;
        int result = instance.scoreFor();
        assertEquals(expResult, result);
    
    }

  

    

    /**
     * Test of endTurn method, of class Player.
     */
    @Test
    public void testEndTurn() {
        System.out.println("endTurn");
        GameState state= new GameState(null);
        Player instance = new Player(state,"p1");
        Card card = new Card(Card.CardName.Curse,Card.Type.VICTORY,0, -1, 0);
        instance.hand.add(card);
       
        instance.endTurn();
        int expected = 0;
        assertEquals(expected,instance.hand.size());
    }

   

  
    
}
