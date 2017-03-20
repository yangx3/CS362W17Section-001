package org.cs362.dominion;

import java.util.Random;

public class RandomTestDominion {

	public static void main(String[] args) {
		CardSupply supply=new CardSupply();
		int winnerIndex=0, numberOfPlayers;
		Turn takeTurn;
		Random randomness = new Random();

		randomness.setSeed(10);
		
		numberOfPlayers=(randomness.nextInt(3))+2;
		Player[] players=new Player[numberOfPlayers];
		
		for(int i=0; i<numberOfPlayers; i++) players[i]=new Player(supply);
		
		int[] victoryPoints = new int[numberOfPlayers];
		
		while(!supply.endgame())
		{
			for(int i=0; i<numberOfPlayers; i++){
				takeTurn=new Turn(players[i], supply);
				System.out.println("Player "+(i+1)+":");
				takeTurn.takeTurn(players[i], players, supply);
			}
		}

		for(int i=0; i<numberOfPlayers; i++){
			victoryPoints[i] = players[i].countPoints();
		}

		for (int i = 1; i < numberOfPlayers; i++) {
		    if (victoryPoints[i] > victoryPoints[winnerIndex]) {
		      winnerIndex = i;
		    }
		}
		
		System.out.println("Player " +(winnerIndex+1)+" wins with "+victoryPoints[winnerIndex]+ " points");
	}

}
