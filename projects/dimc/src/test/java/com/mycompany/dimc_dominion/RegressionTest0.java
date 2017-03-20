
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    com.mycompany.dimc_dominion.PlayDominion.main((int)(short)-1, (int)(short)0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    com.mycompany.dimc_dominion.PlayDominion playDominion0 = new com.mycompany.dimc_dominion.PlayDominion();

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Baron;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Baron + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Baron));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.CouncilRoom;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.CouncilRoom + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.CouncilRoom));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.GreatHall;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.GreatHall + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.GreatHall));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Village;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Village + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Village));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    com.mycompany.dimc_dominion.PlayDominion.main(0, (int)(short)-1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Adventurer;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Adventurer + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Adventurer));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Duchy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Duchy + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Duchy));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    long long0 = com.mycompany.dimc_dominion.Randomness.SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 0L);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Card card3 = com.mycompany.dimc_dominion.Randomness.randomMember((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Card card4 = com.mycompany.dimc_dominion.Randomness.randomMember((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.Card.CardName cardName3 = com.mycompany.dimc_dominion.Card.CardName.Smithy;
    com.mycompany.dimc_dominion.Card card4 = com.mycompany.dimc_dominion.Card.getCard((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1, cardName3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Smithy + "'", cardName3.equals(com.mycompany.dimc_dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Gold;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Gold + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Gold));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(byte)10);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Bazaar;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Bazaar + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Bazaar));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = gameState3.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.CutPurse;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.CutPurse + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.CutPurse));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    int i0 = com.mycompany.dimc_dominion.Randomness.totalCallsToRandom;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = gameState3.toString();
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

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    com.mycompany.dimc_dominion.PlayDominion.main(1, 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = (-1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.Province;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Province + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.Province));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.lang.String str4 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str4.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    player8.printStateGame();
    com.mycompany.dimc_dominion.Card card10 = player8.playTreasureCard();
    player8.printStateGame();
    com.mycompany.dimc_dominion.Card card12 = null;
    player8.discard(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = '4';

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    com.mycompany.dimc_dominion.Card.CardName cardName0 = com.mycompany.dimc_dominion.Card.CardName.SeaHag;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.SeaHag + "'", cardName0.equals(com.mycompany.dimc_dominion.Card.CardName.SeaHag));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    com.mycompany.dimc_dominion.Card[] card_array15 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card16 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card16, card_array15);
    com.mycompany.dimc_dominion.GameState gameState18 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card16);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i19 = gameState18.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player20 = gameState18.players;
    com.mycompany.dimc_dominion.Player player21 = null;
    gameState18.addPlayer(player21);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState18.gameBoard;
    gameState3.gameBoard = hashmap_card_i23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i23);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    gameState3.initializeGame((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = (byte)-1;

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    java.lang.String str10 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str10.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Player player6 = com.mycompany.dimc_dominion.Randomness.randomMember(list_player5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.Type type6 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card7 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type6);
    com.mycompany.dimc_dominion.Card.CardName cardName8 = com.mycompany.dimc_dominion.Card.CardName.Market;
    com.mycompany.dimc_dominion.Card card9 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type6.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Market + "'", cardName8.equals(com.mycompany.dimc_dominion.Card.CardName.Market));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card[] card_array4 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card5 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card5, card_array4);
    com.mycompany.dimc_dominion.GameState gameState7 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card5);
    gameState7.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState7.cards;
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState7, "");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card card14 = player12.playTreasureCard();
    gameState3.addPlayer(player12);
    player12.playKingdomCard();
    player12.shuffle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    com.mycompany.dimc_dominion.Randomness.reset(1L);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = '#';

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = 100;

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card[] card_array4 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card5 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card5, card_array4);
    com.mycompany.dimc_dominion.GameState gameState7 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card5);
    gameState7.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState7.cards;
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState7, "");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card card14 = player12.playTreasureCard();
    gameState3.addPlayer(player12);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(-1));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    boolean b35 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(byte)100);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    com.mycompany.dimc_dominion.PlayDominion.main(12, 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card6 = null;
    player5.discard(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card[] card_array4 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card5 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card5, card_array4);
    com.mycompany.dimc_dominion.GameState gameState7 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card5);
    gameState7.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState7.cards;
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState7, "");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card card14 = player12.playTreasureCard();
    gameState3.addPlayer(player12);
    player12.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = gameState3.cards;
    java.lang.String str16 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card17 = gameState3.cards;
    com.mycompany.dimc_dominion.GameState gameState18 = new com.mycompany.dimc_dominion.GameState(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str16.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player35 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player35);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = gameState3.toString();
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

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = gameState3.cards;
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Card card16 = com.mycompany.dimc_dominion.Randomness.randomMember(list_card15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card[] card_array6 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card7 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card7, card_array6);
    com.mycompany.dimc_dominion.GameState gameState9 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card7);
    com.mycompany.dimc_dominion.Card.Type type10 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card11 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card7, type10);
    com.mycompany.dimc_dominion.Card.Type type12 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card11, type12);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card14 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type10.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type12.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 23);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card4 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array12 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card13 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card13, card_array12);
    com.mycompany.dimc_dominion.GameState gameState15 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card13);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState15.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player17 = gameState15.players;
    com.mycompany.dimc_dominion.Player player18 = null;
    gameState15.addPlayer(player18);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState15.gameBoard;
    gameState10.gameBoard = hashmap_card_i20;
    gameState3.gameBoard = hashmap_card_i20;
    java.util.List<com.mycompany.dimc_dominion.Player> list_player23 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player23);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card11 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    com.mycompany.dimc_dominion.PlayDominion.main(5, (-1));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    com.mycompany.dimc_dominion.PlayDominion.main(23, (int)(short)0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    gameState3.initializeGame((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.util.Random random0 = com.mycompany.dimc_dominion.Randomness.random;
    com.mycompany.dimc_dominion.Randomness.random = random0;
    com.mycompany.dimc_dominion.Randomness.random = random0;
    com.mycompany.dimc_dominion.Randomness.random = random0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card.CardName cardName7 = com.mycompany.dimc_dominion.Card.CardName.Copper;
    com.mycompany.dimc_dominion.Card card8 = com.mycompany.dimc_dominion.Card.getCard(list_card6, cardName7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Copper + "'", cardName7.equals(com.mycompany.dimc_dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    com.mycompany.dimc_dominion.PlayDominion.main(1, 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    com.mycompany.dimc_dominion.PlayDominion.main(10, 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    com.mycompany.dimc_dominion.PlayDominion.main(0, 11);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(short)100);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i24 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i24);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    com.mycompany.dimc_dominion.PlayDominion.main(10, (int)(byte)0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    com.mycompany.dimc_dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Player player13 = new com.mycompany.dimc_dominion.Player(gameState11, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card14 = player13.playTreasureCard();
    gameState3.addPlayer(player13);
    com.mycompany.dimc_dominion.Card card16 = null;
    player13.discard(card16);
    java.lang.String str18 = player13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str18.equals(" ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Player> list_player7 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player7);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player5.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i12 = null;
    gameState10.gameBoard = hashmap_card_i12;
    com.mycompany.dimc_dominion.Card[] card_array14 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card15 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card15, card_array14);
    com.mycompany.dimc_dominion.GameState gameState17 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card15);
    gameState17.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card20 = gameState17.cards;
    com.mycompany.dimc_dominion.Player player22 = new com.mycompany.dimc_dominion.Player(gameState17, "");
    player22.printStateGame();
    gameState10.addPlayer(player22);
    com.mycompany.dimc_dominion.Card[] card_array25 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card26 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card26, card_array25);
    com.mycompany.dimc_dominion.GameState gameState28 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card26);
    gameState28.initializeGame((int)(byte)100);
    com.mycompany.dimc_dominion.Card[] card_array31 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card32 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card32, card_array31);
    com.mycompany.dimc_dominion.GameState gameState34 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card32);
    gameState34.initializeGame((int)(byte)100);
    com.mycompany.dimc_dominion.Card[] card_array37 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card38 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card38, card_array37);
    com.mycompany.dimc_dominion.GameState gameState40 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card38);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i41 = gameState40.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array42 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card43 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card43, card_array42);
    com.mycompany.dimc_dominion.GameState gameState45 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card43);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i46 = gameState45.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player47 = gameState45.players;
    com.mycompany.dimc_dominion.Player player48 = null;
    gameState45.addPlayer(player48);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i50 = gameState45.gameBoard;
    gameState40.gameBoard = hashmap_card_i50;
    gameState34.gameBoard = hashmap_card_i50;
    gameState28.gameBoard = hashmap_card_i50;
    gameState10.gameBoard = hashmap_card_i50;
    gameState3.gameBoard = hashmap_card_i50;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i50);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    com.mycompany.dimc_dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Player player13 = new com.mycompany.dimc_dominion.Player(gameState11, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card14 = player13.playTreasureCard();
    gameState3.addPlayer(player13);
    player13.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i11);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    player32.printStateGame();
    player32.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    com.mycompany.dimc_dominion.PlayDominion.main((int)' ', 5);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card[] card_array4 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card5 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card5, card_array4);
    com.mycompany.dimc_dominion.GameState gameState7 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card5);
    gameState7.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState7.cards;
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState7, "");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card card14 = player12.playTreasureCard();
    gameState3.addPlayer(player12);
    gameState3.initializeGame((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    com.mycompany.dimc_dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player8 = gameState3.players;
    com.mycompany.dimc_dominion.Player player9 = com.mycompany.dimc_dominion.Randomness.randomMember(list_player8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(player9);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    player32.printStateGame();
    player32.shuffle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    com.mycompany.dimc_dominion.Card[] card_array11 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card12 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card12, card_array11);
    com.mycompany.dimc_dominion.GameState gameState14 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card12);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i15 = gameState14.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i16 = null;
    gameState14.gameBoard = hashmap_card_i16;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState14.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array19 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card20 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card20, card_array19);
    com.mycompany.dimc_dominion.GameState gameState22 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card20);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState22.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i28 = gameState27.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player29 = gameState27.players;
    com.mycompany.dimc_dominion.Player player30 = null;
    gameState27.addPlayer(player30);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState27.gameBoard;
    gameState22.gameBoard = hashmap_card_i32;
    gameState14.gameBoard = hashmap_card_i32;
    gameState3.gameBoard = hashmap_card_i32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    player15.buyCard();
    java.lang.String str19 = player15.toString();
    player15.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.GameState gameState4 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState4.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState4.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    player8.shuffle();
    com.mycompany.dimc_dominion.Card card10 = null;
    player8.discard(card10);
    player8.shuffle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = player8.toString();
    player8.buyCard();
    com.mycompany.dimc_dominion.Card card11 = player8.playTreasureCard();
    com.mycompany.dimc_dominion.Card card12 = player8.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str9.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(short)1);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    com.mycompany.dimc_dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Player player13 = new com.mycompany.dimc_dominion.Player(gameState11, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card14 = player13.playTreasureCard();
    gameState3.addPlayer(player13);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i16 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i16);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.Type type6 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card7 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type6);
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Card card8 = com.mycompany.dimc_dominion.Randomness.randomMember(list_card5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type6.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    com.mycompany.dimc_dominion.PlayDominion.main((int)' ', 10);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array12 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card13 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card13, card_array12);
    com.mycompany.dimc_dominion.GameState gameState15 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card13);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState15.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player17 = gameState15.players;
    com.mycompany.dimc_dominion.Player player18 = null;
    gameState15.addPlayer(player18);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState15.gameBoard;
    gameState10.gameBoard = hashmap_card_i20;
    gameState3.gameBoard = hashmap_card_i20;
    com.mycompany.dimc_dominion.Card[] card_array23 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card24 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card24, card_array23);
    com.mycompany.dimc_dominion.GameState gameState26 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card24);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player27 = gameState26.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i28 = null;
    gameState26.gameBoard = hashmap_card_i28;
    com.mycompany.dimc_dominion.Card[] card_array30 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card31 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card31, card_array30);
    com.mycompany.dimc_dominion.GameState gameState33 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card31);
    com.mycompany.dimc_dominion.Player player35 = new com.mycompany.dimc_dominion.Player(gameState33, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player35.printStateGame();
    com.mycompany.dimc_dominion.Card[] card_array37 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card38 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card38, card_array37);
    com.mycompany.dimc_dominion.GameState gameState40 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card38);
    gameState40.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card43 = gameState40.cards;
    com.mycompany.dimc_dominion.Player player45 = new com.mycompany.dimc_dominion.Player(gameState40, "");
    player45.printStateGame();
    com.mycompany.dimc_dominion.Card card47 = player45.playTreasureCard();
    com.mycompany.dimc_dominion.Card[] card_array48 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card49 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card49, card_array48);
    com.mycompany.dimc_dominion.GameState gameState51 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card49);
    gameState51.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card54 = gameState51.cards;
    com.mycompany.dimc_dominion.Player player56 = new com.mycompany.dimc_dominion.Player(gameState51, "");
    player56.shuffle();
    com.mycompany.dimc_dominion.Player[] player_array58 = new com.mycompany.dimc_dominion.Player[] { player35, player45, player56 };
    java.util.ArrayList<com.mycompany.dimc_dominion.Player> arraylist_player59 = new java.util.ArrayList<com.mycompany.dimc_dominion.Player>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Player>)arraylist_player59, player_array58);
    com.mycompany.dimc_dominion.Player player61 = com.mycompany.dimc_dominion.Randomness.randomMember((java.util.List<com.mycompany.dimc_dominion.Player>)arraylist_player59);
    player61.shuffle();
    gameState26.addPlayer(player61);
    gameState3.addPlayer(player61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player61);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    com.mycompany.dimc_dominion.PlayDominion.main(9, (int)(short)0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = gameState3.cards;
    java.lang.String str16 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card17 = gameState3.cards;
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i18 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str16.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i18);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(short)-1);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = 1;

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState10, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card[] card_array14 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card15 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card15, card_array14);
    com.mycompany.dimc_dominion.GameState gameState17 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card15);
    gameState17.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card20 = gameState17.cards;
    com.mycompany.dimc_dominion.Player player22 = new com.mycompany.dimc_dominion.Player(gameState17, "");
    player22.printStateGame();
    com.mycompany.dimc_dominion.Card card24 = player22.playTreasureCard();
    com.mycompany.dimc_dominion.Card[] card_array25 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card26 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card26, card_array25);
    com.mycompany.dimc_dominion.GameState gameState28 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card26);
    gameState28.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card31 = gameState28.cards;
    com.mycompany.dimc_dominion.Player player33 = new com.mycompany.dimc_dominion.Player(gameState28, "");
    player33.shuffle();
    com.mycompany.dimc_dominion.Player[] player_array35 = new com.mycompany.dimc_dominion.Player[] { player12, player22, player33 };
    java.util.ArrayList<com.mycompany.dimc_dominion.Player> arraylist_player36 = new java.util.ArrayList<com.mycompany.dimc_dominion.Player>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Player>)arraylist_player36, player_array35);
    com.mycompany.dimc_dominion.Player player38 = com.mycompany.dimc_dominion.Randomness.randomMember((java.util.List<com.mycompany.dimc_dominion.Player>)arraylist_player36);
    player38.shuffle();
    gameState3.addPlayer(player38);
    player38.buyCard();
    com.mycompany.dimc_dominion.Card card42 = player38.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card42);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    com.mycompany.dimc_dominion.Card[] card_array6 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card7 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card7, card_array6);
    com.mycompany.dimc_dominion.GameState gameState9 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card7);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState9.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array11 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card12 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card12, card_array11);
    com.mycompany.dimc_dominion.GameState gameState14 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card12);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i15 = gameState14.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player16 = gameState14.players;
    com.mycompany.dimc_dominion.Player player17 = null;
    gameState14.addPlayer(player17);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState14.gameBoard;
    gameState9.gameBoard = hashmap_card_i19;
    gameState3.gameBoard = hashmap_card_i19;
    com.mycompany.dimc_dominion.Card[] card_array22 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card23 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card23, card_array22);
    com.mycompany.dimc_dominion.GameState gameState25 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card23);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState25.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array27 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card28 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card28, card_array27);
    com.mycompany.dimc_dominion.GameState gameState30 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card28);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i31 = gameState30.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player32 = gameState30.players;
    com.mycompany.dimc_dominion.Player player33 = null;
    gameState30.addPlayer(player33);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState30.gameBoard;
    gameState25.gameBoard = hashmap_card_i35;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i37 = gameState25.gameBoard;
    gameState3.gameBoard = hashmap_card_i37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i37);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.Type type6 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card7 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type6);
    com.mycompany.dimc_dominion.Card.CardName cardName8 = com.mycompany.dimc_dominion.Card.CardName.Silver;
    com.mycompany.dimc_dominion.Card card9 = com.mycompany.dimc_dominion.Card.getCard(list_card7, cardName8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type6.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Silver + "'", cardName8.equals(com.mycompany.dimc_dominion.Card.CardName.Silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    player15.buyCard();
    gameState3.addPlayer(player15);
    player15.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    player8.shuffle();
    player8.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState3, "The board game is embty you need to intialize the game!!!!");
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card6 = player5.playTreasureCard();
    com.mycompany.dimc_dominion.Card card7 = null;
    player5.discard(card7);
    player5.shuffle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    java.lang.String str6 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = com.mycompany.dimc_dominion.Randomness.nextRandomInt((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState3.cards;
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState3.getWinners();
    boolean b12 = gameState3.isGameOver();
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.play();
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card24 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Player> list_player25 = gameState3.players;
    java.lang.String str26 = gameState3.toString();
    com.mycompany.dimc_dominion.Card[] card_array27 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card28 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card28, card_array27);
    com.mycompany.dimc_dominion.GameState gameState30 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card28);
    gameState30.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card33 = gameState30.cards;
    com.mycompany.dimc_dominion.Player player35 = new com.mycompany.dimc_dominion.Player(gameState30, "");
    player35.printStateGame();
    gameState3.addPlayer(player35);
    com.mycompany.dimc_dominion.Player player38 = null;
    gameState3.addPlayer(player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str26.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    boolean b10 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(byte)0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    player8.printStateGame();
    com.mycompany.dimc_dominion.Card card10 = player8.playTreasureCard();
    player8.printStateGame();
    player8.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Gardens;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    com.mycompany.dimc_dominion.Card.CardName cardName8 = com.mycompany.dimc_dominion.Card.CardName.MoneyLender;
    com.mycompany.dimc_dominion.Card card9 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Gardens + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.MoneyLender + "'", cardName8.equals(com.mycompany.dimc_dominion.Card.CardName.MoneyLender));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = gameState3.cards;
    java.lang.String str16 = gameState3.toString();
    com.mycompany.dimc_dominion.Card[] card_array17 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card18 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card18, card_array17);
    com.mycompany.dimc_dominion.GameState gameState20 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card18);
    gameState20.initializeGame((int)(byte)100);
    com.mycompany.dimc_dominion.Card[] card_array23 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card24 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card24, card_array23);
    com.mycompany.dimc_dominion.GameState gameState26 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card24);
    gameState26.initializeGame((int)(byte)100);
    com.mycompany.dimc_dominion.Card[] card_array29 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card30 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card30, card_array29);
    com.mycompany.dimc_dominion.GameState gameState32 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card30);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i33 = gameState32.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array34 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card35 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card35, card_array34);
    com.mycompany.dimc_dominion.GameState gameState37 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card35);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState37.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player39 = gameState37.players;
    com.mycompany.dimc_dominion.Player player40 = null;
    gameState37.addPlayer(player40);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i42 = gameState37.gameBoard;
    gameState32.gameBoard = hashmap_card_i42;
    gameState26.gameBoard = hashmap_card_i42;
    gameState20.gameBoard = hashmap_card_i42;
    gameState3.gameBoard = hashmap_card_i42;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str16.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card24 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Player> list_player25 = gameState3.players;
    java.lang.String str26 = gameState3.toString();
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i27 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str26.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i27);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    com.mycompany.dimc_dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Player player13 = new com.mycompany.dimc_dominion.Player(gameState11, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card14 = player13.playTreasureCard();
    gameState3.addPlayer(player13);
    com.mycompany.dimc_dominion.Card card16 = null;
    player13.discard(card16);
    player13.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card6 = player5.playTreasureCard();
    com.mycompany.dimc_dominion.Card card7 = null;
    player5.discard(card7);
    player5.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    com.mycompany.dimc_dominion.PlayDominion.main((int)(short)100, 1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = gameState3.cards;
    java.lang.String str16 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card17 = gameState3.cards;
    gameState3.initializeGame((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str16.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    com.mycompany.dimc_dominion.Randomness.totalCallsToRandom = (short)0;

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array12 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card13 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card13, card_array12);
    com.mycompany.dimc_dominion.GameState gameState15 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card13);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState15.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player17 = gameState15.players;
    com.mycompany.dimc_dominion.Player player18 = null;
    gameState15.addPlayer(player18);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState15.gameBoard;
    gameState10.gameBoard = hashmap_card_i20;
    gameState3.gameBoard = hashmap_card_i20;
    com.mycompany.dimc_dominion.Player player24 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState3.play();
    com.mycompany.dimc_dominion.Card[] card_array27 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card28 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card28, card_array27);
    com.mycompany.dimc_dominion.GameState gameState30 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card28);
    com.mycompany.dimc_dominion.Card[] card_array31 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card32 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card32, card_array31);
    com.mycompany.dimc_dominion.GameState gameState34 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card32);
    gameState34.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card37 = gameState34.cards;
    com.mycompany.dimc_dominion.Player player39 = new com.mycompany.dimc_dominion.Player(gameState34, "");
    player39.printStateGame();
    com.mycompany.dimc_dominion.Card card41 = player39.playTreasureCard();
    gameState30.addPlayer(player39);
    gameState3.addPlayer(player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Card card8 = com.mycompany.dimc_dominion.Randomness.randomMember(list_card5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player5.printStateGame();
    java.lang.String str7 = player5.toString();
    java.lang.String str8 = player5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str7.equals(" ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str8.equals(" ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState3, "The board game is embty you need to intialize the game!!!!");
    player12.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array12 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card13 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card13, card_array12);
    com.mycompany.dimc_dominion.GameState gameState15 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card13);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState15.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player17 = gameState15.players;
    com.mycompany.dimc_dominion.Player player18 = null;
    gameState15.addPlayer(player18);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState15.gameBoard;
    gameState10.gameBoard = hashmap_card_i20;
    gameState3.gameBoard = hashmap_card_i20;
    com.mycompany.dimc_dominion.Player player24 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    com.mycompany.dimc_dominion.PlayDominion.main((int)(short)100, (int)(short)0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    com.mycompany.dimc_dominion.PlayDominion.main((-1), 9);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card6 = player5.playTreasureCard();
    com.mycompany.dimc_dominion.Card card7 = null;
    player5.discard(card7);
    player5.buyCard();
    player5.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card6);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState3.cards;
    com.mycompany.dimc_dominion.Card.CardName cardName11 = com.mycompany.dimc_dominion.Card.CardName.MoneyLender;
    com.mycompany.dimc_dominion.Card card12 = com.mycompany.dimc_dominion.Card.getCard(list_card10, cardName11);
    com.mycompany.dimc_dominion.GameState gameState13 = new com.mycompany.dimc_dominion.GameState(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.MoneyLender + "'", cardName11.equals(com.mycompany.dimc_dominion.Card.CardName.MoneyLender));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card[] card_array4 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card5 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card5, card_array4);
    com.mycompany.dimc_dominion.GameState gameState7 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card5);
    gameState7.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState7.cards;
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState7, "");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card card14 = player12.playTreasureCard();
    gameState3.addPlayer(player12);
    com.mycompany.dimc_dominion.Card[] card_array16 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card17 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card17, card_array16);
    com.mycompany.dimc_dominion.GameState gameState19 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card17);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i20 = gameState19.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array21 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card22 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card22, card_array21);
    com.mycompany.dimc_dominion.GameState gameState24 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card22);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player26 = gameState24.players;
    com.mycompany.dimc_dominion.Player player27 = null;
    gameState24.addPlayer(player27);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i29 = gameState24.gameBoard;
    gameState19.gameBoard = hashmap_card_i29;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState19.gameBoard;
    gameState3.gameBoard = hashmap_card_i31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    com.mycompany.dimc_dominion.Player player19 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card24 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Player> list_player25 = gameState3.players;
    java.lang.String str26 = gameState3.toString();
    com.mycompany.dimc_dominion.Card[] card_array27 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card28 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card28, card_array27);
    com.mycompany.dimc_dominion.GameState gameState30 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card28);
    gameState30.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card33 = gameState30.cards;
    com.mycompany.dimc_dominion.Card[] card_array34 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card35 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card35, card_array34);
    com.mycompany.dimc_dominion.GameState gameState37 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card35);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState37.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array39 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card40 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card40, card_array39);
    com.mycompany.dimc_dominion.GameState gameState42 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card40);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i43 = gameState42.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player44 = gameState42.players;
    com.mycompany.dimc_dominion.Player player45 = null;
    gameState42.addPlayer(player45);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState42.gameBoard;
    gameState37.gameBoard = hashmap_card_i47;
    gameState30.gameBoard = hashmap_card_i47;
    com.mycompany.dimc_dominion.Player player51 = new com.mycompany.dimc_dominion.Player(gameState30, " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card[] card_array52 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card53 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card53, card_array52);
    com.mycompany.dimc_dominion.GameState gameState55 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card53);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i56 = gameState55.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i57 = null;
    gameState55.gameBoard = hashmap_card_i57;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i59 = gameState55.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array60 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card61 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card61, card_array60);
    com.mycompany.dimc_dominion.GameState gameState63 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card61);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i64 = gameState63.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array65 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card66 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card66, card_array65);
    com.mycompany.dimc_dominion.GameState gameState68 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card66);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i69 = gameState68.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player70 = gameState68.players;
    com.mycompany.dimc_dominion.Player player71 = null;
    gameState68.addPlayer(player71);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i73 = gameState68.gameBoard;
    gameState63.gameBoard = hashmap_card_i73;
    gameState55.gameBoard = hashmap_card_i73;
    gameState30.gameBoard = hashmap_card_i73;
    gameState3.gameBoard = hashmap_card_i73;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str26.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i73);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)(byte)-1);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState10, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    player12.printStateGame();
    com.mycompany.dimc_dominion.Card[] card_array14 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card15 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card15, card_array14);
    com.mycompany.dimc_dominion.GameState gameState17 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card15);
    gameState17.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card20 = gameState17.cards;
    com.mycompany.dimc_dominion.Player player22 = new com.mycompany.dimc_dominion.Player(gameState17, "");
    player22.printStateGame();
    com.mycompany.dimc_dominion.Card card24 = player22.playTreasureCard();
    com.mycompany.dimc_dominion.Card[] card_array25 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card26 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card26, card_array25);
    com.mycompany.dimc_dominion.GameState gameState28 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card26);
    gameState28.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card31 = gameState28.cards;
    com.mycompany.dimc_dominion.Player player33 = new com.mycompany.dimc_dominion.Player(gameState28, "");
    player33.shuffle();
    com.mycompany.dimc_dominion.Player[] player_array35 = new com.mycompany.dimc_dominion.Player[] { player12, player22, player33 };
    java.util.ArrayList<com.mycompany.dimc_dominion.Player> arraylist_player36 = new java.util.ArrayList<com.mycompany.dimc_dominion.Player>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Player>)arraylist_player36, player_array35);
    com.mycompany.dimc_dominion.Player player38 = com.mycompany.dimc_dominion.Randomness.randomMember((java.util.List<com.mycompany.dimc_dominion.Player>)arraylist_player36);
    player38.shuffle();
    gameState3.addPlayer(player38);
    com.mycompany.dimc_dominion.Card[] card_array41 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card42 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card42, card_array41);
    com.mycompany.dimc_dominion.GameState gameState44 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card42);
    gameState44.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card47 = gameState44.cards;
    com.mycompany.dimc_dominion.Card[] card_array48 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card49 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card49, card_array48);
    com.mycompany.dimc_dominion.GameState gameState51 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card49);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i52 = gameState51.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array53 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card54 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card54, card_array53);
    com.mycompany.dimc_dominion.GameState gameState56 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card54);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i57 = gameState56.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player58 = gameState56.players;
    com.mycompany.dimc_dominion.Player player59 = null;
    gameState56.addPlayer(player59);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i61 = gameState56.gameBoard;
    gameState51.gameBoard = hashmap_card_i61;
    gameState44.gameBoard = hashmap_card_i61;
    gameState3.gameBoard = hashmap_card_i61;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i61);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Card.Type type12 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card9, type12);
    com.mycompany.dimc_dominion.Card.Type type14 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card13, type14);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card16 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type14);
    com.mycompany.dimc_dominion.GameState gameState17 = new com.mycompany.dimc_dominion.GameState(list_card5);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i18 = gameState17.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type12.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type14.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i18);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    com.mycompany.dimc_dominion.Card[] card_array10 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card11 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card11, card_array10);
    com.mycompany.dimc_dominion.GameState gameState13 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card11);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState13.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i15 = null;
    gameState13.gameBoard = hashmap_card_i15;
    com.mycompany.dimc_dominion.Card[] card_array17 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card18 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card18, card_array17);
    com.mycompany.dimc_dominion.GameState gameState20 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card18);
    gameState20.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card23 = gameState20.cards;
    com.mycompany.dimc_dominion.Player player25 = new com.mycompany.dimc_dominion.Player(gameState20, "");
    player25.printStateGame();
    gameState13.addPlayer(player25);
    player25.buyCard();
    java.lang.String str29 = player25.toString();
    player25.shuffle();
    gameState3.addPlayer(player25);
    boolean b32 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str29.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    java.lang.Iterable<com.mycompany.dimc_dominion.Card> iterable_card0 = null;
    com.mycompany.dimc_dominion.Card[] card_array1 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card2 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card2, card_array1);
    com.mycompany.dimc_dominion.GameState gameState4 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card2);
    com.mycompany.dimc_dominion.Card.Type type5 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card2, type5);
    com.mycompany.dimc_dominion.Card.CardName cardName7 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card8 = com.mycompany.dimc_dominion.Card.getCard(list_card6, cardName7);
    com.mycompany.dimc_dominion.Card[] card_array9 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card10 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card10, card_array9);
    com.mycompany.dimc_dominion.GameState gameState12 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card10);
    com.mycompany.dimc_dominion.Card.Type type13 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card14 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card10, type13);
    com.mycompany.dimc_dominion.Card.Type type15 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card16 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card14, type15);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card17 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card6, type15);
    com.mycompany.dimc_dominion.Card[] card_array18 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card19 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card19, card_array18);
    com.mycompany.dimc_dominion.GameState gameState21 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card19);
    com.mycompany.dimc_dominion.Card.Type type22 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card23 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card19, type22);
    com.mycompany.dimc_dominion.Card.Type type24 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card25 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card23, type24);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card26 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card17, type24);
    com.mycompany.dimc_dominion.Card.Type type27 = com.mycompany.dimc_dominion.Card.Type.TREASURE;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card28 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card17, type27);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<com.mycompany.dimc_dominion.Card> list_card29 = com.mycompany.dimc_dominion.Card.filter(iterable_card0, type27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type5.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName7.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type13.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type15.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type22.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type24.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + com.mycompany.dimc_dominion.Card.Type.TREASURE + "'", type27.equals(com.mycompany.dimc_dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Card.Type type12 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card9, type12);
    com.mycompany.dimc_dominion.Card.Type type14 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card13, type14);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card16 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type14);
    com.mycompany.dimc_dominion.Card[] card_array17 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card18 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card18, card_array17);
    com.mycompany.dimc_dominion.GameState gameState20 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card18);
    com.mycompany.dimc_dominion.Card.Type type21 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card22 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card18, type21);
    com.mycompany.dimc_dominion.Card.Type type23 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card24 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card22, type23);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card25 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card16, type23);
    com.mycompany.dimc_dominion.Card.Type type26 = com.mycompany.dimc_dominion.Card.Type.TREASURE;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card27 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card16, type26);
    com.mycompany.dimc_dominion.Card.Type type28 = com.mycompany.dimc_dominion.Card.Type.ACTION;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card29 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card27, type28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type12.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type14.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type21.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type23.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + com.mycompany.dimc_dominion.Card.Type.TREASURE + "'", type26.equals(com.mycompany.dimc_dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + com.mycompany.dimc_dominion.Card.Type.ACTION + "'", type28.equals(com.mycompany.dimc_dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    com.mycompany.dimc_dominion.Randomness.reset((long)23);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    boolean b9 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    player15.buyCard();
    java.lang.String str19 = player15.toString();
    player15.shuffle();
    player15.shuffle();
    com.mycompany.dimc_dominion.Card card22 = player15.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    gameState3.initializeGame(1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i37 = gameState3.play();
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player39 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState3, "The board game is embty you need to intialize the game!!!!");
    player12.shuffle();
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
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    gameState3.initializeGame((int)'4');
    com.mycompany.dimc_dominion.Player player12 = new com.mycompany.dimc_dominion.Player(gameState3, "The board game is embty you need to intialize the game!!!!");
    player12.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    com.mycompany.dimc_dominion.PlayDominion.main(0, (int)'a');

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    com.mycompany.dimc_dominion.Card card18 = null;
    player15.discard(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Player player5 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.lang.String str6 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str6.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    com.mycompany.dimc_dominion.PlayDominion.main(100, 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    gameState3.initializeGame(1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i37 = gameState3.play();
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState3.getWinners();
    gameState3.initializeGame(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i38);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array12 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card13 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card13, card_array12);
    com.mycompany.dimc_dominion.GameState gameState15 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card13);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState15.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player17 = gameState15.players;
    com.mycompany.dimc_dominion.Player player18 = null;
    gameState15.addPlayer(player18);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState15.gameBoard;
    gameState10.gameBoard = hashmap_card_i20;
    gameState3.gameBoard = hashmap_card_i20;
    com.mycompany.dimc_dominion.Player player24 = new com.mycompany.dimc_dominion.Player(gameState3, " ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState3.getWinners();
    java.lang.String str26 = gameState3.toString();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str26.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    java.lang.String str9 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card10 = gameState3.cards;
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState3.getWinners();
    boolean b12 = gameState3.isGameOver();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card14 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str9.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.Type type6 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card7 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type6);
    // The following exception was thrown during execution in test generation
    try {
    com.mycompany.dimc_dominion.Card card8 = com.mycompany.dimc_dominion.Randomness.randomMember(list_card7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type6.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    player8.shuffle();
    com.mycompany.dimc_dominion.Card card10 = player8.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player5 = gameState3.players;
    com.mycompany.dimc_dominion.Player player6 = null;
    gameState3.addPlayer(player6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Player player13 = new com.mycompany.dimc_dominion.Player(gameState11, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    com.mycompany.dimc_dominion.Card card14 = player13.playTreasureCard();
    gameState3.addPlayer(player13);
    java.lang.String str16 = gameState3.toString();
    java.util.List<com.mycompany.dimc_dominion.Card> list_card17 = gameState3.cards;
    java.lang.String str18 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str16.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str18.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Ambassador;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    com.mycompany.dimc_dominion.Card.Type type8 = com.mycompany.dimc_dominion.Card.Type.TREASURE;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card9 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type8);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState(list_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState10.play();
    java.lang.String str12 = gameState10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Ambassador + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + com.mycompany.dimc_dominion.Card.Type.TREASURE + "'", type8.equals(com.mycompany.dimc_dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str12.equals("The board game is embty you need to intialize the game!!!!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array5 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card6 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card6, card_array5);
    com.mycompany.dimc_dominion.GameState gameState8 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card6);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState8.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player10 = gameState8.players;
    com.mycompany.dimc_dominion.Player player11 = null;
    gameState8.addPlayer(player11);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState8.gameBoard;
    gameState3.gameBoard = hashmap_card_i13;
    gameState3.initializeGame(0);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState3.gameBoard;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card18 = gameState3.cards;
    com.mycompany.dimc_dominion.GameState gameState19 = new com.mycompany.dimc_dominion.GameState(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    com.mycompany.dimc_dominion.PlayDominion.main(10, (int)(short)100);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Card.Type type12 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card9, type12);
    com.mycompany.dimc_dominion.Card.Type type14 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card13, type14);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card16 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type14);
    com.mycompany.dimc_dominion.Card.CardName cardName17 = com.mycompany.dimc_dominion.Card.CardName.Curse;
    com.mycompany.dimc_dominion.Card card18 = com.mycompany.dimc_dominion.Card.getCard(list_card16, cardName17);
    com.mycompany.dimc_dominion.Card[] card_array19 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card20 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card20, card_array19);
    com.mycompany.dimc_dominion.GameState gameState22 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card20);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState22.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i28 = gameState27.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player29 = gameState27.players;
    com.mycompany.dimc_dominion.Player player30 = null;
    gameState27.addPlayer(player30);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState27.gameBoard;
    gameState22.gameBoard = hashmap_card_i32;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card34 = gameState22.cards;
    com.mycompany.dimc_dominion.GameState gameState35 = new com.mycompany.dimc_dominion.GameState(list_card34);
    com.mycompany.dimc_dominion.Card.Type type36 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card37 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card34, type36);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card38 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card16, type36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type12.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type14.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Curse + "'", cardName17.equals(com.mycompany.dimc_dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type36.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.List<com.mycompany.dimc_dominion.Player> list_player4 = gameState3.players;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    gameState3.initializeGame(100);
    com.mycompany.dimc_dominion.Card[] card_array9 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card10 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card10, card_array9);
    com.mycompany.dimc_dominion.GameState gameState12 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card10);
    gameState12.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = gameState12.cards;
    com.mycompany.dimc_dominion.Player player17 = new com.mycompany.dimc_dominion.Player(gameState12, "");
    player17.shuffle();
    com.mycompany.dimc_dominion.Card card19 = null;
    player17.discard(card19);
    gameState3.addPlayer(player17);
    player17.shuffle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    player15.buyCard();
    java.lang.String str19 = player15.toString();
    player15.shuffle();
    player15.shuffle();
    player15.shuffle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    gameState3.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card6 = gameState3.cards;
    com.mycompany.dimc_dominion.Player player8 = new com.mycompany.dimc_dominion.Player(gameState3, "");
    player8.shuffle();
    player8.buyCard();
    java.lang.String str11 = player8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str11.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    com.mycompany.dimc_dominion.Card[] card_array24 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card25 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card25, card_array24);
    com.mycompany.dimc_dominion.GameState gameState27 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card25);
    gameState27.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = gameState27.cards;
    com.mycompany.dimc_dominion.Player player32 = new com.mycompany.dimc_dominion.Player(gameState27, "");
    java.lang.String str33 = player32.toString();
    gameState3.addPlayer(player32);
    com.mycompany.dimc_dominion.Player player36 = new com.mycompany.dimc_dominion.Player(gameState3, "The board game is embty you need to intialize the game!!!!");
    com.mycompany.dimc_dominion.Card card37 = player36.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str33.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card37);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState11.getWinners();
    com.mycompany.dimc_dominion.Card[] card_array13 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card14 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card14, card_array13);
    com.mycompany.dimc_dominion.GameState gameState16 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card14);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState16.getWinners();
    java.util.List<com.mycompany.dimc_dominion.Player> list_player18 = gameState16.players;
    com.mycompany.dimc_dominion.Player player19 = null;
    gameState16.addPlayer(player19);
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState16.gameBoard;
    gameState11.gameBoard = hashmap_card_i21;
    gameState3.gameBoard = hashmap_card_i21;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card24 = gameState3.cards;
    java.util.List<com.mycompany.dimc_dominion.Player> list_player25 = gameState3.players;
    java.lang.String str26 = gameState3.toString();
    com.mycompany.dimc_dominion.Card[] card_array27 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card28 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card28, card_array27);
    com.mycompany.dimc_dominion.GameState gameState30 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card28);
    gameState30.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card33 = gameState30.cards;
    com.mycompany.dimc_dominion.Player player35 = new com.mycompany.dimc_dominion.Player(gameState30, "");
    player35.printStateGame();
    gameState3.addPlayer(player35);
    player35.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "The board game is embty you need to intialize the game!!!!"+ "'", str26.equals("The board game is embty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    java.util.HashMap<com.mycompany.dimc_dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState3.getWinners();
    java.util.HashMap<com.mycompany.dimc_dominion.Card,java.lang.Integer> hashmap_card_i5 = null;
    gameState3.gameBoard = hashmap_card_i5;
    com.mycompany.dimc_dominion.Card[] card_array7 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card8 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card8, card_array7);
    com.mycompany.dimc_dominion.GameState gameState10 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card8);
    gameState10.initializeGame((int)(byte)100);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = gameState10.cards;
    com.mycompany.dimc_dominion.Player player15 = new com.mycompany.dimc_dominion.Player(gameState10, "");
    player15.printStateGame();
    gameState3.addPlayer(player15);
    player15.buyCard();
    java.lang.String str19 = player15.toString();
    com.mycompany.dimc_dominion.Card card20 = player15.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str19.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card[] card_array6 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card7 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card7, card_array6);
    com.mycompany.dimc_dominion.GameState gameState9 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card7);
    com.mycompany.dimc_dominion.Card.Type type10 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card11 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card7, type10);
    com.mycompany.dimc_dominion.Card.Type type12 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card11, type12);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card14 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type10.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type12.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    com.mycompany.dimc_dominion.Card[] card_array0 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card1 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card1, card_array0);
    com.mycompany.dimc_dominion.GameState gameState3 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card1);
    com.mycompany.dimc_dominion.Card.Type type4 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card5 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card1, type4);
    com.mycompany.dimc_dominion.Card.CardName cardName6 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card7 = com.mycompany.dimc_dominion.Card.getCard(list_card5, cardName6);
    com.mycompany.dimc_dominion.Card[] card_array8 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card9 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card9, card_array8);
    com.mycompany.dimc_dominion.GameState gameState11 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card9);
    com.mycompany.dimc_dominion.Card.Type type12 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card13 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card9, type12);
    com.mycompany.dimc_dominion.Card.Type type14 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card15 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card13, type14);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card16 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card5, type14);
    com.mycompany.dimc_dominion.Card[] card_array17 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card18 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card18, card_array17);
    com.mycompany.dimc_dominion.GameState gameState20 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card18);
    com.mycompany.dimc_dominion.Card.Type type21 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card22 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card18, type21);
    com.mycompany.dimc_dominion.Card.CardName cardName23 = com.mycompany.dimc_dominion.Card.CardName.Estate;
    com.mycompany.dimc_dominion.Card card24 = com.mycompany.dimc_dominion.Card.getCard(list_card22, cardName23);
    com.mycompany.dimc_dominion.Card[] card_array25 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card26 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card26, card_array25);
    com.mycompany.dimc_dominion.GameState gameState28 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card26);
    com.mycompany.dimc_dominion.Card.Type type29 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card30 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card26, type29);
    com.mycompany.dimc_dominion.Card.Type type31 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card32 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card30, type31);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card33 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card22, type31);
    com.mycompany.dimc_dominion.Card[] card_array34 = new com.mycompany.dimc_dominion.Card[] {  };
    java.util.ArrayList<com.mycompany.dimc_dominion.Card> arraylist_card35 = new java.util.ArrayList<com.mycompany.dimc_dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<com.mycompany.dimc_dominion.Card>)arraylist_card35, card_array34);
    com.mycompany.dimc_dominion.GameState gameState37 = new com.mycompany.dimc_dominion.GameState((java.util.List<com.mycompany.dimc_dominion.Card>)arraylist_card35);
    com.mycompany.dimc_dominion.Card.Type type38 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card39 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)arraylist_card35, type38);
    com.mycompany.dimc_dominion.Card.Type type40 = com.mycompany.dimc_dominion.Card.Type.VICTORY;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card41 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card39, type40);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card42 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card33, type40);
    com.mycompany.dimc_dominion.Card.Type type43 = com.mycompany.dimc_dominion.Card.Type.TREASURE;
    java.util.List<com.mycompany.dimc_dominion.Card> list_card44 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card33, type43);
    java.util.List<com.mycompany.dimc_dominion.Card> list_card45 = com.mycompany.dimc_dominion.Card.filter((java.lang.Iterable<com.mycompany.dimc_dominion.Card>)list_card16, type43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type4.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName6.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type12.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type14.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type21.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + com.mycompany.dimc_dominion.Card.CardName.Estate + "'", cardName23.equals(com.mycompany.dimc_dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type29.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type31.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type38.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + com.mycompany.dimc_dominion.Card.Type.VICTORY + "'", type40.equals(com.mycompany.dimc_dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + com.mycompany.dimc_dominion.Card.Type.TREASURE + "'", type43.equals(com.mycompany.dimc_dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);

  }

}
