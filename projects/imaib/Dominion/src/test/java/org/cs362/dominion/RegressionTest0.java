
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Festival;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Festival + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Festival));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Duchy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Duchy));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Baron;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Baron + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Baron));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Council_Room;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Council_Room + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Council_Room));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 63);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Estate;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Estate));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    org.cs362.dominion.PlayDominion playDominion0 = new org.cs362.dominion.PlayDominion();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Feast;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Feast + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Feast));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Adventurer;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Adventurer + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Adventurer));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Village;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Village + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Village));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Ambassador;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Ambassador + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Ambassador));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Great_Hall;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Great_Hall));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Gardens;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Gardens));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Gold;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Gold));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Copper;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Copper));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.cs362.dominion.Randomness.nextRandomInt(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    java.lang.Iterable<org.cs362.dominion.Card> iterable_card0 = null;
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter(iterable_card0, type1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Silver;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Silver + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Silver));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    org.cs362.dominion.Card.Type type0 = org.cs362.dominion.Card.Type.ACTION;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type0.equals(org.cs362.dominion.Card.Type.ACTION));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    long long0 = org.cs362.dominion.Randomness.SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1487983031222L);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)10;

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    int i0 = org.cs362.dominion.Randomness.totalCallsToRandom;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (-1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    // The following exception was thrown during execution in test generation
    try {
    gameState5.prepTestGame();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = gameState5.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 'a';

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState5.play();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card card14 = null;
    // The following exception was thrown during execution in test generation
    try {
    player13.AdventurerDiscard(card14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    java.util.Random random0 = null;
    org.cs362.dominion.Randomness.random = random0;

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = null;
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState19, "");
    gameState5.addPlayer(player21);
    gameState5.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    // The following exception was thrown during execution in test generation
    try {
    player13.printStateGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Province;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Province + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Province));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState8 = gameState5.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Curse;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Curse));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Laboratory;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Laboratory + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Laboratory));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName9 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card10 = org.cs362.dominion.Card.getCard(list_card8, cardName9);
    gameState5.cards = list_card8;
    // The following exception was thrown during execution in test generation
    try {
    gameState5.prepTestGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName9.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card10);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    java.lang.String str9 = player7.toString();
    player7.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str9.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    java.util.Random random0 = org.cs362.dominion.Randomness.random;
    org.cs362.dominion.Randomness.random = random0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(random0);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    player7.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState19, "");
    gameState5.addPlayer(player21);
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    org.cs362.dominion.Card.CardName cardName26 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card27 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card24, cardName26);
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card24);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i29 = null;
    gameState28.gameBoard = hashmap_card_i29;
    org.cs362.dominion.Player[] player_array31 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player32 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player32, player_array31);
    gameState28.players = arraylist_player32;
    org.cs362.dominion.Player player36 = new org.cs362.dominion.Player(gameState28, "");
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    org.cs362.dominion.Card.CardName cardName40 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card41 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card38, cardName40);
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card38);
    org.cs362.dominion.Player player44 = new org.cs362.dominion.Player(gameState42, "");
    gameState28.addPlayer(player44);
    player44.buyCard();
    gameState5.addPlayer(player44);
    player44.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName26.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    org.junit.Assert.assertTrue("'" + cardName40 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName40.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    java.lang.String str9 = player7.toString();
    player7.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type12 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card11, type12);
    player7.trashpile = list_card11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str9.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type12.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName7 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card8 = org.cs362.dominion.Card.getCard(list_card6, cardName7);
    boolean b10 = card8.equals((java.lang.Object)'4');
    org.cs362.dominion.Card.Type type11 = card8.getType();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card1, type11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type11.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = gameState5.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState19, "");
    gameState5.addPlayer(player21);
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState5.play();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card.Type type5 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card1, type5);
    org.cs362.dominion.Card.CardName cardName7 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card8 = org.cs362.dominion.Card.getCard(list_card6, cardName7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card8);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card6);
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState10, "");
    java.lang.String str13 = player12.toString();
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    gameState19.initializeGame();
    card2.play(player12, gameState19);
    player12.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type3.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str13.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    player13.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    player29.playKingdomCard();
    player29.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    org.cs362.dominion.Randomness.reset((long)10);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState19, "");
    gameState5.addPlayer(player21);
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    org.cs362.dominion.Card.CardName cardName26 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card27 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card24, cardName26);
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card24);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i29 = null;
    gameState28.gameBoard = hashmap_card_i29;
    org.cs362.dominion.Player[] player_array31 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player32 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player32, player_array31);
    gameState28.players = arraylist_player32;
    org.cs362.dominion.Player player36 = new org.cs362.dominion.Player(gameState28, "");
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    org.cs362.dominion.Card.CardName cardName40 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card41 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card38, cardName40);
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card38);
    org.cs362.dominion.Player player44 = new org.cs362.dominion.Player(gameState42, "");
    gameState28.addPlayer(player44);
    player44.buyCard();
    gameState5.addPlayer(player44);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i48 = null;
    gameState5.gameBoard = hashmap_card_i48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i50 = gameState5.gameBoard;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState51 = gameState5.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName26.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    org.junit.Assert.assertTrue("'" + cardName40 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName40.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i50);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    java.util.List<org.cs362.dominion.Player> list_player33 = gameState5.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i34 = gameState5.getWinners();
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i35 = gameState5.play();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i34);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    boolean b4 = card2.equals((java.lang.Object)'4');
    int i5 = card2.getTreasureValue();
    int i6 = card2.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    // The following exception was thrown during execution in test generation
    try {
    gameState5.prepTestGame();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.lang.String str6 = gameState5.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState5.gameBoard = hashmap_card_i7;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i9 = null;
    gameState5.gameBoard = hashmap_card_i9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)1;

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card11 = org.cs362.dominion.Card.getCard(list_card9, cardName10);
    player7.AdventurerDiscard(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card11);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }

    org.cs362.dominion.Randomness.reset((long)(-1));

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    org.cs362.dominion.Card[] card_array33 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card34, card_array33);
    org.cs362.dominion.Card.CardName cardName36 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card37 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card34, cardName36);
    org.cs362.dominion.GameState gameState38 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card34);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i39 = null;
    gameState38.gameBoard = hashmap_card_i39;
    org.cs362.dominion.Card[] card_array41 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card42 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card42, card_array41);
    org.cs362.dominion.Card.CardName cardName44 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card45 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card42, cardName44);
    org.cs362.dominion.GameState gameState46 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card42);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i47 = null;
    gameState46.gameBoard = hashmap_card_i47;
    org.cs362.dominion.Player[] player_array49 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player50 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player50, player_array49);
    gameState46.players = arraylist_player50;
    org.cs362.dominion.Player player54 = new org.cs362.dominion.Player(gameState46, "");
    org.cs362.dominion.Card[] card_array55 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card56 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card56, card_array55);
    org.cs362.dominion.Card.CardName cardName58 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card59 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card56, cardName58);
    org.cs362.dominion.GameState gameState60 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card56);
    org.cs362.dominion.Player player62 = new org.cs362.dominion.Player(gameState60, "");
    gameState46.addPlayer(player62);
    player62.buyCard();
    gameState38.addPlayer(player62);
    java.util.List<org.cs362.dominion.Player> list_player66 = gameState38.players;
    gameState5.players = list_player66;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName36.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName44.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    org.junit.Assert.assertTrue("'" + cardName58 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName58.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player66);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState19, "");
    gameState5.addPlayer(player21);
    java.util.List<org.cs362.dominion.Player> list_player23 = gameState5.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player23);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState13, "");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    gameState5.addPlayer(player15);
    java.util.List<org.cs362.dominion.Card> list_card19 = gameState5.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str16.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str17.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    java.lang.String str9 = player7.toString();
    player7.printStateGame();
    player7.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str9.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    boolean b4 = card2.equals((java.lang.Object)'4');
    int i5 = card2.getTreasureValue();
    int i6 = card2.getCost();
    int i7 = card2.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 5);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState6 = gameState5.clone();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState6.gameBoard = hashmap_card_i7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card6);
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState10, "");
    java.lang.String str13 = player12.toString();
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    gameState19.initializeGame();
    card2.play(player12, gameState19);
    java.lang.String str22 = card2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type3.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str13.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " \n\tMine"+ "'", str22.equals(" \n\tMine"));

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    java.util.List<org.cs362.dominion.Player> list_player33 = gameState5.players;
    // The following exception was thrown during execution in test generation
    try {
    gameState5.prepTestGame();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player33);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    player7.buyCard();
    player7.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    player29.playTreasureCard();
    player29.playTreasureCard();
    player29.playKingdomCard();
    player29.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    java.lang.String str9 = player7.toString();
    player7.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName12 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card13 = org.cs362.dominion.Card.getCard(list_card11, cardName12);
    org.cs362.dominion.Card.Type type14 = card13.getType();
    org.cs362.dominion.Card.CardName cardName15 = card13.getCardName();
    org.cs362.dominion.Card[] card_array16 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card17, card_array16);
    org.cs362.dominion.Card.CardName cardName19 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card20 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card17, cardName19);
    org.cs362.dominion.GameState gameState21 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card17);
    org.cs362.dominion.Player player23 = new org.cs362.dominion.Player(gameState21, "");
    java.lang.String str24 = player23.toString();
    org.cs362.dominion.Card[] card_array25 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card26 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card26, card_array25);
    org.cs362.dominion.Card.CardName cardName28 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card29 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card26, cardName28);
    org.cs362.dominion.GameState gameState30 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card26);
    gameState30.initializeGame();
    card13.play(player23, gameState30);
    int i33 = card13.getCost();
    player7.discard(card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str9.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type14.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + cardName19 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName19.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str24.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName28.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 5);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 3;

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    gameState5.initializeGame();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card11 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName10);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState12.gameBoard = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard(list_card15, cardName16);
    gameState12.cards = list_card15;
    gameState5.cards = list_card15;
    java.util.List<org.cs362.dominion.Player> list_player20 = gameState5.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player20);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.lang.String str6 = gameState5.toString();
    java.lang.String str7 = gameState5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str7.equals("The board game is empty, you need to intialize the game!"));

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Card.Type type6 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card1, type6);
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type6.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    java.util.List<org.cs362.dominion.Card> list_card14 = gameState5.cards;
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    org.cs362.dominion.Card.CardName cardName18 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card19 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card16, cardName18);
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i21 = null;
    gameState20.gameBoard = hashmap_card_i21;
    org.cs362.dominion.Player[] player_array23 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player24 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player24, player_array23);
    gameState20.players = arraylist_player24;
    gameState5.players = arraylist_player24;
    // The following exception was thrown during execution in test generation
    try {
    gameState5.prepTestGame();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName18.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    java.lang.String str5 = card2.toString();
    int i6 = card2.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type3.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " \n\tMine"+ "'", str5.equals(" \n\tMine"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.lang.String str6 = gameState5.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = null;
    gameState5.gameBoard = hashmap_card_i7;
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState5.play();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    player29.playTreasureCard();
    player29.playTreasureCard();
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    org.cs362.dominion.Card.CardName cardName38 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card39 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card36, cardName38);
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card36);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i41 = null;
    gameState40.gameBoard = hashmap_card_i41;
    org.cs362.dominion.Card[] card_array43 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card44 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card44, card_array43);
    org.cs362.dominion.Card.CardName cardName46 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card47 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card44, cardName46);
    org.cs362.dominion.GameState gameState48 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card44);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i49 = null;
    gameState48.gameBoard = hashmap_card_i49;
    org.cs362.dominion.Player[] player_array51 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player52 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player52, player_array51);
    gameState48.players = arraylist_player52;
    org.cs362.dominion.Player player56 = new org.cs362.dominion.Player(gameState48, "");
    org.cs362.dominion.Card[] card_array57 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card58 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card58, card_array57);
    org.cs362.dominion.Card.CardName cardName60 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card61 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card58, cardName60);
    org.cs362.dominion.GameState gameState62 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card58);
    org.cs362.dominion.Player player64 = new org.cs362.dominion.Player(gameState62, "");
    gameState48.addPlayer(player64);
    player64.buyCard();
    gameState40.addPlayer(player64);
    player64.playKingdomCard();
    java.util.List<org.cs362.dominion.Card> list_card69 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName70 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card71 = org.cs362.dominion.Card.getCard(list_card69, cardName70);
    org.cs362.dominion.Card.Type type72 = card71.getType();
    org.cs362.dominion.Card.CardName cardName73 = card71.getCardName();
    org.cs362.dominion.Card[] card_array74 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card75 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card75, card_array74);
    org.cs362.dominion.Card.CardName cardName77 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card78 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card75, cardName77);
    org.cs362.dominion.GameState gameState79 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card75);
    org.cs362.dominion.Player player81 = new org.cs362.dominion.Player(gameState79, "");
    java.lang.String str82 = player81.toString();
    org.cs362.dominion.Card[] card_array83 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card84 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card84, card_array83);
    org.cs362.dominion.Card.CardName cardName86 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card87 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card84, cardName86);
    org.cs362.dominion.GameState gameState88 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card84);
    gameState88.initializeGame();
    card71.play(player81, gameState88);
    player64.discard(card71);
    player29.discard(card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName38.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    org.junit.Assert.assertTrue("'" + cardName46 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName46.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    org.junit.Assert.assertTrue("'" + cardName60 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName60.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    org.junit.Assert.assertTrue("'" + cardName70 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName70.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card71);
    org.junit.Assert.assertTrue("'" + type72 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type72.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName73 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName73.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    org.junit.Assert.assertTrue("'" + cardName77 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName77.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str82.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    org.junit.Assert.assertTrue("'" + cardName86 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName86.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card87);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = '4';

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName15 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card16 = org.cs362.dominion.Card.getCard(list_card14, cardName15);
    boolean b18 = card16.equals((java.lang.Object)'4');
    int i19 = card16.getTreasureValue();
    player13.AdventurerDiscard(card16);
    java.util.List<org.cs362.dominion.Card> list_card21 = player13.trashpile;
    org.cs362.dominion.Card.CardName cardName22 = org.cs362.dominion.Card.CardName.Smithy;
    org.cs362.dominion.Card card23 = org.cs362.dominion.Card.getCard(list_card21, cardName22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + org.cs362.dominion.Card.CardName.Smithy + "'", cardName22.equals(org.cs362.dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.Card.CardName cardName9 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card10 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card7, cardName9);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = null;
    gameState11.gameBoard = hashmap_card_i12;
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = null;
    gameState19.gameBoard = hashmap_card_i20;
    org.cs362.dominion.Player[] player_array22 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player23 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player23, player_array22);
    gameState19.players = arraylist_player23;
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState19, "");
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    org.cs362.dominion.Card.CardName cardName31 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card32 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card29, cardName31);
    org.cs362.dominion.GameState gameState33 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card29);
    org.cs362.dominion.Player player35 = new org.cs362.dominion.Player(gameState33, "");
    gameState19.addPlayer(player35);
    player35.buyCard();
    gameState11.addPlayer(player35);
    java.util.List<org.cs362.dominion.Player> list_player39 = gameState11.players;
    gameState5.players = list_player39;
    gameState5.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName9.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    org.junit.Assert.assertTrue("'" + cardName31 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName31.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player39);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = null;
    gameState13.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState13.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "");
    gameState13.addPlayer(player29);
    player29.buyCard();
    gameState5.addPlayer(player29);
    player29.playTreasureCard();
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    org.cs362.dominion.Card.CardName cardName37 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card38 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card35, cardName37);
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card35);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i40 = null;
    gameState39.gameBoard = hashmap_card_i40;
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName43 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card44 = org.cs362.dominion.Card.getCard(list_card42, cardName43);
    gameState39.cards = list_card42;
    player29.trashpile = list_card42;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName37.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + cardName43 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName43.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card44);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName15 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card16 = org.cs362.dominion.Card.getCard(list_card14, cardName15);
    boolean b18 = card16.equals((java.lang.Object)'4');
    int i19 = card16.getTreasureValue();
    java.lang.String str20 = card16.toString();
    int i21 = card16.score();
    player13.discard(card16);
    java.lang.String str23 = player13.toString();
    java.util.List<org.cs362.dominion.Card> list_card24 = player13.trashpile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " \n\tMine"+ "'", str20.equals(" \n\tMine"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: [ \n\tMine]\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str23.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: [ \n\tMine]\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    java.lang.String str8 = player7.toString();
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card11 = org.cs362.dominion.Card.getCard(list_card9, cardName10);
    int i12 = card11.getCost();
    player7.discard(card11);
    player7.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card15 = player7.trashpile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str8.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState6 = gameState5.clone();
    java.util.List<org.cs362.dominion.Card> list_card7 = gameState6.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 1;

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i6 = null;
    gameState5.gameBoard = hashmap_card_i6;
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState5.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState5, "");
    player13.buyCard();
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    org.cs362.dominion.Card.CardName cardName18 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card19 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card16, cardName18);
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i21 = null;
    gameState20.gameBoard = hashmap_card_i21;
    org.cs362.dominion.Player[] player_array23 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player24 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player24, player_array23);
    gameState20.players = arraylist_player24;
    org.cs362.dominion.Player player28 = new org.cs362.dominion.Player(gameState20, "");
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName30 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card31 = org.cs362.dominion.Card.getCard(list_card29, cardName30);
    boolean b33 = card31.equals((java.lang.Object)'4');
    int i34 = card31.getTreasureValue();
    player28.AdventurerDiscard(card31);
    java.util.List<org.cs362.dominion.Card> list_card36 = player28.trashpile;
    player13.trashpile = list_card36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName18.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName30.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card6);
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState10, "");
    java.lang.String str13 = player12.toString();
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    gameState19.initializeGame();
    card2.play(player12, gameState19);
    int i22 = card2.getCost();
    org.cs362.dominion.Card.CardName cardName23 = card2.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type3.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str13.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 5);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName23.equals(org.cs362.dominion.Card.CardName.Mine));

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card12 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState13, "");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    gameState5.addPlayer(player15);
    player15.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card20 = player15.trashpile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str16.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str17.equals(" ---  ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card4 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player7 = new org.cs362.dominion.Player(gameState5, "");
    boolean b8 = gameState5.isGameOver();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState5.getWinners();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState5.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    int i3 = card2.getCost();
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName5 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card6 = org.cs362.dominion.Card.getCard(list_card4, cardName5);
    boolean b8 = card6.equals((java.lang.Object)'4');
    int i9 = card6.getTreasureValue();
    java.lang.String str10 = card6.toString();
    int i11 = card6.score();
    int i12 = card2.compareTo(card6);
    org.cs362.dominion.Card.CardName cardName13 = card6.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " \n\tMine"+ "'", str10.equals(" \n\tMine"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    org.junit.Assert.assertTrue("'" + cardName13 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName13.equals(org.cs362.dominion.Card.CardName.Mine));

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    int i5 = card2.getTreasureValue();
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.Card.CardName cardName9 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card10 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card7, cardName9);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = null;
    gameState11.gameBoard = hashmap_card_i12;
    org.cs362.dominion.Player[] player_array14 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player15 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player15, player_array14);
    gameState11.players = arraylist_player15;
    org.cs362.dominion.Player player19 = new org.cs362.dominion.Player(gameState11, "");
    java.util.List<org.cs362.dominion.Card> list_card20 = gameState11.cards;
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.Card.CardName cardName24 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card25 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card22, cardName24);
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i27 = null;
    gameState26.gameBoard = hashmap_card_i27;
    org.cs362.dominion.Player[] player_array29 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player30 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player30, player_array29);
    gameState26.players = arraylist_player30;
    gameState11.players = arraylist_player30;
    boolean b34 = card2.equals((java.lang.Object)gameState11);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str35 = gameState11.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type3.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName9.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName24.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test94"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.Type type3 = card2.getType();
    org.cs362.dominion.Card.CardName cardName4 = card2.getCardName();
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card6);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i11 = null;
    gameState10.gameBoard = hashmap_card_i11;
    org.cs362.dominion.Card[] card_array13 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card14, card_array13);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card14, cardName16);
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card14);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = null;
    gameState18.gameBoard = hashmap_card_i19;
    org.cs362.dominion.Player[] player_array21 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player22 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player22, player_array21);
    gameState18.players = arraylist_player22;
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState18, "");
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    org.cs362.dominion.Card.CardName cardName30 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card31 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card28, cardName30);
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card28);
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState32, "");
    gameState18.addPlayer(player34);
    player34.buyCard();
    gameState10.addPlayer(player34);
    java.util.List<org.cs362.dominion.Player> list_player38 = gameState10.players;
    boolean b39 = card2.equals((java.lang.Object)list_player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type3.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName30.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test95"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    boolean b4 = card2.equals((java.lang.Object)'4');
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName6 = org.cs362.dominion.Card.CardName.Mine;
    org.cs362.dominion.Card card7 = org.cs362.dominion.Card.getCard(list_card5, cardName6);
    org.cs362.dominion.Card.Type type8 = card7.getType();
    org.cs362.dominion.Card.CardName cardName9 = card7.getCardName();
    java.lang.String str10 = card7.toString();
    int i11 = card2.compareTo(card7);
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.Card.CardName cardName15 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card16 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card13, cardName15);
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card13);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = null;
    gameState17.gameBoard = hashmap_card_i18;
    org.cs362.dominion.Player[] player_array20 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player21 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player21, player_array20);
    gameState17.players = arraylist_player21;
    org.cs362.dominion.Player player25 = new org.cs362.dominion.Player(gameState17, "");
    org.cs362.dominion.Card[] card_array26 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card27 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card27, card_array26);
    org.cs362.dominion.Card.CardName cardName29 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card30 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card27, cardName29);
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card27);
    org.cs362.dominion.Player player33 = new org.cs362.dominion.Player(gameState31, "");
    gameState17.addPlayer(player33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    org.cs362.dominion.Card.CardName cardName38 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card39 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card36, cardName38);
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card36);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i41 = null;
    gameState40.gameBoard = hashmap_card_i41;
    org.cs362.dominion.Player[] player_array43 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player44 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player44, player_array43);
    gameState40.players = arraylist_player44;
    org.cs362.dominion.Player player48 = new org.cs362.dominion.Player(gameState40, "");
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    org.cs362.dominion.Card.CardName cardName52 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card53 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card50, cardName52);
    org.cs362.dominion.GameState gameState54 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card50);
    org.cs362.dominion.Player player56 = new org.cs362.dominion.Player(gameState54, "");
    gameState40.addPlayer(player56);
    player56.buyCard();
    gameState17.addPlayer(player56);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i60 = null;
    gameState17.gameBoard = hashmap_card_i60;
    boolean b62 = card7.equals((java.lang.Object)gameState17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName6.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type8.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName9.equals(org.cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " \n\tMine"+ "'", str10.equals(" \n\tMine"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    org.junit.Assert.assertTrue("'" + cardName29 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName29.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName38.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    org.junit.Assert.assertTrue("'" + cardName52 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName52.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

}
