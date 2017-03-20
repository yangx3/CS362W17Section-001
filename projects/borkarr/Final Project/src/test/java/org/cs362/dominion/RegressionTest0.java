
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    long long0 = dominion.Randomness.SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 0L);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Estate;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Estate + "'", cardName0.equals(dominion.Card.CardName.Estate));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    int i0 = dominion.Randomness.totalCallsToRandom;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    player2.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Embargo;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Embargo + "'", cardName0.equals(dominion.Card.CardName.Embargo));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Ambassador;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Ambassador + "'", cardName0.equals(dominion.Card.CardName.Ambassador));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Gold;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Gold + "'", cardName0.equals(dominion.Card.CardName.Gold));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Silver;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Silver + "'", cardName0.equals(dominion.Card.CardName.Silver));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Baron;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Baron + "'", cardName0.equals(dominion.Card.CardName.Baron));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card7 = gameState3.boardTakeCard(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Feast;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Feast + "'", cardName0.equals(dominion.Card.CardName.Feast));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    dominion.Card.Type type0 = dominion.Card.Type.ACTION;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + dominion.Card.Type.ACTION + "'", type0.equals(dominion.Card.Type.ACTION));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Village;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Village + "'", cardName0.equals(dominion.Card.CardName.Village));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card6 = gameState3.boardTakeCard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    gameState3.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    gameState3.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Province;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Province + "'", cardName0.equals(dominion.Card.CardName.Province));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    dominion.Randomness.totalCallsToRandom = '4';

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    java.util.Random random0 = null;
    dominion.Randomness.random = random0;

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Cooper;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Cooper + "'", cardName0.equals(dominion.Card.CardName.Cooper));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState3.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player7 = dominion.Randomness.randomMember(list_player6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Card card12 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card13 = gameState3.boardTakeCard(card12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    dominion.Randomness.reset(100L);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.GameState gameState13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card11, 0, gameState13);
    gameState3.cards = list_card11;
    dominion.Card card16 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card17 = gameState3.boardTakeCard(card16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    dominion.Card card7 = null;
    player6.discard(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.CardName cardName4 = dominion.Card.CardName.Salvager;
    dominion.Card card5 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + dominion.Card.CardName.Salvager + "'", cardName4.equals(dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card5);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player18 = dominion.Randomness.randomMember(list_player16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.lang.String str7 = player6.toString();
    dominion.Card card8 = null;
    player6.discard(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str7.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = dominion.Randomness.nextRandomInt((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    dominion.Card card4 = null;
    player2.discard(card4);
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str3.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    player6.buyCard();
    player6.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    dominion.Randomness.totalCallsToRandom = 1;

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card11 = dominion.Randomness.randomMember(list_card10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    dominion.GameState gameState13 = gameState3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState13);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    player2.playTtreasureCard();

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    dominion.Card card13 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card14 = gameState3.boardTakeCard(card13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str3.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    dominion.Randomness.reset((long)' ');

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    dominion.Randomness.reset((long)'a');

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    dominion.Card.CardName cardName0 = dominion.Card.CardName.Great_Hall;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + dominion.Card.CardName.Great_Hall + "'", cardName0.equals(dominion.Card.CardName.Great_Hall));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    dominion.Randomness.totalCallsToRandom = '#';

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    dominion.Randomness.reset(10L);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = null;
    gameState3.cards = list_card8;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState3.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState3.embargos;
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = gameState3.isGameOver();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player11.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = dominion.Randomness.nextRandomInt(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    gameState26.gameBoard = hashmap_card_i31;
    dominion.Card[] card_array33 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card34 = new java.util.ArrayList<dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card34, card_array33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.embargos;
    boolean b38 = gameState36.isGameOver();
    java.util.List<dominion.Player> list_player39 = gameState36.players;
    gameState26.players = list_player39;
    gameState15.players = list_player39;
    boolean b42 = gameState15.isGameOver();
    dominion.Card card43 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card44 = gameState15.boardTakeCard(card43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    player11.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.gameBoard;
    gameState4.embargos = hashmap_card_i9;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState4.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card11 = dominion.Randomness.randomMember(list_card8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.List<dominion.Player> list_player34 = gameState12.players;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState12.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Curse;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName14);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState19.embargos;
    dominion.Player player22 = new dominion.Player(gameState19, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState19.getWinners();
    java.util.List<dominion.Card> list_card24 = gameState19.cards;
    dominion.Card.Type type25 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card26 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card24, type25);
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.GameState gameState31 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState31.embargos;
    dominion.GameState gameState33 = null;
    dominion.Player player35 = new dominion.Player(gameState33, "hi!");
    java.lang.String str36 = player35.toString();
    gameState31.addPlayer(player35);
    java.util.List<dominion.Card> list_card38 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card24, (int)(byte)10, gameState31);
    dominion.Card[] card_array39 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card40 = new java.util.ArrayList<dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card40, card_array39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card40);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i43 = gameState42.embargos;
    dominion.Player player45 = new dominion.Player(gameState42, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i46 = gameState42.getWinners();
    java.util.List<dominion.Card> list_card47 = gameState42.cards;
    dominion.Card.Type type48 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card47, type48);
    java.util.List<dominion.Card> list_card50 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card38, type48);
    java.util.List<dominion.Card> list_card51 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Curse + "'", cardName14.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + dominion.Card.Type.VICTORY + "'", type25.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str36.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + dominion.Card.Type.VICTORY + "'", type48.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.GameState gameState7 = new dominion.GameState(list_card6);
    gameState7.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    dominion.Randomness.totalCallsToRandom = (short)0;

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.GameState gameState8 = null;
    java.util.List<dominion.Card> list_card9 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card6, 0, gameState8);
    dominion.Card.CardName cardName10 = dominion.Card.CardName.Council_Room;
    dominion.Card card11 = dominion.Card.getCard(list_card6, cardName10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName10.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = dominion.Randomness.nextRandomInt((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    dominion.Randomness.totalCallsToRandom = 10;

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.GameState gameState5 = null;
    dominion.Player player7 = new dominion.Player(gameState5, "hi!");
    java.lang.String str8 = player7.toString();
    gameState3.addPlayer(player7);
    player7.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str8.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    gameState26.gameBoard = hashmap_card_i31;
    dominion.Card[] card_array33 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card34 = new java.util.ArrayList<dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card34, card_array33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.embargos;
    boolean b38 = gameState36.isGameOver();
    java.util.List<dominion.Player> list_player39 = gameState36.players;
    gameState26.players = list_player39;
    gameState15.players = list_player39;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player42 = dominion.Randomness.randomMember(list_player39);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    dominion.Randomness.reset((long)(byte)100);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.GameState gameState13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card11, 0, gameState13);
    gameState3.cards = list_card11;
    java.util.List<dominion.Player> list_player16 = gameState3.players;
    java.util.List<dominion.Card> list_card17 = null;
    gameState3.cards = list_card17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.play();
    java.lang.String str6 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.GameState gameState7 = new dominion.GameState(list_card6);
    dominion.Card.CardName cardName8 = dominion.Card.CardName.Cutpurse;
    dominion.Card card9 = dominion.Card.getCard(list_card6, cardName8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + dominion.Card.CardName.Cutpurse + "'", cardName8.equals(dominion.Card.CardName.Cutpurse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.play();
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    dominion.Card.Type type15 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card16 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card11, type15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState22 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.List<dominion.Card> list_card23 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card11, (int)(short)1, gameState22);
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.GameState gameState31 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState31.embargos;
    gameState27.gameBoard = hashmap_card_i32;
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.GameState gameState37 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState37.embargos;
    boolean b39 = gameState37.isGameOver();
    java.util.List<dominion.Player> list_player40 = gameState37.players;
    gameState27.players = list_player40;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState27.gameBoard;
    gameState22.embargos = hashmap_card_i42;
    dominion.Card[] card_array44 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card45 = new java.util.ArrayList<dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card45, card_array44);
    dominion.GameState gameState47 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card45);
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    gameState47.gameBoard = hashmap_card_i52;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState47.gameBoard;
    gameState22.gameBoard = hashmap_card_i54;
    gameState3.embargos = hashmap_card_i54;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + dominion.Card.Type.TREASURE + "'", type15.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i54);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState19.embargos;
    gameState15.gameBoard = hashmap_card_i20;
    dominion.Player player23 = new dominion.Player(gameState15, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player23.printStateGame();
    player23.printStateGame();
    gameState3.addPlayer(player23);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.gameBoard;
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    dominion.Card.Type type37 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card38 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card33, type37);
    dominion.GameState gameState40 = null;
    java.util.List<dominion.Card> list_card41 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card38, 0, gameState40);
    gameState30.cards = list_card38;
    java.util.List<dominion.Player> list_player43 = gameState30.players;
    gameState3.players = list_player43;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = gameState3.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + dominion.Card.Type.TREASURE + "'", type37.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i45);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    boolean b9 = gameState3.isGameOver();
    dominion.GameState gameState10 = null;
    dominion.Player player12 = new dominion.Player(gameState10, "hi!");
    gameState3.addPlayer(player12);
    // The following exception was thrown during execution in test generation
    try {
    player12.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    dominion.Randomness.totalCallsToRandom = (short)1;

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    int i1 = dominion.Randomness.nextRandomInt((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card6 = gameState3.boardTakeCard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.embargos;
    boolean b41 = gameState39.isGameOver();
    dominion.Card[] card_array42 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card43 = new java.util.ArrayList<dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card43, card_array42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card43);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.embargos;
    gameState39.gameBoard = hashmap_card_i46;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i48 = gameState39.gameBoard;
    gameState35.gameBoard = hashmap_card_i48;
    java.lang.String str50 = gameState35.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str50.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card12);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState14.embargos;
    gameState10.gameBoard = hashmap_card_i15;
    dominion.Player player18 = new dominion.Player(gameState10, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player18.printStateGame();
    gameState3.addPlayer(player18);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState24.embargos;
    dominion.Player player27 = new dominion.Player(gameState24, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i28 = gameState24.getWinners();
    java.util.List<dominion.Card> list_card29 = gameState24.cards;
    dominion.Card.Type type30 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card31 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card29, type30);
    dominion.Card[] card_array33 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card34 = new java.util.ArrayList<dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card34, card_array33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.embargos;
    dominion.GameState gameState38 = null;
    dominion.Player player40 = new dominion.Player(gameState38, "hi!");
    java.lang.String str41 = player40.toString();
    gameState36.addPlayer(player40);
    java.util.List<dominion.Card> list_card43 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card29, (int)(byte)10, gameState36);
    dominion.Card[] card_array44 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card45 = new java.util.ArrayList<dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card45, card_array44);
    dominion.GameState gameState47 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card45);
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    gameState47.gameBoard = hashmap_card_i52;
    dominion.Card[] card_array54 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card55 = new java.util.ArrayList<dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card55, card_array54);
    dominion.GameState gameState57 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card55);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i58 = gameState57.embargos;
    boolean b59 = gameState57.isGameOver();
    java.util.List<dominion.Player> list_player60 = gameState57.players;
    gameState47.players = list_player60;
    gameState36.players = list_player60;
    gameState3.players = list_player60;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player64 = dominion.Randomness.randomMember(list_player60);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + dominion.Card.Type.VICTORY + "'", type30.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str41.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player60);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    // The following exception was thrown during execution in test generation
    try {
    player2.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    dominion.Player player13 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i34 = gameState12.play();
    dominion.Card card35 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card36 = gameState12.boardTakeCard(card35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i34);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    boolean b9 = gameState3.isGameOver();
    dominion.GameState gameState10 = null;
    dominion.Player player12 = new dominion.Player(gameState10, "hi!");
    gameState3.addPlayer(player12);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState3.play();
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    boolean b20 = gameState18.isGameOver();
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState24.embargos;
    gameState18.gameBoard = hashmap_card_i25;
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState34.embargos;
    gameState30.gameBoard = hashmap_card_i35;
    dominion.Player player38 = new dominion.Player(gameState30, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player38.printStateGame();
    player38.printStateGame();
    gameState18.addPlayer(player38);
    dominion.Card[] card_array42 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card43 = new java.util.ArrayList<dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card43, card_array42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card43);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.gameBoard;
    dominion.Card[] card_array47 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card48 = new java.util.ArrayList<dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card48, card_array47);
    dominion.GameState gameState50 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card48);
    dominion.Card.Type type52 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card48, type52);
    dominion.GameState gameState55 = null;
    java.util.List<dominion.Card> list_card56 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card53, 0, gameState55);
    gameState45.cards = list_card53;
    java.util.List<dominion.Player> list_player58 = gameState45.players;
    gameState18.players = list_player58;
    gameState3.players = list_player58;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + dominion.Card.Type.TREASURE + "'", type52.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player58);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    gameState26.gameBoard = hashmap_card_i31;
    dominion.Card[] card_array33 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card34 = new java.util.ArrayList<dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card34, card_array33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.embargos;
    boolean b38 = gameState36.isGameOver();
    java.util.List<dominion.Player> list_player39 = gameState36.players;
    gameState26.players = list_player39;
    gameState15.players = list_player39;
    boolean b42 = gameState15.isGameOver();
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.GameState gameState46 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card44);
    dominion.GameState gameState47 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card44);
    dominion.Card.Type type48 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card49 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card44, type48);
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    dominion.GameState gameState55 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    java.util.List<dominion.Card> list_card56 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card44, (int)(short)1, gameState55);
    dominion.Card[] card_array57 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card58 = new java.util.ArrayList<dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card58, card_array57);
    dominion.GameState gameState60 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card58);
    dominion.Card[] card_array61 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card62 = new java.util.ArrayList<dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card62, card_array61);
    dominion.GameState gameState64 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card62);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i65 = gameState64.embargos;
    gameState60.gameBoard = hashmap_card_i65;
    dominion.Card[] card_array67 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card68 = new java.util.ArrayList<dominion.Card>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card68, card_array67);
    dominion.GameState gameState70 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card68);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i71 = gameState70.embargos;
    boolean b72 = gameState70.isGameOver();
    java.util.List<dominion.Player> list_player73 = gameState70.players;
    gameState60.players = list_player73;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i75 = gameState60.gameBoard;
    gameState55.embargos = hashmap_card_i75;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i77 = gameState55.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i78 = gameState55.gameBoard;
    dominion.Card[] card_array79 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card80 = new java.util.ArrayList<dominion.Card>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card80, card_array79);
    dominion.GameState gameState82 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card80);
    dominion.Card[] card_array83 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card84 = new java.util.ArrayList<dominion.Card>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card84, card_array83);
    dominion.GameState gameState86 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card84);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i87 = gameState86.embargos;
    gameState82.gameBoard = hashmap_card_i87;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i89 = gameState82.gameBoard;
    boolean b90 = gameState82.isGameOver();
    dominion.Player player92 = new dominion.Player(gameState82, "hi!");
    gameState55.addPlayer(player92);
    gameState15.addPlayer(player92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + dominion.Card.Type.TREASURE + "'", type48.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState3.getWinners();
    java.lang.String str12 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str12.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    boolean b14 = gameState12.isGameOver();
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    gameState12.gameBoard = hashmap_card_i19;
    gameState3.gameBoard = hashmap_card_i19;
    boolean b22 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState3.embargos;
    dominion.GameState gameState24 = null;
    dominion.Player player26 = new dominion.Player(gameState24, "hi!");
    java.lang.String str27 = player26.toString();
    java.lang.String str28 = player26.toString();
    player26.buyCard();
    gameState3.addPlayer(player26);
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState34.embargos;
    dominion.Player player37 = new dominion.Player(gameState34, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState34.getWinners();
    java.util.List<dominion.Card> list_card39 = null;
    gameState34.cards = list_card39;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i41 = gameState34.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState34.gameBoard;
    gameState3.gameBoard = hashmap_card_i42;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str27.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str28.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.GameState gameState6 = gameState3.clone();
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState10.embargos;
    dominion.GameState gameState12 = null;
    dominion.Player player14 = new dominion.Player(gameState12, "hi!");
    java.lang.String str15 = player14.toString();
    gameState10.addPlayer(player14);
    dominion.Card card17 = null;
    player14.discard(card17);
    player14.playKingdomCard();
    player14.buyCard();
    gameState6.addPlayer(player14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str15.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.buyCard();
    player2.playTtreasureCard();
    player2.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str3.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str4.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.gameBoard;
    gameState4.embargos = hashmap_card_i9;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState4.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState12.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState12.gameBoard;
    dominion.GameState gameState36 = gameState12.clone();
    dominion.Card[] card_array37 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card38 = new java.util.ArrayList<dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card38, card_array37);
    dominion.GameState gameState40 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card38);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i41 = gameState40.embargos;
    boolean b42 = gameState40.isGameOver();
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.GameState gameState46 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card44);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState46.embargos;
    gameState40.gameBoard = hashmap_card_i47;
    dominion.Card[] card_array49 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card50 = new java.util.ArrayList<dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card50, card_array49);
    dominion.GameState gameState52 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card50);
    dominion.Card[] card_array53 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card54 = new java.util.ArrayList<dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card54, card_array53);
    dominion.GameState gameState56 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card54);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i57 = gameState56.embargos;
    gameState52.gameBoard = hashmap_card_i57;
    dominion.Player player60 = new dominion.Player(gameState52, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player60.printStateGame();
    player60.printStateGame();
    gameState40.addPlayer(player60);
    dominion.Card[] card_array64 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card65 = new java.util.ArrayList<dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card65, card_array64);
    dominion.GameState gameState67 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card65);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i68 = gameState67.gameBoard;
    dominion.Card[] card_array69 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card70 = new java.util.ArrayList<dominion.Card>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card70, card_array69);
    dominion.GameState gameState72 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card70);
    dominion.GameState gameState73 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card70);
    dominion.Card.Type type74 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card75 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card70, type74);
    dominion.GameState gameState77 = null;
    java.util.List<dominion.Card> list_card78 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card75, 0, gameState77);
    gameState67.cards = list_card75;
    java.util.List<dominion.Player> list_player80 = gameState67.players;
    gameState40.players = list_player80;
    gameState12.players = list_player80;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    org.junit.Assert.assertTrue("'" + type74 + "' != '" + dominion.Card.Type.TREASURE + "'", type74.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player80);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState15.embargos;
    dominion.Card card24 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card25 = gameState15.boardTakeCard(card24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = dominion.Randomness.nextRandomInt((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    java.util.Random random0 = dominion.Randomness.random;
    dominion.Randomness.random = random0;
    dominion.Randomness.random = random0;
    dominion.Randomness.random = random0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card.Type type19 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card15, type19);
    dominion.GameState gameState22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card20, 0, gameState22);
    gameState3.cards = list_card23;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card25 = dominion.Randomness.randomMember(list_card23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + dominion.Card.Type.TREASURE + "'", type19.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.GameState gameState13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card11, 0, gameState13);
    gameState3.cards = list_card11;
    boolean b16 = gameState3.isGameOver();
    dominion.Card card17 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card18 = gameState3.boardTakeCard(card17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player11.printStateGame();
    player11.playTtreasureCard();
    player11.printStateGame();
    player11.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    dominion.Card.Type type11 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card12 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card7, type11);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    java.util.List<dominion.Card> list_card19 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card7, (int)(short)1, gameState18);
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    gameState23.gameBoard = hashmap_card_i28;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState33.embargos;
    boolean b35 = gameState33.isGameOver();
    java.util.List<dominion.Player> list_player36 = gameState33.players;
    gameState23.players = list_player36;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState23.gameBoard;
    gameState18.embargos = hashmap_card_i38;
    java.util.List<dominion.Player> list_player40 = gameState18.players;
    gameState3.players = list_player40;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player42 = dominion.Randomness.randomMember(list_player40);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + dominion.Card.Type.TREASURE + "'", type11.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player40);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    boolean b23 = gameState15.isGameOver();
    dominion.Player player25 = new dominion.Player(gameState15, " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.GameState gameState13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card11, 0, gameState13);
    gameState3.cards = list_card11;
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState19.gameBoard;
    gameState3.gameBoard = hashmap_card_i20;
    dominion.GameState gameState22 = gameState3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState22);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player11.printStateGame();
    player11.buyCard();
    player11.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    dominion.GameState gameState7 = gameState3.clone();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    dominion.GameState gameState14 = null;
    dominion.Player player16 = new dominion.Player(gameState14, "hi!");
    java.lang.String str17 = player16.toString();
    gameState12.addPlayer(player16);
    gameState3.addPlayer(player16);
    dominion.Card card20 = null;
    player16.discard(card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.embargos;
    boolean b41 = gameState39.isGameOver();
    java.util.List<dominion.Player> list_player42 = gameState39.players;
    gameState39.initializeGame();
    java.util.List<dominion.Card> list_card44 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card22, 0, gameState39);
    dominion.GameState gameState45 = new dominion.GameState(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    int i1 = dominion.Randomness.nextRandomInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 50);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    dominion.Randomness.reset((long)(byte)-1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    player11.playKingdomCard();
    player11.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.Player player18 = new dominion.Player(gameState15, "hi!");
    gameState3.addPlayer(player18);
    player18.buyCard();
    player18.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.lang.String str4 = gameState3.toString();
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState8.getWinners();
    java.util.List<dominion.Card> list_card13 = gameState8.cards;
    dominion.Card.Type type14 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card13, type14);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState20.embargos;
    dominion.GameState gameState22 = null;
    dominion.Player player24 = new dominion.Player(gameState22, "hi!");
    java.lang.String str25 = player24.toString();
    gameState20.addPlayer(player24);
    java.util.List<dominion.Card> list_card27 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card13, (int)(byte)10, gameState20);
    gameState3.cards = list_card27;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i29 = gameState3.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str4.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.VICTORY + "'", type14.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str25.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i29);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState12.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState12.gameBoard;
    dominion.GameState gameState36 = gameState12.clone();
    java.util.List<dominion.Card> list_card37 = gameState36.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    dominion.Card.Type type36 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card37 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type36);
    dominion.Card.CardName cardName38 = dominion.Card.CardName.Curse;
    dominion.Card card39 = dominion.Card.getCard(list_card37, cardName38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + dominion.Card.Type.VICTORY + "'", type36.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + dominion.Card.CardName.Curse + "'", cardName38.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.GameState gameState13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card11, 0, gameState13);
    gameState3.cards = list_card11;
    boolean b16 = gameState3.isGameOver();
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState24.embargos;
    gameState20.gameBoard = hashmap_card_i25;
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    boolean b32 = gameState30.isGameOver();
    java.util.List<dominion.Player> list_player33 = gameState30.players;
    gameState20.players = list_player33;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState20.gameBoard;
    gameState3.embargos = hashmap_card_i35;
    java.lang.String str37 = gameState3.toString();
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.lang.String str42 = gameState41.toString();
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.GameState gameState46 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card44);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState46.embargos;
    dominion.Player player49 = new dominion.Player(gameState46, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i50 = gameState46.getWinners();
    java.util.List<dominion.Card> list_card51 = gameState46.cards;
    dominion.Card.Type type52 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card53 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card51, type52);
    dominion.Card[] card_array55 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card56 = new java.util.ArrayList<dominion.Card>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card56, card_array55);
    dominion.GameState gameState58 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card56);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i59 = gameState58.embargos;
    dominion.GameState gameState60 = null;
    dominion.Player player62 = new dominion.Player(gameState60, "hi!");
    java.lang.String str63 = player62.toString();
    gameState58.addPlayer(player62);
    java.util.List<dominion.Card> list_card65 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card51, (int)(byte)10, gameState58);
    gameState41.cards = list_card65;
    dominion.Card[] card_array68 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card69 = new java.util.ArrayList<dominion.Card>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card69, card_array68);
    dominion.GameState gameState71 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card69);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i72 = gameState71.embargos;
    dominion.Player player74 = new dominion.Player(gameState71, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i75 = gameState71.getWinners();
    java.util.List<dominion.Card> list_card76 = gameState71.cards;
    dominion.Card.Type type77 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card78 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card76, type77);
    dominion.Card[] card_array80 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card81 = new java.util.ArrayList<dominion.Card>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card81, card_array80);
    dominion.GameState gameState83 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card81);
    dominion.Card[] card_array84 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card85 = new java.util.ArrayList<dominion.Card>();
    boolean b86 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card85, card_array84);
    dominion.GameState gameState87 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card85);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i88 = gameState87.embargos;
    gameState83.gameBoard = hashmap_card_i88;
    dominion.Player player91 = new dominion.Player(gameState83, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player93 = new dominion.Player(gameState83, "hi!");
    java.util.List<dominion.Card> list_card94 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card76, (-1), gameState83);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i95 = gameState83.getWinners();
    java.util.List<dominion.Card> list_card96 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card65, (int)'#', gameState83);
    gameState3.cards = list_card96;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str37.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str42.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + dominion.Card.Type.VICTORY + "'", type52.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str63.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card76);
    org.junit.Assert.assertTrue("'" + type77 + "' != '" + dominion.Card.Type.VICTORY + "'", type77.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card96);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    gameState3.initializeGame();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.getWinners();
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState17.embargos;
    gameState13.gameBoard = hashmap_card_i18;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState13.gameBoard;
    boolean b21 = gameState13.isGameOver();
    boolean b22 = gameState13.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState13.getWinners();
    java.util.List<dominion.Card> list_card24 = gameState13.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState13.gameBoard;
    gameState3.gameBoard = hashmap_card_i25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    int i1 = dominion.Randomness.nextRandomInt(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.GameState gameState5 = null;
    dominion.Player player7 = new dominion.Player(gameState5, "hi!");
    java.lang.String str8 = player7.toString();
    gameState3.addPlayer(player7);
    dominion.Card card10 = null;
    player7.discard(card10);
    player7.playKingdomCard();
    player7.playTtreasureCard();
    java.lang.String str14 = player7.toString();
    player7.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str8.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str14.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    dominion.Card card14 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card15 = gameState3.boardTakeCard(card14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    java.util.List<dominion.Card> list_card9 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState12.embargos;
    java.lang.String str35 = gameState12.toString();
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.gameBoard;
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.GameState gameState44 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card42);
    dominion.Card.Type type46 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card42, type46);
    dominion.GameState gameState49 = null;
    java.util.List<dominion.Card> list_card50 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card47, 0, gameState49);
    gameState39.cards = list_card47;
    boolean b52 = gameState39.isGameOver();
    dominion.Card[] card_array53 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card54 = new java.util.ArrayList<dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card54, card_array53);
    dominion.GameState gameState56 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card54);
    dominion.Card[] card_array57 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card58 = new java.util.ArrayList<dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card58, card_array57);
    dominion.GameState gameState60 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card58);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i61 = gameState60.embargos;
    gameState56.gameBoard = hashmap_card_i61;
    dominion.Card[] card_array63 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card64 = new java.util.ArrayList<dominion.Card>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card64, card_array63);
    dominion.GameState gameState66 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card64);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i67 = gameState66.embargos;
    boolean b68 = gameState66.isGameOver();
    java.util.List<dominion.Player> list_player69 = gameState66.players;
    gameState56.players = list_player69;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i71 = gameState56.gameBoard;
    gameState39.embargos = hashmap_card_i71;
    gameState12.gameBoard = hashmap_card_i71;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str35.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + dominion.Card.Type.TREASURE + "'", type46.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i71);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.embargos;
    boolean b41 = gameState39.isGameOver();
    dominion.Card[] card_array42 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card43 = new java.util.ArrayList<dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card43, card_array42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card43);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.embargos;
    gameState39.gameBoard = hashmap_card_i46;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i48 = gameState39.gameBoard;
    gameState35.gameBoard = hashmap_card_i48;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i50 = gameState35.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i50);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.lang.String str7 = player6.toString();
    player6.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str7.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    boolean b14 = gameState12.isGameOver();
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    gameState12.gameBoard = hashmap_card_i19;
    gameState3.gameBoard = hashmap_card_i19;
    boolean b22 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState3.embargos;
    dominion.Player player25 = new dominion.Player(gameState3, " ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    boolean b12 = gameState3.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card14 = null;
    gameState3.cards = list_card14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    int i1 = dominion.Randomness.nextRandomInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    int i1 = dominion.Randomness.nextRandomInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 35);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    dominion.Card[] card_array13 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card14 = new java.util.ArrayList<dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card14, card_array13);
    dominion.GameState gameState16 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card14);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState16.embargos;
    boolean b18 = gameState16.isGameOver();
    java.util.List<dominion.Player> list_player19 = gameState16.players;
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    gameState23.gameBoard = hashmap_card_i28;
    dominion.Player player31 = new dominion.Player(gameState23, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player31.printStateGame();
    gameState16.addPlayer(player31);
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.GameState gameState37 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card35);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState37.embargos;
    dominion.Player player40 = new dominion.Player(gameState37, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i41 = gameState37.getWinners();
    java.util.List<dominion.Card> list_card42 = gameState37.cards;
    dominion.Card.Type type43 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card44 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card42, type43);
    dominion.Card[] card_array46 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card47 = new java.util.ArrayList<dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card47, card_array46);
    dominion.GameState gameState49 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card47);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i50 = gameState49.embargos;
    dominion.GameState gameState51 = null;
    dominion.Player player53 = new dominion.Player(gameState51, "hi!");
    java.lang.String str54 = player53.toString();
    gameState49.addPlayer(player53);
    java.util.List<dominion.Card> list_card56 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card42, (int)(byte)10, gameState49);
    dominion.Card[] card_array57 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card58 = new java.util.ArrayList<dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card58, card_array57);
    dominion.GameState gameState60 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card58);
    dominion.Card[] card_array61 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card62 = new java.util.ArrayList<dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card62, card_array61);
    dominion.GameState gameState64 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card62);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i65 = gameState64.embargos;
    gameState60.gameBoard = hashmap_card_i65;
    dominion.Card[] card_array67 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card68 = new java.util.ArrayList<dominion.Card>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card68, card_array67);
    dominion.GameState gameState70 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card68);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i71 = gameState70.embargos;
    boolean b72 = gameState70.isGameOver();
    java.util.List<dominion.Player> list_player73 = gameState70.players;
    gameState60.players = list_player73;
    gameState49.players = list_player73;
    gameState16.players = list_player73;
    gameState3.players = list_player73;
    dominion.Card[] card_array78 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card79 = new java.util.ArrayList<dominion.Card>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card79, card_array78);
    dominion.GameState gameState81 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card79);
    dominion.GameState gameState82 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card79);
    dominion.Card.Type type83 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card84 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card79, type83);
    dominion.Card[] card_array86 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card87 = new java.util.ArrayList<dominion.Card>();
    boolean b88 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card87, card_array86);
    dominion.GameState gameState89 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card87);
    dominion.GameState gameState90 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card87);
    java.util.List<dominion.Card> list_card91 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card79, (int)(short)1, gameState90);
    gameState3.cards = arraylist_card79;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + dominion.Card.Type.VICTORY + "'", type43.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str54.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    org.junit.Assert.assertTrue("'" + type83 + "' != '" + dominion.Card.Type.TREASURE + "'", type83.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    gameState3.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    int i1 = dominion.Randomness.nextRandomInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 39);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    dominion.GameState gameState18 = gameState3.clone();
    dominion.Player player20 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player20.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState18);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState3.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState3.embargos;
    dominion.Player player15 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player15.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card9 = gameState3.boardTakeCard(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.GameState gameState8 = null;
    java.util.List<dominion.Card> list_card9 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card6, 0, gameState8);
    dominion.Card.CardName cardName10 = dominion.Card.CardName.Mine;
    dominion.Card card11 = dominion.Card.getCard(list_card6, cardName10);
    dominion.Card.CardName cardName12 = dominion.Card.CardName.Duchy;
    dominion.Card card13 = dominion.Card.getCard(list_card6, cardName12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + dominion.Card.CardName.Mine + "'", cardName10.equals(dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + dominion.Card.CardName.Duchy + "'", cardName12.equals(dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    boolean b14 = gameState12.isGameOver();
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    gameState12.gameBoard = hashmap_card_i19;
    gameState3.gameBoard = hashmap_card_i19;
    java.util.List<dominion.Player> list_player22 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    dominion.Randomness.reset((long)(-1));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player11.printStateGame();
    player11.printStateGame();
    player11.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.GameState gameState6 = gameState3.clone();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState6.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState6.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = null;
    gameState3.cards = list_card8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    dominion.Player player16 = new dominion.Player(gameState13, "hi!");
    dominion.Player player18 = new dominion.Player(gameState13, "");
    java.lang.String str19 = player18.toString();
    player18.buyCard();
    gameState3.addPlayer(player18);
    dominion.Card card22 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card23 = gameState3.boardTakeCard(card22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.lang.String str12 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str12.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    java.util.List<dominion.Card> list_card13 = gameState3.cards;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card14 = dominion.Randomness.randomMember(list_card13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Curse;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName14);
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card16 = dominion.Randomness.randomMember((java.util.List<dominion.Card>)arraylist_card1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Curse + "'", cardName14.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    dominion.Card.Type type36 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card37 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type36);
    dominion.Card.CardName cardName38 = dominion.Card.CardName.Smithy;
    dominion.Card card39 = dominion.Card.getCard(list_card22, cardName38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + dominion.Card.Type.VICTORY + "'", type36.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + dominion.Card.CardName.Smithy + "'", cardName38.equals(dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    dominion.Card.Type type10 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card11 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card6, type10);
    dominion.GameState gameState13 = null;
    java.util.List<dominion.Card> list_card14 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card11, 0, gameState13);
    gameState3.cards = list_card11;
    java.util.List<dominion.Player> list_player16 = gameState3.players;
    dominion.Player player18 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + dominion.Card.Type.TREASURE + "'", type10.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    dominion.Randomness.totalCallsToRandom = (byte)0;

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState12.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState12.gameBoard;
    dominion.GameState gameState36 = gameState12.clone();
    dominion.Card card37 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card38 = gameState36.boardTakeCard(card37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState36);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = null;
    gameState3.cards = list_card8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    dominion.Player player16 = new dominion.Player(gameState13, "hi!");
    dominion.Player player18 = new dominion.Player(gameState13, "");
    java.lang.String str19 = player18.toString();
    player18.buyCard();
    gameState3.addPlayer(player18);
    dominion.Card[] card_array22 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card23 = new java.util.ArrayList<dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card23, card_array22);
    dominion.GameState gameState25 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card23);
    dominion.Card.Type type27 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card28 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card23, type27);
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.List<dominion.Card> list_card35 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card23, (int)(short)1, gameState34);
    gameState3.cards = arraylist_card23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + dominion.Card.Type.TREASURE + "'", type27.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    player11.playKingdomCard();
    player11.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    int i1 = dominion.Randomness.nextRandomInt(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Curse;
    dominion.Card card15 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName14);
    dominion.GameState gameState16 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Curse + "'", cardName14.equals(dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    boolean b9 = gameState3.isGameOver();
    dominion.GameState gameState10 = null;
    dominion.Player player12 = new dominion.Player(gameState10, "hi!");
    gameState3.addPlayer(player12);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState3.play();
    java.lang.String str15 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str15.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    dominion.GameState gameState18 = gameState3.clone();
    dominion.Player player20 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.GameState gameState21 = gameState3.clone();
    dominion.Card[] card_array22 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card23 = new java.util.ArrayList<dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card23, card_array22);
    dominion.GameState gameState25 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card23);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card27);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i30 = gameState29.embargos;
    gameState25.gameBoard = hashmap_card_i30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState25.gameBoard;
    boolean b33 = gameState25.isGameOver();
    boolean b34 = gameState25.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i35 = gameState25.getWinners();
    java.util.List<dominion.Card> list_card36 = gameState25.cards;
    dominion.Card[] card_array37 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card38 = new java.util.ArrayList<dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card38, card_array37);
    dominion.GameState gameState40 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card38);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i41 = gameState40.embargos;
    dominion.Player player43 = new dominion.Player(gameState40, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i44 = gameState40.getWinners();
    java.util.List<dominion.Card> list_card45 = gameState40.cards;
    dominion.Card.Type type46 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card47 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card45, type46);
    dominion.Card[] card_array49 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card50 = new java.util.ArrayList<dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card50, card_array49);
    dominion.GameState gameState52 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card50);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i53 = gameState52.embargos;
    dominion.GameState gameState54 = null;
    dominion.Player player56 = new dominion.Player(gameState54, "hi!");
    java.lang.String str57 = player56.toString();
    gameState52.addPlayer(player56);
    java.util.List<dominion.Card> list_card59 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card45, (int)(byte)10, gameState52);
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.Card[] card_array64 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card65 = new java.util.ArrayList<dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card65, card_array64);
    dominion.GameState gameState67 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card65);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i68 = gameState67.embargos;
    gameState63.gameBoard = hashmap_card_i68;
    dominion.Card[] card_array70 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card71 = new java.util.ArrayList<dominion.Card>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card71, card_array70);
    dominion.GameState gameState73 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card71);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i74 = gameState73.embargos;
    boolean b75 = gameState73.isGameOver();
    java.util.List<dominion.Player> list_player76 = gameState73.players;
    gameState63.players = list_player76;
    gameState52.players = list_player76;
    gameState25.players = list_player76;
    gameState21.players = list_player76;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + dominion.Card.Type.VICTORY + "'", type46.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str57.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player76);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    java.util.List<dominion.Card> list_card0 = null;
    dominion.GameState gameState1 = new dominion.GameState(list_card0);
    dominion.Card[] card_array2 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card3 = new java.util.ArrayList<dominion.Card>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card3, card_array2);
    dominion.GameState gameState5 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card3);
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState5.gameBoard = hashmap_card_i10;
    dominion.Player player13 = new dominion.Player(gameState5, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player15 = new dominion.Player(gameState5, "hi!");
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState23.embargos;
    gameState19.gameBoard = hashmap_card_i24;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState19.gameBoard;
    boolean b27 = gameState19.isGameOver();
    boolean b28 = gameState19.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i29 = gameState19.getWinners();
    java.util.List<dominion.Card> list_card30 = gameState19.cards;
    gameState5.cards = list_card30;
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.embargos;
    dominion.Player player38 = new dominion.Player(gameState35, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i39 = gameState35.getWinners();
    java.util.List<dominion.Card> list_card40 = null;
    gameState35.cards = list_card40;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i42 = gameState35.getWinners();
    dominion.Card[] card_array43 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card44 = new java.util.ArrayList<dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card44, card_array43);
    dominion.GameState gameState46 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card44);
    dominion.Card[] card_array47 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card48 = new java.util.ArrayList<dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card48, card_array47);
    dominion.GameState gameState50 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card48);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState50.embargos;
    gameState46.gameBoard = hashmap_card_i51;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i53 = gameState46.gameBoard;
    gameState35.embargos = hashmap_card_i53;
    gameState5.gameBoard = hashmap_card_i53;
    gameState1.embargos = hashmap_card_i53;
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = gameState1.isGameOver();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i53);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    java.util.List<dominion.Card> list_card12 = gameState3.cards;
    java.lang.String str13 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str13.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    java.lang.String str14 = gameState12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str14.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState17.embargos;
    dominion.Player player20 = new dominion.Player(gameState17, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i21 = gameState17.getWinners();
    java.util.List<dominion.Card> list_card22 = gameState17.cards;
    dominion.Card.Type type23 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type23);
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card27);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i30 = gameState29.embargos;
    dominion.GameState gameState31 = null;
    dominion.Player player33 = new dominion.Player(gameState31, "hi!");
    java.lang.String str34 = player33.toString();
    gameState29.addPlayer(player33);
    java.util.List<dominion.Card> list_card36 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card22, (int)(byte)10, gameState29);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState29.embargos;
    gameState3.embargos = hashmap_card_i37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + dominion.Card.Type.VICTORY + "'", type23.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str34.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.lang.String str7 = player6.toString();
    player6.buyCard();
    player6.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str7.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i34 = gameState12.play();
    dominion.Card[] card_array35 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card36 = new java.util.ArrayList<dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card36, card_array35);
    dominion.GameState gameState38 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card36);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState38.embargos;
    boolean b40 = gameState38.isGameOver();
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.GameState gameState44 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card42);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = gameState44.embargos;
    gameState38.gameBoard = hashmap_card_i45;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState38.gameBoard;
    gameState12.gameBoard = hashmap_card_i47;
    dominion.Player player50 = new dominion.Player(gameState12, "hi!");
    player50.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState19.embargos;
    gameState15.gameBoard = hashmap_card_i20;
    dominion.Player player23 = new dominion.Player(gameState15, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player23.printStateGame();
    player23.printStateGame();
    gameState3.addPlayer(player23);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.gameBoard;
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    dominion.Card.Type type37 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card38 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card33, type37);
    dominion.GameState gameState40 = null;
    java.util.List<dominion.Card> list_card41 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card38, 0, gameState40);
    gameState30.cards = list_card38;
    java.util.List<dominion.Player> list_player43 = gameState30.players;
    gameState3.players = list_player43;
    java.lang.String str45 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + dominion.Card.Type.TREASURE + "'", type37.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str45.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    dominion.Randomness.reset((long)20);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card card14 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card15 = gameState12.boardTakeCard(card14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    dominion.Randomness.reset(1L);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player13 = new dominion.Player(gameState3, "hi!");
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.gameBoard;
    boolean b25 = gameState17.isGameOver();
    boolean b26 = gameState17.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i27 = gameState17.getWinners();
    java.util.List<dominion.Card> list_card28 = gameState17.cards;
    gameState3.cards = list_card28;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState33.embargos;
    dominion.Player player36 = new dominion.Player(gameState33, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i37 = gameState33.getWinners();
    java.util.List<dominion.Card> list_card38 = null;
    gameState33.cards = list_card38;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i40 = gameState33.getWinners();
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.GameState gameState44 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card42);
    dominion.Card[] card_array45 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card46 = new java.util.ArrayList<dominion.Card>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card46, card_array45);
    dominion.GameState gameState48 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card46);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i49 = gameState48.embargos;
    gameState44.gameBoard = hashmap_card_i49;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.gameBoard;
    gameState33.embargos = hashmap_card_i51;
    gameState3.gameBoard = hashmap_card_i51;
    java.util.List<dominion.Card> list_card54 = gameState3.cards;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card55 = dominion.Randomness.randomMember(list_card54);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState12.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState12.gameBoard;
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    dominion.Card[] card_array40 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card41 = new java.util.ArrayList<dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card41, card_array40);
    dominion.GameState gameState43 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card41);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i44 = gameState43.embargos;
    gameState39.gameBoard = hashmap_card_i44;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState39.gameBoard;
    boolean b47 = gameState39.isGameOver();
    dominion.Player player49 = new dominion.Player(gameState39, "hi!");
    gameState12.addPlayer(player49);
    dominion.Card[] card_array51 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card52 = new java.util.ArrayList<dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card52, card_array51);
    dominion.GameState gameState54 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card52);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i55 = gameState54.embargos;
    dominion.Player player57 = new dominion.Player(gameState54, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i58 = gameState54.getWinners();
    java.util.List<dominion.Card> list_card59 = gameState54.cards;
    boolean b60 = gameState54.isGameOver();
    dominion.GameState gameState61 = null;
    dominion.Player player63 = new dominion.Player(gameState61, "hi!");
    gameState54.addPlayer(player63);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i65 = gameState54.gameBoard;
    gameState12.embargos = hashmap_card_i65;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i65);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card12);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState14.gameBoard;
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    dominion.Card.Type type21 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card22 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card17, type21);
    dominion.GameState gameState24 = null;
    java.util.List<dominion.Card> list_card25 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card22, 0, gameState24);
    gameState14.cards = list_card22;
    boolean b27 = gameState14.isGameOver();
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.GameState gameState31 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.embargos;
    gameState31.gameBoard = hashmap_card_i36;
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState41.embargos;
    boolean b43 = gameState41.isGameOver();
    java.util.List<dominion.Player> list_player44 = gameState41.players;
    gameState31.players = list_player44;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState31.gameBoard;
    gameState14.embargos = hashmap_card_i46;
    gameState3.gameBoard = hashmap_card_i46;
    dominion.Card[] card_array49 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card50 = new java.util.ArrayList<dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card50, card_array49);
    dominion.GameState gameState52 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card50);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i53 = gameState52.embargos;
    dominion.Player player55 = new dominion.Player(gameState52, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i56 = gameState52.getWinners();
    java.util.List<dominion.Card> list_card57 = gameState52.cards;
    gameState3.cards = list_card57;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + dominion.Card.Type.TREASURE + "'", type21.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    gameState3.initializeGame();
    java.lang.String str13 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str13.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.GameState gameState5 = null;
    dominion.Player player7 = new dominion.Player(gameState5, "hi!");
    java.lang.String str8 = player7.toString();
    gameState3.addPlayer(player7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.embargos;
    dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Card card12 = gameState3.boardTakeCard(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str8.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player11.printStateGame();
    player11.printStateGame();
    player11.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    boolean b9 = gameState3.isGameOver();
    dominion.GameState gameState10 = null;
    dominion.Player player12 = new dominion.Player(gameState10, "hi!");
    gameState3.addPlayer(player12);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState3.gameBoard;
    gameState3.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState3.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState3.embargos;
    dominion.Player player15 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Card[] card_array16 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card17 = new java.util.ArrayList<dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card17, card_array16);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card17);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState19.embargos;
    boolean b21 = gameState19.isGameOver();
    dominion.Card[] card_array22 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card23 = new java.util.ArrayList<dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card23, card_array22);
    dominion.GameState gameState25 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card23);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState25.embargos;
    gameState19.gameBoard = hashmap_card_i26;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState19.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i29 = gameState19.embargos;
    gameState3.embargos = hashmap_card_i29;
    java.util.List<dominion.Player> list_player31 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player31);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card14 = gameState3.cards;
    dominion.Player player15 = null;
    gameState3.addPlayer(player15);
    // The following exception was thrown during execution in test generation
    try {
    dominion.GameState gameState17 = gameState3.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    gameState35.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card14 = gameState3.cards;
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    dominion.Player player21 = new dominion.Player(gameState18, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i22 = gameState18.getWinners();
    java.util.List<dominion.Card> list_card23 = gameState18.cards;
    dominion.Card.Type type24 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card23, type24);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    dominion.GameState gameState32 = null;
    dominion.Player player34 = new dominion.Player(gameState32, "hi!");
    java.lang.String str35 = player34.toString();
    gameState30.addPlayer(player34);
    java.util.List<dominion.Card> list_card37 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card23, (int)(byte)10, gameState30);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    dominion.Card[] card_array42 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card43 = new java.util.ArrayList<dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card43, card_array42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card43);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.embargos;
    gameState41.gameBoard = hashmap_card_i46;
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    boolean b53 = gameState51.isGameOver();
    java.util.List<dominion.Player> list_player54 = gameState51.players;
    gameState41.players = list_player54;
    gameState30.players = list_player54;
    gameState3.players = list_player54;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player58 = dominion.Randomness.randomMember(list_player54);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.VICTORY + "'", type24.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str35.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player54);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    int i1 = dominion.Randomness.nextRandomInt((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 23);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    boolean b14 = gameState12.isGameOver();
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    gameState12.gameBoard = hashmap_card_i19;
    gameState3.gameBoard = hashmap_card_i19;
    boolean b22 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState3.embargos;
    dominion.GameState gameState24 = null;
    dominion.Player player26 = new dominion.Player(gameState24, "hi!");
    java.lang.String str27 = player26.toString();
    java.lang.String str28 = player26.toString();
    player26.buyCard();
    gameState3.addPlayer(player26);
    dominion.GameState gameState31 = null;
    dominion.Player player33 = new dominion.Player(gameState31, "hi!");
    java.lang.String str34 = player33.toString();
    dominion.Card card35 = null;
    player33.discard(card35);
    player33.buyCard();
    gameState3.addPlayer(player33);
    dominion.Card card39 = null;
    player33.discard(card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str27.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str28.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str34.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.embargos;
    dominion.Player player42 = new dominion.Player(gameState39, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i43 = gameState39.getWinners();
    java.util.List<dominion.Card> list_card44 = gameState39.cards;
    dominion.Card.Type type45 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card46 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card44, type45);
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    dominion.GameState gameState53 = null;
    dominion.Player player55 = new dominion.Player(gameState53, "hi!");
    java.lang.String str56 = player55.toString();
    gameState51.addPlayer(player55);
    java.util.List<dominion.Card> list_card58 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card44, (int)(byte)10, gameState51);
    dominion.Card[] card_array59 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card60 = new java.util.ArrayList<dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card60, card_array59);
    dominion.GameState gameState62 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card60);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i63 = gameState62.embargos;
    dominion.Player player65 = new dominion.Player(gameState62, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i66 = gameState62.getWinners();
    java.util.List<dominion.Card> list_card67 = gameState62.cards;
    dominion.Card.Type type68 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card69 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card67, type68);
    java.util.List<dominion.Card> list_card70 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card58, type68);
    dominion.GameState gameState71 = new dominion.GameState(list_card58);
    dominion.Card.Type type72 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card73 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card58, type72);
    dominion.Card[] card_array74 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card75 = new java.util.ArrayList<dominion.Card>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card75, card_array74);
    dominion.GameState gameState77 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card75);
    dominion.GameState gameState78 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card75);
    dominion.Card.Type type79 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card80 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card75, type79);
    dominion.GameState gameState82 = null;
    java.util.List<dominion.Card> list_card83 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card80, 0, gameState82);
    dominion.Card.Type type84 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card85 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card80, type84);
    dominion.Card[] card_array86 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card87 = new java.util.ArrayList<dominion.Card>();
    boolean b88 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card87, card_array86);
    dominion.GameState gameState89 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card87);
    dominion.GameState gameState90 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card87);
    dominion.Card.Type type91 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card92 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card87, type91);
    java.util.List<dominion.Card> list_card93 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card80, type91);
    java.util.List<dominion.Card> list_card94 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card58, type91);
    gameState35.cards = list_card94;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + dominion.Card.Type.VICTORY + "'", type45.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str56.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    org.junit.Assert.assertTrue("'" + type68 + "' != '" + dominion.Card.Type.VICTORY + "'", type68.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    org.junit.Assert.assertTrue("'" + type72 + "' != '" + dominion.Card.Type.VICTORY + "'", type72.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    org.junit.Assert.assertTrue("'" + type79 + "' != '" + dominion.Card.Type.TREASURE + "'", type79.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    org.junit.Assert.assertTrue("'" + type84 + "' != '" + dominion.Card.Type.VICTORY + "'", type84.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    org.junit.Assert.assertTrue("'" + type91 + "' != '" + dominion.Card.Type.TREASURE + "'", type91.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player11.printStateGame();
    player11.playTtreasureCard();
    player11.printStateGame();
    player11.printStateGame();
    java.lang.String str16 = player11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState22 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type23 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type23);
    dominion.GameState gameState26 = null;
    java.util.List<dominion.Card> list_card27 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card24, 0, gameState26);
    dominion.Card.CardName cardName28 = dominion.Card.CardName.Salvager;
    dominion.Card card29 = dominion.Card.getCard(list_card24, cardName28);
    gameState3.cards = list_card24;
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    dominion.Card.Type type36 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card37 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card32, type36);
    dominion.GameState gameState39 = null;
    java.util.List<dominion.Card> list_card40 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card37, 0, gameState39);
    dominion.Card.CardName cardName41 = dominion.Card.CardName.Mine;
    dominion.Card card42 = dominion.Card.getCard(list_card37, cardName41);
    dominion.Card card43 = dominion.Card.getCard(list_card24, cardName41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + dominion.Card.Type.TREASURE + "'", type23.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + dominion.Card.CardName.Salvager + "'", cardName28.equals(dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + dominion.Card.Type.TREASURE + "'", type36.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + cardName41 + "' != '" + dominion.Card.CardName.Mine + "'", cardName41.equals(dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card43);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.play();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.embargos;
    dominion.GameState gameState11 = gameState3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState11);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    java.lang.String str13 = gameState3.toString();
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card.Type type19 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card15, type19);
    dominion.GameState gameState22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card20, 0, gameState22);
    dominion.Card.Type type24 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card20, type24);
    gameState3.cards = list_card20;
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    boolean b32 = gameState30.isGameOver();
    java.util.List<dominion.Player> list_player33 = gameState30.players;
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.GameState gameState37 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card35);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState41.embargos;
    gameState37.gameBoard = hashmap_card_i42;
    dominion.Player player45 = new dominion.Player(gameState37, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player45.printStateGame();
    gameState30.addPlayer(player45);
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    dominion.Player player54 = new dominion.Player(gameState51, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i55 = gameState51.getWinners();
    java.util.List<dominion.Card> list_card56 = gameState51.cards;
    dominion.Card.Type type57 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card58 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card56, type57);
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i64 = gameState63.embargos;
    dominion.GameState gameState65 = null;
    dominion.Player player67 = new dominion.Player(gameState65, "hi!");
    java.lang.String str68 = player67.toString();
    gameState63.addPlayer(player67);
    java.util.List<dominion.Card> list_card70 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card56, (int)(byte)10, gameState63);
    dominion.Card[] card_array71 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card72 = new java.util.ArrayList<dominion.Card>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card72, card_array71);
    dominion.GameState gameState74 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card72);
    dominion.Card[] card_array75 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card76 = new java.util.ArrayList<dominion.Card>();
    boolean b77 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card76, card_array75);
    dominion.GameState gameState78 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card76);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i79 = gameState78.embargos;
    gameState74.gameBoard = hashmap_card_i79;
    dominion.Card[] card_array81 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card82 = new java.util.ArrayList<dominion.Card>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card82, card_array81);
    dominion.GameState gameState84 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card82);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i85 = gameState84.embargos;
    boolean b86 = gameState84.isGameOver();
    java.util.List<dominion.Player> list_player87 = gameState84.players;
    gameState74.players = list_player87;
    gameState63.players = list_player87;
    gameState30.players = list_player87;
    gameState3.players = list_player87;
    // The following exception was thrown during execution in test generation
    try {
    dominion.Player player92 = dominion.Randomness.randomMember(list_player87);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str13.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + dominion.Card.Type.TREASURE + "'", type19.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.VICTORY + "'", type24.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    org.junit.Assert.assertTrue("'" + type57 + "' != '" + dominion.Card.Type.VICTORY + "'", type57.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str68.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player87);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    dominion.Player player9 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState3.play();
    java.util.List<dominion.Card> list_card13 = gameState3.cards;
    dominion.Card.CardName cardName14 = dominion.Card.CardName.Gardens;
    dominion.Card card15 = dominion.Card.getCard(list_card13, cardName14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + dominion.Card.CardName.Gardens + "'", cardName14.equals(dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card.Type type19 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card15, type19);
    java.util.List<dominion.Card> list_card21 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card13, type19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + dominion.Card.Type.TREASURE + "'", type19.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.GameState gameState5 = null;
    dominion.Player player7 = new dominion.Player(gameState5, "hi!");
    java.lang.String str8 = player7.toString();
    gameState3.addPlayer(player7);
    player7.playKingdomCard();
    player7.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str8.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    dominion.Card card4 = null;
    player2.discard(card4);
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str3.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str7.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    dominion.Randomness.reset((long)(short)0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player13 = new dominion.Player(gameState3, "hi!");
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.gameBoard;
    boolean b25 = gameState17.isGameOver();
    boolean b26 = gameState17.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i27 = gameState17.getWinners();
    java.util.List<dominion.Card> list_card28 = gameState17.cards;
    gameState3.cards = list_card28;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState33.embargos;
    dominion.Player player36 = new dominion.Player(gameState33, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i37 = gameState33.getWinners();
    java.util.List<dominion.Card> list_card38 = null;
    gameState33.cards = list_card38;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i40 = gameState33.getWinners();
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.GameState gameState44 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card42);
    dominion.Card[] card_array45 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card46 = new java.util.ArrayList<dominion.Card>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card46, card_array45);
    dominion.GameState gameState48 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card46);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i49 = gameState48.embargos;
    gameState44.gameBoard = hashmap_card_i49;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.gameBoard;
    gameState33.embargos = hashmap_card_i51;
    gameState3.gameBoard = hashmap_card_i51;
    java.util.List<dominion.Card> list_card54 = gameState3.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i55 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i55);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.play();
    dominion.GameState gameState6 = gameState3.clone();
    dominion.Player player8 = new dominion.Player(gameState3, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player13 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState3.gameBoard;
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    boolean b20 = gameState18.isGameOver();
    dominion.Card[] card_array21 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card22 = new java.util.ArrayList<dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card22, card_array21);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card22);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState24.embargos;
    gameState18.gameBoard = hashmap_card_i25;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState18.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState18.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i29 = gameState18.embargos;
    gameState3.embargos = hashmap_card_i29;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i31 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i32 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i32);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    dominion.GameState gameState18 = gameState3.clone();
    dominion.Player player20 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.GameState gameState21 = gameState3.clone();
    dominion.Card[] card_array22 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card23 = new java.util.ArrayList<dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card23, card_array22);
    dominion.GameState gameState25 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card23);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState25.embargos;
    boolean b27 = gameState25.isGameOver();
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.GameState gameState31 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState31.embargos;
    gameState25.gameBoard = hashmap_card_i32;
    dominion.Card[] card_array34 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card35 = new java.util.ArrayList<dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card35, card_array34);
    dominion.GameState gameState37 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card35);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState41.embargos;
    gameState37.gameBoard = hashmap_card_i42;
    dominion.Player player45 = new dominion.Player(gameState37, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player45.printStateGame();
    player45.printStateGame();
    gameState25.addPlayer(player45);
    java.lang.String str49 = player45.toString();
    gameState3.addPlayer(player45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + " ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str49.equals(" ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    player2.buyCard();
    player2.playTtreasureCard();
    dominion.Card card7 = null;
    player2.discard(card7);
    // The following exception was thrown during execution in test generation
    try {
    player2.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str3.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str4.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    player6.buyCard();
    dominion.Card card8 = null;
    player6.discard(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState11.embargos;
    dominion.Player player14 = new dominion.Player(gameState11, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i15 = gameState11.getWinners();
    java.util.List<dominion.Card> list_card16 = null;
    gameState11.cards = list_card16;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i18 = gameState11.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState11.gameBoard;
    gameState3.gameBoard = hashmap_card_i19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    boolean b14 = gameState12.isGameOver();
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    gameState12.gameBoard = hashmap_card_i19;
    gameState3.gameBoard = hashmap_card_i19;
    boolean b22 = gameState3.isGameOver();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState3.embargos;
    dominion.GameState gameState24 = null;
    dominion.Player player26 = new dominion.Player(gameState24, "hi!");
    java.lang.String str27 = player26.toString();
    java.lang.String str28 = player26.toString();
    player26.buyCard();
    gameState3.addPlayer(player26);
    player26.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player26.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str27.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str28.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.GameState gameState5 = null;
    dominion.Player player7 = new dominion.Player(gameState5, "hi!");
    java.lang.String str8 = player7.toString();
    gameState3.addPlayer(player7);
    dominion.Card card10 = null;
    player7.discard(card10);
    player7.playKingdomCard();
    java.lang.String str13 = player7.toString();
    player7.playTtreasureCard();
    player7.playTtreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str8.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str13.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player13 = new dominion.Player(gameState3, "hi!");
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Player player25 = new dominion.Player(gameState17, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player27 = new dominion.Player(gameState17, "hi!");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState17.gameBoard;
    gameState3.embargos = hashmap_card_i28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    boolean b13 = gameState3.isGameOver();
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card.Type type19 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card20 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card15, type19);
    dominion.GameState gameState22 = null;
    java.util.List<dominion.Card> list_card23 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card20, 0, gameState22);
    dominion.Card.Type type24 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card25 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card20, type24);
    gameState3.cards = list_card25;
    java.util.List<dominion.Card> list_card27 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + dominion.Card.Type.TREASURE + "'", type19.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + dominion.Card.Type.VICTORY + "'", type24.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    int i1 = dominion.Randomness.nextRandomInt(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    dominion.Card card4 = null;
    player2.discard(card4);
    player2.playKingdomCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str3.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState12.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState12.gameBoard;
    dominion.GameState gameState36 = gameState12.clone();
    dominion.Card[] card_array37 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card38 = new java.util.ArrayList<dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card38, card_array37);
    dominion.GameState gameState40 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card38);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i41 = gameState40.embargos;
    dominion.Player player43 = new dominion.Player(gameState40, "hi!");
    player43.printStateGame();
    gameState12.addPlayer(player43);
    dominion.Card[] card_array46 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card47 = new java.util.ArrayList<dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card47, card_array46);
    dominion.GameState gameState49 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card47);
    dominion.GameState gameState50 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card47);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState50.gameBoard;
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.GameState gameState55 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card53);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i56 = gameState55.embargos;
    dominion.Player player58 = new dominion.Player(gameState55, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i59 = gameState55.getWinners();
    java.util.List<dominion.Card> list_card60 = gameState55.cards;
    dominion.Card.Type type61 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card62 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card60, type61);
    dominion.Card[] card_array64 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card65 = new java.util.ArrayList<dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card65, card_array64);
    dominion.GameState gameState67 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card65);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i68 = gameState67.embargos;
    dominion.GameState gameState69 = null;
    dominion.Player player71 = new dominion.Player(gameState69, "hi!");
    java.lang.String str72 = player71.toString();
    gameState67.addPlayer(player71);
    java.util.List<dominion.Card> list_card74 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card60, (int)(byte)10, gameState67);
    dominion.Card[] card_array75 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card76 = new java.util.ArrayList<dominion.Card>();
    boolean b77 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card76, card_array75);
    dominion.GameState gameState78 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card76);
    dominion.Card[] card_array79 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card80 = new java.util.ArrayList<dominion.Card>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card80, card_array79);
    dominion.GameState gameState82 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card80);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i83 = gameState82.embargos;
    gameState78.gameBoard = hashmap_card_i83;
    dominion.Card[] card_array85 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card86 = new java.util.ArrayList<dominion.Card>();
    boolean b87 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card86, card_array85);
    dominion.GameState gameState88 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card86);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i89 = gameState88.embargos;
    boolean b90 = gameState88.isGameOver();
    java.util.List<dominion.Player> list_player91 = gameState88.players;
    gameState78.players = list_player91;
    gameState67.players = list_player91;
    gameState50.players = list_player91;
    gameState12.players = list_player91;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    org.junit.Assert.assertTrue("'" + type61 + "' != '" + dominion.Card.Type.VICTORY + "'", type61.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str72.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player91);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState3.gameBoard;
    java.lang.String str13 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str13.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    dominion.Card[] card_array7 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card8 = new java.util.ArrayList<dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card8, card_array7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card8);
    dominion.Card[] card_array11 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card12 = new java.util.ArrayList<dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card12, card_array11);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card12);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState14.embargos;
    gameState10.gameBoard = hashmap_card_i15;
    dominion.Player player18 = new dominion.Player(gameState10, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player18.printStateGame();
    gameState3.addPlayer(player18);
    java.lang.String str21 = player18.toString();
    player18.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str21.equals(" ---  --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card14 = gameState3.cards;
    dominion.Player player15 = null;
    gameState3.addPlayer(player15);
    java.util.List<dominion.Player> list_player17 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.gameBoard;
    dominion.Card[] card_array5 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card6 = new java.util.ArrayList<dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card6, card_array5);
    dominion.GameState gameState8 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card6);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState8.embargos;
    dominion.Player player11 = new dominion.Player(gameState8, "hi!");
    gameState3.addPlayer(player11);
    java.lang.String str13 = gameState3.toString();
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Player player25 = new dominion.Player(gameState17, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player27 = new dominion.Player(gameState17, "hi!");
    player27.playKingdomCard();
    gameState3.addPlayer(player27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str13.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    dominion.Randomness.totalCallsToRandom = 50;

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.play();
    java.util.List<dominion.Card> list_card10 = gameState3.cards;
    dominion.GameState gameState11 = null;
    dominion.Player player13 = new dominion.Player(gameState11, "hi!");
    java.lang.String str14 = player13.toString();
    dominion.Card card15 = null;
    player13.discard(card15);
    player13.buyCard();
    gameState3.addPlayer(player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str14.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    dominion.Randomness.totalCallsToRandom = 0;

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = null;
    gameState3.cards = list_card8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    dominion.Player player16 = new dominion.Player(gameState13, "hi!");
    dominion.Player player18 = new dominion.Player(gameState13, "");
    java.lang.String str19 = player18.toString();
    player18.buyCard();
    gameState3.addPlayer(player18);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i22 = gameState3.getWinners();
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    boolean b28 = gameState26.isGameOver();
    dominion.GameState gameState29 = gameState26.clone();
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type35 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type35);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Card> list_card43 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card31, (int)(short)1, gameState42);
    dominion.Card[] card_array44 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card45 = new java.util.ArrayList<dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card45, card_array44);
    dominion.GameState gameState47 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card45);
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    gameState47.gameBoard = hashmap_card_i52;
    dominion.Card[] card_array54 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card55 = new java.util.ArrayList<dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card55, card_array54);
    dominion.GameState gameState57 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card55);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i58 = gameState57.embargos;
    boolean b59 = gameState57.isGameOver();
    java.util.List<dominion.Player> list_player60 = gameState57.players;
    gameState47.players = list_player60;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i62 = gameState47.gameBoard;
    gameState42.embargos = hashmap_card_i62;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i64 = gameState42.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i65 = gameState42.gameBoard;
    gameState26.gameBoard = hashmap_card_i65;
    gameState3.gameBoard = hashmap_card_i65;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + dominion.Card.Type.TREASURE + "'", type35.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i65);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    boolean b13 = gameState3.isGameOver();
    gameState3.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState15.embargos;
    java.lang.String str24 = gameState15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str24.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.GameState gameState12 = gameState3.clone();
    dominion.Player player14 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState12);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.Player player13 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState3.gameBoard;
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.embargos;
    dominion.Player player21 = new dominion.Player(gameState18, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i22 = gameState18.getWinners();
    java.util.List<dominion.Card> list_card23 = gameState18.cards;
    boolean b24 = gameState18.isGameOver();
    dominion.GameState gameState25 = null;
    dominion.Player player27 = new dominion.Player(gameState25, "hi!");
    gameState18.addPlayer(player27);
    gameState3.addPlayer(player27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.Player player18 = new dominion.Player(gameState15, "hi!");
    gameState3.addPlayer(player18);
    java.util.List<dominion.Card> list_card20 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    dominion.GameState gameState18 = gameState3.clone();
    dominion.Card[] card_array19 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card20 = new java.util.ArrayList<dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card20, card_array19);
    dominion.GameState gameState22 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card20);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState22.embargos;
    boolean b24 = gameState22.isGameOver();
    java.util.List<dominion.Player> list_player25 = gameState22.players;
    dominion.Card[] card_array26 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card27 = new java.util.ArrayList<dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card27, card_array26);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card27);
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState33.embargos;
    gameState29.gameBoard = hashmap_card_i34;
    dominion.Player player37 = new dominion.Player(gameState29, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player37.printStateGame();
    gameState22.addPlayer(player37);
    dominion.Card[] card_array40 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card41 = new java.util.ArrayList<dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card41, card_array40);
    dominion.GameState gameState43 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card41);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i44 = gameState43.embargos;
    dominion.Player player46 = new dominion.Player(gameState43, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i47 = gameState43.getWinners();
    java.util.List<dominion.Card> list_card48 = gameState43.cards;
    dominion.Card.Type type49 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card50 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card48, type49);
    dominion.Card[] card_array52 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card53 = new java.util.ArrayList<dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card53, card_array52);
    dominion.GameState gameState55 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card53);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i56 = gameState55.embargos;
    dominion.GameState gameState57 = null;
    dominion.Player player59 = new dominion.Player(gameState57, "hi!");
    java.lang.String str60 = player59.toString();
    gameState55.addPlayer(player59);
    java.util.List<dominion.Card> list_card62 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card48, (int)(byte)10, gameState55);
    dominion.Card[] card_array63 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card64 = new java.util.ArrayList<dominion.Card>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card64, card_array63);
    dominion.GameState gameState66 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card64);
    dominion.Card[] card_array67 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card68 = new java.util.ArrayList<dominion.Card>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card68, card_array67);
    dominion.GameState gameState70 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card68);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i71 = gameState70.embargos;
    gameState66.gameBoard = hashmap_card_i71;
    dominion.Card[] card_array73 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card74 = new java.util.ArrayList<dominion.Card>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card74, card_array73);
    dominion.GameState gameState76 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card74);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i77 = gameState76.embargos;
    boolean b78 = gameState76.isGameOver();
    java.util.List<dominion.Player> list_player79 = gameState76.players;
    gameState66.players = list_player79;
    gameState55.players = list_player79;
    gameState22.players = list_player79;
    gameState18.players = list_player79;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    org.junit.Assert.assertTrue("'" + type49 + "' != '" + dominion.Card.Type.VICTORY + "'", type49.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str60.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player79);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    java.util.List<dominion.Player> list_player6 = gameState3.players;
    dominion.GameState gameState7 = gameState3.clone();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState12.embargos;
    dominion.GameState gameState14 = null;
    dominion.Player player16 = new dominion.Player(gameState14, "hi!");
    java.lang.String str17 = player16.toString();
    gameState12.addPlayer(player16);
    gameState3.addPlayer(player16);
    dominion.GameState gameState20 = gameState3.clone();
    java.util.List<dominion.Card> list_card21 = gameState3.cards;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    dominion.Player player9 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState3.play();
    java.util.List<dominion.Card> list_card13 = gameState3.cards;
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState18.gameBoard;
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState23.embargos;
    dominion.Player player26 = new dominion.Player(gameState23, "hi!");
    gameState18.addPlayer(player26);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i28 = gameState18.getWinners();
    dominion.Card[] card_array29 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card30 = new java.util.ArrayList<dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card30, card_array29);
    dominion.GameState gameState32 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card30);
    dominion.Card.Type type34 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card35 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card30, type34);
    dominion.GameState gameState37 = null;
    java.util.List<dominion.Card> list_card38 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card35, 0, gameState37);
    gameState18.cards = list_card38;
    java.util.List<dominion.Card> list_card40 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card13, (int)(byte)1, gameState18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + dominion.Card.Type.TREASURE + "'", type34.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    dominion.Player player8 = new dominion.Player(gameState3, "");
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.Card.Type type14 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card15 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card10, type14);
    dominion.Card[] card_array17 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card18 = new java.util.ArrayList<dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card18, card_array17);
    dominion.GameState gameState20 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card18);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card10, (int)(short)1, gameState21);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    dominion.Card[] card_array27 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card28 = new java.util.ArrayList<dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card28, card_array27);
    dominion.GameState gameState30 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card28);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState30.embargos;
    gameState26.gameBoard = hashmap_card_i31;
    dominion.Card[] card_array33 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card34 = new java.util.ArrayList<dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card34, card_array33);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card34);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState36.embargos;
    boolean b38 = gameState36.isGameOver();
    java.util.List<dominion.Player> list_player39 = gameState36.players;
    gameState26.players = list_player39;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i41 = gameState26.gameBoard;
    gameState21.embargos = hashmap_card_i41;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i43 = gameState21.play();
    dominion.Card[] card_array44 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card45 = new java.util.ArrayList<dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card45, card_array44);
    dominion.GameState gameState47 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card45);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i48 = gameState47.embargos;
    boolean b49 = gameState47.isGameOver();
    dominion.Card[] card_array50 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card51 = new java.util.ArrayList<dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card51, card_array50);
    dominion.GameState gameState53 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card51);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState53.embargos;
    gameState47.gameBoard = hashmap_card_i54;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i56 = gameState47.gameBoard;
    gameState21.gameBoard = hashmap_card_i56;
    gameState3.gameBoard = hashmap_card_i56;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + dominion.Card.Type.TREASURE + "'", type14.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i56);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.play();
    java.util.List<dominion.Card> list_card10 = gameState3.cards;
    dominion.Card.CardName cardName11 = dominion.Card.CardName.Council_Room;
    dominion.Card card12 = dominion.Card.getCard(list_card10, cardName11);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.gameBoard;
    boolean b25 = gameState17.isGameOver();
    java.util.List<dominion.Card> list_card26 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card10, 0, gameState17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + dominion.Card.CardName.Council_Room + "'", cardName11.equals(dominion.Card.CardName.Council_Room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.List<dominion.Player> list_player34 = gameState12.players;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i35 = gameState12.getWinners();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState12.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.play();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    dominion.GameState gameState10 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    dominion.Card.Type type11 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card12 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card7, type11);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    java.util.List<dominion.Card> list_card19 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card7, (int)(short)1, gameState18);
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    gameState23.gameBoard = hashmap_card_i28;
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState33.embargos;
    boolean b35 = gameState33.isGameOver();
    java.util.List<dominion.Player> list_player36 = gameState33.players;
    gameState23.players = list_player36;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState23.gameBoard;
    gameState18.embargos = hashmap_card_i38;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState18.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i41 = gameState18.gameBoard;
    dominion.Card[] card_array42 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card43 = new java.util.ArrayList<dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card43, card_array42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card43);
    dominion.Card[] card_array46 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card47 = new java.util.ArrayList<dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card47, card_array46);
    dominion.GameState gameState49 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card47);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i50 = gameState49.embargos;
    gameState45.gameBoard = hashmap_card_i50;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState45.gameBoard;
    boolean b53 = gameState45.isGameOver();
    dominion.Player player55 = new dominion.Player(gameState45, "hi!");
    gameState18.addPlayer(player55);
    dominion.Card card57 = null;
    player55.discard(card57);
    gameState3.addPlayer(player55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + dominion.Card.Type.TREASURE + "'", type11.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.GameState gameState35 = new dominion.GameState(list_card22);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.embargos;
    boolean b41 = gameState39.isGameOver();
    dominion.Card[] card_array42 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card43 = new java.util.ArrayList<dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card43, card_array42);
    dominion.GameState gameState45 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card43);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i46 = gameState45.embargos;
    gameState39.gameBoard = hashmap_card_i46;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i48 = gameState39.gameBoard;
    gameState35.gameBoard = hashmap_card_i48;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i50 = gameState35.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i50);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    dominion.Player player9 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.embargos;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState3.getWinners();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState3.play();
    java.util.List<dominion.Card> list_card13 = gameState3.cards;
    dominion.Card[] card_array15 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card16 = new java.util.ArrayList<dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card16, card_array15);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card16);
    java.lang.String str19 = gameState18.toString();
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState23.embargos;
    dominion.Player player26 = new dominion.Player(gameState23, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i27 = gameState23.getWinners();
    java.util.List<dominion.Card> list_card28 = gameState23.cards;
    dominion.Card.Type type29 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card30 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card28, type29);
    dominion.Card[] card_array32 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card33 = new java.util.ArrayList<dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card33, card_array32);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card33);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState35.embargos;
    dominion.GameState gameState37 = null;
    dominion.Player player39 = new dominion.Player(gameState37, "hi!");
    java.lang.String str40 = player39.toString();
    gameState35.addPlayer(player39);
    java.util.List<dominion.Card> list_card42 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card28, (int)(byte)10, gameState35);
    gameState18.cards = list_card42;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i44 = gameState18.gameBoard;
    java.util.List<dominion.Card> list_card45 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card13, (int)(byte)-1, gameState18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str19.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + dominion.Card.Type.VICTORY + "'", type29.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str40.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    boolean b12 = gameState3.isGameOver();
    boolean b13 = gameState3.isGameOver();
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState17.embargos;
    boolean b19 = gameState17.isGameOver();
    java.util.List<dominion.Player> list_player20 = gameState17.players;
    dominion.GameState gameState21 = gameState17.clone();
    java.util.List<dominion.Card> list_card22 = gameState17.cards;
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.GameState gameState28 = null;
    dominion.Player player30 = new dominion.Player(gameState28, "hi!");
    java.lang.String str31 = player30.toString();
    gameState26.addPlayer(player30);
    gameState17.addPlayer(player30);
    java.lang.String str34 = player30.toString();
    gameState3.addPlayer(player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str31.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str34.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState3.gameBoard;
    boolean b11 = gameState3.isGameOver();
    java.util.List<dominion.Card> list_card12 = gameState3.cards;
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState17.embargos;
    boolean b19 = gameState17.isGameOver();
    dominion.Card[] card_array20 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card21 = new java.util.ArrayList<dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card21, card_array20);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card21);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState23.embargos;
    gameState17.gameBoard = hashmap_card_i24;
    boolean b26 = gameState17.isGameOver();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i27 = gameState17.getWinners();
    java.util.List<dominion.Card> list_card28 = gameState17.cards;
    gameState17.initializeGame();
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.Card.Type type35 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card31, type35);
    dominion.Card[] card_array38 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card39 = new java.util.ArrayList<dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card39, card_array38);
    dominion.GameState gameState41 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    dominion.GameState gameState42 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card39);
    java.util.List<dominion.Card> list_card43 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card31, (int)(short)1, gameState42);
    dominion.Card[] card_array44 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card45 = new java.util.ArrayList<dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card45, card_array44);
    dominion.GameState gameState47 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card45);
    dominion.Card[] card_array48 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card49 = new java.util.ArrayList<dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card49, card_array48);
    dominion.GameState gameState51 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card49);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState51.embargos;
    gameState47.gameBoard = hashmap_card_i52;
    dominion.Card[] card_array54 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card55 = new java.util.ArrayList<dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card55, card_array54);
    dominion.GameState gameState57 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card55);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i58 = gameState57.embargos;
    boolean b59 = gameState57.isGameOver();
    java.util.List<dominion.Player> list_player60 = gameState57.players;
    gameState47.players = list_player60;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i62 = gameState47.gameBoard;
    gameState42.embargos = hashmap_card_i62;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i64 = gameState42.embargos;
    gameState17.embargos = hashmap_card_i64;
    java.util.List<dominion.Card> list_card66 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card12, (int)(byte)100, gameState17);
    dominion.GameState gameState67 = new dominion.GameState(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + dominion.Card.Type.TREASURE + "'", type35.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card66);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState4 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.Type type5 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card6 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type5);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.GameState gameState11 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    dominion.GameState gameState12 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.List<dominion.Card> list_card13 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)arraylist_card1, (int)(short)1, gameState12);
    dominion.Card[] card_array14 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card15 = new java.util.ArrayList<dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card15, card_array14);
    dominion.GameState gameState17 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card15);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState21.embargos;
    gameState17.gameBoard = hashmap_card_i22;
    dominion.Card[] card_array24 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card25 = new java.util.ArrayList<dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card25, card_array24);
    dominion.GameState gameState27 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card25);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState27.embargos;
    boolean b29 = gameState27.isGameOver();
    java.util.List<dominion.Player> list_player30 = gameState27.players;
    gameState17.players = list_player30;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState17.gameBoard;
    gameState12.embargos = hashmap_card_i32;
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i34 = gameState12.play();
    dominion.Card[] card_array35 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card36 = new java.util.ArrayList<dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card36, card_array35);
    dominion.GameState gameState38 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card36);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState38.embargos;
    boolean b40 = gameState38.isGameOver();
    dominion.Card[] card_array41 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card42 = new java.util.ArrayList<dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card42, card_array41);
    dominion.GameState gameState44 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card42);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i45 = gameState44.embargos;
    gameState38.gameBoard = hashmap_card_i45;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState38.gameBoard;
    gameState12.gameBoard = hashmap_card_i47;
    dominion.Card[] card_array49 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card50 = new java.util.ArrayList<dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card50, card_array49);
    dominion.GameState gameState52 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card50);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i53 = gameState52.embargos;
    dominion.Player player55 = new dominion.Player(gameState52, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i56 = gameState52.getWinners();
    java.util.List<dominion.Card> list_card57 = gameState52.cards;
    dominion.Card.Type type58 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card59 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card57, type58);
    dominion.Card[] card_array61 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card62 = new java.util.ArrayList<dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card62, card_array61);
    dominion.GameState gameState64 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card62);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i65 = gameState64.embargos;
    dominion.GameState gameState66 = null;
    dominion.Player player68 = new dominion.Player(gameState66, "hi!");
    java.lang.String str69 = player68.toString();
    gameState64.addPlayer(player68);
    java.util.List<dominion.Card> list_card71 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card57, (int)(byte)10, gameState64);
    dominion.Card[] card_array72 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card73 = new java.util.ArrayList<dominion.Card>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card73, card_array72);
    dominion.GameState gameState75 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card73);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i76 = gameState75.embargos;
    dominion.Player player78 = new dominion.Player(gameState75, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i79 = gameState75.getWinners();
    java.util.List<dominion.Card> list_card80 = gameState75.cards;
    dominion.Card.Type type81 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card82 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card80, type81);
    java.util.List<dominion.Card> list_card83 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card71, type81);
    dominion.Card[] card_array85 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card86 = new java.util.ArrayList<dominion.Card>();
    boolean b87 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card86, card_array85);
    dominion.GameState gameState88 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card86);
    java.util.List<dominion.Card> list_card89 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card83, 100, gameState88);
    gameState12.cards = list_card83;
    java.util.List<dominion.Card> list_card91 = gameState12.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + dominion.Card.Type.TREASURE + "'", type5.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    org.junit.Assert.assertTrue("'" + type58 + "' != '" + dominion.Card.Type.VICTORY + "'", type58.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str69.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    org.junit.Assert.assertTrue("'" + type81 + "' != '" + dominion.Card.Type.VICTORY + "'", type81.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    dominion.Randomness.totalCallsToRandom = (byte)1;

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    dominion.Player player6 = new dominion.Player(gameState3, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    java.util.List<dominion.Card> list_card8 = gameState3.cards;
    dominion.Card.Type type9 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card10 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card8, type9);
    dominion.Card[] card_array12 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card13 = new java.util.ArrayList<dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card13, card_array12);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card13);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState15.embargos;
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    java.lang.String str20 = player19.toString();
    gameState15.addPlayer(player19);
    java.util.List<dominion.Card> list_card22 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card8, (int)(byte)10, gameState15);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.GameState gameState26 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState26.embargos;
    dominion.Player player29 = new dominion.Player(gameState26, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState26.getWinners();
    java.util.List<dominion.Card> list_card31 = gameState26.cards;
    dominion.Card.Type type32 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card33 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card31, type32);
    java.util.List<dominion.Card> list_card34 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card22, type32);
    dominion.Card[] card_array36 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card37 = new java.util.ArrayList<dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card37, card_array36);
    dominion.GameState gameState39 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card37);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState39.embargos;
    boolean b41 = gameState39.isGameOver();
    java.util.List<dominion.Player> list_player42 = gameState39.players;
    gameState39.initializeGame();
    java.util.List<dominion.Card> list_card44 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card22, 0, gameState39);
    dominion.Card[] card_array45 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card46 = new java.util.ArrayList<dominion.Card>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card46, card_array45);
    dominion.GameState gameState48 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card46);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i49 = gameState48.embargos;
    dominion.Player player51 = new dominion.Player(gameState48, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i52 = gameState48.getWinners();
    java.util.List<dominion.Card> list_card53 = gameState48.cards;
    boolean b54 = gameState48.isGameOver();
    dominion.GameState gameState55 = null;
    dominion.Player player57 = new dominion.Player(gameState55, "hi!");
    gameState48.addPlayer(player57);
    gameState39.addPlayer(player57);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i60 = gameState39.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + dominion.Card.Type.VICTORY + "'", type9.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str20.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + dominion.Card.Type.VICTORY + "'", type32.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i60);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Player player11 = new dominion.Player(gameState3, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    dominion.GameState gameState12 = gameState3.clone();
    dominion.Player player14 = new dominion.Player(gameState12, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState12);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card[] card_array4 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card5 = new java.util.ArrayList<dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card5, card_array4);
    dominion.GameState gameState7 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card5);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState7.embargos;
    gameState3.gameBoard = hashmap_card_i8;
    dominion.Card[] card_array10 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card11 = new java.util.ArrayList<dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card11, card_array10);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card11);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState13.embargos;
    boolean b15 = gameState13.isGameOver();
    java.util.List<dominion.Player> list_player16 = gameState13.players;
    gameState3.players = list_player16;
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.GameState gameState21 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState22 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.Card.Type type23 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card24 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card19, type23);
    dominion.GameState gameState26 = null;
    java.util.List<dominion.Card> list_card27 = dominion.Card.availableCostFilter((java.lang.Iterable<dominion.Card>)list_card24, 0, gameState26);
    dominion.Card.CardName cardName28 = dominion.Card.CardName.Salvager;
    dominion.Card card29 = dominion.Card.getCard(list_card24, cardName28);
    gameState3.cards = list_card24;
    dominion.Card[] card_array31 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card32 = new java.util.ArrayList<dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card32, card_array31);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card32);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState34.embargos;
    dominion.Player player37 = new dominion.Player(gameState34, "hi!");
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState34.getWinners();
    java.util.List<dominion.Card> list_card39 = gameState34.cards;
    dominion.Card.Type type40 = dominion.Card.Type.VICTORY;
    java.util.List<dominion.Card> list_card41 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card39, type40);
    dominion.Card.CardName cardName42 = dominion.Card.CardName.Adventurer;
    dominion.Card card43 = dominion.Card.getCard(list_card39, cardName42);
    dominion.Card card44 = dominion.Card.getCard(list_card24, cardName42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + dominion.Card.Type.TREASURE + "'", type23.equals(dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + dominion.Card.CardName.Salvager + "'", cardName28.equals(dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + dominion.Card.Type.VICTORY + "'", type40.equals(dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + dominion.Card.CardName.Adventurer + "'", cardName42.equals(dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card44);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.GameState gameState3 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i4 = gameState3.embargos;
    boolean b5 = gameState3.isGameOver();
    dominion.Card[] card_array6 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card7 = new java.util.ArrayList<dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card7, card_array6);
    dominion.GameState gameState9 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card7);
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState9.embargos;
    gameState3.gameBoard = hashmap_card_i10;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState3.gameBoard;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState3.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState3.embargos;
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState3.embargos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);

  }

}
