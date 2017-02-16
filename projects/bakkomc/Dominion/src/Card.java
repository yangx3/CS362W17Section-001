

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Card {

	public final Type type;
	public final int cost;

	public enum Type {
		Treasure,
		Victory,
		Action,
		Curse
	};

	public Card(Type type, int cost){
		this.type = type;
		this.cost = cost;
	}

	public String toStringType()
	{
		String returnString = "";
		switch (this.type)
		{
			case Treasure: 	returnString = "Treasure";
							break;
			case Victory:	returnString = "Victory";
							break;
			case Action:	returnString = "Action";
							break;
			case Curse:		returnString = "Curse";
							break;

		}

		return returnString;
	}

	@Override
	public abstract String toString();




}
