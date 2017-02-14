package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */


public class AppTest {
	@Test
	public void TestPlayer() {		//test if gain is working
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player = new Player(state, "player-1",1);
		player.gain(Card.getCard(cards, Card.CardName.Smithy));
		assertTrue(player.discard.size() == 1);
	}
	@Test
	public void TestGameWithAI() {
		PlayDominion Test = new PlayDominion();	
		PlayDominion.main(null);
	}
	@Test
	public void Test1Player() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player = new Player(state, "player-1",1);
		state.addPlayer(player);
		state.initializeGame();
		assertEquals(state.gameBoard.size(), 0);
		}
	@Test
	public void TestAmbassador() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		Player player2 = new Player(state, "player-1",0);
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Smithy), 0);
		Card C1 = Card.getCard(cards, Card.CardName.Ambassador);
		player1.hand.add(C1);
		player1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
		C1.play(player1,state, 1, 1); 
		int v1 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Smithy));
		assertEquals(v1, 0);
		}
	@Test
	public void TestBaron() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		state.addPlayer(player1);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 1);
		Card C2 = Card.getCard(cards, Card.CardName.Baron);
		C2.play(player1,state,0,0);
		assertEquals(player1.discard.get(0).getCardName(), Card.CardName.Estate);
		player1.hand.add(Card.getCard(cards, Card.CardName.Estate));
		C2.play(player1,state,1,0);
		assertEquals(player1.hand.size(), 0);
	}
	@Test
	public void TestCouncil_room() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		state.addPlayer(player1);
		state.initializeGame();
		Card C = Card.getCard(cards, Card.CardName.Council_room);
		C.play(player1,state,0,0);
		assertEquals(player1.hand.size(), 9);
	}
	@Test
	public void TestCutpurse() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		Player player2 = new Player(state, "player-1",0);
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame();
		Card C = Card.getCard(cards, Card.CardName.Cutpurse);
		C.play(player1,state,0,0);
		assertEquals(player1.coins, 2);
	}
	@Test
	public void TestEmbargo() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		Card C1 = Card.getCard(cards, Card.CardName.Smithy);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Smithy), 2);
		state.addPlayer(player1);
		Card C = Card.getCard(cards, Card.CardName.Embargo);
		C.play(player1,state,0,0);
		player1.numBuys = 1;
		player1.buyCard(state, C1);
		assertEquals(player1.discard.size() , 2);
	}
	@Test
	public void TestFeast() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		Card C1 = Card.getCard(cards, Card.CardName.Feast);
		player1.coins = 1;
		C1.play(player1, state, 0 , 0);
		assertEquals(player1.coins, 1);
	}
	@Test
	public void TestGardens() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		player1.numActions = 1;
		Card C1 = Card.getCard(cards, Card.CardName.Gardens);
		C1.play(player1, state, 0, 0);
		assertEquals(player1.numActions, 2);
	}
	@Test
	public void TestGreat_hall() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		player1.numActions = 1;
		Card C1 = Card.getCard(cards, Card.CardName.Great_hall);
		C1.play(player1, state, 0, 0);
		assertEquals(player1.numActions, 2);
	}
	@Test
	public void TestMine() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 2);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 2);
		player1.hand.add(Card.getCard(cards, Card.CardName.Cooper));
		player1.hand.add(Card.getCard(cards, Card.CardName.Silver));
		Card C1 = Card.getCard(cards, Card.CardName.Mine);
		C1.play(player1, state, 1, 0);
		C1.play(player1, state, 2, 0);
		assertEquals(player1.discard.size(), 2);	
	}
	@Test
	public void TestSmithyVillage() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		Player player2 = new Player(state, "Player-2", 0);
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame();
		Card C1 = Card.getCard(cards, Card.CardName.Smithy);
		C1.play(player1, state,0,0);
		Card C2 = Card.getCard(cards, Card.CardName.Village);
		C2.play(player2, state,0,0);
		assertEquals(player1.hand.size(), 8);
		assertEquals(player2.hand.size(), 6);
		assertEquals(player2.numActions, 2);
	}
	//@Test
	public void TestTribute() {
		List<Card> cards = new ArrayList<Card>(Card.createCards());
		GameState state = new GameState(cards);
		Player player1 = new Player(state, "player-1",0);
		Player player2 = new Player(state, "player-2",0);
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame();
		player1.coins = 0;
		player2.deck.clear();
		player2.deck.add(Card.getCard(cards, Card.CardName.Cooper));
		player2.deck.add(Card.getCard(cards, Card.CardName.Cooper));
		Card C1 = Card.getCard(cards, Card.CardName.Tribute);
		C1.play(player1, state, 0, 0);
		assertEquals(player1.coins, 4);
		player1.numActions = 0;
		player2.deck.add(0,Card.getCard(cards, Card.CardName.Smithy));
		player2.deck.add(1,Card.getCard(cards, Card.CardName.Smithy));
		C1.play(player1,state,0,0);
		assertEquals(player1.numActions, 5);
		player2.deck.add(0,Card.getCard(cards, Card.CardName.Estate));
		player2.deck.add(1,Card.getCard(cards, Card.CardName.Estate));
		C1.play(player1,state,0,0); 
		assertEquals(player1.hand.size(), 9);
		}
}