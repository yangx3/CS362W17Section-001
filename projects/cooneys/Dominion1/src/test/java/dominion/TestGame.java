package dominion;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGame {
    private GameState state;
    private Player player1;
    private Player player2;
    private List<Card> cards;

    @Before
    public void initializeGame() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
    }

    @Test
    public void addPlayer(){
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        int numPlayers = 0;
        for(Player p : state.players) {
            numPlayers++;
        }
        assertEquals(numPlayers, 2);
    }

    @Test
    public void testInitializeGame(){
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 0);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player2.hand.size(), 0);
        assertEquals(player2.deck.size(), 0);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);
        state.initializeGame();
        System.out.println(player1);
        assertEquals(player2.hand.size(), 0);
        assertEquals(player2.deck.size(), 0);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);
        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 0);
        assertEquals(player1.discard.size(), 10);
        assertEquals(player1.playedCards.size(), 0);
        System.out.println(player1);
    }

    @Test
    public void testIsGameOver(){
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        state.initializeGame();
        for(int i = 0; i < 8; i++) {
            player1.deck.add(Card.getCard(state.cards, Card.CardName.Province));
            state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1 );
        }
        assertTrue(state.isGameOver());
    }

    @Test
    public void testGetWinners(){
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        state.initializeGame();
        for(int i = 0; i < 8; i++) {
            player1.deck.add(Card.getCard(state.cards, Card.CardName.Province));
            state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Province), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Province)) - 1 );
        }
        System.out.println(state.getWinners());
    }

    @Test
    public void testAddEmbargo(){

    }
}