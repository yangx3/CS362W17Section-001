package com.mycompany.marksprousedominion;

public class treasureCard extends Card  //The subclass for treasure cards
{
	
	public treasureCard(int cost, int treasure, String name)
	{
		setType(1);
		setVictory(0);
		
		setCost(cost);
		setTreasure(treasure);
		setName(name);
	}
	
}
