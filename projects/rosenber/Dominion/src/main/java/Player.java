/*
 * This class implements the functionality a player needs for a game
 * of Dominion. The player has full control over all of the cards in its
 * possession (hand, deck, etc). This puts all of the responsibility for
 * error handling on the player. The game must ask the player what they
 * would like to do, and the player will give. They are not responsible
 * for making sure their action is valid for the point in the game, only
 * for accessing the places in their hand and decks.
 * 
 * Robert Rosenberger
 * Last modified: 1/31/2017
 */

public class Player{
	
	private String name;
	private Hand hand;
	private Deck deck;
	private Deck discard;
	private int buys;
	private int actions;
	private int money;
	
	//constructor
	
	//getters
	
	//setters
	
	//draws a card from the deck to the hand
	
	//discards a card from the hand to the discard
	
	//puts a card from the hand back on top of the deck
	
	//puts a card from the hand back to the bottom of the deck
	
	//shuffles deck
	
	//puts discard into deck and shuffles deck
	
	//prints the hand
	
	//places a card on the discard and returns it
	
	//returns total number of victory points the player has
	
	
	
}