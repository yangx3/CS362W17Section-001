package org.cs362.dominion;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class embargo extends card{
	public embargo(){
		name = "embargo";
		type = "action";
		cost = 2;
		gold = 2;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Embargo'd baby!!");

		Scanner sc = new Scanner(System.in);

		//Give the player 2 currency
		player_array[turn].gold += 2;

		//Put a token on any pile
		int choice;
		do{	
			System.out.print("Which pile woulc you like to add a token? (1-20) ");
//			choice = sc.nextInt();
			choice = ThreadLocalRandom.current().nextInt(1, 20);

			if(choice == 1){
				dominion.estate.num_tokens += 1;
			}
			else if(choice == 2){
				dominion.duchy.num_tokens += 1;
			}
			else if(choice == 3){
				dominion.province.num_tokens += 1;
			}
			else if(choice == 4){
				dominion.curse.num_tokens += 1;
			}
			else if(choice == 5){
				dominion.copper.num_tokens += 1;
			}
			else if(choice == 6){
				dominion.silver.num_tokens += 1;
			}
			else if(choice == 7){
				dominion.gold.num_tokens += 1;
			}
			else if(choice == 8){
				dominion.embargo.num_tokens += 1;
			}
			else if(choice == 9){
				dominion.ambassador.num_tokens += 1;
			}
			else if(choice == 10){
				dominion.great_hall.num_tokens += 1;
			}
			else if(choice == 11){
				dominion.village.num_tokens += 1;
			}
			else if(choice == 12){
				dominion.baron.num_tokens += 1;
			}
			else if(choice == 13){
				dominion.cutpurse.num_tokens += 1;
			}
			else if(choice == 14){
				dominion.feast.num_tokens += 1;
			}
			else if(choice == 15){
				dominion.gardens.num_tokens += 1;
			}
			else if(choice == 16){
				dominion.salvager.num_tokens += 1;
			}
			else if(choice == 17){
				dominion.smithy.num_tokens += 1;
			}
			else if(choice == 18){
				dominion.council_room.num_tokens += 1;
			}
			else if(choice == 19){
				dominion.mine.num_tokens += 1;
			}
			else if(choice == 20){
				dominion.adventurer.num_tokens += 1;
			}
			else{
				System.out.println("Please enter a number between 1 and 20.");
			}

		}while(choice < 1 || choice > 20);

	}

	public void description(){
		System.out.println("+2 currency/Trash this card. Put an embargo token on top of a supply pile.");
		System.out.println("When a player buys a card, he gains a curse card per embargo token on that pile");
	}
}
