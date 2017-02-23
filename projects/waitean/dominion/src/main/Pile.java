package waitean.DominionMaven;
public class Pile {
	private Card card;
	private int number;
	private int embargo;
	
	public Pile(Card c, int n) {
		this.card = c;
		this.number = n;
		this.embargo = 0;
	}
	
	public Card getCard() {
		return card;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getEmbargo() {
		return embargo;
	}
	
	public void embargoPile() {
		embargo++;
	}
	
	public Card aquireCard() {
		if (number > 0) {
			number--;	
			return (Card) this.card.clone();
		} else {
			return null;
		}
	}
	
	public int buyCard(int money) {
		if (money >= this.card.getCost() && number > 0) {
			number--;
			return 1+embargo;
		}
		return 0;
	}
	
	public void addCardToPile() {
		this.number++;
	}
	
	public String toString() {
		return this.getNumber() + " of " + this.getCard().toString() + " costs: " + this.getCard().getCost();
	}
}
