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
 * Last modified: 2/8/2017
 */
package org.cs362.dominion;

import java.util.Scanner;

public class Player{
	
	private Scanner input;
	private String name;
	private Hand hand;
	private Deck deck;
	private Deck discard;
	private int buys;
	private int actions;
	private int money;
	
	//constructor
	public Player(int num){
		//asks player what they want their name to be
		// - takes in which player they are
		input = new Scanner(System.in);
		String ans = "";
		do{
			System.out.println("\nPlayer " + num + ", what would you like your username to be?");
			name = input.nextLine();
			System.out.println("Are you sure you want your username to be: " + name + "?\n"
					+ "(y/n) > ");
			ans = input.nextLine();
		}while(ans == "y");
		hand = new Hand();
		deck = new Deck("Deck");
		discard = new Deck("Discard");
		buys = 0;
		actions = 0;
		money = 0;
	}
	public Player(String name){
		input = new Scanner(System.in);
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
		//TODO
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
		boolean repeat;
		Card choice = null;
		seeHand();
		do{
			repeat = false;
			System.out.println("What card would you like to play?\n (type name of card) > ");
			String ans = input.nextLine();
			try{
				choice = hand.playCard(ans);
			}
			catch(Exception e){
				System.out.println("That name is not valid. Try again!");
				repeat = true;
			}
		}while(repeat);
		discard.addTop(choice);
		return choice;
	}
	
	//Compute Money
	//gets the amount of money available from cards in hand
	public void computeMoney(){
		for(int j=0; j<hand.size(); j++)
			money += hand.getCard(j).getTreasure();
	}
	
	//Buy Card
	//asks the user what card they want to buy
	public void buyCard(Board board){
		boolean repeat;
		board.print();
		do{
			repeat = false;
			System.out.println("You have " + money + " coins!");
			System.out.println("What card would you like to buy?");
			String ans = input.nextLine();
			if(board.isDeck(ans)){
				int idx = board.getDeckIdx(ans);
				Card choice = board.lookAtDeck(idx);
				if(choice.getCost() >= money){
					discard.addTop(board.draw(idx));
				}
				else{
					System.out.println("You don't have enough money for that! Try again!");
					repeat = true;
				}
			}
			else{
				System.out.println("That name is not valid. Try again!");
				repeat = true;
			}	
		}while(repeat);
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