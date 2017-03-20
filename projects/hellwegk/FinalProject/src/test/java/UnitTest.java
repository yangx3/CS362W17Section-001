import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnitTest {

	@Test
	public void playGameTest()
	{
		PlayGame.main(null);
	}
	
	@Test
	public void getVictoryTest()
	{
		assertEquals(Card.province.getVictory(), 6);
	}
	
	@Test
	public void getCostTest()
	{
		assertEquals(Card.duchy.getCost(), 5);
	}
	
	@Test
	public void getCoinsTest()
	{
		assertEquals(Card.gold.getCoins(), 3);
	}
	
	@Test
	public void getEmbargoTest()
	{
		assertEquals(Card.seahag.getEmbargo(), 0);
	}
	
	@Test
	public void getTypesTest()
	{
		List<String> typeList = new ArrayList<String>();
		typeList.add("action");
		typeList.add("victory");
		assertEquals(Card.great_hall.getTypes(), typeList);
	}
	
	@Test
	public void playTest()
	{
		DominionBoard game = new DominionBoard(2, 10); // Sets up a new game with 2 players and a seed of 10
		assertEquals(game.play(), 1);
		assertTrue(game.getPlayers().get(0).getDeck().size() + game.getPlayers().get(0).getHand().size() + game.getPlayers().get(0).getDiscard().size() > 10);
	}
	
	@Test
	public void kingdomCardsTest()
	{
		DominionBoard game = new DominionBoard(2, 10); // Sets up a new game with 2 players and a seed of 10
		List<Card> cards = game.allKC();
		assertTrue(cards.contains(Card.smithy) && cards.size() == 13);
		cards = game.kingdomCards(10);
		assertEquals(cards.size(), 10);
	}
	
	@Test
	public void DominionBoardTest ()
	{
		DominionBoard game = new DominionBoard(3, 23); // Sets up a new game with 3 players and a seed of 23
		assertEquals(game.getPlayers().size(), 3);
	}
	
	@Test
	public void actionCardsTest()
	{
		DominionBoard game = new DominionBoard(3); // Sets up a new game with 3 players
		Player p = new Player("Player1", 0, game);
		int hand;
		int coins;
		int actions;
		
		p.addActions(10);
		assertEquals(p.actionsLeft(), true);
		
		//makes sure deck is empty or you end up with more cards in your hand.
		p.gainCardToHand(Card.adventurer, game);
		hand = p.getHand().size();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getDeck().size() == 0  || p.getHand().size() > hand);
		
		//make sure you don't gain any cards and your hand is either the same size or smaller than before.
		p.gainCardToHand(Card.ambassador, game);
		p.gainCardToHand(Card.copper, game);
		hand = p.getHand().size();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getHand().size() <= hand);
				
		//makes sure you gain 4 coins if you have an estate and discard it
		p.gainCardToHand(Card.baron, game);
		p.gainCardToHand(Card.estate, game);
		coins = p.getCoins();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getCoins() == coins + 4);
		
		//makes sure you draw 3 cards
		p.gainCardToHand(Card.council_room, game);
		hand = p.getHand().size();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getHand().size() == hand + 3);
		
		//makes sure you gain 2 coins
		p.gainCardToHand(Card.cutpurse, game);
		coins = p.getCoins();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getCoins() == coins + 2);
		
		//makes sure you gain 2 coins and have one less card than before
		p.gainCardToHand(Card.embargo, game);
		coins = p.getCoins();
		hand = p.getHand().size();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getCoins() == coins + 2 && p.getHand().size() < hand);
		
		//make sure you gain 1 card and 1 action
		p.gainCardToHand(Card.great_hall, game);
		hand = p.getHand().size();
		actions = p.getActions();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getHand().size() == hand && p.getActions() == actions);

		//makes sure you gain coins(or have same amount if you don't trash one)
		p.gainCardToHand(Card.mine, game);
		coins = p.getCoins();
		p.playCard(Randomness.randomMember(p.actionCardIndices()), game);
		assertTrue(p.getCoins() >= coins);
	}
	
	@Test
	public void gameOverTest()
	{
		DominionBoard game = new DominionBoard(4); // Sets up a new game with four players
		for (int i = 0; i < 12; i++)
		{
			game.takeCard(Card.province);
		}
		assertTrue(game.gameOver() == true);
		game = new DominionBoard(4);
		assertTrue(game.gameOver() == false);
		for(int i = 0; i < 10; i++)
		{
			game.takeCard(Card.smithy);
			game.takeCard(Card.ambassador);
			game.takeCard(Card.council_room);
		}
		assertTrue(game.gameOver() == true);
	}
	
	
	
	@Test
	public void setUpTest()
	{
		DominionBoard game = new DominionBoard(4);
		Player p = new Player("Player1", 0, game);
		assertEquals(p.getDiscard().size() + p.getHand().size(), 10);
	}
	
	@Test
	public void copperTest()
	{
		DominionBoard game = new DominionBoard(4);
		Player p = new Player("Player1", 0, game);
		p.getDiscard().remove(Card.estate);
		p.getDiscard().remove(Card.estate);
		p.getDiscard().remove(Card.estate);
		assertEquals(p.getDiscard().size() + p.getHand().size(), 7);
	}
	
	
	@Test
	public void returnCardTest()
	{
		DominionBoard game = new DominionBoard(2);
		game.returnCard(Card.baron); //11
		game.takeCard(Card.baron); //10
		game.takeCard(Card.baron); //9
		game.takeCard(Card.baron); //8
		game.takeCard(Card.baron); //7
		game.takeCard(Card.baron); //6
		game.takeCard(Card.baron); //5
		game.takeCard(Card.baron); //4
		game.takeCard(Card.baron); //3
		game.takeCard(Card.baron); //2
		game.takeCard(Card.baron); //1

		assertEquals(game.availableCards(Card.baron), true);
	}
	
	@Test
	public void addEmbargoToCardTest()
	{
		int BaronEmbargo = Card.baron.getEmbargo();
		Card.baron.addEmbargoToCard();
		assertEquals(Card.baron.getEmbargo(), BaronEmbargo + 1);
	}
	
	@Test
	public void getHighestValueCardsTest()
	{
		DominionBoard game = new DominionBoard(2, 10);
		List<Card> cards = game.getHighestValueCards(8);
		assertTrue(cards.size() == 1 && cards.contains(Card.province));
	}
	
	@Test
	public void getNonEmptySupplyPilesTest()
	{
		DominionBoard game = new DominionBoard(2, 10);
		List<Card> cards = game.getNonEmptySupplyPiles();
		assertEquals(cards.size(), 17);
	}
	
	@Test
	public void councilRoomHelperTest()
	{
		DominionBoard game = new DominionBoard(2);
		game.councilRoomHelper(0);
		assertEquals(game.getPlayers().get(1).getHand().size(), 1);
	}
	
	@Test
	public void seaHagHelperTest()
	{
		DominionBoard game = new DominionBoard(2);
		game.seaHagHelper(0);
		assertEquals(game.getPlayers().get(1).getDeck().contains(Card.curse), true);
	}
	
	@Test
	public void ambassadorHelperTest()
	{
		DominionBoard game = new DominionBoard(2);
		game.ambassadorHelper(0, Card.baron);
		assertEquals(game.getPlayers().get(1).getDiscard().contains(Card.baron), true);
	}
	
	@Test
	public void dominionBoardConstructor1Test()
	{
		DominionBoard game = new DominionBoard(2, 10);
		assertEquals(game.getPlayers().size(), 2);
		assertEquals(game.getPlayers().get(0).getName(), "Player1");
		game = new DominionBoard(3,10);
		assertEquals(game.getPlayers().size(), 3);
		game = new DominionBoard(4,10);
		assertEquals(game.getPlayers().size(), 4);
		game = new DominionBoard(1,10);
		assertEquals(game.getPlayers().size(), 2);
	}
	
	@Test
	public void dominionBoardConstructor2Test()
	{
		DominionBoard game = new DominionBoard(2);
		assertEquals(game.getPlayers().size(), 2);
		assertEquals(game.getPlayers().get(0).getName(), "Player1");
		for (int i = 0; i < 8; i++)
		{
			game.takeCard(Card.gardens);
			game.takeCard(Card.baron);
		}
		assertEquals(game.availableCards(Card.gardens), false);
		assertEquals(game.availableCards(Card.baron), true);
		game = new DominionBoard(3);
		assertEquals(game.getPlayers().size(), 3);
		for (int i = 0; i < 8; i++)
		{
			game.takeCard(Card.gardens);
		}
		assertEquals(game.availableCards(Card.gardens), true);
		game = new DominionBoard(4);
		assertEquals(game.getPlayers().size(), 4);
		game = new DominionBoard(1);
		assertEquals(game.getPlayers().size(), 2);
	}
	
	@Test
	public void curseCostTest()
	{
		assertEquals(Card.curse.getCost(), 0);
		assertEquals(Card.curse.getCoins(), 0);
		assertEquals(Card.curse.getVictory(), -1);
	}
	
	@Test
	public void provinceTest()
	{
		assertEquals(Card.province.getCost(), 8);
		assertEquals(Card.province.getCoins(), 0);
		assertEquals(Card.province.getVictory(), 6);
		assertEquals(Card.province.getEmbargo(), 0);
		assertTrue(Card.province.getTypes().contains("victory"));
	}
	
	
	
}
