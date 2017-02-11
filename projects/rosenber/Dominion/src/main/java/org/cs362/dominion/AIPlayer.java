package org.cs362.dominion;
import java.util.Random;

public class AIPlayer extends Player{

	Random rand;
	
	public AIPlayer(int num){
		super("Player_"+num, true);
		rand = new Random();
	}
	
	public void discardCard(){
		boolean repeat;
		int choice = -1;
		do{
			repeat = false;
			try{
				choice = rand.nextInt(hand.size());
				discard.addTop(hand.playCard(choice));
			}
			catch(Exception e){
				repeat = true;
			}
		}while(repeat);
	}
	
	public Card playCard(){
		boolean repeat;
		int choice = -1;
		Card c = null;
		do{
			repeat = false;
			choice = rand.nextInt(hand.size());
			c = hand.getCard(choice);
			if(!c.isCardType(CardType.Action))
				repeat = true;
		}while(repeat);
		return hand.playCard(choice);
	}
}
