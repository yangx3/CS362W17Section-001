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
			choice = rand.nextInt(hand.size() + 1);
			if(choice == hand.size()) //choosing to skip
				return null;
			c = hand.getCard(choice);
			if(!c.isCardType(CardType.Action))
				repeat = true;
		}while(repeat);
		return hand.playCard(choice);
	}
	
	public void buyCard(Board board){
		
		boolean repeat;
		int choice = -1;
		do{
			if(rand.nextBoolean()) //chose not to buy
				return;
			repeat = false;
			while(choice < 1)
				choice = rand.nextInt(board.numDecks());
			Card c = board.lookAtDeck(choice);
			if(c.getCost() <= super.getMoney()){
				giveCard(board.draw(choice));
				super.setMoney(c.getCost() * -1);
				int numCurses = board.getDeck(choice).getEmbargos();
				for(int j=0; j<numCurses; j++)
					giveCard(board.draw(board.getDeckIdx("Curse")));
			}
			else
				repeat = true;
		}while(repeat);
	}
}
