package Cards;

public class Ambassador extends Card {
	
		public String getName(){
			return this.getClass().getName().replace("cards.", "");
		}
		
		public String getDefinition() {
			return "Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it.";
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
			return 3;
		}
}
