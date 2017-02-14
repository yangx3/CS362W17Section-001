package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cs362.dominion.Card.CardName;
import cs362.dominion.Card.Type;

public class CardTest {

	private static ArrayList<Card> cards;
	private static GameState gs;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cards = new ArrayList<Card>(Card.createCards());
		gs = new GameState(cards);
		Randomness.reset(10);
		Player player = new Player(gs, "player-1");
		gs.addPlayer(player);
		player = new Player(gs, "player-2");
		gs.addPlayer(player);		      
		//Initialize the game!
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateCards(){
		List<Card> xs = Card.createCards();
		CardName[] mandatory_cardnames = {
				CardName.Gold, CardName.Silver, CardName.Cooper,
				CardName.Province, CardName.Duchy, CardName.Estate, CardName.Curse
		};
		
		assertCardNamesExistInList(xs,mandatory_cardnames);//Assert that these cards have been created.
		System.out.println("DEBUG "+ Card.filter(xs, Card.Type.ACTION).size());
		assertTrue(Card.filter(xs, Card.Type.ACTION).size() >= 13);//Assert that at least 10 + 3 kingdom cards (ACTION CARDS) have been implemented
	}
	
	private void assertCardNamesExistInList(List<Card> xs, CardName[] mandatory_cardnames) {
		for(CardName cn : mandatory_cardnames){
			assertTrue(Card.getCard(xs, cn) != null);
		}
	}

	@Test
	public void testCountCardName(){
		assertEquals(Card.countCardName(cards, Card.CardName.Gold), 1);
		cards.add(new Card(CardName.Gold, Type.TREASURE, 6, 0, 3));
		assertEquals(Card.countCardName(cards, Card.CardName.Gold), 2);
	}
	
	@Test
	public void testGetCard(){
		List<Card> nullxs = new ArrayList<Card>();
		assertEquals(Card.getCard(nullxs, Card.CardName.Garden), null);
		assertTrue(Card.getCard(cards, Card.CardName.Gold).getCardName() == CardName.Gold);
	}
}
