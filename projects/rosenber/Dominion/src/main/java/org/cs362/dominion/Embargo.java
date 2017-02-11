package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;

public class Embargo extends Card{

	public Embargo(){
		super("Embargo", 2, 0, 0,
				new CardType[] {CardType.Action});
	}
	public void Action(ArrayList<Player> players,
			Player currentPlayer, Board board){
		currentPlayer.addMoney(2);
		board.addToTrash(this);
		boolean repeat;
		Scanner input = new Scanner(System.in);
		do{
			repeat = false;
			System.out.println("Which supply pile would you like to add an embargo to?\n >");
			String ans = input.nextLine();
			try{
				board.getDeck(board.getDeckIdx(ans)).addEmbargos(1);
			}
			catch(Exception e){
				System.out.println("That was not a valid name. Try again!");
				repeat = true;
			}
		}while(repeat);
		input.close();
	};
	
}
