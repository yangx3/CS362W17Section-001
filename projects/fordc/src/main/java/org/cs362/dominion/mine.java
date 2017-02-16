package org.cs362.dominion;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class mine extends card{
	public mine(){
		name = "mine";
		type = "action";
		cost = 5;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		Scanner sc = new Scanner(System.in);

		System.out.println("Ores everywhere!");
		System.out.println();

		int answer = -1;
		player_array[turn].player_hand.show_hand();
		//Check if the player has a treasure card
		for(int i = 0; i < player_array[turn].player_hand.num_cards; i++){
			if(player_array[turn].player_hand.player_hand[i].type == "treasure"){
				do{
					System.out.print("Which treasure card would you like to trash? ");
//					answer = sc.nextInt() - 1;
					answer = ThreadLocalRandom.current().nextInt(0, player_array[turn].player_hand.num_cards);
					if(answer < 0 || answer >= player_array[turn].player_hand.num_cards
						|| player_array[turn].player_hand.player_hand[answer].type != "treasure"){
						System.out.println("Please enter a valid card slot.");
					}
				}while(answer < 0 || answer >= player_array[turn].player_hand.num_cards
					|| player_array[turn].player_hand.player_hand[answer].type != "treasure");
				
				//Trash the card and upgrade the treasure
				if(player_array[turn].player_hand.player_hand[answer].name == "copper"
						&& dominion.silver.num_cards != 0){
					dominion.trash_pile.add_card(player_array[turn].player_hand.remove_card(answer));
					card dummy_silver = new silver();
					player_array[turn].player_hand.add_card(dummy_silver);
					dominion.silver.num_cards -= 1;
				}
				else if(player_array[turn].player_hand.player_hand[answer].name == "silver"
						&& dominion.gold.num_cards != 0){
					dominion.trash_pile.add_card(player_array[turn].player_hand.remove_card(answer));
					card dummy_gold = new gold();
					player_array[turn].player_hand.add_card(dummy_gold);
					dominion.gold.num_cards -= 1;
				}
				else if(player_array[turn].player_hand.player_hand[answer].name == "gold"
						&& dominion.gold.num_cards != 0){
					dominion.trash_pile.add_card(player_array[turn].player_hand.remove_card(answer));
					card dummy_gold = new gold();
					player_array[turn].player_hand.add_card(dummy_gold);
					dominion.gold.num_cards -= 1;
				}
				else{
					System.out.println("There are no cards left in the upgraded pile.");
				}
				break;
			}
		}
	}

	public void description(){
		System.out.println("You may trash a treasure from your hand. Gain a treasure ");
		System.out.println("to your hand costing up to 3 currency more than it.");
	}
}
