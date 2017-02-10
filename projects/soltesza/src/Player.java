import java.util.Vector;

public class Player {
	public Deck deck;
	private int victoryPoints;
	private String name;
	private DominionBoard board;
	
	private int actions = 1;
	private int buys = 1;
	private int coins = 0;
	
	public Player(String name, DominionBoard board) {
		deck = new Deck();
		victoryPoints = 0;
		this.name = name;
		this.board = board;
		
		deck.DrawCards(5);
	}
	
	public String GetName() {return name;}
	
	public int GetScore() {return deck.GetScore();}
	
	public int GetVictoryPoints() {return victoryPoints;}
	
	public void TakeTurn(GameState state) {
		Vector<Card> hand = deck.GetHand();
		
		//play actions
		
		//hand = deck.GetHand();
		//play treasures
		coins += deck.PlayTreasures();
		
		//buy
		Buy(buys, coins);
		
		//cleanup
		deck.DiscardHand();
		deck.DrawCards(5);
		
		actions = 1;
		buys = 1;
		coins = 0;
	}
	
	public void AddActions(int numActions) {
		this.actions += numActions;
	}
	
	public void AddBuys(int numBuys) {
		this.buys += numBuys;
	}
	
	public void AddCoins(int numCoins) {
		this.coins += numCoins;
	}
	
	public void Buy(int numBuys, int numCoins) {
		for(int i=0; i<numBuys; i++) {
			Vector<Card> buyableCards = board.GetBuyable(numCoins);
			
			int highestValue = 0;
			int lowerBound = buyableCards.size()-1;
			for(int j=buyableCards.size()-1; j>0; j--) {
				int val = buyableCards.get(j).GetValue();
				if(val > highestValue) {
					highestValue = val;
				}
				else if(val < highestValue) {
					lowerBound = j;
				}
			}
			
			int idx = (int)(Math.random() * (buyableCards.size()-lowerBound) + lowerBound);
			
			Card newCard = board.BuyCard(idx);
			deck.AddCard(newCard); //buy a card costing as much as possible
			
			//if player has 0 money, buy copper
			
			PrintBuy(newCard);
		}
	}
	
	public void GainCurse() {
		Card curse = board.BuyCurse();
		
		if(curse != null) {
			deck.AddCard(curse);
		}
	}
	
	private void PrintBuy(Card card) {
		System.out.println(name + " bought a " + card.GetName() + " for " + card.GetValue() + " coins.");
	}
}
