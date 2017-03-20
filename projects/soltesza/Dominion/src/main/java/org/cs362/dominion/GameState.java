package org.cs362.dominion;

import java.util.LinkedList;

public class GameState {
	public Player currentPlayer;
	public LinkedList<Player> otherPlayers; 
	
	public GameState(DominionBoard board, int playerCount) {
		otherPlayers = new LinkedList<Player>();
		
		for(int i=0; i<playerCount; i++) {
			Player newPlayer = new Player("Player " + (i+1), board);
			otherPlayers.add(newPlayer);
		}
		
		currentPlayer = otherPlayers.removeFirst();
	}
	
	public void TakeTurn() {
		currentPlayer.TakeTurn(this);
		
		Player p1 = currentPlayer;
		currentPlayer = otherPlayers.removeFirst();
		otherPlayers.add(p1);
	}
	
	public void DrawCards(Player player, int numCards) {
		player.deck.DrawCards(numCards);
	}
	
	public void PrintScore() {
		System.out.println("Score:");
		
		System.out.println(currentPlayer.GetName() + ": " + currentPlayer.GetScore());
		
		int size = otherPlayers.size();
		for(int i=0; i<size; i++) {
			Player p = otherPlayers.removeFirst();
			System.out.println(p.GetName() + ": " + p.GetScore());
			otherPlayers.add(p);
		}
	}
}
