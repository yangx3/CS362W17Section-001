package org.cs362.dominion;

import java.util.Random;

public class RandomTestDominion {
	public static void main(String args[]) {
		int iterations;
		if(args.length > 0) {
			iterations = Integer.parseInt(args[0]);
			
			for(int i=0; i<iterations; i++) {
				try {
					Random generator = new Random(10);
				    int numPlayers = generator.nextInt(3)+1;
					DominionBoard board = new DominionBoard();
					GameState state = new GameState(board, numPlayers);
				
					while(true) {
						String currentPlayer = state.currentPlayer.GetName();
						int playerCount = state.otherPlayers.size();
						
						state.TakeTurn();
						
						if (currentPlayer == state.currentPlayer.GetName()) {
							System.out.println("Error: currentPlayer has not changed after turn");
							break;
						}
						if(playerCount != state.otherPlayers.size()) {
							System.out.println("Error: Player count inconsistent");
							break;
						}
						if(board.GameOver()) {
							break;
						}
					}
					
					System.out.println("Finished game.");
					state.PrintScore();
				} catch(Exception e) {
					System.out.println("An error occurred!");
					System.out.println("Error: " + e.toString());
					System.out.println("Cause: " + e.getCause());
					continue;
				}
			}
		}
		else {
			System.out.println("Number of tests to perform not specified!");
			System.exit(1);
		}
	}
}
