
/* 
 *  * To change this license header, choose License Headers in Project Properties. 
 *   * To change this template file, choose Tools | Templates 
 *    * and open the template in the editor. 
 *     */ 
package com.mycompany.marksprousedominion; 
 
import com.mycompany.marksprousedominion.*; 
import org.junit.Test; 
 
import java.util.Random; 
 
import static org.junit.Assert.*; 
 
/** 
 *  * Created by MarkSprouse on 2/12/2017. 
 *   */ 
public class PlayerTest { 
 
    Random rand = new Random(10); 
 
    @Test 
    public void testConclusion() 
    { 
        Player player = new Player(rand); 
        for (int i = 0; i < 5; i++) 
        { 
            Card temp = new Card(); 
            temp.setVictory(1); 
            player.addCard(1,temp); 
        } 
        Card temp = new Card(); 
        temp.setVictory(1); 
        player.addCard(2,temp); 
 
        player.turnConclusion(); 
 
        assertEquals(6,player.getVictoryPoints()); 
        assertEquals(5,player.getSize(2)); 
    } 
 
 
    @Test 
    public void testAdds() 
    { 
        //Test all cases of the addCard
    	Player player = new Player(rand); 
        Card card = new Card(); 
        card.setName("Test"); 
        String name = "Test"; 
 
        for (int i = 0; i < 4; i++) 
        { 
            player.addCard(i,card); 
            assertEquals(1,player.getSize(i)); 
            assertEquals("Test", player.getCard(i,0).getName()); 
        } 
        player.addCard(4,card); 
 
    } 
 
    @Test 
    public void testDraw() 
    { 
        Player player = new Player(rand); 
 
        player.addCard(0, new treasureCard(0, 1, "Copper"));//Add a card to the deck 
 
        player.draw(); 
 
        assertEquals(1, player.getSize(2)); 
        assertEquals(0, player.getSize(0)); 
 
    } 
 
 
    @Test 
    public void testTrash() 
    { 
        Player player = new Player(rand); 
        victoryCard card = new victoryCard(2,1,"Estate"); 
        for (int i = 0; i < 4; i++) 
        { 
            player.addCard(i, card); 
            assertEquals(1,player.getSize(i)); 
        } 
 
        for (int i = 0; i < 4; i++) 
        { 
            player.trashCard(i, card); 
            assertEquals(0,player.getSize(i)); 
        } 
    } 
 
    @Test 
    public void testMoveCard() 
    { 
        Player player = new Player(rand); 
        player.addCard(0,new Card()); 
 
        for (int i = 0; i < 3; i++) 
        { 
            assertEquals(1, player.getSize(i)); 
            assertEquals(0, player.getSize(i+1)); 
            player.addCard(i,i+1,0); 
            assertEquals(0, player.getSize(i)); 
            assertEquals(1, player.getSize(i+1)); 
        } 
    } 
}  
