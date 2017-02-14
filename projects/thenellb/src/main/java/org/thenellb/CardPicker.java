package org.thenellb;

import java.util.ArrayList;
import java.util.*;
import org.thenellb.Copper;
import org.thenellb.Silver;
import org.thenellb.Gold;
import org.thenellb.Estate;
import org.thenellb.Duchy;
import org.thenellb.Province;
import org.thenellb.Curse;
import org.thenellb.Adventurer;
import org.thenellb.Bazaar;
import org.thenellb.Cellar;
import org.thenellb.Chancellor;
import org.thenellb.Chapel;
import org.thenellb.CouncilRoom;
import org.thenellb.Festival;
import org.thenellb.Laboratory;
import org.thenellb.Market;
import org.thenellb.MoneyLender;
import org.thenellb.Smithy;
import org.thenellb.Village;
import org.thenellb.WoodCutter;

public class CardPicker {
    public List<Card> cardList;
    public List<Card> finalList;
    public List<Integer> index;
    int myRandomInt;
    Random myRandom;

    //initialize


    public CardPicker(){
        cardList = new ArrayList<Card>();
        finalList = new ArrayList<Card>();
        index = new ArrayList<Integer>();

        for (int i=0; i<10; i++){
            index.add(0);

        }

        finalList.add(new Copper());
        finalList.add(new Silver());
        finalList.add(new Gold());
        finalList.add(new Estate());
        finalList.add(new Duchy());
        finalList.add(new Province());
        finalList.add(new Curse());
        cardList.add(new Adventurer());
        cardList.add(new Bazaar());
        cardList.add(new Cellar());
        cardList.add(new Chancellor());
        cardList.add(new Chapel());
        cardList.add(new CouncilRoom());
        cardList.add(new Festival());
        cardList.add(new Laboratory());
        cardList.add(new Market());
        cardList.add(new MoneyLender());
        cardList.add(new Smithy());
        cardList.add(new Village());
        cardList.add(new WoodCutter());


        for (int j = 0; j < 10; j++){

            myRandomInt= myRandom.getRandomInt(0,10);
            if (index.get(myRandomInt) == 0){
                index.set(myRandomInt,1);

                finalList.add(cardList.get(myRandomInt));
            }
            else
                j--;


        }
    }
}
