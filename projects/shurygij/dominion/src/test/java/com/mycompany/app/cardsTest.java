package dominion;

import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dominion.Card.CardName;
import dominion.Card.Type;

public class cardsTest {	
	private GameState state, testState;
	@Before
	public void setUp() throws Exception {
		//System.out.println("  *****	Initializing *****  ");
		List < Card > cards;
		Randomness.reset(System.currentTimeMillis());

		// initialize a game state and player cards
		cards = new ArrayList < Card > (Card.createCards());
		state = new GameState(cards);
		//			
		Player player = new Player(state, "player-1");
		state.addPlayer(player);
		player = new Player(state, "player-2");
		state.addPlayer(player);

		//Initialize the game!
		state.initializeGame();

		/*System.out.println("player hand = " + state.players.get(0).hand.size());
		System.out.println("player deck = " + state.players.get(0).deck.size());
		System.out.println("player coins = " + state.players.get(0).coins);
		System.out.println("player numActions = " + state.players.get(0).numActions);
		System.out.println("player numBuys = " + state.players.get(0).numBuys);
		
		*///copy or clone the game state to a test case
		testState = (GameState) state.clone();
		int i = 1;
		for (Player adding: state.players){
			String name = "ClonedPlayer-" + i;
			player = new Player(testState,name);
			i++;
			player.hand.addAll(adding.hand);
			player.deck.addAll(adding.deck);
			player.discard.addAll(adding.discard);
			player.numActions = 1;
			player.numBuys = 1;
			player.coins = 0;
			//testState.addPlayer(player);
		}
		/*System.out.println("OG");
		for(Player print: state.players){
			System.out.println(print.toString());
		}
		System.out.println("copy");		
		for(Player print: state.players){
			System.out.println(print.toString());
		}*/
		//System.out.println(testState.players.get(0).toString());
		//System.out.println("  *****	Initializing Completed *****  ");
		
	}

