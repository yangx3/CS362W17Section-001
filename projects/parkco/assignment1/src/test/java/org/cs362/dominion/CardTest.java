package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
    private GameState state;
    private Player player1;
    private Player player2;
    private ArrayList<Card> cards;

    @Before
    public void initializeGame() {
    	cards = new ArrayList<Card>(Card.createCards());
    	state = new GameState(cards);
    	Randomness.reset();
    	player1 = new Player(state, "player-1");
    	state.addPlayer(player1);
    	player2 = new Player(state, "player-2");
    	state.addPlayer(player2);
    	//Initialize the game
    	state.initializeGame();
    }
    
    @Test
    public void countCardNameTest() {
    	int num = Card.countCardName(player1.hand, CardName.Copper) + Card.countCardName(player1.discard, CardName.Copper) + Card.countCardName(player1.deck, CardName.Copper);
        assertEquals(num, 7);
    }
    
    @Test 
    public void getCardTest() {
    	Card testCard = Card.getCard(player1.hand, Card.CardName.Copper);
    	assertEquals(testCard.getCardName(), CardName.Copper);
    	assertEquals(testCard.getCost(), 0);
    	assertEquals(testCard.getScore(), 0);
    	assertEquals(testCard.getTreasureValue(), 1);
    	assertEquals(testCard.getType(), Card.Type.TREASURE);	
    }
    
    @Test
    public void GoldSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getCost(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getType(), Card.Type.TREASURE);
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getTreasureValue(), 3);
    }
    
    @Test 
    public void addGoldTest() {
    	assertEquals(player1.coins, 0);
    	player1.playTtreasureCard();
    	int currCoins = player1.coins;
    	player1.hand.add(Card.getCard(cards, Card.CardName.Gold));
    	player1.playTtreasureCard();
    	assertEquals(player1.coins, currCoins + 3);
    }

    @Test
    public void SilverSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getType(), Card.Type.TREASURE);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getTreasureValue(), 2);
    }
    
    @Test
    public void addSilverTest() {
    	assertEquals(player1.coins, 0);
    	player1.playTtreasureCard();
    	int currCoins = player1.coins;
    	player1.hand.add(Card.getCard(cards, Card.CardName.Silver));
    	player1.playTtreasureCard();
    	assertEquals(player1.coins, currCoins + 2);
    }
    
    @Test
    public void CopperSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Copper).getCost(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Copper).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Copper).getType(), Card.Type.TREASURE);
        assertEquals(Card.getCard(cards, Card.CardName.Copper).getTreasureValue(), 1);
    }
    
    @Test
    public void addCopperTest() {
    	assertEquals(player1.coins, 0);
    	player1.playTtreasureCard();
    	int currCoins = player1.coins;
    	player1.hand.add(Card.getCard(cards, Card.CardName.Copper));
    	player1.playTtreasureCard();
    	assertEquals(player1.coins, currCoins + 1);
    }
    
    @Test
    public void ProvinceSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Province).getCost(), 8);
        assertEquals(Card.getCard(cards, Card.CardName.Province).getScore(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Province).getType(), Card.Type.VICTORY);
        assertEquals(Card.getCard(cards, Card.CardName.Province).getTreasureValue(), 0);
    }
    
    @Test
    public void DuchySpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Duchy).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.Duchy).getScore(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Duchy).getType(), Card.Type.VICTORY);
        assertEquals(Card.getCard(cards, Card.CardName.Duchy).getTreasureValue(), 0);
    }
    
    @Test
    public void EstateSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Estate).getCost(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.Estate).getScore(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.Estate).getType(), Card.Type.VICTORY);
        assertEquals(Card.getCard(cards, Card.CardName.Estate).getTreasureValue(), 0);
    }
    
    @Test
    public void CurseSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Curse).getCost(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Curse).getScore(), -1);
        assertEquals(Card.getCard(cards, Card.CardName.Curse).getType(), Card.Type.VICTORY);
        assertEquals(Card.getCard(cards, Card.CardName.Curse).getTreasureValue(), 0);
    }
    
    @Test
    public void AdventurerSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getCost(), 6);
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getTreasureValue(), 0);
    }
    
    @Test
    public void AmbassadorSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getTreasureValue(), 0);
    }
    
    @Test
    public void BaronSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getTreasureValue(), 0);
    }
    
    @Test
    public void Council_RoomSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Council_Room).getTreasureValue(), 0);
    }
    
    @Test
    public void CutpurseSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getTreasureValue(), 0);
    }
    
    @Test
    public void EmbargoSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Embargo).getCost(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.Embargo).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Embargo).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Embargo).getTreasureValue(), 0);
    }
    
    @Test
    public void FeastSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Feast).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Feast).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Feast).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Feast).getTreasureValue(), 0);
    }
    
    @Test
    public void GardensSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Gardens).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Gardens).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Gardens).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Gardens).getTreasureValue(), 0);
    }
    
    @Test
    public void Great_HallSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getScore(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Great_Hall).getTreasureValue(), 0);
    }
    
    @Test
    public void MineSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Mine).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.Mine).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Mine).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Mine).getTreasureValue(), 0);
    }
    
    @Test
    public void SmithySpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getTreasureValue(), 0);
    }
    
    @Test
    public void StewardSpecsTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Steward).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Steward).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Steward).getType(), Card.Type.ACTION);
        assertEquals(Card.getCard(cards, Card.CardName.Steward).getTreasureValue(), 0);
    }
    
