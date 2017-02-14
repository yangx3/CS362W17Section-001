
import org.thenellb.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class TestCardPicker {
    @Test
            public void CardPickerTest(){
                CardPicker myCardPicker = new CardPicker();
                System.out.println("Chosen cards:  \n");
                for (int i=0; i<17; i++){
                    System.out.println(myCardPicker.finalList.get(i).get_cardName()+ "\n");


                }

            }

}
