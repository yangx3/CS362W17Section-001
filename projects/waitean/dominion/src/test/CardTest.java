package waitean.DominionMaven;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;


public class CardTest {

	@Test
	public void testGetKingdomCards() {
		ArrayList<Card> cards;
		cards = Card.getKingdomCards();
		assertEquals(cards.size(), 10);
		boolean noTwoSame = true;;
		for (int i = 0; i < cards.size(); i++) {
			for (int j = i + 1; j < cards.size(); j++) {
				if (cards.get(i).getName().equals(cards.get(j).getName()))
					noTwoSame = false;
			}
		}
		assertEquals(noTwoSame, true);
	}

	@Test
	public void testGetScoreCard() {
		Card testCard = new Card(Card.CardName.Province, Card.CardType.VICTORY, 8);
		assertEquals(Card.getScoreCard(testCard), 6);
		testCard = new Card(Card.CardName.Duchy, Card.CardType.VICTORY, 5);
		assertEquals(Card.getScoreCard(testCard), 3);
		testCard = new Card(Card.CardName.Estate, Card.CardType.VICTORY, 2);
		assertEquals(Card.getScoreCard(testCard), 1);
		testCard = new Card(Card.CardName.Great_Hall, Card.CardType.VICTORY, 3);
		assertEquals(Card.getScoreCard(testCard), 1);
		testCard = new Card(Card.CardName.Village, Card.CardType.ACTION, 3);
		assertEquals(Card.getScoreCard(testCard), 0);
	}

	@Test
	public void testGetCard() {
		ArrayList<Card> cards = new ArrayList<Card>();
		Card card = new Card(Card.CardName.Province, Card.CardType.VICTORY, 8);
		cards.add(card);
		cards.add(card);
		Card newCard = Card.getCard(cards, Card.CardName.Province);
		assertEquals(cards.size(), 2);
		assertEquals(newCard, card);
	}
}
