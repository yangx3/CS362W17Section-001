package Cards;

public class Copper extends Card {

	public Copper(){
		
	}
	
	public int getInitialSupply(int numPlayers){
		return 60;
	}
	
	public cardTypes getType(){
		return Cards.Card.cardTypes.TREASURE;
	}
	
	
	public int getCoins(){
		return 1;
	}
	
	public int getCost(){
		return 0;
	}
	
	
}
