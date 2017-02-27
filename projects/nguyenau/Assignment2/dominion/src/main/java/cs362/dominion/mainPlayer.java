package cs362.dominion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class mainPlayer {
	public  static void main(String args[]){			
        //set up random number generator
        // To know about the reason of using the seed https://en.wikipedia.org/wiki/Pseudorandom_number_generator

        Randomness.reset(10);	   

        List<Card> cards=new LinkedList<Card>();
        //the cards  are achieved by each element/constant in the enum class 
        cards = new ArrayList<Card>(Card.createCards());

        Player player = new Player(null,"aburasa");
        System.out.println("Player-1 information:\n " + player.toString()); 

        for (int i = 0; i < 7; i++)
            player.addToDeck(Card.getCard(cards,Card.CardName.Gold));

        player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));

        player.initializePlayerTurn();

        System.out.println("Player-1 information:\n " + player.toString()); 

        player.drawCard();
            
        player.playKingdomCard();
        
        System.exit(0);
	}

}
