package dominion;

import static org.junit.Assert.*;
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
  public void testVariables(){
    Player a = new Player("Amy", g);
    assertEquals(7, a.startingCopper);
    assertEquals(3, a.startingEstates);
    assertEquals("Amy", a.toString());
    assertEquals(7, a.drawCards);
    assertEquals(11, a.randomSeed);
  }

  @Test
  public void testAdders(){
    Player a = new Player("Amy", g);
    assertEquals(10, a.countAllCards());

    assertEquals(7, a.startingCopper);
    assertEquals(3, a.startingEstates);
    assertEquals("Amy", a.toString());
    assertEquals(7, a.drawCards);
    assertEquals(11, a.randomSeed);

    // addMoney
    assertEquals(0, a.getMoney());
    assertEquals(1, a.addMoney(1));
    assertEquals(1, a.getMoney());
    assertEquals(0, a.addMoney(-1));
    assertEquals(0, a.getMoney());
    // addActions
    assertEquals(1, a.getActions());
    assertEquals(2, a.addActions(1));
    assertEquals(2, a.getActions());
    // addBuys
    assertEquals(1, a.getBuys());
    assertEquals(2, a.addBuys(1));
    assertEquals(2, a.getBuys());
  }

  @Test
  public void testActionPhase(){
    Player a = new Player("Amy", g);
    assertEquals(0, a.getMoney());
    assertEquals(1, a.getActions());
    assertEquals(10, a.countAllCards());
    assertEquals(5, a.getHandSize());
    a.actionPhase();
    assertEquals(0, a.getMoney());
    assertEquals(1, a.getActions());
    assertEquals(5, a.getHandSize());
    a.putInHand(Card.EMBARGO);
    assertEquals(6, a.getHandSize());
    a.actionPhase();
    assertEquals(2, a.getMoney());
    assertEquals(0, a.getActions());
    assertEquals(5, a.getHandSize());
    a.putInHand(Card.MINE);
    a.actionPhase();
    assertEquals(2, a.getMoney());
    assertEquals(6, a.getHandSize());
    assertFalse(a.isCardInHand(Card.SILVER));
    assertEquals(1, a.addActions(1));
    for(int i=0; i<6; i++) assertTrue(a.discardFromHand());
    assertEquals(0, a.getHandSize());
    a.actionPhase();
    assertEquals(1, a.getActions());
    a.putInHand(Card.SMITHY);
    assertEquals(2, a.getMoney());
    assertEquals(1, a.getHandSize());
    a.actionPhase();
    assertEquals(2, a.getMoney());
    assertEquals(3, a.getHandSize());
    assertEquals(12, a.countAllCards());
  }

  @Test
  public void testBuyCard(){
    Player a = new Player("Amy", g);
    for(int i=0; i<5; i++) assertTrue(a.discardFromHand());
    assertEquals(10, a.countAllCards());
    assertEquals(1, a.getBuys());
    assertEquals(a.buyCard(Card.COPPER), true);
    assertEquals(11, a.countAllCards());
    assertEquals(0, a.getBuys());
    assertFalse(a.buyCard(Card.DUCHY));
    assertEquals(20, a.addBuys(20));
    assertEquals(30, a.addMoney(30));
    for(int i=0; i<6; i++)
      assertTrue(a.buyCard(Card.DUCHY));
    assertFalse(a.buyCard(Card.DUCHY));
    assertEquals(30, a.addMoney(30));
    for(int i=0; i<6; i++)
      assertTrue(a.buyCard(Card.DUCHY));
    assertFalse(a.buyCard(Card.DUCHY));
  }

  @Test
  public void testBuyPhase(){
    Player a = new Player("Amy", g);
    for(int i=0; i<5; i++) assertTrue(a.discardFromHand());
    a.putInHand(Card.EMBARGO);
    assertEquals(0, a.getMoney());
    assertEquals(1, a.getBuys());
    assertEquals(11, a.countAllCards());
    a.buyPhase();
    assertEquals(0, a.getMoney());
    assertEquals(0, a.getBuys());
    assertEquals(12, a.countAllCards());
    a.buyPhase();
    assertEquals(0, a.getBuys());
    assertEquals(12, a.countAllCards());
    assertEquals(10, a.addMoney(10));
    assertEquals(2, a.addBuys(2));
    a.buyPhase();
    a.buyPhase();
    assertEquals(a.getMoney(), 0);
    assertEquals(0, a.getBuys());
    assertEquals(14, a.countAllCards());
    for(int i=a.getHandSize(); i>0; i--) assertTrue(a.discardFromHand());
    assertEquals(200, a.addBuys(200));
    assertEquals(1000, a.addMoney(1000));
    for(int i=0; i<200; i++) a.buyPhase();
    assertEquals(a.getHandSize(), 0);
    assertFalse(a.buyCard(Card.DUCHY));
    assertTrue(a.buyCard(Card.ESTATE));
  }

  @Test
  public void testChooseHand(){
    Player a = new Player("Amy", g);
    for(int i=0; i<5; i++){
      assertNotNull(a.chooseHand());
    }
    assertNull(a.chooseHand());
  }

  @Test
  public void testChooseTypeOfCard(){
    Player a = new Player("Amy", g);
    assertEquals(
      a.chooseTypeOfCard(Card.Type.TREASURE), Card.COPPER
    );
  }

  @Test
  public void testCountAllCards(){
    Player a = new Player("Amy", g);
    assertEquals(a.countAllCards(), 10);
    a.takeFreeCard(Card.CURSE);
    assertEquals(a.countAllCards(), 11);
  }

  @Test
  public void testCountVictoryPoints(){
    Player a = new Player("Amy", g);
    assertEquals(a.countVictoryPoints(), 3);
    a.takeFreeCard(Card.CURSE);
    assertEquals(a.countVictoryPoints(), 2);
  }

  @Test
  public void testDiscard(){
    Player a = new Player("Becky", g);
    assertEquals(a.countAllCards(), 10);
    assertTrue(a.discard(Card.SILVER));
    assertEquals(a.countAllCards(), 11);
  }

  @Test
  public void testDraw(){
    Player a = new Player("Becky", g);
    for(int i=0; i<5; i++) a.draw();
    assertTrue(a.discard(Card.SILVER));
    assertEquals(a.draw(), Card.SILVER);
    assertTrue(a.discard(Card.GOLD));
    assertEquals(a.draw(), Card.GOLD);
    assertTrue(a.discard(Card.ESTATE));
    assertTrue(a.discard(Card.CURSE));
    assertEquals(Card.CURSE, a.draw());
    assertEquals(Card.ESTATE, a.draw());

  }

  @Test
  public void testIsCardInHand(){
    Player a = new Player("Becky", g);
    assertTrue(a.isCardInHand(Card.COPPER));
    assertFalse(a.isCardInHand(Card.SILVER));
  }

  @Test
  public void testDiscardFromHand(){
    Player a = new Player("Amy", g);
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.countAllCards(), 10);
    assertTrue(a.discardFromHand(Card.COPPER));
    assertEquals(a.getHandSize(), 4);
    assertEquals(a.countAllCards(), 10);
    assertTrue(a.discardFromHand(Card.COPPER));
    assertTrue(a.discardFromHand());
    assertTrue(a.discardFromHand());
    assertEquals(a.getHandSize(), 1);
    assertTrue(a.discardFromHand());
    assertEquals(a.getHandSize(), 0);
    assertFalse(a.discardFromHand());
    assertEquals(a.getHandSize(), 0);
    assertEquals(a.countAllCards(), 10);
  }

  @Test
  public void testNewPlayer(){
    Player a = new Player("Amy", g);
    assertEquals(a.getActions(), 1);
    assertEquals(a.getBuys(), 1);
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.getMoney(), 0);
    assertEquals(a.getName(), "Amy");
    assertEquals(a.countAllCards(), 10);
    assertEquals(a.countVictoryPoints(), 3);
  }

  @Test
  public void testReturnCardToShared(){
    Player a = new Player("Amy", g);
    assertTrue(a.returnCardToShared(Card.COPPER));
  }

  @Test
  public void testTakeFreeCard(){
    Player a = new Player("Amy", g);
    for(int i=0; i<10; i++) assertEquals(g.takeCard(Card.CURSE), Card.CURSE);
    assertFalse(a.takeFreeCard(Card.CURSE));
  }

  @Test
  public void testPlayCard(){
    Player a = new Player("Amy", g);
    assertTrue(a.playCard(Card.EMBARGO));
    a.addActions(-1);
    assertFalse(a.playCard(Card.EMBARGO));
    a.putInHand(Card.VILLAGE);
  }

  @Test
  public void testPutInHand(){
    Player a = new Player("Amy", g);
    assertEquals(a.putInHand(Card.SILVER), true);
  }
}
