package Cards;

public class Cutpurse extends Card {
	
	public String getName(){
		return this.getClass().getName().replace("cards.", "");
	}
	
	public String getDefinition() {
		return "+$2. Each other player discards a Copper card (or reveals a hand with no Copper).";
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
	
	public int getCoins(){
		return 2;
	}
	
	public int getCost(){
		return 4;
	}
	
}
