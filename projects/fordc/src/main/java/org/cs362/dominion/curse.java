package org.cs362.dominion;
public class curse extends card{
	public curse(){
		name = "curse";
		type = "curse";
		cost = 0;
		gold = 0;
		victory_points = -1;
		action = 0;
		buy = 0;
		card = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentionally left blank
	}

	public void description(){
		System.out.println("Curse: A card that gives -1 to a players victory points.");
		System.out.println();
	}
}
