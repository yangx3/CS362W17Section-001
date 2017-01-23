
public class Player {
	private Deck deck;
	private int victoryPoints;
	private int actions;
	private int buys;
	
	public Player() {
		deck = new Deck();
		victoryPoints = 0;
	}
	
	public int GetVictoryPoints() {
		return victoryPoints;
	}
	
	public void TakeTurn() {
		actions = 1;
		buys = 1;
		
		
	}
}
