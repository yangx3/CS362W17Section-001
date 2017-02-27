package org.cs362.dominion;
public class gardens extends card{
	public gardens(){
		name = "gardens";
		type = "victory";
		cost = 4;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentially left blank
		//The victory points will be tallied during the end phase of the game
	}

	public void description(){
		System.out.println("Worth 1 victory point per 10 cards you have (round down).");
	}
}
