package dominion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
        //Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        System.out.println("Testing Draw Card");
        int exp1 = instance.hand.size() + 1;
        instance.drawCard();
        int res1 = instance.hand.size();
        assertEquals(exp1, res1);
        // TODO review the generated test code and remove the default call to fail.
        if (exp1 != res1) 
            fail("Draw Card Test Failed");
    }

    /**
     * Test of gain method, of class Player.
     */
    @Test
    public void testGain() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
       // Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        Card insta = new Card(Card.CardName.Festival, Card.Type.ACTION,5,0,0);
        System.out.println("Testing Gain Card");
        int exp1 = instance.discard.size() + 1;
        instance.gain(insta);
        int res1 = instance.discard.size();
        assertEquals(exp1, res1);
        // TODO review the generated test code and remove the default call to fail.
        if (exp1 != res1) 
            fail("Gain Card Test Failed");
    }

    /**
     * Test of discard method, of class Player.
     */
    @Test
    public void testDiscard() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
       // Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        Card insta = new Card(Card.CardName.Festival, Card.Type.ACTION,5,0,0);
        instance.hand.add(insta);
        System.out.println("Testing discard Card");
        int exp1 = instance.hand.size() - 1;
        int exp2 = instance.discard.size() + 1;
        instance.discard(insta);
        int res1 = instance.hand.size();
        int res2 = instance.discard.size();
        assertEquals(exp1, res1);
        // TODO review the generated test code and remove the default call to fail.
        if (exp1 != res1 || exp2 != res2) 
            fail("Discard Card Test Failed");
    }

    /**
     * Test of discardType method, of class Player.
     */
    @Test
    public void testDiscardType() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
       // Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        Card insta = new Card(Card.CardName.Festival, Card.Type.ACTION,5,0,0);
        instance.hand.add(insta);
        instance.hand.add(insta);
        System.out.println("Testing discardType");
        int exp1 = instance.hand.size();
        int exp2 = instance.discard.size();
        instance.discardType(insta);
        int res1 = instance.hand.size();
        int res2 = instance.discard.size();
        //assertEquals(exp1, res1);
        // TODO review the generated test code and remove the default call to fail.
        if (exp1 < res1 || exp2 > res2) 
            fail("DiscardType Test Failed");
    }

    /**
     * Test of trash method, of class Player.
     */
    @Test
    public void testTrash() {
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
       // Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        Card insta = new Card(Card.CardName.Festival, Card.Type.ACTION,5,0,0);
        instance.hand.add(insta);
        System.out.println("Testing Trash");
        int exp1 = instance.hand.size() - 1;
        int exp2 = instance.discard.size();
        instance.trash(insta);
        int res1 = instance.hand.size();
        int res2 = instance.discard.size();
        assertEquals(exp1, res1);
        // TODO review the generated test code and remove the default call to fail.
        if (exp1 != res1 || exp2 != res2) 
            fail("Trash Test Failed");
    }


    /**
     * Test of playTreasureCard method, of class Player.
     */
    @Test
    public void testPlayTreasureCard(){
        List<Card> cards = new ArrayList<Card>(Card.createCards());
        GameState state = new GameState(cards);
       // Randomness.reset(10);
        Player instance = new Player(state, "player-1");
        state.addPlayer(instance);
        instance = new Player(state, "player-2");
        state.addPlayer(instance);
        state.initializeGame();
        
        System.out.println("Testing TreasureCard");
        instance.playTreasureCard();
        int numCoins = 0;
        int result = instance.coins;
        assert(numCoins < result);
        if(!(numCoins < result))  
            fail("Treasure test Failed");
    }
}
