package org.cs362.dominion;

public class cutpurse extends card{
	public cutpurse(){
		name = "cutpurse";
		type = "action attack";
		cost = 4;
		gold = 2;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Cutpurses my friend!");
		System.out.println();

		//Give the player 2 currency
		player_array[turn].gold += 2;

		//Check if the other players have a copper, if so discard it.
		int other_turn;
		if(turn == 0){
			other_turn = 1;
		}
		else{
			other_turn = 0;
		}

		for(int i = 0; i < player_array[other_turn].player_hand.num_cards; i++){
			if(player_array[other_turn].player_hand.player_hand[i].name == "copper"){
				player_array[other_turn].player_discard.add_card(player_array[other_turn].player_hand.remove_card(i));
				System.out.format("Player %d has discarded a copper!\n\n", other_turn+1);
				return;
			}
		}
		System.out.format("Player %d does not have any coppers.\n", other_turn+1);
		player_array[other_turn].player_hand.show_hand();
	}

	public void description(){
		System.out.println("+2 currency/Each other player discards a copper card");
		System.out.println("(or reveals a hand with no copper");
	}
}
