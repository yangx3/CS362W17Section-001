package dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PlayerTest{
  private GameState g;
  private Player a;
  private Player b;

  @Before
  public void initPlayer(){
    g = new GameState();
  }

  @Test
  public void testNewPlayer(){
    Player a = new Player("Amy", g);
    assertEquals(a.getActions(), 1);
    assertEquals(a.getBuys(), 1);
    assertEquals(a.getHandSize(), 5);
    assertTrue(a.discardFromHand(Card.COPPER));
    assertEquals(a.getHandSize(), 4);
    assertEquals(a.getMoney(), 0);
    assertEquals(a.getName(), "Amy");
    assertEquals(a.countAllCards(), 10);
    assertEquals(a.countVictoryPoints(), 3);
  }

  @Test
  public void testBuyCard(){
    // Player a = new Player("Amy", g);
  }
}
