import java.util.*;

public class Deck {
	private Stack drawPile;
	private Stack discardPile;
	private Vector hand;
	
	public Deck() {
		drawPile = new Stack();
		discardPile = new Stack();
		hand = new Vector();
		
		//add starting cards to the deck
		for(int i=0; i<7; i++) {
			AddCard(new TreasureCard(TreasureCard.TreasureType.COPPER));
		}
		for(int i=0; i<3; i++) {
			AddCard(new VictoryCard(VictoryCard.VictoryType.ESTATE));
		}
		
		Shuffle();
	}
	
	private void Shuffle() { //shuffle the deck
		
	}
	
	private void AddCard(Card card) { //add a card to the deck
		discardPile.push(card);
		//if(card instanceof TreasureCard)
	}
	
	public Vector DrawCards(int numCards) { //will probably return a vector containing the hand
		//draw numCards cards from drawPile into hand, return cards drawn to player
		if(drawPile.size()<5) {
			Shuffle();
		}
		else {
			for(int i=0; i<5; i++) {
				hand.addElement(drawPile.pop());
			}
		}
		
		return hand;
	}
	
	public void DiscardHand() {
		for(int i=0; i<hand.size(); i++) {
			discardPile.push(hand.get(i));
		}
		
		hand.clear();
	}
}
