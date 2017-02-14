public class KingdomCard extends Card
{
	public String cardAction;

	public KingdomCard(String name, int cost, String img, String action)
	{
		super(name, cost, img);
		// cardName = name;
		// cardImg = img;
		// cardCost = cost;
		cardAction = action;
	}

	public String getAction()
	{
		return cardAction;
	}
	public int getValue()
	{
		System.out.println("Error from KingdomCard, no valid Value to get.");
		return 0;
	}
}