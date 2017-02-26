package org.cs362.dominion;

public class gold extends card{
	public gold(){
		name = "gold";
		type = "treasure";
		cost = 6;
		gold = 3;
		victory_points = 0;
		action = 0;
		buy = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentionally left blank
	}

	public void description(){
		System.out.println("Gold: A treasure card that gives 3 gold to a players purse.");
		System.out.println();
	}
}
