
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test001"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str12 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test002"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
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

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test003"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str12 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str14 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str14.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test004"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test005"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test006"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    cs362.dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = player2.addToDeck(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test007"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    java.lang.String str10 = player2.toString();
    cs362.dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test008"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.CardName cardName5 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName5);
    cs362.dominion.Card.Type type7 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card8 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card6, type7);
    cs362.dominion.Card.CardName cardName9 = cs362.dominion.Card.CardName.Village;
    cs362.dominion.Card card10 = cs362.dominion.Card.getCard(list_card8, cardName9);
    cs362.dominion.Card[] card_array11 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card12, card_array11);
    cs362.dominion.Card.CardName cardName14 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card15 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card12, cardName14);
    cs362.dominion.Card[] card_array16 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card17, card_array16);
    cs362.dominion.Card.CardName cardName19 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card20 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card17, cardName19);
    java.util.List<cs362.dominion.Card> list_card21 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card12, cardName19);
    cs362.dominion.Card[] card_array22 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card23, card_array22);
    cs362.dominion.Card.CardName cardName25 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card26 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card23, cardName25);
    cs362.dominion.Card.CardName cardName27 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card28 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card23, cardName27);
    cs362.dominion.Card card29 = cs362.dominion.Card.getCard(list_card21, cardName27);
    cs362.dominion.Card.CardName cardName30 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card31 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card21, cardName30);
    java.util.List<cs362.dominion.Card> list_card32 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card8, cardName30);
    cs362.dominion.Card[] card_array33 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card34, card_array33);
    cs362.dominion.Card.CardName cardName36 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card37 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card34, cardName36);
    cs362.dominion.Card.CardName cardName38 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card39 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card34, cardName38);
    cs362.dominion.Card[] card_array40 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card41, card_array40);
    cs362.dominion.Card.CardName cardName43 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card44 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card41, cardName43);
    cs362.dominion.Card[] card_array45 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card46 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card46, card_array45);
    cs362.dominion.Card.CardName cardName48 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card49 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card46, cardName48);
    cs362.dominion.Card.CardName cardName50 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card51 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card46, cardName50);
    cs362.dominion.Card card52 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card41, cardName50);
    cs362.dominion.Card.Type type53 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card54 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card41, type53);
    java.util.List<cs362.dominion.Card> list_card55 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card34, type53);
    java.util.List<cs362.dominion.Card> list_card56 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card32, type53);
    cs362.dominion.Card[] card_array57 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card58 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card58, card_array57);
    cs362.dominion.Card.CardName cardName60 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card61 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card58, cardName60);
    cs362.dominion.Card.Type type62 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card63 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card58, type62);
    cs362.dominion.Card.CardName cardName64 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card65 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card63, cardName64);
    cs362.dominion.Card card66 = cs362.dominion.Card.getCard(list_card32, cardName64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName3.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type7.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName9.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName14.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + cardName19 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName19.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName25.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName27.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName30.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName36.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card37);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName38.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    org.junit.Assert.assertTrue("'" + cardName43 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName43.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    org.junit.Assert.assertTrue("'" + cardName48 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName48.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card49);
    org.junit.Assert.assertTrue("'" + cardName50 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName50.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card52);
    org.junit.Assert.assertTrue("'" + type53 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type53.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    org.junit.Assert.assertTrue("'" + cardName60 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName60.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    org.junit.Assert.assertTrue("'" + type62 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type62.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + cardName64 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName64.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card66);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test009"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str6 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test010"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str12 = player2.toString();
    cs362.dominion.Card card13 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test011"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str10 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test012"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str6 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test013"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card[] card_array5 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card6, card_array5);
    cs362.dominion.Card.CardName cardName8 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card9 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card6, cardName8);
    cs362.dominion.Card.CardName cardName10 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card11 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card6, cardName10);
    cs362.dominion.Card card12 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName10);
    cs362.dominion.Card.Type type13 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card14 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type13);
    cs362.dominion.Card[] card_array15 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card16, card_array15);
    cs362.dominion.Card.CardName cardName18 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card19 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card16, cardName18);
    cs362.dominion.Card.CardName cardName20 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card21 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card16, cardName20);
    cs362.dominion.Card.Type type22 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card23 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card21, type22);
    cs362.dominion.Card[] card_array24 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card25 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card25, card_array24);
    cs362.dominion.Card.CardName cardName27 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card28 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card25, cardName27);
    cs362.dominion.Card[] card_array29 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card30 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card30, card_array29);
    cs362.dominion.Card.CardName cardName32 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card33 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card30, cardName32);
    cs362.dominion.Card.CardName cardName34 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card35 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card30, cardName34);
    cs362.dominion.Card card36 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card25, cardName34);
    cs362.dominion.Card[] card_array37 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card38, card_array37);
    cs362.dominion.Card.CardName cardName40 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card41 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card38, cardName40);
    cs362.dominion.Card.CardName cardName42 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card43 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card38, cardName42);
    cs362.dominion.Card.Type type44 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card45 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card43, type44);
    cs362.dominion.Card.CardName cardName46 = cs362.dominion.Card.CardName.Village;
    cs362.dominion.Card card47 = cs362.dominion.Card.getCard(list_card45, cardName46);
    cs362.dominion.Card card48 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card25, cardName46);
    cs362.dominion.Card card49 = cs362.dominion.Card.getCard(list_card23, cardName46);
    java.util.List<cs362.dominion.Card> list_card50 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card14, cardName46);
    cs362.dominion.Card.CardName cardName51 = cs362.dominion.Card.CardName.Curse;
    java.util.List<cs362.dominion.Card> list_card52 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card14, cardName51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName3.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName8.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName10.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type13.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName18.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card19);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName20.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type22.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName27.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    org.junit.Assert.assertTrue("'" + cardName32 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName32.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card33);
    org.junit.Assert.assertTrue("'" + cardName34 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName34.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    org.junit.Assert.assertTrue("'" + cardName40 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName40.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card41);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName42.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    org.junit.Assert.assertTrue("'" + type44 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type44.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    org.junit.Assert.assertTrue("'" + cardName46 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName46.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    org.junit.Assert.assertTrue("'" + cardName51 + "' != '" + cs362.dominion.Card.CardName.Curse + "'", cardName51.equals(cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test014"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.buyCard();
    cs362.dominion.Card card15 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = player2.addToDeck(card15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test015"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.buyCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str7 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test016"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    cs362.dominion.Card card10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = player2.addToDeck(card10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test017"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test018"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    java.lang.String str10 = player2.toString();
    java.lang.String str11 = player2.toString();
    java.lang.String str12 = player2.toString();
    java.lang.String str13 = player2.toString();
    java.lang.String str14 = player2.toString();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str14.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test019"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test020"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str12 = player2.toString();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test021"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str6 = player2.toString();
    player2.playTreasureCard();
    cs362.dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test022"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test023"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card[] card_array5 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card6, card_array5);
    cs362.dominion.Card.CardName cardName8 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card9 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card6, cardName8);
    cs362.dominion.Card.Type type10 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card11 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card6, type10);
    java.util.List<cs362.dominion.Card> list_card12 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type10);
    cs362.dominion.Card[] card_array13 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card14, card_array13);
    cs362.dominion.Card.CardName cardName16 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card17 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card14, cardName16);
    cs362.dominion.Card[] card_array18 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card19, card_array18);
    cs362.dominion.Card.CardName cardName21 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card22 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card19, cardName21);
    java.util.List<cs362.dominion.Card> list_card23 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card14, cardName21);
    cs362.dominion.Card[] card_array24 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card25 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card25, card_array24);
    cs362.dominion.Card.CardName cardName27 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card28 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card25, cardName27);
    cs362.dominion.Card.CardName cardName29 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card30 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card25, cardName29);
    cs362.dominion.Card card31 = cs362.dominion.Card.getCard(list_card23, cardName29);
    cs362.dominion.Card.CardName cardName32 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card33 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card23, cardName32);
    cs362.dominion.Card.CardName cardName34 = cs362.dominion.Card.CardName.Duchy;
    java.util.List<cs362.dominion.Card> list_card35 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card33, cardName34);
    cs362.dominion.Card[] card_array36 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card37 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card37, card_array36);
    cs362.dominion.Card.CardName cardName39 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card40 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card37, cardName39);
    cs362.dominion.Card[] card_array41 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card42 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card42, card_array41);
    cs362.dominion.Card.CardName cardName44 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card45 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card42, cardName44);
    cs362.dominion.Card.Type type46 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card47 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card42, type46);
    java.util.List<cs362.dominion.Card> list_card48 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card37, type46);
    java.util.List<cs362.dominion.Card> list_card49 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card33, type46);
    cs362.dominion.Card[] card_array50 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card51, card_array50);
    cs362.dominion.Card.CardName cardName53 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card54 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card51, cardName53);
    cs362.dominion.Card.CardName cardName55 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card56 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card51, cardName55);
    cs362.dominion.Card.CardName cardName57 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card58 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card51, cardName57);
    cs362.dominion.Card.CardName cardName59 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card60 = cs362.dominion.Card.getCard(list_card58, cardName59);
    cs362.dominion.Card card61 = cs362.dominion.Card.getCard(list_card33, cardName59);
    java.util.List<cs362.dominion.Card> list_card62 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card12, cardName59);
    cs362.dominion.Card.Type type63 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card64 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card12, type63);
    cs362.dominion.Card[] card_array65 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card66 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card66, card_array65);
    cs362.dominion.Card.CardName cardName68 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card69 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card66, cardName68);
    cs362.dominion.Card[] card_array70 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card71 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card71, card_array70);
    cs362.dominion.Card.CardName cardName73 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card74 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card71, cardName73);
    java.util.List<cs362.dominion.Card> list_card75 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card66, cardName73);
    cs362.dominion.Card[] card_array76 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card77 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card77, card_array76);
    cs362.dominion.Card.CardName cardName79 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card80 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card77, cardName79);
    cs362.dominion.Card.CardName cardName81 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card82 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card77, cardName81);
    cs362.dominion.Card card83 = cs362.dominion.Card.getCard(list_card75, cardName81);
    cs362.dominion.Card.CardName cardName84 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card85 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card75, cardName84);
    cs362.dominion.Card.CardName cardName86 = cs362.dominion.Card.CardName.Baron;
    java.util.List<cs362.dominion.Card> list_card87 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card75, cardName86);
    cs362.dominion.Card.CardName cardName88 = cs362.dominion.Card.CardName.Duchy;
    java.util.List<cs362.dominion.Card> list_card89 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card75, cardName88);
    cs362.dominion.Card.CardName cardName90 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card91 = cs362.dominion.Card.getCard(list_card75, cardName90);
    java.util.List<cs362.dominion.Card> list_card92 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card12, cardName90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName3.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName8.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type10.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName16.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName21.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName27.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card28);
    org.junit.Assert.assertTrue("'" + cardName29 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName29.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    org.junit.Assert.assertTrue("'" + cardName32 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName32.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + cardName34 + "' != '" + cs362.dominion.Card.CardName.Duchy + "'", cardName34.equals(cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    org.junit.Assert.assertTrue("'" + cardName39 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName39.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName44.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type46.equals(cs362.dominion.Card.Type.VICTORY));
    
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
    org.junit.Assert.assertTrue("'" + cardName53 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName53.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card54);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName55.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName57.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    org.junit.Assert.assertTrue("'" + cardName59 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName59.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    org.junit.Assert.assertTrue("'" + type63 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type63.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    org.junit.Assert.assertTrue("'" + cardName68 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName68.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    org.junit.Assert.assertTrue("'" + cardName73 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName73.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    org.junit.Assert.assertTrue("'" + cardName79 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName79.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card80);
    org.junit.Assert.assertTrue("'" + cardName81 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName81.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card83);
    org.junit.Assert.assertTrue("'" + cardName84 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName84.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    org.junit.Assert.assertTrue("'" + cardName86 + "' != '" + cs362.dominion.Card.CardName.Baron + "'", cardName86.equals(cs362.dominion.Card.CardName.Baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);
    org.junit.Assert.assertTrue("'" + cardName88 + "' != '" + cs362.dominion.Card.CardName.Duchy + "'", cardName88.equals(cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card89);
    org.junit.Assert.assertTrue("'" + cardName90 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName90.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card92);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test024"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playTreasureCard();
    player2.playKingdomCard();
    cs362.dominion.Card card5 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test025"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str13 = player2.toString();
    player2.playTreasureCard();
    cs362.dominion.Card card15 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = player2.addToDeck(card15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test026"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str6 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test027"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    player2.playKingdomCard();
    player2.playTreasureCard();
    cs362.dominion.Card card10 = null;
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test028"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str11 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test029"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.CardName cardName5 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName5);
    cs362.dominion.Card[] card_array7 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card8, card_array7);
    cs362.dominion.Card.CardName cardName10 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card11 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card8, cardName10);
    cs362.dominion.Card[] card_array12 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card13, card_array12);
    cs362.dominion.Card.CardName cardName15 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card16 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card13, cardName15);
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card8, cardName15);
    cs362.dominion.Card[] card_array18 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card19, card_array18);
    cs362.dominion.Card.CardName cardName21 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card22 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card19, cardName21);
    cs362.dominion.Card.CardName cardName23 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card24 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card19, cardName23);
    cs362.dominion.Card card25 = cs362.dominion.Card.getCard(list_card17, cardName23);
    cs362.dominion.Card.CardName cardName26 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card27 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName26);
    cs362.dominion.Card.CardName cardName28 = cs362.dominion.Card.CardName.Baron;
    java.util.List<cs362.dominion.Card> list_card29 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName28);
    cs362.dominion.Card.CardName cardName30 = cs362.dominion.Card.CardName.Estate;
    cs362.dominion.Card card31 = cs362.dominion.Card.getCard(list_card17, cardName30);
    cs362.dominion.Card[] card_array32 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card33, card_array32);
    cs362.dominion.Card.CardName cardName35 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card36 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card33, cardName35);
    cs362.dominion.Card.CardName cardName37 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card38 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card33, cardName37);
    cs362.dominion.Card.Type type39 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card40 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card38, type39);
    java.util.List<cs362.dominion.Card> list_card41 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card17, type39);
    java.util.List<cs362.dominion.Card> list_card42 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type39);
    cs362.dominion.Card.CardName cardName43 = cs362.dominion.Card.CardName.Village;
    java.util.List<cs362.dominion.Card> list_card44 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card42, cardName43);
    cs362.dominion.Card.Type type45 = null;
    java.util.List<cs362.dominion.Card> list_card46 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card44, type45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName3.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName10.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName15.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName21.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName23.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName26.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + cs362.dominion.Card.CardName.Baron + "'", cardName28.equals(cs362.dominion.Card.CardName.Baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + cs362.dominion.Card.CardName.Estate + "'", cardName30.equals(cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    org.junit.Assert.assertTrue("'" + cardName35 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName35.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card36);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName37.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type39.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + cardName43 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName43.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test030"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test031"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str15 = player2.toString();
    java.lang.String str16 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str19 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str15.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str19.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test032"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.Type type5 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type5);
    cs362.dominion.Card[] card_array7 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card8, card_array7);
    cs362.dominion.Card.CardName cardName10 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card11 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card8, cardName10);
    cs362.dominion.Card[] card_array12 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card13, card_array12);
    cs362.dominion.Card.CardName cardName15 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card16 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card13, cardName15);
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card8, cardName15);
    cs362.dominion.Card[] card_array18 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card19, card_array18);
    cs362.dominion.Card.CardName cardName21 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card22 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card19, cardName21);
    cs362.dominion.Card.CardName cardName23 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card24 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card19, cardName23);
    cs362.dominion.Card card25 = cs362.dominion.Card.getCard(list_card17, cardName23);
    cs362.dominion.Card.CardName cardName26 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card27 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName26);
    cs362.dominion.Card.CardName cardName28 = cs362.dominion.Card.CardName.Baron;
    java.util.List<cs362.dominion.Card> list_card29 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName28);
    cs362.dominion.Card[] card_array30 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card31 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card31, card_array30);
    cs362.dominion.Card.CardName cardName33 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card34 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card31, cardName33);
    cs362.dominion.Card.Type type35 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card36 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card31, type35);
    cs362.dominion.Card.CardName cardName37 = cs362.dominion.Card.CardName.Baron;
    cs362.dominion.Card card38 = cs362.dominion.Card.getCard(list_card36, cardName37);
    cs362.dominion.Card[] card_array39 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card40, card_array39);
    cs362.dominion.Card.CardName cardName42 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card43 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card40, cardName42);
    cs362.dominion.Card.CardName cardName44 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card45 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card40, cardName44);
    cs362.dominion.Card.Type type46 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card47 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card45, type46);
    cs362.dominion.Card.CardName cardName48 = cs362.dominion.Card.CardName.Village;
    cs362.dominion.Card card49 = cs362.dominion.Card.getCard(list_card47, cardName48);
    cs362.dominion.Card[] card_array50 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card51, card_array50);
    cs362.dominion.Card.CardName cardName53 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card54 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card51, cardName53);
    cs362.dominion.Card.CardName cardName55 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card56 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card51, cardName55);
    cs362.dominion.Card[] card_array57 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card58 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card58, card_array57);
    cs362.dominion.Card.CardName cardName60 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card61 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card58, cardName60);
    cs362.dominion.Card.CardName cardName62 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card63 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card58, cardName62);
    cs362.dominion.Card.CardName cardName64 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card65 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card58, cardName64);
    cs362.dominion.Card card66 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card51, cardName64);
    java.util.List<cs362.dominion.Card> list_card67 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card47, cardName64);
    cs362.dominion.Card[] card_array68 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card69 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card69, card_array68);
    cs362.dominion.Card.CardName cardName71 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card72 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card69, cardName71);
    cs362.dominion.Card[] card_array73 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card74 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card74, card_array73);
    cs362.dominion.Card.CardName cardName76 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card77 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card74, cardName76);
    java.util.List<cs362.dominion.Card> list_card78 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card69, cardName76);
    cs362.dominion.Card card79 = cs362.dominion.Card.getCard(list_card47, cardName76);
    cs362.dominion.Card card80 = cs362.dominion.Card.getCard(list_card36, cardName76);
    cs362.dominion.Card card81 = cs362.dominion.Card.getCard(list_card17, cardName76);
    cs362.dominion.Card.CardName cardName82 = null;
    cs362.dominion.Card card83 = cs362.dominion.Card.getCard(list_card17, cardName82);
    cs362.dominion.Card[] card_array84 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card85 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b86 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card85, card_array84);
    cs362.dominion.Card.CardName cardName87 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card88 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card85, cardName87);
    cs362.dominion.Card.CardName cardName89 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card90 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card85, cardName89);
    cs362.dominion.Card.CardName cardName91 = cs362.dominion.Card.CardName.Gardens;
    cs362.dominion.Card card92 = cs362.dominion.Card.getCard(list_card90, cardName91);
    java.util.List<cs362.dominion.Card> list_card93 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName91);
    java.util.List<cs362.dominion.Card> list_card94 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName3.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type5.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName10.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName15.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName21.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName23.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName26.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + cs362.dominion.Card.CardName.Baron + "'", cardName28.equals(cs362.dominion.Card.CardName.Baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName33.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type35.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + cs362.dominion.Card.CardName.Baron + "'", cardName37.equals(cs362.dominion.Card.CardName.Baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName42.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card43);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName44.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type46.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    org.junit.Assert.assertTrue("'" + cardName48 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName48.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    org.junit.Assert.assertTrue("'" + cardName53 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName53.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card54);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName55.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    org.junit.Assert.assertTrue("'" + cardName60 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName60.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    org.junit.Assert.assertTrue("'" + cardName62 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName62.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + cardName64 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName64.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    org.junit.Assert.assertTrue("'" + cardName71 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName71.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    org.junit.Assert.assertTrue("'" + cardName76 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName76.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    org.junit.Assert.assertTrue("'" + cardName87 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName87.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card88);
    org.junit.Assert.assertTrue("'" + cardName89 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName89.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card90);
    org.junit.Assert.assertTrue("'" + cardName91 + "' != '" + cs362.dominion.Card.CardName.Gardens + "'", cardName91.equals(cs362.dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test033"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test034"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test035"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "hi!");
    java.lang.String str3 = player2.toString();
    player2.buyCard();
    java.lang.String str5 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test036"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.CardName cardName5 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName5);
    cs362.dominion.Card.CardName cardName7 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card8 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName7);
    cs362.dominion.Card[] card_array9 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card10, card_array9);
    cs362.dominion.Card.CardName cardName12 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card13 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card10, cardName12);
    cs362.dominion.Card.CardName cardName14 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card15 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card10, cardName14);
    cs362.dominion.Card.Type type16 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card15, type16);
    java.util.List<cs362.dominion.Card> list_card18 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card8, type16);
    cs362.dominion.Card[] card_array19 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card20, card_array19);
    cs362.dominion.Card.CardName cardName22 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card23 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card20, cardName22);
    cs362.dominion.Card.CardName cardName24 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card25 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card20, cardName24);
    cs362.dominion.Card.Type type26 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card27 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card25, type26);
    java.util.List<cs362.dominion.Card> list_card28 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card18, type26);
    cs362.dominion.Card[] card_array29 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card30 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card30, card_array29);
    cs362.dominion.Card.CardName cardName32 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card33 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card30, cardName32);
    cs362.dominion.Card[] card_array34 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card35, card_array34);
    cs362.dominion.Card.CardName cardName37 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card38 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card35, cardName37);
    java.util.List<cs362.dominion.Card> list_card39 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card30, cardName37);
    cs362.dominion.Card[] card_array40 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card41, card_array40);
    cs362.dominion.Card.CardName cardName43 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card44 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card41, cardName43);
    cs362.dominion.Card.CardName cardName45 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card46 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card41, cardName45);
    cs362.dominion.Card card47 = cs362.dominion.Card.getCard(list_card39, cardName45);
    cs362.dominion.Card.CardName cardName48 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card49 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card39, cardName48);
    cs362.dominion.Card[] card_array50 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card51, card_array50);
    cs362.dominion.Card.CardName cardName53 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card54 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card51, cardName53);
    cs362.dominion.Card[] card_array55 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card56 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card56, card_array55);
    cs362.dominion.Card.CardName cardName58 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card59 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card56, cardName58);
    java.util.List<cs362.dominion.Card> list_card60 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card51, cardName58);
    cs362.dominion.Card[] card_array61 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card62 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card62, card_array61);
    cs362.dominion.Card.CardName cardName64 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card65 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card62, cardName64);
    cs362.dominion.Card.CardName cardName66 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card67 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card62, cardName66);
    cs362.dominion.Card card68 = cs362.dominion.Card.getCard(list_card60, cardName66);
    cs362.dominion.Card.CardName cardName69 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card70 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card60, cardName69);
    cs362.dominion.Card.CardName cardName71 = cs362.dominion.Card.CardName.Baron;
    java.util.List<cs362.dominion.Card> list_card72 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card60, cardName71);
    cs362.dominion.Card.CardName cardName73 = cs362.dominion.Card.CardName.Estate;
    cs362.dominion.Card card74 = cs362.dominion.Card.getCard(list_card60, cardName73);
    java.util.List<cs362.dominion.Card> list_card75 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card39, cardName73);
    cs362.dominion.Card.CardName cardName76 = cs362.dominion.Card.CardName.CouncilRoom;
    java.util.List<cs362.dominion.Card> list_card77 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card39, cardName76);
    cs362.dominion.Card[] card_array78 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card79 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card79, card_array78);
    cs362.dominion.Card.CardName cardName81 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card82 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card79, cardName81);
    cs362.dominion.Card.CardName cardName83 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card84 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card79, cardName83);
    cs362.dominion.Card[] card_array85 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card86 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b87 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card86, card_array85);
    cs362.dominion.Card.CardName cardName88 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card89 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card86, cardName88);
    java.util.List<cs362.dominion.Card> list_card90 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card84, cardName88);
    cs362.dominion.Card.Type type91 = cs362.dominion.Card.Type.TREASURE;
    java.util.List<cs362.dominion.Card> list_card92 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card84, type91);
    java.util.List<cs362.dominion.Card> list_card93 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card39, type91);
    java.util.List<cs362.dominion.Card> list_card94 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card28, type91);
    cs362.dominion.Card.Type type95 = null;
    java.util.List<cs362.dominion.Card> list_card96 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card28, type95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName3.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName7.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName12.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName14.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type16.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName22.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName24.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type26.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    org.junit.Assert.assertTrue("'" + cardName32 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName32.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName37.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    org.junit.Assert.assertTrue("'" + cardName43 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName43.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card44);
    org.junit.Assert.assertTrue("'" + cardName45 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName45.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    org.junit.Assert.assertTrue("'" + cardName48 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName48.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    org.junit.Assert.assertTrue("'" + cardName53 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName53.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    org.junit.Assert.assertTrue("'" + cardName58 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName58.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    org.junit.Assert.assertTrue("'" + cardName64 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName64.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card65);
    org.junit.Assert.assertTrue("'" + cardName66 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName66.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card68);
    org.junit.Assert.assertTrue("'" + cardName69 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName69.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    org.junit.Assert.assertTrue("'" + cardName71 + "' != '" + cs362.dominion.Card.CardName.Baron + "'", cardName71.equals(cs362.dominion.Card.CardName.Baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    org.junit.Assert.assertTrue("'" + cardName73 + "' != '" + cs362.dominion.Card.CardName.Estate + "'", cardName73.equals(cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    org.junit.Assert.assertTrue("'" + cardName76 + "' != '" + cs362.dominion.Card.CardName.CouncilRoom + "'", cardName76.equals(cs362.dominion.Card.CardName.CouncilRoom));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    org.junit.Assert.assertTrue("'" + cardName81 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName81.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card82);
    org.junit.Assert.assertTrue("'" + cardName83 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName83.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    org.junit.Assert.assertTrue("'" + cardName88 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName88.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card90);
    org.junit.Assert.assertTrue("'" + type91 + "' != '" + cs362.dominion.Card.Type.TREASURE + "'", type91.equals(cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card96);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test037"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str7 = player2.toString();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test038"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str10 = player2.toString();
    java.lang.String str11 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test039"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test040"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.buyCard();
    java.lang.String str15 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str15.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test041"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str10 = player2.toString();
    player2.buyCard();
    java.lang.String str12 = player2.toString();
    java.lang.String str13 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test042"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.buyCard();
    player2.playTreasureCard();
    cs362.dominion.Card card16 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test043"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test044"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test045"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str11 = player2.toString();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test046"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test047"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test048"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str11 = player2.toString();
    java.lang.String str12 = player2.toString();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test049"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    cs362.dominion.Card card6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = player2.addToDeck(card6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test050"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test051"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str13 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str16 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test052"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str11 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str13 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test053"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    cs362.dominion.Card card8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = player2.addToDeck(card8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test054"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    player2.buyCard();
    cs362.dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test055"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str12 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test056"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test057"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.CardName cardName5 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName5);
    cs362.dominion.Card.CardName cardName7 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card8 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName7);
    cs362.dominion.Card[] card_array9 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card10, card_array9);
    cs362.dominion.Card.CardName cardName12 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card13 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card10, cardName12);
    cs362.dominion.Card.CardName cardName14 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card15 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card10, cardName14);
    cs362.dominion.Card.CardName cardName16 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card10, cardName16);
    cs362.dominion.Card.CardName cardName18 = cs362.dominion.Card.CardName.Smithy;
    java.util.List<cs362.dominion.Card> list_card19 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName18);
    cs362.dominion.Card.CardName cardName20 = cs362.dominion.Card.CardName.Village;
    java.util.List<cs362.dominion.Card> list_card21 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card19, cardName20);
    cs362.dominion.Card[] card_array22 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card23, card_array22);
    cs362.dominion.Card.CardName cardName25 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card26 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card23, cardName25);
    cs362.dominion.Card.CardName cardName27 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card28 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card23, cardName27);
    cs362.dominion.Card[] card_array29 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card30 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card30, card_array29);
    cs362.dominion.Card.CardName cardName32 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card33 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card30, cardName32);
    cs362.dominion.Card.CardName cardName34 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card35 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card30, cardName34);
    cs362.dominion.Card.CardName cardName36 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card37 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card30, cardName36);
    cs362.dominion.Card[] card_array38 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card39, card_array38);
    cs362.dominion.Card.CardName cardName41 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card42 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card39, cardName41);
    cs362.dominion.Card.CardName cardName43 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card44 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card39, cardName43);
    cs362.dominion.Card.Type type45 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card46 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card44, type45);
    java.util.List<cs362.dominion.Card> list_card47 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card37, type45);
    java.util.List<cs362.dominion.Card> list_card48 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card23, type45);
    java.util.List<cs362.dominion.Card> list_card49 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card19, type45);
    java.util.List<cs362.dominion.Card> list_card50 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card8, type45);
    cs362.dominion.Card[] card_array51 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card52 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card52, card_array51);
    cs362.dominion.Card.CardName cardName54 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card55 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card52, cardName54);
    cs362.dominion.Card[] card_array56 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card57 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card57, card_array56);
    cs362.dominion.Card.CardName cardName59 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card60 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card57, cardName59);
    cs362.dominion.Card.CardName cardName61 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card62 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card57, cardName61);
    java.util.List<cs362.dominion.Card> list_card63 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card52, cardName61);
    cs362.dominion.Card.Type type64 = cs362.dominion.Card.Type.TREASURE;
    java.util.List<cs362.dominion.Card> list_card65 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card52, type64);
    cs362.dominion.Card.CardName cardName66 = cs362.dominion.Card.CardName.Duchy;
    java.util.List<cs362.dominion.Card> list_card67 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card65, cardName66);
    java.util.List<cs362.dominion.Card> list_card68 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card8, cardName66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName3.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName7.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName12.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName14.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName16.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + cs362.dominion.Card.CardName.Smithy + "'", cardName18.equals(cs362.dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName20.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName25.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName27.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    org.junit.Assert.assertTrue("'" + cardName32 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName32.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card33);
    org.junit.Assert.assertTrue("'" + cardName34 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName34.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName36.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    org.junit.Assert.assertTrue("'" + cardName41 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName41.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card42);
    org.junit.Assert.assertTrue("'" + cardName43 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName43.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type45.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    org.junit.Assert.assertTrue("'" + cardName54 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName54.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    org.junit.Assert.assertTrue("'" + cardName59 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName59.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card60);
    org.junit.Assert.assertTrue("'" + cardName61 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName61.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + type64 + "' != '" + cs362.dominion.Card.Type.TREASURE + "'", type64.equals(cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    org.junit.Assert.assertTrue("'" + cardName66 + "' != '" + cs362.dominion.Card.CardName.Duchy + "'", cardName66.equals(cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card68);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test058"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str16 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str22 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str22.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test059"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    cs362.dominion.Card card12 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = player2.addToDeck(card12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test060"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test061"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test062"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.Type type5 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type5);
    cs362.dominion.Card[] card_array7 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card8, card_array7);
    cs362.dominion.Card.CardName cardName10 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card11 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card8, cardName10);
    cs362.dominion.Card[] card_array12 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card13, card_array12);
    cs362.dominion.Card.CardName cardName15 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card16 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card13, cardName15);
    cs362.dominion.Card.CardName cardName17 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card18 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card13, cardName17);
    cs362.dominion.Card card19 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card8, cardName17);
    cs362.dominion.Card.Type type20 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card21 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card8, type20);
    cs362.dominion.Card[] card_array22 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card23, card_array22);
    cs362.dominion.Card.CardName cardName25 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card26 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card23, cardName25);
    cs362.dominion.Card.CardName cardName27 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card28 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card23, cardName27);
    java.util.List<cs362.dominion.Card> list_card29 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card8, cardName27);
    cs362.dominion.Card.CardName cardName30 = null;
    java.util.List<cs362.dominion.Card> list_card31 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card8, cardName30);
    cs362.dominion.Card.CardName cardName32 = cs362.dominion.Card.CardName.Village;
    java.util.List<cs362.dominion.Card> list_card33 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card8, cardName32);
    java.util.List<cs362.dominion.Card> list_card34 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card6, cardName32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName3.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type5.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName10.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName15.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card16);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName17.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card19);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type20.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName25.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName27.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + cardName32 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName32.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test063"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    cs362.dominion.Card card10 = null;
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test064"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "hi!");
    player2.buyCard();
    java.lang.String str4 = player2.toString();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" --- hi! --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test065"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.CardName cardName5 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName5);
    cs362.dominion.Card.Type type7 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card8 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card6, type7);
    cs362.dominion.Card.CardName cardName9 = cs362.dominion.Card.CardName.Village;
    cs362.dominion.Card card10 = cs362.dominion.Card.getCard(list_card8, cardName9);
    cs362.dominion.Card[] card_array11 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card12, card_array11);
    cs362.dominion.Card.CardName cardName14 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card15 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card12, cardName14);
    cs362.dominion.Card.CardName cardName16 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card12, cardName16);
    cs362.dominion.Card[] card_array18 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card19, card_array18);
    cs362.dominion.Card.CardName cardName21 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card22 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card19, cardName21);
    cs362.dominion.Card card23 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card12, cardName21);
    cs362.dominion.Card[] card_array24 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card25 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card25, card_array24);
    cs362.dominion.Card.CardName cardName27 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card28 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card25, cardName27);
    cs362.dominion.Card.CardName cardName29 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card30 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card25, cardName29);
    cs362.dominion.Card.CardName cardName31 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card32 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card25, cardName31);
    cs362.dominion.Card.CardName cardName33 = cs362.dominion.Card.CardName.Smithy;
    java.util.List<cs362.dominion.Card> list_card34 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card32, cardName33);
    java.util.List<cs362.dominion.Card> list_card35 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card12, cardName33);
    java.util.List<cs362.dominion.Card> list_card36 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card8, cardName33);
    cs362.dominion.Card.CardName cardName37 = cs362.dominion.Card.CardName.Estate;
    cs362.dominion.Card card38 = cs362.dominion.Card.getCard(list_card36, cardName37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName3.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type7.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + cardName9 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName9.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName14.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName16.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName21.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    org.junit.Assert.assertTrue("'" + cardName27 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName27.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card28);
    org.junit.Assert.assertTrue("'" + cardName29 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName29.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    org.junit.Assert.assertTrue("'" + cardName31 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName31.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + cs362.dominion.Card.CardName.Smithy + "'", cardName33.equals(cs362.dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + cs362.dominion.Card.CardName.Estate + "'", cardName37.equals(cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test066"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    cs362.dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = player2.addToDeck(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test067"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test068"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str10 = player2.toString();
    java.lang.String str11 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test069"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.Type type5 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type5);
    cs362.dominion.Card.CardName cardName7 = cs362.dominion.Card.CardName.Cutpurse;
    java.util.List<cs362.dominion.Card> list_card8 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card6, cardName7);
    cs362.dominion.Card[] card_array9 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card10, card_array9);
    cs362.dominion.Card.CardName cardName12 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card13 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card10, cardName12);
    cs362.dominion.Card.CardName cardName14 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card15 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card10, cardName14);
    cs362.dominion.Card.CardName cardName16 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card10, cardName16);
    cs362.dominion.Card.CardName cardName18 = cs362.dominion.Card.CardName.Smithy;
    java.util.List<cs362.dominion.Card> list_card19 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName18);
    cs362.dominion.Card[] card_array20 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card21, card_array20);
    cs362.dominion.Card.CardName cardName23 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card24 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card21, cardName23);
    cs362.dominion.Card[] card_array25 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card26 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card26, card_array25);
    cs362.dominion.Card.CardName cardName28 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card29 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card26, cardName28);
    cs362.dominion.Card.CardName cardName30 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card31 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card26, cardName30);
    java.util.List<cs362.dominion.Card> list_card32 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card21, cardName30);
    cs362.dominion.Card.Type type33 = cs362.dominion.Card.Type.TREASURE;
    java.util.List<cs362.dominion.Card> list_card34 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card21, type33);
    cs362.dominion.Card[] card_array35 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card36, card_array35);
    cs362.dominion.Card.CardName cardName38 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card39 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card36, cardName38);
    cs362.dominion.Card.CardName cardName40 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card41 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card36, cardName40);
    cs362.dominion.Card[] card_array42 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card43 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card43, card_array42);
    cs362.dominion.Card.CardName cardName45 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card46 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card43, cardName45);
    cs362.dominion.Card.CardName cardName47 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card48 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card43, cardName47);
    cs362.dominion.Card.CardName cardName49 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card50 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card43, cardName49);
    cs362.dominion.Card card51 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card36, cardName49);
    cs362.dominion.Card card52 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card21, cardName49);
    java.util.List<cs362.dominion.Card> list_card53 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName49);
    cs362.dominion.Card[] card_array54 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card55 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card55, card_array54);
    cs362.dominion.Card.CardName cardName57 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card58 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card55, cardName57);
    cs362.dominion.Card[] card_array59 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card60 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card60, card_array59);
    cs362.dominion.Card.CardName cardName62 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card63 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card60, cardName62);
    cs362.dominion.Card.Type type64 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card65 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card60, type64);
    cs362.dominion.Card[] card_array66 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card67 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card67, card_array66);
    cs362.dominion.Card[] card_array69 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card70 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card70, card_array69);
    cs362.dominion.Card.CardName cardName72 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card73 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card70, cardName72);
    cs362.dominion.Card[] card_array74 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card75 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card75, card_array74);
    cs362.dominion.Card.CardName cardName77 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card78 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card75, cardName77);
    java.util.List<cs362.dominion.Card> list_card79 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card70, cardName77);
    cs362.dominion.Card[] card_array80 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card81 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card81, card_array80);
    cs362.dominion.Card.CardName cardName83 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card84 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card81, cardName83);
    cs362.dominion.Card.CardName cardName85 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card86 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card81, cardName85);
    cs362.dominion.Card card87 = cs362.dominion.Card.getCard(list_card79, cardName85);
    cs362.dominion.Card.CardName cardName88 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card89 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card79, cardName88);
    cs362.dominion.Card card90 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card67, cardName88);
    java.util.List<cs362.dominion.Card> list_card91 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card60, cardName88);
    cs362.dominion.Card card92 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card55, cardName88);
    java.util.List<cs362.dominion.Card> list_card93 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card17, cardName88);
    java.util.List<cs362.dominion.Card> list_card94 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card8, cardName88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName3.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type5.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + cs362.dominion.Card.CardName.Cutpurse + "'", cardName7.equals(cs362.dominion.Card.CardName.Cutpurse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName12.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName14.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName16.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + cs362.dominion.Card.CardName.Smithy + "'", cardName18.equals(cs362.dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName23.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName28.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName30.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    org.junit.Assert.assertTrue("'" + type33 + "' != '" + cs362.dominion.Card.Type.TREASURE + "'", type33.equals(cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName38.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    org.junit.Assert.assertTrue("'" + cardName40 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName40.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    org.junit.Assert.assertTrue("'" + cardName45 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName45.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card46);
    org.junit.Assert.assertTrue("'" + cardName47 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName47.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    org.junit.Assert.assertTrue("'" + cardName49 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName49.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName57.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    org.junit.Assert.assertTrue("'" + cardName62 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName62.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card63);
    org.junit.Assert.assertTrue("'" + type64 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type64.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    org.junit.Assert.assertTrue("'" + cardName72 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName72.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    org.junit.Assert.assertTrue("'" + cardName77 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName77.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + cardName83 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName83.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card84);
    org.junit.Assert.assertTrue("'" + cardName85 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName85.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card87);
    org.junit.Assert.assertTrue("'" + cardName88 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName88.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test070"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str15 = player2.toString();
    java.lang.String str16 = player2.toString();
    java.lang.String str17 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str19 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.BoardQuery();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str15.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str17.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str19.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test071"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str12 = player2.toString();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test072"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    java.lang.String str16 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test073"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playTreasureCard();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test074"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str17 = player2.toString();
    cs362.dominion.Card card18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = player2.addToDeck(card18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str17.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test075"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str6 = player2.toString();
    player2.playKingdomCard();
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test076"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    java.lang.String str10 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test077"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str15 = player2.toString();
    java.lang.String str16 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str19 = player2.toString();
    java.lang.String str20 = player2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str15.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str19.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str20.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test078"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str12 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test079"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str11 = player2.toString();
    player2.playTreasureCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str11.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test080"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str17 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str17.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test081"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test082"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    java.lang.String str3 = player2.toString();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str3.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test083"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test084"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test085"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test086"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.buyCard();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test087"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str12 = player2.toString();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    player2.playTreasureCard();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test088"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    player2.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test089"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str12 = player2.toString();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test090"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str13 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test091"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str12 = player2.toString();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test092"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    java.lang.String str5 = player2.toString();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test093"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    cs362.dominion.Card card11 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test094"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str12 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.endTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test095"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str8 = player2.toString();
    java.lang.String str9 = player2.toString();
    java.lang.String str10 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str10.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test096"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.buyCard();
    java.lang.String str16 = player2.toString();
    player2.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test097"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    java.lang.String str13 = player2.toString();
    cs362.dominion.Card card14 = null;
    // The following exception was thrown during execution in test generation
    try {
    player2.discard(card14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test098"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
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
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test099"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.playKingdomCard();
    java.lang.String str15 = player2.toString();
    java.lang.String str16 = player2.toString();
    player2.playTreasureCard();
    player2.playKingdomCard();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str15.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test100"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str9 = player2.toString();
    // The following exception was thrown during execution in test generation
    try {
    player2.initializePlayerTurn();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test101"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str12 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str12.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test102"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
    player2.playTreasureCard();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test103"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.buyCard();
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test104"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    player2.buyCard();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test105"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card[] card_array5 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card6, card_array5);
    cs362.dominion.Card.CardName cardName8 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card9 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card6, cardName8);
    java.util.List<cs362.dominion.Card> list_card10 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName8);
    cs362.dominion.Card[] card_array11 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card12, card_array11);
    cs362.dominion.Card.CardName cardName14 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card15 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card12, cardName14);
    cs362.dominion.Card.CardName cardName16 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card17 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card12, cardName16);
    cs362.dominion.Card card18 = cs362.dominion.Card.getCard(list_card10, cardName16);
    cs362.dominion.Card.CardName cardName19 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card20 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card10, cardName19);
    cs362.dominion.Card.CardName cardName21 = cs362.dominion.Card.CardName.Duchy;
    java.util.List<cs362.dominion.Card> list_card22 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card20, cardName21);
    cs362.dominion.Card[] card_array23 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card24, card_array23);
    cs362.dominion.Card.CardName cardName26 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card27 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card24, cardName26);
    cs362.dominion.Card[] card_array28 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card29, card_array28);
    cs362.dominion.Card.CardName cardName31 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card32 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card29, cardName31);
    cs362.dominion.Card.Type type33 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card34 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card29, type33);
    java.util.List<cs362.dominion.Card> list_card35 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card24, type33);
    java.util.List<cs362.dominion.Card> list_card36 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card20, type33);
    cs362.dominion.Card.Type type37 = cs362.dominion.Card.Type.TREASURE;
    java.util.List<cs362.dominion.Card> list_card38 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card20, type37);
    cs362.dominion.Card[] card_array39 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card40, card_array39);
    cs362.dominion.Card.CardName cardName42 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card43 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card40, cardName42);
    cs362.dominion.Card[] card_array44 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card45 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card45, card_array44);
    cs362.dominion.Card.CardName cardName47 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card48 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card45, cardName47);
    cs362.dominion.Card.CardName cardName49 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card50 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card45, cardName49);
    cs362.dominion.Card card51 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card40, cardName49);
    cs362.dominion.Card[] card_array52 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card53 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card53, card_array52);
    cs362.dominion.Card.CardName cardName55 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card56 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card53, cardName55);
    cs362.dominion.Card.CardName cardName57 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card58 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card53, cardName57);
    cs362.dominion.Card.Type type59 = cs362.dominion.Card.Type.VICTORY;
    java.util.List<cs362.dominion.Card> list_card60 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)list_card58, type59);
    cs362.dominion.Card.CardName cardName61 = cs362.dominion.Card.CardName.Village;
    cs362.dominion.Card card62 = cs362.dominion.Card.getCard(list_card60, cardName61);
    cs362.dominion.Card card63 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card40, cardName61);
    cs362.dominion.Card[] card_array64 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card65 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card65, card_array64);
    cs362.dominion.Card.CardName cardName67 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card68 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card65, cardName67);
    java.util.List<cs362.dominion.Card> list_card69 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card40, cardName67);
    cs362.dominion.Card card70 = cs362.dominion.Card.getCard(list_card38, cardName67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName3.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName8.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName14.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName16.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    org.junit.Assert.assertTrue("'" + cardName19 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName19.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + cs362.dominion.Card.CardName.Duchy + "'", cardName21.equals(cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName26.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    org.junit.Assert.assertTrue("'" + cardName31 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName31.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    org.junit.Assert.assertTrue("'" + type33 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type33.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + cs362.dominion.Card.Type.TREASURE + "'", type37.equals(cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName42.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    org.junit.Assert.assertTrue("'" + cardName47 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName47.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card48);
    org.junit.Assert.assertTrue("'" + cardName49 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName49.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName55.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName57.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    org.junit.Assert.assertTrue("'" + type59 + "' != '" + cs362.dominion.Card.Type.VICTORY + "'", type59.equals(cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    org.junit.Assert.assertTrue("'" + cardName61 + "' != '" + cs362.dominion.Card.CardName.Village + "'", cardName61.equals(cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    org.junit.Assert.assertTrue("'" + cardName67 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName67.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card70);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test106"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    java.lang.String str7 = player2.toString();
    player2.playTreasureCard();
    java.lang.String str9 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str9.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test107"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n");
    player2.playKingdomCard();
    java.lang.String str4 = player2.toString();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + " ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str4.equals(" ---  ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test108"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    player2.buyCard();
    player2.playTreasureCard();
    player2.playTreasureCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test109"); }

    cs362.dominion.GameState gameState0 = null;
    cs362.dominion.Player player2 = new cs362.dominion.Player(gameState0, "");
    player2.buyCard();
    player2.playKingdomCard();
    java.lang.String str5 = player2.toString();
    java.lang.String str6 = player2.toString();
    java.lang.String str7 = player2.toString();
    java.lang.String str8 = player2.toString();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playKingdomCard();
    player2.playTreasureCard();
    java.lang.String str13 = player2.toString();
    player2.buyCard();
    java.lang.String str15 = player2.toString();
    java.lang.String str16 = player2.toString();
    player2.buyCard();
    player2.playTreasureCard();
    java.lang.String str19 = player2.toString();
    player2.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str5.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str6.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str7.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str8.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str13.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str15.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str16.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"+ "'", str19.equals(" ---  --- \n --- --------------------------- --- \nHand:\t\t [ ] \nDiscard:\t [ ] \n0Deck:\t\t [ ] \nPlayed Cards:\t [ ] \nActions Left:\t 0\nCoins:\t\t 0\nBuys Left:\t 0\n\n"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test110"); }

    cs362.dominion.Card[] card_array0 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card1, card_array0);
    cs362.dominion.Card.CardName cardName3 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card4 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card1, cardName3);
    cs362.dominion.Card.CardName cardName5 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card6 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName5);
    cs362.dominion.Card.CardName cardName7 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card8 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, cardName7);
    cs362.dominion.Card.Type type9 = cs362.dominion.Card.Type.ACTION;
    java.util.List<cs362.dominion.Card> list_card10 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card1, type9);
    cs362.dominion.Card[] card_array11 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card12, card_array11);
    cs362.dominion.Card[] card_array14 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card15, card_array14);
    cs362.dominion.Card.CardName cardName17 = cs362.dominion.Card.CardName.Gold;
    cs362.dominion.Card card18 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card15, cardName17);
    cs362.dominion.Card[] card_array19 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card20, card_array19);
    cs362.dominion.Card.CardName cardName22 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card23 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card20, cardName22);
    java.util.List<cs362.dominion.Card> list_card24 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card15, cardName22);
    cs362.dominion.Card[] card_array25 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card26 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card26, card_array25);
    cs362.dominion.Card.CardName cardName28 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card29 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card26, cardName28);
    cs362.dominion.Card.CardName cardName30 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card31 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card26, cardName30);
    cs362.dominion.Card card32 = cs362.dominion.Card.getCard(list_card24, cardName30);
    cs362.dominion.Card.CardName cardName33 = cs362.dominion.Card.CardName.Feast;
    java.util.List<cs362.dominion.Card> list_card34 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card24, cardName33);
    cs362.dominion.Card card35 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card12, cardName33);
    cs362.dominion.Card[] card_array36 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card37 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card37, card_array36);
    cs362.dominion.Card.CardName cardName39 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card40 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card37, cardName39);
    cs362.dominion.Card.CardName cardName41 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card42 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card37, cardName41);
    cs362.dominion.Card.CardName cardName43 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card44 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card37, cardName43);
    cs362.dominion.Card.CardName cardName45 = cs362.dominion.Card.CardName.Smithy;
    java.util.List<cs362.dominion.Card> list_card46 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card44, cardName45);
    cs362.dominion.Card[] card_array47 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card48, card_array47);
    cs362.dominion.Card.CardName cardName50 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card51 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card48, cardName50);
    cs362.dominion.Card.CardName cardName52 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card53 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card48, cardName52);
    cs362.dominion.Card.CardName cardName54 = cs362.dominion.Card.CardName.Adventurer;
    java.util.List<cs362.dominion.Card> list_card55 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card48, cardName54);
    cs362.dominion.Card.Type type56 = cs362.dominion.Card.Type.ACTION;
    java.util.List<cs362.dominion.Card> list_card57 = cs362.dominion.Card.filter((java.lang.Iterable<cs362.dominion.Card>)arraylist_card48, type56);
    cs362.dominion.Card[] card_array58 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card59 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card59, card_array58);
    cs362.dominion.Card.CardName cardName61 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card62 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card59, cardName61);
    cs362.dominion.Card[] card_array63 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card64 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card64, card_array63);
    cs362.dominion.Card.CardName cardName66 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card67 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card64, cardName66);
    cs362.dominion.Card.CardName cardName68 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card69 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card64, cardName68);
    java.util.List<cs362.dominion.Card> list_card70 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card59, cardName68);
    cs362.dominion.Card[] card_array71 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card72 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card72, card_array71);
    cs362.dominion.Card.CardName cardName74 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card75 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card72, cardName74);
    cs362.dominion.Card[] card_array76 = new cs362.dominion.Card[] {  };
    java.util.ArrayList<cs362.dominion.Card> arraylist_card77 = new java.util.ArrayList<cs362.dominion.Card>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<cs362.dominion.Card>)arraylist_card77, card_array76);
    cs362.dominion.Card.CardName cardName79 = cs362.dominion.Card.CardName.Cooper;
    cs362.dominion.Card card80 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card77, cardName79);
    cs362.dominion.Card.CardName cardName81 = cs362.dominion.Card.CardName.Mine;
    java.util.List<cs362.dominion.Card> list_card82 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card77, cardName81);
    java.util.List<cs362.dominion.Card> list_card83 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card72, cardName81);
    java.util.List<cs362.dominion.Card> list_card84 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)arraylist_card59, cardName81);
    java.util.List<cs362.dominion.Card> list_card85 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card57, cardName81);
    cs362.dominion.Card card86 = cs362.dominion.Card.getCard(list_card44, cardName81);
    cs362.dominion.Card card87 = cs362.dominion.Card.getCard((java.util.List<cs362.dominion.Card>)arraylist_card12, cardName81);
    java.util.List<cs362.dominion.Card> list_card88 = cs362.dominion.Card.filterName((java.lang.Iterable<cs362.dominion.Card>)list_card10, cardName81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName3.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card4);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName5.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName7.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + cs362.dominion.Card.Type.ACTION + "'", type9.equals(cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + cs362.dominion.Card.CardName.Gold + "'", cardName17.equals(cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName22.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName28.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName30.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + cs362.dominion.Card.CardName.Feast + "'", cardName33.equals(cs362.dominion.Card.CardName.Feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    org.junit.Assert.assertTrue("'" + cardName39 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName39.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card40);
    org.junit.Assert.assertTrue("'" + cardName41 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName41.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + cardName43 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName43.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + cardName45 + "' != '" + cs362.dominion.Card.CardName.Smithy + "'", cardName45.equals(cs362.dominion.Card.CardName.Smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    org.junit.Assert.assertTrue("'" + cardName50 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName50.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card51);
    org.junit.Assert.assertTrue("'" + cardName52 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName52.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    org.junit.Assert.assertTrue("'" + cardName54 + "' != '" + cs362.dominion.Card.CardName.Adventurer + "'", cardName54.equals(cs362.dominion.Card.CardName.Adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    org.junit.Assert.assertTrue("'" + type56 + "' != '" + cs362.dominion.Card.Type.ACTION + "'", type56.equals(cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    org.junit.Assert.assertTrue("'" + cardName61 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName61.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    org.junit.Assert.assertTrue("'" + cardName66 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName66.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card67);
    org.junit.Assert.assertTrue("'" + cardName68 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName68.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    org.junit.Assert.assertTrue("'" + cardName74 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName74.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    org.junit.Assert.assertTrue("'" + cardName79 + "' != '" + cs362.dominion.Card.CardName.Cooper + "'", cardName79.equals(cs362.dominion.Card.CardName.Cooper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card80);
    org.junit.Assert.assertTrue("'" + cardName81 + "' != '" + cs362.dominion.Card.CardName.Mine + "'", cardName81.equals(cs362.dominion.Card.CardName.Mine));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card88);

  }

}
