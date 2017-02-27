

public class ActionCard extends Card
{
	String cardName = "Uninitialized(error)";
	public ActionCard(int cost, String name)
	{
		super(Card.Type.Action, cost);
		cardName = name;
	}

	@Override
	public String toString()
	{
		return cardName;
	}
}
