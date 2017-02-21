package com.mycompany.marksprousedominion;

import java.util.ArrayList;
import java.util.Random;

public class boardState {

	private ArrayList<ArrayList<Card>> supply; 
	private ArrayList<ArrayList<Card>> kingdom;
	
	public boardState() {

		supply = createSupply();
		try {
			kingdom = createKingdom();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//Will be what the board is currently at
	
	}
	
	public Card cardBought(int index)
	{
		Card output;
		if(index >= supply.size())//This means they bought from the kingdomcards
		{
			index = index - supply.size();
			output = kingdom.get(index).remove(0);
			if(kingdom.get(index).isEmpty())
				kingdom.remove(index);
			return output;
		}
		//If from the supply
		
		output = supply.get(index).remove(0);
		if(supply.get(index).isEmpty())
			supply.remove(index);
		
		return output;
	}
	
	public int getOptions()
	{
		int output = supply.size() + kingdom.size();
		
		return output;
	}
	
	private ArrayList<ArrayList<Card>> createKingdom() throws CloneNotSupportedException
	{
		ArrayList<ArrayList<Card>> output = new ArrayList<ArrayList<Card>>();
		ArrayList<Card> temp = new ArrayList<Card>();
		Random rand = new Random(System.currentTimeMillis());
		//Randomly choose which kingdom cards will be available to purchase and put those draw piles into the kingdom pile
		
		//Create the options in temp
		
		temp.add(new kingdomCard(4, 0, 0, 0, "Smithy"));
		temp.add(new kingdomCard(5, 0, 0, 1, "Council Room"));
		temp.add(new kingdomCard(5, 0, 0, 2, "Witch"));
		temp.add(new kingdomCard(4, 0, 0, 3, "Gardens"));
		temp.add(new kingdomCard(4, 0, 0, 4, "Remodel"));
		temp.add(new kingdomCard(3, 0, 0, 5, "Village"));
		temp.add(new kingdomCard(5, 0, 0, 6, "Mine"));
		temp.add(new kingdomCard(6, 0, 0, 7, "Adventurer"));
		temp.add(new kingdomCard(4, 0, 0, 8, "Feast"));
		temp.add(new kingdomCard(4, 0, 0, 9, "Baron"));
		temp.add(new kingdomCard(3, 0, 0, 10, "Great Hall"));
		temp.add(new kingdomCard(5, 0, 0, 11, "Festival"));
		temp.add(new kingdomCard(5, 0, 0, 12, "Laboratory"));
		
		//Pick 10 and place them into the output
		for (int i = 0; i < 10; i++) {
			int index;
			index = rand.nextInt(temp.size());
			output.add(new ArrayList<Card>());
			output.get(output.size()-1).add(temp.get(index));
			temp.remove(index);
		}
		//Multiply the chosen within output so that there are 10 cards each
		
		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < 10; j++) {
				kingdomCard tempC = (kingdomCard) output.get(i).get(j);
				kingdomCard other = (kingdomCard) tempC.clone();
				output.get(i).add(other);
				
			}
		}
		
		return output;
	}
	
	private ArrayList<ArrayList<Card>> createSupply()
	{
		ArrayList<ArrayList<Card>> output = new ArrayList<ArrayList<Card>>();
		
		ArrayList<Card> temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 8; i++) {
			temp.add(new victoryCard(8, 6, "Province"));
		}
		output.add(temp);
		
		temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 8; i++) {
			temp.add(new victoryCard(5, 3, "Duchy"));
		}
		output.add(temp);
		
		temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 8; i++) {
			temp.add(new victoryCard(2, 1, "Estate"));
		}
		output.add(temp);
		
		temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 30; i++) {
			temp.add(new treasureCard(6, 3, "Gold"));
		}
		output.add(temp);
		
		temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 40; i++) {
			temp.add(new treasureCard(3, 2, "Silver"));
		}
		output.add(temp);
		
		temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 46; i++) {
			temp.add(new treasureCard(0, 1, "Copper"));
		}
		output.add(temp);
		
		temp = new ArrayList<Card>();		
		//Make all of the piles for the supply
		for (int i = 0; i < 10; i++) {
			temp.add(new victoryCard(0, -1, "Curse"));
		}
		output.add(temp);
		
		return output;
	}
	
	public ArrayList<ArrayList<Card>> getSupply() {
		return supply;
	}

	public ArrayList<ArrayList<Card>> getKingdom() {
		return kingdom;
	}
	
}
