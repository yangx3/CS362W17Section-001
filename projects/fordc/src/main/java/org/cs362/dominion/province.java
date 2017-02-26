package org.cs362.dominion;

public class province extends card{
	public province(){
		name = "province";
		type = "victory";
		cost = 8;
		gold = 0;
		victory_points = 6;
		action = 0;
		buy = 0;
		card = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentionally left blank
	}

	public void description(){
		System.out.println("Province: A victory card that gives the player 6 victory point at the end of the game");
		System.out.println();
	}

}
