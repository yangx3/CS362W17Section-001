package Cards;

public class Duchy extends Card {
	
	public String getName(){
		return "Duchy";
	}
	
	public int getInitialSupply(int numPlayers){
		return 8;
	}
	
	public int getVictoryPoints(){
		return 3;
	}
	
	public int getCost(){
		return 5;
	}
	
	
	public cardTypes getType(){
		return cardTypes.VICTORY;
	}
	
}
