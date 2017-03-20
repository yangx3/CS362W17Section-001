package maven.dominion_v2;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PlayerTest {
	List<Card> hand = new ArrayList<Card>();
	LinkedList<Card> deck = new LinkedList<Card>();
	List<Card> discard = new ArrayList<Card>();
	List<Card> playedCards = new ArrayList<Card>();
	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);
	Player player1 = new Player(state, "player-1");
	public static HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();

	@Test
	public void testDrawCard() {
		state.addPlayer(player1);
		//state.initializeGame(10);
		player1.drawCard();
		if(player1.hand.size() == 1){
			System.out.println("Draw Card Works");
		}
		else
		{
			System.out.println("Draw Card does not work");
		}
	}

	@Test
	public void testGain() {
		Card tmp = 	Card.getCard(cards, Card.CardName.Gold);
		boolean v = player1.gain(tmp);
		if(player1.discard.size() == 1 && v != false)
		{
			System.out.println("Gain works");
		}
		else
		{
			fail("Gain does not work");
		}
	}

	@Test
	public void testDiscard() {
		Card tmp = 	Card.getCard(cards, Card.CardName.Gold);
		player1.discard(tmp);
		if(player1.discard.size() == 1)
		{
			System.out.println("Discard works");
		}
		else
		{
			System.out.println("Discard does not work");
		}
	}

	@Test
	public void testScoreFor() {
		Card tmp = Card.getCard(cards, Card.CardName.Estate);
		player1.gain(tmp);
		if(player1.scoreFor() == 3)
		{
			System.out.println("Scorefor works");
		}
		else
		{
			fail("Score is wrong");
		}
		player1.hand.add(tmp);
		if(player1.scoreFor() == 6)
		{
			System.out.println("Scorefor works");
		}
		else
		{
			fail("Score is wrong");
		}
		player1.deck.add(tmp);
		if(player1.scoreFor() == 9)
		{
			System.out.println("Scorefor works");
		}
		else
		{
			fail("Score is wrong");
		}
	}

	@Test
	public void testPlayKingdomCard() {
		
		gameBoard.put(Card.getCard(cards, Card.CardName.Smithy), 0);
		Card tmp = 	Card.getCard(cards, Card.CardName.Smithy);
		player1.hand.add(tmp);
		int x = player1.playedCards.size();
		player1.playKingdomCard();
		player1.numActions = 1;

		
		if(player1.hand.size() == 1 && player1.numActions == 1)
		{
			System.out.println("PlayKingdom Works");
		}
		else
		{
			String k = Integer.toString(player1.numActions);
			fail(k);
		}
		player1.numActions = -1;
		if(player1.hand.size() == 1 && player1.numActions == -1)
		{
			System.out.println("PlayKingdom Works");
		}
		else
		{
			String k = Integer.toString(player1.numActions);
			fail(k);
		}
		if(player1.playedCards.size() > x+1)
		{
			fail("To many cards played");
		}
	}

	@Test
	public void testPlayTreasureCard() {
		Card tmp = 	Card.getCard(cards, Card.CardName.Gold);
		player1.hand.add(tmp);
		player1.playTreasureCard();
		
		if(player1.hand.size() == 0)
		{
			System.out.println("Treasure Cards played");
		}
		else
		{
			fail("Treasure Cards not played");
		}
		
	}

	@Test
	public void testBuyCard() {
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 10);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Adventurer), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Bureaucrat), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Cellar), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Chancellor), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Chapel),0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.CouncilRoom), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Feast), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Festival), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Laboratory), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Library), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Market), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Smithy), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Woodcutter), 0);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 10);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 10);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 10);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 10);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 10);

		
		player1.numBuys = 0;
		player1.coins = 1;
		int x = player1.deck.size();
		player1.buyCard();
		
		if(x == player1.deck.size())
		{
			System.out.println("Card not bought");
		}
		else
		{
			fail("Card not bought");
		}
		
		
		int value = GameState.gameBoard.get(Card.getCard(GameState.cards, Card.CardName.Copper));
		
		player1.numBuys = 1;
		player1.coins = 0;
		player1.buyCard();
		int after = GameState.gameBoard.get(Card.getCard(GameState.cards, Card.CardName.Copper));
		if(player1.coins == 0 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		if(value > after)
		{
			System.out.println("Copper buy worked");
		}
		else{
			fail("Copper buy didnt work");
		}
		
		
		
		//1 COINS
		player1.numBuys = 1;
		player1.coins = 1;
		player1.buyCard();
		
		if(player1.coins == 0 || player1.coins == 1 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		
		
		//2 COINS
		player1.numBuys = 1;
		player1.coins = 2;
		
		int y = player1.discard.size();
		player1.buyCard();
		
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}

		if(player1.coins == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		
		
		
		//3 COINS
		player1.numBuys = 1;
		player1.coins = 3;
		y = player1.discard.size();
		player1.buyCard();
		
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}
		if(player1.coins == 0 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		
		
		
		
		//4 COINS
		player1.numBuys = 1;
		player1.coins = 4;
		y = player1.discard.size();
		player1.buyCard();
		
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}
		if(player1.coins == 0 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		
		
		
		//5 COINS
		player1.numBuys = 1;
		player1.coins = 5;
		y = player1.discard.size();
		player1.buyCard();
		
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}
		if(player1.coins == 0 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		
		
		
		
		//6 COINS
		player1.numBuys = 1;
		player1.coins = 6;
		y = player1.discard.size();
		player1.buyCard();
		
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}
		if(player1.coins == 0 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		
		
		
		
		//7 COINS
		value = GameState.gameBoard.get(Card.getCard(GameState.cards, Card.CardName.Gold));
		player1.numBuys = 1;
		player1.coins = 7;
		y = player1.discard.size();
		player1.buyCard();
		after = GameState.gameBoard.get(Card.getCard(GameState.cards, Card.CardName.Gold));
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}
		if(player1.coins == 0 || player1.coins == 1 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		if(value > after)
		{
			System.out.println("Gold buy worked");
		}
		else{
			fail("Gold buy didnt work");
		}
		
		
		
		
		//8 COINS
		value = GameState.gameBoard.get(Card.getCard(GameState.cards, Card.CardName.Province));
		player1.numBuys = 1;
		player1.coins = 8;
		y = player1.discard.size();
		player1.buyCard();
		after = GameState.gameBoard.get(Card.getCard(GameState.cards, Card.CardName.Province));
		
		if(player1.discard.size() > y)
		{
			System.out.println("Buying workd");
		}
		else{
			fail("buying didnt work");
		}
		if(player1.coins == 0 && player1.numBuys == 0){
			System.out.println("Copper bought");
		}
		else{
			fail("Nothing bought");
		}
		if(value > after)
		{
			System.out.println("Province buy worked");
		}
		else{
			fail("Province buy didnt work");
		}
	}

	@Test
	public void testEndTurn() {
		player1.endTurn();
		if(player1.hand.size() == 5)
		{
			System.out.println("Endturn works");
		}
		else
		{
			fail("End turn doesnt work");
		}
	}

}
