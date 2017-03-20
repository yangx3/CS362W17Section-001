package org.cs362.dominion.Dominion;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private GameState g;
	private Player p0;
	private Player p1;
	
	@Before
	public void beforeCardTest() {
		// 2 players, 0 bots, suppress output
		// players are created inside constructor
		g = new GameState(2, 0, false);
		p0 = g.players.get(0);
		p1 = g.players.get(1);
		g.clean();
		p0.clean();
		p1.clean();
	}
	
	@Test
	public void testPlayTreasure() {
		p0.addHand(Card.COPPER);
		Card.COPPER.play(p0);
		assertEquals(p0.getMoney(), 1);
		assertEquals(p0.getFieldSize(), 1);
	}

	@Test
	// Reveal cards from your deck until you reveal 2 Treasure cards.
	// Put those treasure cards into your hand and discard the other revealed cards.
	public void testADVENTURER() {
		p0.addDeck(Card.COPPER);
		p0.addDeck(Card.CURSE);
		p0.addDeck(Card.COPPER);
		p0.addDeck(Card.CURSE);
		Card.ADVENTURER.effect(p0);
		assertEquals(p0.getHandSize(), 2);
		assertEquals(p0.getDiscardSize(), 2);
	}

	@Test
	// Reveal a card from your hand.
	// Return up to two copies of it from your hand to the Supply.
	// Then each other player gains a copy of it.
	public void testAMBASSADOR() {
		boolean handEmpty = true;
		int copies = 0;
		helpAMBASSADOR(handEmpty, copies);
		handEmpty = false;
		helpAMBASSADOR(handEmpty, copies);
		copies = 2;
		helpAMBASSADOR(handEmpty, copies);
	}
	
	public void helpAMBASSADOR(boolean handEmpty, int copies) {
		p0.clean();
		p1.clean();
		g.clean();
		if (!handEmpty) {
			p0.addHand(Card.CURSE);
			p0.addHand(Card.CURSE);
		}
		g.addSupply(Card.CURSE);
		Card.AMBASSADOR.effect(p0, copies);
		if (!handEmpty) {
			assertEquals(p0.getHandSize(), 2 - copies);
			assertEquals(g.getAmount(3), copies);
			assertEquals(p1.getDeckSize(), 1);
		}
		else {
			assertEquals(p1.getDeckSize(), 0);
		}
	}
	
	@Test
	// +1 Buy
	// You may discard an Estate card.
	// If you do, +$4.
	// Otherwise, gain an Estate card.
	public void testBARON() {
		boolean estate = true, discard = true;
		helpBARON(estate, discard);
		discard = false;
		helpBARON(estate, discard);
	}
	
	public void helpBARON(boolean estate, boolean discard) {
		p0.clean();
		assertEquals(p0.getBuys(), 1);
		int choice = 0;
		if (estate)
			p0.addHand(Card.ESTATE);
		if (discard)
			choice = 1;
		Card.BARON.effect(p0, choice);
		assertEquals(p0.getBuys(), 2);
		if (discard && estate) {
			assertEquals(p0.getDiscardSize(), 1);
			assertEquals(p0.getMoney(), 4);
		} else if (estate) {
			assertEquals(p0.getHandSize(), 1);
			assertEquals(p0.getMoney(), 0);
		}
	}
	
	@Test
	// +4 Cards; +1 Buy
	// Each other player draws a card.
	public void testCOUNCILROOM() {
		p0.addDeck(Card.CURSE);
		p0.addDeck(Card.CURSE);
		p0.addDeck(Card.CURSE);
		p0.addDeck(Card.CURSE);
		p1.addDeck(Card.CURSE);
		Card.COUNCILROOM.effect(p0);
		assertEquals(p0.getHandSize(), 4);
		assertEquals(p0.getBuys(), 2);
		assertEquals(p1.getHandSize(), 1);
	}
	
	@Test
	// +$2
	// Each other player discards a Copper card (or reveals a hand with no Copper).
	public void testCUTPURSE() {
		boolean hasCopper = true;
		helpCUTPURSE(hasCopper);
		hasCopper = false;
		helpCUTPURSE(hasCopper);
	}
	
	public void helpCUTPURSE(boolean hasCopper) {
		p0.clean();
		p1.clean();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		if (hasCopper) {
			p1.addHand(Card.COPPER);
		} else {
			p1.addHand(Card.CURSE);
			g.loud = true;
		}
		Card.CUTPURSE.effect(p0);
		if (hasCopper)
			assertEquals(p1.getDiscardSize(), 1);
		else
			assertTrue(out.toString().contains("reveals"));
		System.setOut(System.out);
	}
	
	@Test
	// +$2
	// Trash this card.
	// Put an Embargo token on top of a Supply pile.
	// When a player buys a card, he gains a curse card per Embargo token on that pile.
	public void testEMBARGO() {
		int index = 1;
		helpEMBARGO(index);
		index = 3;
		helpEMBARGO(index);
	}
	
	public void helpEMBARGO(int index) {
		p0.clean();
		p0.addHand(Card.EMBARGO);
		g.addSupply(index);
		g.addSupply(Card.CURSE);
		Card.EMBARGO.effect(p0, index);
		assertEquals(p0.getMoney(), 2);
		assertEquals(p0.getHandSize(), 0);
		assertTrue(g.getEmbargo(index));
//		assertEquals(p1.getDeckSize(), 2);					// not enough time to test buyPhase
	}

	@Test
	// Trash this card.
	// Gain a card costing up to $5.
	public void testFEAST() {
		p0.addHand(Card.FEAST);
		g.addSupply(Card.SILVER);
		Card.FEAST.effect(p0, 5);
		assertEquals(g.getTrashSize(), 1);
		p0.draw();
		assertTrue(p0.getHand(0).cost < 5);
	}

	@Test
	// Worth 1 victory point for every 10 cards in your deck (rounded down).
	public void testGARDENS() {
		for (int i = 0; i < 19; i++)
			p0.addDeck(Card.COPPER);
		assertEquals(Card.GARDENS.getVictory(p0), 1);
	}
	
	@Test
	// 1 Victory Point
	// +1 Card; +1 Action
	public void testGREATHALL() {
		p0.addDeck(Card.CURSE);
		Card.GREATHALL.effect(p0);
		assertEquals(p0.getHandSize(), 1);
		assertEquals(p0.getActions(), 2);
		assertEquals(Card.GREATHALL.getVictory(p0), 1);
	}
	
	@Test
	// Trash a Treasure card from your hand.
	// Gain a Treasure card costing up to $3 more; put it into your hand.
	public void testMINE() {
		p0.addHand(Card.COPPER);
		g.addSupply(Card.SILVER);
		Card.MINE.effect(p0, 2);
		assertEquals(p0.getHandSize(), 1);
		assertTrue(p0.handContains(Card.SILVER));
	}
	
	@Test
	// Trash this and another copy of Treasure Map from your hand.
	// If you do, gain 4 Gold cards, putting them on top of your deck.
	public void testTREASUREMAP() {
		boolean hasMap = true;
		helpTREASUREMAP(hasMap);
		hasMap = false;
		helpTREASUREMAP(hasMap);
	}
	
	public void helpTREASUREMAP(boolean hasMap) {
		p0.clean();
		p0.addHand(Card.TREASUREMAP);
		g.addSupply(Card.GOLD);
		g.addSupply(Card.GOLD);
		g.addSupply(Card.GOLD);
		g.addSupply(Card.GOLD);
		if (hasMap)
			p0.addHand(Card.TREASUREMAP);
		Card.TREASUREMAP.effect(p0);
		if (hasMap) {
			assertEquals(p0.getDeckSize(), 4);
			p0.draw();
			assertTrue(p0.getHand(0).equals(Card.GOLD));
		} else {
			assertEquals(p0.getDeckSize(), 0);
		}
	}
	
	@Test
	// +3 Cards
	public void testSMITHY() {
		p0.addDeck(Card.CURSE);
		p0.addDeck(Card.CURSE);
		p0.addDeck(Card.CURSE);
		Card.SMITHY.effect(p0);
		assertEquals(p0.getHandSize(), 3);
	}
	
	@Test
	// +1 Card; +2 Actions
	public void testVILLAGE() {
		p0.addDeck(Card.CURSE);
		Card.VILLAGE.effect(p0);
		assertEquals(p0.getHandSize(), 1);
		assertEquals(p0.getActions(), 3);
	}
	
	@Test
	public void testEquals() {
		Card c0 = Card.CURSE;
		Card c1 = Card.CURSE;
		assertTrue(c0.equals(c1));
	}

	@Test
	// this doesn't do anything
	public void testEffect() {
		Card.CURSE.effect(p0);
	}

	@Test
	public void testGetVictory() {
		assertEquals(Card.CURSE.getVictory(p0), -1);
		assertEquals(Card.COPPER.getVictory(p0), 0);
	}

	@Test
	public void testGetType() {
		assertEquals(Card.COPPER.getType(), 'T');
		assertEquals(Card.GARDENS.getType(), 'V');
		assertEquals(Card.SMITHY.getType(), 'A');
	}

	@Test
	public void testGetDesc() {
		Card.CURSE.getDesc(p0);
	}
}
