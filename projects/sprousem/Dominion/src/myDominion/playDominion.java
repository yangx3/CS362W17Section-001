package myDominion;

public class playDominion 
{

	public playDominion()
	{
		//Game Setup
		
		//Create each player
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		//Create the starting decks for each player
		for(int i = 0; i < 7; i++)
		{
			player1.addCard(0, new treasureCard(0, 1, "Copper"));
			player2.addCard(0, new treasureCard(0, 1, "Copper"));
		}
		
		for(int i = 0; i < 3; i++)
		{
			player1.addCard(0, new victoryCard(2, 1, "Estate"));
			player2.addCard(0, new victoryCard(2, 1, "Estate"));
		}
		
		player1.shuffle();
		player1.turnConclusion();
		player2.shuffle();
		player2.turnConclusion();
		
		//End of Game Setup
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new playDominion();	//Start to play the game
	}

}
