package org.cs362.dominion;
public class hand{
	int num_cards;
	card[] player_hand;

	public hand(){
		num_cards = 0;
	}

	public void add_card(card new_card){
		//increment the deck for the new card
		num_cards = num_cards + 1;

		//create a new hand
		card new_hand[] = new card[num_cards];

		//Put the old cards into the new hand
		for(int i = 0; i < num_cards - 1; i++){
			new_hand[i] = player_hand[i];
		}
		new_hand[num_cards-1] = new_card;

		//Update the players deck
		player_hand = new_hand;
	}

	public card remove_card(int index){
		//decrement the deck for the removed card
		num_cards = num_cards - 1;

		//create a new hand
		card new_hand[] = new card[num_cards];

		//Put the cards up until the index into the new hand
		for(int i = 0; i < index; i++){
			new_hand[i] = player_hand[i];
		}
		//store the removed card
		card removed_card = player_hand[index];

		//Put the old cards into the new hand from index to the end
		for(int i = index; i < num_cards; i++){
			new_hand[i] = player_hand[i+1];
		}

		//Update the players deck
		player_hand = new_hand;
		
		return removed_card;
	}

	public void show_hand(){
		for(int i = 0; i < num_cards; i++){
			System.out.print("Card #");
			System.out.print(i+1);
			System.out.print(": ");
			System.out.println(player_hand[i].name);
		}
		if(num_cards == 0){
			System.out.println("Your hand is empty!");
		}
		System.out.println();
	}
}

