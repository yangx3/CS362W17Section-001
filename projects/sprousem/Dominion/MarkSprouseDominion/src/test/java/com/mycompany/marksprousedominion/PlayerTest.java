/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marksprousedominion;

import com.mycompany.marksprousedominion.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by MarkSprouse on 2/12/2017.
 */
public class PlayerTest {

    @Test
    public void testConclusion()
    {
        Player player = new Player();
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
        Player player = new Player();
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
        System.out.println("Testing the draw");
        Player player = new Player();

        player.addCard(0, new treasureCard(0, 1, "Copper"));//Add a card to the deck

        player.draw();

        assertEquals(1, player.getSize(2));
        assertEquals(0, player.getSize(0));

    }

}
