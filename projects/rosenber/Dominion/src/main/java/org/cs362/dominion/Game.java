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
	
	Player currentPlayer;
	int curPlayerIdx;
	ArrayList<Player> players;
	Board board;
	
	//constructor
	public Game(int numPlayers, boolean AIonly){
		currentPlayer = null;
		curPlayerIdx = 0;
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
		
		//TODO: make players
		//TODO: make players draw initial cards
	}
	
	//turn
	public void turn(){
		actionPhase();
		buyPhase();
		cleanPhase();
	}
	
	//action phase
	public void actionPhase(){
		Card played = null;
		for(int j=0; j<5; j++)
			currentPlayer.drawCard();
		do{
			played = currentPlayer.playCard();
			played.Action();
			currentPlayer.addActions(-1);
		}while(currentPlayer.getActions() > 0);
	}
	
	//buy phase
	public void buyPhase(){
		currentPlayer.computeMoney();
		do{
			currentPlayer.buyCard(board);
		}while(currentPlayer.getBuys() > 0);
	}
	
	//clean phase
	public void cleanPhase(){
		currentPlayer.discardHand();
		currentPlayer.setBuys(1);
		currentPlayer.setMoney(0);
		currentPlayer.setActions(1);
	}
	
	//check for game over
	public boolean isGameOver(){
		if(board.numCardsInDeck("Province") == 0)
			return true;
		else{
			int numWithZero = 0;
			for(int j=0; j<board.numDecks(); j++)
				if(board.numCardsInDeck(j) == 0)
					numWithZero++;
			if(numWithZero >= 3)
				return true;
		}
		return false;
	}
	
	//declare winner
	public void declareWinner(){
		int maxVP = -1;
		Player winner = null;
		for(int j=0; j<players.size(); j++)
			if(players.get(j).getVictoryPoints() > maxVP)
				winner = players.get(j);
		System.out.println("The game is over!\n"
				+ winner.getName() + " is the winner with "
				+ maxVP + " victory points!!");
	}
	
	//play a game
	public void play(){
		do{
			currentPlayer = players.get(curPlayerIdx);
			turn();
			curPlayerIdx++;
			if(curPlayerIdx >= players.size())
				curPlayerIdx = 0;
		}while(!isGameOver());
		declareWinner();
	}
	
}
