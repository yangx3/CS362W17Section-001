package org.cs362.dominion;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ambassador extends card{
	public ambassador(){
		name = "ambassador";
		type = "action attack";
		cost = 3;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		Scanner sc = new Scanner(System.in);

		System.out.println("Ambassador does a thing!");
		int choice = -1;

		//Ask the player to discard to the supply pile
		while(choice < 0 || choice >= player_array[turn].player_hand.num_cards){
			System.out.print("Which card do you select? ");
//			choice = sc.nextInt()-1;
			choice = ThreadLocalRandom.current().nextInt(0, player_array[turn].player_hand.num_cards);
			if(choice < 0 || choice >= player_array[turn].player_hand.num_cards){
				System.out.println("Please enter a valid card slot.");
			}
		}

		//Show the card and ask the player if they want to discard
		card discard_card = player_array[turn].player_hand.player_hand[choice];
		System.out.format("Player %d has selected %s!\n\n", turn+1, discard_card.name);

		int answer = 2;
		while(answer != 0 && answer != 1){
			System.out.print("Would you like to discard the card? (y=1/n=0) ");
//			answer = sc.nextInt();
			answer = ThreadLocalRandom.current().nextInt(0, 2);
			if(answer != 0 && answer != 1){
				System.out.println("Please enter 1 for yes and 0 for no.");
			}
		}
		//If yes, move the discard card to the supply pile
		if(answer == 1){
			discard_card = player_array[turn].player_hand.remove_card(choice);
			if(discard_card.name == "estate"){
			dominion.estate.num_cards += 1;
			}
			else if(discard_card.name == "duchy"){
				dominion.duchy.num_cards += 1;
			}
			else if(discard_card.name == "province"){
				dominion.province.num_cards += 1;
			}
			else if(discard_card.name == "curse"){
				dominion.curse.num_cards += 1;
			}
			else if(discard_card.name == "copper"){
				dominion.copper.num_cards += 1;
			}
			else if(discard_card.name == "silver"){
				dominion.silver.num_cards += 1;
			}
			else if(discard_card.name == "gold"){
				dominion.gold.num_cards += 1;
			}
			else if(discard_card.name == "embargo"){
				dominion.embargo.num_cards += 1;
			}
			else if(discard_card.name == "ambassador"){
				dominion.ambassador.num_cards += 1;
			}
			else if(discard_card.name == "great_hall"){
				dominion.great_hall.num_cards += 1;
			}
			else if(discard_card.name == "village"){
				dominion.village.num_cards += 1;
			}
			else if(discard_card.name == "baron"){
				dominion.baron.num_cards += 1;
			}
			else if(discard_card.name == "cutpurse"){
				dominion.cutpurse.num_cards += 1;
			}
			else if(discard_card.name == "feast"){
				dominion.feast.num_cards += 1;
			}
			else if(discard_card.name == "gardens"){
				dominion.gardens.num_cards += 1;
			}
			else if(discard_card.name == "salvager"){
				dominion.salvager.num_cards += 1;
			}
			else if(discard_card.name == "smithy"){
				dominion.smithy.num_cards += 1;
			}
			else if(discard_card.name == "council_room"){
				dominion.council_room.num_cards += 1;
			}
			else if(discard_card.name == "mine"){
				dominion.mine.num_cards += 1;
			}
			else if(discard_card.name == "adventurer"){
				dominion.adventurer.num_cards += 1;
			}
		

			answer = 2;
			int choice_2 = -1;
			//Check if the player has another copy in their hand
			for(int i = 0; i < player_array[turn].player_hand.num_cards; i++){
				if(player_array[turn].player_hand.player_hand[i].name == discard_card.name){
					choice_2 = i;
					//Ask the player if they'd like to discard a second copy
					System.out.println();
					while(answer != 1 && answer != 0){
						System.out.print("Would you like to discard another card of the same name? (y=1/n=0) ");
//						answer = sc.nextInt();
						answer = ThreadLocalRandom.current().nextInt(0,2);
						if(answer != 1 && answer != 0){
							System.out.println("Please enter 1 for yes and 0 for no.");
						}
					}
					break;
				}
			}
	
			//If answer is yes, discard the next card with the same name
			if(answer == 1){
				discard_card = player_array[turn].player_hand.remove_card(choice_2);
				if(discard_card.name == "estate"){
				dominion.estate.num_cards += 1;
				}
				else if(discard_card.name == "duchy"){
					dominion.duchy.num_cards += 1;
				}
				else if(discard_card.name == "province"){
					dominion.province.num_cards += 1;
				}
				else if(discard_card.name == "curse"){
					dominion.curse.num_cards += 1;
				}
				else if(discard_card.name == "copper"){
					dominion.copper.num_cards += 1;
				}
				else if(discard_card.name == "silver"){
					dominion.silver.num_cards += 1;
				}
				else if(discard_card.name == "gold"){
					dominion.gold.num_cards += 1;
				}
				else if(discard_card.name == "embargo"){
					dominion.embargo.num_cards += 1;
				}
				else if(discard_card.name == "ambassador"){
					dominion.ambassador.num_cards += 1;
				}
				else if(discard_card.name == "great_hall"){
					dominion.great_hall.num_cards += 1;
				}
				else if(discard_card.name == "village"){
					dominion.village.num_cards += 1;
				}
				else if(discard_card.name == "baron"){
					dominion.baron.num_cards += 1;
				}
				else if(discard_card.name == "cutpurse"){
					dominion.cutpurse.num_cards += 1;
				}
				else if(discard_card.name == "feast"){
					dominion.feast.num_cards += 1;
				}
				else if(discard_card.name == "gardens"){
					dominion.gardens.num_cards += 1;
				}
				else if(discard_card.name == "salvager"){
					dominion.salvager.num_cards += 1;
				}
				else if(discard_card.name == "smithy"){
					dominion.smithy.num_cards += 1;
				}
				else if(discard_card.name == "council_room"){
					dominion.council_room.num_cards += 1;
				}
				else if(discard_card.name == "mine"){
					dominion.mine.num_cards += 1;
				}
				else if(discard_card.name == "adventurer"){
					dominion.adventurer.num_cards += 1;
				}
			}
		}

		//Give the other players a copy of the selected card
		int other_turn = -1;
		for(int i = 0; i < dominion.num_players; i++){
			if(turn == dominion.num_players-1){
				other_turn = 0;
			}
			else{
				other_turn++;
			}
	
			player_array[other_turn].player_discard.add_card(discard_card);
			if(discard_card.name == "estate" && dominion.estate.num_cards != 0){
				dominion.estate.num_cards -= 1;
			}
			else if(discard_card.name == "duchy" && dominion.duchy.num_cards != 0){
				dominion.duchy.num_cards -= 1;
			}
			else if(discard_card.name == "province" && dominion.province.num_cards != 0){
				dominion.province.num_cards -= 1;
			}
			else if(discard_card.name == "curse" && dominion.curse.num_cards != 0){
				dominion.curse.num_cards -= 1;
			}
			else if(discard_card.name == "copper" && dominion.copper.num_cards != 0){
				dominion.copper.num_cards -= 1;
			}
			else if(discard_card.name == "silver" && dominion.silver.num_cards != 0){
				dominion.silver.num_cards -= 1;
			}
			else if(discard_card.name == "gold" && dominion.gold.num_cards != 0){
				dominion.gold.num_cards -= 1;
			}
			else if(discard_card.name == "embargo" && dominion.embargo.num_cards != 0){
				dominion.embargo.num_cards -= 1;
			}
			else if(discard_card.name == "ambassador" && dominion.ambassador.num_cards != 0){
				dominion.ambassador.num_cards -= 1;
			}
			else if(discard_card.name == "great_hall" && dominion.great_hall.num_cards != 0){
				dominion.great_hall.num_cards -= 1;
			}
			else if(discard_card.name == "village" && dominion.village.num_cards != 0){
				dominion.village.num_cards -= 1;
			}
			else if(discard_card.name == "baron" && dominion.baron.num_cards != 0){
				dominion.baron.num_cards -= 1;
				}
			else if(discard_card.name == "cutpurse" && dominion.cutpurse.num_cards != 0){
				dominion.cutpurse.num_cards -= 1;
			}
			else if(discard_card.name == "feast" && dominion.feast.num_cards != 0){
				dominion.feast.num_cards -= 1;
			}
			else if(discard_card.name == "gardens" && dominion.gardens.num_cards != 0){
				dominion.gardens.num_cards -= 1;
			}
			else if(discard_card.name == "salvager" && dominion.salvager.num_cards != 0){
				dominion.salvager.num_cards -= 1;
			}
			else if(discard_card.name == "smithy" && dominion.smithy.num_cards != 0){
					dominion.smithy.num_cards -= 1;
			}
			else if(discard_card.name == "council_room" && dominion.council_room.num_cards != 0){
				dominion.council_room.num_cards -= 1;
			}
			else if(discard_card.name == "mine" && dominion.mine.num_cards != 0){
				dominion.mine.num_cards -= 1;
			}
			else if(discard_card.name == "adventurer" && dominion.adventurer.num_cards != 0){
				dominion.adventurer.num_cards -= 1;
			}
		}
	}

	public void description(){
		System.out.println("Reveal a card from your hand. Return up to 2 copies of it from your");
		System.out.println(" hand to the supply. Then each other player gains a copy of it");
	}
}
