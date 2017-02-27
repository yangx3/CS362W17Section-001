

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void test() 
	{
		Card[] deck = new Card[17];
		deck[0] = new CurseCard("Curse", 0, "images/Curse.jpg");
		deck[1] = new TreasureCard("Copper", 0, "images/Copper.jpg", 1);
		deck[2] = new TreasureCard("Silver", 3, "images/Silver.jpg", 2);
		deck[3] = new TreasureCard("Gold", 6, "images/Gold.jpg", 3);
		deck[4] = new VictoryCard("Estate", 2, "images/Estate.jpg", 1);
		deck[5] = new VictoryCard("Duchy", 5, "images/Duchy.jpg", 3);
		deck[6] = new VictoryCard("Province", 8, "images/Province.jpg", 5);
		deck[7] = new KingdomCard("Cellar", 2, "images/Cellar.jpg", "+1 Action  Discard any number of cards, then draw that many."); 
		deck[8] = new KingdomCard("Chapel", 2, "images/Chapel.jpg", "Trash up to 4 cards from your hand."); 
		deck[9] = new KingdomCard("Moat", 2, "images/Moat.jpg", "+2 Cards  When another player plays an Attack card, you may first reveal this from your hand, to be unaffected by it."); 
		deck[10] = new KingdomCard("Harbinger", 3, "images/Harbinger.jpg", "+1 Card, +1 Action,  Look through your discard Pile. You may put a card from it onto your deck."); 
		deck[11] = new KingdomCard("Merchant", 3, "Doesn't exist", "+1 Card, +1 Action,  The first time you play a Silver this turn: +1 Treasure"); 
		deck[12] = new KingdomCard("Vassal", 3, "images/Vassal.jpg", "+2 Treasure,  Discard the top of your deck. If it's an Action card, you may play it."); 
		deck[13] = new KingdomCard("Village", 3, "images/Village.jpg", "+1 Card, +2 Actions"); 
		deck[14] = new KingdomCard("Workshop", 3, "images/Workshop.jpg", "Gain a card costing up to 4 Treasure."); 
		deck[15] = new KingdomCard("Bureaucrat", 4, "images/Bureaucrat.jpg", "Gain a Silver onto your deck. Each other player reveals a Victory card from their hand and puts it onto their deck (or reveals a hand with no Victory cards)."); 
		deck[16] = new KingdomCard("Gardens", 4, "images/Gardens.jpg", "Worth 1 Victory per 10 cards you have (rounded down)."); 
		
		Player player = new Player(deck);
		int currentcoins = player.getCoins();
		player.setCoins(10);	// Adds 10 coins.  Used for bonus cards and for spending coins
		assertEquals("player coins", currentcoins + 10, player.getCoins());  // takes the initial coins and makes sure setCoins works along with getCoins.
		player.cleanup();
		assertEquals("Should have 5 cards directly after cleanup phase", 5, player.getNumCards());
		
		player.drawCard(10); 	// increase arraysize test for Hand. 
								// makes sure running out of cards doesn't crash the game
		
	}

}
