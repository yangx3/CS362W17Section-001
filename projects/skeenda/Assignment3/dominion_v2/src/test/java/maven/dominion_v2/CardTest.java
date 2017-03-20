package maven.dominion_v2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import maven.dominion_v2.Card.CardName;
import maven.dominion_v2.Card.Type;

public class CardTest {

	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);
	Random rand = new Random();
	List<Card> hand = new ArrayList<Card>();
	@Test
	public void testGetType() {		
		for(int i = 0; i<25; i++){
			int random = (int)Randomness.random.nextInt(cards.size());
			Card tmp = cards.get(random);
			if(tmp.getType() == Type.Action){
				continue;
			}
			else if(tmp.getType() == Type.Treasure){
				continue;
			}
			else if(tmp.getType() == Type.Victory)
			{
				continue;
			}
			else
			{
				fail("Not of correct type");
			}
		}
	}
	@Test
	public void testGetCardName() {
		int random = rand.nextInt(20)+1;
		Card tmp = cards.get(random);
		
		for(int i = 0; i < 500; i++)
		{
			if(tmp.getCardName() == CardName.Adventurer || tmp.getCardName() == CardName.Bureaucrat || tmp.getCardName() == CardName.Cellar ||
					tmp.getCardName() == CardName.Chancellor || tmp.getCardName() == CardName.Chapel || tmp.getCardName() == CardName.Copper ||
					tmp.getCardName() == CardName.CouncilRoom || tmp.getCardName() == CardName.Curse || tmp.getCardName() == CardName.Dutchy ||
					tmp.getCardName() == CardName.Estate || tmp.getCardName() == CardName.Feast || tmp.getCardName() == CardName.Festival ||
					tmp.getCardName() == CardName.Gold || tmp.getCardName() == CardName.Laboratory || tmp.getCardName() == CardName.Library ||
					tmp.getCardName() == CardName.Market || tmp.getCardName() == CardName.Province || tmp.getCardName() == CardName.Silver ||
					tmp.getCardName() == CardName.Smithy || tmp.getCardName() == CardName.Woodcutter)
			{
				continue;
			}
			else
			{
				fail("Not of correct Name");
			}
		}
	}
	@Test
	public void testGetTreasure() {
		
		Card tmp = 	Card.getCard(cards, Card.CardName.Gold);
		
		if(tmp.getTreasure() == 3)
		{
			System.out.println("Treasure pass");
		}
		else
		{
			fail("Treasure of wrong value");
		}
	}
	@Test
	public void testPlay(){
		Player player1 = new Player(state, "player-1");
		Player player2 = new Player(state, "player-2");
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame(10);
		Card tmp = 	Card.getCard(cards, Card.CardName.Gold);
		
		tmp.play(player1, state);
		if(player1.coins == 3 && player2.coins == 0)
		{
			System.out.println("Gold works");
			player1.coins = 0;
			player2.coins = 0;
		}
		else{
			fail("Gold didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Silver);
		tmp.play(player1, state);
		if(player1.coins == 2 && player2.coins == 0)
		{
			System.out.println("Silver works");
			player1.coins = 0;
			player2.coins = 0;			
		}
		else{
			fail("Silver didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Copper);
		tmp.play(player1, state);
		if(player1.coins == 1 && player2.coins == 0)
		{
			System.out.println("Copper works");
			player1.coins = 0;
			player2.coins = 0;			
		}
		else{
			fail("Copper didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Cellar);
		tmp.play(player1, state);
		if(player1.numActions == 2 && player2.numActions == 1)
		{
			System.out.println("Cellar works");
			player1.numActions = 0;
			player2.numActions = 0;			
		}
		else
		{
			fail("Cellar didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Chancellor);
		tmp.play(player1, state);
		if(player1.coins == 2 && player2.coins == 0)
		{
			System.out.println("Cellar works");
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Chancellor didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Chapel);
		Card tmp2 = Card.getCard(cards, Card.CardName.Estate);
		player1.hand.add(tmp2);
		player1.hand.add(tmp2);
		player1.hand.add(tmp2);
		int x = player1.hand.size();
		tmp.play(player1, state);
		if(player1.hand.size() < x)
		{
			System.out.println("Chapel works");
		}
		else
		{
			String k = Integer.toString(player1.hand.size());
			fail(k);
		}
		
		
		tmp = Card.getCard(cards, Card.CardName.CouncilRoom);
		player1.numBuys = 0;
		x = player1.hand.size();
		tmp.play(player1, state);
		
		if(player1.hand.size() >= x && player2.hand.size() == 5 && player1.numBuys == 1)
		{
			System.out.println("Cellar works");
			for(int i = 0; i < player1.hand.size(); i++)
			{
				Card c = (Card)player1.hand.get(i);
				if(c == null){
					break;
				}
				player1.discard(c);
			}
			for(int i = 0; i < player2.hand.size(); i++)
			{
				Card c = (Card)player2.hand.get(i);
				if(c == null){
					break;
				}
				player2.discard(c);
			}
			//System.out.println(player2.hand.size());
		}
		else
		{
			fail("CouncilRoom didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Feast);
		tmp.play(player1, state);
		if(player1.coins == 5 && player2.coins == 0)
		{
			System.out.println("Feast works");
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Feast didnt work");
		}
		
		player1.numActions = 0;
		player2.numActions = 0;
		player1.numBuys = 0;
		player2.numBuys = 0;
		player1.coins = 0;
		player2.coins = 0;
		
		tmp = Card.getCard(cards, Card.CardName.Festival);
		tmp.play(player1, state);
		if(player1.numActions == 2 && player2.numActions == 0 && player1.numBuys == 1
				&& player2.numBuys == 0 && player1.coins == 2 && player2.coins == 0)
		{
			System.out.println("Festival works");
			player1.numActions = 0;
			player2.numActions = 0;
			player1.numBuys = 0;
			player2.numBuys = 0;
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Festival didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Laboratory);
		tmp.play(player1, state);
		if(player1.hand.size() >= 5 && player1.numActions == 1 && player2.numActions == 0)
		{
			System.out.println("Laboratory works");
			player1.numActions = 0;
			player2.numActions = 0;
			player1.numBuys = 0;
			player2.numBuys = 0;
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Laboratory didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Library);
		tmp.play(player1, state);
		if(player1.hand.size() == 7)
		{
			System.out.println("Library works");
			player1.numActions = 0;
			player2.numActions = 0;
			player1.numBuys = 0;
			player2.numBuys = 0;
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Library didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Market);
		tmp.play(player1, state);
		if(player1.hand.size() >= 5 && player1.numActions == 1 && player2.numActions == 0
				&& player1.numBuys == 1 && player2.numBuys == 0 && player1.coins == 1 &&
				player2.coins == 0)
		{
			System.out.println("Market works");
			player1.numActions = 0;
			player2.numActions = 0;
			player1.numBuys = 0;
			player2.numBuys = 0;
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Market didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Smithy);
		tmp.play(player1, state);
		if(player1.hand.size() >= 5)
		{
			System.out.println("Smithy works");
			player1.numActions = 0;
			player2.numActions = 0;
			player1.numBuys = 0;
			player2.numBuys = 0;
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Smithy didnt work");
		}
		
		tmp = Card.getCard(cards, Card.CardName.Woodcutter);
		tmp.play(player1, state);
		if(player1.numBuys == 1 && player2.numBuys == 0 && player1.coins == 2 &&
				player2.coins == 0)
		{
			System.out.println("Woodcutter works");
			player1.numActions = 0;
			player2.numActions = 0;
			player1.numBuys = 0;
			player2.numBuys = 0;
			player1.coins = 0;
			player2.coins = 0;			
		}
		else
		{
			fail("Woodcutter didnt work");
		}
	}

		@Test
	public void testfilter(){
		Player player1 = new Player(state, "player-1");
		Player player2 = new Player(state, "player-2");
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame(10);
		
		Card tmp = Card.getCard(cards, Card.CardName.Woodcutter);
		//tmp = Card.getCard(cards, Card.CardName.Smithy);
		//tmp = Card.getCard(cards, Card.CardName.Market);
		hand.add(tmp);
		tmp = Card.getCard(cards, Card.CardName.Smithy);
		hand.add(tmp);
		tmp = Card.getCard(cards, Card.CardName.Market);
		hand.add(tmp);
		
		List<Card> actioncards = Card.filter(hand, Type.Action);
		
		if(actioncards.size() == 3)
		{
			System.out.println("Filter works");
		}
		else
		{
			System.out.println("Filter doesn't work");
		}
	
	
	}
	
	@Test
	public void testEqual(){
		boolean x = cards.equals(cards);
		if(x == true)
		{
			System.out.println("Equals passes");
		}
		else
		{
			fail("Equal no pass");
		}
		x = cards.equals(state);
		if(x==false)
		{
			System.out.println("Equals passes");
		}
		else
		{
			fail("Equal no pass");
		}
		x= state.equals(cards);
		if(x==false)
		{
			System.out.println("Equals passes");
		}
		else
		{
			fail("Equal no pass");
		}
		CardName cardNa = Card.CardName.Woodcutter;
		CardName cardName2 = Card.CardName.Smithy;
		
		if(cardNa.equals(cardName2) != true)
		{
			System.out.println("Equals passes");
		}
		else
		{
			fail("Equal no pass");
		}
		
	}
	@Test
	public void testToString(){
		Card tmp = Card.getCard(cards, Card.CardName.Woodcutter);
		String x = tmp.toString();
		if(x == null)
		{
			fail("ToString fails");
		}
		else{
			System.out.println("ToString passes");
		}
	}
	
	@Test
	public void testGetCard(){
		Card tmp = Card.getCard(cards, Card.CardName.Woodcutter);
		if(tmp != null)
		{
			System.out.println("GetCard Works");
		}
		else
		{
			fail("GetCard failed");
		}
		for(int i = 0; i<cards.size(); i++)
		{
			cards.remove(i);
		}
		tmp = Card.getCard(cards, Card.CardName.Curse);
		if(tmp == null)
		{
			System.out.println("GetCard Works");
		}
		else
		{
			fail("GetCard failed2");
		}
	}
}
