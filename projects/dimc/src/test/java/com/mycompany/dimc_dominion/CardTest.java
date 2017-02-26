/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dimc_dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
     * Test of getType method, of class Card.
     */
    @org.junit.Test
    public void testCopperGetType() {
        System.out.println("getType");
        Card instance = new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1);
        Card.Type expResult = Card.Type.TREASURE;
        Card.Type result = instance.getType();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCardName method, of class Card.
     */
    @org.junit.Test
    public void testEstateGetCardName() {
        System.out.println("getCardName");
        Card instance = new Card(Card.CardName.Estate,Card.Type.VICTORY,2, 3, 0);
        Card.CardName expResult = Card.CardName.Estate;
        Card.CardName result = instance.getCardName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCost method, of class Card.
     */
    @org.junit.Test
    public void testAdventurerGetCost() {
        System.out.println("getCost");
        Card instance = new Card(Card.CardName.Adventurer,Card.Type.ACTION,6,0,0);
        int expResult = 6;
        int result = instance.getCost();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTreasureValue method, of class Card.
     */
    @org.junit.Test
    public void testBaronGetTreasureValue() {
        System.out.println("getTreasureValue");
        Card instance = new Card(Card.CardName.Baron,Card.Type.ACTION,4,0,0);
        int expResult = 0;
        int result = instance.getTreasureValue();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of score method, of class Card.
     */
    @org.junit.Test
    public void testScore() {
        System.out.println("score");
        Player player = null;
        Card instance = new Card(Card.CardName.CutPurse,Card.Type.ACTION,4,0,0);
        int expResult = 0;
        int result = instance.score(player);
        assertEquals(expResult, result);

    }

    /**
     * Test of createCards method, of class Card.
     */
    @org.junit.Test
    public void testCreateCards() {
        System.out.println("createCards");
        
        List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(Card.CardName.Silver, Card.Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(Card.CardName.Province,Card.Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(Card.CardName.Duchy,Card.Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(Card.CardName.Estate,Card.Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(Card.CardName.Curse,Card.Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(Card.CardName.Adventurer,Card.Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(Card.CardName.Smithy,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Village,Card.Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Ambassador,Card.Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Baron,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.CouncilRoom,Card.Type.ACTION,5,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.CutPurse,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Bazaar,Card.Type.ACTION,5,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.MoneyLender,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Gardens,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.GreatHall,Card.Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Market,Card.Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(Card.CardName.SeaHag,Card.Type.ACTION,4,0,0);
		ret.add(o);
  
        List<Card> expResult = ret;
        List<Card> result = Card.createCards();
        assertEquals(expResult, result);
    
    }


    /**
     * Test of getCard method, of class Card.
     */
    @org.junit.Test
    public void testGetCard() {
        System.out.println("getCard");
        List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(Card.CardName.Silver, Card.Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(Card.CardName.Province,Card.Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(Card.CardName.Duchy,Card.Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(Card.CardName.Estate,Card.Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(Card.CardName.Curse,Card.Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(Card.CardName.Adventurer,Card.Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(Card.CardName.Smithy,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Village,Card.Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Ambassador,Card.Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Baron,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.CouncilRoom,Card.Type.ACTION,5,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.CutPurse,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Bazaar,Card.Type.ACTION,5,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.MoneyLender,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Gardens,Card.Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.GreatHall,Card.Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(Card.CardName.Market,Card.Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(Card.CardName.SeaHag,Card.Type.ACTION,4,0,0);
		ret.add(o);
        List<Card> cards = ret;
        Card.CardName cardName = Card.CardName.Gardens;
        Card expResult = new Card(Card.CardName.Gardens,Card.Type.ACTION,4,0,0);;
        Card result = Card.getCard(cards, cardName);
        assertEquals(expResult, result);
    
    }
    
}
