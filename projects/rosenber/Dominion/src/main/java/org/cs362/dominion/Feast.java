package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Feast extends Card {

	public Feast(){
		super("Feast", 4, 0, 0,
				new CardType[] {CardType.Action});
	}
	public void Action(ArrayList<Player> players,
			Player currentPlayer, Board board){
		if(currentPlayer.checkAi()){
			AIAction(players, currentPlayer, board);
			return;
		}
		board.addToTrash(this);
		Scanner input = new Scanner(System.in);
		boolean repeat;
		do{
			repeat = false;
			System.out.println("Choose a card costing up to 5\n>");
			String ans = input.nextLine();
			try{
				Card choice = board.lookAtDeck(board.getDeckIdx(ans));
				if(choice.getCost() <= 5){
					currentPlayer.giveCard(board.draw(board.getDeckIdx(ans)));
				}
				else{
					System.out.println("That choice is not valid.\n"
							+ "The card must cost up to 5. Try again!");
					repeat = true;
				}
			}
			catch(Exception e){
				System.out.println("That name is not valid. Try again!");
				repeat = true;
			}
		}while(repeat);
		input.close();
	};
	private void AIAction(ArrayList<Player> players,
			Player currentPlayer, Board board){
		board.addToTrash(this);
		int choice = -1;
		Random rand = new Random();
		do{
			choice = -1;
			while(choice < 1)
				choice = rand.nextInt(board.numDecks());
		}while(board.lookAtDeck(choice).getCost() > 5);
		currentPlayer.giveCard(board.draw(choice));
	}
}
