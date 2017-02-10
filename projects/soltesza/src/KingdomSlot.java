
public class KingdomSlot implements Comparable<KingdomSlot>{
	private int count;
	private Card card;
	
	public KingdomSlot(Card card, int count) {
		this.card = card;
		this.count = count;
	}
	
	public boolean IsEmpty() {
		if(count > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public Card GetCard() {return card;}
	
	public int GetValue() {return card.GetValue();}
	
	public Card DrawCard() {
		if(count > 0) {
			count -= 1;
			//return new object of type card
			return card.clone();
		}
		return null;
	}
	
	public int compareTo(KingdomSlot other) {
		return card.GetValue() - other.GetValue();
	}
}
