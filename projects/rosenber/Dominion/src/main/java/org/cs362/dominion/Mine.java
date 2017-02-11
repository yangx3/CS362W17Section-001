package org.cs362.dominion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Mine extends Card {

	public Mine(){
		super("Mine", 5, 0, 0,
				new CardType[] {CardType.Action});
	}
	//performs the cards action
	public void Action(ArrayList<Player> players,
		Player currentPlayer, Board board){
		if(currentPlayer.checkAi()){
			AIAction(players, currentPlayer, board);
			return;
		}
		boolean repeat;
		Scanner input = new Scanner(System.in);
		do{	
			repeat = false;
			System.out.println("What treasure card would you like to trash?\n >");
			String ans = input.nextLine();
			try{
				Card choice = currentPlayer.playCard(ans);
				if(choice.isCardType(CardType.Treasure)){
					board.addToTrash(choice);
					System.out.println("You may chose a treasure card costing "
							+ (choice.getCost()+3) + " or less");
					System.out.println("Which would you like?");
					ans = input.nextLine();
					try{
						Card nchoice = board.lookAtDeck(board.getDeckIdx(ans));
						if(nchoice.getCost() <= choice.getCost()+3){
							currentPlayer.giveCard(board.draw(board.getDeckIdx(ans)));
						}
						else{
							System.out.println("That card isn't valid.\n"
									+ "Must cost " +
									(choice.getCost() + 3) + " or less! Try again!");
							repeat = true;
						}
					}
					catch(Exception e){
						System.out.println("That name isn't valid. Try again!");
						repeat = true;
					}
				}
				else{
					System.out.println("That card isn't valid.\n"
							+ "Must be treasure type! Try again!");
					repeat = true;
				}
			}
			catch(Exception e){
				System.out.println("That name isn't valid. Try again!");
				repeat = true;
			}
		}while(repeat);
		input.close();
	};
	
	private void AIAction(ArrayList<Player> players,
		Player currentPlayer, Board board){
		
		Random rand = new Random();
		int choice = -1;
		Card c = null;
		do{
			choice = rand.nextInt(currentPlayer.numCardsHand());
			c = currentPlayer.lookAtCard(choice);
		}while(c.isCardType(CardType.Treasure));
		c = currentPlayer.playCard(choice);
		board.addToTrash(c);
		Card otherC = null;
		choice = -1;
		do{
			while(choice < 1)
				choice = rand.nextInt(board.numDecks());
			otherC = board.lookAtDeck(choice);
		}while(!otherC.isCardType(CardType.Treasure) && otherC.getCost() > c.getCost()+3);
		currentPlayer.giveCard(board.draw(choice));
	}
}
