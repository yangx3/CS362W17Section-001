package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;

public class Baron extends Card{

	public Baron(){
		super("Baron", 4, 0, 0,
				new CardType[] {CardType.Action});
	}
	public void Action(ArrayList<Player> players,
			Player currentPlayer, Board board){
		currentPlayer.addBuys(1);
		Scanner input = new Scanner(System.in);
		System.out.println("Discard an estate for +4 coins? If no, gain an estate\n(y/n)>");
		String ans = input.nextLine();
		if(ans == "y"){
			try{
				currentPlayer.discardCard("Estate");
				currentPlayer.addMoney(4);
			}
			catch(Exception e){
				System.out.println("You had no estate to discard, you gain one instead!");
				currentPlayer.giveCard(board.draw(board.getDeckIdx("Estate")));
			}
		}
		else
			currentPlayer.giveCard(board.draw(board.getDeckIdx("Estate")));	
		input.close();
	};
}
