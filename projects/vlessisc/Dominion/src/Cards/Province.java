package Cards;

public class Province extends Card {
	
	public String getName(){
		return "Province";
	}
	
	public int getInitialSupply(int numPlayers){
		return 8;
	}
	

	public int getVictoryPoints(){
		return 6;
	}
	
	public int getCost(){
		return 8;
	}
	
	
	public cardTypes getType(){
		return Cards.Card.cardTypes.VICTORY;
	}
	
}
