package test;

import dominion.Card;
import dominion.Card.Type;
import dominion.Card.CardName;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Created by Arman Hastings on 2/13/2017
public class CardTest
{
    private List<Card> cList;


    @Before
    public void createList()
    {
        cList = Card.createCards();
    }

    @Test
    public void listSizeTest()
    {
        assertEquals(20, cList.size());
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
        assertTrue(cList.get(9).compareTo(cList.get(10)) < 0);
        assertTrue(cList.get(10).compareTo(cList.get(11)) < 0);
        assertTrue(cList.get(11).compareTo(cList.get(12)) < 0);
        assertTrue(cList.get(12).compareTo(cList.get(13)) < 0);
        assertTrue(cList.get(13).compareTo(cList.get(14)) < 0);
        assertTrue(cList.get(14).compareTo(cList.get(15)) < 0);
        assertTrue(cList.get(15).compareTo(cList.get(16)) < 0);
        assertTrue(cList.get(16).compareTo(cList.get(17)) < 0);
        assertTrue(cList.get(17).compareTo(cList.get(18)) < 0);
        assertTrue(cList.get(18).compareTo(cList.get(19)) < 0);

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
        assertEquals(CardName.Copper, cList.get(2).getCardName());
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
        assertEquals(CardName.Ambassador, cList.get(8).getCardName());
        assertEquals(Type.ACTION, cList.get(8).getType());
        assertEquals(3, cList.get(8).getCost());
        assertEquals(0, cList.get(8).getScore());
        assertEquals(0, cList.get(8).getTreasureValue());
    }


    @Test
    public void testCard9()
    {
        assertEquals(CardName.Baron, cList.get(9).getCardName());
        assertEquals(Type.ACTION, cList.get(9).getType());
        assertEquals(4, cList.get(9).getCost());
        assertEquals(0, cList.get(9).getScore());
        assertEquals(0, cList.get(9).getTreasureValue());
    }

    @Test
    public void testCard10()
    {
        assertEquals(CardName.CouncilRoom, cList.get(10).getCardName());
        assertEquals(Type.ACTION, cList.get(10).getType());
        assertEquals(5, cList.get(10).getCost());
        assertEquals(0, cList.get(10).getScore());
        assertEquals(0, cList.get(10).getTreasureValue());
    }

    @Test
    public void testCard11()
    {
        assertEquals(CardName.Cutpurse, cList.get(11).getCardName());
        assertEquals(Type.ACTION, cList.get(11).getType());
        assertEquals(4, cList.get(11).getCost());
        assertEquals(0, cList.get(11).getScore());
        assertEquals(0, cList.get(11).getTreasureValue());
    }

    @Test
    public void testCard12()
    {
        assertEquals(CardName.Embargo, cList.get(12).getCardName());
        assertEquals(Type.ACTION, cList.get(12).getType());
        assertEquals(2, cList.get(12).getCost());
        assertEquals(0, cList.get(12).getScore());
        assertEquals(0, cList.get(12).getTreasureValue());
    }

    @Test
    public void testCard13()
    {
        assertEquals(CardName.Feast, cList.get(13).getCardName());
        assertEquals(Type.ACTION, cList.get(13).getType());
        assertEquals(4, cList.get(13).getCost());
        assertEquals(0, cList.get(13).getScore());
        assertEquals(0, cList.get(13).getTreasureValue());
    }

    @Test
    public void testCard14()
    {
        assertEquals(CardName.Gardends, cList.get(14).getCardName());
        assertEquals(Type.ACTION, cList.get(14).getType());
        assertEquals(4, cList.get(14).getCost());
        assertEquals(0, cList.get(14).getScore());
        assertEquals(0, cList.get(14).getTreasureValue());
    }

