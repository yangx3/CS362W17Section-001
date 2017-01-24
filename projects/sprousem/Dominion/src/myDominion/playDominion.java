package myDominion;

import java.util.Scanner;

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
		turnState state = new turnState(current, opponent);
		int handIndex = 0;
		//Action phase
		while(state.getActions() != 0 && current.getSize(2) != 0)
		{
			state.printInfo();
			displayHand(current);
			//Get input for what card to play
			
			System.out.println("Which card you like to play?");
			handIndex = chooseNum(-2, current.getSize(2));
			
			if(handIndex == -1)//-1 means endturn
				break;
			
			state = playCard(current.getCard(2, handIndex), state);
			current.addCard(2, 3, handIndex);//Move card from hand to played
		}
		current.turnConclusion();
		
	}
	
	private int chooseNum(int lower, int upper)
	{
		int input;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		input = reader.nextInt();
		while(input <= lower || input >= upper)
		{
			System.out.println("Invalid input, please choose between " + lower + " and " + upper + ".");
			input = reader.nextInt();
		}
		return input;
	}
	
	private void displayHand(Player player)
	{
		for (int i = 0; i < player.getSize(2); i++) {
			System.out.println(i + ": ");
			player.getCard(2, i).printInfo();
		}
	}
	
	private turnState playCard(Card card, turnState state)
	{
		int temp;
		temp = state.getTreasure();
		state.setTreasure(card.getTreasure() + temp);//This can be done for all cards
		
		if(card.getType() == 2)//More must be done when a kingdom card is played
		{
			cardEffect(((kingdomCard) (card)).getFunctionIndex(), state);
		}
		
		return state;
	}
	
	
	public boolean gameDone()
	{
		
		return false;
	}
	
	public turnState cardEffect(int index, turnState state)
	{
		switch (index)
		{
			case 0:
				smithy(state);
				break;
			case 1:
				courtroom(state);
				break;
			case 2:
				witch(state);
				break;
			case 3:
				gardens(state);
				break;
			case 4:
				remodel(state);
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
		return state;

	}
	
	private turnState smithy(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		Player otherPlayer = state.getOpponent();
		
		for (int i = 0; i < 3; i++) {
			currentPlayer.draw();
		}
		return state;
	}
	
	private turnState courtroom(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		Player otherPlayer = state.getOpponent();
		
		for (int i = 0; i < 4; i++) {
			currentPlayer.draw();
		}
		otherPlayer.draw();
		return state;
	}
	
	private turnState witch(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		Player otherPlayer = state.getOpponent();
		
		for (int i = 0; i < 2; i++) {
			currentPlayer.draw();
		}
		otherPlayer.addCard(1, new victoryCard(0, -1, "Curse"));
		return state;
	}
	
	private turnState gardens(turnState state)
	{
		
		
		return state;
	}
	
	private turnState remodel(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		Player otherPlayer = state.getOpponent();
		
		return state;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new playDominion();	//Start to play the game
	}

}
