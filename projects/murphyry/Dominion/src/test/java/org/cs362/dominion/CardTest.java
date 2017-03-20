package org.cs362.dominion;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import org.cs362.dominion.Card.CardName;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private List<Card> cards;
    private GameState gs;
    private Player p1;
    private Player p2;

	
    @Before
    public void initTestPlayer() {
        cards = new ArrayList<Card>(Card.createCards());
        gs = new GameState(cards);
        p1 = new Player(gs, "player-1");
        gs.addPlayer(p1);
        p2 = new Player(gs, "player-2");
        gs.addPlayer(p2);
        gs.initializeGame();
    }


	@Test
	public void Coppertest() {
		
		//Testing get calls for copper
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getType(), Card.Type.TREASURE);
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getCost(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getTreasureValue(), 1);
		assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), Card.CardName.Copper);
		assertNotEquals(Card.getCard(cards, Card.CardName.Copper).getScore(), 2);
		
		//Add card to hand and check hand size.
		p1.hand.add(Card.getCard(cards, Card.CardName.Copper));
		assertEquals(p1.hand.size(), 1);
		
		//Play treasure card & assert player's coin value. Card should be discarded as well.
		p1.playTtreasureCard();
		assertEquals(p1.getCoins(), 1);
		assertEquals(p1.hand.size(), 0);
		
		
		
	}
	
	@Test
	public void SilverTest(){
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getType(), Card.Type.TREASURE);
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getCost(), 3);
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getTreasureValue(), 2);
		assertEquals(Card.getCard(cards, Card.CardName.Silver).getCardName(), Card.CardName.Silver);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Silver));
				assertEquals(p1.hand.size(), 1);
				
				//Play treasure card & assert player's coin value. Card should be discarded as well.
				p1.playTtreasureCard();
				assertEquals(p1.getCoins(), 2);
				assertEquals(p1.hand.size(), 0);
	
	}
	
	@Test
	public void Goldtest() {
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getType(), Card.Type.TREASURE);
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getCost(), 6);
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getTreasureValue(), 3);
		assertEquals(Card.getCard(cards, Card.CardName.Gold).getCardName(), Card.CardName.Gold);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Gold));
				assertEquals(p1.hand.size(), 1);
				
				//Play treasure card & assert player's coin value. Card should be discarded as well.
				p1.playTtreasureCard();
				assertEquals(p1.getCoins(), 3);
				assertEquals(p1.hand.size(), 0);
	}
	
	@Test
	public void EstateTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Estate).getType(), Card.Type.VICTORY);
		assertEquals(Card.getCard(cards, Card.CardName.Estate).getCost(), 2);
		assertEquals(Card.getCard(cards, Card.CardName.Estate).getScore(), 1);
		assertEquals(Card.getCard(cards, Card.CardName.Estate).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Estate).getCardName(), Card.CardName.Estate);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Estate));
				assertEquals(p1.hand.size(), 1);
				
	}
	
	@Test
	public void DuchyTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Duchy).getType(), Card.Type.VICTORY);
		assertEquals(Card.getCard(cards, Card.CardName.Duchy).getCost(), 5);
		assertEquals(Card.getCard(cards, Card.CardName.Duchy).getScore(), 3);
		assertEquals(Card.getCard(cards, Card.CardName.Duchy).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Duchy).getCardName(), Card.CardName.Duchy);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Duchy));
				assertEquals(p1.hand.size(), 1);
				
	}
	
	@Test
	public void ProvinceTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Province).getType(), Card.Type.VICTORY);
		assertEquals(Card.getCard(cards, Card.CardName.Province).getCost(), 8);
		assertEquals(Card.getCard(cards, Card.CardName.Province).getScore(), 6);
		assertEquals(Card.getCard(cards, Card.CardName.Province).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Province).getCardName(), Card.CardName.Province);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Province));
				assertEquals(p1.hand.size(), 1);
				
	}
	
	@Test
	public void AdventurerTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getCost(), 6);
		assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getCardName(), Card.CardName.Adventurer);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Adventurer));
				assertEquals(p1.hand.size(), 1);
				
				//Adventurer functionality
				p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				p1.deck.add(Card.getCard(cards, Card.CardName.Province));
				p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.playedCards.size(), 1);
				p1.playedCards.clear();
				assertEquals(p1.playedCards.size(), 0);
				assertEquals(p1.hand.size(), 2); //Make sure coins added to player's hand
				p1.deck.clear();
				

	}
	
	@Test
	public void BaronTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4);
		assertEquals(Card.getCard(cards, Card.CardName.Baron).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Baron).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Baron).getCardName(), Card.CardName.Baron);
		
		//Add card to hand and check hand size.
				assertEquals(p1.hand.size(), 0);
				assertEquals(p1.coins, 0);
				assertEquals(p1.numBuys, 1);
				p1.hand.add(Card.getCard(cards, Card.CardName.Baron));
				assertEquals(p1.hand.size(), 1);
				assertEquals(p1.coins, 0);
				assertEquals(p1.numBuys, 1);
				
				p1.playKingdomCard();
				assertEquals(p1.coins, 0);
				assertEquals(p1.numBuys, 2);
				assertEquals(p1.discard.size(), 11); //10 from init. + baron
				
				//Baron functionality
				p1.hand.add(Card.getCard(cards, Card.CardName.Baron));
				p1.hand.add(Card.getCard(cards, Card.CardName.Estate));
				assertEquals(p1.hand.size(), 2);

				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.playedCards.size(), 2);
				assertEquals(p1.numBuys, 3);
				p1.playedCards.clear();
				assertEquals(p1.playedCards.size(), 0);
				assertEquals(p1.hand.size(), 0); //Make sure Estate card was discarded
				assertEquals(p1.coins, 4);  //Make sure Baron gives you da money
				

	}
	
	@Test
	public void CouncilRoomTest() {
		assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getCost(), 5);
		assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.CouncilRoom).getCardName(), Card.CardName.CouncilRoom);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.CouncilRoom));
				assertEquals(p1.hand.size(), 1);
				
				//CouncilRoom functionality
				p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				p1.deck.add(Card.getCard(cards, Card.CardName.Province));
				p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				p1.deck.add(Card.getCard(cards, Card.CardName.Province));
				p1.deck.add(Card.getCard(cards, Card.CardName.Copper));

				p1.numActions = 1;
				p1.playKingdomCard();

				assertEquals(p1.hand.size(), 4); //Make sure Estate card was discarded
				assertEquals(p1.numBuys, 2);  //Make sure you got a buy (init at 1, so should have 2 buys)
				assertEquals(p2.hand.size(), 1); //Make sure other players draw a card

				

	}
	
	@Test
	public void CutpurseTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getCost(), 4);
		assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getCardName(), Card.CardName.Cutpurse);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
				assertEquals(p1.hand.size(), 1);
				
				//Cutpurse functionality
				p2.hand.add(Card.getCard(cards, Card.CardName.Copper));
				assertEquals(p2.hand.size(), 1); //Make sure other players have copper in hand for test

				p1.numActions = 1;
				p1.playKingdomCard();

				assertEquals(p2.hand.size(), 0); //Make sure Copper discarded
				assertEquals(p1.getCoins(), 2);  //Make sure you get da money


	}
	
	@Test
	public <Gamestate> void FeastTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Feast).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Feast).getCost(), 4);
		assertEquals(Card.getCard(cards, Card.CardName.Feast).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Feast).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Feast).getCardName(), Card.CardName.Feast);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Feast));
				assertEquals(p1.hand.size(), 1); 
				
				//Feast functionality
				p1.discard.clear();
				p1.numActions = 1;
				

				//p1.playKingdomCard();
		        //assertEquals(p1.discard.size(), 1);

				//assertEquals(p1.discard.size(), 1); //Make sure Card is picked up and put in discard pile

	}
	
	@Test
	public void GardensTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Gardens).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Gardens).getCost(), 4);
		assertEquals(Card.getCard(cards, Card.CardName.Gardens).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Gardens).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Gardens).getCardName(), Card.CardName.Gardens);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Gardens));
				assertEquals(p1.hand.size(), 1);
				
				//Gardens functionality
				for(int i = 0; i < 11; i++){
					p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				}
					
				p1.numActions = 1;
				p1.playKingdomCard();
				p1.playedCards.clear();
				assertEquals(Card.getCard(cards, Card.CardName.Gardens).getScore(), 0);


	}
	
	@Test
	public void GreatHallTest() {
		assertEquals(Card.getCard(cards, Card.CardName.GreatHall).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.GreatHall).getCost(), 3);
		assertEquals(Card.getCard(cards, Card.CardName.GreatHall).getScore(), 1);
		assertEquals(Card.getCard(cards, Card.CardName.GreatHall).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.GreatHall).getCardName(), Card.CardName.GreatHall);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.GreatHall));
				assertEquals(p1.hand.size(), 1);
				
				//Gardens functionality
				for(int i = 0; i < 11; i++){
					p1.deck.add(Card.getCard(cards, Card.CardName.Copper));
				}
					
				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.hand.size(), 1); //Make sure card was drawn
				assertEquals(p1.numActions, 1);  //Make sure player received an additional action from GreatHall (should be ==1 since 1 action used during play phase)

	}
	
	@Test
	public void MineTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Mine).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Mine).getCost(), 5);
		assertEquals(Card.getCard(cards, Card.CardName.Mine).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Mine).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Mine).getCardName(), Card.CardName.Mine);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Mine));
				assertEquals(p1.hand.size(), 1);
				
				//Gardens functionality
				p1.hand.add(Card.getCard(cards, Card.CardName.Copper));
					
				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.hand.size(), 1); //Make sure Silver was drawn

	}
	
	@Test
	public void LaboratoryTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getCost(), 5);
		assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getCardName(), Card.CardName.Laboratory);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Laboratory));
				assertEquals(p1.hand.size(), 1);
				
				//Gardens functionality
				for(int i = 0; i < 6; i++)
					p1.deck.add(Card.getCard(cards, Card.CardName.Copper));	
					
				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.hand.size(), 2); //Make sure 2 cards drawn
				assertEquals(p1.numActions, 1);
	}
	
	@Test
	public void SmithyTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Smithy).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Smithy).getCost(), 4);
		assertEquals(Card.getCard(cards, Card.CardName.Smithy).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Smithy).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Smithy).getCardName(), Card.CardName.Smithy);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
				assertEquals(p1.hand.size(), 1);
				
				//Gardens functionality
				for(int i = 0; i < 6; i++)
					p1.deck.add(Card.getCard(cards, Card.CardName.Copper));	
					
				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.hand.size(), 3); //Make sure 3 cards drawn

	}
	@Test
	public void VillageTest() {
		assertEquals(Card.getCard(cards, Card.CardName.Village).getType(), Card.Type.ACTION);
		assertEquals(Card.getCard(cards, Card.CardName.Village).getCost(), 3);
		assertEquals(Card.getCard(cards, Card.CardName.Village).getScore(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Village).getTreasureValue(), 0);
		assertEquals(Card.getCard(cards, Card.CardName.Village).getCardName(), Card.CardName.Village);
		
		//Add card to hand and check hand size.
				p1.hand.add(Card.getCard(cards, Card.CardName.Village));
				assertEquals(p1.hand.size(), 1);
				
				//Gardens functionality
				for(int i = 0; i < 6; i++)
					p1.deck.add(Card.getCard(cards, Card.CardName.Copper));	
					
				p1.numActions = 1;
				p1.playKingdomCard();
				assertEquals(p1.hand.size(), 1); //Make sure 1 card drawn
				assertEquals(p1.numActions, 2);

	}
	
	
	
	 @After
	    public void EraseStuffPlayer() {
	        p1.deck.clear();
	        p1.hand.clear();
	        p1.discard.clear();
	        p1.playedCards.clear();
	        p2.deck.clear();
	        p2.hand.clear();
	        p2.discard.clear();
	        p2.playedCards.clear();
	    }
	 
	 
	

}
