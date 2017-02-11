package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Salvager extends Card{

	public Salvager(){
		super("Salvager", 4, 0, 0,
				new CardType[] {CardType.Action});
	}
	//performs the cards action
	public void Action(ArrayList<Player> players,
			Player currentPlayer, Board board){
		if(currentPlayer.checkAi()){
			AIAction(players, currentPlayer, board);
			return;
		}
			
		currentPlayer.addBuys(1);
		Card choice = null;
		boolean repeat;
		Scanner input = new Scanner(System.in);
		do{
			repeat = false;
			System.out.println("What card would you like to trash?\n"
					+ "You gain coins equal to its cost\n>");
			String ans = input.nextLine();
			try{
				choice = currentPlayer.playCard(ans);
				board.addToTrash(choice);
				currentPlayer.addMoney(choice.getCost());
			}
			catch(Exception e){
				System.out.println("That name isn't valid. Try again!");
				repeat = true;
			}
		}while(repeat);
		input.close();
	}
	
	private void AIAction(ArrayList<Player> players,
			Player currentPlayer, Board board){
		Random rand = new Random();
		int choice = rand.nextInt(currentPlayer.numCardsHand());
		Card c = currentPlayer.playCard(choice);
		board.addToTrash(c);
		currentPlayer.addMoney(c.getCost());
	}
}
