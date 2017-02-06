package dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CardTest{
  private GameState g;
  private Player a;
  private Player b;


  @Before
  public void initPlayer(){
    g = new GameState();
    a = new Player("Armand", g);
  }

  @Test
  public void testValuesCopper(){
    // System.out.println("In testValuesCopper.");
    assertEquals(Card.COPPER.toString(), "Copper");
    assertEquals(Card.COPPER.desc, "worth 1 money");
    assertEquals(Card.COPPER.costsAction, 0);
    assertEquals(Card.COPPER.costsMoney, 0);
    assertEquals(Card.COPPER.givesActions, 0);
    assertEquals(Card.COPPER.givesCardDraws, 0);
    assertEquals(Card.COPPER.givesMoney, 1);
    assertEquals(Card.COPPER.givesVictoryPoints, 0);
    assertEquals(Card.COPPER.getType(), Card.Type.TREASURE);
  }

  @Test
  public void testPlayCopper(){
    assertEquals(a.getMoney(), 0);
    Card.COPPER.play(a);
    assertEquals(a.getMoney(), 1);
  }

  @Test
  public void testPlayCurse(){
    assertEquals(a.getMoney(), 0);
    Card.CURSE.play(a);
    assertEquals(a.getMoney(), 0);
  }

  @Test
  public void testPlayAdventurer(){
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.countAllCards(), 10);
    assertEquals(Card.ADVENTURER.play(a), Card.ADVENTURER);
    assertEquals(a.getHandSize(), 7);
    assertEquals(a.countAllCards(), 10);
  }

  @Test
  public void testPlayAmbassador(){
    // Needs random choices enabled
  }

  @Test
  public void testPlayBaron(){
    // Case: no Estate in hand, gain an Estate
    while(a.isCardInHand(Card.ESTATE)) a.discardFromHand(Card.ESTATE);
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(Card.BARON.play(a), Card.BARON);
    assertEquals(a.countAllCards(), 11);

    // Case: yes Estate in hand, gain 4 money
    assertEquals(a.getMoney(), 0);
    a.putInHand(Card.ESTATE);
    assertTrue(a.isCardInHand(Card.ESTATE));
    assertEquals(Card.BARON.play(a), Card.BARON);
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(a.getMoney(), 4);
  }


}
