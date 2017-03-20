package dom3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


import dom3.Card.Type;

public class TestSuiteTest {

	private GameState state;
	private Player player1;
	private Player player2;
	private List<Card> cards;
	final int [] piles = new int[17];
	
	@Before
	public void initialize(){
		state = new GameState(cards, piles);
		player1 = new Player(state, "player-1");
		cards = new ArrayList<Card>(Card.createCards());
	}
	@Test
	public void CardtestCopper(){
		Card my_card = Card.getCard(cards, Card.CardName.Copper);
		
		assertEquals(my_card.getCardName(),Card.CardName.Copper);
		assertEquals(my_card.getType(), Card.Type.TREASURE);
		assertEquals(my_card.getCost(), 0);
		assertEquals(my_card.getValue(), 1);
		assertEquals(my_card.getTreasureValue(),1);
		assertEquals(my_card.getNumberof(), 32);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestSilver(){
		Card my_card = Card.getCard(cards, Card.CardName.Silver);
		
		assertEquals(my_card.getCardName(),Card.CardName.Silver);
		assertEquals(my_card.getType(), Card.Type.TREASURE);
		assertEquals(my_card.getCost(), 3);
		assertEquals(my_card.getValue(), 2);
		assertEquals(my_card.getTreasureValue(),2);
		assertEquals(my_card.getNumberof(), 40);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestGold(){
		Card my_card = Card.getCard(cards, Card.CardName.Gold);
		
		assertEquals(my_card.getCardName(),Card.CardName.Gold);
		assertEquals(my_card.getType(), Card.Type.TREASURE);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 3);
		assertEquals(my_card.getTreasureValue(),3);
		assertEquals(my_card.getNumberof(), 30);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestAdventurer(){
		Card my_card = Card.getCard(cards, Card.CardName.Adventurer);
		
		assertEquals(my_card.getCardName(),Card.CardName.Adventurer);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestAmbassador(){
		Card my_card = Card.getCard(cards, Card.CardName.Ambassador);
		
		assertEquals(my_card.getCardName(),Card.CardName.Ambassador);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestBaron(){
		Card my_card = Card.getCard(cards, Card.CardName.Baron);
		
		assertEquals(my_card.getCardName(),Card.CardName.Baron);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestCouncilroom(){
		Card my_card = Card.getCard(cards, Card.CardName.Councilroom);
		
		assertEquals(my_card.getCardName(),Card.CardName.Councilroom);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestCutpurse(){
		Card my_card = Card.getCard(cards, Card.CardName.Cutpurse);
		
		assertEquals(my_card.getCardName(),Card.CardName.Cutpurse);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestEmbargo(){
		Card my_card = Card.getCard(cards, Card.CardName.Embargo);
		
		assertEquals(my_card.getCardName(),Card.CardName.Embargo);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestFeast(){
		Card my_card = Card.getCard(cards, Card.CardName.Feast);
		
		assertEquals(my_card.getCardName(),Card.CardName.Feast);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestGardens(){
		Card my_card = Card.getCard(cards, Card.CardName.Gardens);
		
		assertEquals(my_card.getCardName(),Card.CardName.Gardens);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestGreatHall(){
		Card my_card = Card.getCard(cards, Card.CardName.Great_hall);
		
		assertEquals(my_card.getCardName(),Card.CardName.Great_hall);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestMine(){
		Card my_card = Card.getCard(cards, Card.CardName.Mine);
		
		assertEquals(my_card.getCardName(),Card.CardName.Mine);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestSmithy(){
		Card my_card = Card.getCard(cards, Card.CardName.Smithy);
		
		assertEquals(my_card.getCardName(),Card.CardName.Smithy);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 4);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestVillage(){
		Card my_card = Card.getCard(cards, Card.CardName.Village);
		
		assertEquals(my_card.getCardName(),Card.CardName.Village);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 3);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void CardtestSpy(){
		Card my_card = Card.getCard(cards, Card.CardName.Spy);
		
		assertEquals(my_card.getCardName(),Card.CardName.Spy);
		assertEquals(my_card.getType(), Card.Type.ACTION);
		assertEquals(my_card.getCost(), 6);
		assertEquals(my_card.getValue(), 0);
		assertEquals(my_card.getTreasureValue(),0);
		assertEquals(my_card.getNumberof(), 10);
		my_card.updateNumof(33);
		assertEquals(my_card.getNumberof(),33);
	}
	@Test
	public void playAdventurer(){
		player2 = new Player(state, "player-2");
		player2.deck.add(Card.getCard(cards, Card.CardName.Copper));
		player2.deck.add(Card.getCard(cards, Card.CardName.Copper));
		player2.hand.add(Card.getCard(cards, Card.CardName.Adventurer));
		Card c = Card.getCard(cards, Card.CardName.Adventurer);
		c.play(player2, state);
		assertEquals(player2.hand.size(),3);
		assertEquals(player2.deck.size(), 0);
	}
	@Test
	public void playAmbassador(){
		player2 = new Player(state, "player-2");
		player2.hand.add(Card.getCard(cards, Card.CardName.Ambassador));
		Card c = Card.getCard(cards, Card.CardName.Ambassador);
		int temp = state.piles[8];
		c.play(player2, state);
		assertEquals(temp+1, state.piles[8]);
		
	}
	@Test
	public void playBaron(){
		player2 = new Player(state, "player-2");
		player2.hand.add(Card.getCard(cards, Card.CardName.Baron));
		state = new GameState(cards, piles);
		Card c = Card.getCard(cards, Card.CardName.Baron);
		int temp = player2.numBuys;
		c.play(player2, state);
		assertEquals(temp+1, player2.numBuys);
		//assertEquals(player2.discard.size(), 1);
		//assertEquals(player2.discard.get(0).getCardName(), Card.CardName.Estate);
		
	}
	@Test
	public void playCouncilRoom(){
		player2 = new Player(state, "player-2");
        for (int i = 0; i < 7; i++){
            player2.gain(Card.getCard(cards, Card.CardName.Copper));
            piles[2]= piles[2]-1;
         }	
         for (int i = 0; i < 3; i++){
            player2.gain(Card.getCard(cards,Card.CardName.Estate));
         	piles[5]= piles[5]-1;
         }
         player2.hand.add(Card.getCard(cards, Card.CardName.Councilroom));
         Card c = Card.getCard(cards, Card.CardName.Councilroom);
         c.play(player2, state);
         assertEquals(player2.discard.size(),0);
         assertEquals(player2.hand.size(),5);
         
	}
	@Test
	public void playCutpurse(){
		player2 = new Player(state, "player-2");
         player2.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));
         Card c = Card.getCard(cards, Card.CardName.Cutpurse);
         c.play(player2, state);
         assertEquals(player2.discard.size(),1);
         assertEquals(player2.discard.get(0).getCardName(), Card.CardName.Cutpurse);
         
	}
	@Test
	public void playEmbargo(){
		player2 = new Player(state, "player-2");
        player2.hand.add(Card.getCard(cards, Card.CardName.Embargo));
        Card c = Card.getCard(cards, Card.CardName.Embargo);
        c.play(player2, state);
        assertEquals(player2.hand.size(),0);
        
	}
	@Test
	public void playFeast(){
		player2 = new Player(state, "player-2");
        player2.hand.add(Card.getCard(cards, Card.CardName.Feast));
        Card c = Card.getCard(cards, Card.CardName.Feast);
        c.play(player2, state);
        assertEquals(player2.hand.size(),0);
        
	}
	@Test
	public void playGardens(){
		player2 = new Player(state, "player-2");
        player2.hand.add(Card.getCard(cards, Card.CardName.Gardens));
        Card c = Card.getCard(cards, Card.CardName.Gardens);
        c.play(player2, state);
        assertEquals(player2.hand.size(),1);
        
	}
	@Test
	public void playGreatHall(){
		player2 = new Player(state, "player-2");
        for (int i = 0; i < 7; i++){
            player2.gain(Card.getCard(cards, Card.CardName.Copper));
            piles[2]= piles[2]-1;
         }	
         for (int i = 0; i < 3; i++){
            player2.gain(Card.getCard(cards,Card.CardName.Estate));
         	piles[5]= piles[5]-1;
         }
         player2.hand.add(Card.getCard(cards, Card.CardName.Great_hall));
         Card c = Card.getCard(cards, Card.CardName.Great_hall);
         c.play(player2, state);
         assertEquals(player2.discard.size(),0);
         assertEquals(player2.hand.size(),2);
         
	}
	@Test
	public void playMine(){
		player2 = new Player(state, "player-2");
        player2.hand.add(Card.getCard(cards, Card.CardName.Mine));
        Card c = Card.getCard(cards, Card.CardName.Mine);
        c.play(player2, state);
        assertEquals(player2.hand.size(),1);
        
	}
	@Test
	public void playSmithy(){
		player2 = new Player(state, "player-2");
        for (int i = 0; i < 7; i++){
            player2.gain(Card.getCard(cards, Card.CardName.Copper));
            piles[2]= piles[2]-1;
         }	
         for (int i = 0; i < 3; i++){
            player2.gain(Card.getCard(cards,Card.CardName.Estate));
         	piles[5]= piles[5]-1;
         }
         player2.hand.add(Card.getCard(cards, Card.CardName.Smithy));
         Card c = Card.getCard(cards, Card.CardName.Smithy);
         c.play(player2, state);
         assertEquals(player2.discard.size(),0);
         assertEquals(player2.hand.size(),4);
         
	}
	public void playVillage(){
		player2 = new Player(state, "player-2");
        for (int i = 0; i < 7; i++){
            player2.gain(Card.getCard(cards, Card.CardName.Copper));
            piles[2]= piles[2]-1;
         }	
         for (int i = 0; i < 3; i++){
            player2.gain(Card.getCard(cards,Card.CardName.Estate));
         	piles[5]= piles[5]-1;
         }
         player2.hand.add(Card.getCard(cards, Card.CardName.Village));
         Card c = Card.getCard(cards, Card.CardName.Village);
         c.play(player2, state);
         assertEquals(player2.discard.size(),0);
         assertEquals(player2.hand.size(),2);
         
	}
	@Test
	public void playSpy(){
		player2 = new Player(state, "player-2");
        player2.hand.add(Card.getCard(cards, Card.CardName.Spy));
        player2.deck.add(Card.getCard(cards, Card.CardName.Copper));
        Card c = Card.getCard(cards, Card.CardName.Spy);
        c.play(player2, state);
        assertEquals(player2.hand.size(),2);
        
	}
	@Test
	public void testFilterandtoString(){
		player2 = new Player(state, "player-2");
	
        for (int i = 0; i < 6; i++){
            player2.hand.add(Card.getCard(cards, Card.CardName.Copper));

         }	
         for (int i = 0; i < 3; i++){
            player2.hand.add(Card.getCard(cards,Card.CardName.Estate));

         }
         player2.hand.add(Card.getCard(cards,Card.CardName.Spy));
         List<Card> actionCards = Card.filter(player2.hand, Type.ACTION);
         assertEquals(actionCards.get(0).getCardName(), Card.CardName.Spy);
         assertEquals(actionCards.get(0).toString(),"	Spy");
		
	}
	
	//HERE STARTS THE GAMESTATE TESTS
	
	@Test
	public void testaddPlayer(){
		player2 = new Player(state, "player-2");
		state.addPlayer(player2);
		assertEquals(state.players.size(), 1);
		Card c = Card.getCard(cards, Card.CardName.Spy);
		//assertTrue(player2.gain(c));
	}
	
	
	@Test
	public void testInitGame(){
		player2 = new Player(state, "player-2");
		player1 = new Player(state, "player-1");
		state = new GameState(cards, piles);
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame();
		assertEquals(state.gameBoard.size(),20);
		assertEquals(state.my_nums[0],10);
		assertEquals(state.my_nums[1],8);
		List<Card> tCards1 = Card.filter(player1.discard, Type.TREASURE);
		List<Card> tCards2 = Card.filter(player2.discard, Type.TREASURE);
		List<Card> vCards1 = Card.filter(player1.discard, Type.VICTORY);
		List<Card> vCards2 = Card.filter(player2.discard, Type.VICTORY);
		assertEquals(state.players.get(0).discard.size(),10);
		assertEquals(state.players.get(1).discard.size(),10);
		assertEquals(tCards1.size(), 7);
		assertEquals(tCards2.size(), 7);
		assertEquals(vCards1.size(), 3);
		assertEquals(vCards2.size(), 3);
		assertEquals(state.players.get(0).numActions,1);
		assertEquals(state.players.get(1).numActions,1);
		assertEquals(state.players.get(0).coins,0);
		assertEquals(state.players.get(1).coins,0);
		assertEquals(state.players.get(0).numBuys,1);
		assertEquals(state.players.get(1).numBuys,1);
		
	}
	
	@Test
	public void testPlay(){
		player2 = new Player(state, "player-2");
		player1 = new Player(state, "player-1");
		state = new GameState(cards, piles);
		state.addPlayer(player1);
		state.addPlayer(player2);
		state.initializeGame();
		HashMap<Player, Integer> winners=state.play(state);
		//assertEquals(winners.size(),2);
	}
	
	@Test
	public void testIsGameOver(){
		
		player2 = new Player(state, "player-2");
		player1 = new Player(state, "player-1");
		state.addPlayer(player1);
		state.addPlayer(player2);
		state = new GameState(cards, piles);
		state.initializeGame();
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Province),0);
		assertTrue(state.isGameOver());
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Province),30);
		assertFalse(state.isGameOver());
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Gold),0);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Smithy),0);
		state.gameBoard.put(Card.getCard(cards, Card.CardName.Spy),0);
		assertTrue(state.isGameOver());
		
		Card c = Card.getCard(cards, Card.CardName.Spy);
		assertTrue(c.cardName.equals(Card.CardName.Spy));
		assertEquals(c.compareTo(c), 5);
		
	}
	@Test
	public void testtoString(){
		player2 = new Player(state, "player-2");
		//assertEquals(player2.toString(), " --- player-2 --- ");
	}
	@Test
	public void testScore(){
		player2 = new Player(state, "player-2");
		Card c = Card.getCard(cards, Card.CardName.Estate);
		player2.hand.add(c);
		player2.deck.add(c);
		player2.discard.add(c);
		int temp = player2.scoreFor();
		assertEquals(temp,9);
		
	}
	@Test
	public void resetTurnTest(){
		player1.resetturn();
		assertEquals(player1.numActions,1);
		assertEquals(player1.numBuys,1);
	}
	@Test
	public void GainandDiscard(){
		player1.gain(Card.getCard(cards, Card.CardName.Copper));
		assertEquals(player1.discard.size(),1);
		player1.discard(Card.getCard(cards, Card.CardName.Copper));
		assertEquals(player1.discard.size(),2);
	}
}