//    @Test
//    public void VillageSpecsTest() {
//        assertEquals(Card.getCard(cards, Card.CardName.Village).getCost(), 3);
//        assertEquals(Card.getCard(cards, Card.CardName.Village).getScore(), 0);
//        assertEquals(Card.getCard(cards, Card.CardName.Village).getType(), Card.Type.ACTION);
//        assertEquals(Card.getCard(cards, Card.CardName.Village).getTreasureValue(), 0);
//    }
    
    @Test 
    public void AdventurerTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Adventurer));
    	assertEquals(player1.hand.size(), 6);
    	player1.playKingdomCard();
    	assertTrue(player1.hand.size() >=6 );
    	assertTrue(player1.deck.size() <= 3);
    	assertEquals(player1.playedCards.size(), 1);
    }
    
    @Test
    public void AmbassadorTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player2.hand.size(), 5);
    	assertEquals(player2.deck.size(), 5);
    	assertEquals(player2.discard.size(), 0);
    	assertEquals(player2.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Ambassador));
    	assertEquals(player1.hand.size(), 6);
    	player1.playKingdomCard();
    	assertTrue(player1.hand.size() < 6);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player2.discard.size(), 1);
    }
    
    @Test
    public void BaronTest() {
    	//player1.initializePlayerTurn();
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.numBuys, 1);
    	assertEquals(player1.coins, 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Baron));
    	if(Card.getCard(player1.hand, Card.CardName.Estate) != null){
    		player1.playKingdomCard();
    		assertEquals(player1.hand.size(), 4);
    		assertEquals(player1.discard.size(), 1);
    		assertEquals(player1.numBuys, 2);
    		assertEquals(player1.coins, 4);
    	}
    	else {
    		player1.playKingdomCard();
    		assertEquals(player1.deck.size(), 6);
    		assertEquals(player1.coins, 0);
    		assertEquals(player1.numBuys, 2);
    	}
    }
    
    @Test
    public void Council_RoomTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.numBuys, 1);
    	assertEquals(player2.hand.size(), 5);
    	assertEquals(player2.deck.size(), 5);
    	assertEquals(player2.discard.size(), 0);
    	assertEquals(player2.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Council_Room));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 9);
    	assertEquals(player1.numBuys, 2);
    	assertEquals(player2.hand.size(), 6); 	
    }
    
    @Test 
    public void CutpurseTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.coins, 0);
    	assertEquals(player1.numBuys, 1);
    	assertEquals(player2.hand.size(), 5);
    	assertEquals(player2.deck.size(), 5);
    	assertEquals(player2.discard.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.coins, 2);
    	if(Card.getCard(player2.hand, Card.CardName.Copper) != null){
    		assertEquals(player2.hand.size(), 4);
    		assertEquals(player2.discard.size(), 1);
    	}
    }

    @Test 
    public void EmbargoTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.coins, 0);
    	assertEquals(player1.numBuys, 1);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Embargo));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.coins, 2);
    	assertEquals(player1.hand.size(), 5);	
    }
    
    @Test
    public void FeastTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Feast));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 6);
    	assertEquals(player1.discard.size(), 0);
    }
    
    @Test
    public void GardensTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Gardens));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.hand.size(), 6);
    }
    
    @Test
    public void Great_HallTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.numActions, 1);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Great_Hall));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 6);
    	assertEquals(player1.numActions, 1);
    }
    
    @Test
    public void MineTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Mine));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
        assertEquals(player1.hand.size(), 5);	
    }
    
    @Test
    public void SmithyTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Smithy));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 8);
    	assertEquals(player1.deck.size(), 2);
    }
    
    @Test
    public void StewardTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.coins, 0);	
    	player1.hand.add(Card.getCard(cards, Card.CardName.Steward));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	if(player1.hand.size() < 5)
    		assertEquals(player1.hand.size(), 3);
    	else if(player1.hand.size() > 5)
    		assertEquals(player1.hand.size(), 7);
    	else if(player1.hand.size() == 5)
    		assertEquals(player1.coins, 2);	
    }
    
    @Test
    public void VillageTest() {
    	assertEquals(player1.hand.size(), 5);
    	assertEquals(player1.deck.size(), 5);
    	assertEquals(player1.discard.size(), 0);
    	assertEquals(player1.playedCards.size(), 0);
    	assertEquals(player1.numActions, 1);
    	player1.hand.add(Card.getCard(cards, Card.CardName.Village));
    	player1.playKingdomCard();
    	assertEquals(player1.playedCards.size(), 1);
    	assertEquals(player1.hand.size(), 6);
    	assertEquals(player1.numActions, 2);
    }
}
