package org.cs362.dominion;
import java.util.concurrent.ThreadLocalRandom;

public class discard{
	int num_cards;
	card[] player_discard;

	//This is the default constructor that creates an empty discard pile
	public discard(){
		num_cards = 0;

	}

	//Add a card to the top of the deck
	public void add_card(card new_card){
		//increment the deck for the new card
		num_cards = num_cards + 1;

		//create a new deck
		card new_deck[] = new card[num_cards];

		//Put the old cards into the new deck
		for(int i = 0; i < num_cards - 1; i++){
			new_deck[i] = player_discard[i];
		}
		new_deck[num_cards-1] = new_card;

		//Update the players deck
		player_discard = new_deck;
	}

	//Draw a card from the top of the deck
	public card draw_card(){
		//draw the card
		card drawn_card = player_discard[num_cards-1];

		//decrement the number of cards for the drawn card
		num_cards = num_cards - 1;

		//create a new deck
		card new_deck[] = new card[num_cards];

		//Put the old cards into the new deck
		for(int i = 0; i < num_cards; i++){
			new_deck[i] = player_discard[i];
		}

		//Update the players deck
		player_discard = new_deck;

		return drawn_card;
	}

	//Shuffles the discard
	public void shuffle(){
		//Shuffle the discard by randomly picking two cards within the discard
		//and swapping them. Do this multiple times.
		for(int i = 0; i < 1000; i++){
			int random_1 = ThreadLocalRandom.current().nextInt(0, num_cards);	
			int random_2 = ThreadLocalRandom.current().nextInt(0, num_cards);	
			card temp_card = player_discard[random_1];
			player_discard[random_1] = player_discard[random_2];
			player_discard[random_2] = temp_card;
		}
	}

}
