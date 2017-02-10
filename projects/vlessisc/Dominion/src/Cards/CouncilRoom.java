package Cards;

public class CouncilRoom extends Card {
	public String getName(){
		return this.getClass().getName().replace("cards.", "");
	}
	
	public String getDefinition() {
		return "+4 Cards; +1 Buy. Each other player draws a card.";
	}
	
	public cardTypes getType(){
		return Cards.Card.cardTypes.KINGDOM;
	}
	
	/**
	 * There are 10 of each kingdom card
	 */
	public int getInitialSupply(int numPlayers){
		return 10;
	}
	
	public int getBuys(){
		return 1;
	}
	
	public int getCost(){
		return 5;
	}
}
