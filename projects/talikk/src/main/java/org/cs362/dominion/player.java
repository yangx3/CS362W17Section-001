package org.cs362.dominion;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class player {

	private List<card> drawDeck;
	private List<card> hand;
	private List<card> discardDeck;
	private int gold;

	private String username;

	public player( String name){

		this.username = name;
		this.drawDeck = card.initDeck();
		this.hand = initHand();
		this.discardDeck = new ArrayList<card>();
		
		refillHand();


	}


	public List<card> initHand() {

		List<card> temp = new ArrayList<card>();
		return temp;

	}

	public int countGold( List<card> hand ) {
		int handSize = hand.size();
		int sum = 0;

		for(int i = 0; i < handSize; i++) {
			sum = sum + hand.get(i).getTreasureValue();
		}
		return sum;
	}

	//draws a single card into player hand
	public void drawCardToHand() {

		if( this.hand.size() > 5){
		  System.out.println("You have enough cards in your hand");
	  	}
 		else {		
			card temp = drawDeck.get(0);	
			this.hand.add( temp );
			this.drawDeck.remove(0);
		}

	}


	public void refillHand(){

		System.out.println( "Refilling hand");

		
		while(this.hand.size() != 5){
			if(this.drawDeck.size() == 0){
				System.out.println("Shuffling discard; refilling draw deck");
				Collections.shuffle( this.discardDeck );
				this.drawDeck = this.discardDeck;
				this.discardDeck.clear();
				System.out.println("Shuffle completed successfully");
			}
			drawCardToHand();
		}

	}
	public void trashHand(){

		System.out.println( "Trashing hand");
		
		int handSize = this.hand.size();

		for(int i = 0; i < handSize; i++){
			addToDiscard( this.hand.get(i) );
		}
		this.hand.clear();

	}

	public void addToDiscard( card c ){

		if( c != null){
			this.discardDeck.add( c );
		}
	}

	public void showHand(){

		int deckSize = this.hand.size();
		for(int i = 0; i < deckSize; i++){

			System.out.println("Card " + (i + 1) );
			this.hand.get(i).displaySimpleInfo();

		}
		
	}
	public String getName(){

		return this.username;
	}

	public List<card> getDrawDeck() {
		return this.drawDeck;
	}
	public List<card> getHand(){
		return this.hand;
	}
	public List<card> getDiscardDeck(){
		return this.discardDeck;
	}
	public int getGold(){
		return this.gold;
	}
	public void setGold( int num ){
		this.gold = num;
	}

	
	public static void main(String[] args){


	}

}
