package org.cs362.dominion;

public class duchy extends card{
	public duchy(){
		name = "duchy";
		type = "victory";
		cost = 5;
		gold = 0;
		victory_points = 3;
		action = 0;
		buy = 0;
		card = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentionally left blank
	}

	public void description(){
		System.out.println("Duchy: A victory card that gives the player 3 victory point at the end of the game");
		System.out.println();
	}


}