    @Test
    public void testCard15()
    {
        assertEquals(CardName.GreatHall, cList.get(15).getCardName());
        assertEquals(Type.ACTION, cList.get(15).getType());
        assertEquals(3, cList.get(15).getCost());
        assertEquals(1, cList.get(15).getScore());
        assertEquals(0, cList.get(15).getTreasureValue());
    }
    @Test
    public void testCard16()
    {
        assertEquals(CardName.Laboratory, cList.get(16).getCardName());
        assertEquals(Type.ACTION, cList.get(16).getType());
        assertEquals(5, cList.get(16).getCost());
        assertEquals(0, cList.get(16).getScore());
        assertEquals(0, cList.get(16).getTreasureValue());
    }
    @Test
    public void testCard17()
    {
        assertEquals(CardName.Mine, cList.get(17).getCardName());
        assertEquals(Type.ACTION, cList.get(17).getType());
        assertEquals(5, cList.get(17).getCost());
        assertEquals(0, cList.get(17).getScore());
        assertEquals(0, cList.get(17).getTreasureValue());
    }
    @Test
    public void testCard18()
    {
        assertEquals(CardName.Smithy, cList.get(18).getCardName());
        assertEquals(Type.ACTION, cList.get(18).getType());
        assertEquals(4, cList.get(18).getCost());
        assertEquals(0, cList.get(18).getScore());
        assertEquals(0, cList.get(18).getTreasureValue());
    }
    @Test
    public void testCard19()
    {
        assertEquals(CardName.Village, cList.get(19).getCardName());
        assertEquals(Type.ACTION, cList.get(19).getType());
        assertEquals(3, cList.get(19).getCost());
        assertEquals(0, cList.get(19).getScore());
        assertEquals(0, cList.get(19).getTreasureValue());
    }


    @Test
    public void testGetCard()
    {
        assertEquals(cList.get(0), Card.getCard(cList, CardName.Gold));
        assertEquals(cList.get(1), Card.getCard(cList, CardName.Silver));
        assertEquals(cList.get(2), Card.getCard(cList, CardName.Copper));
        assertEquals(cList.get(3), Card.getCard(cList, CardName.Province));
        assertEquals(cList.get(4), Card.getCard(cList, CardName.Duchy));
        assertEquals(cList.get(5), Card.getCard(cList, CardName.Estate));
        assertEquals(cList.get(6), Card.getCard(cList, CardName.Curse));
        assertEquals(cList.get(7), Card.getCard(cList, CardName.Adventurer));
        assertEquals(cList.get(8), Card.getCard(cList, CardName.Ambassador));
        assertEquals(cList.get(9), Card.getCard(cList, CardName.Baron));
        assertEquals(cList.get(10), Card.getCard(cList, CardName.CouncilRoom));
        assertEquals(cList.get(11), Card.getCard(cList, CardName.Cutpurse));
        assertEquals(cList.get(12), Card.getCard(cList, CardName.Embargo));
        assertEquals(cList.get(13), Card.getCard(cList, CardName.Feast));
        assertEquals(cList.get(14), Card.getCard(cList, CardName.Gardends));
        assertEquals(cList.get(15), Card.getCard(cList, CardName.GreatHall));
        assertEquals(cList.get(16), Card.getCard(cList, CardName.Laboratory));
        assertEquals(cList.get(17), Card.getCard(cList, CardName.Mine));
        assertEquals(cList.get(18), Card.getCard(cList, CardName.Smithy));
        assertEquals(cList.get(19), Card.getCard(cList, CardName.Village));
    }




    /*
    @Test
    public void testEquals()
    {
        assertTrue(new Card(CardName.Gold, Type.TREASURE, 6, 0, 3).equals(cList.get(0)));
        assertTrue(new Card(CardName.Silver, Type.TREASURE, 3, 0, 2).equals(cList.get(1)));
        assertTrue(new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1).equals(cList.get(2)));
        assertTrue(new Card(CardName.Province, Type.VICTORY, 8, 6, 0).equals(cList.get(3)));
        assertTrue(new Card(CardName.Duchy, Type.VICTORY, 5, 1, 0).equals(cList.get(4)));
        assertTrue(new Card(CardName.Estate, Type.VICTORY, 2, 3, 0).equals(cList.get(5)));
        assertTrue(new Card(CardName.Curse, Type.VICTORY, 0, -1, 0).equals(cList.get(6)));
        assertTrue(new Card(CardName.Adventurer, Type.ACTION, 6, 0, 0).equals(cList.get(7)));
        assertTrue(new Card(CardName.Smithy, Type.ACTION, 4, 0, 0).equals(cList.get(8)));
        assertTrue(new Card(CardName.Village, Type.ACTION, 3, 0, 0).equals(cList.get(9)));
    }
    */


}

