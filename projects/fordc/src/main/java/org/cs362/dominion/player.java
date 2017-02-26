package org.cs362.dominion;

public class player{
	int gold;              //The amount of money the player has
	int victory_points;    //The number of victory points the player has
	int action;            //The number of actions a player has
	int buy;               //The number of buys a player has

	hand player_hand;         //The players hand
	deck player_deck;         //The players deck
	discard player_discard;   //The players discard pile

	public player(){
		gold = 0;
		victory_points = 0;
		action = 1;
		buy = 1;
		player_hand = new hand();
		player_deck = new deck();
		player_discard = new discard();
	}

	public void print_player(){
		//print out the amount of gold the player has
		System.out.print("Gold: ");
		System.out.println(gold);
		
		//Print the number of actions a player has
		System.out.print("Actions: ");
		System.out.println(action);

		//Print the number of buys a player has
		System.out.print("Buys: ");
		System.out.println(buy);

		System.out.println();

		//Print the players hand
		player_hand.show_hand();
	}
}

