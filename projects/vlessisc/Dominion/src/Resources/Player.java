package Resources;

import Cards.Card;

public class Player {
	
	/*
	 * Hand
	 * List of cards
	 */
	
	/*
	 * Number actions
	 */
	
	/*
	 * Number Buys
	 */
	
	/*
	 * Coins
	 */
	
	/*
	 * Parent Game
	 */
	final Game game;
	
	/*
	 * Players name
	 */
	final String name;
	
	/*
	 * Players deck of cards
	 */
	public Deck deck;
	
	public Player(Game game, String name){
		
		this.game = game;
		this.name = name;
		this.deck = new Deck(game);
		
	}
		
	public String getName(){
		return this.name;
	}
	
	public int getVictoryPoints(){
		int points = 0;
		for(Card card : this.deck.allCards()){
			points+=card.getVictoryPoints();
		}
		return points;
	}
	
	
}
