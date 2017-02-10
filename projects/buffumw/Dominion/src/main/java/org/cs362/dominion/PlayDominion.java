package org.cs362.dominion;
import java.util.ArrayList;

public class PlayDominion {
	
	public static void main(String[] args) {
		ArrayList<Card> cards = new ArrayList<Card>(Builder.buildGeneralDecks());
		
		GameState game = new GameState(cards);
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		game.addPlayer(p1);
		game.addPlayer(p2);
		
		game.initializeGame();
		
		game.play();
	
	}
	
	
}
