package dominion;
import java.util.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getType method, of class Card.
     */
    @Test
    public void testGetType() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("getTypeTEST");
        Card instance = new Card(Card.CardName.Copper, Card.Type.TREASURE, 1, 0, 1);
        Card.Type exp1 = Card.Type.TREASURE;
        Card.Type res1 = instance.getType();
        assertEquals(exp1, res1);
        if( exp1 != res1) {
            fail("GET TYPE TEST FAILED");
        }
    }

    /**
     * Test of getCardName method, of class Card.
     */
    @Test
    public void testGetCardName() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("getNameTEST");
        Card instance = new Card(Card.CardName.Copper, Card.Type.TREASURE, 1, 0, 1);
        Card.CardName exp1 = Card.CardName.Copper;
        Card.CardName res1 = instance.getCardName();
        assertEquals(exp1, res1);
        if( exp1 != res1) {
            fail("GET NAME TEST FAILED");
        }
    }

    /**
     * Test of getCost method, of class Card.
     */
    @Test
    public void testGetCost() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("getCostTEST");
        Card instance = new Card(Card.CardName.Copper, Card.Type.TREASURE, 1, 0, 1);
        int exp1 = 1;
        int res1 = instance.getCost();
        assertEquals(exp1, res1);
        if( exp1 != res1) {
            fail("Cost Test Failed");
        }
    }

    /**
     * Test of getTreasureValue method, of class Card.
     */
    @Test
    public void testGetTreasureValue() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("getTreasureTEST");
        Card instance = new Card(Card.CardName.Copper, Card.Type.TREASURE, 1, 0, 1);
        int exp1 = 1;
        int res1 = instance.getTreasureValue();
        assertEquals(exp1, res1);
        if( exp1 != res1) {
            fail("Treasure Test Failed");
        }
    }

    /**
     * Test of score method, of class Card.
     */
    @Test
    public void testScore() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("getScoreTEST");
        Card instance = new Card(Card.CardName.Estate,Card.Type.VICTORY,2, 1, 0);
        int exp1 = 1;
        int res1 = instance.score();
        assertEquals(exp1, res1);
        if( exp1 != res1) {
            fail("Score Test Failed");
        }
    }

    /**
     * Test of play method, of class Card.
     */
    @Test
    public void testPlay() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        Randomness.reset(10);
        Player player = new Player(state, "player-1");
        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);
        state.initializeGame();
        
        System.out.println("play card TEST w/Festival");
        Card instance = new Card(Card.CardName.Festival, Card.Type.ACTION,5,0,0);
        instance.play(player, state);
        int exp1 = 3;
        int exp2 = 2;
        int exp3 = 2;
        int res1 = state.players.get(1).numActions;
        int res2 = state.players.get(1).numBuys;
        int res3 = state.players.get(1).coins;     
        assertEquals(exp1, res1);
        assertEquals(exp2, res2);
        assertEquals(exp3, res3);
        if( exp1 != res1 || exp2 != res2 || exp3 != res3){
            fail("Play card festival test Failed");
        }   
    }
}
