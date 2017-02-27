

import static org.junit.Assert.*;

import org.junit.Test;

public class SupplyPileTest {

	@Test
	public void test() {
		Card[] deck = new Card[33];
		
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
		deck[11] = new KingdomCard("Merchant", 3, "images/Merchant.jpg", "+1 Card, +1 Action,  The first time you play a Silver this turn: +1 Treasure"); 
		deck[12] = new KingdomCard("Vassal", 3, "images/Vassal.jpg", "+2 Treasure,  Discard the top of your deck. If it's an Action card, you may play it."); 
		deck[13] = new KingdomCard("Village", 3, "images/Village.jpg", "+1 Card, +2 Actions"); 
		deck[14] = new KingdomCard("Workshop", 3, "images/Workshop.jpg", "Gain a card costing up to 4 Treasure."); 
		deck[15] = new KingdomCard("Bureaucrat", 4, "images/Bureaucrat.jpg", "Gain a Silver onto your deck. Each other player reveals a Victory card from their hand and puts it onto their deck (or reveals a hand with no Victory cards)."); 
		deck[16] = new KingdomCard("Gardens", 4, "images/Gardens.jpg", "Worth 1 Victory per 10 cards you have (rounded down)."); 
		deck[17] = new KingdomCard("Militia", 4, "images/Militia.jpg", "+2 Treasure, Each other players discards down to 3 cards in hand."); 
		deck[18] = new KingdomCard("Moneylender", 4, "images/Moneylender.jpg", "You may trash a Copper from your hand for +3 Treasure."); 
		deck[19] = new KingdomCard("Poacher", 4, "images/Poacher.jpg", "+1 Card, +1 Action, +1 Treasure,  Discard a card per empty Supply pile."); 
		deck[20] = new KingdomCard("Remodel", 4, "images/Remodel.jpg", "Trash a card from your hand. gain a card costing up to 2 Treasure more than it."); 
		deck[21] = new KingdomCard("Smithy", 4, "images/Smithy.jpg", "+3 Cards"); 
		deck[22] = new KingdomCard("Throne_Room", 4, "images/Throne_Room.jpg", "You may play an Action card from your hand twice."); 
		deck[23] = new KingdomCard("Bandit", 5, "images/Bandit.jpg", "Gain a Gold. Each other player reveals the top 2 cards of the deck, trashes a revealed Treasure other than Copper, and discards the rest."); 
		deck[24] = new KingdomCard("Council_Room", 5, "images/Council_Room.jpg", "+4 Cards, +1 Buy,  Each other player draws a card."); 
		deck[25] = new KingdomCard("Festival", 5, "images/Festival.jpg", "+2 Actions, +1 Buy, +2 Treasure"); 
		deck[26] = new KingdomCard("Laboratory", 5, "images/Laboratory.jpg", "+2 Cards, +1 Action"); 
		deck[27] = new KingdomCard("Library", 5, "images/Library.jpg", "Draw until you have 7 cards in hand, skipping and Action cards you choos to; set those aside, discarding them afterwards."); 
		deck[28] = new KingdomCard("Market", 5, "images/Market.jpg", "+1 Card, +1 Action, +1 Buy, +1 Treasure"); 
		deck[29] = new KingdomCard("Mine", 5, "images/Mine.jpg", "You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 Treasure more than it."); 
		deck[30] = new KingdomCard("Sentry", 5, "images/Sentry.jpg", "+1 Card, +1 Action,  Look at the top 2 cards of your deck. Trash and/or discard any number of them.  Put the rest back on the top in any order."); 
		deck[31] = new KingdomCard("Witch", 5, "images/Witch.jpg", "+2 Cards,  Each other player gains a Curse."); 
		deck[32] = new KingdomCard("Artisan", 6, "images/Artisan.jpg", "Gain a card to your hand costing up to 5 Treasure. Put a card from your hand onto your deck."); 
		SupplyPile pile = new SupplyPile(deck, 2);
		
		assertEquals("Should be null nothing is selected", null, pile.getSelected());
			
		assertEquals("The First 7 should always be the same", deck[0], pile.buy(0));
		assertEquals("The First 7 should always be the same", deck[1], pile.buy(1));
		assertEquals("The First 7 should always be the same", deck[2], pile.buy(2));
		assertEquals("The First 7 should always be the same", deck[3], pile.buy(3));
		assertEquals("The First 7 should always be the same", deck[4], pile.buy(4));
		assertEquals("The First 7 should always be the same", deck[5], pile.buy(5));
		assertEquals("The First 7 should always be the same", deck[6], pile.buy(6));
		
		pile.setSelected(0);
		
		assertEquals("GetSslected. should be Copper", deck[0], pile.getSelected());
		
		//assertEquals("Buy() no Card selected and must return null", null, pile.buy(1));
	}

}
