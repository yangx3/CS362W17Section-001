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
		
		//Play the game
		while(true)
		{
			executeTurn(player1, player2);
			if(gameDone())
				break;
			executeTurn(player2, player1);
			if(gameDone())
				break;
		}
			
	}
	
	private void executeTurn(Player current, Player opponent)
	{
		int actions = 1;
		int buys = 1;
		int treasure = 0;
		int handIndex = 0;
		
		//Action phase
		while(actions != 0)
		{
			displayHand(current);
			//Get input for what card to play
			playCard(current.getCard(2, handIndex));
		}
		
	}
	
	private void displayHand(Player player)
	{
		
	}
	
	private void playCard(Card card)//Figure out how to keep track of the game state
	{
		
	}
	
	
	public boolean gameDone()
	{
		
		return false;
	}
	
	public void cardEffect(int index, Player current, Player opponent)
	{
		switch (index)
		{
			case 0:
				smithy(current, opponent);
				break;
			case 1:
				courtroom(current, opponent);
				break;
			case 2:
				witch(current, opponent);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			default:
				System.out.println("Card Function Does Not Exist.");
				break;
			
		}
	}
	
	private void smithy(Player currentPlayer, Player otherPlayer)
	{
		for (int i = 0; i < 3; i++) {
			currentPlayer.draw();
		}
	}
	
	private void courtroom(Player currentPlayer, Player otherPlayer)
	{
		for (int i = 0; i < 4; i++) {
			currentPlayer.draw();
		}
		otherPlayer.draw();
	}
	
	private void witch(Player currentPlayer, Player otherPlayer)
	{
		for (int i = 0; i < 2; i++) {
			currentPlayer.draw();
		}
		otherPlayer.addCard(1, new victoryCard(0, -1, "Curse"));
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new playDominion();	//Start to play the game
	}

}
