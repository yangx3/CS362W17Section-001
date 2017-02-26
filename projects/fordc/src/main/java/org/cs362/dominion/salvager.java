package org.cs362.dominion;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class salvager extends card{
	public salvager(){
		name = "salvager";
		type = "action";
		cost = 4;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 1;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		Scanner sc = new Scanner(System.in); 

		System.out.println("Salvages riches!");
		System.out.println();

		//Give the player another buy
		player_array[turn].buy += 1;

		//Check if the player has more than one card
		if(player_array[turn].player_hand.num_cards < 2){
			System.out.println("You do not have any cards to salvage!");
			return;
		}

		player_array[turn].player_hand.show_hand();

		int answer = -1;
		while(answer < 0 || answer >= player_array[turn].player_hand.num_cards){
			System.out.print("Which card would you like to salvage? ");
//			answer = sc.nextInt()-1;
			answer = ThreadLocalRandom.current().nextInt(0, player_array[turn].player_hand.num_cards-1);
			if(answer < 0 || answer >= player_array[turn].player_hand.num_cards){
				System.out.println("Please enter a valid card slot.");
			}
		}

		//Trash the salvaged card and add currency equal to the cost
		int salvage = player_array[turn].player_hand.player_hand[answer].cost;
		player_array[turn].gold += salvage;
		dominion.trash_pile.add_card(player_array[turn].player_hand.remove_card(answer));

	}

	public void description(){
		System.out.println("+1 buy/Trash a card from your hand. Add currency equal to its cost.");
	}
}
