package org.cs362.dominion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    org.cs362.dominion.Randomness.reset((long)(short)-1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Feast;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Feast + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Feast));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Council_Room;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Council_Room + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Council_Room));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Baron;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Baron + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Baron));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = '4';

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Village;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Village + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Village));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Festival;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Festival + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Festival));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.Card card3 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Smithy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Smithy + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Smithy));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    org.cs362.dominion.Card.Type type0 = org.cs362.dominion.Card.Type.ACTION;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type0.equals(org.cs362.dominion.Card.Type.ACTION));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    long long0 = org.cs362.dominion.Randomness.SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1487981537248L);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    boolean b5 = gameState3.isGameOver();
    // The following exception was thrown during execution in test generation
    try {
    gameState3.initializeTest();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Estate;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Estate));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Laboratory;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Laboratory + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Laboratory));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Ambassador;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Ambassador + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Ambassador));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Duchy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Duchy));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Salvager;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Salvager));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    org.cs362.dominion.Randomness.reset((long)(-1));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Curse;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Curse));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

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
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Card.CardName cardName4 = org.cs362.dominion.Card.CardName.Great_Hall;
    org.cs362.dominion.Card card5 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card5);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Gold;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Gold));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    int i0 = org.cs362.dominion.Randomness.totalCallsToRandom;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 54);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    org.cs362.dominion.Randomness.reset((long)(byte)0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Adventurer;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Adventurer + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Adventurer));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player6 = gameState3.players;
    java.lang.String str7 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str7.equals("The board game is empty, you need to intialize the game!"));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Province;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Province + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Province));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.cs362.dominion.Randomness.nextRandomInt(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    boolean b7 = gameState3.isGameOver();
    java.lang.String str8 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str8.equals("The board game is empty, you need to intialize the game!"));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    org.cs362.dominion.PlayDominion playDominion0 = new org.cs362.dominion.PlayDominion();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Silver;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Silver + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Silver));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState10.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState10.gameBoard;
    java.lang.String str13 = gameState10.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState10.gameBoard;
    gameState3.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player player16 = null;
    gameState3.addPlayer(player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str13.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 0;

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState10.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState10.gameBoard;
    java.lang.String str13 = gameState10.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState10.gameBoard;
    gameState3.gameBoard = hashmap_card_i14;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type17 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card16, type17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card16, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card16);
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] { card21 };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    gameState3.cards = arraylist_card23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str13.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type17.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card6);
    java.util.List<org.cs362.dominion.Card> list_card9 = gameState8.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState8.gameBoard;
    java.lang.String str11 = gameState8.toString();
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card13);
    java.util.List<org.cs362.dominion.Card> list_card16 = gameState15.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    java.lang.String str18 = gameState15.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState15.gameBoard;
    gameState8.gameBoard = hashmap_card_i19;
    org.cs362.dominion.Player[] player_array21 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player22 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player22, player_array21);
    gameState8.players = arraylist_player22;
    gameState3.players = arraylist_player22;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.Player player26 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str11.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str18.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card10 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    gameState3.cards = list_card10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    org.cs362.dominion.Randomness.reset(1L);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card0);
    org.cs362.dominion.Card.Type type6 = card5.getType();
    int i7 = card5.score();
    int i8 = card5.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type6.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    java.util.List<org.cs362.dominion.Card> list_card10 = gameState9.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState9.gameBoard;
    java.lang.String str12 = gameState9.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState9.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card14 = gameState9.cards;
    player5.trashpile = list_card14;
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Gardens;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard(list_card14, cardName16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str12.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 2;

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Mine;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Mine));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card0);
    org.cs362.dominion.Card.Type type6 = card5.getType();
    org.cs362.dominion.Card.CardName cardName7 = card5.getCardName();
    int i8 = card5.score();
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState12.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState12.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player15 = gameState12.players;
    boolean b16 = card5.equals((java.lang.Object)list_player15);
    int i17 = card5.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type6.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Smithy + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    org.cs362.dominion.Randomness.reset((long)'#');

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player5.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type8);
    org.cs362.dominion.Card.Type type10 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type10);
    org.cs362.dominion.Card card12 = org.cs362.dominion.Randomness.randomMember(list_card7);
    org.cs362.dominion.Card.Type type13 = card12.getType();
    org.cs362.dominion.Card.CardName cardName14 = card12.getCardName();
    player5.discard(card12);
    int i16 = card12.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type8.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type13.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName14.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    boolean b5 = gameState3.isGameOver();
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    java.util.List<org.cs362.dominion.Card> list_card10 = gameState9.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState9.gameBoard;
    gameState3.gameBoard = hashmap_card_i11;
    java.lang.String str13 = gameState3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str13.equals("The board game is empty, you need to intialize the game!"));

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card2, type3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player6 = gameState3.players;
    gameState3.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.List<org.cs362.dominion.Card> list_card12 = gameState11.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState11.gameBoard;
    java.lang.String str14 = gameState11.toString();
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    java.util.List<org.cs362.dominion.Card> list_card19 = gameState18.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState18.gameBoard;
    java.lang.String str21 = gameState18.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState18.gameBoard;
    gameState11.gameBoard = hashmap_card_i22;
    gameState3.gameBoard = hashmap_card_i22;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str14.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str21.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i25);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    java.util.List<org.cs362.dominion.Card> list_card10 = gameState9.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState9.gameBoard;
    java.lang.String str12 = gameState9.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState9.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card14 = gameState9.cards;
    player5.trashpile = list_card14;
    org.cs362.dominion.Card.Type type16 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card14, type16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str12.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type16.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type8);
    gameState3.cards = list_card7;
    gameState3.initializeTest();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type8.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    gameState3.initializeGame();
    boolean b7 = gameState3.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type9 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card8, type9);
    org.cs362.dominion.Card.Type type11 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card8, type11);
    org.cs362.dominion.Card card13 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type14 = card13.getType();
    org.cs362.dominion.Card.CardName cardName15 = card13.getCardName();
    int i16 = card13.score();
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card18);
    java.util.List<org.cs362.dominion.Card> list_card21 = gameState20.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState20.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player23 = gameState20.players;
    boolean b24 = card13.equals((java.lang.Object)list_player23);
    gameState3.players = list_player23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type9.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type11.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type14.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player9.playKingdomCard();
    player9.playKingdomCard();
    java.lang.String str12 = player9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str12.equals(" --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player5.buyCard();
    player5.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player5.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type8);
    org.cs362.dominion.Card.Type type10 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type10);
    org.cs362.dominion.Card card12 = org.cs362.dominion.Randomness.randomMember(list_card7);
    org.cs362.dominion.Card.Type type13 = card12.getType();
    org.cs362.dominion.Card.CardName cardName14 = card12.getCardName();
    player5.discard(card12);
    player5.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type8.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type13.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName14.equals(org.cs362.dominion.Card.CardName.Gardens));

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card5);
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState7.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i9 = gameState7.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player10 = gameState7.players;
    gameState3.players = list_player10;
    // The following exception was thrown during execution in test generation
    try {
    gameState3.initializeTest();
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
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card0);
    org.cs362.dominion.Card.Type type6 = card5.getType();
    org.cs362.dominion.Card.CardName cardName7 = card5.getCardName();
    int i8 = card5.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type6.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }

    java.util.Random random0 = org.cs362.dominion.Randomness.random;
    org.cs362.dominion.Randomness.random = random0;
    org.cs362.dominion.Randomness.random = random0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random0);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player5.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard(list_card7, cardName8);
    player5.discard(card9);
    int i11 = card9.getTreasureValue();
    int i12 = card9.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState10.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState10.gameBoard;
    java.lang.String str13 = gameState10.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState10.gameBoard;
    gameState3.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState3.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    gameState3.initializeGame();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str13.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i23);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    java.util.List<org.cs362.dominion.Card> list_card10 = gameState9.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i11 = gameState9.gameBoard;
    java.lang.String str12 = gameState9.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState9.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card14 = gameState9.cards;
    player5.trashpile = list_card14;
    player5.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type18 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type18);
    org.cs362.dominion.Card.Type type20 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card21 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type20);
    org.cs362.dominion.Card card22 = org.cs362.dominion.Randomness.randomMember(list_card17);
    org.cs362.dominion.Card.Type type23 = card22.getType();
    org.cs362.dominion.Card.CardName cardName24 = card22.getCardName();
    player5.discardFromDeck(card22);
    java.lang.String str26 = player5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str12.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type18.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type20.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type23.equals(org.cs362.dominion.Card.Type.VICTORY));
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName24.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + " --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: [ \n\tEstate]\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str26.equals(" --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: [ \n\tEstate]\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.List<org.cs362.dominion.Card> list_card12 = gameState11.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState11.gameBoard;
    java.lang.String str14 = gameState11.toString();
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    java.util.List<org.cs362.dominion.Card> list_card19 = gameState18.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState18.gameBoard;
    java.lang.String str21 = gameState18.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState18.gameBoard;
    gameState11.gameBoard = hashmap_card_i22;
    gameState3.gameBoard = hashmap_card_i22;
    org.cs362.dominion.Card[] card_array25 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card26 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card26, card_array25);
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card26);
    java.util.List<org.cs362.dominion.Card> list_card29 = gameState28.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i30 = gameState28.gameBoard;
    java.lang.String str31 = gameState28.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState28.gameBoard;
    gameState3.gameBoard = hashmap_card_i32;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i34 = gameState3.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str14.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str21.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str31.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i34);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 100;

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState12.cards;
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card15);
    java.util.List<org.cs362.dominion.Card> list_card18 = gameState17.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState17.gameBoard;
    java.lang.String str20 = gameState17.toString();
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    java.util.List<org.cs362.dominion.Card> list_card25 = gameState24.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState24.gameBoard;
    java.lang.String str27 = gameState24.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState24.gameBoard;
    gameState17.gameBoard = hashmap_card_i28;
    org.cs362.dominion.Player[] player_array30 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player31 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player31, player_array30);
    gameState17.players = arraylist_player31;
    gameState12.players = arraylist_player31;
    gameState3.players = arraylist_player31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str20.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str27.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    org.cs362.dominion.Player[] player_array21 = new org.cs362.dominion.Player[] { player14 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player22 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player22, player_array21);
    org.cs362.dominion.Player player24 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player22);
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card25, type26);
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card25, type28);
    org.cs362.dominion.Card card30 = org.cs362.dominion.Randomness.randomMember(list_card25);
    org.cs362.dominion.Card.Type type31 = card30.getType();
    int i32 = card30.score();
    player24.discardFromDeck(card30);
    java.lang.String str34 = player24.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type26.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type28.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type31.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + " --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: [ \n\tCopper,  \n\tCouncil_Room]\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str34.equals(" --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: [ \n\tCopper,  \n\tCouncil_Room]\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    org.cs362.dominion.Player[] player_array21 = new org.cs362.dominion.Player[] { player14 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player22 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player22, player_array21);
    org.cs362.dominion.Player player24 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player22);
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card25, type26);
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card25, type28);
    org.cs362.dominion.Card card30 = org.cs362.dominion.Randomness.randomMember(list_card25);
    org.cs362.dominion.Card.Type type31 = card30.getType();
    int i32 = card30.score();
    player24.discardFromDeck(card30);
    player24.buyCard();
    player24.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type26.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type28.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type31.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player5.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type8);
    org.cs362.dominion.Card.Type type10 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type10);
    org.cs362.dominion.Card card12 = org.cs362.dominion.Randomness.randomMember(list_card7);
    org.cs362.dominion.Card.Type type13 = card12.getType();
    org.cs362.dominion.Card.CardName cardName14 = card12.getCardName();
    player5.discard(card12);
    java.util.List<org.cs362.dominion.Card> list_card16 = player5.trashpile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type8.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type13.equals(org.cs362.dominion.Card.Type.VICTORY));
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName14.equals(org.cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    gameState3.initializeGame();
    java.util.List<org.cs362.dominion.Card> list_card10 = gameState3.cards;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    java.util.List<org.cs362.dominion.Card> list_card25 = gameState24.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState24.gameBoard;
    java.lang.String str27 = gameState24.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState24.gameBoard;
    org.cs362.dominion.Player player30 = new org.cs362.dominion.Player(gameState24, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type32 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type32);
    org.cs362.dominion.Card.Type type34 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type34);
    org.cs362.dominion.Card card36 = org.cs362.dominion.Randomness.randomMember(list_card35);
    org.cs362.dominion.Card.CardName cardName37 = card36.getCardName();
    player30.discard(card36);
    player14.discardFromDeck(card36);
    int i40 = card36.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str27.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type32.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type34.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card36);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName37.equals(org.cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState10.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState10.gameBoard;
    java.lang.String str13 = gameState10.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState10.gameBoard;
    gameState3.gameBoard = hashmap_card_i14;
    gameState3.initializeGame();
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card18);
    java.util.List<org.cs362.dominion.Card> list_card21 = gameState20.cards;
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState25.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState25.gameBoard;
    java.lang.String str28 = gameState25.toString();
    org.cs362.dominion.Card[] card_array29 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card30 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card30, card_array29);
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card30);
    java.util.List<org.cs362.dominion.Card> list_card33 = gameState32.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState32.gameBoard;
    java.lang.String str35 = gameState32.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState32.gameBoard;
    gameState25.gameBoard = hashmap_card_i36;
    org.cs362.dominion.Player[] player_array38 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player39 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player39, player_array38);
    gameState25.players = arraylist_player39;
    gameState20.players = arraylist_player39;
    gameState3.players = arraylist_player39;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str13.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str28.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str35.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type6 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type6);
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type8);
    org.cs362.dominion.Card card10 = org.cs362.dominion.Randomness.randomMember(list_card5);
    org.cs362.dominion.Card.Type type11 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type11);
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card4, type11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type6.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type8.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type11.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }

    org.cs362.dominion.Randomness.reset(100L);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card0);
    org.cs362.dominion.Card.Type type6 = card5.getType();
    org.cs362.dominion.Card.CardName cardName7 = card5.getCardName();
    int i8 = card5.score();
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState12.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState12.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player15 = gameState12.players;
    boolean b16 = card5.equals((java.lang.Object)list_player15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card18);
    java.util.List<org.cs362.dominion.Card> list_card21 = gameState20.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState20.gameBoard;
    java.lang.String str23 = gameState20.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState20.gameBoard;
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState20, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card27, type28);
    org.cs362.dominion.Card.Type type30 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card27, type30);
    org.cs362.dominion.Card card32 = org.cs362.dominion.Randomness.randomMember(list_card31);
    org.cs362.dominion.Card.CardName cardName33 = card32.getCardName();
    player26.discard(card32);
    java.lang.String str35 = card32.toString();
    int i36 = card5.compareTo(card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type6.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str23.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type28.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type30.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName33.equals(org.cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + " \n\tCurse"+ "'", str35.equals(" \n\tCurse"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 7);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState10.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState10.gameBoard;
    java.lang.String str13 = gameState10.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i14 = gameState10.gameBoard;
    gameState3.gameBoard = hashmap_card_i14;
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] {  };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState3.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    player21.trashpile = list_card22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str13.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    java.util.List<org.cs362.dominion.Card> list_card25 = gameState24.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i26 = gameState24.gameBoard;
    java.lang.String str27 = gameState24.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState24.gameBoard;
    org.cs362.dominion.Player player30 = new org.cs362.dominion.Player(gameState24, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type32 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type32);
    org.cs362.dominion.Card.Type type34 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type34);
    org.cs362.dominion.Card card36 = org.cs362.dominion.Randomness.randomMember(list_card35);
    org.cs362.dominion.Card.CardName cardName37 = card36.getCardName();
    player30.discard(card36);
    player14.discardFromDeck(card36);
    java.util.List<org.cs362.dominion.Card> list_card40 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type41 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card40, type41);
    org.cs362.dominion.Card.Type type43 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card40, type43);
    org.cs362.dominion.Card card45 = org.cs362.dominion.Randomness.randomMember(list_card40);
    org.cs362.dominion.Card.Type type46 = card45.getType();
    org.cs362.dominion.Card.Type type47 = card45.getType();
    player14.discardFromDeck(card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str27.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type32.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type34.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card36);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName37.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type41.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type43.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type46.equals(org.cs362.dominion.Card.Type.TREASURE));
    org.junit.Assert.assertTrue("'" + type47 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type47.equals(org.cs362.dominion.Card.Type.TREASURE));

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)10;

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    boolean b6 = gameState3.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card4);
    org.cs362.dominion.Card.CardName cardName6 = card5.getCardName();
    org.cs362.dominion.Card.CardName cardName7 = card5.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card5);
    org.junit.Assert.assertTrue("'" + cardName6 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName6.equals(org.cs362.dominion.Card.CardName.Curse));
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Curse));

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type11 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card10, type11);
    org.cs362.dominion.Card.Type type13 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card10, type13);
    org.cs362.dominion.Card card15 = org.cs362.dominion.Randomness.randomMember(list_card14);
    org.cs362.dominion.Card.CardName cardName16 = card15.getCardName();
    player9.discard(card15);
    int i18 = card15.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type11.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type13.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Province + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Province));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type8);
    gameState3.cards = list_card7;
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.GameState gameState12 = gameState11.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type8.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState12);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    java.util.List<org.cs362.dominion.Card> list_card12 = gameState11.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState11.gameBoard;
    java.lang.String str14 = gameState11.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState11.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card16 = gameState11.cards;
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card18);
    org.cs362.dominion.Player player22 = new org.cs362.dominion.Player(gameState20, "The board game is empty, you need to intialize the game!");
    player22.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard(list_card24, cardName25);
    player22.discard(card26);
    gameState11.addPlayer(player22);
    gameState3.addPlayer(player22);
    player22.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card31 = player22.trashpile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str14.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.List<org.cs362.dominion.Player> list_player5 = gameState3.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = '#';

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    player5.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard(list_card7, cardName8);
    player5.discard(card9);
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type12 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card11, type12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card11, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card11);
    org.cs362.dominion.Card.Type type17 = card16.getType();
    org.cs362.dominion.Card.Type type18 = card16.getType();
    boolean b19 = card9.equals((java.lang.Object)card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type12.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type17.equals(org.cs362.dominion.Card.Type.ACTION));
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type18.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    java.lang.String str6 = player5.toString();
    player5.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"+ "'", str6.equals(" --- The board game is empty, you need to intialize the game! ---  --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nTrashed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: 0\n"));

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    gameState3.initializeGame();
    boolean b7 = gameState3.isGameOver();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState3.play();
    org.cs362.dominion.GameState gameState9 = gameState3.clone();
    java.util.List<org.cs362.dominion.Player> list_player10 = gameState3.players;
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState3.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test94"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    org.cs362.dominion.Player[] player_array21 = new org.cs362.dominion.Player[] { player14 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player22 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player22, player_array21);
    org.cs362.dominion.Player player24 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player22);
    org.cs362.dominion.Card card25 = null;
    // The following exception was thrown during execution in test generation
    try {
    player24.discard(card25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player24);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test95"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    java.util.List<org.cs362.dominion.Card> list_card21 = player14.trashpile;
    player14.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test96"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card0);
    org.cs362.dominion.Card.Type type6 = card5.getType();
    int i7 = card5.score();
    int i8 = card5.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type1.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type3.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type6.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test97"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState3.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);

  }

  @Test
  public void test98() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test98"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState3.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i5 = gameState3.gameBoard;
    java.lang.String str6 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState3.cards;
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "The board game is empty, you need to intialize the game!");
    player14.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card16, cardName17);
    player14.discard(card18);
    gameState3.addPlayer(player14);
    player14.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "The board game is empty, you need to intialize the game!"+ "'", str6.equals("The board game is empty, you need to intialize the game!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);

  }

}
