package Cards;

public class Card {
	
	public enum cardTypes {
		TREASURE,
		/**
		 * Gold
		 * Silver
		 * Copper
		 */
		VICTORY,
		/**
		 * Duchy
		 * Estate
		 * Province
		 */
		KINGDOM
		/**
		 * Adventurer,
		 * Ambassador,
		 * Baron,
		 * Council_room,
		 * Cutpurse,
		 * Embargo,
		 * Feast,
		 * Gardens,
		 * Great_hall,
		 * Mine
		 * *
		 * Salvager
		 * Smithy
		 * Village
		 */
	};
	
	
	
	/**
	 * The default return for getCost is 0. Cards which do not cost anything will simply not
	 * implement this method
	 * @return 0
	 */
	public int getCost(){
		return 0;
	}
	
	/**
	 * The default return for getActions is 0. Cards which do not grant actions will simply not 
	 * implement this method
	 * @return 0
	 */
	public int getActions(){
		return 0;
	}
	/**
	 * The default return for getCoints is 0. Cards which do not grant coins will simply not 
	 * implement this method
	 * @return 0
	 */
	public int getCoins(){
		return 0;
	}
	/**
	 * The default return for getBuys is 0. Cards which do not grant buys will simply not 
	 * implement this method
	 * @return 0
	 */
	public int getBuys(){
		return 0;
	}
	
	/**
	 * The default return for getVictoryPoints is 0. Cards which do not grant victory points will 
	 * simply not implement this method
	 * @return 0
	 */
	public int getVictoryPoints(){
		return 0;
	}
	
	/*
	 * returns the named type of the card
	 */
	public String getName(){
		return this.getClass().getName().replace("cards.", "");
	}
	
	/*
	 * Gets the card type
	 */
	public cardTypes getType(){
		throw new Error("Failed to immplement method");
	}
	
	/*
	 * Total number of cards of this type in the game
	 */
	public int getInitialSupply(int numPlayers){
		throw new Error("Failed to immplement getTotalNumCards for the following card: " + this.getClass().toString());
	}
	
	
}
