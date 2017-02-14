

public class CurseCard extends Card
{
	public CurseCard place;

	public CurseCard(){
		super(Card.Type.Curse, 0);
	}

	@Override
	public String toString()
	{
		String returnString = "Curse";
		return returnString;
	}
}