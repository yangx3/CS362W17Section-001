package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ambassador extends Card{
	
	public Ambassador(){
		super("Ambassador", 3, 0, 0, 
				new CardType[] {CardType.Action, CardType.Attack});
	}
	//performs the cards action
	public void Action(ArrayList<Player> players,
			Player currentPlayer, Board board){
		Attack(players, currentPlayer, board);
	};
		
	//performs the cards attack
	public void Attack(ArrayList<Player> players,
			Player currentPlayer, Board board){
		Scanner input = new Scanner(System.in);
		boolean repeat;
		Card choice = null;
		do{
			repeat = false;
			System.out.println("Which card would you like to reveal?\n>");
			String ans = input.nextLine();
			try{
				choice = currentPlayer.playCard(ans);
				board.addToDeck(choice, board.getDeckIdx(ans));
				System.out.println("Would you like to add a second?\n(y/n");
				ans = input.nextLine();
				if(ans == "y"){
					try{
						board.addToDeck(currentPlayer.playCard(choice.getName()), 
								board.getDeckIdx(choice.getName()));
					}
					catch(Exception e){
						System.out.println("You don't have another!");
					}
				}
				for(int j=0; j<players.size(); j++){
					if(players.get(j) != currentPlayer)
						players.get(j).giveCard(board.draw(board.getDeckIdx(choice.getName())));
				}
			}
			catch(Exception e){
				System.out.println("That wasn't a valid option, try again!");
				repeat = true;
			}
		}while(repeat);
		input.close();
	};
}
