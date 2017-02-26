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
public class PlayerTest {
    /**
     * Test of checkCardType method, of class Player.
     */
    @Test
    public void testCheckCardType() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        System.out.println("\n#########################CheckCardType TEST####################\n");
        
        Card input = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3, 0);
        Card expResult = new Card(Card.CardName.Gold, Card.Type.TREASURE, 6, 0, 3, 0);
        Card result = instance.checkCardType(input);
        assert(result.getType() == expResult.getType());
        if (expResult.getType() != result.getType()) 
            fail("\n************* CHECK CARD TYPE TEST FAILED ********************\n");
    }
    
    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        System.out.println("\n################DrawCard TEST ###########\n");
        int expResult = instance.hand.size() + 1;
        instance.drawCard();
        int result = instance.hand.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) 
            fail("\n************* DRAW CARD TEST FAILED ********************\n");
    }

    /**
     * Test of playTtreasureCard method, of class Player.
     */
    @Test
    public void testPlayTtreasureCard() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        System.out.println("\n#############################playTtreasureCard TEST########################\n");
        instance.playTtreasureCard();
        int numCoins = 0;
        int result = instance.coins;
        assert(numCoins < result);
        if(!(numCoins < result))  
            fail("\n************* PLAY TREASURE CARD TEST FAILED ********************\n");
    }
    
    /**
     * Test of buyCard method, of class Player.
     */
    @Test
    public void testBuyCard() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        System.out.println("\n################################buyCard TEST#################################\n");
        int playerDiscardSize = instance.discard.size();
        instance.buyCard(state);
        int result = instance.discard.size();
        assert(playerDiscardSize + 1 == result);
        if(playerDiscardSize + 1 != result)
            fail("\n***************************** TEST BUY CARD FAILED *************************************\n");
        else {
            System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$ BUY CARD SUCCESS $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        }
    }
    
    /**
     * Test of scoreFor method, of class Player.
     */
    @Test
    public void testScoreFor() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        System.out.println("\n##################################scoreFor TEST###################################\n");
        int expResult = 0;
        //score from hand
           for (Card c : instance.hand)
               expResult += c.score();
           //score from discard
           for (Card c : instance.discard)
               expResult += c.score();
           //score from deck
           for (Card c : instance.deck)
               expResult += c.score();
        int result = instance.scoreFor();
        assertEquals(expResult, result);
        if (expResult != result) {
            fail("\n********************** TEST SCOREFOR FAILED*******************\n");
        }  
    }
}
