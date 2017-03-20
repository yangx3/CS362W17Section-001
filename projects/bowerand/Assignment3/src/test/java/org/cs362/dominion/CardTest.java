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
import java.util.Random;

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
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);      
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
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
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
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
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
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
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
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
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
    
    /**
     * Test Card Adventurer
     */
    @Test
    public void testAdventurer() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playAdventerur TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        player.hand.add(Card.getCard(cards, Card.CardName.Adventurer));
        assertEquals(player.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getType(), Card.Type.ACTION);
        if(player.hand.size() != 6) {
            fail("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!PLAY ADVENTERUR TEST FAILED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        }
        
    }
    
    /**
     * Test Card Ambassador
     */
    @Test
    public void testAmbassador() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playAmbassador TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Ambassador));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION);
    }
    
    /**
     * Test Card Baron
     */
    @Test
    public void testBaron() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playBaron TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Baron));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);
        int numBuys = p1.numBuys;
        int numCoins = p1.coins;
        int curHandSize = p1.hand.size();
        p1.playKingdomCard();
        if(numBuys+1 != p1.numBuys)
            fail("\n BARON DID NOT INCREASE NUMBER OF BUYS \n");
    }
    
    /**
     * Test Card Baron
     */
    @Test
    public void testCurse() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playCurse TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        p1.hand.add(Card.getCard(cards, Card.CardName.Curse));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Curse).getType(), Card.Type.VICTORY);
    }
    
    /**
     * Test Card Council_Room
     */
    @Test
    public void testCouncil_Room() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playCOUNCIL_ROOM TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Council_Room));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getType(), Card.Type.ACTION);
        int numBuys = p1.numBuys;
        int curHandSize = p1.hand.size();
        p1.playKingdomCard();
        assertEquals(numBuys+1, p1.numBuys);
        assertEquals(curHandSize+3, p1.hand.size());
    }
    
    /**
     * Test Card Cutpurse
     */
    @Test
    public void testCutpurse() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playCutpurse TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getType(), Card.Type.ACTION);
        int numCoins = p1.coins;
        int curHandSize = p2.hand.size();
        p1.playKingdomCard();
        assertEquals(numCoins+2, p1.coins);
        //assertEquals(p2.hand.size(), curHandSize);
        //assertEquals(p2.hand.size(), curHandSize-1);
        if (curHandSize-1 == p2.hand.size() || curHandSize == p2.hand.size()) {
           //
        }
        else {
            fail("\n A COPPER WASN'T REMOVED OR THEY DIDN'T REVEAL A HAND OF NO COPPER\n");
        }
    }
    
    /**
     * Test Card Great_Hall
     */
    @Test
    public void testGreat_Hall() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playGreat_Hall TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Great_Hall));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getType(), Card.Type.ACTION);
        int curHandSize = p1.hand.size();
        p1.playKingdomCard();
        assertEquals(curHandSize+1, p1.hand.size());
    }
    
    /**
     * Test Card Smithy
     */
    @Test
    public void testSmithy() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playCOUNCIL_ROOM TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getType(), Card.Type.ACTION);
        int curHandSize = p1.hand.size();
        p1.playKingdomCard();
        assertEquals(curHandSize+2, p1.hand.size());
    }
    
    /**
     * Test Card Village
     */
    @Test
    public void testVillage() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playVillage TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Village));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Village).getType(), Card.Type.ACTION);
        int numActions = p1.numActions;
        p1.playKingdomCard();
        assertEquals(6, p1.hand.size());
        assertEquals(numActions+1, p1.numActions);
    }
    
    /**
     * Test Card Salvager
     */
    @Test
    public void testSalvager() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Random randomGenerator = new Random();
        randomGenerator.setSeed(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@playSalvager TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        Player p1 = state.players.get(0);
        Player p2 = state.players.get(1);
        p1.hand.add(Card.getCard(cards, Card.CardName.Salvager));
        assertEquals(p1.hand.size(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Salvager).getType(), Card.Type.ACTION);
        int numBuys = p1.numBuys;
        p1.playKingdomCard();
        assertEquals(numBuys+1, p1.numBuys);
        assertEquals(player.hand.size(), 5);
    }
}
