package org.cs362.dominion;

public class silver extends card{
	public silver(){
		name = "silver";
		type = "treasure";
		cost = 3;
		gold = 2;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentionally left blank
	}

	public void description(){
		System.out.println("Silver: A treasure card that gives 2 gold to a players purse.");
		System.out.println();
	}
}
