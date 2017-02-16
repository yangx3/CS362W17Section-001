package org.cs362.dominion;
public class village extends card{
	public village(){
		name = "village";
		type = "action";
		cost = 3;
		gold = 0;
		victory_points = 0;
		action = 2;
		buy = 0;
		card = 1;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Village oh village!");

		//The player gets two more actions
		player_array[turn].action += 2;

		//Check if there are cards in the deck. If not, shuffle the discard and add to the deck
		if(player_array[turn].player_deck.num_cards == 0){
			for(int j = 0; j < player_array[turn].player_discard.num_cards; j++){
				player_array[turn].player_deck.add_card(player_array[turn].player_discard.draw_card());
			}
		}
		//Give the player a card
		player_array[turn].player_hand.add_card(player_array[turn].player_deck.draw_card());

		System.out.println();
	}

	public void description(){
		System.out.println("+1 card/+2 action");
	}

}
