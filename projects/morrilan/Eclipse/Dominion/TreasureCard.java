public class TreasureCard extends Card
{
	public int treasureValue;

	public TreasureCard(String name, int cost, String img, int value)
	{
		super(name, cost, img);
		treasureValue = value;
	}
	public int getValue()
	{
		return treasureValue;
	}
	public String getAction()
	{
		System.out.println("Error from TreasureCard, no valid Action to get.");
		return "";
	}
}