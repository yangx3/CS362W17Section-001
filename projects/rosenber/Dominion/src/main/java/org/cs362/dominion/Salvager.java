package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;

public class Salvager extends Card{

	public Salvager(){
		super("Salvager", 4, 0, 0,
				new CardType[] {CardType.Action});
	}
	//performs the cards action
	public void Action(ArrayList<Player> players,
			Player currentPlayer, Board board){
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
}
