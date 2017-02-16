/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cs362.dominion;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */


public class CardTest {
    /**
     * Test of getType method, of class Card.
     */
    @Test
    public void testGetType() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@getType TEST@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Card instance = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3, 0);
        Card.Type expResult = Card.Type.TREASURE;
        Card.Type result = instance.getType();
        assertEquals(expResult, result);
        if( expResult != result) {
            fail("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!GET TYPE TEST FAILED!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        }
    }
    
    /**
     * Test of getCardName method, of class Card.
     */
    @Test
    public void testGetCardName() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@getCardName TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Card instance = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3, 0);
        Card.CardName expResult = Card.CardName.Gold;
        Card.CardName result = instance.getCardName();
        assertEquals(expResult, result);
        if(expResult != result) {
            fail("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!GET CARD NAME TEST FAILED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        }
    }
    
    /**
     * Test of getCost method, of class Card.
     */
    @Test
    public void testGetCost() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@getCost TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Card instance = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3, 0);
        int expResult = 6;
        int result = instance.getCost();
        assertEquals(expResult, result);
        if(expResult != result) {
            fail("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!GET COST TEST FAILED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        }
    }
    
        /**
     * Test of getTreasureValue method, of class Card.
     */
    @Test
    public void testGetTreasureValue() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@getTreasureValue TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Card instance = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3, 0);
        int expResult = 3;
        int result = instance.getTreasureValue();
        assertEquals(expResult, result);
        if(expResult != result) {
            fail("\n!!!!!!!!!!!!!!!!!!!!!!!!!!GET TREASURE VALUE TEST FAILED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        } 
    }
    
    /**
     * Test of play method, of class Card.
     */
    @Test
    public void testPlay() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@play SMITHY card TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Card instance = new Card(Card.CardName.Smithy, Card.Type.ACTION,4,0,0, 0);
        int temp1 = state.players.get(1).hand.size();
        int temp2 = state.players.get(1).deck.size();
        instance.play(player, state);
        assertEquals(state.players.get(1).hand.size(),(temp1 + 3 ));
        assertEquals(state.players.get(1).deck.size(),(temp2 - 3 ));
        if(state.players.get(1).hand.size() != temp1 + 3 || state.players.get(1).deck.size() != temp2 - 3) {
            fail("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!PLAYT SMITHY TEST FAILED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        }
    }
    
}
