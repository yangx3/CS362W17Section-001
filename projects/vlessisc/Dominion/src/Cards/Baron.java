package Cards;

public class Baron extends Card {
	public String getName(){
		return this.getClass().getName().replace("cards.", "");
	}
	
	public String getDefinition() {
		return "+1 Buy. You may discard an Estate card. If you do, +$4. Otherwise, gain an Estate card.";
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
	
	public int getBuys(){
		return 1;
	}
}