	@Test
	public void smithyTest() {
		System.out.println("  *****	Smithy Test Beginning *****  ");
		int newCards = 3;
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Smithy));
		testState.players.get(0).playKingdomCard();

		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size() + newCards));
		System.out.println("deck count = " + testState.players.get(0).deck.size() + ", expected = " + (state.players.get(0).deck.size() - newCards));
		System.out.println("numActions = " + testState.players.get(0).numActions + ", expected = " + (state.players.get(0).numActions - 1));

		assertEquals(testState.players.get(0).hand.size(), (state.players.get(0).hand.size() + newCards));
		assertEquals(testState.players.get(0).deck.size(), (state.players.get(0).deck.size() - newCards));
		System.out.println("  *****	Smithy Test Completed ***** \n\n");

	}
	
	@Test
	public void adventurerTest() {
		System.out.println("  *****	Adventurer Test Beginning *****  ");
		int treasureCards = 2;
		//play the game
		int handSize = testState.players.get(0).hand.size();
		for (int i = 0; i < handSize; i++) {
			testState.players.get(0).discard(testState.players.get(0).hand.get(0));
		}
		
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Adventurer));
		testState.players.get(0).playKingdomCard();
		System.out.println("");
		System.out.println("Number of treasure cards in hand: " +Card.filter(testState.players.get(0).hand,Type.TREASURE).size() + " Expected: " + treasureCards);
		assertEquals(testState.players.get(0).hand.size(), treasureCards);
		assertEquals(Card.filter(testState.players.get(0).hand,Type.TREASURE).size(), treasureCards);
		System.out.println("  *****	Adventurer Test Completed ***** \n\n");
		//fail("Not yet implemented");
	}
	
	@Test
	public void villageTest() {
		System.out.println("  *****	Village Test Beginning *****  ");
		int newCards = 1;
		int newActions = 1;
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Village));
		testState.players.get(0).playKingdomCard();
		//System.out.println("  *****	Player-1 Start Status ***** ");
		
		
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size() + newCards));
		System.out.println("deck count = " + testState.players.get(0).deck.size() + ", expected = " + (state.players.get(0).deck.size() - newCards));
		System.out.println("numActions = " + testState.players.get(0).numActions + ", expected = " + (state.players.get(0).numActions + newActions));
		//System.out.println("  *****	Player-1 End Status ***** ");
		//System.out.println(testState.players.get(0).toString());
		assertEquals(testState.players.get(0).hand.size(), (state.players.get(0).hand.size() + newCards));
		assertEquals(testState.players.get(0).deck.size(), (state.players.get(0).deck.size() - newCards));
		assertEquals(testState.players.get(0).numActions, (state.players.get(0).numActions + newActions));
		System.out.println("  *****	Village Test Completed ***** \n\n");
	}
	
	@Test
	public void councilRoomTest() {
		System.out.println("  *****	Council_Room Test Beginning *****  ");
		int newCards = 4;
		int opponentNewCards = 1;
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Council_Room));
		testState.players.get(0).playKingdomCard();
		
		
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size() + newCards));
		System.out.println("deck count = " + testState.players.get(0).deck.size() + ", expected = " + (state.players.get(0).deck.size() - newCards));
		System.out.println("  *****	Player-2 Status ***** ");
		System.out.println("hand count = " + testState.players.get(1).hand.size() + ", expected = " + (state.players.get(1).hand.size() + opponentNewCards));
		System.out.println("deck count = " + testState.players.get(1).deck.size() + ", expected = " + (state.players.get(1).deck.size() - opponentNewCards));

		assertEquals(testState.players.get(1).hand.size(), (state.players.get(1).hand.size() + opponentNewCards));
		assertEquals(testState.players.get(1).deck.size(), (state.players.get(1).deck.size() - opponentNewCards));
		assertEquals(testState.players.get(0).hand.size(), (state.players.get(0).hand.size() + newCards));
		assertEquals(testState.players.get(0).deck.size(), (state.players.get(0).deck.size() - newCards));
		System.out.println("  *****	Council_Room Test Completed ***** \n\n");
	}
	@Test
	public void feastTest() {
		System.out.println("  *****	Feast Test Beginning *****  ");
		int newCards = 1;

		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Feast));
		testState.players.get(0).playKingdomCard();
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size()));
		System.out.println("deck count = " + testState.players.get(0).discard.size() + ", expected = " + (state.players.get(0).discard.size() + newCards));
		assertEquals(testState.players.get(0).hand.size(), (state.players.get(0).hand.size()));
		assertEquals(testState.players.get(0).discard.size(), (state.players.get(0).discard.size() + newCards));
		assertFalse(testState.players.get(0).hand.contains(Card.getCard(testState.cards, CardName.Feast)));
		System.out.println("  *****	Feast Test Completed ***** \n\n");
	}
	
	@Test
	public void embargoTest() {
		System.out.println("  *****	Embargo Test Beginning *****  ");
		
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Embargo));
		testState.players.get(0).playKingdomCard();
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size()));
		System.out.println("deck count = " + testState.players.get(0).deck.size() + ", expected = " + (state.players.get(0).deck.size()));
		assertEquals(testState.players.get(0).hand.size(), (state.players.get(0).hand.size()));
		assertEquals(testState.players.get(0).deck.size(), (state.players.get(0).deck.size()));
		assertTrue(testState.embargoTokens.containsValue(1));
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Gold));
		testState.players.get(0).playTreasureCard();
		for(Card checker : testState.embargoTokens.keySet()){
			testState.embargoTokens.put(checker, 1);
		}
		//System.out.println(testState.embargoTokens.toString());
		testState.players.get(0).buyCard();
		testState.players.get(0).endTurn();
		assertTrue(testState.players.get(0).discard.contains(Card.getCard(testState.players.get(0).discard, CardName.Curse)));
		//System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Embargo Test Completed ***** \n\n");
	}
	
	@Test
	public void greatHallTest() {
		System.out.println("  *****	Great_Hall Test Beginning *****  ");
		int newCards = 1;
		int newActions = 0;
		int newScore = 1;
		
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Great_Hall));
		testState.players.get(0).playKingdomCard();
		//System.out.println("  *****	Player-1 Start Status ***** ");
		//System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size() + newCards));
		System.out.println("deck count = " + testState.players.get(0).deck.size() + ", expected = " + (state.players.get(0).deck.size() - newCards));
		System.out.println("numActions = " + testState.players.get(0).numActions + ", expected = " + (state.players.get(0).numActions + newActions));
		//System.out.println("  *****	Player-1 End Status ***** ");
		//System.out.println(testState.players.get(0).toString());
		assertEquals(testState.players.get(0).hand.size(), (state.players.get(0).hand.size() + newCards));
		assertEquals(testState.players.get(0).deck.size(), (state.players.get(0).deck.size() - newCards));
		assertEquals(testState.players.get(0).numActions, (state.players.get(0).numActions + newActions));
		
		assertEquals(testState.players.get(0).scoreFor(), (state.players.get(0).scoreFor() + newScore));
		//System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Great_Hall Test Completed ***** \n\n");
	}
	
	@Test
	public void baronTest() {
		System.out.println("  *****	Baron Test Beginning *****  ");
		int newBuys = 1;
		
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Baron));
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Estate));
		testState.players.get(0).playKingdomCard();
		//System.out.println("  *****	Player-1 Start Status ***** ");
		//System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("numActions = " + testState.players.get(0).numBuys + ", expected = " + (state.players.get(0).numBuys + newBuys));
		//System.out.println("  *****	Player-1 End Status ***** ");
		System.out.println(testState.players.get(0).toString());
		assertTrue((testState.players.get(0).hand.contains(Card.getCard(testState.cards, Card.CardName.Estate))) || (testState.players.get(0).coins == 4));
		assertEquals(testState.players.get(0).numBuys, (state.players.get(0).numBuys + newBuys));
		//System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Baron Test Completed ***** \n\n");
	}
	
	@Test
	public void remodelTest() {
		System.out.println("  *****	Remodel Test Beginning *****  ");
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Remodel));
		testState.players.get(0).playKingdomCard();
		
		
		Card newCard = testState.players.get(0).discard.get(1);
		
		List < Card > result = state.players.get(0).hand;
		for(Card temp : testState.players.get(0).hand){
			result.remove(Card.getCard(state.players.get(0).hand, temp.getCardName()));
		}
		Card remodeled = result.get(0);
		
		System.out.println("Remodeled:" + remodeled.toString());
		System.out.println("To:" + newCard.toString());
		assertFalse(testState.players.get(0).hand.contains(Card.getCard(testState.cards, newCard.getCardName())) );
		assertTrue(newCard.getCost() <= (remodeled.getCost() +2));
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Remodel Test Completed ***** \n\n");
	}
	
	@Test
	public void mineTest() {
		System.out.println("  *****	Mine Test Beginning *****  ");
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Mine));
		testState.players.get(0).playKingdomCard();
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println(testState.players.get(0).toString());
		if(testState.players.get(0).hand.size() == 4){
			List < Card > result = state.players.get(0).hand;
			for(Card temp : testState.players.get(0).hand){
				result.remove(Card.getCard(state.players.get(0).hand, temp.getCardName()));
			}
			Card mined = result.get(0);
			System.out.println("Mined: " + mined.toString());
			System.out.println("To: " + testState.players.get(0).discard.get(1).toString());
			assertTrue(testState.players.get(0).discard.get(1).getCost() <= (mined.getCost() + 3));
		}
		System.out.println("  *****	Mine Test Completed ***** \n\n");
	}
	
	@Test
	public void stewardTest() {
		System.out.println("  *****	Steward Test Beginning *****  ");
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Steward));
		testState.players.get(0).playKingdomCard();
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println(testState.players.get(0).toString());
		assertTrue((testState.players.get(0).coins == 2)||(testState.players.get(0).hand.size() == 7) || (testState.players.get(0).hand.size() == 3) );
		System.out.println("  *****	Steward Test Completed ***** \n\n");
	}
	
	@Test
	public void salvagerTest() {
		System.out.println("  *****	Salvager Test Beginning *****  ");
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Salvager));
		testState.players.get(0).playKingdomCard();
		List < Card > result = state.players.get(0).hand;
		for(Card temp : testState.players.get(0).hand){
			result.remove(Card.getCard(state.players.get(0).hand, temp.getCardName()));
		}
		Card salvaged = result.get(0);
		System.out.println("Salvaged:" + salvaged.toString());
		assertFalse(testState.players.get(0).hand.contains(Card.getCard(testState.cards, salvaged.getCardName())) );
		assertEquals(testState.players.get(0).coins, salvaged.getCost() );
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Salvager Test Completed ***** \n\n");
	}
	
	@Test
	public void ambassadorTest() {
		System.out.println("  *****	Ambassador Test Beginning *****  ");
		int opponentGains = 1;
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Ambassador));
		testState.players.get(0).playKingdomCard();
		System.out.println("  *****	Player-2 Status ***** ");
		System.out.println(testState.players.get(1).toString());
		assertEquals(testState.players.get(1).discard.size(), (state.players.get(1).discard.size() + opponentGains));
		System.out.println("  *****	Ambassador Test Completed ***** \n\n");
	}
	
	@Test
	public void cutpurseTest() {
		System.out.println("  *****	Cutpurse Test Beginning *****  ");
		int newCoins = 2;
		int opponentDiscards = 1;
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Cutpurse));
		state.players.get(1).hand.add(Card.getCard(testState.cards, Card.CardName.Copper));
		testState.players.get(1).hand.add(Card.getCard(testState.cards, Card.CardName.Copper));
		testState.players.get(0).playKingdomCard();
		System.out.println("  *****	Player-1 Status ***** ");
		System.out.println("hand count = " + testState.players.get(0).hand.size() + ", expected = " + (state.players.get(0).hand.size()));
		System.out.println("coins count = " + testState.players.get(0).coins + ", expected = " + (state.players.get(0).coins + newCoins));
		System.out.println("  *****	Player-2 Status ***** ");
		//System.out.println(testState.players.get(1).toString());
		if (state.players.get(1).hand.contains(Card.getCard(state.cards, CardName.Copper))){
			assertEquals(testState.players.get(1).hand.size(), (state.players.get(1).hand.size() - opponentDiscards));
		}
		else{
			assertEquals(testState.players.get(1).hand.size(), (state.players.get(1).hand.size()));
		}
		System.out.println("  *****	Cutpurse Test Completed ***** \n\n");
	}
	
	@Test
	public void gardensTest() {
		System.out.println("  *****	Gardens Test Beginning *****  ");
		int newScore = 1;
		//play the game
		testState.players.get(0).hand.add(Card.getCard(testState.cards, Card.CardName.Gardens));
		testState.players.get(0).playKingdomCard();
		//System.out.println("  *****	Player-1 Start Status ***** ");
		//System.out.println(testState.players.get(0).toString());
		System.out.println("  *****	Player-1 Status ***** ");

		System.out.println("Score = " + testState.players.get(0).scoreFor() + ", expected = " + (state.players.get(0).scoreFor() + newScore));
		//System.out.println("  *****	Player-1 End Status ***** ");
		//System.out.println(testState.players.get(0).toString());
		
		assertEquals(testState.players.get(0).scoreFor(), (state.players.get(0).scoreFor() + newScore));
		System.out.println("  *****	Gardens Test Completed ***** \n\n");
	}
}
