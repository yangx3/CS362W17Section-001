package com.mycompany.marksprousedominion;

public class kingdomCard extends Card {
//All cards have the functions and an index at to a table 
	//That tells which function they will execute
	
	private int functionIndex;	//Index of what function the kingdom card is going to execute
							//There are 13 possible functions to perform.
	
	public kingdomCard(int cost, int treasure, int victory, int functionIndex, String name) {
		setType(2);
		
		setCost(cost);
		setTreasure(treasure);
		setVictory(victory);
		setFunctionIndex(functionIndex);//References the function that card should execute
		setName(name);
	}

	public int getFunctionIndex() {
		return functionIndex;
	}

	public void setFunctionIndex(int functionIndex) {
		this.functionIndex = functionIndex;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		kingdomCard clone=(kingdomCard)super.clone();
		
		return clone;
	}

	
}
