

public class VictoryCard extends Card
{
	public VictoryName place;

	// Every Victory card is of type victory
	public VictoryCard(int cost, VictoryName place){
		super(Card.Type.Victory, cost);
		this.place = place;
	}

	public enum VictoryName {
		Estate,
		Duchy,
		Province,
		Gardens
	}

	@Override
	public String toString()
	{
		String returnString = "";

		switch (this.place)
		{
			case Estate: 	returnString = "Estate";
							break;
			case Duchy:		returnString = "Duchy";
							break;
			case Province:	returnString = "Province";
							break;
			case Gardens: 	returnString = "Gardens";
							break;
		}
		return returnString;
	}
}