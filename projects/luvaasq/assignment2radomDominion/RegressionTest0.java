
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Estate;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Estate + "'", cardName0.equals(dominion.Card.CardName.Estate));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Steward;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Steward + "'", cardName0.equals(dominion.Card.CardName.Steward));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Village;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Village + "'", cardName0.equals(dominion.Card.CardName.Village));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    int i1 = dominion.Randomness.nextRandomInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 44);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = dominion.Randomness.nextRandomInt((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Duchy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName0.equals(dominion.Card.CardName.Duchy));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    dominion.Player[] player_array0 = new dominion.Player[] {  };
    java.util.ArrayList<dominion.Player> arraylist_player1 = new java.util.ArrayList<dominion.Player>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player1, player_array0);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player3 = dominion.Randomness.randomMember((java.util.List<dominion.Player>)arraylist_player1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player5 = dominion.Randomness.randomMember(list_player4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Smithy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Smithy + "'", cardName0.equals(dominion.Card.CardName.Smithy));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    long long0 = dominion.Randomness.SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 0L);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.getWinners();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card8 = gameState3.getGameboard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Embargo;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName0.equals(dominion.Card.CardName.Embargo));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Gold;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Gold + "'", cardName0.equals(dominion.Card.CardName.Gold));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.CardName cardName6 = dominion.Card.CardName.Adventurer;
    dominion.Card card7 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName6.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Baron;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Baron + "'", cardName0.equals(dominion.Card.CardName.Baron));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    dominion.Randomness.totalCallsToRandom = (byte)100;

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    dominion.Randomness.totalCallsToRandom = (short)10;

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    dominion.Randomness.totalCallsToRandom = 0;

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card6 = dominion.Randomness.randomMember((java.util.List<dominion.Card>)arraylist_card1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = dominion.Randomness.nextRandomInt((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    dominion.Randomness.reset((long)(-1));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card card4 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card5 = gameState3.getGameboard(card4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    dominion.RandomTestDominion randomTestDominion0 = new dominion.RandomTestDominion();

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    boolean b8 = gameState3.isGameOver();
    // The following exception was thrown during execution in test generation
    try {
    dominion.GameState gameState9 = gameState3.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Silver;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Silver + "'", cardName0.equals(dominion.Card.CardName.Silver));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Mine;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Mine + "'", cardName0.equals(dominion.Card.CardName.Mine));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Province;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Province + "'", cardName0.equals(dominion.Card.CardName.Province));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    dominion.Randomness.reset(0L);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Feast;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Feast + "'", cardName0.equals(dominion.Card.CardName.Feast));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    dominion.Card card7 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card8 = gameState6.getGameboard(card7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    java.lang.String str21 = player19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str21.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    int i0 = dominion.Randomness.totalCallsToRandom;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.Type type6 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type6);
    dominion.Card.Type type8 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card9 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card7, type8);
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    dominion.Card.Type type14 = null;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card11, type14);
    dominion.Card.Type type16 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card17 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card11, type16);
    dominion.Card.Type type18 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card17, type18);
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card7, type18);
    java.util.List<dominion.Card> list_card22 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)list_card20, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.VICTORY + "'", type6.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + dominion.Card.Type.ACTION + "'", type8.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + dominion.Card.Type.VICTORY + "'", type16.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + dominion.Card.Type.ACTION + "'", type18.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    int i1 = dominion.Randomness.nextRandomInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    // The following exception was thrown during execution in test generation
    try {
    player19.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    java.lang.String str30 = gameState6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str30.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    int i1 = dominion.Randomness.nextRandomInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 49);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    player19.playTtreasureCard();
    player19.playTtreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player19.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Player player75 = dominion.Randomness.randomMember((java.util.List<dominion.Player>)arraylist_player72);
    // The following exception was thrown during execution in test generation
    try {
    player75.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player75);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    dominion.Card.Type type13 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card12, type13);
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type13);
    dominion.Card.CardName cardName16 = dominion.Card.CardName.Ambassador;
    int i17 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card5, cardName16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + dominion.Card.Type.TREASURE + "'", type13.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName16.equals(dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState10.embTokens;
    gameState6.embTokens = hashmap_card_i13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    player8.playKingdomCard();
    player8.printStateGame();
    player8.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    player8.printStateGame();
    player8.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    java.util.List<dominion.Player> list_player21 = gameState6.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player21);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i9);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.getWinners();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Copper;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Copper + "'", cardName0.equals(dominion.Card.CardName.Copper));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    dominion.Randomness.reset(100L);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    dominion.Randomness.reset((long)(byte)0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type34 = null;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type34);
    dominion.GameState gameState36 = new dominion.GameState(list_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.gameBoard;
    gameState6.gameBoard = hashmap_card_i37;
    java.lang.String str39 = gameState6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str39.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type34 = null;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type34);
    dominion.GameState gameState36 = new dominion.GameState(list_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.gameBoard;
    gameState6.gameBoard = hashmap_card_i37;
    dominion.GameState gameState39 = gameState6.clone();
    java.util.List<dominion.Player> list_player40 = null;
    gameState39.players = list_player40;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState39);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.Type type6 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type6);
    java.util.List<dominion.Card> list_card9 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)arraylist_card1, (java.lang.Integer)10);
    dominion.Card.CardName cardName10 = dominion.Card.CardName.Cutpurse;
    int i11 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)arraylist_card1, cardName10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.VICTORY + "'", type6.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + dominion.Card.CardName.Cutpurse + "'", cardName10.equals(dominion.Card.CardName.Cutpurse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    dominion.Player player10 = new dominion.Player(gameState3, "");
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card12);
    java.util.List<dominion.Player> list_player15 = gameState14.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState14.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState14.embTokens;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState24.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState24.gameBoard;
    gameState14.gameBoard = hashmap_card_i26;
    gameState3.embTokens = hashmap_card_i26;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    // The following exception was thrown during execution in test generation
    try {
    dominion.GameState gameState8 = gameState3.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type34 = null;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type34);
    dominion.GameState gameState36 = new dominion.GameState(list_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.gameBoard;
    gameState6.gameBoard = hashmap_card_i37;
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    dominion.Card.Type type43 = null;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type43);
    gameState6.cards = arraylist_card40;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    java.lang.Iterable<dominion.Card> iterable_card0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<dominion.Card> list_card2 = dominion.Card.checkPrice(iterable_card0, (java.lang.Integer)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    boolean b8 = gameState3.isGameOver();
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.play();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    java.util.List<dominion.Card> list_card8 = gameState6.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Player player10 = new dominion.Player(gameState6, "The board game is embty you need to intialize the game!!!!");
    player10.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    dominion.Card card11 = null;
    player8.discard(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    dominion.Randomness.totalCallsToRandom = ' ';

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i6 = gameState3.embTokens;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i6 = gameState3.embTokens;
    java.lang.String str7 = gameState3.toString();
    boolean b8 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str7.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.List<dominion.Card> list_card9 = gameState8.cards;
    java.util.List<dominion.Player> list_player10 = gameState8.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    dominion.Randomness.reset((long)1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.Type type6 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type6);
    dominion.Card.Type type8 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card9 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card7, type8);
    java.util.List<dominion.Card> list_card11 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)list_card9, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.VICTORY + "'", type6.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + dominion.Card.Type.ACTION + "'", type8.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    dominion.Player player10 = new dominion.Player(gameState3, "");
    player10.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Player player75 = dominion.Randomness.randomMember((java.util.List<dominion.Player>)arraylist_player72);
    player75.playKingdomCard();
    dominion.Card card77 = null;
    player75.trashCard(card77);
    player75.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player75);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.embTokens;
    java.util.List<dominion.Player> list_player9 = gameState3.players;
    dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card11 = gameState3.getGameboard(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player9);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Card[] card_array75 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card76 = new java.util.ArrayList<dominion.Card>();
    boolean b77 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card76, card_array75);
    dominion.GameState gameState78 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card76);
    dominion.Card.Type type79 = null;
    java.util.List<dominion.Card> list_card80 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card76, type79);
    dominion.Card.Type type81 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card82 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card76, type81);
    gameState6.cards = arraylist_card76;
    gameState6.initializeGame();
    dominion.Card card85 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card86 = gameState6.getGameboard(card85);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    org.junit.Assert.assertTrue("'" + type81 + "' != '" + dominion.Card.Type.VICTORY + "'", type81.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    int i1 = dominion.Randomness.nextRandomInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i6 = gameState3.embTokens;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i6);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Player> list_player12 = gameState11.players;
    java.util.List<dominion.Card> list_card13 = gameState11.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState11.embTokens;
    gameState6.embTokens = hashmap_card_i14;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState6.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    java.lang.String str8 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str8.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.getWinners();
    dominion.GameState gameState7 = gameState3.clone();
    dominion.Player player8 = null;
    gameState7.addPlayer(player8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState7);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    gameState3.initializeGame();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Player> list_player12 = gameState11.players;
    java.lang.String str13 = gameState11.toString();
    dominion.Player player14 = null;
    gameState11.addPlayer(player14);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState11.embTokens;
    java.util.List<dominion.Player> list_player17 = gameState11.players;
    gameState3.players = list_player17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str13.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.embTokens;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    gameState3.addPlayer(player17);
    boolean b19 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    player8.playKingdomCard();
    dominion.Card card12 = null;
    player8.discard(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Card[] card_array75 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card76 = new java.util.ArrayList<dominion.Card>();
    boolean b77 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card76, card_array75);
    dominion.GameState gameState78 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card76);
    dominion.Card.Type type79 = null;
    java.util.List<dominion.Card> list_card80 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card76, type79);
    dominion.Card.Type type81 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card82 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card76, type81);
    gameState6.cards = arraylist_card76;
    gameState6.initializeGame();
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i85 = gameState6.getWinners();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    org.junit.Assert.assertTrue("'" + type81 + "' != '" + dominion.Card.Type.VICTORY + "'", type81.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    gameState3.initializeGame();
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    gameState3.cards = list_card12;
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card.Type type18 = null;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card15, type18);
    dominion.Card.CardName cardName20 = dominion.Card.CardName.Curse;
    dominion.Card card21 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card15, cardName20);
    int i22 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card12, cardName20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + dominion.Card.CardName.Curse + "'", cardName20.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Player player75 = dominion.Randomness.randomMember((java.util.List<dominion.Player>)arraylist_player72);
    player75.playKingdomCard();
    dominion.Card card77 = null;
    player75.discard(card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player75);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    dominion.GameState gameState16 = new dominion.GameState(list_card13);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    dominion.Player player25 = new dominion.Player(gameState23, "");
    dominion.Card card26 = null;
    player25.discard(card26);
    player25.printStateGame();
    gameState16.addPlayer(player25);
    gameState6.addPlayer(player25);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    java.util.List<dominion.Player> list_player35 = gameState34.players;
    java.util.List<dominion.Card> list_card36 = gameState34.cards;
    boolean b37 = gameState34.isGameOver();
    gameState34.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState34.gameBoard;
    gameState6.gameBoard = hashmap_card_i39;
    dominion.Card card41 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card42 = gameState6.getGameboard(card41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    dominion.GameState gameState16 = new dominion.GameState(list_card13);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    dominion.Player player25 = new dominion.Player(gameState23, "");
    dominion.Card card26 = null;
    player25.discard(card26);
    player25.printStateGame();
    gameState16.addPlayer(player25);
    gameState6.addPlayer(player25);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.Card.Type type35 = null;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card32, type35);
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState37.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState37.gameBoard;
    dominion.Card[] card_array40 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card41 = new java.util.ArrayList<dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card41, card_array40);
    dominion.GameState gameState43 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card41);
    java.util.List<dominion.Player> list_player44 = gameState43.players;
    java.util.List<dominion.Card> list_card45 = gameState43.cards;
    java.lang.String str46 = gameState43.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = null;
    gameState43.gameBoard = hashmap_card_i47;
    dominion.Player player50 = new dominion.Player(gameState43, "");
    gameState37.addPlayer(player50);
    player50.playTtreasureCard();
    gameState6.addPlayer(player50);
    player50.buyCard();
    dominion.Card card55 = null;
    player50.discard(card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str46.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    player19.buyCard();
    player19.playKingdomCard();
    player19.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Player player75 = dominion.Randomness.randomMember((java.util.List<dominion.Player>)arraylist_player72);
    player75.playKingdomCard();
    player75.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player75);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    player8.playKingdomCard();
    player8.buyCard();
    player8.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.getWinners();
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    boolean b13 = gameState10.isGameOver();
    java.util.List<dominion.Player> list_player14 = gameState10.players;
    gameState3.players = list_player14;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player16 = dominion.Randomness.randomMember(list_player14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player14);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.embTokens;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    gameState3.addPlayer(player17);
    player17.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    dominion.Card card27 = null;
    player26.discard(card27);
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type33 = null;
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type33);
    dominion.GameState gameState35 = new dominion.GameState(list_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState35.gameBoard;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    java.lang.String str44 = gameState41.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = null;
    gameState41.gameBoard = hashmap_card_i45;
    dominion.Player player48 = new dominion.Player(gameState41, "");
    gameState35.addPlayer(player48);
    player48.playTtreasureCard();
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.Card.Type type55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card52, type55);
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Player player59 = new dominion.Player(gameState57, "");
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card.Type type64 = null;
    java.util.List<dominion.Card> list_card65 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card61, type64);
    dominion.GameState gameState66 = new dominion.GameState(list_card65);
    dominion.Player player68 = new dominion.Player(gameState66, "");
    dominion.Card card69 = null;
    player68.discard(card69);
    dominion.Player[] player_array71 = new dominion.Player[] { player17, player26, player48, player59, player68 };
    java.util.ArrayList<dominion.Player> arraylist_player72 = new java.util.ArrayList<dominion.Player>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player72, player_array71);
    gameState6.players = arraylist_player72;
    dominion.Player player75 = dominion.Randomness.randomMember((java.util.List<dominion.Player>)arraylist_player72);
    player75.playKingdomCard();
    player75.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str44.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player75);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState8.getWinners();
    gameState8.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    dominion.Randomness.reset((long)10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    dominion.Randomness.totalCallsToRandom = (byte)0;

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.Card.Type type15 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type15);
    dominion.Card.Type type17 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card18 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type17);
    gameState6.cards = list_card18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + dominion.Card.Type.VICTORY + "'", type15.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + dominion.Card.Type.ACTION + "'", type17.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    dominion.Randomness.totalCallsToRandom = 44;

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    dominion.Randomness.reset((long)'4');

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    gameState3.initializeGame();
    java.lang.String str8 = gameState3.toString();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState12.getWinners();
    dominion.Player player15 = null;
    gameState12.addPlayer(player15);
    boolean b17 = gameState12.isGameOver();
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.List<dominion.Player> list_player22 = gameState21.players;
    gameState12.players = list_player22;
    gameState3.players = list_player22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str8.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.CardName cardName6 = dominion.Card.CardName.Curse;
    dominion.Card card7 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName6);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + dominion.Card.CardName.Curse + "'", cardName6.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.CardName cardName6 = dominion.Card.CardName.Curse;
    dominion.Card card7 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName6);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card8 = dominion.Randomness.randomMember((java.util.List<dominion.Card>)arraylist_card1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + dominion.Card.CardName.Curse + "'", cardName6.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    player8.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    dominion.Card.Type type13 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card12, type13);
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type13);
    dominion.GameState gameState16 = new dominion.GameState(list_card5);
    dominion.Player player18 = new dominion.Player(gameState16, " ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + dominion.Card.Type.TREASURE + "'", type13.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    dominion.Card.Type type11 = null;
    java.util.List<dominion.Card> list_card12 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type11);
    dominion.GameState gameState13 = new dominion.GameState(list_card12);
    dominion.Player player15 = new dominion.Player(gameState13, "");
    dominion.Card card16 = null;
    player15.discard(card16);
    gameState3.addPlayer(player15);
    player15.buyCard();
    java.lang.String str20 = player15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.List<dominion.Card> list_card9 = gameState8.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState8.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    boolean b8 = gameState3.isGameOver();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.List<dominion.Player> list_player22 = gameState21.players;
    java.util.List<dominion.Card> list_card23 = gameState21.cards;
    java.lang.String str24 = gameState21.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = null;
    gameState21.gameBoard = hashmap_card_i25;
    dominion.Player player28 = new dominion.Player(gameState21, "");
    gameState15.addPlayer(player28);
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.List<dominion.Player> list_player34 = gameState33.players;
    java.util.List<dominion.Card> list_card35 = gameState33.cards;
    dominion.Card.CardName cardName36 = dominion.Card.CardName.Council_Room;
    int i37 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card35, cardName36);
    gameState15.cards = list_card35;
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    dominion.Card.Type type43 = null;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type43);
    dominion.GameState gameState45 = new dominion.GameState(list_card44);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.gameBoard;
    gameState15.gameBoard = hashmap_card_i46;
    gameState3.gameBoard = hashmap_card_i46;
    dominion.Card[] card_array49 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card50 = new java.util.ArrayList<dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card50, card_array49);
    dominion.GameState gameState52 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card50);
    java.util.List<dominion.Player> list_player53 = gameState52.players;
    java.lang.String str54 = gameState52.toString();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i55 = gameState52.getWinners();
    dominion.Card[] card_array56 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card57 = new java.util.ArrayList<dominion.Card>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card57, card_array56);
    dominion.GameState gameState59 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card57);
    java.util.List<dominion.Player> list_player60 = gameState59.players;
    java.util.List<dominion.Card> list_card61 = gameState59.cards;
    boolean b62 = gameState59.isGameOver();
    java.util.List<dominion.Player> list_player63 = gameState59.players;
    gameState52.players = list_player63;
    gameState3.players = list_player63;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player66 = dominion.Randomness.randomMember(list_player63);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str24.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName36.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str54.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player63);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    dominion.Randomness.reset((long)(byte)-1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    java.util.List<dominion.Card> list_card9 = gameState6.cards;
    java.util.List<dominion.Card> list_card10 = gameState6.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    boolean b8 = gameState3.isGameOver();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.List<dominion.Player> list_player22 = gameState21.players;
    java.util.List<dominion.Card> list_card23 = gameState21.cards;
    java.lang.String str24 = gameState21.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = null;
    gameState21.gameBoard = hashmap_card_i25;
    dominion.Player player28 = new dominion.Player(gameState21, "");
    gameState15.addPlayer(player28);
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.List<dominion.Player> list_player34 = gameState33.players;
    java.util.List<dominion.Card> list_card35 = gameState33.cards;
    dominion.Card.CardName cardName36 = dominion.Card.CardName.Council_Room;
    int i37 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card35, cardName36);
    gameState15.cards = list_card35;
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    dominion.Card.Type type43 = null;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type43);
    dominion.GameState gameState45 = new dominion.GameState(list_card44);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.gameBoard;
    gameState15.gameBoard = hashmap_card_i46;
    gameState3.gameBoard = hashmap_card_i46;
    boolean b49 = gameState3.isGameOver();
    boolean b50 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str24.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName36.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    boolean b8 = gameState3.isGameOver();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    boolean b15 = gameState12.isGameOver();
    gameState12.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState12.embTokens;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type22);
    dominion.GameState gameState24 = new dominion.GameState(list_card23);
    dominion.Player player26 = new dominion.Player(gameState24, "");
    gameState12.addPlayer(player26);
    gameState3.addPlayer(player26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState14.gameBoard;
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    java.util.List<dominion.Player> list_player20 = gameState19.players;
    java.util.List<dominion.Card> list_card21 = gameState19.cards;
    dominion.Card.Type type22 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card21, type22);
    gameState14.cards = list_card21;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState14.embTokens;
    gameState3.embTokens = hashmap_card_i25;
    java.util.List<dominion.Player> list_player27 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.TREASURE + "'", type22.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player27);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.getWinners();
    boolean b7 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.embTokens;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    java.util.Random random0 = dominion.Randomness.random;
    dominion.Randomness.random = random0;
    dominion.Randomness.random = random0;
    dominion.Randomness.random = random0;
    dominion.Randomness.random = random0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    dominion.Randomness.totalCallsToRandom = (short)100;

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    dominion.Randomness.totalCallsToRandom = '4';

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    dominion.Randomness.totalCallsToRandom = (byte)1;

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card7 = gameState3.getGameboard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    gameState3.initializeGame();
    java.util.List<dominion.Card> list_card10 = gameState3.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState3.embTokens;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.Type type6 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type6);
    dominion.Card.Type type8 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card9 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card7, type8);
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    dominion.Card.Type type14 = null;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card11, type14);
    dominion.Card.Type type16 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card17 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card11, type16);
    dominion.Card.Type type18 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card17, type18);
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card7, type18);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.Type type27 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card28 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card26, type27);
    dominion.GameState gameState29 = new dominion.GameState(list_card26);
    dominion.Card.CardName cardName30 = dominion.Card.CardName.Gardens;
    int i31 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName30);
    dominion.Card card32 = dominion.Card.getCard(list_card7, cardName30);
    java.util.List<dominion.Card> list_card34 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)list_card7, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.VICTORY + "'", type6.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + dominion.Card.Type.ACTION + "'", type8.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + dominion.Card.Type.VICTORY + "'", type16.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + dominion.Card.Type.ACTION + "'", type18.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + dominion.Card.Type.TREASURE + "'", type27.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + dominion.Card.CardName.Gardens + "'", cardName30.equals(dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    boolean b15 = gameState12.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState12.players;
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState23.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState23.gameBoard;
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card27);
    dominion.Card.Type type30 = null;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type30);
    dominion.GameState gameState32 = new dominion.GameState(list_card31);
    dominion.Player player34 = new dominion.Player(gameState32, "");
    dominion.Card[] card_array35 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card36 = new java.util.ArrayList<dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card36, card_array35);
    dominion.GameState gameState38 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card36);
    dominion.Card.Type type39 = null;
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card36, type39);
    dominion.GameState gameState41 = new dominion.GameState(list_card40);
    dominion.Player player43 = new dominion.Player(gameState41, "");
    dominion.Card card44 = null;
    player43.discard(card44);
    dominion.Card[] card_array46 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card47 = new java.util.ArrayList<dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card47, card_array46);
    dominion.GameState gameState49 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card47);
    dominion.Card.Type type50 = null;
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card47, type50);
    dominion.GameState gameState52 = new dominion.GameState(list_card51);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i53 = gameState52.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState52.gameBoard;
    dominion.Card[] card_array55 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card56 = new java.util.ArrayList<dominion.Card>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card56, card_array55);
    dominion.GameState gameState58 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card56);
    java.util.List<dominion.Player> list_player59 = gameState58.players;
    java.util.List<dominion.Card> list_card60 = gameState58.cards;
    java.lang.String str61 = gameState58.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i62 = null;
    gameState58.gameBoard = hashmap_card_i62;
    dominion.Player player65 = new dominion.Player(gameState58, "");
    gameState52.addPlayer(player65);
    player65.playTtreasureCard();
    dominion.Card[] card_array68 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card69 = new java.util.ArrayList<dominion.Card>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card69, card_array68);
    dominion.GameState gameState71 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card69);
    dominion.Card.Type type72 = null;
    java.util.List<dominion.Card> list_card73 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card69, type72);
    dominion.GameState gameState74 = new dominion.GameState(list_card73);
    dominion.Player player76 = new dominion.Player(gameState74, "");
    dominion.Card[] card_array77 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card78 = new java.util.ArrayList<dominion.Card>();
    boolean b79 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card78, card_array77);
    dominion.GameState gameState80 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card78);
    dominion.Card.Type type81 = null;
    java.util.List<dominion.Card> list_card82 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card78, type81);
    dominion.GameState gameState83 = new dominion.GameState(list_card82);
    dominion.Player player85 = new dominion.Player(gameState83, "");
    dominion.Card card86 = null;
    player85.discard(card86);
    dominion.Player[] player_array88 = new dominion.Player[] { player34, player43, player65, player76, player85 };
    java.util.ArrayList<dominion.Player> arraylist_player89 = new java.util.ArrayList<dominion.Player>();
    boolean b90 = java.util.Collections.addAll((java.util.Collection<dominion.Player>)arraylist_player89, player_array88);
    gameState23.players = arraylist_player89;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i92 = gameState23.gameBoard;
    gameState12.gameBoard = hashmap_card_i92;
    gameState3.embTokens = hashmap_card_i92;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str61.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i92);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.List<dominion.Card> list_card9 = gameState8.cards;
    java.util.List<dominion.Card> list_card11 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)list_card9, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    player19.playTtreasureCard();
    player19.playTtreasureCard();
    dominion.Card card23 = null;
    player19.trashCard(card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    player8.playKingdomCard();
    player8.buyCard();
    dominion.Card card13 = null;
    player8.discard(card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    dominion.Randomness.totalCallsToRandom = (short)1;

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.util.List<dominion.Player> list_player0 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player1 = dominion.Randomness.randomMember(list_player0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    dominion.GameState gameState16 = new dominion.GameState(list_card13);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    dominion.Player player25 = new dominion.Player(gameState23, "");
    dominion.Card card26 = null;
    player25.discard(card26);
    player25.printStateGame();
    gameState16.addPlayer(player25);
    gameState6.addPlayer(player25);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    java.util.List<dominion.Player> list_player35 = gameState34.players;
    java.util.List<dominion.Card> list_card36 = gameState34.cards;
    boolean b37 = gameState34.isGameOver();
    gameState34.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState34.gameBoard;
    gameState6.gameBoard = hashmap_card_i39;
    gameState6.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player5 = gameState4.players;
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.List<dominion.Player> list_player10 = gameState9.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState9.getWinners();
    dominion.GameState gameState12 = gameState9.clone();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embTokens;
    gameState4.gameBoard = hashmap_card_i13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.Type type6 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type6);
    java.util.List<dominion.Card> list_card9 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)arraylist_card1, (java.lang.Integer)10);
    dominion.Card.Type type10 = null;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type10);
    dominion.Card.CardName cardName12 = dominion.Card.CardName.Great_Hall;
    dominion.Card card13 = dominion.Card.getCard(list_card11, cardName12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Council_Room;
    int i15 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card11, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    dominion.Card.Type type20 = null;
    java.util.List<dominion.Card> list_card21 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type20);
    dominion.Card.Type type22 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type22);
    dominion.Card.Type type24 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card27);
    dominion.Card.Type type30 = null;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type30);
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card27, type32);
    dominion.Card.Type type34 = dominion.Card.Type.ACTION;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card33, type34);
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type34);
    dominion.Card[] card_array37 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card38 = new java.util.ArrayList<dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card38, card_array37);
    dominion.GameState gameState40 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card38);
    java.util.List<dominion.Player> list_player41 = gameState40.players;
    java.util.List<dominion.Card> list_card42 = gameState40.cards;
    dominion.Card.Type type43 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card42, type43);
    dominion.GameState gameState45 = new dominion.GameState(list_card42);
    dominion.Card.CardName cardName46 = dominion.Card.CardName.Gardens;
    int i47 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card42, cardName46);
    dominion.Card card48 = dominion.Card.getCard(list_card23, cardName46);
    int i49 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card11, cardName46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.VICTORY + "'", type6.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + dominion.Card.CardName.Great_Hall + "'", cardName12.equals(dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName14.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.VICTORY + "'", type22.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.ACTION + "'", type24.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + dominion.Card.Type.ACTION + "'", type34.equals(dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + dominion.Card.Type.TREASURE + "'", type43.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + cardName46 + "' != '" + dominion.Card.CardName.Gardens + "'", cardName46.equals(dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    gameState3.initializeGame();
    java.util.List<dominion.Player> list_player8 = gameState3.players;
    dominion.Card card9 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card10 = gameState3.getGameboard(card9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player8);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    dominion.GameState gameState16 = new dominion.GameState(list_card13);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    dominion.Player player25 = new dominion.Player(gameState23, "");
    dominion.Card card26 = null;
    player25.discard(card26);
    player25.printStateGame();
    gameState16.addPlayer(player25);
    gameState6.addPlayer(player25);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.Card.Type type35 = null;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card32, type35);
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState37.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState37.gameBoard;
    dominion.Card[] card_array40 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card41 = new java.util.ArrayList<dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card41, card_array40);
    dominion.GameState gameState43 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card41);
    java.util.List<dominion.Player> list_player44 = gameState43.players;
    java.util.List<dominion.Card> list_card45 = gameState43.cards;
    java.lang.String str46 = gameState43.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = null;
    gameState43.gameBoard = hashmap_card_i47;
    dominion.Player player50 = new dominion.Player(gameState43, "");
    gameState37.addPlayer(player50);
    player50.playTtreasureCard();
    gameState6.addPlayer(player50);
    player50.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player50.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str46.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    gameState3.initializeGame();
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    gameState3.cards = list_card12;
    java.util.List<dominion.Card> list_card15 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)list_card12, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.CardName cardName6 = null;
    dominion.Card card7 = dominion.Card.getCard(list_card5, cardName6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card card18 = null;
    player17.discard(card18);
    player17.printStateGame();
    gameState8.addPlayer(player17);
    java.util.List<dominion.Card> list_card22 = gameState8.cards;
    java.util.List<dominion.Card> list_card24 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)list_card22, (java.lang.Integer)49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    gameState3.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.embTokens;
    java.util.List<dominion.Player> list_player11 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState8.getWinners();
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card12);
    java.util.List<dominion.Player> list_player15 = gameState14.players;
    java.util.List<dominion.Card> list_card16 = gameState14.cards;
    boolean b17 = gameState14.isGameOver();
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.List<dominion.Player> list_player22 = gameState21.players;
    java.util.List<dominion.Card> list_card23 = gameState21.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState21.embTokens;
    gameState14.gameBoard = hashmap_card_i24;
    gameState8.embTokens = hashmap_card_i24;
    java.util.List<dominion.Player> list_player27 = gameState8.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player27);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.CardName cardName6 = null;
    dominion.Card card7 = dominion.Card.getCard(list_card5, cardName6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    dominion.Player player17 = new dominion.Player(gameState15, "");
    dominion.Card card18 = null;
    player17.discard(card18);
    player17.printStateGame();
    gameState8.addPlayer(player17);
    java.util.List<dominion.Card> list_card22 = gameState8.cards;
    boolean b23 = gameState8.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    boolean b8 = gameState3.isGameOver();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type13);
    dominion.GameState gameState15 = new dominion.GameState(list_card14);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.List<dominion.Player> list_player22 = gameState21.players;
    java.util.List<dominion.Card> list_card23 = gameState21.cards;
    java.lang.String str24 = gameState21.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = null;
    gameState21.gameBoard = hashmap_card_i25;
    dominion.Player player28 = new dominion.Player(gameState21, "");
    gameState15.addPlayer(player28);
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.List<dominion.Player> list_player34 = gameState33.players;
    java.util.List<dominion.Card> list_card35 = gameState33.cards;
    dominion.Card.CardName cardName36 = dominion.Card.CardName.Council_Room;
    int i37 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card35, cardName36);
    gameState15.cards = list_card35;
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    dominion.Card.Type type43 = null;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type43);
    dominion.GameState gameState45 = new dominion.GameState(list_card44);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.gameBoard;
    gameState15.gameBoard = hashmap_card_i46;
    gameState3.gameBoard = hashmap_card_i46;
    boolean b49 = gameState3.isGameOver();
    java.lang.String str50 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str24.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName36.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str50.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player7 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    dominion.GameState gameState16 = new dominion.GameState(list_card13);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    dominion.Player player25 = new dominion.Player(gameState23, "");
    dominion.Card card26 = null;
    player25.discard(card26);
    player25.printStateGame();
    gameState16.addPlayer(player25);
    gameState6.addPlayer(player25);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.Card.Type type35 = null;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card32, type35);
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState37.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState37.gameBoard;
    dominion.Card[] card_array40 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card41 = new java.util.ArrayList<dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card41, card_array40);
    dominion.GameState gameState43 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card41);
    java.util.List<dominion.Player> list_player44 = gameState43.players;
    java.util.List<dominion.Card> list_card45 = gameState43.cards;
    java.lang.String str46 = gameState43.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = null;
    gameState43.gameBoard = hashmap_card_i47;
    dominion.Player player50 = new dominion.Player(gameState43, "");
    gameState37.addPlayer(player50);
    player50.playTtreasureCard();
    gameState6.addPlayer(player50);
    player50.buyCard();
    player50.buyCard();
    java.lang.String str56 = player50.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str46.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str56.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    player19.playTtreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player19.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    java.util.List<dominion.Player> list_player8 = gameState6.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player8);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    java.lang.String str6 = gameState3.toString();
    gameState3.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    dominion.Card card9 = null;
    player8.discard(card9);
    java.lang.String str11 = player8.toString();
    java.lang.String str12 = player8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str11.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str12.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i6 = gameState3.embTokens;
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    dominion.Card.Type type11 = null;
    java.util.List<dominion.Card> list_card12 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type11);
    dominion.GameState gameState13 = new dominion.GameState(list_card12);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState13.gameBoard;
    gameState3.gameBoard = hashmap_card_i15;
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState23.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState23.gameBoard;
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card27);
    java.util.List<dominion.Player> list_player30 = gameState29.players;
    java.util.List<dominion.Card> list_card31 = gameState29.cards;
    java.lang.String str32 = gameState29.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i33 = null;
    gameState29.gameBoard = hashmap_card_i33;
    dominion.Player player36 = new dominion.Player(gameState29, "");
    gameState23.addPlayer(player36);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Player> list_player42 = gameState41.players;
    java.util.List<dominion.Card> list_card43 = gameState41.cards;
    dominion.Card.CardName cardName44 = dominion.Card.CardName.Council_Room;
    int i45 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card43, cardName44);
    gameState23.cards = list_card43;
    dominion.Card[] card_array47 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card48 = new java.util.ArrayList<dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card48, card_array47);
    dominion.GameState gameState50 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card48);
    dominion.Card.Type type51 = null;
    java.util.List<dominion.Card> list_card52 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card48, type51);
    dominion.GameState gameState53 = new dominion.GameState(list_card52);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState53.gameBoard;
    gameState23.gameBoard = hashmap_card_i54;
    gameState3.gameBoard = hashmap_card_i54;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str32.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName44.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i54);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    gameState6.initializeGame();
    boolean b8 = gameState6.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.getWinners();
    boolean b7 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i6 = gameState3.embTokens;
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    dominion.Card.Type type11 = null;
    java.util.List<dominion.Card> list_card12 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card8, type11);
    gameState3.cards = arraylist_card8;
    java.util.List<dominion.Card> list_card14 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.gameBoard;
    boolean b9 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.lang.String str5 = gameState3.toString();
    dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    boolean b8 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str5.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    dominion.Player player8 = new dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Player player8 = new dominion.Player(gameState6, "");
    java.lang.String str9 = player8.toString();
    player8.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str9.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.Card.Type type6 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type6);
    java.util.List<dominion.Card> list_card9 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)arraylist_card1, (java.lang.Integer)10);
    dominion.Card.Type type10 = null;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type10);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    dominion.Card.Type type16 = null;
    java.util.List<dominion.Card> list_card17 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card13, type16);
    dominion.Card.Type type18 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card19 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card13, type18);
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.VICTORY + "'", type6.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + dominion.Card.Type.VICTORY + "'", type18.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    dominion.Card.Type type9 = null;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.List<dominion.Player> list_player11 = gameState10.players;
    java.util.List<dominion.Card> list_card12 = gameState10.cards;
    dominion.Card.Type type13 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card14 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card12, type13);
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type13);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    dominion.Card.Type type20 = null;
    java.util.List<dominion.Card> list_card21 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type20);
    dominion.Card.Type type22 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card23 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type22);
    java.util.List<dominion.Card> list_card25 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)arraylist_card17, (java.lang.Integer)10);
    dominion.Card.Type type26 = null;
    java.util.List<dominion.Card> list_card27 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type26);
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.GameState gameState31 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    dominion.Card.Type type32 = null;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card29, type32);
    dominion.GameState gameState34 = new dominion.GameState(list_card33);
    dominion.Card[] card_array35 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card36 = new java.util.ArrayList<dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card36, card_array35);
    dominion.GameState gameState38 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card36);
    java.util.List<dominion.Player> list_player39 = gameState38.players;
    java.util.List<dominion.Card> list_card40 = gameState38.cards;
    dominion.Card.Type type41 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card42 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card40, type41);
    java.util.List<dominion.Card> list_card43 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card33, type41);
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card27, type41);
    java.util.List<dominion.Card> list_card45 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type41);
    dominion.Card.CardName cardName46 = dominion.Card.CardName.Adventurer;
    dominion.Card card47 = dominion.Card.getCard(list_card45, cardName46);
    dominion.GameState gameState48 = new dominion.GameState(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + dominion.Card.Type.TREASURE + "'", type13.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + dominion.Card.Type.VICTORY + "'", type22.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);
    
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
    org.junit.Assert.assertNotNull(list_card45);
    org.junit.Assert.assertTrue("'" + cardName46 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName46.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card9 = gameState3.getGameboard(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type34 = null;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type34);
    dominion.GameState gameState36 = new dominion.GameState(list_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.gameBoard;
    gameState6.gameBoard = hashmap_card_i37;
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    dominion.Card.Type type43 = null;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type43);
    dominion.GameState gameState45 = new dominion.GameState(list_card44);
    dominion.Player player47 = new dominion.Player(gameState45, "");
    dominion.Card card48 = null;
    player47.discard(card48);
    java.lang.String str50 = player47.toString();
    gameState6.addPlayer(player47);
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.GameState gameState55 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card53);
    dominion.Card.Type type56 = null;
    java.util.List<dominion.Card> list_card57 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card53, type56);
    dominion.GameState gameState58 = new dominion.GameState(list_card57);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i59 = gameState58.gameBoard;
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    java.util.List<dominion.Player> list_player64 = gameState63.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i65 = gameState63.getWinners();
    dominion.Player player66 = null;
    gameState63.addPlayer(player66);
    boolean b68 = gameState63.isGameOver();
    dominion.Card[] card_array69 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card70 = new java.util.ArrayList<dominion.Card>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card70, card_array69);
    dominion.GameState gameState72 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card70);
    dominion.Card.Type type73 = null;
    java.util.List<dominion.Card> list_card74 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card70, type73);
    dominion.GameState gameState75 = new dominion.GameState(list_card74);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i76 = gameState75.gameBoard;
    gameState63.gameBoard = hashmap_card_i76;
    gameState58.gameBoard = hashmap_card_i76;
    gameState6.embTokens = hashmap_card_i76;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i80 = gameState6.embTokens;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str50.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i80);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.util.List<dominion.Card> list_card6 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    player19.buyCard();
    player19.playKingdomCard();
    player19.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    java.lang.String str7 = gameState3.toString();
    boolean b8 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str7.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState8.getWinners();
    dominion.GameState gameState11 = gameState8.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState11);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState3.gameBoard = hashmap_card_i7;
    dominion.Player player10 = new dominion.Player(gameState3, "");
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card12);
    java.util.List<dominion.Player> list_player15 = gameState14.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState14.getWinners();
    dominion.GameState gameState17 = gameState14.clone();
    java.lang.String str18 = gameState14.toString();
    gameState14.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState14.embTokens;
    gameState3.embTokens = hashmap_card_i20;
    dominion.Card[] card_array22 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card23 = new java.util.ArrayList<dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card23, card_array22);
    dominion.GameState gameState25 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card23);
    dominion.Card.Type type26 = null;
    java.util.List<dominion.Card> list_card27 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card23, type26);
    dominion.GameState gameState28 = new dominion.GameState(list_card27);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i29 = gameState28.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i30 = gameState28.gameBoard;
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    java.util.List<dominion.Player> list_player35 = gameState34.players;
    java.util.List<dominion.Card> list_card36 = gameState34.cards;
    java.lang.String str37 = gameState34.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = null;
    gameState34.gameBoard = hashmap_card_i38;
    dominion.Player player41 = new dominion.Player(gameState34, "");
    gameState28.addPlayer(player41);
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.GameState gameState46 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card44);
    java.util.List<dominion.Player> list_player47 = gameState46.players;
    java.util.List<dominion.Card> list_card48 = gameState46.cards;
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Council_Room;
    int i50 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card48, cardName49);
    gameState28.cards = list_card48;
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.GameState gameState55 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card53);
    dominion.Card.Type type56 = null;
    java.util.List<dominion.Card> list_card57 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card53, type56);
    dominion.GameState gameState58 = new dominion.GameState(list_card57);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i59 = gameState58.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i60 = gameState58.gameBoard;
    dominion.Card[] card_array61 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card62 = new java.util.ArrayList<dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card62, card_array61);
    dominion.GameState gameState64 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card62);
    java.util.List<dominion.Player> list_player65 = gameState64.players;
    java.util.List<dominion.Card> list_card66 = gameState64.cards;
    java.lang.String str67 = gameState64.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i68 = null;
    gameState64.gameBoard = hashmap_card_i68;
    dominion.Player player71 = new dominion.Player(gameState64, "");
    gameState58.addPlayer(player71);
    player71.playTtreasureCard();
    player71.buyCard();
    gameState28.addPlayer(player71);
    player71.playTtreasureCard();
    gameState3.addPlayer(player71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str18.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str37.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    org.junit.Assert.assertTrue("'" + cardName49 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName49.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str67.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    dominion.Card.Type type6 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card7 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card5, type6);
    dominion.GameState gameState8 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.play();
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.List<dominion.Player> list_player14 = gameState13.players;
    java.util.List<dominion.Card> list_card15 = gameState13.cards;
    dominion.Card.Type type16 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card17 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card15, type16);
    dominion.GameState gameState18 = new dominion.GameState(list_card15);
    gameState8.cards = list_card15;
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    dominion.Card.Type type24 = null;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card21, type24);
    dominion.Card.Type type26 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card27 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card21, type26);
    java.util.List<dominion.Card> list_card29 = dominion.Card.checkPrice((java.lang.Iterable<dominion.Card>)arraylist_card21, (java.lang.Integer)10);
    dominion.Card.Type type30 = null;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card21, type30);
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    dominion.Card.Type type36 = null;
    java.util.List<dominion.Card> list_card37 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card33, type36);
    dominion.GameState gameState38 = new dominion.GameState(list_card37);
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    java.util.List<dominion.Player> list_player43 = gameState42.players;
    java.util.List<dominion.Card> list_card44 = gameState42.cards;
    dominion.Card.Type type45 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card46 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card44, type45);
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card37, type45);
    java.util.List<dominion.Card> list_card48 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type45);
    gameState8.cards = list_card31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + dominion.Card.Type.TREASURE + "'", type6.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + dominion.Card.Type.TREASURE + "'", type16.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + dominion.Card.Type.VICTORY + "'", type26.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + dominion.Card.Type.TREASURE + "'", type45.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type34 = null;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type34);
    dominion.GameState gameState36 = new dominion.GameState(list_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.gameBoard;
    gameState6.gameBoard = hashmap_card_i37;
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    dominion.Card.Type type43 = null;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card40, type43);
    dominion.GameState gameState45 = new dominion.GameState(list_card44);
    dominion.Player player47 = new dominion.Player(gameState45, "");
    dominion.Card card48 = null;
    player47.discard(card48);
    java.lang.String str50 = player47.toString();
    gameState6.addPlayer(player47);
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.GameState gameState55 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card53);
    dominion.Card.Type type56 = null;
    java.util.List<dominion.Card> list_card57 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card53, type56);
    dominion.GameState gameState58 = new dominion.GameState(list_card57);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i59 = gameState58.gameBoard;
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    java.util.List<dominion.Player> list_player64 = gameState63.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i65 = gameState63.getWinners();
    dominion.Player player66 = null;
    gameState63.addPlayer(player66);
    boolean b68 = gameState63.isGameOver();
    dominion.Card[] card_array69 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card70 = new java.util.ArrayList<dominion.Card>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card70, card_array69);
    dominion.GameState gameState72 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card70);
    dominion.Card.Type type73 = null;
    java.util.List<dominion.Card> list_card74 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card70, type73);
    dominion.GameState gameState75 = new dominion.GameState(list_card74);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i76 = gameState75.gameBoard;
    gameState63.gameBoard = hashmap_card_i76;
    gameState58.gameBoard = hashmap_card_i76;
    gameState6.embTokens = hashmap_card_i76;
    dominion.GameState gameState80 = gameState6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str50.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState80);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.List<dominion.Card> list_card5 = gameState3.cards;
    boolean b6 = gameState3.isGameOver();
    gameState3.initializeGame();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Player> list_player12 = gameState11.players;
    java.util.List<dominion.Card> list_card13 = gameState11.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState11.embTokens;
    gameState3.embTokens = hashmap_card_i14;
    java.lang.String str16 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str16.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.List<dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    dominion.GameState gameState6 = gameState3.clone();
    boolean b7 = gameState6.isGameOver();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.Card.Type type12 = null;
    java.util.List<dominion.Card> list_card13 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card9, type12);
    dominion.Card.CardName cardName14 = null;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    dominion.GameState gameState16 = new dominion.GameState(list_card13);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card.Type type21 = null;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card18, type21);
    dominion.GameState gameState23 = new dominion.GameState(list_card22);
    dominion.Player player25 = new dominion.Player(gameState23, "");
    dominion.Card card26 = null;
    player25.discard(card26);
    player25.printStateGame();
    gameState16.addPlayer(player25);
    gameState6.addPlayer(player25);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.Card.Type type35 = null;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card32, type35);
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState37.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState37.gameBoard;
    dominion.Card[] card_array40 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card41 = new java.util.ArrayList<dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card41, card_array40);
    dominion.GameState gameState43 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card41);
    java.util.List<dominion.Player> list_player44 = gameState43.players;
    java.util.List<dominion.Card> list_card45 = gameState43.cards;
    java.lang.String str46 = gameState43.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = null;
    gameState43.gameBoard = hashmap_card_i47;
    dominion.Player player50 = new dominion.Player(gameState43, "");
    gameState37.addPlayer(player50);
    player50.playTtreasureCard();
    gameState6.addPlayer(player50);
    player50.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str46.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type4 = null;
    java.util.List<dominion.Card> list_card5 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type4);
    dominion.GameState gameState6 = new dominion.GameState(list_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState6.gameBoard;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.List<dominion.Player> list_player13 = gameState12.players;
    java.util.List<dominion.Card> list_card14 = gameState12.cards;
    java.lang.String str15 = gameState12.toString();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState12.gameBoard = hashmap_card_i16;
    dominion.Player player19 = new dominion.Player(gameState12, "");
    gameState6.addPlayer(player19);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.List<dominion.Player> list_player25 = gameState24.players;
    java.util.List<dominion.Card> list_card26 = gameState24.cards;
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Council_Room;
    int i28 = dominion.Card.filterQTY((java.lang.Iterable<dominion.Card>)list_card26, cardName27);
    gameState6.cards = list_card26;
    dominion.GameState gameState30 = gameState6.clone();
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.Card.Type type35 = null;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card32, type35);
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    dominion.Player player39 = new dominion.Player(gameState37, "");
    dominion.Player player41 = new dominion.Player(gameState37, "The board game is embty you need to intialize the game!!!!");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState37.embTokens;
    gameState6.gameBoard = hashmap_card_i42;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName27.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);

  }

}
