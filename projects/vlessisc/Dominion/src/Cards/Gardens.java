package Cards;


public class Gardens extends Card {
	public String getName(){
		return this.getClass().getName().replace("cards.", "");
	}
	
	public cardTypes getType(){
		return Cards.Card.cardTypes.KINGDOM;
	}
	
	public String getDefinition() {
		return "Worth 1 Victory for every 10 cards in your deck (rounded down).";
	}
	
	/**
	 * There are 10 of each kingdom card
	 */
	public int getInitialSupply(int numPlayers){
		return 10;
	}
	
	public int getVictoryPoints(){
		/**
		 * TODO: implement counter at end
		 */
		return 0;
	}
	
	public int getCost(){
		return 4;
	}
}
