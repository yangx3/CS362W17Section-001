package com.mycompany.marksprousedominion;

import java.util.ArrayList;

public class turnState {

	private int actions;
	private int buys;
	private int treasure;
	private Player current;
	private ArrayList<Player> opponents;
	//private boardState board;
	
	public turnState(Player current, ArrayList<Player> opponents, boardState board) 
	{
		actions = 1;
		buys = 1;
		treasure = 0;
		this.current = current;
		this.opponents = opponents;
		//this.board = board;
	}
	
	public void printInfo()//Prints the current info of the turn
	{
		System.out.println("Actions: " + actions + "\tBuys: " + buys +
												"\tTreasure: " + treasure);
	}
	
	public int getActions() {
		return actions;
	}

	public void setActions(int actions) {
		this.actions = actions;
	}

	public int getBuys() {
		return buys;
	}

	public void setBuys(int buys) {
		this.buys = buys;
	}

	public int getTreasure() {
		return treasure;
	}

	public void setTreasure(int treasure) {
		this.treasure = treasure;
	}

	public Player getCurrent() {
		return current;
	}

	public ArrayList<Player> getOpponents() {
		return opponents;
	}


}
