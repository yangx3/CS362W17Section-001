package org.cs362.dominion;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class feast extends card{
	public feast(){
		name = "feast";
		type = "action";
		cost = 4;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		Scanner sc = new Scanner(System.in);

		System.out.println("Feast on this!");
		System.out.println();

		//Ask the player what card they'd like to buy that's 5 cost or lower
		int answer;
		do{
			System.out.print("Please enter the card you'd like that's 5 cost or below (1-19): ");
//			answer = sc.nextInt();
			answer = ThreadLocalRandom.current().nextInt(1, 19);
			if(answer == 1 && dominion.estate.num_cards != 0){
				card dummy = new estate();
				player_array[turn].player_discard.add_card(dummy);
				dominion.estate.num_cards -= 1;
			}
			else if(answer == 2 && dominion.duchy.num_cards != 0){
				card dummy = new duchy();
				player_array[turn].player_discard.add_card(dummy);
				dominion.duchy.num_cards -= 1;
			}
			else if(answer == 3 && dominion.province.num_cards != 0){
				card dummy = new province();
				player_array[turn].player_discard.add_card(dummy);
				dominion.province.num_cards -= 1;
			}
			else if(answer == 4 && dominion.curse.num_cards != 0){
				card dummy = new curse();
				player_array[turn].player_discard.add_card(dummy);
				dominion.curse.num_cards -= 1;
			}
			else if(answer == 5 && dominion.copper.num_cards != 0){
				card dummy = new copper();
				player_array[turn].player_discard.add_card(dummy);
				dominion.copper.num_cards -= 1;
			}
			else if(answer == 6 && dominion.silver.num_cards != 0){
				card dummy = new silver();
				player_array[turn].player_discard.add_card(dummy);
				dominion.silver.num_cards -= 1;
			}
			else if(answer == 7 && dominion.gold.num_cards != 0){
				card dummy = new gold();
				player_array[turn].player_discard.add_card(dummy);
				dominion.gold.num_cards -= 1;
			}
			else if(answer == 8 && dominion.embargo.num_cards != 0){
				card dummy = new embargo();
				player_array[turn].player_discard.add_card(dummy);
				dominion.embargo.num_cards -= 1;
			}
			else if(answer == 9 && dominion.ambassador.num_cards != 0){
				card dummy = new ambassador();
				player_array[turn].player_discard.add_card(dummy);
				dominion.ambassador.num_cards -= 1;
			}
			else if(answer == 10 && dominion.great_hall.num_cards != 0){
				card dummy = new great_hall();
				player_array[turn].player_discard.add_card(dummy);
				dominion.great_hall.num_cards -= 1;
			}
			else if(answer == 11 && dominion.village.num_cards != 0){
				card dummy = new village();
				player_array[turn].player_discard.add_card(dummy);
				dominion.village.num_cards -= 1;
			}
			else if(answer == 12 && dominion.baron.num_cards != 0){
				card dummy = new baron();
				player_array[turn].player_discard.add_card(dummy);
				dominion.baron.num_cards -= 1;
			}
			else if(answer == 13 && dominion.cutpurse.num_cards != 0){
				card dummy = new cutpurse();
				player_array[turn].player_discard.add_card(dummy);
				dominion.cutpurse.num_cards -= 1;
			}
			else if(answer == 14 && dominion.feast.num_cards != 0){
				card dummy = new feast();
				player_array[turn].player_discard.add_card(dummy);
				dominion.feast.num_cards -= 1;
			}
			else if(answer == 15 && dominion.gardens.num_cards != 0){
				card dummy = new gardens();
				player_array[turn].player_discard.add_card(dummy);
				dominion.gardens.num_cards -= 1;
			}
			else if(answer == 16 && dominion.salvager.num_cards != 0){
				card dummy = new salvager();
				player_array[turn].player_discard.add_card(dummy);
				dominion.salvager.num_cards -= 1;
			}
			else if(answer == 17 && dominion.smithy.num_cards != 0){
				card dummy = new smithy();
				player_array[turn].player_discard.add_card(dummy);
				dominion.smithy.num_cards -= 1;
			}
			else if(answer == 18 && dominion.council_room.num_cards != 0){
				card dummy = new council_room();
				player_array[turn].player_discard.add_card(dummy);
				dominion.council_room.num_cards -= 1;
			}
			else if(answer == 19 && dominion.mine.num_cards != 0){
				card dummy = new mine();
				player_array[turn].player_discard.add_card(dummy);
				dominion.mine.num_cards -= 1;
			}
			else{
				System.out.println("Please enter a number between 1 and 19.");
			}


		}while(answer < 1 || answer > 19);
	}

	public void description(){
		System.out.println("Trash this card. Gain a card costing up to 5 currency");
	}

}
