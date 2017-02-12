import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {
    private GameState state;
    private Player player1;
    private Player player2;
    private List<Card> cards;

    @Before
    public void initializeGame() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        player1 = new Player(state, "PLAYER 1");
        state.addPlayer(player1);
        player2 = new Player(state, "PLAYER 2");
        state.addPlayer(player2);
        state.initializeGame();
    }

    @Test
    public void testDrawCard() {
        player1.initializePlayerTurn();
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        System.out.println(player1);
        player1.drawCard();
        assertEquals(player1.hand.size(), 6);
        assertEquals(player1.deck.size(), 4);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        System.out.println(player1);
    }

    @Test
    public void testInitializePlayerTurn() {

    }

    @Test
    //card goes in discard,
    public void testGain() {

    }

    @Test
        //Discard hand
    public void testDiscard() {

    }

    @Test
    public void testPlayKingdomCard() {

    }

    @Test
    public void testScoreFor() {

    }

    @Test
    public void testPlayTreasureCard() {

    }

    @Test
    public void testBuyCard() {

    }

    @Test
    public void testEndTurn() {

    }
}
