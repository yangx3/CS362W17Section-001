package org.cs362.dominion;

import org.cs362.dominion.Card;
import org.cs362.dominion.Card.Type;
import org.cs362.dominion.Card.CardName;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by [author} on 2/4/2017.
 */
public class CardTest {
    private List<Card> cList;
    @Before
    public void createList()
    {
        cList = Card.createCards();
    }

    @Test
    public void listSizeTest()
    {
        assertEquals(10, cList.size());
    }

    @Test
    public void testCard0()
    {
        assertEquals(CardName.Gold, cList.get(0).getCardName());
        assertEquals(Type.TREASURE, cList.get(0).getType());
        assertEquals(6, cList.get(0).getCost());
        assertEquals(0, cList.get(0).getScore());
        assertEquals(3, cList.get(0).getTreasureValue());
    }

    @Test
    public void testCard1()
    {
        assertEquals(CardName.Silver, cList.get(1).getCardName());
        assertEquals(Type.TREASURE, cList.get(1).getType());
        assertEquals(3, cList.get(1).getCost());
        assertEquals(0, cList.get(1).getScore());
        assertEquals(2, cList.get(1).getTreasureValue());
    }

    @Test
    public void testCard2()
    {
        assertEquals(CardName.Cooper, cList.get(2).getCardName());
        assertEquals(Type.TREASURE, cList.get(2).getType());
        assertEquals(0, cList.get(2).getCost());
        assertEquals(0, cList.get(2).getScore());
        assertEquals(1, cList.get(2).getTreasureValue());
    }

    @Test
    public void testCard3()
    {
        assertEquals(CardName.Province, cList.get(3).getCardName());
        assertEquals(Type.VICTORY, cList.get(3).getType());
        assertEquals(8, cList.get(3).getCost());
        assertEquals(6, cList.get(3).getScore());
        assertEquals(0, cList.get(3).getTreasureValue());
    }

    @Test
    public void testCard4()
    {
        assertEquals(CardName.Duchy, cList.get(4).getCardName());
        assertEquals(Type.VICTORY, cList.get(4).getType());
        assertEquals(5, cList.get(4).getCost());
        assertEquals(1, cList.get(4).getScore());
        assertEquals(0, cList.get(4).getTreasureValue());
    }

    @Test
    public void testCard5()
    {
        assertEquals(CardName.Estate, cList.get(5).getCardName());
        assertEquals(Type.VICTORY, cList.get(5).getType());
        assertEquals(2, cList.get(5).getCost());
        assertEquals(3, cList.get(5).getScore());
        assertEquals(0, cList.get(5).getTreasureValue());
    }

    @Test
    public void testCard6()
    {
        assertEquals(CardName.Curse, cList.get(6).getCardName());
        assertEquals(Type.VICTORY, cList.get(6).getType());
        assertEquals(0, cList.get(6).getCost());
        assertEquals(-1, cList.get(6).getScore());
        assertEquals(0, cList.get(6).getTreasureValue());
    }

    @Test
    public void testCard7()
    {
        assertEquals(CardName.Adventurer, cList.get(7).getCardName());
        assertEquals(Type.ACTION, cList.get(7).getType());
        assertEquals(6, cList.get(7).getCost());
        assertEquals(0, cList.get(7).getScore());
        assertEquals(0, cList.get(7).getTreasureValue());
    }

    @Test
    public void testCard8()
    {
        assertEquals(CardName.Smithy, cList.get(8).getCardName());
        assertEquals(Type.ACTION, cList.get(8).getType());
        assertEquals(4, cList.get(8).getCost());
        assertEquals(0, cList.get(8).getScore());
        assertEquals(0, cList.get(8).getTreasureValue());
    }

    @Test
    public void testCard9()
    {
        assertEquals(CardName.Village, cList.get(9).getCardName());
        assertEquals(Type.ACTION, cList.get(9).getType());
        assertEquals(3, cList.get(9).getCost());
        assertEquals(0, cList.get(9).getScore());
        assertEquals(0, cList.get(9).getTreasureValue());
    }

    @Test
    public void testGetCard()
    {
        assertEquals(cList.get(0), Card.getCard(cList, CardName.Gold));
        assertEquals(cList.get(1), Card.getCard(cList, CardName.Silver));
        assertEquals(cList.get(2), Card.getCard(cList, CardName.Cooper));
        assertEquals(cList.get(3), Card.getCard(cList, CardName.Province));
        assertEquals(cList.get(4), Card.getCard(cList, CardName.Duchy));
        assertEquals(cList.get(5), Card.getCard(cList, CardName.Estate));
        assertEquals(cList.get(6), Card.getCard(cList, CardName.Curse));
        assertEquals(cList.get(7), Card.getCard(cList, CardName.Adventurer));
        assertEquals(cList.get(8), Card.getCard(cList, CardName.Smithy));
        assertEquals(cList.get(9), Card.getCard(cList, CardName.Village));
    }

    @Test
    public void testFilter()
    {
        assertEquals(3, Card.filter(cList, Type.TREASURE).size());
        assertEquals(4, Card.filter(cList, Type.VICTORY).size());
        assertEquals(3, Card.filter(cList, Type.ACTION).size());
    }



    @Test
    public void testCompare()
    {
        assertTrue(cList.get(0).compareTo(cList.get(1)) < 0);
        assertTrue(cList.get(1).compareTo(cList.get(2)) < 0);
        assertTrue(cList.get(2).compareTo(cList.get(3)) < 0);
        assertTrue(cList.get(3).compareTo(cList.get(4)) < 0);
        assertTrue(cList.get(4).compareTo(cList.get(5)) < 0);
        assertTrue(cList.get(5).compareTo(cList.get(6)) < 0);
        assertTrue(cList.get(6).compareTo(cList.get(7)) < 0);
        assertTrue(cList.get(7).compareTo(cList.get(8)) < 0);
        assertTrue(cList.get(8).compareTo(cList.get(9)) < 0);
    }
}
