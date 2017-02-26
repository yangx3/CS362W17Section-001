package org.cs362.dominion.Dominion;

public class PlayDominion {

	public void initializeGame(int players, int bots, boolean loud) {
		GameState g = new GameState(players, bots, loud);
		while(g.newTurn()) {
			// do nothing
		}
	}
		
	public static void main(String[] args) {
		int players = 2, bots = 1;
		boolean loud = true;
		if (args.length > 0)
			players = Integer.parseInt(args[0]);
		if (args.length > 1)
			bots = Integer.parseInt(args[1]);
		if (args.length > 2)
			loud = Boolean.valueOf(args[2]);
		System.out.println("Let the game begin\n");
		PlayDominion d = new PlayDominion();
		d.initializeGame(players, bots, loud);
	}
}
