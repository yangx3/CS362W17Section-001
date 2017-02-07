package Cards;

public class Feast extends Card {
	public String getName(){
		return this.getClass().getName().replace("cards.", "");
	}
	
	public String getDefinition() {
		return "Trash this card. Gain a card costing up to $5.";
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
	
	public int getCost(){
		return 4;
	}
}
