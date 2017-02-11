/*
 * This class implements the game of dominion to be played. All classes and objects
 * are initialized in this class. This class facilitates the gameplay between the
 * players and acts and the unspoken referee of Dominion.
 * 
 * Robert Rosenberger
 * 2/10/2017
 */

package org.cs362.dominion;

import java.util.ArrayList;

public class Game {
	
	int currentPlayer;
	ArrayList<Player> players;
	Board board;
	
	//constructor
	public Game(int numPlayers, boolean AIonly){
		players = new ArrayList<Player>();
		board = new Board();
		
		//initialize board with decks of cards
		board.createDeck(new Adventurer(), 30);
		board.createDeck(new Ambassador(), 30);
		board.createDeck(new Baron(), 30);
		board.createDeck(new Copper(), 30);
		board.createDeck(new CouncilRoom(), 30);
		board.createDeck(new Curse(), 30);
		board.createDeck(new Cutpurse(), 30);
		board.createDeck(new Duchy(), 30);
		board.createDeck(new Embargo(), 30);
		board.createDeck(new Estate(), 30);
		board.createDeck(new Feast(), 30);
		board.createDeck(new Garden(), 30);
		board.createDeck(new Gold(), 30);
		board.createDeck(new GreatHall(), 30);
		board.createDeck(new Mine(), 30);
		board.createDeck(new Province(), 30);
		board.createDeck(new Salvager(), 30);
		board.createDeck(new Silver(), 30);
		board.createDeck(new Smithy(), 30);
		board.createDeck(new Village(), 30);
	}
	
	//turn
	public void turn(){
		actionPhase();
		buyPhase();
		cleanPhase();
	}
	
	//action phase
	public void actionPhase(){
		
	}
	
	//buy phase
	public void buyPhase(){
		
	}
	
	//clean phase
	public void cleanPhase(){
		
	}
	
	//check for game over
	public boolean isGameOver(){
		
	}
	
	//declare winner
	public void declareWinner(){
		
	}
	
	//play a game
	public void play(){
		
	}
	
}
