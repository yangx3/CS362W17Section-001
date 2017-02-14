package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
	
    public final List<Card> cards = new ArrayList<Card>(Card.createCards());
    
	//tests the play functionality of cards
	  
    @Test
    public void AdventurerTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);

        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);

        state.initializeGame();

        int expected = state.players.get(0).hand.size() + 2;

        System.out.println(state.players.get(0).toString());
        
        Card c = Card.getCard(cards, Card.CardName.Adventurer);
        c.play(state.players.get(0), state);
        assertEquals(state.players.get(0).hand.size(),expected);
    }
    
    @Test
    public void SmithyTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());
        
        int expected = state.players.get(0).hand.size() + 3;
        
        Card c = Card.getCard(cards,Card.CardName.Smithy);
        c.play(state.players.get(0),state);
        
        System.out.println(state.players.get(0).toString());
        
        System.out.println(state.players.get(0).hand.size() + " cards in hand, expected " + expected);
        assertEquals(state.players.get(0).hand.size(),expected);
    }
    
    @Test
    public void VillageTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
         
        state.initializeGame();

        int expectedCards = state.players.get(0).hand.size() + 1;
        int expectedActions = state.players.get(0).actions + 2;

        Card c = Card.getCard(cards, Card.CardName.Village);
        c.play(state.players.get(0), state);
        
        assertEquals(state.players.get(0).actions,expectedActions);
        assertEquals(state.players.get(0).hand.size(),expectedCards);
    }
	  
    @Test
    public void CutpurseTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);

        state.initializeGame();
        
        int expected = state.players.get(1).hand.size()-1;

        Card c = Card.getCard(cards, Card.CardName.Cutpurse);
        c.play(state.players.get(0),state);
        
        assertEquals(state.players.get(0).coins,2);
        
        System.out.println(state.players.get(1).toString());
        
        assertEquals(state.players.get(1).hand.size(),expected);
    }
	  
    @Test
    public void FeastTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        player.hand.add(Card.getCard(cards,Card.CardName.Feast));
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());

        int expectedHand = state.players.get(0).hand.size() - 1;
        state.players.get(0).playKingdomCard();

        System.out.println(state.players.get(0).toString());
        assertEquals(state.players.get(0).hand.size(),expectedHand);
        assertEquals(state.players.get(0).discard.size(),1);
        assertEquals(state.players.get(0).playedCards.size(),0);

        Card c = Card.getCard(cards, Card.CardName.Feast);
        List<Card> Feasts = Card.filter(state.players.get(0).hand,c.getType());
        assertEquals(Feasts.size(),0);
    }
    
    @Test
    public void AmbassadorTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        int ambassadorHandExpected = state.players.get(0).hand.size() - 2;
        int player2DiscardExpected = state.players.get(1).discard.size() + 1;
        
        Card c = Card.getCard(cards, Card.CardName.Ambassador);
        c.play(state.players.get(0),state);
        
        System.out.println(state.players.get(0).toString());
        
        assertEquals(state.players.get(0).hand.size(),ambassadorHandExpected);
        assertEquals(state.players.get(0).discard.size(),0);
        assertEquals(state.players.get(1).discard.size(),player2DiscardExpected);
    }
    
    @Test
    public void BaronTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        state = new GameState(cards);
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());
        
        Card est = Card.getCard(cards,Card.CardName.Estate);
        List<Card> estates = Card.filter(state.players.get(0).hand,est.getType());
        
        int expected = estates.size() - 1;
        
        Card c = Card.getCard(cards,Card.CardName.Baron);
        c.play(state.players.get(0),state);
        
        estates = Card.filter(state.players.get(0).hand,est.getType());
        
        System.out.println(state.players.get(0).toString());
        
        assertEquals(estates.size(),expected);
        assertEquals(state.players.get(0).coins,4);
        assertEquals(state.players.get(0).buys,2);
    }
    
    @Test
    public void CouncilRoom() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        state.initializeGame();
        
        int playerHandExpected = state.players.get(0).hand.size() + 4;
        int otherPlayerExpected = state.players.get(1).hand.size() + 1;
        
        Card c = Card.getCard(cards, Card.CardName.CouncilRoom);
        c.play(state.players.get(0), state);
        
        assertEquals(state.players.get(0).hand.size(),playerHandExpected);
        assertEquals(state.players.get(1).hand.size(),otherPlayerExpected);
        assertEquals(state.players.get(0).buys,2);
    }
    
    @Test
    public void EmbargoTest() throws Throwable  {
        boolean embargoed = false;
        GameState state = new GameState(cards);
        Randomness.reset(10);	   

        Player player = new Player(state, "TestPlayer");
        player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);

        state.initializeGame();

        int expectedHand = state.players.get(0).hand.size() - 1;
        
        state.players.get(0).playKingdomCard();

        System.out.println(state.players.get(0).toString());
        
        assertEquals(state.players.get(0).hand.size(),expectedHand);
        assertEquals(state.players.get(0).coins,2);
        assertEquals(state.players.get(0).playedCards.size(),0);
        for(Card embargoCheck : state.cards) {
            if(embargoCheck.getEmTokens() == 1) {
                embargoed = true;
            }
        }
        assertEquals(embargoed,true);
    }
	  
    @Test
    public void GreatHallTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        state.initializeGame();
        
        int expected = state.players.get(0).hand.size()+1;
        int expectedActions = state.players.get(0).actions+1;
        
        Card c = Card.getCard(cards,Card.CardName.GreatHall);
        c.play(state.players.get(0),state);
        
        assertEquals(state.players.get(0).hand.size(),expected);
        assertEquals(state.players.get(0).actions,expectedActions);
    }
    
    @Test
    public void MineTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);	   

        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        state.initializeGame();

        Card c = Card.getCard(cards,Card.CardName.Mine);
        c.play(state.players.get(0),state);
        
        int expectedHand = state.players.get(0).hand.size();
        
        assertEquals(state.players.get(0).hand.size(),expectedHand);
    }
	
    @Test
    public void MinionTest() throws Throwable  {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        Card c = Card.getCard(cards,Card.CardName.Minion);
        c.play(state.players.get(0),state);
        
        assertEquals(state.players.get(0).actions,2);
        
        if (!(state.players.get(0).hand.size() == 4)) {
            assertEquals(state.players.get(0).coins,2);
        }
        else {
            assertEquals(state.players.get(0).hand.size(),4);
            assertEquals(state.players.get(0).coins,0);
        }
    }
}
