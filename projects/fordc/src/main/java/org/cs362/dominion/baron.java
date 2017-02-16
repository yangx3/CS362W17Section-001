package org.cs362.dominion;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class baron extends card{
	public baron(){
		name = "baron";
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

		System.out.println("Baron von does stuff!");
		System.out.println();

		//Give the player 1 buy
		player_array[turn].buy += 1;
		
		int answer = 2;
		//Check if the player the player has an estate
		for(int i = 0; i < player_array[turn].player_hand.num_cards; i++){
			//If found, ask the player if they'd like to discard the estate for 4 currency
			if(player_array[turn].player_hand.player_hand[i].name == "estate"){
				do{
					System.out.print("Would you like to discard an estate for 4 currency? (y=1/n=0) ");
//					answer = sc.nextInt();
					answer = ThreadLocalRandom.current().nextInt(0, 2);
					if(answer != 1 && answer != 0){
						System.out.println("Please enter 1 for yes and 0 for no.");
					}
				}while(answer != 1 && answer != 0);
				//If yes, give the player 4 currency and move the estate to the discard
				if(answer == 1){
					player_array[turn].player_discard.add_card(player_array[turn].player_hand.remove_card(i));
					player_array[turn].gold += 4;
					return;
				}
				//If not, give the player an estate
				else{
					if(dominion.estate.num_cards != 0){
						card dummy_estate = new estate();
						player_array[turn].player_discard.add_card(dummy_estate);
						dominion.estate.num_cards -= 1;
						System.out.println("You have gained an estate!");
						System.out.println();
					}
					return;
				}
			}
		}
		if(dominion.estate.num_cards != 0){
			card dummy_estate = new estate();
			player_array[turn].player_discard.add_card(dummy_estate);
			dominion.estate.num_cards -= 1;
			System.out.println("You have gained an estate!");
			System.out.println();
		}
	}

	public void description(){
		System.out.println("+1 buy/You may discard an estate for 4 currency. If you don't, gain an estate.");
	}
}
