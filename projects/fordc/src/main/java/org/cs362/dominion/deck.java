
package org.cs362.dominion;

import java.util.concurrent.ThreadLocalRandom;

public class deck{
	int num_cards;
	card[] player_deck;

	//This is the default constructor that creates a deck with 7 copper and 3 estate cards
	public deck(){
		//The deck starts with 10 cards total
		num_cards = 10;
		player_deck = new card[num_cards];

		//7 of the first 10 cards are copper
		for(int i = 0; i < 7; i++){
			player_deck[i] = new copper();
		}

		//3 if the first 10 cards are estate
		for(int i = 7; i < 10; i++){
			player_deck[i] = new estate();
		}
	}

	//Add a card to the top of the deck
	public void add_card(card new_card){
		//increment the deck for the new card
		num_cards = num_cards + 1;

		//create a new deck
		card new_deck[] = new card[num_cards];

		//Put the old cards into the new deck
		for(int i = 0; i < num_cards - 1; i++){
			new_deck[i] = player_deck[i];
		}
		new_deck[num_cards-1] = new_card;

		//Update the players deck
		player_deck = new_deck;
	}

	//Draw a card from the top of the deck
	public card draw_card(){
		//draw the card
		card drawn_card = player_deck[num_cards-1];

		//decrement the number of cards for the drawn card
		num_cards = num_cards - 1;

		//create a new deck
		card new_deck[] = new card[num_cards];

		//Put the old cards into the new deck
		for(int i = 0; i < num_cards; i++){
			new_deck[i] = player_deck[i];
		}

		//Update the players deck
		player_deck = new_deck;

		return drawn_card;
	}

	//Shuffles the deck
	public void shuffle(){
		//Shuffle the deck by randomly picking two cards within the deck
		//and swapping them. Do this multiple times.
		for(int i = 0; i < 1000; i++){
			int random_1 = ThreadLocalRandom.current().nextInt(0, num_cards);	
			int random_2 = ThreadLocalRandom.current().nextInt(0, num_cards);	
			card temp_card = player_deck[random_1];
			player_deck[random_1] = player_deck[random_2];
			player_deck[random_2] = temp_card;
		}
	}
}


