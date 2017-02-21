package org.cs362.dominion;

public class copper extends card{
	public copper(){
		name = "copper";
		type = "treasure";
		cost = 0;
		gold = 1;
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
		System.out.println("Copper: A treasure card that gives 1 gold to a players purse.");
		System.out.println();
	}
	
}
