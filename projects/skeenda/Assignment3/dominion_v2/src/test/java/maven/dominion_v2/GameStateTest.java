package maven.dominion_v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

import maven.dominion_v2.Card.Type;

public class GameStateTest {

	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);
	int random = (int)Randomness.random.nextInt(cards.size());
	Card tmp = cards.get(random);
	Player player1 = new Player(state, "player-1");
	Player player2 = new Player(state, "player-2");
	List<Card> hand = new ArrayList<Card>();
	
	@Test
	public void testAddPlayer() {
		state.addPlayer(player1);
		state.addPlayer(player2);
		assert(state.players.size() == 2);
	}

	@Test
	public void testInitializeGame() {
		state.addPlayer(player1);
		state.initializeGame(10);
		//System.out.println(GameState.gameBoard.size());
		if(GameState.gameBoard.size() == 60)
		{
			System.out.println("Board created correctly");
		}
		if(player1.deck.size() == 5)
		{
			System.out.println("Init passes");
		}
		else
		{
			String x = Integer.toString(player1.deck.size());
			fail(x);
		}
	}
		

	@Test
	public void testPlay() {
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame(10);
		HashMap<Player, Integer> winners=state.play();
		if(winners.get(player1) == player1.scoreFor())
		{
			System.out.println("Player 1 score is correct");
		}
		if(winners.get(player2) == player2.scoreFor())
		{
			System.out.println("Player 2 score is correct");
		}
		
		
	}
		@Test
	public void testIsGameOver(){
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 0);
		boolean z = state.isGameOver();
		
		if(z== true)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 0);
		z = state.isGameOver();
		
		if(z== true)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}

		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 0);
		z = state.isGameOver();
		
		if(z== true)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 0);
		z = state.isGameOver();
		
		if(z== true)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 0);
		z = state.isGameOver();
		
		if(z== true)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 0);
		z = state.isGameOver();
		
		if(z== true)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Dutchy), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 1);
		GameState.gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 1);
		z = state.isGameOver();
		
		if(z== false)
		{
			System.out.println("Gameover works");
		}
		else
		{
			fail("Gameover fials");
		}
	}

}
