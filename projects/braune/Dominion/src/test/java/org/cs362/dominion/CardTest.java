package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest{
	private Player p1;
	private Player p2;
	private GameState gs;
	private List<Card> c;

	@Before
	public void init(){
		c = new ArrayList<Card>(Card.createCards());
		gs = new GameState(c);
		p1 = new Player(gs, "P1");
		p2 = new Player(gs, "P2");
		gs.addPlayer(p1);
		gs.addPlayer(p2);
		gs.initializeGame();
	}

	// Action card tests

	@Test
	public void testAdventurer(){
		Card card = Card.getCard(c, Card.CardName.Adventurer);
		assertEquals(Card.CardName.Adventurer, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(6, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int handSize = p1.hand.size();
		System.out.println(handSize + "HANDSIZE");
		p1.deck.add(Card.getCard(c, Card.CardName.Gold));
		p1.deck.add(Card.getCard(c, Card.CardName.Gold));
		p1.hand.add(Card.getCard(c, Card.CardName.Adventurer));
		p1.playKingdomCard();
		assertEquals(handSize + 2, p1.hand.size());
	}

	@Test
	public void testAmbassador(){
		Card card = Card.getCard(c, Card.CardName.Ambassador);
		assertEquals(Card.CardName.Ambassador, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(3, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());
	}

	@Test
	public void testBaron(){
		Card card = Card.getCard(c, Card.CardName.Baron);
		assertEquals(Card.CardName.Baron, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(4, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		p1.hand.add(Card.getCard(c, Card.CardName.Baron));
		p1.hand.add(Card.getCard(c, Card.CardName.Estate));
		int numBuys = p1.numBuys;
		int numCoins = p1.coins;
		p1.playKingdomCard();
		assertEquals(numBuys + 1, p1.numBuys);
		assertEquals(numCoins + 4, p1.coins);
	}

	@Test
	public void testCouncil_Room(){
		Card card = Card.getCard(c, Card.CardName.Council_Room);
		assertEquals(Card.CardName.Council_Room, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(5, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int handSize = p1.hand.size();
		int numBuys = p1.numBuys;
		p1.hand.add(Card.getCard(c, Card.CardName.Council_Room));
		p1.playKingdomCard();
		assertEquals(numBuys + 1, p1.numBuys);
		assertEquals(handSize + 4, p1.hand.size());
	}

	@Test
	public void testCutpurse(){
		Card card = Card.getCard(c, Card.CardName.Cutpurse);
		assertEquals(Card.CardName.Cutpurse, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(4, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int numCoins = p1.coins;
		p1.hand.add(Card.getCard(c, Card.CardName.Cutpurse));
		p1.playKingdomCard();
		assertEquals(numCoins + 2, p1.coins);
	}

	@Test
	public void testEmbargo(){
		Card card = Card.getCard(c, Card.CardName.Embargo);
		assertEquals(Card.CardName.Embargo, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(2, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int numCoins = p1.coins;
		int discardSize = p1.discard.size();
		p1.hand.add(Card.getCard(c, Card.CardName.Embargo));
		p1.playKingdomCard();
		assertEquals(numCoins + 2, p1.coins);
		assertEquals(p1.discard.size(), discardSize);
	}

	@Test
	public void testFeast(){
		Card card = Card.getCard(c, Card.CardName.Feast);
		assertEquals(Card.CardName.Feast, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(4, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int numDiscard = p1.discard.size();
		p1.hand.add(Card.getCard(c, Card.CardName.Feast));
		p1.playKingdomCard();
		assertEquals(numDiscard + 1, p1.discard.size());
	}

	@Test
	public void testGardens(){
		Card card = Card.getCard(c, Card.CardName.Gardens);
		assertEquals(Card.CardName.Gardens, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(4, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));
		p1.deck.add(Card.getCard(c, Card.CardName.Feast));

		p1.hand.add(Card.getCard(c, Card.CardName.Gardens));
		assertEquals(1, p1.hand.get(0).score());		
	}

	@Test
	public void testGreat_Hall(){
		Card card = Card.getCard(c, Card.CardName.Great_Hall);
		assertEquals(Card.CardName.Great_Hall, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(3, card.getCost());
		assertEquals(1, card.score());
		assertEquals(0, card.getTreasureValue());

		int handSize = p1.hand.size();
		int numActions = p1.numActions;
		p1.hand.add(Card.getCard(c, Card.CardName.Great_Hall));
		p1.playKingdomCard();
		assertEquals(handSize + 1, p1.hand.size());
		assertEquals(numActions + 2, p1.numActions);
	}

	@Test
	public void testMine(){
		Card card = Card.getCard(c, Card.CardName.Mine);
		assertEquals(Card.CardName.Mine, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(5, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());
	}

	@Test
	public void testSalvager(){
		Card card = Card.getCard(c, Card.CardName.Salvager);
		assertEquals(Card.CardName.Salvager, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(4, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int numBuys = p1.numBuys;
		p1.hand.add(Card.getCard(c, Card.CardName.Salvager));
		p1.playKingdomCard();
		assertEquals(numBuys + 1, p1.numBuys);
	}

	@Test
	public void testSmithy(){
		Card card = Card.getCard(c, Card.CardName.Smithy);
		assertEquals(Card.CardName.Smithy, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(4, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int handSize = p1.hand.size();
		p1.hand.add(Card.getCard(c, Card.CardName.Smithy));
		p1.playKingdomCard();
		assertEquals(handSize + 3, p1.hand.size());
	}

	@Test
	public void testVillage(){
		Card card = Card.getCard(c, Card.CardName.Village);
		assertEquals(Card.CardName.Village, card.getCardName());
		assertEquals(Card.Type.ACTION, card.getType());
		assertEquals(3, card.getCost());
		assertEquals(0, card.score());
		assertEquals(0, card.getTreasureValue());

		int handSize = p1.hand.size();
		int numActions = p1.numActions;
		p1.hand.add(Card.getCard(c, Card.CardName.Village));
		p1.playKingdomCard();
		assertEquals(handSize + 1, p1.hand.size());
		assertEquals(numActions + 2, p1.numActions);
	}

	// Victory card tests

	@Test
	public void testProvince(){
		Card card = Card.getCard(c, Card.CardName.Province);
		assertEquals(Card.CardName.Province, card.getCardName());
		assertEquals(Card.Type.VICTORY, card.getType());
		assertEquals(8, card.getCost());
		assertEquals(6, card.score());
		assertEquals(0, card.getTreasureValue());
	}

	@Test
	public void testDuchy(){
		Card card = Card.getCard(c, Card.CardName.Duchy);
		assertEquals(Card.CardName.Duchy, card.getCardName());
		assertEquals(Card.Type.VICTORY, card.getType());
		assertEquals(5, card.getCost());
		assertEquals(3, card.score());
		assertEquals(0, card.getTreasureValue());
	}

	@Test
	public void testEstate(){
		Card card = Card.getCard(c, Card.CardName.Estate);
		assertEquals(Card.CardName.Estate, card.getCardName());
		assertEquals(Card.Type.VICTORY, card.getType());
		assertEquals(2, card.getCost());
		assertEquals(1, card.score());
		assertEquals(0, card.getTreasureValue());
	}

	@Test
	public void testCurse(){
		Card card = Card.getCard(c, Card.CardName.Curse);
		assertEquals(Card.CardName.Curse, card.getCardName());
		assertEquals(Card.Type.VICTORY, card.getType());
		assertEquals(0, card.getCost());
		assertEquals(-1, card.score());
		assertEquals(0, card.getTreasureValue());
	}

	// Treasure card tests

	@Test
	public void testGold(){
		Card card = Card.getCard(c, Card.CardName.Gold);
		assertEquals(Card.CardName.Gold, card.getCardName());
		assertEquals(Card.Type.TREASURE, card.getType());
		assertEquals(6, card.getCost());
		assertEquals(0, card.score());
		assertEquals(3, card.getTreasureValue());
	}

	@Test
	public void testSilver(){
		Card card = Card.getCard(c, Card.CardName.Silver);
		assertEquals(Card.CardName.Silver, card.getCardName());
		assertEquals(Card.Type.TREASURE, card.getType());
		assertEquals(3, card.getCost());
		assertEquals(0, card.score());
		assertEquals(2, card.getTreasureValue());
	}

	@Test
	public void testCopper(){
		Card card = Card.getCard(c, Card.CardName.Copper);
		assertEquals(Card.CardName.Copper, card.getCardName());
		assertEquals(Card.Type.TREASURE, card.getType());
		assertEquals(0, card.getCost());
		assertEquals(0, card.score());
		assertEquals(1, card.getTreasureValue());
	}

	@Test 
	public void testPlayTreasureCard(){
		int numCoins = p1.coins;

		p1.hand.add(Card.getCard(c, Card.CardName.Gold));
		p1.hand.add(Card.getCard(c, Card.CardName.Silver));
		p1.hand.add(Card.getCard(c, Card.CardName.Copper));
		p1.playTreasureCard();
		assertEquals(numCoins + 6, p1.coins);
	}

	@Test
	public void testBuyCard(){
		p1.numBuys = 2;
		p1.coins = 10;

		p1.buyCard();

		assertEquals(true, p1.discard.contains(Card.getCard(c, Card.CardName.Province)));
		assertEquals(true, p1.discard.size() > 1);
	}

	@Test
	public void testEndTurn(){
		p1.numActions = 5;
		p1.numBuys = 5;
		p1.coins = 5;

		p1.endTurn();

		assertEquals(1, p1.numActions);
		assertEquals(1, p1.numBuys);
		assertEquals(0, p1.coins);
	}
}