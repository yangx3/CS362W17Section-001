public class CurseCard extends Card
{
	public int curseValue;

	public CurseCard(String name, int cost, String img)
	{
		super(name, cost, img);
		curseValue = -1;
	}
	public int getValue()
	{
		return curseValue;
	}
	public String getAction()
	{
		System.out.println("Error from CurseCard, no valid Action to get.");
		return "";
	}
}