/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dominion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brennan
 */
public class playerTest {
    
    public playerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
  

    /**
     * Test of startRound method, of class player.
     */
    @org.junit.Test
    public void testStartRound() {
        System.out.println("startRound");
        player instance = new player();
        instance.startRound();
        instance.findDeckSizes();
        assertEquals(instance.handsize, 5);
        assertEquals(instance.decksize, 5);
        assertEquals(instance.discardsize, 0);
    }

    /**
     * Test of getSizeJr method, of class player.
     */
    @org.junit.Test
    public void testGetSizeJr() {
        System.out.println("getSizeJr");
        int xSize = 0;
        card[] pile = null;
        player instance = new player();
        int expResult = 0;
        int result = instance.getSizeJr(xSize, pile);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of findDeckSizes method, of class player.
     */
    @org.junit.Test
    public void testFindDeckSizes() {
        System.out.println("findDeckSizes");
        player instance = new player();
        instance.startRound();
        instance.findDeckSizes();
        assertEquals(instance.handsize, 5);
        
        
    }

    /**
     * Test of moveCard method, of class player.
     */
    @org.junit.Test
    public void testMoveCard() {
        System.out.println("moveCard");
        player instance = new player();
        instance.startRound();
        instance.moveCard(instance.hand, instance.discard, 1, instance.discardsize);
        //card is copper or estate
        assertTrue(instance.discard[0].num == 1 || instance.discard[0].num == 5);
    }

    /**
     * Test of inpVal method, of class player.
     */
    @org.junit.Test
    public void testInpVal() {
        System.out.println("inpVal");
        player instance = new player();
        int expResult = 1;
        int result = instance.inpVal();
        System.out.println("Enter 1");
        assertEquals(expResult, result);
      
    }

    /**
     * Test of display method, of class player.
     */
    @org.junit.Test
    public void testDisplay() {
        System.out.println("display");
        player instance = new player();
        instance.display();
       
    }

    /**
     * Test of activateCard method, of class player.
     */
    @org.junit.Test
    public void testActivateCard() {
        player instance = new player();
        System.out.println("activateCard");
        card cardchosen = new card();
        card.assignCard(15, cardchosen);
        instance.coinbonus = 0;
        //will activate as Market, adds one to coinbonus
        instance.activateCard(cardchosen);
        assertEquals(instance.coinbonus, 1);
    }

    /**
     * Test of buyCard method, of class player.
     */
    @org.junit.Test
    public void testBuyCard() {
        System.out.println("buyCard");
        player instance = new player();
        instance.startRound();
        instance.buyCard(instance.copperpile, instance.coppersize, instance.discardsize);
        //is the card we bought placed into the discard pile, and is it copper?
        assertEquals(instance.discard[0].num, 1);
    }

    /**
     * Test of playRound method, of class player.
     */
    @org.junit.Test
    public void testPlayRound() {
        System.out.println("playRound");
        player instance = new player();
        instance.playRound();
       
    }

    /**
     * Test of compRound method, of class player.
     */
    @org.junit.Test
    public void testCompRound() {
        System.out.println("compRound");
        player instance = new player();
        instance.compRound();
       
    }
    
}
