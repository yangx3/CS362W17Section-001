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
	public String getName(){
		return name;
	}
	public int getBuys(){
		return buys;
	}
	public int getActions(){
		return actions;
	}
	public int getMoney(){
		return money;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setBuys(int buys){
		this.buys = buys;
	}
	public void setActions(int actions){
		this.actions = actions;
	}
	public void setMoney(int monies){
		this.money = monies;
	}
	
	//Adders
	//adds taken in value to variable
	public void addBuys(int num){
		buys += num;
	}
	public void addActions(int num){
		actions += num;
	}
	public void addMoney(int num){
		money += num;
	}
	
	//Draw Card
	//draws a card from the deck to the hand
	public void drawCard(){
		if(deck.size() == 0)
			reshuffleDeck();
		hand.addCard(deck.drawTop());
	}
	
	//Discard Card
	//asks the user what card they want to discard from hand and
	//  moves it to discard
	public void discardCard(Card c){
		
	}
	
	//Re-shuffle deck
	//moves all cards from discard to deck and shuffles
	public void reshuffleDeck(){
		while(discard.size() > 0){
			deck.addTop(discard.drawTop());
		}
		deck.shuffle();
	}
	
	//See hand
	//prints the hands
	public void seeHand(){
		hand.print();
	}
	
	//Play card
	//asks the user what card they want to play and returns it
	public Card playCard(){
		return new Card();
	}
	
	//Compute Money
	//gets the amount of money available from cards in hand
	private int computeMoney(){
		int sum = 0;
		for(int j=0; j<hand.size(); j++)
			sum += hand.getCard(j).getTreasure();
		return sum;
	}
	
	//Buy Card
	//asks the user what card they want to buy and adds it to the discard
	public void buyCard(){
		
	}
	
	//Get Victory Points
	//returns the total number of victory points the player has
	public int getVictoryPoints(){
		int sum = 0;
		for(int j=0; j<hand.size(); j++)
			sum += hand.getCard(j).getVictoryPoints();
		for(int j=0; j<deck.size(); j++)
			sum += deck.findSpecific(j).getVictoryPoints();
		for(int j=0; j<discard.size(); j++)
			sum += discard.findSpecific(j).getVictoryPoints();
		return sum;
	}
	
	
	
	
	
}