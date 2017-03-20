package org.thenellb;

import java.util.*;


public class CardShop {
    public CardPicker myCardPicker;

    public List <Integer> numberCards;
    public int numberOfEmpty;

    public CardShop(){
        myCardPicker = new CardPicker();
        numberCards = new ArrayList<Integer>();
        for (int i = 0; i<3; i++)   //Treasury cards index 0-2
            numberCards.add(7);
        for (int j = 0; j<4; j++)   //Victory Cards  index 3-6
            numberCards.add(8);
        for (int k = 0; k<10; k++) //Action/kingdom cards index 7-16
            numberCards.add(5);
        numberOfEmpty=0;





    }
    public CardShop(CardShop cardshop){
        this.myCardPicker = cardshop.myCardPicker;
        this.numberCards = cardshop.numberCards;
        this.numberOfEmpty = cardshop.numberOfEmpty;
    }
    /*public buyCard(){


    }
*/
}