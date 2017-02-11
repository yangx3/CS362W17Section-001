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
	
	private boolean isAi;
	private Scanner input;
	private String name;
	public Hand hand;
	public Deck deck;
	public Deck discard;
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
		isAi = false;
	}
	public Player(String name, boolean ai){
		input = new Scanner(System.in);
		this.name = name;
		hand = new Hand();
		deck = new Deck("Deck");
		discard = new Deck("Discard");
		buys = 0;
		actions = 0;
		money = 0;
		isAi = ai;
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
	
	//Give Card
	//adds a card to the player's discard
	public void giveCard(Card c){
		discard.addTop(c);
	}
	
	//Draw Card
	//draws a card from the deck to the hand
	public void drawCard(){
		if(deck.size() == 0)
			reshuffleDeck();
		hand.addCard(deck.drawTop());
	}
	
	//returns the top card of players deck
	// - removes card from deck
	public Card getTopCard(){
		return deck.drawTop();
	}
	
	//adds a card to the players hand directly
	public void addToHand(Card c){
		hand.addCard(c);
	}
	
	//number of total cards
	// returns the total number of cards the player has
	public int numTotalCards(){
		int sum=hand.size();
		sum += deck.size();
		sum += discard.size();
		return sum;
	}
	
	//Discard Card
	//asks the user what card they want to discard from hand and
	//  moves it to discard
	public void discardCard(){
		boolean repeat;
		hand.print();
		do{
			repeat = false;
			System.out.println("What card do you choose to discard?\n > ");
			String ans = input.nextLine();
			try{
				Card choice = hand.playCard(ans);
				discard.addTop(choice);
			}
			catch(Exception e){
				System.out.println("That name isn't valid. Try again!");
				repeat = true;
			}
		}while(repeat);
	}
	//discards card with matching name from hand
	public void discardCard(Card c){
		discard.addTop(hand.playCard(c.getName()));
	}
	public void discardCard(String name){
		discard.addTop(hand.playCard(name));
	}
	
	//discards entire hand
	public void discardHand(){
		while(hand.size() > 0){
			discard.addTop(hand.playCard(0));
		}
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
		return choice;
	}
	public Card playCard(String name){
		return hand.playCard(name);
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
			System.out.println("You have " + buys + " buys!");
			System.out.println("You have " + money + " coins!");
			System.out.println("What card would you like to buy?");
			String ans = input.nextLine();
			try{
				int idx = board.getDeckIdx(ans);
				Card choice = board.lookAtDeck(idx);
				if(choice.getCost() >= money){
					giveCard(board.draw(idx));
					money -= choice.getCost();
					if(choice.getName() == "Embargo"){
						int numCurses = board.getDeck(board.getDeckIdx(choice.getName())).getEmbargos();
						for(int j=0; j<numCurses; j++)
							giveCard(board.draw(board.getDeckIdx("Curse")));
					}
				}
				else{
					System.out.println("You don't have enough money for that! Try again!");
					repeat = true;
				}
			}
			catch(Exception e){
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
			if(hand.getCard(j).getName() == "Garden"){
				Garden g = (Garden)hand.getCard(j);
				sum += g.getVictoryPoints(this);
			}
			else
				sum += hand.getCard(j).getVictoryPoints();
		for(int j=0; j<deck.size(); j++)
			if(deck.findSpecific(j).getName() == "Garden"){
				Garden g = (Garden)deck.findSpecific(j);
				sum += g.getVictoryPoints(this);
			}
			else
				sum += deck.findSpecific(j).getVictoryPoints();
		for(int j=0; j<discard.size(); j++)
			if(discard.findSpecific(j).getName() == "Garden"){
				Garden g = (Garden)discard.findSpecific(j);
				sum += g.getVictoryPoints(this);
			}
			else
				sum += discard.findSpecific(j).getVictoryPoints();
		return sum;
	}
}