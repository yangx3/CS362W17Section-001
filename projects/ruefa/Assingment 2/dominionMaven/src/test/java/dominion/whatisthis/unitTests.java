package dominion.whatisthis;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import dominion.Card;
import dominion.Player;
import dominion.dominionBoard;
import dominion.dominionBoard;
import dominion.Card.Name;
import dominion.Card.Type;

import java.util.ArrayList;
public class unitTests {

	//tests adding cards without buying them.
	@Test
	public void addCardTest() {
		int i=0;
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		for(Card card : dominionBoard.cardList.values())
		{
			dominionBoard.addCard(player, card);
			assert(player.getdiscard().get(i) == card);
			i++;
		}
	}
	
	//make sure you can buy when you have enough money
	@Test
	public void successfulBuy() {
		Player player;
		new dominionBoard(2);
		player = dominionBoard.players[0];
		for(Card card : dominionBoard.cardList.values())
		{
			player.setmoney(card.cost);
			dominionBoard.buyCard(player, card);
			if(card == dominionBoard.cardList.get(Card.Name.curse))
				assert(dominionBoard.players[1].getdiscard().contains(card));
			else
				assert(player.getdiscard().contains(card));
		}
	}
	
	//tests buying cards you have no money for(also make sure copper and curse cards get bought since they are free)
	@Test
	public void noMoneyBuy() {
		Player player;
		new dominionBoard(2);
		player = dominionBoard.players[0];
		for(Card card : dominionBoard.cardList.values()){
			dominionBoard.buyCard(player, card);
			if(card == dominionBoard.cardList.get(Card.Name.curse))
				assert(dominionBoard.players[1].getdiscard().contains(card));
			else if(card == dominionBoard.cardList.get(Card.Name.copper))
				assert(player.getdiscard().contains(card));
			else
				assert(!player.getdiscard().contains(card));
		}
	}
	
