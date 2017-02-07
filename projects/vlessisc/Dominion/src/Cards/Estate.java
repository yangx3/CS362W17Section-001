package Cards;


public class Estate extends Card {
	
	public String getName(){
		return "Estate";
	}
	
	public int getInitialSupply(int numPlayers){
		return 8;
	}
	
	/**
	 * Estate cards are worth 1 victory point
	 * @return
	 */
	public int getVictoryPoints(){
		return 1;
	}
	
	public int getCost(){
		return 2;
	}
	
	
	public cardTypes getType(){
		return Cards.Card.cardTypes.VICTORY;
	}
	
}
