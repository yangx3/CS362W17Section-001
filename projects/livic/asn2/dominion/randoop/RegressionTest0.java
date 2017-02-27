
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    java.lang.Iterable<dominion.Card> iterable_card0 = null;
    dominion.Card.Type type1 = dominion.Card.Type.ACTION;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<dominion.Card> list_card2 = dominion.Card.filter(iterable_card0, type1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + dominion.Card.Type.ACTION + "'", type1.equals(dominion.Card.Type.ACTION));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Minion;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Minion + "'", cardName0.equals(dominion.Card.CardName.Minion));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Baron;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Baron + "'", cardName0.equals(dominion.Card.CardName.Baron));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Cutpurse;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Cutpurse + "'", cardName0.equals(dominion.Card.CardName.Cutpurse));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    java.lang.Iterable<dominion.Card> iterable_card0 = null;
    dominion.Card.Type type1 = dominion.Card.Type.TREASURE;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<dominion.Card> list_card2 = dominion.Card.filter(iterable_card0, type1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + dominion.Card.Type.TREASURE + "'", type1.equals(dominion.Card.Type.TREASURE));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.CouncilRoom;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.CouncilRoom + "'", cardName0.equals(dominion.Card.CardName.CouncilRoom));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Gardens;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Gardens + "'", cardName0.equals(dominion.Card.CardName.Gardens));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = player2.addToDeck(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = player2.addToDeck(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    dominion.Card card4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = player2.addToDeck(card4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = player2.addToDeck(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = player2.addToDeck(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    dominion.Card card4 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    java.util.List<dominion.Card> list_card0 = null;
    dominion.Card.CardName cardName1 = dominion.Card.CardName.Smithy;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card2 = dominion.Card.getCard(list_card0, cardName1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + dominion.Card.CardName.Smithy + "'", cardName1.equals(dominion.Card.CardName.Smithy));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card.CardName cardName9 = dominion.Card.CardName.Cooper;
    dominion.Card card10 = dominion.Card.getCard(list_card6, cardName9);
    dominion.Card.CardName cardName11 = dominion.Card.CardName.Curse;
    dominion.Card card12 = dominion.Card.getCard(list_card6, cardName11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.VICTORY + "'", type7.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + dominion.Card.CardName.Cooper + "'", cardName9.equals(dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + dominion.Card.CardName.Curse + "'", cardName11.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = player2.addToDeck(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str6 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str6 = player2.toString();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Embargo;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.Type type14 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type14);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.Type type22 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type22);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type22);
    dominion.Card.CardName cardName25 = dominion.Card.CardName.Adventurer;
    dominion.Card card26 = dominion.Card.getCard(list_card16, cardName25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName7.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.ACTION + "'", type14.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.ACTION + "'", type22.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName25.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = player2.addToDeck(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = player2.addToDeck(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = player2.addToDeck(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.Card.CardName cardName10 = null;
    dominion.Card card11 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card8, cardName10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.Type type15 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card14, type15);
    dominion.Card.CardName cardName17 = dominion.Card.CardName.Province;
    dominion.Card card18 = dominion.Card.getCard(list_card16, cardName17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + dominion.Card.Type.TREASURE + "'", type15.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + dominion.Card.CardName.Province + "'", cardName17.equals(dominion.Card.CardName.Province));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playTreasureCard();

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = player2.addToDeck(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = player2.addToDeck(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    dominion.Card card4 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = dominion.Card.CardName.Gold;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card card14 = dominion.Card.getCard(list_card6, cardName12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.TREASURE + "'", type7.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + dominion.Card.CardName.Gold + "'", cardName12.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = player2.addToDeck(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Gold;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.Card.CardName cardName8 = null;
    dominion.Card card9 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card6, cardName8);
    dominion.Card.Type type10 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card11, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Silver;
    dominion.Card card16 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + dominion.Card.CardName.Gold + "'", cardName3.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.ACTION + "'", type10.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + dominion.Card.CardName.Silver + "'", cardName15.equals(dominion.Card.CardName.Silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = player2.addToDeck(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.playKingdomCard();

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.ACTION + "'", type7.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card.CardName cardName9 = dominion.Card.CardName.Mine;
    dominion.Card card10 = dominion.Card.getCard(list_card8, cardName9);
    dominion.Card.CardName cardName11 = dominion.Card.CardName.GreatHall;
    dominion.Card card12 = dominion.Card.getCard(list_card8, cardName11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.ACTION + "'", type7.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + dominion.Card.CardName.Mine + "'", cardName9.equals(dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + dominion.Card.CardName.GreatHall + "'", cardName11.equals(dominion.Card.CardName.GreatHall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    dominion.Card card4 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Gold;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.Card.CardName cardName8 = null;
    dominion.Card card9 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card6, cardName8);
    dominion.Card.Type type10 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.Card.CardName cardName15 = null;
    dominion.Card card16 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card13, cardName15);
    dominion.Card.Type type17 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card18 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card13, type17);
    dominion.Card.CardName cardName19 = dominion.Card.CardName.Duchy;
    dominion.Card card20 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card13, cardName19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card13, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type21);
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.Card.CardName cardName27 = null;
    dominion.Card card28 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card25, cardName27);
    dominion.Card.Type type29 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card30 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card25, type29);
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type29);
    java.util.List<dominion.Card> list_card32 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + dominion.Card.CardName.Gold + "'", cardName3.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.ACTION + "'", type10.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + dominion.Card.Type.ACTION + "'", type17.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + cardName19 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName19.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card28);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + dominion.Card.Type.ACTION + "'", type29.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    dominion.Card card4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = player2.addToDeck(card4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = player2.addToDeck(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = player2.addToDeck(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str9 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = player2.addToDeck(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str8 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Ambassador;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.Card.CardName cardName19 = null;
    dominion.Card card20 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card17, cardName19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type21);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type21);
    dominion.Card[] card_array25 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card26 = new java.util.ArrayList<dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card26, card_array25);
    dominion.Card.CardName cardName28 = null;
    dominion.Card card29 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName28);
    dominion.Card.Type type30 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card26, type30);
    dominion.Card.Type type32 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.CardName cardName39 = dominion.Card.CardName.Ambassador;
    dominion.Card card40 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName39);
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.Card.CardName cardName44 = null;
    dominion.Card card45 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card42, cardName44);
    dominion.Card.Type type46 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card42, type46);
    java.util.List<dominion.Card> list_card48 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type46);
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card33, type46);
    dominion.Card[] card_array50 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card51 = new java.util.ArrayList<dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card51, card_array50);
    dominion.Card.CardName cardName53 = null;
    dominion.Card card54 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card51, cardName53);
    dominion.Card.Type type55 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card51, type55);
    dominion.Card.CardName cardName57 = dominion.Card.CardName.Duchy;
    dominion.Card card58 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card51, cardName57);
    dominion.Card card59 = dominion.Card.getCard(list_card33, cardName57);
    dominion.Card card60 = dominion.Card.getCard(list_card24, cardName57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.TREASURE + "'", type7.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName14.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + dominion.Card.Type.ACTION + "'", type30.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.TREASURE + "'", type32.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + cardName39 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName39.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + dominion.Card.Type.ACTION + "'", type46.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card54);
    org.junit.Assert.assertTrue("'" + type55 + "' != '" + dominion.Card.Type.ACTION + "'", type55.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName57.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card60);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str6 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    player2.buyCard();
    dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    dominion.Card card12 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str6 = player2.toString();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.Card.CardName cardName10 = null;
    dominion.Card card11 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card8, cardName10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Feast;
    dominion.Card card16 = dominion.Card.getCard(list_card14, cardName15);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.Type type22 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type22);
    dominion.Card.Type type24 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.Type type31 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card32 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type31);
    dominion.Card.CardName cardName33 = dominion.Card.CardName.Duchy;
    dominion.Card card34 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName33);
    dominion.Card.Type type35 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type35);
    dominion.Card[] card_array37 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card38 = new java.util.ArrayList<dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card38, card_array37);
    dominion.Card.CardName cardName40 = null;
    dominion.Card card41 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card38, cardName40);
    dominion.Card.Type type42 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card38, type42);
    dominion.Card.CardName cardName44 = dominion.Card.CardName.Duchy;
    dominion.Card card45 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card38, cardName44);
    dominion.Card card46 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName44);
    dominion.Card card47 = dominion.Card.getCard(list_card25, cardName44);
    dominion.Card.Type type48 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card25, type48);
    java.util.List<dominion.Card> list_card50 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card14, type48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + dominion.Card.CardName.Feast + "'", cardName15.equals(dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.ACTION + "'", type22.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.VICTORY + "'", type24.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + dominion.Card.Type.ACTION + "'", type31.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName33.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + dominion.Card.Type.ACTION + "'", type35.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + dominion.Card.Type.ACTION + "'", type42.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName44.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + dominion.Card.Type.TREASURE + "'", type48.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.Card.CardName cardName10 = null;
    dominion.Card card11 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card8, cardName10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.Type type15 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card14, type15);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.CardName cardName22 = dominion.Card.CardName.Ambassador;
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName22);
    dominion.Card.CardName cardName24 = dominion.Card.CardName.Embargo;
    dominion.Card card25 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.Type type31 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card32 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type31);
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type31);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.Type type39 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type39);
    dominion.Card.Type type41 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card42 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card40, type41);
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type41);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type41);
    dominion.Card[] card_array45 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card46 = new java.util.ArrayList<dominion.Card>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card46, card_array45);
    dominion.Card.CardName cardName48 = null;
    dominion.Card card49 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card46, cardName48);
    dominion.Card.CardName cardName50 = dominion.Card.CardName.Ambassador;
    dominion.Card card51 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card46, cardName50);
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.Card.CardName cardName55 = null;
    dominion.Card card56 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card53, cardName55);
    dominion.Card.Type type57 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card58 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card53, type57);
    java.util.List<dominion.Card> list_card59 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card46, type57);
    dominion.Card.Type type60 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card61 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card59, type60);
    dominion.Card[] card_array62 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card63 = new java.util.ArrayList<dominion.Card>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card63, card_array62);
    dominion.Card.CardName cardName65 = null;
    dominion.Card card66 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card63, cardName65);
    dominion.Card.CardName cardName67 = dominion.Card.CardName.Ambassador;
    dominion.Card card68 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card63, cardName67);
    dominion.Card.CardName cardName69 = dominion.Card.CardName.Embargo;
    dominion.Card card70 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card63, cardName69);
    dominion.Card[] card_array71 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card72 = new java.util.ArrayList<dominion.Card>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card72, card_array71);
    dominion.Card.CardName cardName74 = null;
    dominion.Card card75 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card72, cardName74);
    dominion.Card.Type type76 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card77 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card72, type76);
    java.util.List<dominion.Card> list_card78 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card63, type76);
    dominion.Card[] card_array79 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card80 = new java.util.ArrayList<dominion.Card>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card80, card_array79);
    dominion.Card.CardName cardName82 = null;
    dominion.Card card83 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card80, cardName82);
    dominion.Card.Type type84 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card85 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card80, type84);
    dominion.Card.Type type86 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card87 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card85, type86);
    java.util.List<dominion.Card> list_card88 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card63, type86);
    java.util.List<dominion.Card> list_card89 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card61, type86);
    java.util.List<dominion.Card> list_card90 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + dominion.Card.Type.TREASURE + "'", type15.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName22.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName24.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + dominion.Card.Type.ACTION + "'", type31.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + dominion.Card.Type.ACTION + "'", type39.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + dominion.Card.Type.TREASURE + "'", type41.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card49);
    org.junit.Assert.assertTrue("'" + cardName50 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName50.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    org.junit.Assert.assertTrue("'" + type57 + "' != '" + dominion.Card.Type.ACTION + "'", type57.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    org.junit.Assert.assertTrue("'" + type60 + "' != '" + dominion.Card.Type.TREASURE + "'", type60.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card66);
    org.junit.Assert.assertTrue("'" + cardName67 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName67.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card68);
    org.junit.Assert.assertTrue("'" + cardName69 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName69.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card75);
    org.junit.Assert.assertTrue("'" + type76 + "' != '" + dominion.Card.Type.ACTION + "'", type76.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card83);
    org.junit.Assert.assertTrue("'" + type84 + "' != '" + dominion.Card.Type.ACTION + "'", type84.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    org.junit.Assert.assertTrue("'" + type86 + "' != '" + dominion.Card.Type.TREASURE + "'", type86.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card90);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Embargo;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.Type type14 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type14);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.Type type22 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type22);
    dominion.Card.Type type24 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    java.util.List<dominion.Card> list_card26 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type24);
    dominion.Card.CardName cardName27 = null;
    dominion.Card card28 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName7.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.ACTION + "'", type14.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.ACTION + "'", type22.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.TREASURE + "'", type24.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card28);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playTreasureCard();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.Card.CardName cardName10 = null;
    dominion.Card card11 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card8, cardName10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.Type type15 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card14, type15);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.CardName cardName22 = dominion.Card.CardName.Ambassador;
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName22);
    dominion.Card.CardName cardName24 = dominion.Card.CardName.Embargo;
    dominion.Card card25 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.Type type31 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card32 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type31);
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type31);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.Type type39 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type39);
    dominion.Card.Type type41 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card42 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card40, type41);
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type41);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type41);
    dominion.Card.Type type45 = null;
    java.util.List<dominion.Card> list_card46 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card44, type45);
    dominion.Card[] card_array47 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card48 = new java.util.ArrayList<dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card48, card_array47);
    dominion.Card.CardName cardName50 = null;
    dominion.Card card51 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card48, cardName50);
    dominion.Card.Type type52 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card48, type52);
    dominion.Card.CardName cardName54 = dominion.Card.CardName.Duchy;
    dominion.Card card55 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card48, cardName54);
    dominion.Card.Type type56 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card57 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card48, type56);
    java.util.List<dominion.Card> list_card58 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card46, type56);
    dominion.Card[] card_array59 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card60 = new java.util.ArrayList<dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card60, card_array59);
    dominion.Card.CardName cardName62 = null;
    dominion.Card card63 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card60, cardName62);
    dominion.Card.Type type64 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card60, type64);
    dominion.Card.Type type66 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card67 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card65, type66);
    dominion.Card[] card_array68 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card69 = new java.util.ArrayList<dominion.Card>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card69, card_array68);
    dominion.Card.CardName cardName71 = null;
    dominion.Card card72 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card69, cardName71);
    dominion.Card.CardName cardName73 = dominion.Card.CardName.Ambassador;
    dominion.Card card74 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card69, cardName73);
    dominion.Card[] card_array75 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card76 = new java.util.ArrayList<dominion.Card>();
    boolean b77 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card76, card_array75);
    dominion.Card.CardName cardName78 = null;
    dominion.Card card79 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card76, cardName78);
    dominion.Card.Type type80 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card81 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card76, type80);
    java.util.List<dominion.Card> list_card82 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card69, type80);
    java.util.List<dominion.Card> list_card83 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card67, type80);
    dominion.Card[] card_array84 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card85 = new java.util.ArrayList<dominion.Card>();
    boolean b86 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card85, card_array84);
    dominion.Card.CardName cardName87 = null;
    dominion.Card card88 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card85, cardName87);
    dominion.Card.Type type89 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card90 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card85, type89);
    dominion.Card.Type type91 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card92 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card90, type91);
    java.util.List<dominion.Card> list_card93 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card67, type91);
    java.util.List<dominion.Card> list_card94 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card46, type91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + dominion.Card.Type.TREASURE + "'", type15.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName22.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName24.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + dominion.Card.Type.ACTION + "'", type31.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + dominion.Card.Type.ACTION + "'", type39.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + dominion.Card.Type.TREASURE + "'", type41.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card51);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + dominion.Card.Type.ACTION + "'", type52.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    org.junit.Assert.assertTrue("'" + cardName54 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName54.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card55);
    org.junit.Assert.assertTrue("'" + type56 + "' != '" + dominion.Card.Type.ACTION + "'", type56.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card63);
    org.junit.Assert.assertTrue("'" + type64 + "' != '" + dominion.Card.Type.ACTION + "'", type64.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    org.junit.Assert.assertTrue("'" + type66 + "' != '" + dominion.Card.Type.TREASURE + "'", type66.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card72);
    org.junit.Assert.assertTrue("'" + cardName73 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName73.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card79);
    org.junit.Assert.assertTrue("'" + type80 + "' != '" + dominion.Card.Type.ACTION + "'", type80.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card88);
    org.junit.Assert.assertTrue("'" + type89 + "' != '" + dominion.Card.Type.ACTION + "'", type89.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card90);
    org.junit.Assert.assertTrue("'" + type91 + "' != '" + dominion.Card.Type.ACTION + "'", type91.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    java.util.List<dominion.Card> list_card0 = null;
    dominion.Card[] card_array1 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card2 = new java.util.ArrayList<dominion.Card>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card2, card_array1);
    dominion.Card.CardName cardName4 = null;
    dominion.Card card5 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card2, cardName4);
    dominion.Card.Type type6 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card2, type6);
    dominion.Card.CardName cardName8 = dominion.Card.CardName.Duchy;
    dominion.Card card9 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card2, cardName8);
    dominion.Card.CardName cardName10 = dominion.Card.CardName.Silver;
    dominion.Card card11 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card2, cardName10);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.Card.CardName cardName15 = null;
    dominion.Card card16 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card13, cardName15);
    dominion.Card.Type type17 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card18 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card13, type17);
    dominion.Card.Type type19 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card18, type19);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Cooper;
    dominion.Card card22 = dominion.Card.getCard(list_card18, cardName21);
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card2, cardName21);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card24 = dominion.Card.getCard(list_card0, cardName21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.ACTION + "'", type6.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName8.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + dominion.Card.CardName.Silver + "'", cardName10.equals(dominion.Card.CardName.Silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + dominion.Card.Type.ACTION + "'", type17.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + dominion.Card.Type.VICTORY + "'", type19.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + dominion.Card.CardName.Cooper + "'", cardName21.equals(dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Ambassador;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.Card.CardName cardName19 = null;
    dominion.Card card20 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card17, cardName19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type21);
    dominion.Card.Type type24 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.CardName cardName31 = dominion.Card.CardName.Ambassador;
    dominion.Card card32 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName31);
    dominion.Card.CardName cardName33 = dominion.Card.CardName.Embargo;
    dominion.Card card34 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName33);
    dominion.Card[] card_array35 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card36 = new java.util.ArrayList<dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card36, card_array35);
    dominion.Card.CardName cardName38 = null;
    dominion.Card card39 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card36, cardName38);
    dominion.Card.Type type40 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card41 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card36, type40);
    java.util.List<dominion.Card> list_card42 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type40);
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.Card.CardName cardName46 = null;
    dominion.Card card47 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card44, cardName46);
    dominion.Card.Type type48 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card44, type48);
    dominion.Card.Type type50 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card49, type50);
    java.util.List<dominion.Card> list_card52 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type50);
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card25, type50);
    dominion.Card.CardName cardName54 = dominion.Card.CardName.Adventurer;
    dominion.Card card55 = dominion.Card.getCard(list_card53, cardName54);
    dominion.Card card56 = dominion.Card.getCard(list_card6, cardName54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.VICTORY + "'", type7.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName14.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.TREASURE + "'", type24.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + cardName31 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName31.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName33.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + dominion.Card.Type.ACTION + "'", type40.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + dominion.Card.Type.ACTION + "'", type48.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    org.junit.Assert.assertTrue("'" + type50 + "' != '" + dominion.Card.Type.TREASURE + "'", type50.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    org.junit.Assert.assertTrue("'" + cardName54 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName54.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card.CardName cardName9 = dominion.Card.CardName.Estate;
    dominion.Card card10 = dominion.Card.getCard(list_card8, cardName9);
    dominion.Card.CardName cardName11 = dominion.Card.CardName.Embargo;
    dominion.Card card12 = dominion.Card.getCard(list_card8, cardName11);
    dominion.Card.CardName cardName13 = dominion.Card.CardName.Ambassador;
    dominion.Card card14 = dominion.Card.getCard(list_card8, cardName13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.VICTORY + "'", type7.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + dominion.Card.CardName.Estate + "'", cardName9.equals(dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName11.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    org.junit.Assert.assertTrue("'" + cardName13 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName13.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str8 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.buyCard();
    java.lang.String str5 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = player2.addToDeck(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Embargo;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.Type type14 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type14);
    dominion.Card.CardName cardName17 = null;
    dominion.Card card18 = dominion.Card.getCard(list_card16, cardName17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName7.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.ACTION + "'", type14.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str6 = player2.toString();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    player2.playTreasureCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str8 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    java.lang.String str10 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Ambassador;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.Card.CardName cardName19 = null;
    dominion.Card card20 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card17, cardName19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type21);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type21);
    dominion.Card[] card_array25 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card26 = new java.util.ArrayList<dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card26, card_array25);
    dominion.Card.CardName cardName28 = null;
    dominion.Card card29 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName28);
    dominion.Card.CardName cardName30 = dominion.Card.CardName.Ambassador;
    dominion.Card card31 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName30);
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.Card.CardName cardName35 = null;
    dominion.Card card36 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card33, cardName35);
    dominion.Card.Type type37 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card38 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card33, type37);
    java.util.List<dominion.Card> list_card39 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card26, type37);
    dominion.Card.Type type40 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card41 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card39, type40);
    dominion.Card.Type type42 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card39, type42);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card24, type42);
    dominion.Card.CardName cardName45 = dominion.Card.CardName.Village;
    dominion.Card card46 = dominion.Card.getCard(list_card24, cardName45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.TREASURE + "'", type7.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName14.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName30.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card36);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + dominion.Card.Type.ACTION + "'", type37.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + dominion.Card.Type.TREASURE + "'", type40.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + dominion.Card.Type.VICTORY + "'", type42.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + cardName45 + "' != '" + dominion.Card.CardName.Village + "'", cardName45.equals(dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card46);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.buyCard();

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card.CardName cardName9 = dominion.Card.CardName.Estate;
    dominion.Card card10 = dominion.Card.getCard(list_card8, cardName9);
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card12, cardName14);
    dominion.Card.CardName cardName16 = dominion.Card.CardName.Ambassador;
    dominion.Card card17 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card12, cardName16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = null;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.Card.Type type23 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type23);
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card12, type23);
    dominion.Card.Type type26 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card27 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card25, type26);
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.Card.CardName cardName31 = null;
    dominion.Card card32 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card29, cardName31);
    dominion.Card.CardName cardName33 = dominion.Card.CardName.Ambassador;
    dominion.Card card34 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card29, cardName33);
    dominion.Card.CardName cardName35 = dominion.Card.CardName.Embargo;
    dominion.Card card36 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card29, cardName35);
    dominion.Card[] card_array37 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card38 = new java.util.ArrayList<dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card38, card_array37);
    dominion.Card.CardName cardName40 = null;
    dominion.Card card41 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card38, cardName40);
    dominion.Card.Type type42 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card38, type42);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card29, type42);
    dominion.Card[] card_array45 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card46 = new java.util.ArrayList<dominion.Card>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card46, card_array45);
    dominion.Card.CardName cardName48 = null;
    dominion.Card card49 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card46, cardName48);
    dominion.Card.Type type50 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card46, type50);
    dominion.Card.Type type52 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card51, type52);
    java.util.List<dominion.Card> list_card54 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card29, type52);
    java.util.List<dominion.Card> list_card55 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card27, type52);
    dominion.Card.CardName cardName56 = dominion.Card.CardName.Adventurer;
    dominion.Card card57 = dominion.Card.getCard(list_card55, cardName56);
    dominion.Card card58 = dominion.Card.getCard(list_card8, cardName56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.VICTORY + "'", type7.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + dominion.Card.CardName.Estate + "'", cardName9.equals(dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName16.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + dominion.Card.Type.ACTION + "'", type23.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + dominion.Card.Type.TREASURE + "'", type26.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName33.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    org.junit.Assert.assertTrue("'" + cardName35 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName35.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + dominion.Card.Type.ACTION + "'", type42.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card49);
    org.junit.Assert.assertTrue("'" + type50 + "' != '" + dominion.Card.Type.ACTION + "'", type50.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + dominion.Card.Type.TREASURE + "'", type52.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    org.junit.Assert.assertTrue("'" + cardName56 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName56.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card58);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str9 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card.CardName cardName9 = dominion.Card.CardName.Estate;
    dominion.Card card10 = dominion.Card.getCard(list_card8, cardName9);
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card12, cardName14);
    dominion.Card.Type type16 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card17 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card12, type16);
    dominion.Card.Type type18 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card17, type18);
    dominion.Card.CardName cardName20 = dominion.Card.CardName.Mine;
    dominion.Card card21 = dominion.Card.getCard(list_card17, cardName20);
    dominion.Card card22 = dominion.Card.getCard(list_card8, cardName20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.VICTORY + "'", type7.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + dominion.Card.CardName.Estate + "'", cardName9.equals(dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + dominion.Card.Type.ACTION + "'", type16.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + dominion.Card.Type.VICTORY + "'", type18.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + dominion.Card.CardName.Mine + "'", cardName20.equals(dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.Card.CardName cardName10 = null;
    dominion.Card card11 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card8, cardName10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.Type type15 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card14, type15);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.CardName cardName22 = dominion.Card.CardName.Ambassador;
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName22);
    dominion.Card.CardName cardName24 = dominion.Card.CardName.Embargo;
    dominion.Card card25 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.Type type31 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card32 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type31);
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type31);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.Type type39 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type39);
    dominion.Card.Type type41 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card42 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card40, type41);
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type41);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type41);
    dominion.Card.Type type45 = null;
    java.util.List<dominion.Card> list_card46 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card44, type45);
    dominion.Card[] card_array47 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card48 = new java.util.ArrayList<dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card48, card_array47);
    dominion.Card.CardName cardName50 = null;
    dominion.Card card51 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card48, cardName50);
    dominion.Card.Type type52 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card48, type52);
    dominion.Card.CardName cardName54 = dominion.Card.CardName.Duchy;
    dominion.Card card55 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card48, cardName54);
    dominion.Card.Type type56 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card57 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card48, type56);
    java.util.List<dominion.Card> list_card58 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card46, type56);
    dominion.Card.Type type59 = null;
    java.util.List<dominion.Card> list_card60 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card58, type59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + dominion.Card.Type.TREASURE + "'", type15.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName22.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName24.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + dominion.Card.Type.ACTION + "'", type31.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + dominion.Card.Type.ACTION + "'", type39.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + dominion.Card.Type.TREASURE + "'", type41.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card51);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + dominion.Card.Type.ACTION + "'", type52.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    org.junit.Assert.assertTrue("'" + cardName54 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName54.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card55);
    org.junit.Assert.assertTrue("'" + type56 + "' != '" + dominion.Card.Type.ACTION + "'", type56.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    player2.buyCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.playTreasureCard();

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Duchy;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card.CardName cardName9 = dominion.Card.CardName.Silver;
    dominion.Card card10 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName9);
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card12, cardName14);
    dominion.Card.Type type16 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card17 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card12, type16);
    dominion.Card.Type type18 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card17, type18);
    dominion.Card.CardName cardName20 = dominion.Card.CardName.Cooper;
    dominion.Card card21 = dominion.Card.getCard(list_card17, cardName20);
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName20);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.Card.CardName cardName26 = null;
    dominion.Card card27 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName26);
    dominion.Card.Type type28 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card29 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card24, type28);
    dominion.Card.CardName cardName30 = dominion.Card.CardName.Duchy;
    dominion.Card card31 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName30);
    dominion.Card.Type type32 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card24, type32);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.Type type39 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type39);
    dominion.Card.CardName cardName41 = dominion.Card.CardName.Duchy;
    dominion.Card card42 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName41);
    dominion.Card card43 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName41);
    dominion.Card[] card_array44 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card45 = new java.util.ArrayList<dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card45, card_array44);
    dominion.Card.CardName cardName47 = null;
    dominion.Card card48 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card45, cardName47);
    dominion.Card.Type type49 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card50 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card45, type49);
    dominion.Card.CardName cardName51 = dominion.Card.CardName.Duchy;
    dominion.Card card52 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card45, cardName51);
    dominion.Card.CardName cardName53 = dominion.Card.CardName.Silver;
    dominion.Card card54 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card45, cardName53);
    dominion.Card card55 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName53);
    dominion.Card[] card_array56 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card57 = new java.util.ArrayList<dominion.Card>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card57, card_array56);
    dominion.Card.CardName cardName59 = dominion.Card.CardName.Gold;
    dominion.Card card60 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card57, cardName59);
    dominion.Card card61 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName59);
    dominion.Card card62 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName7.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + dominion.Card.CardName.Silver + "'", cardName9.equals(dominion.Card.CardName.Silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + dominion.Card.Type.ACTION + "'", type16.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + dominion.Card.Type.VICTORY + "'", type18.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + dominion.Card.CardName.Cooper + "'", cardName20.equals(dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + dominion.Card.Type.ACTION + "'", type28.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName30.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.ACTION + "'", type32.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + dominion.Card.Type.ACTION + "'", type39.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + cardName41 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName41.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card48);
    org.junit.Assert.assertTrue("'" + type49 + "' != '" + dominion.Card.Type.ACTION + "'", type49.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    org.junit.Assert.assertTrue("'" + cardName51 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName51.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card52);
    org.junit.Assert.assertTrue("'" + cardName53 + "' != '" + dominion.Card.CardName.Silver + "'", cardName53.equals(dominion.Card.CardName.Silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    org.junit.Assert.assertTrue("'" + cardName59 + "' != '" + dominion.Card.CardName.Gold + "'", cardName59.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card62);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str6 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = player2.addToDeck(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    java.lang.String str5 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playTreasureCard();

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    dominion.Card card3 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Ambassador;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.Card.CardName cardName19 = null;
    dominion.Card card20 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card17, cardName19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type21);
    dominion.Card.Type type24 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.CardName cardName31 = dominion.Card.CardName.Ambassador;
    dominion.Card card32 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName31);
    dominion.Card.CardName cardName33 = dominion.Card.CardName.Embargo;
    dominion.Card card34 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName33);
    dominion.Card[] card_array35 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card36 = new java.util.ArrayList<dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card36, card_array35);
    dominion.Card.CardName cardName38 = null;
    dominion.Card card39 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card36, cardName38);
    dominion.Card.Type type40 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card41 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card36, type40);
    java.util.List<dominion.Card> list_card42 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type40);
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.Card.CardName cardName46 = null;
    dominion.Card card47 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card44, cardName46);
    dominion.Card.Type type48 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card44, type48);
    dominion.Card.Type type50 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card49, type50);
    java.util.List<dominion.Card> list_card52 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type50);
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card25, type50);
    dominion.Card[] card_array54 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card55 = new java.util.ArrayList<dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card55, card_array54);
    dominion.Card.CardName cardName57 = null;
    dominion.Card card58 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card55, cardName57);
    dominion.Card.Type type59 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card60 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card55, type59);
    java.util.List<dominion.Card> list_card61 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card53, type59);
    java.util.List<dominion.Card> list_card62 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.ACTION + "'", type7.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName14.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.TREASURE + "'", type24.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + cardName31 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName31.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName33.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + dominion.Card.Type.ACTION + "'", type40.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + dominion.Card.Type.ACTION + "'", type48.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    org.junit.Assert.assertTrue("'" + type50 + "' != '" + dominion.Card.Type.TREASURE + "'", type50.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card58);
    org.junit.Assert.assertTrue("'" + type59 + "' != '" + dominion.Card.Type.ACTION + "'", type59.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = dominion.Card.CardName.Gold;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.Card.CardName cardName17 = null;
    dominion.Card card18 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card15, cardName17);
    dominion.Card.Type type19 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card15, type19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card20, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type21);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type21);
    dominion.Card[] card_array25 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card26 = new java.util.ArrayList<dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card26, card_array25);
    dominion.Card.CardName cardName28 = null;
    dominion.Card card29 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName28);
    dominion.Card.Type type30 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card26, type30);
    dominion.Card.Type type32 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.CardName cardName39 = dominion.Card.CardName.Ambassador;
    dominion.Card card40 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName39);
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.Card.CardName cardName44 = null;
    dominion.Card card45 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card42, cardName44);
    dominion.Card.Type type46 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card42, type46);
    java.util.List<dominion.Card> list_card48 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type46);
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card33, type46);
    dominion.Card[] card_array50 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card51 = new java.util.ArrayList<dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card51, card_array50);
    dominion.Card.CardName cardName53 = null;
    dominion.Card card54 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card51, cardName53);
    dominion.Card.Type type55 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card51, type55);
    dominion.Card[] card_array57 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card58 = new java.util.ArrayList<dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card58, card_array57);
    dominion.Card.CardName cardName60 = null;
    dominion.Card card61 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card58, cardName60);
    dominion.Card.Type type62 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card63 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card58, type62);
    dominion.Card.CardName cardName64 = dominion.Card.CardName.Duchy;
    dominion.Card card65 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card58, cardName64);
    dominion.Card.Type type66 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card67 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card58, type66);
    java.util.List<dominion.Card> list_card68 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card51, type66);
    java.util.List<dominion.Card> list_card69 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card49, type66);
    java.util.List<dominion.Card> list_card70 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.TREASURE + "'", type7.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + dominion.Card.CardName.Gold + "'", cardName12.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + dominion.Card.Type.ACTION + "'", type19.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + dominion.Card.Type.ACTION + "'", type30.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.TREASURE + "'", type32.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + cardName39 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName39.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + dominion.Card.Type.ACTION + "'", type46.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card54);
    org.junit.Assert.assertTrue("'" + type55 + "' != '" + dominion.Card.Type.ACTION + "'", type55.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    org.junit.Assert.assertTrue("'" + type62 + "' != '" + dominion.Card.Type.ACTION + "'", type62.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + cardName64 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName64.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card65);
    org.junit.Assert.assertTrue("'" + type66 + "' != '" + dominion.Card.Type.ACTION + "'", type66.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    java.lang.Iterable<dominion.Card> iterable_card0 = null;
    dominion.Card[] card_array1 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card2 = new java.util.ArrayList<dominion.Card>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card2, card_array1);
    dominion.Card.CardName cardName4 = null;
    dominion.Card card5 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card2, cardName4);
    dominion.Card.Type type6 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card2, type6);
    dominion.Card.Type type8 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card9 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card7, type8);
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.Card.CardName cardName13 = null;
    dominion.Card card14 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card11, cardName13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Ambassador;
    dominion.Card card16 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card11, cardName15);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.Type type22 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type22);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card11, type22);
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card9, type22);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.Card.CardName cardName29 = null;
    dominion.Card card30 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card27, cardName29);
    dominion.Card.Type type31 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card32 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type31);
    dominion.Card[] card_array33 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card34 = new java.util.ArrayList<dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card34, card_array33);
    dominion.Card.CardName cardName36 = null;
    dominion.Card card37 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card34, cardName36);
    dominion.Card.Type type38 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card39 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card34, type38);
    dominion.Card.CardName cardName40 = dominion.Card.CardName.Duchy;
    dominion.Card card41 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card34, cardName40);
    dominion.Card.Type type42 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card34, type42);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type42);
    java.util.List<dominion.Card> list_card45 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card25, type42);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<dominion.Card> list_card46 = dominion.Card.filter(iterable_card0, type42);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.ACTION + "'", type6.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + dominion.Card.Type.TREASURE + "'", type8.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName15.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.ACTION + "'", type22.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + dominion.Card.Type.ACTION + "'", type31.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card37);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + dominion.Card.Type.ACTION + "'", type38.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    org.junit.Assert.assertTrue("'" + cardName40 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName40.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + dominion.Card.Type.ACTION + "'", type42.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str6 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = player2.addToDeck(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    java.util.List<dominion.Card> list_card0 = null;
    dominion.Card.CardName cardName1 = dominion.Card.CardName.Mine;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card2 = dominion.Card.getCard(list_card0, cardName1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + dominion.Card.CardName.Mine + "'", cardName1.equals(dominion.Card.CardName.Mine));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Embargo;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.Type type14 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type14);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.Type type22 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type22);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type22);
    dominion.Card[] card_array25 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card26 = new java.util.ArrayList<dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card26, card_array25);
    dominion.Card.CardName cardName28 = null;
    dominion.Card card29 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName28);
    dominion.Card.Type type30 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card26, type30);
    dominion.Card.CardName cardName32 = dominion.Card.CardName.Duchy;
    dominion.Card card33 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName32);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = null;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card.Type type39 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type39);
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.Card.CardName cardName44 = null;
    dominion.Card card45 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card42, cardName44);
    dominion.Card.Type type46 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card42, type46);
    dominion.Card.CardName cardName48 = dominion.Card.CardName.Duchy;
    dominion.Card card49 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card42, cardName48);
    dominion.Card.Type type50 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card42, type50);
    java.util.List<dominion.Card> list_card52 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type50);
    dominion.Card[] card_array53 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card54 = new java.util.ArrayList<dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card54, card_array53);
    dominion.Card.CardName cardName56 = null;
    dominion.Card card57 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card54, cardName56);
    dominion.Card.Type type58 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card59 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card54, type58);
    java.util.List<dominion.Card> list_card60 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type58);
    java.util.List<dominion.Card> list_card61 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card26, type58);
    java.util.List<dominion.Card> list_card62 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card24, type58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName7.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.ACTION + "'", type14.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.ACTION + "'", type22.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + dominion.Card.Type.ACTION + "'", type30.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + cardName32 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName32.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + dominion.Card.Type.ACTION + "'", type39.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + dominion.Card.Type.ACTION + "'", type46.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    org.junit.Assert.assertTrue("'" + cardName48 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName48.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card49);
    org.junit.Assert.assertTrue("'" + type50 + "' != '" + dominion.Card.Type.ACTION + "'", type50.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card57);
    org.junit.Assert.assertTrue("'" + type58 + "' != '" + dominion.Card.Type.ACTION + "'", type58.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Gold;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.Card.CardName cardName8 = null;
    dominion.Card card9 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card6, cardName8);
    dominion.Card.Type type10 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.Card.Type type12 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card11, type12);
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type12);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Gold;
    dominion.Card card16 = dominion.Card.getCard(list_card14, cardName15);
    dominion.Card.Type type17 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card18 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card14, type17);
    dominion.Card[] card_array19 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card20 = new java.util.ArrayList<dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card20, card_array19);
    dominion.Card.CardName cardName22 = null;
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card20, cardName22);
    dominion.Card.Type type24 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card20, type24);
    dominion.Card.CardName cardName26 = dominion.Card.CardName.Duchy;
    dominion.Card card27 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card20, cardName26);
    dominion.Card card28 = dominion.Card.getCard(list_card18, cardName26);
    dominion.Card.CardName cardName29 = dominion.Card.CardName.Mine;
    dominion.Card card30 = dominion.Card.getCard(list_card18, cardName29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + dominion.Card.CardName.Gold + "'", cardName3.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.ACTION + "'", type10.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + dominion.Card.Type.ACTION + "'", type12.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + dominion.Card.CardName.Gold + "'", cardName15.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + dominion.Card.Type.ACTION + "'", type17.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.ACTION + "'", type24.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName26.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card28);
    org.junit.Assert.assertTrue("'" + cardName29 + "' != '" + dominion.Card.CardName.Mine + "'", cardName29.equals(dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = player2.addToDeck(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Duchy;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.Type type14 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    dominion.Card.CardName cardName16 = dominion.Card.CardName.Duchy;
    dominion.Card card17 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName16);
    dominion.Card.Type type18 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type18);
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Estate;
    dominion.Card card22 = dominion.Card.getCard(list_card20, cardName21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName7.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.ACTION + "'", type14.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName16.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + dominion.Card.Type.ACTION + "'", type18.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + dominion.Card.CardName.Estate + "'", cardName21.equals(dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = player2.addToDeck(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.CardName cardName5 = dominion.Card.CardName.Ambassador;
    dominion.Card card6 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName5);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Embargo;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.Type type14 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type14);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.Card.CardName cardName20 = null;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card18, cardName20);
    dominion.Card.Type type22 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type22);
    dominion.Card.Type type24 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    java.util.List<dominion.Card> list_card26 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type24);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.Card.CardName cardName30 = null;
    dominion.Card card31 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card28, cardName30);
    dominion.Card.Type type32 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card28, type32);
    dominion.Card.Type type34 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card33, type34);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.Card.CardName cardName39 = null;
    dominion.Card card40 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card37, cardName39);
    dominion.Card.CardName cardName41 = dominion.Card.CardName.Ambassador;
    dominion.Card card42 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card37, cardName41);
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.Card.CardName cardName46 = null;
    dominion.Card card47 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card44, cardName46);
    dominion.Card.Type type48 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card44, type48);
    java.util.List<dominion.Card> list_card50 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card37, type48);
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card35, type48);
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.Card.CardName cardName55 = null;
    dominion.Card card56 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card53, cardName55);
    dominion.Card.Type type57 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card58 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card53, type57);
    dominion.Card.Type type59 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card60 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card58, type59);
    dominion.Card.CardName cardName61 = dominion.Card.CardName.Estate;
    dominion.Card card62 = dominion.Card.getCard(list_card60, cardName61);
    dominion.Card card63 = dominion.Card.getCard(list_card35, cardName61);
    dominion.Card card64 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName5.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName7.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.ACTION + "'", type14.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.ACTION + "'", type22.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.TREASURE + "'", type24.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.ACTION + "'", type32.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + dominion.Card.Type.TREASURE + "'", type34.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card40);
    org.junit.Assert.assertTrue("'" + cardName41 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName41.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + dominion.Card.Type.ACTION + "'", type48.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    org.junit.Assert.assertTrue("'" + type57 + "' != '" + dominion.Card.Type.ACTION + "'", type57.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    org.junit.Assert.assertTrue("'" + type59 + "' != '" + dominion.Card.Type.VICTORY + "'", type59.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    org.junit.Assert.assertTrue("'" + cardName61 + "' != '" + dominion.Card.CardName.Estate + "'", cardName61.equals(dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card64);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card[] card_array3 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card4 = new java.util.ArrayList<dominion.Card>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card4, card_array3);
    dominion.Card.CardName cardName6 = null;
    dominion.Card card7 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card4, cardName6);
    dominion.Card.Type type8 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card9 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card4, type8);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card9, type10);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.Card.CardName cardName15 = null;
    dominion.Card card16 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card13, cardName15);
    dominion.Card.CardName cardName17 = dominion.Card.CardName.Ambassador;
    dominion.Card card18 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card13, cardName17);
    dominion.Card[] card_array19 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card20 = new java.util.ArrayList<dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card20, card_array19);
    dominion.Card.CardName cardName22 = null;
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card20, cardName22);
    dominion.Card.Type type24 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card20, type24);
    java.util.List<dominion.Card> list_card26 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card13, type24);
    dominion.Card.Type type27 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card28 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card26, type27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.Card.CardName cardName32 = null;
    dominion.Card card33 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card30, cardName32);
    dominion.Card.CardName cardName34 = dominion.Card.CardName.Ambassador;
    dominion.Card card35 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card30, cardName34);
    dominion.Card.CardName cardName36 = dominion.Card.CardName.Embargo;
    dominion.Card card37 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card30, cardName36);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.Card.CardName cardName41 = null;
    dominion.Card card42 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card39, cardName41);
    dominion.Card.Type type43 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card39, type43);
    java.util.List<dominion.Card> list_card45 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type43);
    dominion.Card[] card_array46 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card47 = new java.util.ArrayList<dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card47, card_array46);
    dominion.Card.CardName cardName49 = null;
    dominion.Card card50 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card47, cardName49);
    dominion.Card.Type type51 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card52 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card47, type51);
    dominion.Card.Type type53 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card54 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card52, type53);
    java.util.List<dominion.Card> list_card55 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type53);
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card28, type53);
    dominion.Card.CardName cardName57 = dominion.Card.CardName.Adventurer;
    dominion.Card card58 = dominion.Card.getCard(list_card56, cardName57);
    dominion.Card card59 = dominion.Card.getCard(list_card9, cardName57);
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.Card.CardName cardName63 = null;
    dominion.Card card64 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card61, cardName63);
    dominion.Card.CardName cardName65 = dominion.Card.CardName.Ambassador;
    dominion.Card card66 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card61, cardName65);
    dominion.Card.CardName cardName67 = dominion.Card.CardName.Embargo;
    dominion.Card card68 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card61, cardName67);
    dominion.Card card69 = dominion.Card.getCard(list_card9, cardName67);
    dominion.Card card70 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + dominion.Card.Type.ACTION + "'", type8.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName17.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.ACTION + "'", type24.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + dominion.Card.Type.TREASURE + "'", type27.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card33);
    org.junit.Assert.assertTrue("'" + cardName34 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName34.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card35);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName36.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card42);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + dominion.Card.Type.ACTION + "'", type43.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card50);
    org.junit.Assert.assertTrue("'" + type51 + "' != '" + dominion.Card.Type.ACTION + "'", type51.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    org.junit.Assert.assertTrue("'" + type53 + "' != '" + dominion.Card.Type.TREASURE + "'", type53.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName57.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card64);
    org.junit.Assert.assertTrue("'" + cardName65 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName65.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card66);
    org.junit.Assert.assertTrue("'" + cardName67 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName67.equals(dominion.Card.CardName.Embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card70);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = player2.addToDeck(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str13 = player2.toString();
    java.lang.String str14 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str14.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = null;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.Card.Type type5 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card.Type type7 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card8 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card6, type7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = null;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Ambassador;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.Card.CardName cardName19 = null;
    dominion.Card card20 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card17, cardName19);
    dominion.Card.Type type21 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type21);
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type21);
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type21);
    dominion.Card[] card_array25 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card26 = new java.util.ArrayList<dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card26, card_array25);
    dominion.Card.CardName cardName28 = null;
    dominion.Card card29 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card26, cardName28);
    dominion.Card.Type type30 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card26, type30);
    dominion.Card.Type type32 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.Card.CardName cardName37 = dominion.Card.CardName.Gold;
    dominion.Card card38 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card35, cardName37);
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.Card.CardName cardName42 = null;
    dominion.Card card43 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card40, cardName42);
    dominion.Card.Type type44 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card45 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type44);
    dominion.Card.Type type46 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card45, type46);
    java.util.List<dominion.Card> list_card48 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card35, type46);
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type46);
    java.util.List<dominion.Card> list_card50 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.ACTION + "'", type5.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + dominion.Card.Type.TREASURE + "'", type7.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName14.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.ACTION + "'", type21.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + dominion.Card.Type.ACTION + "'", type30.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.TREASURE + "'", type32.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + dominion.Card.CardName.Gold + "'", cardName37.equals(dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card43);
    org.junit.Assert.assertTrue("'" + type44 + "' != '" + dominion.Card.Type.ACTION + "'", type44.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + dominion.Card.Type.ACTION + "'", type46.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);

  }

}