	//tests buying cards that have are out
	@Test
	public void noPoolBuy() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card card = dominionBoard.cardList.get(Card.Name.gold);
		player.setmoney(card.cost);
		dominionBoard.pool.put(card, 0);
		dominionBoard.buyCard(player, card);
		assert(player.getdiscard().size()==0);
		assert(dominionBoard.pool.get(card)==0);
	}
	
	//tests drawing cards
	@Test
	public void drawTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card[] cards = new Card[5];
		cards[0] = dominionBoard.cardList.get(Card.Name.copper);
		cards[1] = dominionBoard.cardList.get(Card.Name.smithy);
		cards[2] = dominionBoard.cardList.get(Card.Name.gardens);
		cards[3] = dominionBoard.cardList.get(Card.Name.gold);
		cards[4] = dominionBoard.cardList.get(Card.Name.estate);
		for(int i=0;i<cards.length;i++)
		{
			player.getdiscard().add(cards[i]);
		}
		player.draw(5);
		assert(player.getdeck().size()==0);
		assert(player.getdiscard().size()==0);
		for(int i=0;i<cards.length;i++)
		{
			assert(player.gethand().contains(cards[i]));
		}
	}
	
	//test if the game is over
	@Test
	public void isGameOverTest() {
		new dominionBoard(2);
		assert(dominionBoard.isGameOver()==false);
		dominionBoard.pool.put(dominionBoard.cardList.get(Card.Name.province), 0);
		assert(dominionBoard.isGameOver()==true);
		new dominionBoard(2);
		assert(dominionBoard.isGameOver()==false);
		dominionBoard.pool.put(dominionBoard.cardList.get(Card.Name.gold), 0);
		dominionBoard.pool.put(dominionBoard.cardList.get(Card.Name.smithy), 0);
		dominionBoard.pool.put(dominionBoard.cardList.get(Card.Name.gardens), 0);
		assert(dominionBoard.isGameOver()==true);
	}
	
	//tests the function that plays cards
	@Test
	public void playCardTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card card = dominionBoard.cardList.get(Card.Name.gold);
		player.gethand().add(card);
		dominionBoard.playCard(card);
		assert(player.gethand().size()==0);
		assert(player.getdiscard().get(0)==card);
	}
	
	//tests the cleanup function
	@Test
	public void cleanupTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		for(Card card : dominionBoard.cardList.values())
		{
			player.getdeck().add(card);
			if(player.getdeck().size()==5)
				break;
		}
		player.cleanup();
		assert(player.getactions()==1);
		assert(player.getbuys()==1);
		assert(player.getmoney()==0);
		assert(player.gethand().size()==5);
	}
	
	//tests the function that returns action cards in a players hand
	@Test
	public void actionCardsTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card[] cards = new Card[3];
		cards[0] = dominionBoard.cardList.get(Card.Name.smithy);
		cards[1] = dominionBoard.cardList.get(Card.Name.adventurer);
		cards[2] = dominionBoard.cardList.get(Card.Name.salvager);
		Card vpCard = dominionBoard.cardList.get(Card.Name.estate);
		for(int i=0;i<3;i++)
		{
			player.gethand().add(cards[i]);
		}
		for(int i=0;i<3;i++)
		{
			assert(player.actionCards().contains(cards[i]));
		}
		assert(!player.actionCards().contains(vpCard));
	}
	
	//test that the winner function
	@Test
	public void winnerTest() {
		new dominionBoard(2);
		Card estate = dominionBoard.cardList.get(Card.Name.estate);
		Card duchy = dominionBoard.cardList.get(Card.Name.duchy);
		Card province = dominionBoard.cardList.get(Card.Name.province);
		Card gardens = dominionBoard.cardList.get(Card.Name.gardens);
		Card smithy = dominionBoard.cardList.get(Card.Name.smithy);
		dominionBoard.players[0].getdeck().add(estate);
		dominionBoard.players[0].getdeck().add(province);
		dominionBoard.players[0].getdeck().add(duchy);
		
		dominionBoard.turn=1;
		for(int i=0;i<10;i++)
		{
			dominionBoard.players[1].getdeck().add(smithy);
		}
		dominionBoard.players[1].getdeck().add(gardens);

		assert(dominionBoard.winner().equals("Player1 wins!"));
		assert(dominionBoard.players[0].getvp()==10);
		assert(dominionBoard.players[1].getvp()==1);
	}
	
	//tests the embargo card
	@Test
	public void embargoTest() {
		new dominionBoard(2);
		Card embargo = dominionBoard.cardList.get(Card.Name.embargo);
		dominionBoard.players[0].gethand().add(embargo);
		dominionBoard.playCard(embargo);
		Card card = embargo;
		for(Card i : dominionBoard.embargo.keySet())
		{
			if(dominionBoard.embargo.get(i)==1)
				card = i;
		}
		dominionBoard.players[1].setmoney(card.cost);
		dominionBoard.buyCard(dominionBoard.players[1], card);
		assert(dominionBoard.players[1].getdiscard().contains(dominionBoard.cardList.get(Card.Name.curse)));
	}
	
	//tests the options function
	@Test
	public void optionsTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card[] cards = new Card[7];
		cards[0] = dominionBoard.cardList.get(Card.Name.ambassador);
		cards[1] = dominionBoard.cardList.get(Card.Name.embargo);
		cards[2] = dominionBoard.cardList.get(Card.Name.great_hall);
		cards[3] = dominionBoard.cardList.get(Card.Name.copper);
		cards[4] = dominionBoard.cardList.get(Card.Name.silver);
		cards[5] = dominionBoard.cardList.get(Card.Name.curse);
		cards[6] = dominionBoard.cardList.get(Card.Name.estate);
		ArrayList<Card> options = dominionBoard.cardOptions(3);
		for(int i=0;i<cards.length;i++)
		{
			assert(options.contains(cards[i]));
		}
	}
	
	//test the adventurer card
	@Test
	public void adventurerTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card adventurer = dominionBoard.cardList.get(Card.Name.adventurer);
		Card smithy = dominionBoard.cardList.get(Card.Name.smithy);
		Card gold = dominionBoard.cardList.get(Card.Name.gold);
		player.getdeck().add(smithy);
		player.getdeck().add(smithy);
		player.getdeck().add(smithy);
		player.getdeck().add(gold);
		player.getdeck().add(gold);
		adventurer.name.action();
		assert(player.gethand().get(0)==gold);
		assert(player.gethand().get(1)==gold);
		assert(player.getdiscard().size()==3);
	}
	
	//test the mine card
	@Test
	public void mineTest() {
		new dominionBoard(2);
		Player player = dominionBoard.players[0];
		Card mine = dominionBoard.cardList.get(Card.Name.mine);
		Card copper = dominionBoard.cardList.get(Card.Name.copper);
		int cost = copper.cost+3;
		player.gethand().add(copper);
		for(int i=0;i<20;i++)
		{
			cost = player.gethand().get(0).cost+3;
			mine.name.action();
			assert(player.gethand().size()==1);
			assert(player.gethand().get(0).type==Card.Type.treasure);
			assert(player.gethand().get(0).cost<=cost);
		}
	}
	
	//Run the game a few times and tests that they finished correctly
	@Test
	public void fullRunTest() {
		for(int i=0;i<20;i++)
		{
			new dominionBoard(2);
			dominionBoard.start();
			assert(dominionBoard.isGameOver()==true);
		}
	}

}
