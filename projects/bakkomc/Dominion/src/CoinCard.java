

public class CoinCard extends Card
{

	public CoinValue value;

	public CoinCard(int cost, CoinValue value)
	{
		super(Card.Type.Treasure, cost);
		this.value = value;

	}

	public enum CoinValue{
		Copper,
		Silver,
		Gold
	}

	@Override
	public String toString()
	{
		String returnString = "";

		switch (this.value)
		{
			case Copper: 	returnString = "Copper";
							break;
			case Silver:	returnString = "Silver";
							break;
			case Gold:		returnString = "Gold";
							break;
		}
		return returnString;
	}
}