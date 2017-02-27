package dominion;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private GameState state;
	private Player player1;
	private Player player2;
	
	@Before
	public void initPlayer(){
		Randomness.reset(10);
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		player1 = new Player(state, "p1");
		state.addPlayer(player1);
		
		player2 = new Player(state, "p2");
		state.addPlayer(player2);
		state.initializeGame(13);
	}
	
	@Test
	public void testCopperValues(){
		int coppersInHand = 0;
		for(Card c : player1.hand){
			if(c.getCardName() == Card.CardName.Copper){
				coppersInHand++;
			}
		}
		player1.playTreasureCard();
		assertEquals(player1.coins, coppersInHand);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testSilverValues(){
		player1.hand.clear();
		int silversInHand = 0;
		for(int i = 0; i < 5; i++){
			silversInHand++;
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Silver));
		}
		player1.playTreasureCard();
		assertEquals(player1.coins, silversInHand * 2);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testGoldValues(){
		player1.hand.clear();
		int goldsInHand = 0;
		for(int i = 0; i < 5; i++){
			goldsInHand++;
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Gold));
		}
		player1.playTreasureCard();
		assertEquals(player1.coins, goldsInHand * 3);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testEstateValues(){
		player1.hand.clear();
		player1.deck.clear();
		player1.discard.clear();
		int estatesInHand = 0;
		for(int i = 0; i < 5; i++){
			estatesInHand++;
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Estate));
		}
		assertEquals(player1.scoreFor(), estatesInHand);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testDuchyValues(){
		player1.hand.clear();
		player1.deck.clear();
		player1.discard.clear();
		int duchyInHand = 0;
		for(int i = 0; i < 5; i++){
			duchyInHand++;
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Duchy));
		}
		assertEquals(player1.scoreFor(), duchyInHand * 3);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testProvinceValues(){
		player1.hand.clear();
		player1.deck.clear();
		player1.discard.clear();
		int provinceInHand = 0;
		for(int i = 0; i < 5; i++){
			provinceInHand++;
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Province));
		}
		assertEquals(player1.scoreFor(), provinceInHand * 6);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testCurseValues(){
		player1.hand.clear();
		player1.deck.clear();
		player1.discard.clear();
		int cursesInHand = 0;
		for(int i = 0; i < 5; i++){
			cursesInHand++;
			player1.hand.add(Card.getCard(state.cards, Card.CardName.Curse));
		}
		assertEquals(player1.scoreFor(), -cursesInHand);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 0);
	}
	
	@Test
	public void testAdventurer(){
		player1.hand.clear();
		player1.deck.clear();
		player1.discard.clear();
		
		for(int i = 0; i < 5; i++){
			player1.deck.add(Card.getCard(state.cards, Card.CardName.Copper));
		}
		//To test discard
		player1.deck.addFirst(Card.getCard(state.cards, Card.CardName.Estate)); 
		player1.playTreasureCard();
		int coinsBefore = player1.coins;
		int discardBefore = player1.discard.size();
		int handBefore = player1.hand.size();
		int deckBefore = player1.deck.size();
		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Adventurer));
		player1.playKingdomCard(state);
		player1.playTreasureCard();
		assertEquals(player1.coins, coinsBefore + 2); //Only coppers in deck
		assertEquals(player1.deck.size(), deckBefore - 3); //Discarded 1, kept 2
		assertEquals(player1.discard.size(), discardBefore + 1);
		assertEquals(player1.hand.size(), handBefore + 2);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.scoreFor(), 1);	
	}
	
	@Test
	public void testAmbassador(){
		player1.hand.clear();
		Card tmp = Card.getCard(state.cards, Card.CardName.Curse);
		player1.hand.add(tmp);
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Ambassador));
		
		player1.playKingdomCard(state);
		
		assertFalse(player1.hand.contains(tmp));
		assertTrue(player2.discard.contains(tmp));
		assertTrue(state.gameBoard.get(tmp) == 10); //Curse was placed and removed
	}
	
	@Test
	public void testBaron(){
		player1.hand.clear();
		int coinBefore = player1.coins;
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Baron));
		//Discard an estate to gain 4 coin
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Estate));
		
		player1.playKingdomCard(state);
		assertEquals(player1.coins, coinBefore + 4);
		assertFalse(player1.hand.contains(Card.getCard(state.cards, Card.CardName.Estate)));
		assertEquals(player1.numActions, 0);
		assertEquals(player1.hand.size(), 0);
		assertEquals(player1.playedCards.size(), 1);
		
		//Gain an estate
		player2.hand.clear();
		player2.discard.clear();
		coinBefore = player2.coins;
		player2.hand.add(Card.getCard(state.cards, Card.CardName.Baron));
		player2.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		
		player2.playKingdomCard(state);
		
		assertTrue(player2.discard.contains(Card.getCard(state.cards, Card.CardName.Estate)));
		assertEquals(coinBefore, player2.coins);
		assertEquals(player2.numActions, 0);
		assertEquals(player2.hand.size(), 1);
		assertEquals(player2.playedCards.size(), 1);
	}
	
	@Test
	public void testCouncilRoom(){
		System.out.println("---Test Council Room---");
		//Four card, 1 buy
		int hand1Size =  player1.hand.size();
		int hand2Size =  player2.hand.size();
		int deckSize = player1.deck.size();
		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.CouncilRoom));
		player1.playKingdomCard(state);
		
		assertEquals(player1.hand.size(), hand1Size + 4); //Player got 4 cards
		assertEquals(player1.deck.size(), deckSize - 4);
		assertEquals(player2.hand.size(), hand2Size + 1); //Other got 1 extra
		assertEquals(player1.numBuys, 2);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);
	}
	
	@Test
	public void testCutpurse(){
		System.out.println("---Test Cutpurse---");
		//Plus 2 coin, other players discard a copper
		player1.hand.clear();
		player2.hand.clear();
		player2.discard.clear();
		
		player2.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		player2.hand.add(Card.getCard(state.cards, Card.CardName.Adventurer));
		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Cutpurse));
		player1.playKingdomCard(state);
		
		assertEquals(player1.coins, 2);
		assertFalse(player2.hand.contains(Card.getCard(state.cards, Card.CardName.Copper)));
		assertTrue(player2.hand.contains(Card.getCard(state.cards, Card.CardName.Adventurer)));
		assertTrue(player2.discard.contains(Card.getCard(state.cards, Card.CardName.Copper)));
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);
	}
	
	@Test
	public void testEmbargo(){
		System.out.println("---Test Embargo---");
		//I will test buy embargo tokens elsewhere
		player1.hand.clear();
		player1.discard.clear();
		player1.deck.clear();
		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Embargo));
		
		int tokens = 0;
		for(Card c : state.cards){
			tokens += state.tokensPlaced.get(c);
		}
		assertEquals(tokens, 0);  //There are no tokens
		
		player1.playKingdomCard(state);
		int tokensNow = 0;
		Card toked = null;
		for(Card c : state.cards){
			if(state.tokensPlaced.get(c) == 1){
				toked = c;
				tokensNow++;
			}
		}
		assertTrue(player1.coins == 2);
		assertEquals(tokensNow, 1);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);
		
		player1.endTurn();
		assertEquals(player1.discard.size(), 0);  //Unchanged as you trash embargo
		assertTrue(state.tokensPlaced.get(toked) == 1);
	}
	
	@Test
	public void testFeast(){
		System.out.println("---Test Feast---");
		player1.hand.clear();
		player1.deck.clear();
		player1.discard.clear();
		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Feast));
		player1.playKingdomCard(state);
		
		assertTrue(player1.discard.get(0).getCost() <= 5);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 1);
		
		player1.endTurn();
		assertEquals(player1.discard.size(), 0); //Unchanged since feast is trashed
	}
	
	@Test
	public void testGardens(){
		System.out.println("---Test Gardens---");
		
		player1.deck.clear();
		player1.hand.clear();
		player1.discard.clear();
		
		for(int i = 0; i < 20; i++){
			player1.deck.add(Card.getCard(state.cards, Card.CardName.Copper));
		}
		//Now 20 cards in deck
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Gardens));
		
		assertTrue(player1.scoreFor() == 2);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 0);
		
		player1.deck.clear();
		assertTrue(player1.scoreFor()  == 0);
	}
	
	@Test
	public void testGreathall(){
		System.out.println("--Test Greathall--");
		player1.hand.clear();
		int scoreBefore = player1.scoreFor();
		player1.hand.add(Card.getCard(state.cards, Card.CardName.GreatHall));
		
		player1.playKingdomCard(state);
		assertTrue(player1.scoreFor() == scoreBefore+1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 1);
		assertEquals(player1.hand.size(), 1);
		assertEquals(player1.playedCards.size(), 1);
	}
	
	@Test
	public void testMine(){
		System.out.println("---Test Mine---");
		player1.hand.clear();
		
		//Nothing for nothing
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Mine));
		player1.playKingdomCard(state);
		assertEquals(player1.hand.size(), 0);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);
		player1.endTurn();
		player1.hand.clear();
		
		//Copper for Silver
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Copper));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Mine));
		player1.playKingdomCard(state);
		
		assertEquals(player1.hand.get(0).getCardName(), Card.CardName.Silver);
		assertFalse(player1.hand.contains(Card.getCard(state.cards, Card.CardName.Copper)));
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);

		player1.endTurn();
		player1.hand.clear();
		
		//silver for gold		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Silver));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Mine));
		player1.playKingdomCard(state);
		
		assertEquals(player1.hand.get(0).getCardName(), Card.CardName.Gold);
		assertFalse(player1.hand.contains(Card.getCard(state.cards, Card.CardName.Silver)));
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);	
		
		player1.endTurn();
		player1.hand.clear();
		
		//Gold for gold
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Gold));
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Mine));
		player1.playKingdomCard(state);
		
		assertEquals(player1.hand.get(0).getCardName(), Card.CardName.Gold);
		assertEquals(player1.numBuys, 1);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.playedCards.size(), 1);
	}
	
	@Test
	public void testVillage(){
		System.out.println("---Test Village---");
		int handSize = player1.hand.size();
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Village));
		
		player1.playKingdomCard(state);
		assertEquals(player1.numActions, 2);
		assertEquals(player1.hand.size(), handSize+1);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 1);
	}
	
	@Test
	public void testSmithy(){
		System.out.println("---Test Smithy---");
		int handSize = player1.hand.size();
		player1.hand.add(Card.getCard(state.cards, Card.CardName.Smithy));
		
		player1.playKingdomCard(state);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.hand.size(), handSize+3);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 1);
	}
	
	@Test
	public void testSeaHag(){
		System.out.println("---Test SeaHag---");
		int deckOther = player2.deck.size();
		int deckPlayer = player1.deck.size();
		int discOther = player2.discard.size();
		int discPlayer = player1.discard.size();
		
		player1.hand.add(Card.getCard(state.cards, Card.CardName.SeaHag));
		player1.playKingdomCard(state);
		
		//assertEquals(player1.deck.size(), deckPlayer);
		//assertEquals(player1.discard.size(), discPlayer);
		assertEquals(player1.numActions, 0);
		assertEquals(player1.coins, 0);
		assertEquals(player1.playedCards.size(), 1);
		
		assertEquals(player2.deck.size(), deckOther);
		assertTrue(player2.deck.get(0) == Card.getCard(state.cards, Card.CardName.Curse));
		assertEquals(player2.discard.size(), discOther + 1);
	}
	
	@Test
	public void testToString(){
		String a = Card.getCard(state.cards, Card.CardName.Adventurer).toString();
		
		assertTrue(a.contains("Adventurer"));
	}
}
