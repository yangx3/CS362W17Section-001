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
		int other_turn = -1;
		for(int i = 0; i < dominion.num_players; i++){
			if(turn == dominion.num_players - 1){
				other_turn = 0;
			}
			else{
				other_turn++;
			}
	
			for(int j = 0; j < player_array[other_turn].player_hand.num_cards; j++){
				if(player_array[other_turn].player_hand.player_hand[j].name == "copper"){
					player_array[other_turn].player_discard.add_card(player_array[other_turn].player_hand.remove_card(j));
					System.out.format("Player %d has discarded a copper!\n\n", other_turn+1);
					break;
				}
				else{
					System.out.format("Player %d does not have any coppers.\n", other_turn+1);
					player_array[other_turn].player_hand.show_hand();
					break;
				}
			}
		}
	}

	public void description(){
		System.out.println("+2 currency/Each other player discards a copper card");
		System.out.println("(or reveals a hand with no copper");
	}
}
