package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cs362.dominion.Card.CardName;
import cs362.dominion.Card.Type;

public class CardEffectsTest {

	private static ArrayList<Card> cards;
	private static GameState gs;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cards = new ArrayList<Card>(Card.createCards());
		gs = new GameState(cards);
		Randomness.reset(10);
		Player player = new Player(gs, "player-1");
		gs.addPlayer(player);
		player = new Player(gs, "player-2");
		gs.addPlayer(player);		      
		//Initialize the game!
		gs.initializeGame();
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void SmithyTest() {
		Player p = gs.players.get(0);
		Card c = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		
		int n_cards_before = p.hand.size();
		c.play(p, gs);
		assertTrue(p.hand.size() == n_cards_before + 3);
	}
	@Test
	public void VillageTest() {
		Player p = gs.players.get(0);
		Card c = new Card(CardName.Village,Type.ACTION,6,0,0);
		
		int n_actions_before = p.numActions;
		int n_handsize_before = p.hand.size();
		c.play(p, gs);
		assertTrue(p.numActions == n_actions_before + 2);
		assertTrue(p.hand.size() == n_handsize_before + 1);
	}

	@Test
	public void EmbargoTest() {
		Player p = gs.players.get(0);
		Card c = new Card(CardName.Embargo,Type.ACTION,6,0,0);
		
		int n_coins_before = p.coins;
		int n_trashpile_before = gs.trashPile.size();
		c.play(p, gs);
		assertTrue(p.coins == n_coins_before + 2);
		assertTrue(gs.trashPile.size() == n_trashpile_before + 1);
		
		boolean something_not_one = false;
		for(int i : gs.embargoTokens.values()){
			if(i>0){
				something_not_one = true;
				break;
			}
		}
		assertTrue(something_not_one);
	}
	@Test
	public void GardenTest() {
		Player p = gs.players.get(0);
		Card c = new Card(CardName.Garden,Type.ACTION,6,0,0);
		
		c.play(p, gs);
		assertTrue(true);//NPE Check kind of
	}
	
	@Test
	public void CouncilRoomTest(){
		Player p = gs.players.get(0);
		Card c = new Card(CardName.Council_Room,Type.ACTION,6,0,0);
		int n_buys_before = p.numBuys;
		int n_hand_before = p.hand.size();
		int p2_hand_before = gs.players.get(1).hand.size();
		
		c.play(p,gs);
		
		assertTrue(p.numBuys == n_buys_before + 1);
		assertTrue(p.hand.size() == n_hand_before + 3);
		assertTrue(gs.players.get(1).hand.size() == p2_hand_before + 1);
	}

	@Test
	public void CutpurseTestNoRevealTest(){
		Player p = gs.players.get(0);
		Card c = new Card(CardName.Cutpurse,Type.ACTION,6,0,0);
		int n_coins_before = p.coins;
		gs.players.get(1).hand.clear();
		gs.players.get(1).hand.add(new Card(CardName.Cooper,Type.TREASURE,6,0,0));
		
		c.play(p, gs);
		assertTrue(p.coins == n_coins_before + 2);
		//assertTrue(gs.players.get(1).hand.isEmpty());
		
	}
	
	@Test
	public void GreatHallTest(){
		Player p = gs.players.get(0);
		int n_actions_before = p.numActions;
		int n_hand_before = p.hand.size();
		
		Card c = new Card(CardName.Great_Hall,Type.ACTION,6,0,0);
		c.play(p, gs);
	
		assertTrue(p.numActions == n_actions_before + 1);
		assertTrue(n_hand_before + 1 == p.hand.size());
	}
}
