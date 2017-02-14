package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dominion.Card.CardName;
import dominion.Card.Type;

public class CardTest {

	@Test
	public void testCard() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		assertEquals(card.getCost(), 2);
	}

	@Test
	public void testGetType() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		assertEquals(card.getType(), Type.VICTORY);
	}

	@Test
	public void testGetCardName() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		assertEquals(card.getCardName(), CardName.Estate);
	}

	@Test
	public void testGetTreasureValue() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		assertEquals(card.getTreasureValue(), 0);
	}

	@Test
	public void testGetCost() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		assertEquals(card.getCost(), 2);
	}

	@Test
	public void testScore() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
	    Player player = new Player(state, "player-1");
		assertEquals(card.score(player), 1);
	}

	@Test
	public void testCreateCards() {
		assertNotNull(Card.createCards());
	}

	@Test
	public void testGetCard() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		assertNotNull(Card.getCard(cards, Card.CardName.Estate));
	}

	@Test
	public void testFilter() {
	    List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
		hand.add(Card.getCard(cards, Card.CardName.Gold));
		hand.add(Card.getCard(cards, Card.CardName.Silver));
		hand.add(Card.getCard(cards, Card.CardName.Estate));
	    List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
	    assertEquals(treasureCards.size(), 2);
	}

	@Test
	public void testToString() {
		Card card = new Card(CardName.Estate,Type.VICTORY,		2, 1, 0);
		assertNotNull(card.toString());
	}
}
