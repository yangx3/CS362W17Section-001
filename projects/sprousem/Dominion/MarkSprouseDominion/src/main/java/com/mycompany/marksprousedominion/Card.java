package com.mycompany.marksprousedominion;

public class Card implements Cloneable //Parent Card class
{
	private int type;		//indicates Treasure vs VP versus Kingdom
	private int cost;		//how much it costs to purchase
	private int treasure;	//how much treasure you gain when played
	private int victory;	//how many victory points it gives
	private String name;	//name of the card
	
	
	public void printInfo()//All fields should have a value
	{
		System.out.println("Name: " + name + "\tCost: " + cost + "\tTreasure: "
									+ treasure + "\tVictory Points: " + victory);
	}
	
	//Getters and Setters
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTreasure() {
		return treasure;
	}
	public void setTreasure(int treasure) {
		this.treasure = treasure;
	}
	public int getVictory() {
		return victory;
	}
	public void setVictory(int victory) {
		this.victory = victory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
