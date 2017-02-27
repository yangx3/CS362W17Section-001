package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

public class RandomTestDominion {

	@Test
	public static void main() {
		try {
			ArrayList<Card> availableCards = new ArrayList<Card>();
			availableCards.addAll(Builder.buildKindomDecks());
			Random random = new Random(10);
			
			for(int itr = 0; itr < 3; itr++)
			{
				//remove 3 decks from boards to get random 10 decks
				availableCards.remove(random.nextInt(availableCards.size()));
			}
			
			//add in non-kingdom cards to board
			availableCards.addAll(Builder.buildNonKingdomCardDecks());
			
			//set game with those 10 kingdom cards
			GameState game = new GameState(availableCards);
			
			ArrayList<String> names = new ArrayList<String>();
			names.add("Connor");
			names.add("Casey");
			names.add("Robert");
			names.add("Courntney");
			
			int numPlayers = 0;
			do
			{
				//choose random number of players 2-4
				numPlayers = random.nextInt(4);
			}while(numPlayers < 2);
			
			for(int itr = 0; itr <= numPlayers; itr++)
			{
				//select and add random player to game
				Player player = new Player();
				player.username = names.remove(random.nextInt(names.size()));
				game.addPlayer(player);
			}
			
			game.initializeGame();
			Player winner = game.play();
			
			System.out.printf("The winner is %s with %d points!\n", winner.username, winner.getPoints());
		}catch(Exception e)
		{
			fail("Should not have failed");
		}
		
	}

}
