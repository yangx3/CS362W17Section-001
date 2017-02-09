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
package org.cs362.dominion;
public class Player{
	
	private String name;
	private Hand hand;
	private Deck deck;
	private Deck discard;
	private int buys;
	private int actions;
	private int money;
	
	//constructor
	public Player(){
		name = "";
		hand = new Hand();
		deck = new Deck("Deck");
		discard = new Deck("Discard");
		buys = 0;
		actions = 0;
		money = 0;
	}
	public Player(String name){
		this.name = name;
		hand = new Hand();
		deck = new Deck("Deck");
		discard = new Deck("Discard");
		buys = 0;
		actions = 0;
		money = 0;
	}
	
	//getters
	
	//setters
	
	//Draw Card
	//draws a card from the deck to the hand
	public void drawCard(){
		
	}
	
	//Discard Card
	//moves card from hand to discard
	public void discardCard(Card c){
		
	}
	
	//Reshuffle deck
	//moves all cards from discard to deck and shuffles
	public void reshuffleDeck(){
		
	}
	
	//See hand
	//prints the hands
	public void seeHand(){
		
	}
	
	//Play card
	//asks the user what card they want to play and returns it
	public Card playCard(){
		
	}
	
	//Buy Card
	//asks the user what card they want to buy and adds it to the discard
	public void buyCard(){
		
	}
	
	//Get Victory Points
	//returns the total number of victory points the player has
	public int getVictoryPoints(){
		
	}
	
	
	
	
	
}