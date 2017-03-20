package org.cs362.dominion;

public class council_room extends card{
	public council_room(){
		name = "council room";
		type = "action";
		cost = 5;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 1;
		card = 4;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Council room councils!");
		System.out.println();

		//Give the player 4 cards
		for(int i = 0; i < card; i++){
			//Check if there are cards in the deck. If not, shuffle the discard and add to the deck
			if(player_array[turn].player_deck.num_cards == 0){
				for(int j = 0; j < player_array[turn].player_discard.num_cards; j++){
					player_array[turn].player_deck.add_card(player_array[turn].player_discard.draw_card());
				}
			}
			//Give the player a card
			player_array[turn].player_hand.add_card(player_array[turn].player_deck.draw_card());
		}

		//Give the player one buy
		player_array[turn].buy += buy;

		//Give each other player a card
		int other_turn = -1;
		for(int i = 0; i < dominion.num_players; i++){
			if(turn == dominion.num_players - 1){
				other_turn = 0;
			}
			else{
				other_turn++;
			}
			if(player_array[other_turn].player_deck.num_cards == 0){
				for(int j = 0; j < player_array[other_turn].player_discard.num_cards; j++){
				player_array[other_turn].player_deck.add_card(player_array[other_turn].player_discard.draw_card());
				}
			}
			//Give the player a card
			player_array[other_turn].player_hand.add_card(player_array[other_turn].player_deck.draw_card());
		}
	}

	public void description(){
		System.out.println("+4 cards/+1 buy/Each other player draws a card.");
	}
}
