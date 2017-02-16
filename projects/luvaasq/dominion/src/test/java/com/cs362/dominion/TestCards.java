package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import dominion.Card.Type;

import static org.junit.Assert.*;

public class TestCards {
	private GameState state, testState;
	List<Card> cards;
	
	@Before
	public void setupTest() throws Exception {
		Randomness.reset(System.currentTimeMillis());
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Player player = new Player(state, "player-1");		
		state.addPlayer(player);
		player = new Player(state, "player-2");
		state.addPlayer(player);
		state.initializeGame();
		// copy or clone the game state to a test case
		testState = (GameState) state.clone();
		
		
		/*
		player = new Player(testState, "player-1");
		testState.addPlayer(player);
		testState.players.get(0).hand = state.players.get(0).hand;
		testState.players.get(0).hand = state.players.get(0).hand;
		testState.players.get(0).hand = state.players.get(0).hand;
		testState.players.get(0).numActions = 1;
		player = new Player(testState, "player-2");
		testState.addPlayer(player);
		testState.players.get(1).hand = state.players.get(1).hand;
		testState.players.get(1).hand = state.players.get(1).hand;
		testState.players.get(1).hand = state.players.get(1).hand;
		testState.players.get(0).hand = state.players.get(0).hand;
		testState.players.get(1).numActions = 1;
		*/
	}

