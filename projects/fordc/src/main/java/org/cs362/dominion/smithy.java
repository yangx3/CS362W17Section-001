package org.cs362.dominion;
public class smithy extends card{
	public smithy(){
		name = "smithy";
		type = "action";
		cost = 4;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 3;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Smithy smithing smiths");

		//Give the player 3 cards
		for(int i = 0; i < 3; i++){
			//Check if there are cards in the deck. If not, shuffle the discard and add to the deck
			if(player_array[turn].player_deck.num_cards == 0){
				for(int j = 0; j < player_array[turn].player_discard.num_cards; j++){
					player_array[turn].player_deck.add_card(player_array[turn].player_discard.draw_card());
				}
			}
			//Give the player a card
			player_array[turn].player_hand.add_card(player_array[turn].player_deck.draw_card());
		}
		System.out.println();
	}

	public void description(){
		System.out.println("+3 cards");
	}
}
