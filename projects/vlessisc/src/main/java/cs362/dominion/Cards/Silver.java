package cs362.dominion.Cards;

public class Silver extends Card {

	
	public Silver(){
		
	}
	
	public int getInitialSupply(int numPlayers){
		return 40;
	}
	
	public cardTypes getType(){
		return Card.cardTypes.TREASURE;
	}
	
	public int getCost(){
		return 3;
	}
	
	
	public int getCoins(){
		return 2;
	}
	
}
