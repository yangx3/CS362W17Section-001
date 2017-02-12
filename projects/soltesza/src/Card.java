
public abstract class Card implements Cloneable {
	protected String name;
	protected int cost;
	
	@Override
	public Card clone() {
		try {
		return (Card)super.clone();
		} 
		catch(CloneNotSupportedException e) {
			throw new Error("Error cloning object!");
		}
	}
	
	public String GetName() {return name;}
	
	public int GetValue() {return cost;}
}