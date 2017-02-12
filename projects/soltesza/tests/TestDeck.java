import org.junit.Test;

import java.util.Vector;

public class TestDeck {
	
	@Test
	public void testDeck() {
		Deck deck = new Deck();
		assert deck.GetCardCount() == 10;
		assert deck.GetHand().size() == 0;
		assert deck.PlayTreasures() == 0;
		assert deck.GetScore() == 3;
		
		//test drawing cards to hand
		deck.DrawCards(12);
		Vector<Card> hand = deck.GetHand();
		assert hand.size() == deck.GetCardCount();
		
		deck.DiscardHand();
		hand = deck.GetHand();
		assert hand.size() ==  0;
		
		hand = deck.DrawCards(5);
		assert hand.size() == 5;
		
		deck.DrawCards(10);
		hand = deck.GetHand();
		assert hand.size() == 10;
		
		//testing playTreasures
		assert deck.PlayTreasures() == 7;
		
		int size = deck.GetHand().size();
		deck.DiscardFromHand(hand.get(hand.size()-1));
		assert deck.GetHand().size() != size;
		
		//test AddCard
		int cc = deck.GetCardCount();
		int score = deck.GetScore();
		Card card1 = new VictoryCard(VictoryCard.VictoryType.CURSE);
		deck.AddCard(card1);
		assert deck.GetCardCount() > cc;
		assert deck.GetScore() < score;
		
		Card card2 = new VictoryCard(VictoryCard.VictoryType.GARDENS);
		deck.AddCard(card2);
		assert deck.GetScore() == 3;
		
		//test TrashCard
		cc = deck.GetCardCount();
		deck.TrashCard(card2);
		assert cc > deck.GetCardCount();
		assert deck.GetScore() == 2;
		
		cc = deck.GetCardCount();
		deck.TrashCard(card1);
		assert cc > deck.GetCardCount();
		assert deck.GetScore() == 3;
	}
}
