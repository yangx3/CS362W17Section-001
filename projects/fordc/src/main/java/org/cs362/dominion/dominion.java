package org.cs362.dominion;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class dominion{
	public static void main(String[] args){

		//Get input stream prepared
		Scanner sc = new Scanner(System.in);

		//Initiallize the dominion game board
		board dominion = new board();

		//Create array of players and have them draw 5 cards
		dominion.num_players = ThreadLocalRandom.current().nextInt(2, 5);
		player player_array[] = new player[dominion.num_players];
		for(int i = 0; i < dominion.num_players; i++){
			player_array[i] = new player();
			player_array[i].player_deck.shuffle();
			for(int j = 0; j < 5; j++){
				player_array[i].player_hand.add_card(player_array[i].player_deck.draw_card());	
			}
		}	


		int turn = 0; //Start with player "1"
		//Game loop
		while(dominion.province.num_cards != 0 && dominion.num_empty != 3){
			dominion.print_board();
			System.out.println();


			//Reset the player's values
			player_array[turn].buy = 1;
			player_array[turn].action = 1;
			player_array[turn].gold = 0;
			System.out.format("PLAYER %d: \n", turn+1);
			player_array[turn].print_player();
			System.out.println();

			//START THE ACTION PHASE
			System.out.println("ACTION PHASE");
			//Check if the player has action cards

			//For the number of cards in the players hand, check if its an action card
			boolean action_bool = false;
			for(int i = 0; i < player_array[turn].player_hand.num_cards; i++){
				if(player_array[turn].player_hand.player_hand[i].type == "action"
						|| player_array[turn].player_hand.player_hand[i].type == "action victory"
						|| player_array[turn].player_hand.player_hand[i].type == "action attack"){
					action_bool = true;
					break;
						}
			}

			if(action_bool == false){
				System.out.println("You have no action cards...");
				System.out.println();
			}
			else{
				int answer;
				//Action while loop
				while(player_array[turn].action > 0 && action_bool == true){
					action_bool = false;
					//For the number of cards in the players hand, check if its an action card
					for(int i = 0; i < player_array[turn].player_hand.num_cards; i++){
						if(player_array[turn].player_hand.player_hand[i].type == "action"
								|| player_array[turn].player_hand.player_hand[i].type == "action victory"
								|| player_array[turn].player_hand.player_hand[i].type == "action attack"){
							action_bool = true;
							break;
								}
					}
					if(action_bool == false){
						System.out.println("You have no action cards...");
					}
					else{
						player_array[turn].print_player();
						//Prompt the user
						System.out.print("Would you like to play an action card? (y=1/n=0) ");
	//					answer = sc.nextInt();
						answer = ThreadLocalRandom.current().nextInt(0, 2);
						System.out.println(answer);
						//if they say yes
						if(answer == 1){
							int card_num;
							//check if num is a valid card slot
							do{
								System.out.print("Which card would you like to play? ");
	//							card_num = sc.nextInt() - 1;
								card_num = ThreadLocalRandom.current().nextInt(0, player_array[turn].player_hand.num_cards);
								System.out.println(card_num);
								if(card_num < 0 || card_num >= player_array[turn].player_hand.num_cards
										|| player_array[turn].player_hand.player_hand[card_num].type != "action"
										&& player_array[turn].player_hand.player_hand[card_num].type != "action victory"
										&& player_array[turn].player_hand.player_hand[card_num].type != "action attack"){
									System.out.println("Please enter a valid card slot.");
										}
							}while(card_num < 0 || card_num >= player_array[turn].player_hand.num_cards
									|| player_array[turn].player_hand.player_hand[card_num].type != "action"
									&& player_array[turn].player_hand.player_hand[card_num].type != "action victory"
									&& player_array[turn].player_hand.player_hand[card_num].type != "action attack");


							//Store the card to be used
							card card_store = player_array[turn].player_hand.player_hand[card_num];
							//If the card requires it to be trashed to play
							if(player_array[turn].player_hand.player_hand[card_num].name == "embargo"
									||player_array[turn].player_hand.player_hand[card_num].name == "feast"){
								dominion.trash_pile.add_card(player_array[turn].player_hand.remove_card(card_num));
									}
							else{
								player_array[turn].player_discard.add_card(player_array[turn].player_hand.remove_card(card_num));
							}	
							//Perform the cards action, decrement actions, and move the card to the discard
							card_store.perform_attack(player_array, turn, dominion);
							player_array[turn].action -= 1;
						}

						//if they say no
						else if(answer == 0){
							System.out.println();
							break;
						}
						//if they input incorrectly
						else{
							System.out.println("Please enter 1 for yes and 0 for no");
						}
					}
				}
			}

			//START THE BUYING PHASE
			System.out.println("BUYING PHASE");

			for(int i = 0; i < player_array[turn].player_hand.num_cards; i++){
				if(player_array[turn].player_hand.player_hand[i].type == "treasure"){
					player_array[turn].gold += player_array[turn].player_hand.player_hand[i].gold;
				}
			}

			player_array[turn].print_player();
			System.out.println();

			//Buying loop
			while(player_array[turn].buy > 0){
				System.out.print("Would you like to buy? (y=1/n=0) ");
//				int start_answer = sc.nextInt();
				int start_answer = ThreadLocalRandom.current().nextInt(0,2);
				System.out.println(start_answer);
				//If no, skip buying phse
				if(start_answer == 0){
					break;
				}
				//If yes ask what the player would like to buy
				else if(start_answer == 1){
					System.out.print("What would you like to buy? (1-19) ");
			//		int buy_answer = sc.nextInt();
					int buy_answer = ThreadLocalRandom.current().nextInt(1, 19);
					System.out.println(buy_answer);
					if(buy_answer == 1 && dominion.estate.num_cards != 0){
						dominion.buy_estate(player_array[turn], dominion);
					}
					else if(buy_answer == 2 && dominion.duchy.num_cards != 0){
						dominion.buy_duchy(player_array[turn], dominion);
					}
					else if(buy_answer == 3 && dominion.province.num_cards != 0){
						dominion.buy_province(player_array[turn], dominion);
					}
					else if(buy_answer == 4 && dominion.curse.num_cards != 0){
						dominion.buy_curse(player_array[turn], dominion);
					}
					else if(buy_answer == 5 && dominion.copper.num_cards != 0){
						dominion.buy_copper(player_array[turn], dominion);
					}
					else if(buy_answer == 6 && dominion.silver.num_cards != 0){
						dominion.buy_silver(player_array[turn], dominion);
					}
					else if(buy_answer == 7 && dominion.gold.num_cards != 0){
						dominion.buy_gold(player_array[turn], dominion);
					}
					else if(buy_answer == 8 && dominion.embargo.num_cards != 0){
						dominion.buy_embargo(player_array[turn], dominion);
					}
					else if(buy_answer == 9 && dominion.ambassador.num_cards != 0){
						dominion.buy_ambassador(player_array[turn], dominion);
					}
					else if(buy_answer == 10 && dominion.great_hall.num_cards != 0){
						dominion.buy_great_hall(player_array[turn], dominion);
					}
					else if(buy_answer == 11 && dominion.village.num_cards != 0){
						dominion.buy_village(player_array[turn], dominion);
					}
					else if(buy_answer == 12 && dominion.baron.num_cards != 0){
						dominion.buy_baron(player_array[turn], dominion);
					}
					else if(buy_answer == 13 && dominion.cutpurse.num_cards != 0){
						dominion.buy_cutpurse(player_array[turn], dominion);
					}
					else if(buy_answer == 14 && dominion.feast.num_cards != 0){
						dominion.buy_feast(player_array[turn], dominion);
					}
					else if(buy_answer == 15 && dominion.gardens.num_cards != 0){
						dominion.buy_gardens(player_array[turn], dominion);
					}
					else if(buy_answer == 16 && dominion.salvager.num_cards != 0){
						dominion.buy_salvager(player_array[turn], dominion);
					}			
					else if(buy_answer == 17 && dominion.smithy.num_cards != 0){
						dominion.buy_smithy(player_array[turn], dominion);
					}			
					else if(buy_answer == 18 && dominion.council_room.num_cards != 0){
						dominion.buy_council_room(player_array[turn], dominion);
					}			
					else if(buy_answer == 19 && dominion.mine.num_cards != 0){
						dominion.buy_mine(player_array[turn], dominion);
					}			
					else if(buy_answer == 20 && dominion.adventurer.num_cards != 0){
						dominion.buy_adventurer(player_array[turn], dominion);
					}
					//If incorrect answer is given, print an error		
					else{
						System.out.println("Please enter a value between 1-20 with a non-empty pile.");
					}	
				}
				//If not 1 or 0, print error and reprompt
				else{
					System.out.println("Please enter 1 for yes and 0 for no.");
				}
			}

			//Put the cards from the players hand into the discard pile
			while(0 < player_array[turn].player_hand.num_cards){
				player_array[turn].player_discard.add_card(player_array[turn].player_hand.remove_card(0));
			}

			//Restock the players hand
			for(int i = 0; i < 5; i++){
				//check if the deck is empty. If so, shuffle discard and move to deck
				if(player_array[turn].player_deck.num_cards == 0){
					player_array[turn].player_discard.shuffle();
					for(int j = 0; j < player_array[turn].player_discard.num_cards; j++){
						player_array[turn].player_deck.add_card(player_array[turn].player_discard.draw_card());
					}
				}
				player_array[turn].player_hand.add_card(player_array[turn].player_deck.draw_card());
			}

			//Switch the players turn
			if(turn == dominion.num_players - 1){
				turn = 0;
			}
			else{
				turn++;
			}
		}
		//END PHASE

		//For each player, add up the number of victory points.
		//The player with the most victory points wins!

		//Put all of the cards in the deck
		for(int i = 0; i < dominion.num_players; i++){
			while(0 < player_array[i].player_hand.num_cards){
				player_array[i].player_deck.add_card(player_array[i].player_hand.remove_card(0));
			}
			while(0 < player_array[i].player_discard.num_cards){
				player_array[i].player_deck.add_card(player_array[i].player_discard.draw_card());
			}
		}

		//Count up the victory points
		for(int i = 0; i < dominion.num_players; i++){
			for(int j = 0; j < player_array[i].player_deck.num_cards; j++){
				if(player_array[i].player_deck.player_deck[j].type == "victory"
						|| player_array[i].player_deck.player_deck[j].type == "action victory"){
					player_array[i].victory_points += player_array[i].player_deck.player_deck[j].victory_points;
				}
				if(player_array[i].player_deck.player_deck[j].name == "gardens"){
					player_array[i].victory_points += player_array[i].player_deck.num_cards/10;
				}
			}
		}

		for(int i = 0; i < dominion.num_players; i++){
			System.out.format("Player %d has %d victory points.\n", i+1, player_array[i].victory_points);
		}

		int winning_score = player_array[0].victory_points;
		for(int i = 0; i < dominion.num_players-1; i++){
			if(winning_score < player_array[i+1].victory_points){
				winning_score = player_array[i+1].victory_points;
			}
		}

		for(int i = 0; i < dominion.num_players; i++){
			if(player_array[i].victory_points == winning_score){
				System.out.format("Player %d has won!\n", i+1);
			}
		}
	}
}
