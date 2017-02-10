package cs362.dominion.Cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import cs362.dominion.Exceptions.InvalidOptionException;
import cs362.dominion.Resources.Game;
import cs362.dominion.Resources.Option;
import cs362.dominion.Resources.Player;
import cs362.dominion.Resources.Supply;

public class Feast extends Card {

	
	public String getDefinition() {
		return "Trash this card. Gain a card costing up to $5.";
	}
	
	public cardTypes getType(){
		return Card.cardTypes.KINGDOM;
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
	
	public Option playCard(Game game, ArrayList<Player>players, Supply supply){
		return new whichCardToTrash(game);
	}
	
	
	/**
	 * Option class allowing user to decide which card to trash from their hand
	 * @author chrisvlessis
	 */
	private class whichCardToTrash implements Option {
		
		private HashMap<Integer, Class<? extends Card>> cardOptions = new HashMap<Integer, Class<? extends Card>>();
		private Game game;
		
		public whichCardToTrash(Game game){
			this.game = game;
			ArrayList<Class<? extends Card>> cardsInHand = game.getCurrentPlayer().deck.hand.cardTypesInHand();
			Set<Class<? extends Card>> uniqueCards = new HashSet<Class<? extends Card>>(cardsInHand);
			int optionNum = 0;
			for(Class<? extends Card> cardType : uniqueCards){
				this.cardOptions.put(optionNum, cardType);
				optionNum++;
			}
		}

		public Option decide(int i) {
			if(this.cardOptions.containsKey(i)){
				Card toTrash = this.game.getCurrentPlayer().deck.hand.removeCardFromHand(this.cardOptions.get(i));
				game.supply.trashCard(toTrash);
				return new cardToAdd(this.game);
			}
			return null;
		}
	
		public String description(){
			return "Which card from your hand would you like to trash?";
		}
		
		public ArrayList<String> optionDescriptions(){
			ArrayList<String> options = new ArrayList<String>();
			for(int i : this.cardOptions.keySet()){
				try {
					options.add(i, this.cardOptions.get(i).newInstance().getName());
				} catch (InstantiationException | IllegalAccessException e) {}
			}
			return options;
		}
		
		public int numOptions(){
			return this.cardOptions.size();
		}
	}
	
	private class cardToAdd implements Option {
		private Game game;
		private HashMap<Integer, Class<? extends Card>> cardOptions = new HashMap<Integer, Class<? extends Card>>();
		
		public cardToAdd(Game game){
			this.game = game;
			int optionNum=0;
			for(Class<? extends Card> cardType : game.supply.supplyCardTypes()){
				// ignore empty piles
				if(game.supply.cardsInPile(cardType)<1){continue;}
				// dont use cards that cost more than 5 coins
				try { if(cardType.newInstance().getCost()>=6){ continue;} } 
				catch (InstantiationException | IllegalAccessException e) {}
				this.cardOptions.put(optionNum, cardType);
				optionNum++;
			}
		}
		
		public String description() {
			return "Which card would you like to add to your hand?";
		}

		public Option decide(int optionNumber) throws InvalidOptionException {
			if(!this.cardOptions.containsKey(optionNumber)){
				throw new InvalidOptionException("Invalid option selected");
			}
			this.game.getCurrentPlayer().deck.hand.addCard(game.supply.drawCard(this.cardOptions.get(optionNumber)));
			return null;
		}

		public int numOptions() {
			return this.cardOptions.size();
		}

		public ArrayList<String> optionDescriptions() {
			ArrayList<String> options = new ArrayList<String>();
			for(int i : this.cardOptions.keySet()){
				try {
					options.add(i, this.cardOptions.get(i).newInstance().getName());
				} catch (InstantiationException | IllegalAccessException e) {}
			}
			return options;
		}
		
	}
	
	
}
