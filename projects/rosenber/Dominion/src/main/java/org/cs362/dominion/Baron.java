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
		if(currentPlayer.checkAi()){
			AIAttack(players, currentPlayer, board);
			return;
		}
		//TODO: implement non-ai version
	};
	
	private void AIAttack(ArrayList<Player> players,
			Player currentPlayer, Board board){
		
	}
}
