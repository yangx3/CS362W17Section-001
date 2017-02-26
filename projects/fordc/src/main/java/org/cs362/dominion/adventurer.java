package org.cs362.dominion;

public class adventurer extends card{
	public adventurer(){
		name = "adventurer";
		type = "action";
		cost = 6;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card = 0;
		attack = true;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		System.out.println("Adventurer does things!");
		System.out.println();

		//Cycle through the deck until 2 treasure cards are added
		//Put the rest in the discard
		int num_treasure = 0;
		while(num_treasure < 2){
			//Check if there are cards in the deck. If not, shuffle the discard and add to the deck
			if(player_array[turn].player_deck.num_cards == 0){
				for(int j = 0; j < player_array[turn].player_discard.num_cards; j++){
					player_array[turn].player_deck.add_card(player_array[turn].player_discard.draw_card());
				}
			}
			card card_holder = player_array[turn].player_deck.draw_card();
			System.out.format("Player %d has drawn a %s!\n", turn+1, card_holder.name);
			if(card_holder.type == "treasure"){
				num_treasure += 1;
				player_array[turn].player_hand.add_card(card_holder);
			}
			else{
				player_array[turn].player_discard.add_card(card_holder);
			}
		}
	}

	public void description(){
		System.out.println("Reveal cards from your deck until you reveal 2 treasure cards.");
		System.out.println("Put those treasure cards into your hand and discard the other revealed cards.");
	}

}
