package myDominion;

public class kingdomCard extends Card {
//Think of how to implement functionality
	
	public kingdomCard(int cost, int treasure, int victory, String name) {
		setType(2);
		
		setCost(cost);
		setTreasure(treasure);
		setVictory(victory);
		//setFunctionIndex(functionIndex);//References the function that card should execute
		setName(name);
	}
/*
	public int getFunctionIndex() {
		return functionIndex;
	}

	public void setFunctionIndex(int functionIndex) {
		this.functionIndex = functionIndex;
	}
*/
}
