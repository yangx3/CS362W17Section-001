//
//import java.io.*;
abstract class Card
{
	public String cardName, cardImg;
	public int cardCost;

	public Card(String name, int cost, String img)
	{
		cardName = name;
		cardImg = img;
		cardCost = cost;
	}
	public abstract String getAction();
	public abstract int getValue();

	public String getName()
	{
		return cardName;
	}
	public int getCost()
	{
		return cardCost;
	}
	public String getImg()
	{
		return cardImg;
	}
	// public void clone()
	// {
	// 	super.clone();
	// }
	// @Override public Card clone()
	// {
	// 	try
	// 	{
	// 		return (Card)super.clone();
	// 	}
	// 	catch(CloneNotSupportedException e)
	// 	{
	// 		throw new AssertionError();
	// 	}
		
	// }
	// public Card cloneCard()
	// {

	// }
}