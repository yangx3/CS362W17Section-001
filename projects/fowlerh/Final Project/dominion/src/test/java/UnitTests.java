import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
	
public class UnitTests {

	// Card Tests
	   @Test
	   public void testgetTreasure() 
	   {	  
	      assertEquals(Card.copper.getTreasure(), 1);
	   }
	   
	   @Test
	   public void testgetCost() 
	   {
		   assertEquals(Card.province.getCost(), 8);
	   }
	   
	   @Test
	   public void testgetVictory() 
	   {
		   assertEquals(Card.duchy.getVictory(),3);
	   }
	   
	   @Test
	   public void testgetTypes() 
	   {
		   List<String> types = new ArrayList<String>();
		   types.add("action");
		   types.add("attack");
		   assertEquals(Card.cutpurse.getTypes(),types);
	   }
	   
	   @Test
	   public void testsetVictory() 
	   {
		   Card.gardens.setVictory(7);
		   assertEquals(Card.gardens.getVictory(),7);
	   }
	   
	   // Test GameBoard
	   
	   @Test
	   public void testCreateKingdomCardList()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
	       List<Card> cards = gb.kingdomCards(Card.adventurer, Card.ambassador, Card.baron, Card.council_room, Card.cutpurse, Card.embargo, Card.feast, Card.gardens, Card.great_hall, Card.mine);
	       assertEquals(cards.size(),10);
	   }
	   
	   @Test
	   public void testCreateGameBoard()
	   {
	       GameBoard gb = new GameBoard(2, "test1");
	       assertEquals(gb.getPlayers().size(),2);
	       gb = new GameBoard(3, "test1");
	       assertEquals(gb.numCardsAvailable(Card.curse),20);
	       gb = new GameBoard(4, "test1");
	       assertEquals(gb.numCardsAvailable(Card.province),12);
	   }
	   
	   @Test
	   public void testPlay()
	   {
	       GameBoard gb = new GameBoard(2, 10);
	       assertEquals(gb.play(),1);
	   }
	   
	   @Test
	   public void testEndOfGame()
	   {
	       GameBoard gb = new GameBoard(2, "test1");
	       for (int i = 0; i < 8; i++)
	       {
	    	   gb.takeCard(Card.province);
	       }
	       assertEquals(gb.gameDone(),true);
	       gb = new GameBoard(2, "test1");
	       assertEquals(gb.gameDone(),false);
	       for (int i = 0; i < 10; i++)
	       {
	    	   gb.takeCard(Card.adventurer);
	    	   gb.takeCard(Card.ambassador);
	    	   gb.takeCard(Card.baron);
	       }
	       assertEquals(gb.gameDone(),true);
	   }
	   
	   
	   
	   
	   // Player Tests
	   
	   
	   @Test
	   public void testConstructorAndGetNameNum()
	   {
	       GameBoard gb = new GameBoard(2, "test1");
		   Player p = new Player("Player 1", 0, gb);
		   assertEquals(p.getName(), "Player 1");
		   assertEquals(p.getNum(), 0);
		   assertEquals(p.getDeck().size(),5);
		   assertEquals(p.getHand().size(),5);
	   }
	   
	   @Test
	   public void testGainCardToHand()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
		   Player p = new Player("Player 1", 0, gb);
		   p.gainCardToHand(Card.curse, gb);
		   assertEquals(p.getHand().contains(Card.curse),true);
	   }
	   
	   @Test
	   public void testPlayCards()
	   {

	   	   GameBoard gb = new GameBoard(2, "test1");
		   Player p = new Player("Player 1", 0, gb);
		   
		   int handSize;
		   int totalVictory;
		   int coins;
		   int totalTreasure;
		   int deckSize;
		   int totalEmbargo;
		   int discardSize;
		   int trashSize;
		   int actions;
		   int buys;
		   
		   p.addActions(100);
		   assertEquals(p.hasActions(), true);
		   
		   p.gainCardToHand(Card.adventurer, gb);
		   p.countTreasure();
		   totalTreasure = p.getCoins();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getPlayedCards().size() >= 1);
		   p.countTreasure();
		   assertTrue(p.getDeck().size() == 0 || p.getCoins() > totalTreasure);
		   
		   p.gainCardToHand(Card.copper, gb);
		   p.gainCardToHand(Card.copper, gb);
		   p.gainCardToHand(Card.copper, gb);
		   p.gainCardToHand(Card.estate, gb);
		   p.gainCardToHand(Card.ambassador, gb);
		   handSize = p.getHand().size();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getHand().size() <= handSize);

		   p.gainCardToHand(Card.estate, gb);
		   p.gainCardToHand(Card.baron, gb);
		   totalVictory = p.getTotalVictoryPoints();
		   coins = p.getCoins();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getTotalVictoryPoints() == totalVictory + 1 || p.getCoins() > coins);
		   
		   p.gainCardToHand(Card.council_room, gb);
		   handSize = p.getHand().size();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertEquals(p.getHand().size(), handSize + 3);

		   p.gainCardToHand(Card.cutpurse, gb);
		   coins = p.getCoins();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertEquals(p.getCoins(), coins + 2);
		   

		   p.gainCardToHand(Card.embargo, gb);
		   totalEmbargo = gb.getTotalEmbargoTokens();
		   coins = p.getCoins();
		   handSize = p.getHand().size();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getCoins() == coins + 2 && p.getHand().size() == handSize - 1 && gb.getTotalEmbargoTokens() == totalEmbargo + 1);

		   p.gainCardToHand(Card.feast, gb);
		   discardSize = p.getDiscard().size();
		   trashSize = gb.getTrash().size();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getDiscard().size() == discardSize + 1 && trashSize == gb.getTrash().size() - 1);
		   
		   
		   p.gainCardToHand(Card.great_hall, gb);		   
		   handSize = p.getHand().size();
		   actions = p.getNumActions();
		   totalVictory = p.getTotalVictoryPoints();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getHand().size() >= handSize && p.getNumActions() >= actions);
		   
		   p.discardHandAndInPlay();
		   p.gainCardToHand(Card.mine, gb);
		   p.gainCardToHand(Card.copper, gb);
		   p.gainCardToHand(Card.copper, gb);
		   p.gainCardToHand(Card.copper, gb);
		   p.gainCardToHand(Card.copper, gb);
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertEquals(p.getHand().contains(Card.silver), true);
		   
		   gb = new GameBoard(2, "test2");
		   p.gainCardToHand(Card.remodel, gb);
		   discardSize = p.getDiscard().size();
		   trashSize = gb.getTrash().size();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getDiscard().size() == discardSize + 1 && gb.getTrash().size() == trashSize + 1);
		   
		   p.gainCardToHand(Card.smithy, gb);
		   handSize = p.getHand().size();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertEquals(handSize, p.getHand().size() - 2);
		   
		   p.discardHandAndInPlay();
		   p.gainCardToHand(Card.salvager, gb);
		   p.gainCardToHand(Card.silver, gb);
		   p.gainCardToHand(Card.silver, gb);
		   p.gainCardToHand(Card.silver, gb);
		   p.gainCardToHand(Card.silver, gb);
		   buys = p.getBuys();
		   coins = p.getCoins();
		   p.playCard(Randomness.randomMember(p.getActionCardIndices()), gb);
		   assertTrue(p.getBuys() == buys + 1 && p.getCoins() == coins + 3);
			   
	   }
	   
	   @Test
	   public void testPlayDominion()
	   {
		   PlayDominion.main(null);
	   }
	   
	   
	   
	   // Additional Tests
	   
	   @Test
	   public void testReturnCard()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
		   gb.returnCard(Card.adventurer);
		   assertEquals(11,gb.numCardsAvailable(Card.adventurer));	   
	   }
	   
	   @Test
	   public void testPlaceEmbargo()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
		   gb.placeEmbargo(Card.adventurer);
		   assertEquals(1,gb.numEmbargoTokens(Card.adventurer));	   
	   }
	   
	   @Test
	   public void testKingdomCards()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
		   List<Card> lc = gb.kingdomCards(10);
		   assertEquals(10,lc.size());	   
	   }
	   
	   @Test
	   public void testGBConstructor()
	   {
		   GameBoard gb = new GameBoard(0, "test1");
		   assertEquals(2,gb.getPlayers().size());	   
	   }
	   
	   @Test
	   public void testGBConstructor2()
	   {
		   GameBoard gb = new GameBoard(0, 7);
		   assertEquals(2,gb.getPlayers().size());	   
	   }
	   
	   @Test
	   public void testOpponentDiscardCopper()
	   {
		   GameBoard gb = new GameBoard(2, 7);
		   gb.opponentDiscardCopper(0);
		   assertTrue(gb.getPlayers().get(1).getDiscard().contains(Card.copper));	   
	   }
	   
	   @Test
	   public void testOpponentDraw()
	   {
		   GameBoard gb = new GameBoard(2, 7);
		   gb.opponentDraw(0);
		   assertEquals(6, gb.getPlayers().get(1).getHand().size());	
		   assertEquals(5, gb.getPlayers().get(0).getHand().size());
	   }
	   
	   @Test
	   public void testOpponentGainCard()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
		   gb.opponentGainCard(0, Card.adventurer);
		   assertTrue(gb.getPlayers().get(1).getDiscard().contains(Card.adventurer));	
		   assertTrue(!gb.getPlayers().get(0).getDiscard().contains(Card.adventurer));
	   }
	   
	   @Test
	   public void testGetActiveSupplyPiles()
	   {
		   GameBoard gb = new GameBoard(2, 7);
		   assertEquals(17, gb.getActiveSupplyPiles().size());	   
	   }
	   	
	   @Test
	   public void testHasCardsAvailable()
	   {
		   GameBoard gb = new GameBoard(2, "test1");
		   assertTrue(gb.hasCardsAvailable(Card.adventurer));	   
	   }
	   
	   
	   @Test
	   public void testgetNumActions() 
	   {	
		  GameBoard gb = new GameBoard(2, "test1");
	      assertEquals(gb.getPlayers().get(0).getNumActions(), 1);
	   }
	   
	   @Test
	   public void testCreateDeck() 
	   {	
		  GameBoard gb = new GameBoard(2, "test1");
	      assertEquals(gb.getPlayers().get(0).getTotalCards(), 10);
	   }
	   
	   @Test
	   public void testInitTurn() 
	   {	
		  GameBoard gb = new GameBoard(2, "test1");
	      assertEquals(gb.getPlayers().get(0).getHand().size(), 5);
	   }
	   
}
	
