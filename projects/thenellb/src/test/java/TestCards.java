package org.cs362.dominion;

import org.thenellb.*;
import org.junit.Test;
import org.thenellb.Adventurer;
import org.thenellb.Bazaar;
//import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestCards{
    @Test
    public void testAdventurer(){

        Card myCard = new Adventurer();
        System.out.println("Testing card:  "+ myCard.get_cardName());
        assertEquals(myCard.get_cardName(), "Adventurer");
        assertEquals(myCard.get_text(),"Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.");
        assertEquals(myCard.get_cost(),6);
        assertEquals(myCard.get_plusActionValue(),0);
        assertEquals(myCard.get_plusCardValue(),0);
        assertEquals(myCard.get_plusBuyValue(),0);
        assertEquals(myCard.get_plusTreasuryValue(),0);
        assertEquals(myCard.get_cardType(),"ACTION");
    }

    @Test
    public void testBazaar(){

        Card myCard = new Bazaar();
        System.out.println("Testing card:  " + myCard.get_cardName());
        assertEquals(myCard.get_cardName(), "Bazaar");
        assertEquals(myCard.get_text(),"");
        assertEquals(myCard.get_cost(),5);
        assertEquals(myCard.get_plusActionValue(),2);
        assertEquals(myCard.get_plusCardValue(),1);
        assertEquals(myCard.get_plusBuyValue(),0);
        assertEquals(myCard.get_plusTreasuryValue(),1);
        assertEquals(myCard.get_cardType(),"ACTION");
    }

}
       // assertEquals(myCard.get_cost(),6);
/*
 this.cardName = cardName;
        this.text = text;
        this.victoryValue = victoryValue;
        this.plusBuyValue = plusBuyValue;
        this.plusTreasuryValue = plusTreasuryValue;
        this.plusActionValue = plusActionValue;
        this.plusCardValue = plusCardValue;
        this.cost = cost;
        this.cardType = cardType;
 */


