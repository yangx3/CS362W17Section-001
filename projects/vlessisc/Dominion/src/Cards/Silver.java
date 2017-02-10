package Cards;
import Cards.Card;

public class Silver extends Card {

	
	public Silver(){
		
	}
	
	public int getInitialSupply(int numPlayers){
		return 40;
	}
	
	public String getName(){
		return "Silver";
	}

	public cardTypes getType(){
		return Cards.Card.cardTypes.TREASURE;
	}
	
	public int getCost(){
		return 3;
	}
	
	
	public int getCoins(){
		return 2;
	}
	
}