	@Test
	public void testAdventurer() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Adventurer));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's Treasure Count: " + Card.filter(state.players.get(0).hand, Type.TREASURE).size());
		int treasures = Card.filter(state.players.get(0).hand, Type.TREASURE).size();
		state.players.get(0).playKingdomCard();
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's Treasure Count: " + Card.filter(state.players.get(0).hand, Type.TREASURE).size());
		assertEquals(treasures + 2, Card.filter(state.players.get(0).hand, Type.TREASURE).size());
	}

	@Test
	public void testAmbassador() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Ambassador));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
	
		state.players.get(0).playKingdomCard();
		
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);
		System.out.println("Player 2's discard: " + state.players.get(1).discard);	
		
		assertEquals(testState.players.get(1).discard.size() + 1, state.players.get(1).discard.size());
		assertTrue((state.players.get(0).hand.size() < testState.players.get(0).hand.size()) && (state.players.get(0).hand.size() >= testState.players.get(0).hand.size() - 3 ));
	} 

	@Test
	public void testBaron() throws Throwable {
		int buys = state.players.get(0).numBuys;
		int coins = state.players.get(0).coins;
		int numEstatesBefore = 0;
		int numEstatesAfter = 0;
		int numEstatesHandB = 0;
		int numEstatesHandA = 0;
		for (Card c : state.players.get(0).discard) {
			if (c.getCardName().equals(Card.CardName.Estate))
				numEstatesBefore++;
		}
		for (Card c : state.players.get(0).hand) {
			if (c.getCardName().equals(Card.CardName.Estate))
				numEstatesHandB++;
		}

		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Baron));

		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 1's number of buys: " + state.players.get(0).numBuys);
		System.out.println("Player 1's number of coins: " + coins);
		System.out.println("Player 1's number of estates: " + numEstatesBefore);

		state.players.get(0).playKingdomCard();

		for (Card c : state.players.get(0).discard) {
			if (c.getCardName().equals(Card.CardName.Estate))
				numEstatesAfter++;
		}
		for (Card c : state.players.get(0).hand) {
			if (c.getCardName().equals(Card.CardName.Estate))
				numEstatesHandA++;
		}
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 1's number of buys: " + state.players.get(0).numBuys);
		System.out.println("Player 1's number of coins: " + state.players.get(0).coins);
		System.out.println("Player 1's number of estates: " + numEstatesAfter);

		assertEquals(buys + 1, state.players.get(0).numBuys);
		assertTrue((numEstatesAfter == numEstatesBefore + 1)
				&& ((state.players.get(0).coins == coins + 4) || (numEstatesHandA == numEstatesHandB)));
		
	}

	@Test
	public void testCouncil_Room() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Council_Room));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);
		state.players.get(0).playKingdomCard();
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);
		assertEquals(testState.players.get(0).hand.size() + 3, state.players.get(0).hand.size());
		assertEquals(testState.players.get(0).numBuys + 1, state.players.get(0).numBuys);
		assertEquals(testState.players.get(1).hand.size() + 1, state.players.get(1).hand.size());
	
	}

	@Test
	public void testCutpurse() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
		state.players.get(0).playKingdomCard();
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
		assertEquals(testState.players.get(0).coins + 2, state.players.get(0).coins);
		if (testState.players.get(1).hand.contains(Card.getCard(cards, Card.CardName.Copper)))
			assertEquals(Card.filterQTY(testState.players.get(1).hand ,Card.CardName.Copper ) - 1, Card.filterQTY(state.players.get(1).hand ,Card.CardName.Copper ));
	
	}

	@Test
	public void testEmbargo() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Embargo));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
		state.players.get(0).playKingdomCard();

		Card key = null;
		int value = 0;
		for (HashMap.Entry<Card, Integer> item : state.embTokens.entrySet()) {
			  key = item.getKey();
			  value = item.getValue();
			  if (value == 1)
				  break;
		}
		assertEquals(1,value);
		assertEquals(testState.players.get(0).coins + 2, state.players.get(0).coins);
		for (HashMap.Entry<Card, Integer> item : state.embTokens.entrySet()) {
			state.embTokens.put(item.getKey(),  1);
		}
		state.players.get(0).buyCard();
		
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
		
		assertTrue(Card.filterQTY(state.players.get(0).discard ,Card.CardName.Curse) > 0);
	}

	@Test
	public void testFeast() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Feast));
		testState.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Feast));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
		state.players.get(0).playKingdomCard();
		
		assertEquals(Card.filterQTY(testState.players.get(0).hand ,Card.CardName.Feast ) - 1, Card.filterQTY(state.players.get(0).hand ,Card.CardName.Feast ));
		assertTrue(state.players.get(0).discard.get(0).getCost() <= 5);
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
	}
	@Test
	public void testGardens() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Gardens));
		testState.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Gardens));
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("Player 2's hand: " + state.players.get(1).hand);		
		System.out.println("Player 2's discard: " + state.players.get(1).discard);
	}
	@Test
	public void testGreat_Hall() throws Throwable {
		state.players.get(0).hand.remove(0);
		System.out.println("Player 1's score: " + state.players.get(0).scoreFor());
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Great_Hall));	
		state.players.get(0).playKingdomCard();
		System.out.println("Player 1's score: " + state.players.get(0).scoreFor());
		assertEquals(testState.players.get(0).scoreFor() + 1, state.players.get(0).scoreFor());
		assertEquals(testState.players.get(0).numActions, state.players.get(0).numActions);
		assertEquals(testState.players.get(0).hand.size(), state.players.get(0).hand.size());
	}

	@Test
	public void testMine() throws Throwable {
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Mine));	
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		state.players.get(0).playKingdomCard();
		assertEquals(Card.filter(testState.players.get(1).hand ,Card.Type.TREASURE), Card.filter(state.players.get(1).hand ,Card.Type.TREASURE) );
		assertTrue(
				((Card.filterQTY(testState.players.get(0).hand ,Card.CardName.Copper) > 0) && (Card.filterQTY(state.players.get(0).hand ,Card.CardName.Silver) == Card.filterQTY(testState.players.get(0).hand ,Card.CardName.Silver) + 1))  
				|| ((Card.filterQTY(testState.players.get(0).hand ,Card.CardName.Silver) > 0) && (Card.filterQTY(state.players.get(0).hand ,Card.CardName.Gold) == Card.filterQTY(testState.players.get(0).hand ,Card.CardName.Gold) + 1))  
				);
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
	}

	@Test
	public void testSmithy() throws Throwable {
		int newCards = 3;
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Smithy));
	
		state.players.get(0).playKingdomCard();
		
		System.out.println("  *****    Player-1 Status ***** ");
		System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = " + (testState.players.get(0).hand.size() + newCards - 1));
		System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = " + (testState.players.get(0).deck.size() - newCards));
		System.out.println("numActions = " + state.players.get(0).numActions + ", expected = " + (testState.players.get(0).numActions - 1));

		System.out.println("  *****    Player-2 Status *****");
		System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = " + (testState.players.get(1).hand.size()));
		System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = " + (testState.players.get(1).deck.size()));
		System.out.println("numActions = " + state.players.get(1).numActions + ", expected = " + (testState.players.get(1).numActions));
		assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() + newCards - 1));
		assertEquals(state.players.get(0).deck.size(), (testState.players.get(0).deck.size() - newCards));

		assertEquals(state.players.get(1).hand.size(), (testState.players.get(1).hand.size()));
		assertEquals(state.players.get(1).deck.size(), (testState.players.get(1).deck.size()));

	}

	@Test
	public void testSteward() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Steward));
		
		System.out.println("hand count = " + state.players.get(0).hand.size());
		System.out.println("deck count = " + state.players.get(0).deck.size());
		System.out.println("Coins = " + state.players.get(0).coins);
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		state.players.get(0).playKingdomCard();
		System.out.println("Player 1's hand: " + state.players.get(0).hand);
		System.out.println("Player 1's discard: " + state.players.get(0).discard);
		System.out.println("hand count = " + state.players.get(0).hand.size());
		System.out.println("deck count = " + state.players.get(0).deck.size());
		System.out.println("Coins = " + state.players.get(0).coins);
		assertTrue(
				state.players.get(0).hand.size() == testState.players.get(0).hand.size() + 1
				|| state.players.get(0).coins == testState.players.get(0).coins + 2 
				|| state.players.get(0).hand.size() == testState.players.get(0).hand.size() - 3
				);
	
		
	}

	@Test
	public void testVillage() throws Throwable {
		state.players.get(0).hand.remove(0);
		state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Village));
		System.out.println("hand count = " + state.players.get(0).hand.size());
		System.out.println("deck count = " + state.players.get(0).deck.size());
		System.out.println("Actions = " + state.players.get(0).numActions);
		state.players.get(0).playKingdomCard();
		System.out.println("hand count = " + state.players.get(0).hand.size());
		System.out.println("deck count = " + state.players.get(0).deck.size());
		System.out.println("Actions = " + state.players.get(0).numActions);
		assertEquals( testState.players.get(0).numActions + 1, state.players.get(0).numActions);
		assertEquals( testState.players.get(0).hand.size(), state.players.get(0).hand.size());
	}

}
