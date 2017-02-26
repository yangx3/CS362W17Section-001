package org.cs362.dominion;
public class great_hall extends card{
	public great_hall(){
		name = "great hall";
		type = "action victory";
		cost = 3;
		gold = 0;
		victory_points = 1;
		action = 1;
		buy = 0;
		card = 1;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Greatest of halls!");

		//Give the player an extra action
		player_array[turn].action += 1;

		//Check if there are cards in the deck. If not, shuffle the discard and add to the deck
		if(player_array[turn].player_deck.num_cards == 0){
			for(int j = 0; j < player_array[turn].player_discard.num_cards; j++){
				player_array[turn].player_deck.add_card(player_array[turn].player_discard.draw_card());
			}
		}
		//Give the player a card
		player_array[turn].player_hand.add_card(player_array[turn].player_deck.draw_card());

	}

	public void description(){
		System.out.println("+1 card/+1 action/1 victory point.");
	}
}
