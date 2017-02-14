package org.thenellb;

import java.util.*;


public class CardShop {
    public CardPicker myCardPicker;

    public List <Integer> numberCards;
    public int numberOfEmpty;

    public CardShop(){
        myCardPicker = new CardPicker();
        numberCards = new ArrayList<Integer>();
        for (int i = 0; i<3; i++)   //Treasury cards
            numberCards.add(7);
        for (int j = 0; j<4; j++)   //Victory Cards
            numberCards.add(8);
        for (int k = 0; k<10; k++) //Action/kingdom cards
            numberCards.add(4);
        numberOfEmpty=0;





    }
    public CardShop(CardShop cardshop){
        this.myCardPicker = cardshop.myCardPicker;
        this.numberCards = cardshop.numberCards;
        this.numberOfEmpty = cardshop.numberOfEmpty;
    }

}