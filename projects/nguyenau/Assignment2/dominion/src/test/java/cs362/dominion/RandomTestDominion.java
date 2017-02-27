package cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTestDominion {
    
    public final List<Card> cards = new ArrayList<Card>(Card.createCards());

    @Test
    public void Gametest1() throws Throwable {
        GameState state = new GameState(cards);
        int random = (int) (Math.random() * 50 + 1);
        Randomness.reset(random);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println("Initialization DominionBoard:\n " + state.toString());
        System.out.println("----------------------------------");
        HashMap<Player,Integer> endGameLeaderboard = state.play();
        
        System.out.println("Game Complete.\n");

        System.out.println("Player Name\t\tVictory Points");
        for (Player p: endGameLeaderboard.keySet()){
            System.out.println("- " + p.playerName + "\t\t" + endGameLeaderboard.get(p));
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n --- Cards on Table --- \n");
        sb.append("Card Name (Number of Cards)\n");
        Map<Card,Integer> treeMap = new TreeMap<Card, Integer>(state.gameBoard);
        for (Card card : treeMap.keySet())
            sb.append("- " + card.getCardName() + " (" + treeMap.get(card) + ")\n");
    }
    @Test
    public void Gametest2() throws Throwable {
        GameState state = new GameState(cards);
        //int random = (int) (Math.random() * 50 + 1);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println("Initialization DominionBoard:\n " + state.toString());
        System.out.println("----------------------------------");
        HashMap<Player,Integer> endGameLeaderboard = state.play();
        
        System.out.println("Game Complete.\n");

        System.out.println("Player Name\t\tVictory Points");
        for (Player p: endGameLeaderboard.keySet()){
            System.out.println("- " + p.playerName + "\t\t" + endGameLeaderboard.get(p));
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n --- Cards on Table --- \n");
        sb.append("Card Name (Number of Cards)\n");
        Map<Card,Integer> treeMap = new TreeMap<Card, Integer>(state.gameBoard);
        for (Card card : treeMap.keySet())
            sb.append("- " + card.getCardName() + " (" + treeMap.get(card) + ")\n");
    }
    @Test
    public void Gametest3() throws Throwable {
        GameState state = new GameState(cards);
        int random = (int) (Math.random() * 50 + 1);
        Randomness.reset(random);
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        int random2 = (int) (Math.random() * 3);
        for (int x = 0; x < random2; x = x + 1)
        {
        	player = new Player(state, "TestPlayer");
        	state.addPlayer(player);
        	
        }      
        state.initializeGame();
        for (int x = 0; x < random2+1; x = x + 1)
        {
        	int handSize = state.players.get(0).hand.size();
		      int after = handSize + 2;
		      System.out.println("hand count = " + handSize);
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand actions = " + state.players.get(0).actions);
		      System.out.println("hand buys = " + state.players.get(0).buys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand discard = " + state.players.get(0).discard.size());
		      
		      Card c = Card.getCard(cards, Card.CardName.Adventurer);
		      c.play(state.players.get(0), state);
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = " + after);
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand actions = " + state.players.get(0).actions);
		      System.out.println("hand buys = " + state.players.get(0).buys);
		      System.out.println("hand discard = " + state.players.get(0).discard.size());
		      assertEquals(state.players.get(0).hand.size(), after);
        }
        
        System.out.println("Initialization DominionBoard:\n " + state.toString());
        System.out.println("----------------------------------");
        HashMap<Player,Integer> endGameLeaderboard = state.play();
        
        System.out.println("Game Complete.\n");

        System.out.println("Player Name\t\tVictory Points");
        for (Player p: endGameLeaderboard.keySet()){
            System.out.println("- " + p.playerName + "\t\t" + endGameLeaderboard.get(p));
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n --- Cards on Table --- \n");
        sb.append("Card Name (Number of Cards)\n");
        Map<Card,Integer> treeMap = new TreeMap<Card, Integer>(state.gameBoard);
        for (Card card : treeMap.keySet())
            sb.append("- " + card.getCardName() + " (" + treeMap.get(card) + ")\n");
    }
    
    @Test
    public void discardTest() throws Throwable {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());
        
        Card c = Card.getCard(cards,Card.CardName.Cooper);
        List<Card> coppersHand = Card.filter(state.players.get(0).hand,c.getType());
        int expected = (state.players.get(0).hand.size()) - (coppersHand.size());
        System.out.println(coppersHand.size());
        for (int i=0;i<coppersHand.size()+1;i++) {
            state.players.get(0).discard(c);
        }
        // should catch discarding more than there are
        assertEquals(state.players.get(0).hand.size(),expected);
    }
    
    @Test
    public void treasureCardTest() throws Throwable {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());
        
        Card c = Card.getCard(cards,Card.CardName.Cooper);
        List<Card> coppersPlay = Card.filter(state.players.get(0).hand,c.getType());
        
        state.players.get(0).playTreasureCard();
        
        List<Card> coppersHand = Card.filter(state.players.get(0).hand,c.getType());
        
        assertEquals(coppersHand.size(),0);
        assertEquals(state.players.get(0).playedCards.size(),coppersPlay.size());
    }
    
    @Test
    public void buyCardTest() throws Throwable {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());
        
        state.players.get(0).buyCard();
        assertEquals(state.players.get(0).discard.size(),1);
    }
    
    @Test
    public void endPhaseTest() throws Throwable {
        GameState state = new GameState(cards);
        Randomness.reset(10);
        
        Player player = new Player(state, "TestPlayer");
        state.addPlayer(player);
        player = new Player(state, "TestPlayer2");
        state.addPlayer(player);
        
        state.initializeGame();
        
        System.out.println(state.players.get(0).toString());
        
        state.players.get(0).playKingdomCard();
        state.players.get(0).buyCard();
        
        int expectedDiscard = state.players.get(0).playedCards.size() + state.players.get(0).discard.size() + state.players.get(0).hand.size();
        System.out.println(state.players.get(0).toString());
        state.players.get(0).endTurn();
        System.out.println(state.players.get(0).toString());
        assertEquals(state.players.get(0).playedCards.size(),0);
        assertEquals(state.players.get(0).hand.size(),5);
        assertEquals(state.players.get(0).discard.size(),expectedDiscard);
    }
}