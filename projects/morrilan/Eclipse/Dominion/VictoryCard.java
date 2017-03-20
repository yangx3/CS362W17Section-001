public class VictoryCard extends Card
{
	public int victoryValue;

	public VictoryCard(String name, int cost, String img, int value)
	{
		super(name, cost, img);
		victoryValue = value;
	}
	public int getValue()
	{
		return victoryValue;
	}
	public String getAction()
	{
		System.out.println("Error from VictoryCard, no valid Action to get.");
		return "";
	}
}