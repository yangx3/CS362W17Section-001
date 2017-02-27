package org.cs362.dominion;


//This class is a base abstract class for all of the cards in dominion.

public abstract class card{
	
	String name;			  //The name of the card
	String type;           //Displays the card type
	int cost;				  //The gold cost of the card
	int gold;				  //The gold value of the card
	int victory_points;    //The victory points of a card
	int action;            //The action points of a card
	int buy;               //The number of buys of a card
	int card;              //The number of cards drawn
	boolean attack;		  //A flag for if a card has an action

	public card(){
		name = "blank";
		type = "blank";
		cost = 0;
		gold = 0;
		victory_points = 0;
		action = 0;
		buy = 0;
		card= 0;
		attack = false;
	}

	public abstract void perform_attack(player[] player_array, int turn, board dominion);   //Performs an action if attack = true
	public abstract void description();    														     	 //Tells the player what the card does

}
