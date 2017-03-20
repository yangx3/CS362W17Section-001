package dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GameStateTest{
  private GameState g;
  private Player a;
  private Player b;

  @Before
  public void initPlayer(){
    g = new GameState();
  }

  @Test
  public void testVariables(){
    assertEquals(g.defaultDeckSize, 100);
    assertEquals(g.pileSize, 8);
    assertEquals(g.bankCopper, 60);
    assertEquals(g.bankSilver, 40);
    assertEquals(g.bankGold, 30);
    assertEquals(g.bankEstates, 24);
    assertEquals(g.bankDuchies, 12);
    assertEquals(g.bankProvinces, 12);
    assertEquals(g.bankKingdomCards, 10);
    assertEquals(g.bankCurses, 10);
    assertEquals(g.numPlayers, 0);
    assertEquals(g.playerTurn, 0);
    assertEquals(g.maxPlayers, 4);
    assertEquals(g.supply.size(), 318);
    assertEquals(g.players.length, 4);
  }

  @Test
  public void testAddPlayer(){
    assertEquals(g.numPlayers, 0);
    assertTrue(g.addPlayer("Amy"));
    assertEquals(g.numPlayers, 1);
    Player b = new Player("Benny", g);
    assertTrue(g.addPlayer(b));
    assertEquals(g.numPlayers, 2);
    assertTrue(g.addPlayer("Charlie"));
    assertTrue(g.addPlayer("Denise"));
    assertEquals(g.numPlayers, 4);
    assertFalse(g.addPlayer("Xavier"));
    assertEquals(g.numPlayers, 4);
  }

  @Test
  public void testCheckEndConditions(){
    Player a = new Player("Amy", g);
    g.addPlayer(a);
    assertTrue(g.nextTurn());
    assertFalse(g.checkEndConditions());
    for(int i=0; i<12; i++){
      g.takeCard(Card.DUCHY);
      g.takeCard(Card.MINE);
      g.takeCard(Card.BARON);
    }
    assertFalse(g.nextTurn());
    assertTrue(g.checkEndConditions());
    g.addCard(Card.MINE);
    assertFalse(g.checkEndConditions());
    for(int i=0; i<12; i++) g.takeCard(Card.PROVINCE);
    assertTrue(g.checkEndConditions());
  }

  @Test
  public void testTakeCard(){
    assertEquals(g.takeCard(Card.COPPER), Card.COPPER);
    for(int i=0; i<12; i++) g.takeCard(Card.DUCHY);
    assertEquals(g.takeCard(Card.DUCHY), null);
  }

  @Test
  public void testNextTurn(){
    g.addPlayer("Amy");
    g.addPlayer("Benny");
    for(int i=0; i<20; i++) g.nextTurn();
  }

  @Test
  public void testDoubleCheckVariables(){
    assertEquals(100, g.defaultDeckSize);
    assertEquals(8, g.pileSize);
    assertEquals(60, g.bankCopper);
    assertEquals(40, g.bankSilver);
    assertEquals(30, g.bankGold);
    assertEquals(24, g.bankEstates);
    assertEquals(12, g.bankDuchies);
    assertEquals(12, g.bankProvinces);
    assertEquals(10, g.bankKingdomCards);
    assertEquals(10, g.bankCurses);
    assertEquals(0, g.numPlayers);
    assertEquals(0, g.playerTurn);
    assertEquals(4, g.maxPlayers);
    assertEquals(318, g.supply.size());
    assertEquals(4, g.players.length);
  }
}
