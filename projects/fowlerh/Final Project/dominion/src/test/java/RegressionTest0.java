
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    GameBoard gameBoard2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Player player3 = new Player("hi!", (int)'a', gameBoard2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    GameBoard gameBoard2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Player player3 = new Player("", (-1), gameBoard2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    Card card0 = Card.baron;
    int i1 = card0.getTreasure();
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.baron + "'", card0.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    Card card0 = Card.estate;
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.estate + "'", card0.equals(Card.estate));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card7 = player5.getDeck();
    GameBoard gameBoard8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Card card9 = player5.getRandomBuyCard(gameBoard8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card7);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    player5.addActions(1);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', (int)(short)0);
    boolean b3 = gameBoard2.gameDone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    int i7 = player5.getCoins();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    gameBoard2.trashCard(card11);
    GameBoard gameBoard24 = new GameBoard((int)(byte)1, 10);
    Player player25 = new Player("", (-1), gameBoard24);
    Card card26 = Card.silver;
    java.util.List<java.lang.String> list_str27 = card26.getTypes();
    Card card28 = Card.adventurer;
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    GameBoard gameBoard33 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard36 = new GameBoard((int)(byte)1, 10);
    Card card37 = Card.baron;
    boolean b38 = gameBoard36.placeEmbargo(card37);
    gameBoard33.takeCard(card37);
    GameBoard gameBoard42 = new GameBoard((int)(byte)1, 10);
    Card card43 = Card.duchy;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.silver;
    Card card48 = Card.gold;
    Card card49 = Card.baron;
    int i50 = card49.getCost();
    Card card51 = Card.ambassador;
    Card card52 = null;
    Card card53 = Card.feast;
    Card card54 = null;
    java.util.List<Card> list_card55 = gameBoard42.kingdomCards(card43, card44, card45, card47, card48, card49, card51, card52, card53, card54);
    Card card56 = Card.remodel;
    Card card57 = Card.silver;
    java.util.List<java.lang.String> list_str58 = card57.getTypes();
    GameBoard gameBoard61 = new GameBoard((int)(byte)1, 10);
    Card card62 = Card.duchy;
    Card card63 = Card.gold;
    Card card64 = Card.baron;
    int i65 = card64.getCost();
    Card card66 = Card.silver;
    Card card67 = Card.gold;
    Card card68 = Card.baron;
    int i69 = card68.getCost();
    Card card70 = Card.ambassador;
    Card card71 = null;
    Card card72 = Card.feast;
    Card card73 = null;
    java.util.List<Card> list_card74 = gameBoard61.kingdomCards(card62, card63, card64, card66, card67, card68, card70, card71, card72, card73);
    Card card75 = Card.gold;
    GameBoard gameBoard78 = new GameBoard((int)(byte)1, 10);
    Card card79 = Card.duchy;
    Card card80 = Card.gold;
    Card card81 = Card.baron;
    int i82 = card81.getCost();
    Card card83 = Card.silver;
    Card card84 = Card.gold;
    Card card85 = Card.baron;
    int i86 = card85.getCost();
    Card card87 = Card.ambassador;
    Card card88 = null;
    Card card89 = Card.feast;
    Card card90 = null;
    java.util.List<Card> list_card91 = gameBoard78.kingdomCards(card79, card80, card81, card83, card84, card85, card87, card88, card89, card90);
    java.util.List<Card> list_card92 = gameBoard24.kingdomCards(card26, card28, card29, card37, card48, card56, card57, card67, card75, card85);
    gameBoard2.trashCard(card48);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.silver + "'", card26.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.adventurer + "'", card28.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.baron + "'", card37.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.duchy + "'", card43.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.silver + "'", card47.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.gold + "'", card48.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.baron + "'", card49.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 4);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.ambassador + "'", card51.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.feast + "'", card53.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.remodel + "'", card56.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.silver + "'", card57.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str58);
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.duchy + "'", card62.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.gold + "'", card63.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.baron + "'", card64.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 4);
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.silver + "'", card66.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.gold + "'", card67.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.baron + "'", card68.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 4);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.ambassador + "'", card70.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.feast + "'", card72.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card74);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.gold + "'", card75.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.duchy + "'", card79.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.gold + "'", card80.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.baron + "'", card81.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 4);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.silver + "'", card83.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card84 + "' != '" + Card.gold + "'", card84.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.baron + "'", card85.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 4);
    org.junit.Assert.assertTrue("'" + card87 + "' != '" + Card.ambassador + "'", card87.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card89 + "' != '" + Card.feast + "'", card89.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card92);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    boolean b38 = player5.hasActions();
    GameBoard gameBoard42 = new GameBoard((int)'#', "hi!");
    boolean b43 = gameBoard42.gameDone();
    // The following exception was thrown during execution in test generation
    try {
    player5.playCard((int)(short)-1, gameBoard42);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    GameBoard gameBoard66 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard70 = new GameBoard((int)(byte)1, 10);
    Card card71 = Card.duchy;
    Card card72 = Card.gold;
    Card card73 = Card.baron;
    int i74 = card73.getCost();
    Card card75 = Card.silver;
    Card card76 = Card.gold;
    Card card77 = Card.baron;
    int i78 = card77.getCost();
    Card card79 = Card.ambassador;
    Card card80 = null;
    Card card81 = Card.feast;
    Card card82 = null;
    java.util.List<Card> list_card83 = gameBoard70.kingdomCards(card71, card72, card73, card75, card76, card77, card79, card80, card81, card82);
    gameBoard66.opponentGainCard((int)'#', card77);
    Card card85 = Card.silver;
    int i86 = gameBoard66.numCardsAvailable(card85);
    java.util.List<Card> list_card88 = gameBoard66.kingdomCards((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    player5.playCard((int)(byte)100, gameBoard66);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.duchy + "'", card71.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.gold + "'", card72.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.baron + "'", card73.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 4);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.silver + "'", card75.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.gold + "'", card76.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.baron + "'", card77.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 4);
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.ambassador + "'", card79.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.feast + "'", card81.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.silver + "'", card85.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card88);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    Card card0 = Card.mine;
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.mine + "'", card0.equals(Card.mine));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    GameBoard gameBoard35 = new GameBoard((int)(byte)1, 10);
    Card card36 = Card.baron;
    boolean b37 = gameBoard35.placeEmbargo(card36);
    gameBoard35.opponentDraw(1);
    // The following exception was thrown during execution in test generation
    try {
    player5.playCard((int)'a', gameBoard35);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Card card33 = Card.duchy;
    Card card34 = Card.gold;
    Card card35 = Card.baron;
    int i36 = card35.getCost();
    Card card37 = Card.silver;
    Card card38 = Card.gold;
    Card card39 = Card.baron;
    int i40 = card39.getCost();
    Card card41 = Card.ambassador;
    Card card42 = null;
    Card card43 = Card.feast;
    Card card44 = null;
    java.util.List<Card> list_card45 = gameBoard32.kingdomCards(card33, card34, card35, card37, card38, card39, card41, card42, card43, card44);
    GameBoard gameBoard46 = null;
    // The following exception was thrown during execution in test generation
    try {
    player5.gainCardToHand(card42, gameBoard46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.duchy + "'", card33.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.gold + "'", card34.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4);
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.silver + "'", card37.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.gold + "'", card38.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.baron + "'", card39.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 4);
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.ambassador + "'", card41.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.feast + "'", card43.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    java.util.List<Card> list_card3 = gameBoard2.getTrash();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.countTreasure();
    GameBoard gameBoard72 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard75 = new GameBoard((int)(byte)1, 10);
    Card card76 = Card.duchy;
    Card card77 = Card.gold;
    Card card78 = Card.baron;
    int i79 = card78.getCost();
    Card card80 = Card.silver;
    Card card81 = Card.gold;
    Card card82 = Card.baron;
    int i83 = card82.getCost();
    Card card84 = Card.ambassador;
    Card card85 = null;
    Card card86 = Card.feast;
    Card card87 = null;
    java.util.List<Card> list_card88 = gameBoard75.kingdomCards(card76, card77, card78, card80, card81, card82, card84, card85, card86, card87);
    gameBoard72.trashCard(card81);
    // The following exception was thrown during execution in test generation
    try {
    player5.playCard((-1), gameBoard72);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.duchy + "'", card76.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.gold + "'", card77.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.baron + "'", card78.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 4);
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.silver + "'", card80.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.gold + "'", card81.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card82 + "' != '" + Card.baron + "'", card82.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 4);
    org.junit.Assert.assertTrue("'" + card84 + "' != '" + Card.ambassador + "'", card84.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card86 + "' != '" + Card.feast + "'", card86.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card88);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card7 = player5.getDeck();
    player5.addActions((int)(short)1);
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Player player15 = new Player("", (-1), gameBoard14);
    Card card16 = Card.silver;
    java.util.List<java.lang.String> list_str17 = card16.getTypes();
    Card card18 = Card.adventurer;
    Card card19 = Card.baron;
    int i20 = card19.getCost();
    GameBoard gameBoard23 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Card card27 = Card.baron;
    boolean b28 = gameBoard26.placeEmbargo(card27);
    gameBoard23.takeCard(card27);
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Card card33 = Card.duchy;
    Card card34 = Card.gold;
    Card card35 = Card.baron;
    int i36 = card35.getCost();
    Card card37 = Card.silver;
    Card card38 = Card.gold;
    Card card39 = Card.baron;
    int i40 = card39.getCost();
    Card card41 = Card.ambassador;
    Card card42 = null;
    Card card43 = Card.feast;
    Card card44 = null;
    java.util.List<Card> list_card45 = gameBoard32.kingdomCards(card33, card34, card35, card37, card38, card39, card41, card42, card43, card44);
    Card card46 = Card.remodel;
    Card card47 = Card.silver;
    java.util.List<java.lang.String> list_str48 = card47.getTypes();
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Card card52 = Card.duchy;
    Card card53 = Card.gold;
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    Card card56 = Card.silver;
    Card card57 = Card.gold;
    Card card58 = Card.baron;
    int i59 = card58.getCost();
    Card card60 = Card.ambassador;
    Card card61 = null;
    Card card62 = Card.feast;
    Card card63 = null;
    java.util.List<Card> list_card64 = gameBoard51.kingdomCards(card52, card53, card54, card56, card57, card58, card60, card61, card62, card63);
    Card card65 = Card.gold;
    GameBoard gameBoard68 = new GameBoard((int)(byte)1, 10);
    Card card69 = Card.duchy;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.silver;
    Card card74 = Card.gold;
    Card card75 = Card.baron;
    int i76 = card75.getCost();
    Card card77 = Card.ambassador;
    Card card78 = null;
    Card card79 = Card.feast;
    Card card80 = null;
    java.util.List<Card> list_card81 = gameBoard68.kingdomCards(card69, card70, card71, card73, card74, card75, card77, card78, card79, card80);
    java.util.List<Card> list_card82 = gameBoard14.kingdomCards(card16, card18, card19, card27, card38, card46, card47, card57, card65, card75);
    card18.setVictory((int)(short)0);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    boolean b88 = gameBoard87.gameDone();
    GameBoard gameBoard91 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard94 = new GameBoard((int)(byte)1, 10);
    Card card95 = Card.baron;
    boolean b96 = gameBoard94.placeEmbargo(card95);
    gameBoard91.takeCard(card95);
    boolean b98 = gameBoard87.hasCardsAvailable(card95);
    player5.gainCard(card18, gameBoard87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card7);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.adventurer + "'", card18.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.baron + "'", card19.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.baron + "'", card27.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.duchy + "'", card33.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.gold + "'", card34.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 4);
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.silver + "'", card37.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.gold + "'", card38.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.baron + "'", card39.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 4);
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.ambassador + "'", card41.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.feast + "'", card43.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.remodel + "'", card46.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.silver + "'", card47.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.duchy + "'", card52.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.gold + "'", card53.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.silver + "'", card56.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.gold + "'", card57.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.baron + "'", card58.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 4);
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.ambassador + "'", card60.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.feast + "'", card62.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card64);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.gold + "'", card65.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.duchy + "'", card69.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.silver + "'", card73.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.gold + "'", card74.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.baron + "'", card75.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 4);
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.ambassador + "'", card77.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.feast + "'", card79.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    org.junit.Assert.assertTrue("'" + card95 + "' != '" + Card.baron + "'", card95.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)-1, "");

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.baron;
    boolean b4 = gameBoard2.placeEmbargo(card3);
    gameBoard2.opponentDraw(1);
    GameBoard gameBoard12 = new GameBoard((int)(byte)1, 10);
    Player player13 = new Player("", (-1), gameBoard12);
    java.util.List<java.lang.Integer> list_i14 = player13.getActionCardIndices();
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    boolean b17 = player13.hasCard(card15);
    Card card18 = Card.baron;
    int i19 = player13.getNumberInHand(card18);
    gameBoard2.opponentGainCard(10, card18);
    java.util.List<Card> list_card21 = gameBoard2.getAllKingdomCards();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.baron + "'", card3.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i14);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    Card card0 = Card.cutpurse;
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.cutpurse + "'", card0.equals(Card.cutpurse));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    Card card0 = Card.province;
    java.util.List<java.lang.String> list_str1 = card0.getTypes();
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.province + "'", card0.equals(Card.province));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    java.util.List<Card> list_card32 = player5.getDiscard();
    player5.discardHandAndInPlay();
    java.util.List<Card> list_card34 = player5.getHand();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    Card card0 = Card.copper;
    java.util.List<java.lang.String> list_str1 = card0.getTypes();
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.copper + "'", card0.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    Card card0 = Card.salvager;
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.salvager + "'", card0.equals(Card.salvager));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    java.util.List<Player> list_player4 = gameBoard2.getPlayers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasBuys();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    boolean b20 = gameBoard2.hasCardsAvailable(card9);
    java.util.List<Card> list_card21 = gameBoard2.getAllKingdomCards();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.duchy;
    Card card13 = Card.gold;
    Card card14 = Card.baron;
    int i15 = card14.getCost();
    Card card16 = Card.silver;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.ambassador;
    Card card21 = null;
    Card card22 = Card.feast;
    Card card23 = null;
    java.util.List<Card> list_card24 = gameBoard11.kingdomCards(card12, card13, card14, card16, card17, card18, card20, card21, card22, card23);
    gameBoard2.takeCard(card22);
    int i26 = gameBoard2.getTotalEmbargoTokens();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.duchy + "'", card12.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.gold + "'", card13.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.baron + "'", card14.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.ambassador + "'", card20.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.feast + "'", card22.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    GameBoard gameBoard72 = new GameBoard((int)(byte)1, 10);
    Card card73 = Card.duchy;
    Card card74 = Card.gold;
    Card card75 = Card.baron;
    int i76 = card75.getCost();
    Card card77 = Card.silver;
    Card card78 = Card.gold;
    Card card79 = Card.baron;
    int i80 = card79.getCost();
    Card card81 = Card.ambassador;
    Card card82 = null;
    Card card83 = Card.feast;
    Card card84 = null;
    java.util.List<Card> list_card85 = gameBoard72.kingdomCards(card73, card74, card75, card77, card78, card79, card81, card82, card83, card84);
    int i86 = player5.getNumberInHand(card75);
    int i87 = card75.getTreasure();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.duchy + "'", card73.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.gold + "'", card74.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.baron + "'", card75.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 4);
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.silver + "'", card77.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.gold + "'", card78.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.baron + "'", card79.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 4);
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.ambassador + "'", card81.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.feast + "'", card83.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    boolean b20 = gameBoard2.hasCardsAvailable(card9);
    java.util.List<Card> list_card22 = gameBoard2.getPurchaseableCards((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getNumActions();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    boolean b20 = gameBoard2.hasCardsAvailable(card9);
    card9.setVictory((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    int i11 = player5.getCoins();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.duchy;
    Card card13 = Card.gold;
    Card card14 = Card.baron;
    int i15 = card14.getCost();
    Card card16 = Card.silver;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.ambassador;
    Card card21 = null;
    Card card22 = Card.feast;
    Card card23 = null;
    java.util.List<Card> list_card24 = gameBoard11.kingdomCards(card12, card13, card14, card16, card17, card18, card20, card21, card22, card23);
    gameBoard2.takeCard(card22);
    gameBoard2.displayFinalScores();
    java.util.List<Card> list_card28 = gameBoard2.kingdomCards(12);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.duchy + "'", card12.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.gold + "'", card13.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.baron + "'", card14.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.ambassador + "'", card20.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.feast + "'", card22.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.silver;
    java.util.List<java.lang.String> list_str7 = card6.getTypes();
    Card card8 = Card.adventurer;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    GameBoard gameBoard13 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Card card17 = Card.baron;
    boolean b18 = gameBoard16.placeEmbargo(card17);
    gameBoard13.takeCard(card17);
    GameBoard gameBoard22 = new GameBoard((int)(byte)1, 10);
    Card card23 = Card.duchy;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.silver;
    Card card28 = Card.gold;
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    Card card31 = Card.ambassador;
    Card card32 = null;
    Card card33 = Card.feast;
    Card card34 = null;
    java.util.List<Card> list_card35 = gameBoard22.kingdomCards(card23, card24, card25, card27, card28, card29, card31, card32, card33, card34);
    Card card36 = Card.remodel;
    Card card37 = Card.silver;
    java.util.List<java.lang.String> list_str38 = card37.getTypes();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    Card card55 = Card.gold;
    GameBoard gameBoard58 = new GameBoard((int)(byte)1, 10);
    Card card59 = Card.duchy;
    Card card60 = Card.gold;
    Card card61 = Card.baron;
    int i62 = card61.getCost();
    Card card63 = Card.silver;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.ambassador;
    Card card68 = null;
    Card card69 = Card.feast;
    Card card70 = null;
    java.util.List<Card> list_card71 = gameBoard58.kingdomCards(card59, card60, card61, card63, card64, card65, card67, card68, card69, card70);
    java.util.List<Card> list_card72 = gameBoard4.kingdomCards(card6, card8, card9, card17, card28, card36, card37, card47, card55, card65);
    int i73 = card47.getVictory();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.silver + "'", card6.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.adventurer + "'", card8.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.duchy + "'", card23.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.silver + "'", card27.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.gold + "'", card28.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.ambassador + "'", card31.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.feast + "'", card33.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.remodel + "'", card36.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.silver + "'", card37.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.duchy + "'", card59.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.gold + "'", card60.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.baron + "'", card61.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 4);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.silver + "'", card63.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.ambassador + "'", card67.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.feast + "'", card69.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    java.lang.String str38 = player5.getName();
    java.util.List<Card> list_card39 = player5.getPlayedCards();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)1, "");
    GameBoard gameBoard7 = new GameBoard((int)(byte)1, 10);
    Player player8 = new Player("", (-1), gameBoard7);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.duchy;
    Card card13 = Card.gold;
    Card card14 = Card.baron;
    int i15 = card14.getCost();
    Card card16 = Card.silver;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.ambassador;
    Card card21 = null;
    Card card22 = Card.feast;
    Card card23 = null;
    java.util.List<Card> list_card24 = gameBoard11.kingdomCards(card12, card13, card14, card16, card17, card18, card20, card21, card22, card23);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    player8.buyCard(card12, gameBoard29);
    Card card32 = Card.baron;
    int i33 = card32.getCost();
    player8.Discard(card32);
    int i35 = gameBoard2.numCardsAvailable(card32);
    int i36 = gameBoard2.getTotalEmbargoTokens();
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.duchy + "'", card12.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.gold + "'", card13.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.baron + "'", card14.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.ambassador + "'", card20.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.feast + "'", card22.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.baron + "'", card32.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.countTreasure();
    int i69 = player5.getTotalVictoryPoints();
    Card card70 = player5.drawCard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 55);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.copper + "'", card70.equals(Card.copper));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    java.util.List<Card> list_card29 = player5.getPlayedCards();
    java.util.List<Card> list_card30 = player5.getHand();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    boolean b32 = player5.hasBuys();
    int i33 = player5.getTotalVictoryPoints();
    int i34 = player5.getTotalVictoryPoints();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 55);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    GameBoard gameBoard4 = new GameBoard((int)'#', "hi!");
    boolean b5 = gameBoard4.gameDone();
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    boolean b22 = gameBoard4.hasCardsAvailable(card11);
    Player player23 = new Player("", 11, gameBoard4);
    java.util.List<Card> list_card25 = gameBoard4.getPurchaseableCards(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Player player11 = new Player("", (-1), gameBoard10);
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Card card15 = Card.duchy;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.silver;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.ambassador;
    Card card24 = null;
    Card card25 = Card.feast;
    Card card26 = null;
    java.util.List<Card> list_card27 = gameBoard14.kingdomCards(card15, card16, card17, card19, card20, card21, card23, card24, card25, card26);
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Player player33 = new Player("", (-1), gameBoard32);
    player11.buyCard(card15, gameBoard32);
    GameBoard gameBoard39 = new GameBoard((int)(byte)1, 10);
    Player player40 = new Player("", (-1), gameBoard39);
    Card card41 = Card.baron;
    GameBoard gameBoard46 = new GameBoard((int)(byte)1, 10);
    Player player47 = new Player("", (-1), gameBoard46);
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Card card51 = Card.duchy;
    Card card52 = Card.gold;
    Card card53 = Card.baron;
    int i54 = card53.getCost();
    Card card55 = Card.silver;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.ambassador;
    Card card60 = null;
    Card card61 = Card.feast;
    Card card62 = null;
    java.util.List<Card> list_card63 = gameBoard50.kingdomCards(card51, card52, card53, card55, card56, card57, card59, card60, card61, card62);
    GameBoard gameBoard68 = new GameBoard((int)(byte)1, 10);
    Player player69 = new Player("", (-1), gameBoard68);
    player47.buyCard(card51, gameBoard68);
    player40.gainCard(card41, gameBoard68);
    player11.Discard(card41);
    int i74 = player11.getNumberInHand("");
    boolean b75 = player11.hasBuys();
    Card card76 = player11.drawCard();
    GameBoard gameBoard77 = null;
    // The following exception was thrown during execution in test generation
    try {
    player5.gainCardToHand(card76, gameBoard77);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.duchy + "'", card15.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.silver + "'", card19.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.ambassador + "'", card23.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.feast + "'", card25.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.duchy + "'", card51.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.gold + "'", card52.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.baron + "'", card53.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 4);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.silver + "'", card55.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.ambassador + "'", card59.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.feast + "'", card61.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.copper + "'", card76.equals(Card.copper));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    GameBoard gameBoard6 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard9 = new GameBoard((int)(byte)1, 10);
    Card card10 = Card.baron;
    boolean b11 = gameBoard9.placeEmbargo(card10);
    gameBoard6.takeCard(card10);
    boolean b13 = gameBoard2.hasCardsAvailable(card10);
    java.util.List<Card> list_card14 = gameBoard2.getActiveSupplyPiles();
    gameBoard2.displayFinalScores();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    player5.initPlayerTurn();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    java.util.List<Card> list_card38 = player5.getDiscard();
    java.util.List<java.lang.Integer> list_i39 = player5.getActionCardIndices();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i39);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    Card card70 = player5.drawCard();
    int i71 = card70.getVictory();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.copper + "'", card70.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    java.util.List<Card> list_card24 = gameBoard2.getAllKingdomCards();
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Card card34 = Card.duchy;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.silver;
    Card card39 = Card.gold;
    Card card40 = Card.baron;
    int i41 = card40.getCost();
    Card card42 = Card.ambassador;
    Card card43 = null;
    Card card44 = Card.feast;
    Card card45 = null;
    java.util.List<Card> list_card46 = gameBoard33.kingdomCards(card34, card35, card36, card38, card39, card40, card42, card43, card44, card45);
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Player player52 = new Player("", (-1), gameBoard51);
    player30.buyCard(card34, gameBoard51);
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    player30.Discard(card54);
    int i57 = gameBoard2.numCardsAvailable(card54);
    java.util.List<Card> list_card59 = gameBoard2.kingdomCards((int)(byte)10);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Card card63 = Card.duchy;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.silver;
    Card card68 = Card.gold;
    Card card69 = Card.baron;
    int i70 = card69.getCost();
    Card card71 = Card.ambassador;
    Card card72 = null;
    Card card73 = Card.feast;
    Card card74 = null;
    java.util.List<Card> list_card75 = gameBoard62.kingdomCards(card63, card64, card65, card67, card68, card69, card71, card72, card73, card74);
    int i76 = gameBoard2.numEmbargoTokens(card64);
    java.util.List<Card> list_card78 = gameBoard2.kingdomCards(0);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.duchy + "'", card34.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.silver + "'", card38.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.gold + "'", card39.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.ambassador + "'", card42.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.feast + "'", card44.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.duchy + "'", card63.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.silver + "'", card67.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.gold + "'", card68.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.baron + "'", card69.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 4);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.ambassador + "'", card71.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.feast + "'", card73.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Player player14 = new Player("", (-1), gameBoard13);
    Card card15 = Card.silver;
    java.util.List<java.lang.String> list_str16 = card15.getTypes();
    Card card17 = Card.adventurer;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    GameBoard gameBoard22 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard25 = new GameBoard((int)(byte)1, 10);
    Card card26 = Card.baron;
    boolean b27 = gameBoard25.placeEmbargo(card26);
    gameBoard22.takeCard(card26);
    GameBoard gameBoard31 = new GameBoard((int)(byte)1, 10);
    Card card32 = Card.duchy;
    Card card33 = Card.gold;
    Card card34 = Card.baron;
    int i35 = card34.getCost();
    Card card36 = Card.silver;
    Card card37 = Card.gold;
    Card card38 = Card.baron;
    int i39 = card38.getCost();
    Card card40 = Card.ambassador;
    Card card41 = null;
    Card card42 = Card.feast;
    Card card43 = null;
    java.util.List<Card> list_card44 = gameBoard31.kingdomCards(card32, card33, card34, card36, card37, card38, card40, card41, card42, card43);
    Card card45 = Card.remodel;
    Card card46 = Card.silver;
    java.util.List<java.lang.String> list_str47 = card46.getTypes();
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Card card51 = Card.duchy;
    Card card52 = Card.gold;
    Card card53 = Card.baron;
    int i54 = card53.getCost();
    Card card55 = Card.silver;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.ambassador;
    Card card60 = null;
    Card card61 = Card.feast;
    Card card62 = null;
    java.util.List<Card> list_card63 = gameBoard50.kingdomCards(card51, card52, card53, card55, card56, card57, card59, card60, card61, card62);
    Card card64 = Card.gold;
    GameBoard gameBoard67 = new GameBoard((int)(byte)1, 10);
    Card card68 = Card.duchy;
    Card card69 = Card.gold;
    Card card70 = Card.baron;
    int i71 = card70.getCost();
    Card card72 = Card.silver;
    Card card73 = Card.gold;
    Card card74 = Card.baron;
    int i75 = card74.getCost();
    Card card76 = Card.ambassador;
    Card card77 = null;
    Card card78 = Card.feast;
    Card card79 = null;
    java.util.List<Card> list_card80 = gameBoard67.kingdomCards(card68, card69, card70, card72, card73, card74, card76, card77, card78, card79);
    java.util.List<Card> list_card81 = gameBoard13.kingdomCards(card15, card17, card18, card26, card37, card45, card46, card56, card64, card74);
    boolean b82 = gameBoard2.placeEmbargo(card26);
    Card card83 = Card.remodel;
    gameBoard2.trashCard(card83);
    Card card85 = Card.gardens;
    gameBoard2.trashCard(card85);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.adventurer + "'", card17.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.baron + "'", card26.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.duchy + "'", card32.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.gold + "'", card33.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.baron + "'", card34.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.silver + "'", card36.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.gold + "'", card37.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.ambassador + "'", card40.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.feast + "'", card42.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.remodel + "'", card45.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.duchy + "'", card51.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.gold + "'", card52.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.baron + "'", card53.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 4);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.silver + "'", card55.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.ambassador + "'", card59.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.feast + "'", card61.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.duchy + "'", card68.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.gold + "'", card69.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.baron + "'", card70.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 4);
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.silver + "'", card72.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.gold + "'", card73.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.baron + "'", card74.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 4);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.ambassador + "'", card76.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.feast + "'", card78.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.remodel + "'", card83.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.gardens + "'", card85.equals(Card.gardens));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    java.util.List<Card> list_card3 = gameBoard2.getTrash();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    int i20 = card11.getCost();
    boolean b21 = gameBoard2.hasCardsAvailable(card11);
    java.util.List<Player> list_player22 = gameBoard2.getPlayers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player22);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasActions();
    Card card68 = null;
    player5.Discard(card68);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    int i6 = gameBoard4.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    java.util.List<Card> list_card24 = gameBoard2.getAllKingdomCards();
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Card card34 = Card.duchy;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.silver;
    Card card39 = Card.gold;
    Card card40 = Card.baron;
    int i41 = card40.getCost();
    Card card42 = Card.ambassador;
    Card card43 = null;
    Card card44 = Card.feast;
    Card card45 = null;
    java.util.List<Card> list_card46 = gameBoard33.kingdomCards(card34, card35, card36, card38, card39, card40, card42, card43, card44, card45);
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Player player52 = new Player("", (-1), gameBoard51);
    player30.buyCard(card34, gameBoard51);
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    player30.Discard(card54);
    int i57 = gameBoard2.numCardsAvailable(card54);
    java.util.List<Card> list_card59 = gameBoard2.kingdomCards((int)(byte)10);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Card card63 = Card.duchy;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.silver;
    Card card68 = Card.gold;
    Card card69 = Card.baron;
    int i70 = card69.getCost();
    Card card71 = Card.ambassador;
    Card card72 = null;
    Card card73 = Card.feast;
    Card card74 = null;
    java.util.List<Card> list_card75 = gameBoard62.kingdomCards(card63, card64, card65, card67, card68, card69, card71, card72, card73, card74);
    int i76 = gameBoard2.numEmbargoTokens(card64);
    java.util.List<Card> list_card79 = gameBoard2.getPurchaseableCards((int)(short)0, "");
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.duchy + "'", card34.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.silver + "'", card38.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.gold + "'", card39.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.ambassador + "'", card42.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.feast + "'", card44.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.duchy + "'", card63.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.silver + "'", card67.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.gold + "'", card68.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.baron + "'", card69.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 4);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.ambassador + "'", card71.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.feast + "'", card73.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card79);

  }

  @Test
  public void test053() throws Throwable {

	  org.junit.Assert.assertTrue(true);
  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getBuys();
    boolean b70 = player5.hasActionCard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Card card35 = Card.duchy;
    Card card36 = Card.gold;
    Card card37 = Card.baron;
    int i38 = card37.getCost();
    Card card39 = Card.silver;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.ambassador;
    Card card44 = null;
    Card card45 = Card.feast;
    Card card46 = null;
    java.util.List<Card> list_card47 = gameBoard34.kingdomCards(card35, card36, card37, card39, card40, card41, card43, card44, card45, card46);
    int i48 = player5.getNumberInHand(card44);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.duchy + "'", card35.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.gold + "'", card36.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.baron + "'", card37.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 4);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.silver + "'", card39.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.ambassador + "'", card43.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.feast + "'", card45.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    boolean b32 = player5.hasBuys();
    int i33 = player5.getTotalVictoryPoints();
    boolean b34 = player5.hasBuys();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard31 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Card card38 = Card.duchy;
    Card card39 = Card.gold;
    Card card40 = Card.baron;
    int i41 = card40.getCost();
    Card card42 = Card.silver;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.ambassador;
    Card card47 = null;
    Card card48 = Card.feast;
    Card card49 = null;
    java.util.List<Card> list_card50 = gameBoard37.kingdomCards(card38, card39, card40, card42, card43, card44, card46, card47, card48, card49);
    gameBoard34.trashCard(card43);
    gameBoard31.returnCard(card43);
    int i53 = player5.getNumberInHand(card43);
    player5.countTreasure();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.duchy + "'", card38.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.gold + "'", card39.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.silver + "'", card42.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.ambassador + "'", card46.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.feast + "'", card48.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    Card card39 = player5.drawCard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.copper + "'", card39.equals(Card.copper));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', 0);
    GameBoard gameBoard7 = new GameBoard((int)(byte)1, 10);
    Player player8 = new Player("", (-1), gameBoard7);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.duchy;
    Card card13 = Card.gold;
    Card card14 = Card.baron;
    int i15 = card14.getCost();
    Card card16 = Card.silver;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.ambassador;
    Card card21 = null;
    Card card22 = Card.feast;
    Card card23 = null;
    java.util.List<Card> list_card24 = gameBoard11.kingdomCards(card12, card13, card14, card16, card17, card18, card20, card21, card22, card23);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    player8.buyCard(card12, gameBoard29);
    int i32 = player8.getBuys();
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Player player38 = new Player("", (-1), gameBoard37);
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard((int)(byte)1, 10);
    Player player60 = new Player("", (-1), gameBoard59);
    player38.buyCard(card42, gameBoard59);
    GameBoard gameBoard64 = new GameBoard(10, "hi!");
    player8.buyCard(card42, gameBoard64);
    GameBoard gameBoard68 = new GameBoard((int)(byte)1, 10);
    Card card69 = Card.duchy;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.silver;
    Card card74 = Card.gold;
    Card card75 = Card.baron;
    int i76 = card75.getCost();
    Card card77 = Card.ambassador;
    Card card78 = null;
    Card card79 = Card.feast;
    Card card80 = null;
    java.util.List<Card> list_card81 = gameBoard68.kingdomCards(card69, card70, card71, card73, card74, card75, card77, card78, card79, card80);
    GameBoard gameBoard84 = new GameBoard((int)(byte)10, (int)(byte)0);
    player8.gainCardToHand(card71, gameBoard84);
    gameBoard2.trashCard(card71);
    card71.setVictory(12);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.duchy + "'", card12.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.gold + "'", card13.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.baron + "'", card14.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.ambassador + "'", card20.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.feast + "'", card22.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.duchy + "'", card69.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.silver + "'", card73.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.gold + "'", card74.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.baron + "'", card75.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 4);
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.ambassador + "'", card77.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.feast + "'", card79.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    int i39 = player5.getTotalVictoryPoints();
    java.util.List<Card> list_card40 = player5.getHand();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    java.util.List<Card> list_card91 = gameBoard87.getPurchaseableCards(4, "");
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    GameBoard gameBoard32 = new GameBoard(10, "hi!");
    Card card33 = Card.remodel;
    int i34 = gameBoard32.numEmbargoTokens(card33);
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Card card38 = Card.baron;
    boolean b39 = gameBoard37.placeEmbargo(card38);
    player5.gainCardToHand(card33, gameBoard37);
    card33.setVictory((int)(short)-1);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.remodel + "'", card33.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    player5.initPlayerTurn();
    int i39 = player5.getTotalCards();
    int i40 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    java.util.List<Card> list_card24 = gameBoard2.getAllKingdomCards();
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Card card34 = Card.duchy;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.silver;
    Card card39 = Card.gold;
    Card card40 = Card.baron;
    int i41 = card40.getCost();
    Card card42 = Card.ambassador;
    Card card43 = null;
    Card card44 = Card.feast;
    Card card45 = null;
    java.util.List<Card> list_card46 = gameBoard33.kingdomCards(card34, card35, card36, card38, card39, card40, card42, card43, card44, card45);
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Player player52 = new Player("", (-1), gameBoard51);
    player30.buyCard(card34, gameBoard51);
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    player30.Discard(card54);
    int i57 = gameBoard2.numCardsAvailable(card54);
    java.util.List<Card> list_card59 = gameBoard2.kingdomCards((int)(byte)10);
    java.util.List<Card> list_card61 = gameBoard2.kingdomCards((int)'#');
    gameBoard2.opponentDiscardCopper(3);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.duchy + "'", card34.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.silver + "'", card38.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.gold + "'", card39.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.ambassador + "'", card42.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.feast + "'", card44.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i38 = player5.getNumberInHand("hi!");
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard(10, "");
    Player player60 = new Player("hi!", (int)(short)100, gameBoard59);
    player5.gainCard(card47, gameBoard59);
    boolean b62 = gameBoard59.gameDone();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.silver;
    java.util.List<java.lang.String> list_str7 = card6.getTypes();
    Card card8 = Card.adventurer;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    GameBoard gameBoard13 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Card card17 = Card.baron;
    boolean b18 = gameBoard16.placeEmbargo(card17);
    gameBoard13.takeCard(card17);
    GameBoard gameBoard22 = new GameBoard((int)(byte)1, 10);
    Card card23 = Card.duchy;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.silver;
    Card card28 = Card.gold;
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    Card card31 = Card.ambassador;
    Card card32 = null;
    Card card33 = Card.feast;
    Card card34 = null;
    java.util.List<Card> list_card35 = gameBoard22.kingdomCards(card23, card24, card25, card27, card28, card29, card31, card32, card33, card34);
    Card card36 = Card.remodel;
    Card card37 = Card.silver;
    java.util.List<java.lang.String> list_str38 = card37.getTypes();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    Card card55 = Card.gold;
    GameBoard gameBoard58 = new GameBoard((int)(byte)1, 10);
    Card card59 = Card.duchy;
    Card card60 = Card.gold;
    Card card61 = Card.baron;
    int i62 = card61.getCost();
    Card card63 = Card.silver;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.ambassador;
    Card card68 = null;
    Card card69 = Card.feast;
    Card card70 = null;
    java.util.List<Card> list_card71 = gameBoard58.kingdomCards(card59, card60, card61, card63, card64, card65, card67, card68, card69, card70);
    java.util.List<Card> list_card72 = gameBoard4.kingdomCards(card6, card8, card9, card17, card28, card36, card37, card47, card55, card65);
    int i73 = card28.getCost();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.silver + "'", card6.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.adventurer + "'", card8.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.duchy + "'", card23.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.silver + "'", card27.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.gold + "'", card28.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.ambassador + "'", card31.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.feast + "'", card33.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.remodel + "'", card36.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.silver + "'", card37.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.duchy + "'", card59.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.gold + "'", card60.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.baron + "'", card61.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 4);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.silver + "'", card63.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.ambassador + "'", card67.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.feast + "'", card69.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 6);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i38 = player5.getNumberInHand("hi!");
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard(10, "");
    Player player60 = new Player("hi!", (int)(short)100, gameBoard59);
    player5.gainCard(card47, gameBoard59);
    int i63 = player5.getNumberInHand("");
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    java.util.List<java.lang.String> list_str16 = card8.getTypes();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    Card card3 = Card.gardens;
    gameBoard2.takeCard(card3);
    gameBoard2.opponentDraw((int)'#');
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.gardens + "'", card3.equals(Card.gardens));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    java.util.List<Card> list_card38 = player5.getDiscard();
    GameBoard gameBoard41 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard44 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard47 = new GameBoard((int)(byte)1, 10);
    Card card48 = Card.baron;
    boolean b49 = gameBoard47.placeEmbargo(card48);
    gameBoard44.takeCard(card48);
    GameBoard gameBoard53 = new GameBoard((int)(byte)1, 10);
    Card card54 = Card.duchy;
    Card card55 = Card.gold;
    Card card56 = Card.baron;
    int i57 = card56.getCost();
    Card card58 = Card.silver;
    Card card59 = Card.gold;
    Card card60 = Card.baron;
    int i61 = card60.getCost();
    Card card62 = Card.ambassador;
    Card card63 = null;
    Card card64 = Card.feast;
    Card card65 = null;
    java.util.List<Card> list_card66 = gameBoard53.kingdomCards(card54, card55, card56, card58, card59, card60, card62, card63, card64, card65);
    gameBoard44.takeCard(card64);
    boolean b68 = gameBoard41.placeEmbargo(card64);
    boolean b69 = player5.hasCard(card64);
    int i71 = player5.getNumberInHand("");
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.duchy + "'", card54.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.baron + "'", card56.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 4);
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.silver + "'", card58.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.gold + "'", card59.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.baron + "'", card60.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 4);
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.ambassador + "'", card62.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.feast + "'", card64.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, (int)(short)100);
    java.util.List<Card> list_card3 = gameBoard2.getActiveSupplyPiles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    java.util.List<Player> list_player5 = gameBoard2.getPlayers();
    java.util.List<Card> list_card6 = gameBoard2.getActiveSupplyPiles();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    int i7 = player5.getNumberInHand("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.silver;
    java.util.List<java.lang.String> list_str7 = card6.getTypes();
    Card card8 = Card.adventurer;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    GameBoard gameBoard13 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Card card17 = Card.baron;
    boolean b18 = gameBoard16.placeEmbargo(card17);
    gameBoard13.takeCard(card17);
    GameBoard gameBoard22 = new GameBoard((int)(byte)1, 10);
    Card card23 = Card.duchy;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.silver;
    Card card28 = Card.gold;
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    Card card31 = Card.ambassador;
    Card card32 = null;
    Card card33 = Card.feast;
    Card card34 = null;
    java.util.List<Card> list_card35 = gameBoard22.kingdomCards(card23, card24, card25, card27, card28, card29, card31, card32, card33, card34);
    Card card36 = Card.remodel;
    Card card37 = Card.silver;
    java.util.List<java.lang.String> list_str38 = card37.getTypes();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    Card card55 = Card.gold;
    GameBoard gameBoard58 = new GameBoard((int)(byte)1, 10);
    Card card59 = Card.duchy;
    Card card60 = Card.gold;
    Card card61 = Card.baron;
    int i62 = card61.getCost();
    Card card63 = Card.silver;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.ambassador;
    Card card68 = null;
    Card card69 = Card.feast;
    Card card70 = null;
    java.util.List<Card> list_card71 = gameBoard58.kingdomCards(card59, card60, card61, card63, card64, card65, card67, card68, card69, card70);
    java.util.List<Card> list_card72 = gameBoard4.kingdomCards(card6, card8, card9, card17, card28, card36, card37, card47, card55, card65);
    int i73 = card36.getCost();
    card36.setVictory(11);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.silver + "'", card6.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.adventurer + "'", card8.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.duchy + "'", card23.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.silver + "'", card27.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.gold + "'", card28.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.ambassador + "'", card31.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.feast + "'", card33.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.remodel + "'", card36.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.silver + "'", card37.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.duchy + "'", card59.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.gold + "'", card60.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.baron + "'", card61.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 4);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.silver + "'", card63.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.ambassador + "'", card67.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.feast + "'", card69.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 4);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    java.util.List<Card> list_card39 = player5.getDiscard();
    java.util.List<java.lang.Integer> list_i40 = player5.getActionCardIndices();
    player5.countTreasure();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i40);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.countTreasure();
    boolean b69 = player5.hasActionCard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    GameBoard gameBoard6 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard9 = new GameBoard((int)(byte)1, 10);
    Card card10 = Card.baron;
    boolean b11 = gameBoard9.placeEmbargo(card10);
    gameBoard6.takeCard(card10);
    boolean b13 = gameBoard2.hasCardsAvailable(card10);
    boolean b14 = gameBoard2.gameDone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    gameBoard26.opponentDraw(0);
    gameBoard26.opponentDiscardCopper(0);
    java.util.List<Card> list_card33 = gameBoard26.getTrash();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    GameBoard gameBoard6 = new GameBoard(10, "");
    Player player7 = new Player("hi!", (int)(short)100, gameBoard6);
    Player player8 = new Player("", (int)(short)100, gameBoard6);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Player player14 = new Player("", (-1), gameBoard13);
    GameBoard gameBoard17 = new GameBoard((int)(byte)1, 10);
    Card card18 = Card.duchy;
    Card card19 = Card.gold;
    Card card20 = Card.baron;
    int i21 = card20.getCost();
    Card card22 = Card.silver;
    Card card23 = Card.gold;
    Card card24 = Card.baron;
    int i25 = card24.getCost();
    Card card26 = Card.ambassador;
    Card card27 = null;
    Card card28 = Card.feast;
    Card card29 = null;
    java.util.List<Card> list_card30 = gameBoard17.kingdomCards(card18, card19, card20, card22, card23, card24, card26, card27, card28, card29);
    GameBoard gameBoard35 = new GameBoard((int)(byte)1, 10);
    Player player36 = new Player("", (-1), gameBoard35);
    player14.buyCard(card18, gameBoard35);
    Card card38 = Card.baron;
    int i39 = card38.getCost();
    player14.Discard(card38);
    boolean b41 = player14.hasBuys();
    Card card42 = player14.drawCard();
    int i43 = card42.getVictory();
    gameBoard6.takeCard(card42);
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.duchy + "'", card18.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.gold + "'", card19.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.baron + "'", card20.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.silver + "'", card22.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.gold + "'", card23.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.baron + "'", card24.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.ambassador + "'", card26.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.feast + "'", card28.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.copper + "'", card42.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    int i39 = player5.getTotalVictoryPoints();
    Card card40 = Card.baron;
    GameBoard gameBoard43 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard46 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard49 = new GameBoard((int)(byte)1, 10);
    Card card50 = Card.duchy;
    Card card51 = Card.gold;
    Card card52 = Card.baron;
    int i53 = card52.getCost();
    Card card54 = Card.silver;
    Card card55 = Card.gold;
    Card card56 = Card.baron;
    int i57 = card56.getCost();
    Card card58 = Card.ambassador;
    Card card59 = null;
    Card card60 = Card.feast;
    Card card61 = null;
    java.util.List<Card> list_card62 = gameBoard49.kingdomCards(card50, card51, card52, card54, card55, card56, card58, card59, card60, card61);
    gameBoard46.trashCard(card55);
    gameBoard43.returnCard(card55);
    player5.gainCardToHand(card40, gameBoard43);
    player5.countTreasure();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.duchy + "'", card50.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.gold + "'", card51.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.baron + "'", card52.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 4);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.silver + "'", card54.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.baron + "'", card56.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 4);
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.ambassador + "'", card58.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.feast + "'", card60.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    java.util.LinkedList<Card> linkedlist_card89 = player5.getDeck();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card89);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    Card card63 = Card.duchy;
    GameBoard gameBoard70 = new GameBoard((int)(byte)1, 10);
    Player player71 = new Player("", (-1), gameBoard70);
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Card card75 = Card.duchy;
    Card card76 = Card.gold;
    Card card77 = Card.baron;
    int i78 = card77.getCost();
    Card card79 = Card.silver;
    Card card80 = Card.gold;
    Card card81 = Card.baron;
    int i82 = card81.getCost();
    Card card83 = Card.ambassador;
    Card card84 = null;
    Card card85 = Card.feast;
    Card card86 = null;
    java.util.List<Card> list_card87 = gameBoard74.kingdomCards(card75, card76, card77, card79, card80, card81, card83, card84, card85, card86);
    GameBoard gameBoard92 = new GameBoard((int)(byte)1, 10);
    Player player93 = new Player("", (-1), gameBoard92);
    player71.buyCard(card75, gameBoard92);
    gameBoard92.opponentDraw(0);
    Player player97 = new Player("hi!", (int)' ', gameBoard92);
    player5.buyCard(card63, gameBoard92);
    gameBoard92.displayFinalScores();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.duchy + "'", card63.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.duchy + "'", card75.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.gold + "'", card76.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.baron + "'", card77.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 4);
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.silver + "'", card79.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.gold + "'", card80.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.baron + "'", card81.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 4);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.ambassador + "'", card83.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.feast + "'", card85.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    java.util.List<Card> list_card24 = gameBoard2.getAllKingdomCards();
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Card card34 = Card.duchy;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.silver;
    Card card39 = Card.gold;
    Card card40 = Card.baron;
    int i41 = card40.getCost();
    Card card42 = Card.ambassador;
    Card card43 = null;
    Card card44 = Card.feast;
    Card card45 = null;
    java.util.List<Card> list_card46 = gameBoard33.kingdomCards(card34, card35, card36, card38, card39, card40, card42, card43, card44, card45);
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Player player52 = new Player("", (-1), gameBoard51);
    player30.buyCard(card34, gameBoard51);
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    player30.Discard(card54);
    int i57 = gameBoard2.numCardsAvailable(card54);
    java.util.List<Card> list_card59 = gameBoard2.kingdomCards((int)(byte)10);
    java.util.List<Card> list_card61 = gameBoard2.kingdomCards((int)'#');
    gameBoard2.displayFinalScores();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.duchy + "'", card34.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.silver + "'", card38.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.gold + "'", card39.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.ambassador + "'", card42.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.feast + "'", card44.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    GameBoard gameBoard65 = new GameBoard((int)(byte)1, 10);
    Card card66 = Card.duchy;
    Card card67 = Card.gold;
    Card card68 = Card.baron;
    int i69 = card68.getCost();
    Card card70 = Card.silver;
    Card card71 = Card.gold;
    Card card72 = Card.baron;
    int i73 = card72.getCost();
    Card card74 = Card.ambassador;
    Card card75 = null;
    Card card76 = Card.feast;
    Card card77 = null;
    java.util.List<Card> list_card78 = gameBoard65.kingdomCards(card66, card67, card68, card70, card71, card72, card74, card75, card76, card77);
    GameBoard gameBoard81 = new GameBoard((int)(byte)10, (int)(byte)0);
    player5.gainCardToHand(card68, gameBoard81);
    java.util.List<Card> list_card83 = player5.getPlayedCards();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.duchy + "'", card66.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.gold + "'", card67.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.baron + "'", card68.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 4);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.silver + "'", card70.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.baron + "'", card72.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 4);
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.ambassador + "'", card74.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.feast + "'", card76.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    Card card4 = Card.feast;
    boolean b5 = gameBoard2.hasCardsAvailable(card4);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Player player11 = new Player("", (-1), gameBoard10);
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Card card15 = Card.duchy;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.silver;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.ambassador;
    Card card24 = null;
    Card card25 = Card.feast;
    Card card26 = null;
    java.util.List<Card> list_card27 = gameBoard14.kingdomCards(card15, card16, card17, card19, card20, card21, card23, card24, card25, card26);
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Player player33 = new Player("", (-1), gameBoard32);
    player11.buyCard(card15, gameBoard32);
    int i35 = player11.getBuys();
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    GameBoard gameBoard67 = new GameBoard(10, "hi!");
    player11.buyCard(card45, gameBoard67);
    int i69 = gameBoard2.numCardsAvailable(card45);
    java.util.List<Card> list_card71 = gameBoard2.getPurchaseableCards((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.feast + "'", card4.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.duchy + "'", card15.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.silver + "'", card19.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.ambassador + "'", card23.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.feast + "'", card25.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    GameBoard gameBoard9 = new GameBoard((int)(byte)1, 10);
    Player player10 = new Player("", (-1), gameBoard9);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Card card14 = Card.duchy;
    Card card15 = Card.gold;
    Card card16 = Card.baron;
    int i17 = card16.getCost();
    Card card18 = Card.silver;
    Card card19 = Card.gold;
    Card card20 = Card.baron;
    int i21 = card20.getCost();
    Card card22 = Card.ambassador;
    Card card23 = null;
    Card card24 = Card.feast;
    Card card25 = null;
    java.util.List<Card> list_card26 = gameBoard13.kingdomCards(card14, card15, card16, card18, card19, card20, card22, card23, card24, card25);
    GameBoard gameBoard31 = new GameBoard((int)(byte)1, 10);
    Player player32 = new Player("", (-1), gameBoard31);
    player10.buyCard(card14, gameBoard31);
    gameBoard2.returnCard(card14);
    boolean b35 = gameBoard2.gameDone();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.duchy + "'", card14.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.gold + "'", card15.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.baron + "'", card16.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4);
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.silver + "'", card18.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.gold + "'", card19.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.baron + "'", card20.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.ambassador + "'", card22.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.feast + "'", card24.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Player player7 = new Player("", (-1), gameBoard6);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.duchy;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.silver;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.ambassador;
    Card card20 = null;
    Card card21 = Card.feast;
    Card card22 = null;
    java.util.List<Card> list_card23 = gameBoard10.kingdomCards(card11, card12, card13, card15, card16, card17, card19, card20, card21, card22);
    GameBoard gameBoard28 = new GameBoard((int)(byte)1, 10);
    Player player29 = new Player("", (-1), gameBoard28);
    player7.buyCard(card11, gameBoard28);
    gameBoard28.opponentDraw(0);
    Player player33 = new Player("hi!", (int)' ', gameBoard28);
    java.util.List<Player> list_player34 = gameBoard28.getPlayers();
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.duchy + "'", card11.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.ambassador + "'", card19.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.feast + "'", card21.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player34);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    player5.Discard(card42);
    player5.countTreasure();
    java.util.List<Card> list_card57 = player5.getPlayedCards();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.baron;
    boolean b13 = gameBoard11.placeEmbargo(card12);
    card12.setVictory((int)(short)0);
    boolean b16 = gameBoard2.placeEmbargo(card12);
    java.util.List<Card> list_card17 = gameBoard2.getTrash();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    int i39 = player5.getNumActions();
    GameBoard gameBoard42 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Card card46 = Card.baron;
    boolean b47 = gameBoard45.placeEmbargo(card46);
    gameBoard42.takeCard(card46);
    player5.Discard(card46);
    Card card50 = Card.ambassador;
    int i51 = player5.getNumberInHand(card50);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.baron + "'", card46.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = card9.getVictory();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 3);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Player player15 = new Player("", (-1), gameBoard14);
    GameBoard gameBoard18 = new GameBoard((int)(byte)1, 10);
    Card card19 = Card.duchy;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.silver;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.ambassador;
    Card card28 = null;
    Card card29 = Card.feast;
    Card card30 = null;
    java.util.List<Card> list_card31 = gameBoard18.kingdomCards(card19, card20, card21, card23, card24, card25, card27, card28, card29, card30);
    GameBoard gameBoard36 = new GameBoard((int)(byte)1, 10);
    Player player37 = new Player("", (-1), gameBoard36);
    player15.buyCard(card19, gameBoard36);
    Card card39 = Card.baron;
    int i40 = card39.getCost();
    player15.Discard(card39);
    int i42 = player5.getNumberInHand(card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.duchy + "'", card19.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.silver + "'", card23.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.ambassador + "'", card27.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.feast + "'", card29.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.baron + "'", card39.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i67 = player5.getBuys();
    GameBoard gameBoard70 = new GameBoard((int)'#', "hi!");
    boolean b71 = gameBoard70.gameDone();
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Card card75 = Card.duchy;
    Card card76 = Card.gold;
    Card card77 = Card.baron;
    int i78 = card77.getCost();
    Card card79 = Card.silver;
    Card card80 = Card.gold;
    Card card81 = Card.baron;
    int i82 = card81.getCost();
    Card card83 = Card.ambassador;
    Card card84 = null;
    Card card85 = Card.feast;
    Card card86 = null;
    java.util.List<Card> list_card87 = gameBoard74.kingdomCards(card75, card76, card77, card79, card80, card81, card83, card84, card85, card86);
    boolean b88 = gameBoard70.hasCardsAvailable(card77);
    GameBoard gameBoard93 = new GameBoard((int)'#', "hi!");
    boolean b94 = gameBoard93.gameDone();
    Card card95 = Card.feast;
    boolean b96 = gameBoard93.hasCardsAvailable(card95);
    Player player97 = new Player("", 4, gameBoard93);
    player5.buyCard(card77, gameBoard93);
    java.util.List<java.lang.Integer> list_i99 = player5.getActionCardIndices();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.duchy + "'", card75.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.gold + "'", card76.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.baron + "'", card77.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 4);
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.silver + "'", card79.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.gold + "'", card80.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.baron + "'", card81.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 4);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.ambassador + "'", card83.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.feast + "'", card85.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    org.junit.Assert.assertTrue("'" + card95 + "' != '" + Card.feast + "'", card95.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i99);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Player player17 = new Player("", (-1), gameBoard16);
    GameBoard gameBoard20 = new GameBoard((int)(byte)1, 10);
    Card card21 = Card.duchy;
    Card card22 = Card.gold;
    Card card23 = Card.baron;
    int i24 = card23.getCost();
    Card card25 = Card.silver;
    Card card26 = Card.gold;
    Card card27 = Card.baron;
    int i28 = card27.getCost();
    Card card29 = Card.ambassador;
    Card card30 = null;
    Card card31 = Card.feast;
    Card card32 = null;
    java.util.List<Card> list_card33 = gameBoard20.kingdomCards(card21, card22, card23, card25, card26, card27, card29, card30, card31, card32);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Player player39 = new Player("", (-1), gameBoard38);
    player17.buyCard(card21, gameBoard38);
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Player player46 = new Player("", (-1), gameBoard45);
    Card card47 = Card.baron;
    GameBoard gameBoard52 = new GameBoard((int)(byte)1, 10);
    Player player53 = new Player("", (-1), gameBoard52);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Card card57 = Card.duchy;
    Card card58 = Card.gold;
    Card card59 = Card.baron;
    int i60 = card59.getCost();
    Card card61 = Card.silver;
    Card card62 = Card.gold;
    Card card63 = Card.baron;
    int i64 = card63.getCost();
    Card card65 = Card.ambassador;
    Card card66 = null;
    Card card67 = Card.feast;
    Card card68 = null;
    java.util.List<Card> list_card69 = gameBoard56.kingdomCards(card57, card58, card59, card61, card62, card63, card65, card66, card67, card68);
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Player player75 = new Player("", (-1), gameBoard74);
    player53.buyCard(card57, gameBoard74);
    player46.gainCard(card47, gameBoard74);
    player17.Discard(card47);
    int i80 = player17.getNumberInHand("");
    boolean b81 = player17.hasBuys();
    int i82 = player17.getCoins();
    Card card83 = Card.gold;
    GameBoard gameBoard86 = new GameBoard((int)(short)1, "");
    player17.gainCardToHand(card83, gameBoard86);
    GameBoard gameBoard90 = new GameBoard((int)(byte)1, 10);
    player5.gainCard(card83, gameBoard90);
    int i92 = player5.getNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.duchy + "'", card21.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.gold + "'", card22.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.baron + "'", card23.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4);
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.silver + "'", card25.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.gold + "'", card26.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.baron + "'", card27.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 4);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.ambassador + "'", card29.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.feast + "'", card31.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.duchy + "'", card57.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.gold + "'", card58.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.baron + "'", card59.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 4);
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.silver + "'", card61.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.gold + "'", card62.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.baron + "'", card63.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 4);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.ambassador + "'", card65.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.feast + "'", card67.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.gold + "'", card83.equals(Card.gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == (-1));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.baron;
    boolean b13 = gameBoard11.placeEmbargo(card12);
    card12.setVictory((int)(short)0);
    boolean b16 = gameBoard2.placeEmbargo(card12);
    GameBoard gameBoard19 = new GameBoard((int)'#', "hi!");
    Card card20 = Card.gardens;
    gameBoard19.takeCard(card20);
    GameBoard gameBoard24 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard27 = new GameBoard((int)(byte)1, 10);
    Card card28 = Card.duchy;
    Card card29 = Card.gold;
    Card card30 = Card.baron;
    int i31 = card30.getCost();
    Card card32 = Card.silver;
    Card card33 = Card.gold;
    Card card34 = Card.baron;
    int i35 = card34.getCost();
    Card card36 = Card.ambassador;
    Card card37 = null;
    Card card38 = Card.feast;
    Card card39 = null;
    java.util.List<Card> list_card40 = gameBoard27.kingdomCards(card28, card29, card30, card32, card33, card34, card36, card37, card38, card39);
    gameBoard24.trashCard(card33);
    int i42 = gameBoard19.numEmbargoTokens(card33);
    int i43 = gameBoard2.numCardsAvailable(card33);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gardens + "'", card20.equals(Card.gardens));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.duchy + "'", card28.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.gold + "'", card29.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.baron + "'", card30.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 4);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.silver + "'", card32.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.gold + "'", card33.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.baron + "'", card34.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.ambassador + "'", card36.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.feast + "'", card38.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 30);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    java.util.List<Card> list_card24 = gameBoard2.getAllKingdomCards();
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Card card34 = Card.duchy;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.silver;
    Card card39 = Card.gold;
    Card card40 = Card.baron;
    int i41 = card40.getCost();
    Card card42 = Card.ambassador;
    Card card43 = null;
    Card card44 = Card.feast;
    Card card45 = null;
    java.util.List<Card> list_card46 = gameBoard33.kingdomCards(card34, card35, card36, card38, card39, card40, card42, card43, card44, card45);
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Player player52 = new Player("", (-1), gameBoard51);
    player30.buyCard(card34, gameBoard51);
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    player30.Discard(card54);
    int i57 = gameBoard2.numCardsAvailable(card54);
    java.util.List<Card> list_card59 = gameBoard2.kingdomCards((int)(byte)10);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Card card63 = Card.duchy;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.silver;
    Card card68 = Card.gold;
    Card card69 = Card.baron;
    int i70 = card69.getCost();
    Card card71 = Card.ambassador;
    Card card72 = null;
    Card card73 = Card.feast;
    Card card74 = null;
    java.util.List<Card> list_card75 = gameBoard62.kingdomCards(card63, card64, card65, card67, card68, card69, card71, card72, card73, card74);
    int i76 = gameBoard2.numEmbargoTokens(card64);
    GameBoard gameBoard80 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card81 = Card.copper;
    gameBoard80.returnCard(card81);
    gameBoard2.opponentGainCard(3, card81);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.duchy + "'", card34.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.silver + "'", card38.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.gold + "'", card39.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.ambassador + "'", card42.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.feast + "'", card44.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.duchy + "'", card63.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.silver + "'", card67.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.gold + "'", card68.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.baron + "'", card69.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 4);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.ambassador + "'", card71.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.feast + "'", card73.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.copper + "'", card81.equals(Card.copper));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    GameBoard gameBoard9 = new GameBoard((int)(byte)1, 10);
    Player player10 = new Player("", (-1), gameBoard9);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Card card14 = Card.duchy;
    Card card15 = Card.gold;
    Card card16 = Card.baron;
    int i17 = card16.getCost();
    Card card18 = Card.silver;
    Card card19 = Card.gold;
    Card card20 = Card.baron;
    int i21 = card20.getCost();
    Card card22 = Card.ambassador;
    Card card23 = null;
    Card card24 = Card.feast;
    Card card25 = null;
    java.util.List<Card> list_card26 = gameBoard13.kingdomCards(card14, card15, card16, card18, card19, card20, card22, card23, card24, card25);
    GameBoard gameBoard31 = new GameBoard((int)(byte)1, 10);
    Player player32 = new Player("", (-1), gameBoard31);
    player10.buyCard(card14, gameBoard31);
    gameBoard2.returnCard(card14);
    card14.setVictory(6);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.duchy + "'", card14.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.gold + "'", card15.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.baron + "'", card16.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4);
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.silver + "'", card18.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.gold + "'", card19.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.baron + "'", card20.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.ambassador + "'", card22.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.feast + "'", card24.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    player5.Discard(card42);
    int i56 = card42.getVictory();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 6);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    Card card10 = Card.baron;
    int i11 = player5.getNumberInHand(card10);
    int i12 = player5.getTotalVictoryPoints();
    java.util.List<Card> list_card13 = player5.getPlayedCards();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    Card card37 = player5.drawCard();
    boolean b38 = player5.hasActions();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.copper + "'", card37.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    boolean b12 = player5.hasActionCard();
    java.util.List<Card> list_card13 = player5.getPlayedCards();
    player5.addActions(4);
    Card card16 = Card.silver;
    GameBoard gameBoard19 = new GameBoard((int)(short)10, (int)(short)1);
    player5.gainCardToHand(card16, gameBoard19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    java.util.List<Card> list_card3 = gameBoard2.getTrash();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    int i20 = card11.getCost();
    boolean b21 = gameBoard2.hasCardsAvailable(card11);
    boolean b22 = gameBoard2.gameDone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    java.util.List<Card> list_card64 = gameBoard61.kingdomCards((int)'a');
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card64);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    boolean b12 = player5.hasActionCard();
    boolean b13 = player5.hasBuys();
    int i14 = player5.getTotalVictoryPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card7 = player5.getDeck();
    player5.addActions((int)(short)1);
    GameBoard gameBoard12 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard18 = new GameBoard((int)(byte)1, 10);
    Card card19 = Card.duchy;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.silver;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.ambassador;
    Card card28 = null;
    Card card29 = Card.feast;
    Card card30 = null;
    java.util.List<Card> list_card31 = gameBoard18.kingdomCards(card19, card20, card21, card23, card24, card25, card27, card28, card29, card30);
    gameBoard15.trashCard(card24);
    gameBoard12.returnCard(card24);
    java.util.List<Card> list_card34 = gameBoard12.getAllKingdomCards();
    GameBoard gameBoard39 = new GameBoard((int)(byte)1, 10);
    Player player40 = new Player("", (-1), gameBoard39);
    GameBoard gameBoard43 = new GameBoard((int)(byte)1, 10);
    Card card44 = Card.duchy;
    Card card45 = Card.gold;
    Card card46 = Card.baron;
    int i47 = card46.getCost();
    Card card48 = Card.silver;
    Card card49 = Card.gold;
    Card card50 = Card.baron;
    int i51 = card50.getCost();
    Card card52 = Card.ambassador;
    Card card53 = null;
    Card card54 = Card.feast;
    Card card55 = null;
    java.util.List<Card> list_card56 = gameBoard43.kingdomCards(card44, card45, card46, card48, card49, card50, card52, card53, card54, card55);
    GameBoard gameBoard61 = new GameBoard((int)(byte)1, 10);
    Player player62 = new Player("", (-1), gameBoard61);
    player40.buyCard(card44, gameBoard61);
    Card card64 = Card.baron;
    int i65 = card64.getCost();
    player40.Discard(card64);
    int i67 = gameBoard12.numCardsAvailable(card64);
    boolean b68 = player5.hasCard(card64);
    int i69 = player5.getTotalCards();
    player5.discardHandAndInPlay();
    player5.countTreasure();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card7);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.duchy + "'", card19.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.silver + "'", card23.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.ambassador + "'", card27.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.feast + "'", card29.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.duchy + "'", card44.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.gold + "'", card45.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.baron + "'", card46.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 4);
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.silver + "'", card48.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.gold + "'", card49.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.baron + "'", card50.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 4);
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.ambassador + "'", card52.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.feast + "'", card54.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.baron + "'", card64.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 10);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    int i16 = card3.getCost();
    card3.setVictory((int)(byte)0);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    java.util.List<Card> list_card32 = player5.getDiscard();
    java.util.List<Card> list_card33 = player5.getPlayedCards();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)-1, (int)(short)-1);
    Card card3 = Card.gold;
    int i4 = gameBoard2.numCardsAvailable(card3);
    gameBoard2.opponentDraw(3);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.gold + "'", card3.equals(Card.gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 30);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    GameBoard gameBoard2 = new GameBoard((-1), "hi!");

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    player5.addActions((int)'a');
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    GameBoard gameBoard4 = new GameBoard((int)'#', "hi!");
    boolean b5 = gameBoard4.gameDone();
    Card card6 = Card.feast;
    boolean b7 = gameBoard4.hasCardsAvailable(card6);
    Player player8 = new Player("", 4, gameBoard4);
    player8.initPlayerTurn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.feast + "'", card6.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    java.lang.String str89 = player5.getName();
    int i90 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + ""+ "'", str89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == (-1));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasActions();
    boolean b68 = player5.hasBuys();
    player5.countTreasure();
    player5.discardHandAndInPlay();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i67 = player5.getBuys();
    GameBoard gameBoard70 = new GameBoard((int)'#', "hi!");
    boolean b71 = gameBoard70.gameDone();
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Card card75 = Card.duchy;
    Card card76 = Card.gold;
    Card card77 = Card.baron;
    int i78 = card77.getCost();
    Card card79 = Card.silver;
    Card card80 = Card.gold;
    Card card81 = Card.baron;
    int i82 = card81.getCost();
    Card card83 = Card.ambassador;
    Card card84 = null;
    Card card85 = Card.feast;
    Card card86 = null;
    java.util.List<Card> list_card87 = gameBoard74.kingdomCards(card75, card76, card77, card79, card80, card81, card83, card84, card85, card86);
    boolean b88 = gameBoard70.hasCardsAvailable(card77);
    GameBoard gameBoard93 = new GameBoard((int)'#', "hi!");
    boolean b94 = gameBoard93.gameDone();
    Card card95 = Card.feast;
    boolean b96 = gameBoard93.hasCardsAvailable(card95);
    Player player97 = new Player("", 4, gameBoard93);
    player5.buyCard(card77, gameBoard93);
    player5.countTreasure();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.duchy + "'", card75.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.gold + "'", card76.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.baron + "'", card77.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 4);
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.silver + "'", card79.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.gold + "'", card80.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.baron + "'", card81.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 4);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.ambassador + "'", card83.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.feast + "'", card85.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    org.junit.Assert.assertTrue("'" + card95 + "' != '" + Card.feast + "'", card95.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    boolean b19 = gameBoard2.placeEmbargo(card6);
    gameBoard2.displayFinalScores();
    gameBoard2.displayFinalScores();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card7 = player5.getDeck();
    player5.addActions((int)(short)1);
    java.util.LinkedList<Card> linkedlist_card10 = player5.getDeck();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card10);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    boolean b19 = gameBoard2.placeEmbargo(card6);
    card6.setVictory((int)(short)100);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getCoins();
    player5.initPlayerTurn();
    int i40 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<Card> list_card6 = gameBoard4.getActiveSupplyPiles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    GameBoard gameBoard67 = new GameBoard((int)(byte)1, 10);
    Player player68 = new Player("", (-1), gameBoard67);
    java.util.List<java.lang.Integer> list_i69 = player68.getActionCardIndices();
    Card card70 = Card.baron;
    int i71 = card70.getCost();
    boolean b72 = player68.hasCard(card70);
    GameBoard gameBoard75 = new GameBoard((int)(short)1, "");
    Card card76 = player68.getRandomBuyCard(gameBoard75);
    boolean b77 = gameBoard61.placeEmbargo(card76);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i69);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.baron + "'", card70.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.copper + "'", card76.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.baron;
    boolean b13 = gameBoard11.placeEmbargo(card12);
    card12.setVictory((int)(short)0);
    boolean b16 = gameBoard2.placeEmbargo(card12);
    java.util.List<Card> list_card18 = gameBoard2.kingdomCards((int)(short)0);
    GameBoard gameBoard21 = new GameBoard((int)(byte)1, 10);
    Card card22 = Card.baron;
    boolean b23 = gameBoard21.placeEmbargo(card22);
    gameBoard2.takeCard(card22);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    Card card4 = Card.feast;
    boolean b5 = gameBoard2.hasCardsAvailable(card4);
    int i6 = card4.getTreasure();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.feast + "'", card4.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    gameBoard2.displayFinalScores();
    java.util.List<Card> list_card17 = gameBoard2.getActiveSupplyPiles();
    int i18 = gameBoard2.play();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = card9.getTreasure();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)-1, (int)(short)-1);
    java.util.List<Player> list_player3 = gameBoard2.getPlayers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player3);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    java.util.List<Card> list_card6 = gameBoard4.getTrash();
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    Card card13 = Card.silver;
    java.util.List<java.lang.String> list_str14 = card13.getTypes();
    Card card15 = Card.adventurer;
    Card card16 = Card.baron;
    int i17 = card16.getCost();
    GameBoard gameBoard20 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard23 = new GameBoard((int)(byte)1, 10);
    Card card24 = Card.baron;
    boolean b25 = gameBoard23.placeEmbargo(card24);
    gameBoard20.takeCard(card24);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Card card30 = Card.duchy;
    Card card31 = Card.gold;
    Card card32 = Card.baron;
    int i33 = card32.getCost();
    Card card34 = Card.silver;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.ambassador;
    Card card39 = null;
    Card card40 = Card.feast;
    Card card41 = null;
    java.util.List<Card> list_card42 = gameBoard29.kingdomCards(card30, card31, card32, card34, card35, card36, card38, card39, card40, card41);
    Card card43 = Card.remodel;
    Card card44 = Card.silver;
    java.util.List<java.lang.String> list_str45 = card44.getTypes();
    GameBoard gameBoard48 = new GameBoard((int)(byte)1, 10);
    Card card49 = Card.duchy;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.silver;
    Card card54 = Card.gold;
    Card card55 = Card.baron;
    int i56 = card55.getCost();
    Card card57 = Card.ambassador;
    Card card58 = null;
    Card card59 = Card.feast;
    Card card60 = null;
    java.util.List<Card> list_card61 = gameBoard48.kingdomCards(card49, card50, card51, card53, card54, card55, card57, card58, card59, card60);
    Card card62 = Card.gold;
    GameBoard gameBoard65 = new GameBoard((int)(byte)1, 10);
    Card card66 = Card.duchy;
    Card card67 = Card.gold;
    Card card68 = Card.baron;
    int i69 = card68.getCost();
    Card card70 = Card.silver;
    Card card71 = Card.gold;
    Card card72 = Card.baron;
    int i73 = card72.getCost();
    Card card74 = Card.ambassador;
    Card card75 = null;
    Card card76 = Card.feast;
    Card card77 = null;
    java.util.List<Card> list_card78 = gameBoard65.kingdomCards(card66, card67, card68, card70, card71, card72, card74, card75, card76, card77);
    java.util.List<Card> list_card79 = gameBoard11.kingdomCards(card13, card15, card16, card24, card35, card43, card44, card54, card62, card72);
    int i80 = gameBoard4.numCardsAvailable(card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.adventurer + "'", card15.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.baron + "'", card16.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.baron + "'", card24.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.duchy + "'", card30.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.gold + "'", card31.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.baron + "'", card32.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.silver + "'", card34.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.ambassador + "'", card38.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.feast + "'", card40.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.remodel + "'", card43.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.silver + "'", card44.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str45);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.duchy + "'", card49.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.silver + "'", card53.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.gold + "'", card54.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.baron + "'", card55.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 4);
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.ambassador + "'", card57.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.feast + "'", card59.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.gold + "'", card62.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.duchy + "'", card66.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.gold + "'", card67.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.baron + "'", card68.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 4);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.silver + "'", card70.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.baron + "'", card72.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 4);
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.ambassador + "'", card74.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.feast + "'", card76.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    GameBoard gameBoard2 = new GameBoard(30, (int)(short)-1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    int i6 = player5.getCoins();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    GameBoard gameBoard32 = new GameBoard(10, "hi!");
    Card card33 = Card.remodel;
    int i34 = gameBoard32.numEmbargoTokens(card33);
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Card card38 = Card.baron;
    boolean b39 = gameBoard37.placeEmbargo(card38);
    player5.gainCardToHand(card33, gameBoard37);
    java.util.List<Card> list_card41 = gameBoard37.getActiveSupplyPiles();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.remodel + "'", card33.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.baron;
    boolean b4 = gameBoard2.placeEmbargo(card3);
    java.util.List<Card> list_card5 = gameBoard2.getActiveSupplyPiles();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.baron + "'", card3.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    int i16 = card7.getVictory();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    java.util.List<Card> list_card39 = player5.getDiscard();
    int i40 = player5.getTotalCards();
    java.lang.String str41 = player5.getName();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    boolean b20 = gameBoard2.hasCardsAvailable(card9);
    GameBoard gameBoard25 = new GameBoard((int)(byte)1, 10);
    Player player26 = new Player("", (-1), gameBoard25);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Card card30 = Card.duchy;
    Card card31 = Card.gold;
    Card card32 = Card.baron;
    int i33 = card32.getCost();
    Card card34 = Card.silver;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.ambassador;
    Card card39 = null;
    Card card40 = Card.feast;
    Card card41 = null;
    java.util.List<Card> list_card42 = gameBoard29.kingdomCards(card30, card31, card32, card34, card35, card36, card38, card39, card40, card41);
    GameBoard gameBoard47 = new GameBoard((int)(byte)1, 10);
    Player player48 = new Player("", (-1), gameBoard47);
    player26.buyCard(card30, gameBoard47);
    int i50 = player26.getNumActions();
    GameBoard gameBoard53 = new GameBoard(10, "hi!");
    Card card54 = Card.remodel;
    int i55 = gameBoard53.numEmbargoTokens(card54);
    GameBoard gameBoard58 = new GameBoard((int)(byte)1, 10);
    Card card59 = Card.baron;
    boolean b60 = gameBoard58.placeEmbargo(card59);
    player26.gainCardToHand(card54, gameBoard58);
    boolean b62 = gameBoard2.placeEmbargo(card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.duchy + "'", card30.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.gold + "'", card31.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.baron + "'", card32.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.silver + "'", card34.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.ambassador + "'", card38.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.feast + "'", card40.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.remodel + "'", card54.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.baron + "'", card59.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    GameBoard gameBoard6 = new GameBoard((int)'#', "hi!");
    boolean b7 = gameBoard6.gameDone();
    Card card8 = Card.feast;
    boolean b9 = gameBoard6.hasCardsAvailable(card8);
    Player player10 = new Player("", 4, gameBoard6);
    Player player11 = new Player("hi!", (int)(short)100, gameBoard6);
    java.util.List<java.lang.Integer> list_i12 = player11.getActionCardIndices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.feast + "'", card8.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i12);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    player5.initPlayerTurn();
    int i39 = player5.getTotalCards();
    boolean b40 = player5.hasActions();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    Card card0 = Card.ambassador;
    int i1 = card0.getTreasure();
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.ambassador + "'", card0.equals(Card.ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    boolean b19 = gameBoard2.placeEmbargo(card6);
    gameBoard2.displayFinalScores();
    Card card21 = Card.council_room;
    int i22 = gameBoard2.numEmbargoTokens(card21);
    int i23 = card21.getVictory();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.council_room + "'", card21.equals(Card.council_room));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    GameBoard gameBoard32 = new GameBoard(10, "hi!");
    Card card33 = Card.remodel;
    int i34 = gameBoard32.numEmbargoTokens(card33);
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Card card38 = Card.baron;
    boolean b39 = gameBoard37.placeEmbargo(card38);
    player5.gainCardToHand(card33, gameBoard37);
    GameBoard gameBoard43 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard46 = new GameBoard((int)(byte)1, 10);
    Card card47 = Card.baron;
    boolean b48 = gameBoard46.placeEmbargo(card47);
    gameBoard43.takeCard(card47);
    GameBoard gameBoard52 = new GameBoard((int)(byte)1, 10);
    Card card53 = Card.duchy;
    Card card54 = Card.gold;
    Card card55 = Card.baron;
    int i56 = card55.getCost();
    Card card57 = Card.silver;
    Card card58 = Card.gold;
    Card card59 = Card.baron;
    int i60 = card59.getCost();
    Card card61 = Card.ambassador;
    Card card62 = null;
    Card card63 = Card.feast;
    Card card64 = null;
    java.util.List<Card> list_card65 = gameBoard52.kingdomCards(card53, card54, card55, card57, card58, card59, card61, card62, card63, card64);
    gameBoard43.takeCard(card63);
    GameBoard gameBoard69 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard72 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard75 = new GameBoard((int)(byte)1, 10);
    Card card76 = Card.baron;
    boolean b77 = gameBoard75.placeEmbargo(card76);
    gameBoard72.takeCard(card76);
    GameBoard gameBoard81 = new GameBoard((int)(byte)1, 10);
    Card card82 = Card.duchy;
    Card card83 = Card.gold;
    Card card84 = Card.baron;
    int i85 = card84.getCost();
    Card card86 = Card.silver;
    Card card87 = Card.gold;
    Card card88 = Card.baron;
    int i89 = card88.getCost();
    Card card90 = Card.ambassador;
    Card card91 = null;
    Card card92 = Card.feast;
    Card card93 = null;
    java.util.List<Card> list_card94 = gameBoard81.kingdomCards(card82, card83, card84, card86, card87, card88, card90, card91, card92, card93);
    gameBoard72.takeCard(card92);
    boolean b96 = gameBoard69.placeEmbargo(card92);
    gameBoard43.trashCard(card92);
    int i98 = gameBoard37.numEmbargoTokens(card92);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.remodel + "'", card33.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.duchy + "'", card53.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.gold + "'", card54.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.baron + "'", card55.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 4);
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.silver + "'", card57.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.gold + "'", card58.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.baron + "'", card59.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 4);
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.ambassador + "'", card61.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.feast + "'", card63.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.baron + "'", card76.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    org.junit.Assert.assertTrue("'" + card82 + "' != '" + Card.duchy + "'", card82.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.gold + "'", card83.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card84 + "' != '" + Card.baron + "'", card84.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 4);
    org.junit.Assert.assertTrue("'" + card86 + "' != '" + Card.silver + "'", card86.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card87 + "' != '" + Card.gold + "'", card87.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card88 + "' != '" + Card.baron + "'", card88.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 4);
    org.junit.Assert.assertTrue("'" + card90 + "' != '" + Card.ambassador + "'", card90.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card92 + "' != '" + Card.feast + "'", card92.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    GameBoard gameBoard4 = new GameBoard((int)'#', "hi!");
    boolean b5 = gameBoard4.gameDone();
    Card card6 = Card.feast;
    boolean b7 = gameBoard4.hasCardsAvailable(card6);
    Player player8 = new Player("", 4, gameBoard4);
    java.util.List<Card> list_card9 = player8.getPlayedCards();
    boolean b10 = player8.hasActionCard();
    int i11 = player8.getTotalCards();
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Player player17 = new Player("", (-1), gameBoard16);
    GameBoard gameBoard20 = new GameBoard((int)(byte)1, 10);
    Card card21 = Card.duchy;
    Card card22 = Card.gold;
    Card card23 = Card.baron;
    int i24 = card23.getCost();
    Card card25 = Card.silver;
    Card card26 = Card.gold;
    Card card27 = Card.baron;
    int i28 = card27.getCost();
    Card card29 = Card.ambassador;
    Card card30 = null;
    Card card31 = Card.feast;
    Card card32 = null;
    java.util.List<Card> list_card33 = gameBoard20.kingdomCards(card21, card22, card23, card25, card26, card27, card29, card30, card31, card32);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Player player39 = new Player("", (-1), gameBoard38);
    player17.buyCard(card21, gameBoard38);
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Player player46 = new Player("", (-1), gameBoard45);
    Card card47 = Card.baron;
    GameBoard gameBoard52 = new GameBoard((int)(byte)1, 10);
    Player player53 = new Player("", (-1), gameBoard52);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Card card57 = Card.duchy;
    Card card58 = Card.gold;
    Card card59 = Card.baron;
    int i60 = card59.getCost();
    Card card61 = Card.silver;
    Card card62 = Card.gold;
    Card card63 = Card.baron;
    int i64 = card63.getCost();
    Card card65 = Card.ambassador;
    Card card66 = null;
    Card card67 = Card.feast;
    Card card68 = null;
    java.util.List<Card> list_card69 = gameBoard56.kingdomCards(card57, card58, card59, card61, card62, card63, card65, card66, card67, card68);
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Player player75 = new Player("", (-1), gameBoard74);
    player53.buyCard(card57, gameBoard74);
    player46.gainCard(card47, gameBoard74);
    player17.Discard(card47);
    int i80 = player17.getNumberInHand("");
    Card card81 = player17.drawCard();
    player8.Discard(card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.feast + "'", card6.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.duchy + "'", card21.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.gold + "'", card22.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.baron + "'", card23.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4);
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.silver + "'", card25.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.gold + "'", card26.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.baron + "'", card27.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 4);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.ambassador + "'", card29.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.feast + "'", card31.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.duchy + "'", card57.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.gold + "'", card58.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.baron + "'", card59.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 4);
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.silver + "'", card61.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.gold + "'", card62.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.baron + "'", card63.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 4);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.ambassador + "'", card65.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.feast + "'", card67.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.copper + "'", card81.equals(Card.copper));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    player5.discardHandAndInPlay();
    java.util.List<java.lang.Integer> list_i90 = player5.getActionCardIndices();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i90);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    int i10 = player5.getNumActions();
    java.util.List<Card> list_card11 = player5.getDiscard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    boolean b12 = player5.hasActionCard();
    java.util.List<Card> list_card13 = player5.getPlayedCards();
    player5.addActions(4);
    GameBoard gameBoard18 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard21 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard24 = new GameBoard((int)(byte)1, 10);
    Card card25 = Card.duchy;
    Card card26 = Card.gold;
    Card card27 = Card.baron;
    int i28 = card27.getCost();
    Card card29 = Card.silver;
    Card card30 = Card.gold;
    Card card31 = Card.baron;
    int i32 = card31.getCost();
    Card card33 = Card.ambassador;
    Card card34 = null;
    Card card35 = Card.feast;
    Card card36 = null;
    java.util.List<Card> list_card37 = gameBoard24.kingdomCards(card25, card26, card27, card29, card30, card31, card33, card34, card35, card36);
    gameBoard21.trashCard(card30);
    gameBoard18.returnCard(card30);
    GameBoard gameBoard42 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Card card46 = Card.duchy;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.silver;
    Card card51 = Card.gold;
    Card card52 = Card.baron;
    int i53 = card52.getCost();
    Card card54 = Card.ambassador;
    Card card55 = null;
    Card card56 = Card.feast;
    Card card57 = null;
    java.util.List<Card> list_card58 = gameBoard45.kingdomCards(card46, card47, card48, card50, card51, card52, card54, card55, card56, card57);
    gameBoard42.trashCard(card51);
    boolean b60 = gameBoard18.placeEmbargo(card51);
    Card card61 = player5.getRandomBuyCard(gameBoard18);
    java.util.List<Card> list_card63 = gameBoard18.kingdomCards(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.duchy + "'", card25.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.gold + "'", card26.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.baron + "'", card27.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 4);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.silver + "'", card29.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.gold + "'", card30.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.baron + "'", card31.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 4);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.ambassador + "'", card33.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.feast + "'", card35.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.duchy + "'", card46.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.silver + "'", card50.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.gold + "'", card51.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.baron + "'", card52.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 4);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.ambassador + "'", card54.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.feast + "'", card56.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    GameBoard gameBoard2 = new GameBoard(10, "hi!");
    GameBoard gameBoard6 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard9 = new GameBoard((int)(byte)1, 10);
    Card card10 = Card.baron;
    boolean b11 = gameBoard9.placeEmbargo(card10);
    gameBoard6.takeCard(card10);
    gameBoard2.opponentGainCard((int)(short)0, card10);
    int i14 = card10.getTreasure();
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card7 = player5.getDeck();
    player5.addActions((int)(short)1);
    int i10 = player5.getBuys();
    GameBoard gameBoard13 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Card card17 = Card.baron;
    boolean b18 = gameBoard16.placeEmbargo(card17);
    gameBoard13.takeCard(card17);
    player5.Discard(card17);
    java.util.LinkedList<Card> linkedlist_card21 = player5.getDeck();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card21);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    card7.setVictory(1);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Player player14 = new Player("", (-1), gameBoard13);
    Card card15 = Card.silver;
    java.util.List<java.lang.String> list_str16 = card15.getTypes();
    Card card17 = Card.adventurer;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    GameBoard gameBoard22 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard25 = new GameBoard((int)(byte)1, 10);
    Card card26 = Card.baron;
    boolean b27 = gameBoard25.placeEmbargo(card26);
    gameBoard22.takeCard(card26);
    GameBoard gameBoard31 = new GameBoard((int)(byte)1, 10);
    Card card32 = Card.duchy;
    Card card33 = Card.gold;
    Card card34 = Card.baron;
    int i35 = card34.getCost();
    Card card36 = Card.silver;
    Card card37 = Card.gold;
    Card card38 = Card.baron;
    int i39 = card38.getCost();
    Card card40 = Card.ambassador;
    Card card41 = null;
    Card card42 = Card.feast;
    Card card43 = null;
    java.util.List<Card> list_card44 = gameBoard31.kingdomCards(card32, card33, card34, card36, card37, card38, card40, card41, card42, card43);
    Card card45 = Card.remodel;
    Card card46 = Card.silver;
    java.util.List<java.lang.String> list_str47 = card46.getTypes();
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Card card51 = Card.duchy;
    Card card52 = Card.gold;
    Card card53 = Card.baron;
    int i54 = card53.getCost();
    Card card55 = Card.silver;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.ambassador;
    Card card60 = null;
    Card card61 = Card.feast;
    Card card62 = null;
    java.util.List<Card> list_card63 = gameBoard50.kingdomCards(card51, card52, card53, card55, card56, card57, card59, card60, card61, card62);
    Card card64 = Card.gold;
    GameBoard gameBoard67 = new GameBoard((int)(byte)1, 10);
    Card card68 = Card.duchy;
    Card card69 = Card.gold;
    Card card70 = Card.baron;
    int i71 = card70.getCost();
    Card card72 = Card.silver;
    Card card73 = Card.gold;
    Card card74 = Card.baron;
    int i75 = card74.getCost();
    Card card76 = Card.ambassador;
    Card card77 = null;
    Card card78 = Card.feast;
    Card card79 = null;
    java.util.List<Card> list_card80 = gameBoard67.kingdomCards(card68, card69, card70, card72, card73, card74, card76, card77, card78, card79);
    java.util.List<Card> list_card81 = gameBoard13.kingdomCards(card15, card17, card18, card26, card37, card45, card46, card56, card64, card74);
    boolean b82 = gameBoard2.placeEmbargo(card26);
    java.util.List<Card> list_card83 = gameBoard2.getAllKingdomCards();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.adventurer + "'", card17.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.baron + "'", card26.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.duchy + "'", card32.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.gold + "'", card33.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.baron + "'", card34.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.silver + "'", card36.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.gold + "'", card37.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.ambassador + "'", card40.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.feast + "'", card42.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.remodel + "'", card45.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.duchy + "'", card51.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.gold + "'", card52.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.baron + "'", card53.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 4);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.silver + "'", card55.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.ambassador + "'", card59.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.feast + "'", card61.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.duchy + "'", card68.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.gold + "'", card69.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.baron + "'", card70.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 4);
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.silver + "'", card72.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.gold + "'", card73.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.baron + "'", card74.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 4);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.ambassador + "'", card76.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.feast + "'", card78.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i38 = player5.getNumberInHand("hi!");
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard(10, "");
    Player player60 = new Player("hi!", (int)(short)100, gameBoard59);
    player5.gainCard(card47, gameBoard59);
    GameBoard gameBoard66 = new GameBoard((int)(byte)1, 10);
    Player player67 = new Player("", (-1), gameBoard66);
    GameBoard gameBoard70 = new GameBoard((int)(byte)1, 10);
    Card card71 = Card.duchy;
    Card card72 = Card.gold;
    Card card73 = Card.baron;
    int i74 = card73.getCost();
    Card card75 = Card.silver;
    Card card76 = Card.gold;
    Card card77 = Card.baron;
    int i78 = card77.getCost();
    Card card79 = Card.ambassador;
    Card card80 = null;
    Card card81 = Card.feast;
    Card card82 = null;
    java.util.List<Card> list_card83 = gameBoard70.kingdomCards(card71, card72, card73, card75, card76, card77, card79, card80, card81, card82);
    GameBoard gameBoard88 = new GameBoard((int)(byte)1, 10);
    Player player89 = new Player("", (-1), gameBoard88);
    player67.buyCard(card71, gameBoard88);
    Card card91 = Card.baron;
    int i92 = card91.getCost();
    player67.Discard(card91);
    boolean b94 = player67.hasBuys();
    Card card95 = player67.drawCard();
    gameBoard59.returnCard(card95);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.duchy + "'", card71.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.gold + "'", card72.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.baron + "'", card73.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 4);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.silver + "'", card75.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.gold + "'", card76.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.baron + "'", card77.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 4);
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.ambassador + "'", card79.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.feast + "'", card81.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    org.junit.Assert.assertTrue("'" + card91 + "' != '" + Card.baron + "'", card91.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    org.junit.Assert.assertTrue("'" + card95 + "' != '" + Card.copper + "'", card95.equals(Card.copper));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    java.util.List<Card> list_card6 = gameBoard4.getTrash();
    java.util.List<Card> list_card7 = gameBoard4.getAllKingdomCards();
    java.util.List<Card> list_card10 = gameBoard4.getPurchaseableCards((int)(byte)1, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)100, "hi!");

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    java.util.List<Card> list_card65 = gameBoard61.getPurchaseableCards((int)(byte)0, "hi!");
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', 0);
    GameBoard gameBoard7 = new GameBoard((int)(byte)1, 10);
    Player player8 = new Player("", (-1), gameBoard7);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.duchy;
    Card card13 = Card.gold;
    Card card14 = Card.baron;
    int i15 = card14.getCost();
    Card card16 = Card.silver;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.ambassador;
    Card card21 = null;
    Card card22 = Card.feast;
    Card card23 = null;
    java.util.List<Card> list_card24 = gameBoard11.kingdomCards(card12, card13, card14, card16, card17, card18, card20, card21, card22, card23);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Player player30 = new Player("", (-1), gameBoard29);
    player8.buyCard(card12, gameBoard29);
    int i32 = player8.getBuys();
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Player player38 = new Player("", (-1), gameBoard37);
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard((int)(byte)1, 10);
    Player player60 = new Player("", (-1), gameBoard59);
    player38.buyCard(card42, gameBoard59);
    GameBoard gameBoard64 = new GameBoard(10, "hi!");
    player8.buyCard(card42, gameBoard64);
    GameBoard gameBoard68 = new GameBoard((int)(byte)1, 10);
    Card card69 = Card.duchy;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.silver;
    Card card74 = Card.gold;
    Card card75 = Card.baron;
    int i76 = card75.getCost();
    Card card77 = Card.ambassador;
    Card card78 = null;
    Card card79 = Card.feast;
    Card card80 = null;
    java.util.List<Card> list_card81 = gameBoard68.kingdomCards(card69, card70, card71, card73, card74, card75, card77, card78, card79, card80);
    GameBoard gameBoard84 = new GameBoard((int)(byte)10, (int)(byte)0);
    player8.gainCardToHand(card71, gameBoard84);
    gameBoard2.trashCard(card71);
    gameBoard2.opponentDraw(30);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.duchy + "'", card12.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.gold + "'", card13.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.baron + "'", card14.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.ambassador + "'", card20.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.feast + "'", card22.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.duchy + "'", card69.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.silver + "'", card73.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.gold + "'", card74.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.baron + "'", card75.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 4);
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.ambassador + "'", card77.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.feast + "'", card79.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    Card card0 = Card.adventurer;
    int i1 = card0.getVictory();
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.adventurer + "'", card0.equals(Card.adventurer));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)'#', "hi!");
    Card card9 = Card.gardens;
    gameBoard8.takeCard(card9);
    gameBoard4.takeCard(card9);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.gardens + "'", card9.equals(Card.gardens));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    GameBoard gameBoard6 = new GameBoard((int)'#', "hi!");
    boolean b7 = gameBoard6.gameDone();
    Card card8 = Card.feast;
    boolean b9 = gameBoard6.hasCardsAvailable(card8);
    Player player10 = new Player("", 4, gameBoard6);
    java.util.List<Player> list_player11 = gameBoard6.getPlayers();
    java.util.List<Card> list_card13 = gameBoard6.getPurchaseableCards(100);
    Player player14 = new Player("hi!", 10, gameBoard6);
    int i16 = player14.getNumberInHand("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.feast + "'", card8.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNumActions();
    player5.addActions((int)(byte)-1);
    java.util.List<Card> list_card40 = player5.getHand();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    boolean b29 = gameBoard26.gameDone();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.baron;
    boolean b10 = gameBoard8.placeEmbargo(card9);
    gameBoard5.takeCard(card9);
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Card card15 = Card.duchy;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.silver;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.ambassador;
    Card card24 = null;
    Card card25 = Card.feast;
    Card card26 = null;
    java.util.List<Card> list_card27 = gameBoard14.kingdomCards(card15, card16, card17, card19, card20, card21, card23, card24, card25, card26);
    gameBoard5.takeCard(card25);
    boolean b29 = gameBoard2.placeEmbargo(card25);
    int i30 = card25.getVictory();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.duchy + "'", card15.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.silver + "'", card19.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.ambassador + "'", card23.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.feast + "'", card25.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    Card card10 = Card.baron;
    int i11 = player5.getNumberInHand(card10);
    boolean b12 = player5.hasActionCard();
    int i13 = player5.getCoins();
    int i14 = player5.getTotalVictoryPoints();
    boolean b15 = player5.hasActionCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    GameBoard gameBoard65 = new GameBoard((int)(byte)1, 10);
    Card card66 = Card.duchy;
    Card card67 = Card.gold;
    Card card68 = Card.baron;
    int i69 = card68.getCost();
    Card card70 = Card.silver;
    Card card71 = Card.gold;
    Card card72 = Card.baron;
    int i73 = card72.getCost();
    Card card74 = Card.ambassador;
    Card card75 = null;
    Card card76 = Card.feast;
    Card card77 = null;
    java.util.List<Card> list_card78 = gameBoard65.kingdomCards(card66, card67, card68, card70, card71, card72, card74, card75, card76, card77);
    GameBoard gameBoard81 = new GameBoard((int)(byte)10, (int)(byte)0);
    player5.gainCardToHand(card68, gameBoard81);
    Card card83 = Card.curse;
    gameBoard81.takeCard(card83);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.duchy + "'", card66.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.gold + "'", card67.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.baron + "'", card68.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 4);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.silver + "'", card70.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.baron + "'", card72.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 4);
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.ambassador + "'", card74.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.feast + "'", card76.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card78);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.curse + "'", card83.equals(Card.curse));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasActions();
    boolean b70 = player5.hasActionCard();
    boolean b71 = player5.hasActions();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    boolean b38 = player5.hasActions();
    java.util.List<Card> list_card39 = player5.getDiscard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    Card card30 = Card.gardens;
    player5.Discard(card30);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.gardens + "'", card30.equals(Card.gardens));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    GameBoard gameBoard2 = new GameBoard(0, "hi!");

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.List<Card> list_card7 = player5.getDiscard();
    player5.initPlayerTurn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    int i6 = player5.getBuys();
    player5.initPlayerTurn();
    GameBoard gameBoard13 = new GameBoard(10, "");
    Player player14 = new Player("hi!", (int)(short)100, gameBoard13);
    java.util.List<Card> list_card15 = gameBoard13.getTrash();
    // The following exception was thrown during execution in test generation
    try {
    player5.playCard((int)(short)100, gameBoard13);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)'#', "hi!");
    Card card12 = Card.gardens;
    gameBoard11.takeCard(card12);
    boolean b14 = gameBoard2.placeEmbargo(card12);
    java.util.List<Card> list_card15 = gameBoard2.getActiveSupplyPiles();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gardens + "'", card12.equals(Card.gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Player player7 = new Player("", (-1), gameBoard6);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.duchy;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.silver;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.ambassador;
    Card card20 = null;
    Card card21 = Card.feast;
    Card card22 = null;
    java.util.List<Card> list_card23 = gameBoard10.kingdomCards(card11, card12, card13, card15, card16, card17, card19, card20, card21, card22);
    GameBoard gameBoard28 = new GameBoard((int)(byte)1, 10);
    Player player29 = new Player("", (-1), gameBoard28);
    player7.buyCard(card11, gameBoard28);
    gameBoard28.opponentDraw(0);
    Player player33 = new Player("hi!", (int)' ', gameBoard28);
    player33.countTreasure();
    int i36 = player33.getNumberInHand("hi!");
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.duchy + "'", card11.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.ambassador + "'", card19.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.feast + "'", card21.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getCoins();
    player5.discardHandAndInPlay();
    boolean b40 = player5.hasActionCard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    int i12 = player5.getBuys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i38 = player5.getNumberInHand("hi!");
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard(10, "");
    Player player60 = new Player("hi!", (int)(short)100, gameBoard59);
    player5.gainCard(card47, gameBoard59);
    int i62 = player5.getCoins();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    player5.addActions(15);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    java.util.List<Card> list_card29 = player5.getDiscard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    GameBoard gameBoard72 = new GameBoard((int)(byte)1, 10);
    Card card73 = Card.duchy;
    Card card74 = Card.gold;
    Card card75 = Card.baron;
    int i76 = card75.getCost();
    Card card77 = Card.silver;
    Card card78 = Card.gold;
    Card card79 = Card.baron;
    int i80 = card79.getCost();
    Card card81 = Card.ambassador;
    Card card82 = null;
    Card card83 = Card.feast;
    Card card84 = null;
    java.util.List<Card> list_card85 = gameBoard72.kingdomCards(card73, card74, card75, card77, card78, card79, card81, card82, card83, card84);
    int i86 = player5.getNumberInHand(card75);
    int i87 = player5.getCoins();
    java.lang.String str88 = player5.getName();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.duchy + "'", card73.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.gold + "'", card74.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.baron + "'", card75.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 4);
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.silver + "'", card77.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.gold + "'", card78.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.baron + "'", card79.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 4);
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.ambassador + "'", card81.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.feast + "'", card83.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + ""+ "'", str88.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)1, 10);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    java.util.List<Card> list_card29 = player5.getPlayedCards();
    Card card30 = Card.ambassador;
    player5.Discard(card30);
    java.lang.String str32 = player5.getName();
    int i33 = player5.getTotalVictoryPoints();
    boolean b34 = player5.hasActionCard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.ambassador + "'", card30.equals(Card.ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    int i70 = player5.getCoins();
    Card card71 = Card.gold;
    GameBoard gameBoard74 = new GameBoard((int)(short)1, "");
    player5.gainCardToHand(card71, gameBoard74);
    int i76 = player5.getNum();
    int i77 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == (-1));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    player5.initPlayerTurn();
    int i39 = player5.getTotalCards();
    GameBoard gameBoard42 = new GameBoard((int)(byte)1, 10);
    Card card43 = Card.duchy;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.silver;
    Card card48 = Card.gold;
    Card card49 = Card.baron;
    int i50 = card49.getCost();
    Card card51 = Card.ambassador;
    Card card52 = null;
    Card card53 = Card.feast;
    Card card54 = null;
    java.util.List<Card> list_card55 = gameBoard42.kingdomCards(card43, card44, card45, card47, card48, card49, card51, card52, card53, card54);
    boolean b56 = player5.hasCard(card49);
    GameBoard gameBoard59 = new GameBoard((int)(byte)1, 10);
    Card card60 = Card.duchy;
    Card card61 = Card.gold;
    Card card62 = Card.baron;
    int i63 = card62.getCost();
    Card card64 = Card.silver;
    Card card65 = Card.gold;
    Card card66 = Card.baron;
    int i67 = card66.getCost();
    Card card68 = Card.ambassador;
    Card card69 = null;
    Card card70 = Card.feast;
    Card card71 = null;
    java.util.List<Card> list_card72 = gameBoard59.kingdomCards(card60, card61, card62, card64, card65, card66, card68, card69, card70, card71);
    int i73 = player5.getNumberInHand(card71);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.duchy + "'", card43.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.silver + "'", card47.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.gold + "'", card48.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.baron + "'", card49.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 4);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.ambassador + "'", card51.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.feast + "'", card53.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.duchy + "'", card60.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.gold + "'", card61.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.baron + "'", card62.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 4);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.silver + "'", card64.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.gold + "'", card65.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.baron + "'", card66.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 4);
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.ambassador + "'", card68.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.feast + "'", card70.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    Card card63 = Card.duchy;
    GameBoard gameBoard70 = new GameBoard((int)(byte)1, 10);
    Player player71 = new Player("", (-1), gameBoard70);
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Card card75 = Card.duchy;
    Card card76 = Card.gold;
    Card card77 = Card.baron;
    int i78 = card77.getCost();
    Card card79 = Card.silver;
    Card card80 = Card.gold;
    Card card81 = Card.baron;
    int i82 = card81.getCost();
    Card card83 = Card.ambassador;
    Card card84 = null;
    Card card85 = Card.feast;
    Card card86 = null;
    java.util.List<Card> list_card87 = gameBoard74.kingdomCards(card75, card76, card77, card79, card80, card81, card83, card84, card85, card86);
    GameBoard gameBoard92 = new GameBoard((int)(byte)1, 10);
    Player player93 = new Player("", (-1), gameBoard92);
    player71.buyCard(card75, gameBoard92);
    gameBoard92.opponentDraw(0);
    Player player97 = new Player("hi!", (int)' ', gameBoard92);
    player5.buyCard(card63, gameBoard92);
    int i99 = player5.getNumActions();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.duchy + "'", card63.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.duchy + "'", card75.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.gold + "'", card76.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card77 + "' != '" + Card.baron + "'", card77.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 4);
    org.junit.Assert.assertTrue("'" + card79 + "' != '" + Card.silver + "'", card79.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.gold + "'", card80.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card81 + "' != '" + Card.baron + "'", card81.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 4);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.ambassador + "'", card83.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.feast + "'", card85.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 1);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    int i3 = gameBoard2.play();
    java.util.List<Card> list_card5 = gameBoard2.getPurchaseableCards((int)(byte)-1);
    gameBoard2.displayFinalScores();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    Card card3 = Card.gardens;
    gameBoard2.takeCard(card3);
    java.util.List<Card> list_card6 = gameBoard2.kingdomCards((int)' ');
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.gardens + "'", card3.equals(Card.gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    gameBoard2.opponentDiscardCopper((int)(byte)10);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Player player14 = new Player("", (-1), gameBoard13);
    Card card15 = Card.silver;
    java.util.List<java.lang.String> list_str16 = card15.getTypes();
    Card card17 = Card.adventurer;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    GameBoard gameBoard22 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard25 = new GameBoard((int)(byte)1, 10);
    Card card26 = Card.baron;
    boolean b27 = gameBoard25.placeEmbargo(card26);
    gameBoard22.takeCard(card26);
    GameBoard gameBoard31 = new GameBoard((int)(byte)1, 10);
    Card card32 = Card.duchy;
    Card card33 = Card.gold;
    Card card34 = Card.baron;
    int i35 = card34.getCost();
    Card card36 = Card.silver;
    Card card37 = Card.gold;
    Card card38 = Card.baron;
    int i39 = card38.getCost();
    Card card40 = Card.ambassador;
    Card card41 = null;
    Card card42 = Card.feast;
    Card card43 = null;
    java.util.List<Card> list_card44 = gameBoard31.kingdomCards(card32, card33, card34, card36, card37, card38, card40, card41, card42, card43);
    Card card45 = Card.remodel;
    Card card46 = Card.silver;
    java.util.List<java.lang.String> list_str47 = card46.getTypes();
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Card card51 = Card.duchy;
    Card card52 = Card.gold;
    Card card53 = Card.baron;
    int i54 = card53.getCost();
    Card card55 = Card.silver;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.ambassador;
    Card card60 = null;
    Card card61 = Card.feast;
    Card card62 = null;
    java.util.List<Card> list_card63 = gameBoard50.kingdomCards(card51, card52, card53, card55, card56, card57, card59, card60, card61, card62);
    Card card64 = Card.gold;
    GameBoard gameBoard67 = new GameBoard((int)(byte)1, 10);
    Card card68 = Card.duchy;
    Card card69 = Card.gold;
    Card card70 = Card.baron;
    int i71 = card70.getCost();
    Card card72 = Card.silver;
    Card card73 = Card.gold;
    Card card74 = Card.baron;
    int i75 = card74.getCost();
    Card card76 = Card.ambassador;
    Card card77 = null;
    Card card78 = Card.feast;
    Card card79 = null;
    java.util.List<Card> list_card80 = gameBoard67.kingdomCards(card68, card69, card70, card72, card73, card74, card76, card77, card78, card79);
    java.util.List<Card> list_card81 = gameBoard13.kingdomCards(card15, card17, card18, card26, card37, card45, card46, card56, card64, card74);
    boolean b82 = gameBoard2.placeEmbargo(card26);
    Card card83 = Card.remodel;
    gameBoard2.trashCard(card83);
    boolean b85 = gameBoard2.gameDone();
    gameBoard2.opponentDraw((int)(short)1);
    int i88 = gameBoard2.getTotalEmbargoTokens();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.adventurer + "'", card17.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.baron + "'", card26.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.duchy + "'", card32.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.gold + "'", card33.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.baron + "'", card34.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.silver + "'", card36.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.gold + "'", card37.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.ambassador + "'", card40.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.feast + "'", card42.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.remodel + "'", card45.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.duchy + "'", card51.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.gold + "'", card52.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.baron + "'", card53.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 4);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.silver + "'", card55.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.ambassador + "'", card59.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.feast + "'", card61.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.duchy + "'", card68.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.gold + "'", card69.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.baron + "'", card70.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 4);
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.silver + "'", card72.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.gold + "'", card73.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.baron + "'", card74.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 4);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.ambassador + "'", card76.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.feast + "'", card78.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.remodel + "'", card83.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.duchy;
    gameBoard26.takeCard(card29);
    java.util.List<Card> list_card31 = gameBoard26.getAllKingdomCards();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.duchy + "'", card29.equals(Card.duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getBuys();
    java.util.List<Card> list_card70 = player5.getDiscard();
    int i71 = player5.getTotalVictoryPoints();
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Card card75 = player5.getRandomBuyCard(gameBoard74);
    int i76 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 3);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.copper + "'", card75.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == (-1));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    gameBoard2.opponentDiscardCopper(3);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)10, (int)(byte)100);
    java.util.List<Player> list_player3 = gameBoard2.getPlayers();
    gameBoard2.opponentDiscardCopper((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player3);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    GameBoard gameBoard4 = new GameBoard((int)'#', "hi!");
    boolean b5 = gameBoard4.gameDone();
    Card card6 = Card.feast;
    boolean b7 = gameBoard4.hasCardsAvailable(card6);
    Player player8 = new Player("", 4, gameBoard4);
    java.util.List<Card> list_card9 = player8.getPlayedCards();
    boolean b10 = player8.hasActionCard();
    java.lang.String str11 = player8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.feast + "'", card6.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    boolean b19 = gameBoard2.placeEmbargo(card6);
    gameBoard2.displayFinalScores();
    java.util.List<Card> list_card21 = gameBoard2.getActiveSupplyPiles();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    GameBoard gameBoard4 = new GameBoard((int)'#', "hi!");
    boolean b5 = gameBoard4.gameDone();
    Card card6 = Card.feast;
    boolean b7 = gameBoard4.hasCardsAvailable(card6);
    Player player8 = new Player("", 4, gameBoard4);
    player8.countTreasure();
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Player player15 = new Player("", (-1), gameBoard14);
    GameBoard gameBoard18 = new GameBoard((int)(byte)1, 10);
    Card card19 = Card.duchy;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.silver;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.ambassador;
    Card card28 = null;
    Card card29 = Card.feast;
    Card card30 = null;
    java.util.List<Card> list_card31 = gameBoard18.kingdomCards(card19, card20, card21, card23, card24, card25, card27, card28, card29, card30);
    GameBoard gameBoard36 = new GameBoard((int)(byte)1, 10);
    Player player37 = new Player("", (-1), gameBoard36);
    player15.buyCard(card19, gameBoard36);
    Card card39 = Card.duchy;
    gameBoard36.takeCard(card39);
    GameBoard gameBoard43 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card44 = Card.copper;
    gameBoard43.returnCard(card44);
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Player player51 = new Player("", (-1), gameBoard50);
    GameBoard gameBoard54 = new GameBoard((int)(byte)1, 10);
    Card card55 = Card.duchy;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.silver;
    Card card60 = Card.gold;
    Card card61 = Card.baron;
    int i62 = card61.getCost();
    Card card63 = Card.ambassador;
    Card card64 = null;
    Card card65 = Card.feast;
    Card card66 = null;
    java.util.List<Card> list_card67 = gameBoard54.kingdomCards(card55, card56, card57, card59, card60, card61, card63, card64, card65, card66);
    GameBoard gameBoard72 = new GameBoard((int)(byte)1, 10);
    Player player73 = new Player("", (-1), gameBoard72);
    player51.buyCard(card55, gameBoard72);
    gameBoard43.returnCard(card55);
    player8.gainCardToHand(card39, gameBoard43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.feast + "'", card6.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.duchy + "'", card19.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.silver + "'", card23.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.ambassador + "'", card27.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.feast + "'", card29.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.copper + "'", card44.equals(Card.copper));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.duchy + "'", card55.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.silver + "'", card59.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.gold + "'", card60.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.baron + "'", card61.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 4);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.ambassador + "'", card63.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.feast + "'", card65.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', (int)(short)0);
    gameBoard2.opponentDraw((int)(byte)100);
    java.util.List<Card> list_card5 = gameBoard2.getActiveSupplyPiles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    java.util.List<Card> list_card29 = player5.getPlayedCards();
    Card card30 = Card.ambassador;
    player5.Discard(card30);
    java.util.List<Card> list_card32 = player5.getDiscard();
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Player player38 = new Player("", (-1), gameBoard37);
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard((int)(byte)1, 10);
    Player player60 = new Player("", (-1), gameBoard59);
    player38.buyCard(card42, gameBoard59);
    int i62 = player38.getNumActions();
    GameBoard gameBoard65 = new GameBoard((int)(byte)1, 10);
    Card card66 = Card.baron;
    boolean b67 = gameBoard65.placeEmbargo(card66);
    card66.setVictory((int)(short)0);
    int i70 = player38.getNumberInHand(card66);
    boolean b71 = player5.hasCard(card66);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.ambassador + "'", card30.equals(Card.ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.baron + "'", card66.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card7 = player5.getDeck();
    player5.addActions((int)(short)1);
    int i10 = player5.getBuys();
    GameBoard gameBoard13 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Card card17 = Card.baron;
    boolean b18 = gameBoard16.placeEmbargo(card17);
    gameBoard13.takeCard(card17);
    player5.Discard(card17);
    int i21 = player5.getNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    player5.Discard(card42);
    card42.setVictory((int)(byte)100);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    player5.addActions(10);
    int i71 = player5.getCoins();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getCoins();
    int i38 = player5.getTotalCards();
    int i39 = player5.getBuys();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    GameBoard gameBoard2 = new GameBoard(4, "");

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    java.util.List<Card> list_card29 = player5.getPlayedCards();
    int i30 = player5.getTotalCards();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalCards();
    boolean b39 = player5.hasBuys();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    Card card32 = Card.great_hall;
    GameBoard gameBoard35 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.baron;
    boolean b40 = gameBoard38.placeEmbargo(card39);
    gameBoard35.takeCard(card39);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.baron;
    boolean b46 = gameBoard44.placeEmbargo(card45);
    card45.setVictory((int)(short)0);
    boolean b49 = gameBoard35.placeEmbargo(card45);
    java.util.List<Card> list_card51 = gameBoard35.kingdomCards((int)(short)0);
    player5.gainCardToHand(card32, gameBoard35);
    int i53 = player5.getBuys();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.great_hall + "'", card32.equals(Card.great_hall));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.baron + "'", card39.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    java.util.List<Card> list_card39 = player5.getDiscard();
    int i40 = player5.getTotalCards();
    int i41 = player5.getNumActions();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    int i70 = player5.getCoins();
    Card card71 = Card.gold;
    GameBoard gameBoard74 = new GameBoard((int)(short)1, "");
    player5.gainCardToHand(card71, gameBoard74);
    boolean b76 = gameBoard74.gameDone();
    gameBoard74.opponentDraw((int)(short)10);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)10, 3);
    gameBoard2.displayFinalScores();

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    GameBoard gameBoard17 = new GameBoard((int)(byte)1, 10);
    Player player18 = new Player("", (-1), gameBoard17);
    GameBoard gameBoard21 = new GameBoard((int)(byte)1, 10);
    Card card22 = Card.duchy;
    Card card23 = Card.gold;
    Card card24 = Card.baron;
    int i25 = card24.getCost();
    Card card26 = Card.silver;
    Card card27 = Card.gold;
    Card card28 = Card.baron;
    int i29 = card28.getCost();
    Card card30 = Card.ambassador;
    Card card31 = null;
    Card card32 = Card.feast;
    Card card33 = null;
    java.util.List<Card> list_card34 = gameBoard21.kingdomCards(card22, card23, card24, card26, card27, card28, card30, card31, card32, card33);
    GameBoard gameBoard39 = new GameBoard((int)(byte)1, 10);
    Player player40 = new Player("", (-1), gameBoard39);
    player18.buyCard(card22, gameBoard39);
    int i42 = player18.getBuys();
    GameBoard gameBoard47 = new GameBoard((int)(byte)1, 10);
    Player player48 = new Player("", (-1), gameBoard47);
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Card card52 = Card.duchy;
    Card card53 = Card.gold;
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    Card card56 = Card.silver;
    Card card57 = Card.gold;
    Card card58 = Card.baron;
    int i59 = card58.getCost();
    Card card60 = Card.ambassador;
    Card card61 = null;
    Card card62 = Card.feast;
    Card card63 = null;
    java.util.List<Card> list_card64 = gameBoard51.kingdomCards(card52, card53, card54, card56, card57, card58, card60, card61, card62, card63);
    GameBoard gameBoard69 = new GameBoard((int)(byte)1, 10);
    Player player70 = new Player("", (-1), gameBoard69);
    player48.buyCard(card52, gameBoard69);
    GameBoard gameBoard74 = new GameBoard(10, "hi!");
    player18.buyCard(card52, gameBoard74);
    gameBoard74.opponentDiscardCopper((-1));
    player5.playCard((int)(short)0, gameBoard74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.duchy + "'", card22.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.gold + "'", card23.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.baron + "'", card24.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.silver + "'", card26.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.gold + "'", card27.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.baron + "'", card28.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 4);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.ambassador + "'", card30.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.feast + "'", card32.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.duchy + "'", card52.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.gold + "'", card53.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.silver + "'", card56.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.gold + "'", card57.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.baron + "'", card58.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 4);
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.ambassador + "'", card60.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.feast + "'", card62.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card64);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    int i16 = card3.getCost();
    int i17 = card3.getCost();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 5);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    GameBoard gameBoard7 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.baron;
    boolean b12 = gameBoard10.placeEmbargo(card11);
    gameBoard7.takeCard(card11);
    GameBoard gameBoard16 = new GameBoard((int)(byte)1, 10);
    Card card17 = Card.duchy;
    Card card18 = Card.gold;
    Card card19 = Card.baron;
    int i20 = card19.getCost();
    Card card21 = Card.silver;
    Card card22 = Card.gold;
    Card card23 = Card.baron;
    int i24 = card23.getCost();
    Card card25 = Card.ambassador;
    Card card26 = null;
    Card card27 = Card.feast;
    Card card28 = null;
    java.util.List<Card> list_card29 = gameBoard16.kingdomCards(card17, card18, card19, card21, card22, card23, card25, card26, card27, card28);
    gameBoard7.takeCard(card27);
    GameBoard gameBoard33 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard36 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard39 = new GameBoard((int)(byte)1, 10);
    Card card40 = Card.baron;
    boolean b41 = gameBoard39.placeEmbargo(card40);
    gameBoard36.takeCard(card40);
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Card card46 = Card.duchy;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.silver;
    Card card51 = Card.gold;
    Card card52 = Card.baron;
    int i53 = card52.getCost();
    Card card54 = Card.ambassador;
    Card card55 = null;
    Card card56 = Card.feast;
    Card card57 = null;
    java.util.List<Card> list_card58 = gameBoard45.kingdomCards(card46, card47, card48, card50, card51, card52, card54, card55, card56, card57);
    gameBoard36.takeCard(card56);
    boolean b60 = gameBoard33.placeEmbargo(card56);
    gameBoard7.trashCard(card56);
    gameBoard2.returnCard(card56);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.duchy + "'", card17.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.gold + "'", card18.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.baron + "'", card19.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.silver + "'", card21.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.gold + "'", card22.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.baron + "'", card23.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4);
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.ambassador + "'", card25.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.feast + "'", card27.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.duchy + "'", card46.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.silver + "'", card50.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.gold + "'", card51.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.baron + "'", card52.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 4);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.ambassador + "'", card54.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.feast + "'", card56.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    GameBoard gameBoard4 = new GameBoard(10, "");
    Player player5 = new Player("hi!", (int)(short)100, gameBoard4);
    int i6 = player5.getBuys();
    player5.addActions((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    java.util.List<Card> list_card39 = player5.getDiscard();
    java.util.List<java.lang.Integer> list_i40 = player5.getActionCardIndices();
    boolean b41 = player5.hasBuys();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    player5.discardHandAndInPlay();
    int i90 = player5.getTotalVictoryPoints();
    boolean b91 = player5.hasActionCard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)100, "");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    gameBoard2.trashCard(card11);
    java.util.List<Card> list_card20 = gameBoard2.getAllKingdomCards();
    GameBoard gameBoard25 = new GameBoard((int)(byte)1, 10);
    Player player26 = new Player("", (-1), gameBoard25);
    Card card27 = Card.baron;
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Player player33 = new Player("", (-1), gameBoard32);
    GameBoard gameBoard36 = new GameBoard((int)(byte)1, 10);
    Card card37 = Card.duchy;
    Card card38 = Card.gold;
    Card card39 = Card.baron;
    int i40 = card39.getCost();
    Card card41 = Card.silver;
    Card card42 = Card.gold;
    Card card43 = Card.baron;
    int i44 = card43.getCost();
    Card card45 = Card.ambassador;
    Card card46 = null;
    Card card47 = Card.feast;
    Card card48 = null;
    java.util.List<Card> list_card49 = gameBoard36.kingdomCards(card37, card38, card39, card41, card42, card43, card45, card46, card47, card48);
    GameBoard gameBoard54 = new GameBoard((int)(byte)1, 10);
    Player player55 = new Player("", (-1), gameBoard54);
    player33.buyCard(card37, gameBoard54);
    player26.gainCard(card27, gameBoard54);
    boolean b58 = gameBoard2.hasCardsAvailable(card27);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.baron + "'", card27.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.duchy + "'", card37.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.gold + "'", card38.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.baron + "'", card39.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 4);
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.silver + "'", card41.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.gold + "'", card42.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.baron + "'", card43.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 4);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.ambassador + "'", card45.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.feast + "'", card47.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    GameBoard gameBoard2 = new GameBoard(10, "hi!");
    Card card3 = Card.remodel;
    int i4 = gameBoard2.numEmbargoTokens(card3);
    int i5 = card3.getVictory();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.remodel + "'", card3.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 11);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getCoins();
    java.util.List<Card> list_card39 = player5.getDiscard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    boolean b12 = player5.hasActionCard();
    java.util.List<Card> list_card13 = player5.getPlayedCards();
    player5.addActions(4);
    GameBoard gameBoard18 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard21 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard24 = new GameBoard((int)(byte)1, 10);
    Card card25 = Card.duchy;
    Card card26 = Card.gold;
    Card card27 = Card.baron;
    int i28 = card27.getCost();
    Card card29 = Card.silver;
    Card card30 = Card.gold;
    Card card31 = Card.baron;
    int i32 = card31.getCost();
    Card card33 = Card.ambassador;
    Card card34 = null;
    Card card35 = Card.feast;
    Card card36 = null;
    java.util.List<Card> list_card37 = gameBoard24.kingdomCards(card25, card26, card27, card29, card30, card31, card33, card34, card35, card36);
    gameBoard21.trashCard(card30);
    gameBoard18.returnCard(card30);
    GameBoard gameBoard42 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Card card46 = Card.duchy;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.silver;
    Card card51 = Card.gold;
    Card card52 = Card.baron;
    int i53 = card52.getCost();
    Card card54 = Card.ambassador;
    Card card55 = null;
    Card card56 = Card.feast;
    Card card57 = null;
    java.util.List<Card> list_card58 = gameBoard45.kingdomCards(card46, card47, card48, card50, card51, card52, card54, card55, card56, card57);
    gameBoard42.trashCard(card51);
    boolean b60 = gameBoard18.placeEmbargo(card51);
    Card card61 = player5.getRandomBuyCard(gameBoard18);
    boolean b62 = player5.hasBuys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.duchy + "'", card25.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.gold + "'", card26.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.baron + "'", card27.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 4);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.silver + "'", card29.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.gold + "'", card30.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.baron + "'", card31.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 4);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.ambassador + "'", card33.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.feast + "'", card35.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.duchy + "'", card46.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.silver + "'", card50.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.gold + "'", card51.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.baron + "'", card52.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 4);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.ambassador + "'", card54.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.feast + "'", card56.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)10, 3);
    java.util.List<Player> list_player3 = gameBoard2.getPlayers();
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Player player9 = new Player("", (-1), gameBoard8);
    Card card10 = Card.baron;
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Player player16 = new Player("", (-1), gameBoard15);
    GameBoard gameBoard19 = new GameBoard((int)(byte)1, 10);
    Card card20 = Card.duchy;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.silver;
    Card card25 = Card.gold;
    Card card26 = Card.baron;
    int i27 = card26.getCost();
    Card card28 = Card.ambassador;
    Card card29 = null;
    Card card30 = Card.feast;
    Card card31 = null;
    java.util.List<Card> list_card32 = gameBoard19.kingdomCards(card20, card21, card22, card24, card25, card26, card28, card29, card30, card31);
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Player player38 = new Player("", (-1), gameBoard37);
    player16.buyCard(card20, gameBoard37);
    player9.gainCard(card10, gameBoard37);
    int i41 = player9.getNum();
    player9.countTreasure();
    int i43 = player9.getTotalVictoryPoints();
    Card card44 = Card.baron;
    GameBoard gameBoard47 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard53 = new GameBoard((int)(byte)1, 10);
    Card card54 = Card.duchy;
    Card card55 = Card.gold;
    Card card56 = Card.baron;
    int i57 = card56.getCost();
    Card card58 = Card.silver;
    Card card59 = Card.gold;
    Card card60 = Card.baron;
    int i61 = card60.getCost();
    Card card62 = Card.ambassador;
    Card card63 = null;
    Card card64 = Card.feast;
    Card card65 = null;
    java.util.List<Card> list_card66 = gameBoard53.kingdomCards(card54, card55, card56, card58, card59, card60, card62, card63, card64, card65);
    gameBoard50.trashCard(card59);
    gameBoard47.returnCard(card59);
    player9.gainCardToHand(card44, gameBoard47);
    boolean b70 = gameBoard2.placeEmbargo(card44);
    Card card71 = Card.province;
    gameBoard2.trashCard(card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player3);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.duchy + "'", card20.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.silver + "'", card24.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.gold + "'", card25.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.baron + "'", card26.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4);
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.ambassador + "'", card28.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.feast + "'", card30.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 3);
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.duchy + "'", card54.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.baron + "'", card56.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 4);
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.silver + "'", card58.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.gold + "'", card59.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.baron + "'", card60.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 4);
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.ambassador + "'", card62.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.feast + "'", card64.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.province + "'", card71.equals(Card.province));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasActions();
    boolean b68 = player5.hasBuys();
    player5.countTreasure();
    GameBoard gameBoard72 = new GameBoard((int)'#', "hi!");
    Card card73 = Card.gardens;
    gameBoard72.takeCard(card73);
    int i75 = card73.getCost();
    player5.Discard(card73);
    java.lang.String str77 = player5.getName();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.gardens + "'", card73.equals(Card.gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + ""+ "'", str77.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getBuys();
    int i70 = player5.getNum();
    int i71 = player5.getCoins();
    boolean b72 = player5.hasActionCard();
    Card card73 = null;
    boolean b74 = player5.hasCard(card73);
    Card card75 = player5.drawCard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.baron + "'", card75.equals(Card.baron));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Player player7 = new Player("", (-1), gameBoard6);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.duchy;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.silver;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.ambassador;
    Card card20 = null;
    Card card21 = Card.feast;
    Card card22 = null;
    java.util.List<Card> list_card23 = gameBoard10.kingdomCards(card11, card12, card13, card15, card16, card17, card19, card20, card21, card22);
    GameBoard gameBoard28 = new GameBoard((int)(byte)1, 10);
    Player player29 = new Player("", (-1), gameBoard28);
    player7.buyCard(card11, gameBoard28);
    gameBoard28.opponentDraw(0);
    Player player33 = new Player("hi!", (int)' ', gameBoard28);
    int i34 = gameBoard28.getTotalEmbargoTokens();
    gameBoard28.opponentDiscardCopper(11);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.duchy + "'", card11.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.ambassador + "'", card19.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.feast + "'", card21.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.List<Card> list_card7 = player5.getDiscard();
    int i8 = player5.getCoins();
    java.lang.String str9 = player5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.duchy;
    Card card13 = Card.gold;
    Card card14 = Card.baron;
    int i15 = card14.getCost();
    Card card16 = Card.silver;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.ambassador;
    Card card21 = null;
    Card card22 = Card.feast;
    Card card23 = null;
    java.util.List<Card> list_card24 = gameBoard11.kingdomCards(card12, card13, card14, card16, card17, card18, card20, card21, card22, card23);
    gameBoard2.takeCard(card22);
    java.util.List<Card> list_card26 = gameBoard2.getAllKingdomCards();
    java.util.List<Card> list_card27 = gameBoard2.getAllKingdomCards();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.duchy + "'", card12.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.gold + "'", card13.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.baron + "'", card14.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.silver + "'", card16.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.ambassador + "'", card20.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.feast + "'", card22.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    int i39 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Card card33 = Card.baron;
    boolean b34 = gameBoard32.placeEmbargo(card33);
    card33.setVictory((int)(short)0);
    int i37 = player5.getNumberInHand(card33);
    int i38 = player5.getNumActions();
    boolean b39 = player5.hasActions();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.baron + "'", card33.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    Card card4 = Card.feast;
    boolean b5 = gameBoard2.hasCardsAvailable(card4);
    Card card6 = Card.smithy;
    boolean b7 = gameBoard2.hasCardsAvailable(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.feast + "'", card4.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.smithy + "'", card6.equals(Card.smithy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    player5.Discard(card42);
    player5.countTreasure();
    java.util.LinkedList<Card> linkedlist_card57 = player5.getDeck();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card57);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    java.util.List<java.lang.Integer> list_i56 = player5.getActionCardIndices();
    java.util.List<java.lang.Integer> list_i57 = player5.getActionCardIndices();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i57);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    java.util.List<Card> list_card29 = player5.getPlayedCards();
    Card card30 = Card.ambassador;
    player5.Discard(card30);
    boolean b32 = player5.hasActionCard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.ambassador + "'", card30.equals(Card.ambassador));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasActions();
    boolean b68 = player5.hasBuys();
    player5.initPlayerTurn();
    boolean b70 = player5.hasBuys();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    player5.addActions(10);
    int i71 = player5.getTotalVictoryPoints();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 3);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    gameBoard61.opponentDiscardCopper((-1));
    java.util.List<Card> list_card65 = gameBoard61.getActiveSupplyPiles();
    gameBoard61.opponentDiscardCopper((int)(short)10);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getCoins();
    int i38 = player5.getTotalCards();
    GameBoard gameBoard43 = new GameBoard((int)(byte)1, 10);
    Player player44 = new Player("", (-1), gameBoard43);
    GameBoard gameBoard47 = new GameBoard((int)(byte)1, 10);
    Card card48 = Card.duchy;
    Card card49 = Card.gold;
    Card card50 = Card.baron;
    int i51 = card50.getCost();
    Card card52 = Card.silver;
    Card card53 = Card.gold;
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    Card card56 = Card.ambassador;
    Card card57 = null;
    Card card58 = Card.feast;
    Card card59 = null;
    java.util.List<Card> list_card60 = gameBoard47.kingdomCards(card48, card49, card50, card52, card53, card54, card56, card57, card58, card59);
    GameBoard gameBoard65 = new GameBoard((int)(byte)1, 10);
    Player player66 = new Player("", (-1), gameBoard65);
    player44.buyCard(card48, gameBoard65);
    java.util.List<Card> list_card68 = player44.getPlayedCards();
    Card card69 = Card.ambassador;
    player44.Discard(card69);
    GameBoard gameBoard73 = new GameBoard((int)(short)1, "");
    player5.gainCard(card69, gameBoard73);
    player5.initPlayerTurn();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11);
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.duchy + "'", card48.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.gold + "'", card49.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.baron + "'", card50.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 4);
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.silver + "'", card52.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.gold + "'", card53.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.ambassador + "'", card56.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.feast + "'", card58.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card68);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.ambassador + "'", card69.equals(Card.ambassador));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    player5.countTreasure();
    int i39 = player5.getTotalVictoryPoints();
    Card card40 = Card.baron;
    GameBoard gameBoard43 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard46 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard49 = new GameBoard((int)(byte)1, 10);
    Card card50 = Card.duchy;
    Card card51 = Card.gold;
    Card card52 = Card.baron;
    int i53 = card52.getCost();
    Card card54 = Card.silver;
    Card card55 = Card.gold;
    Card card56 = Card.baron;
    int i57 = card56.getCost();
    Card card58 = Card.ambassador;
    Card card59 = null;
    Card card60 = Card.feast;
    Card card61 = null;
    java.util.List<Card> list_card62 = gameBoard49.kingdomCards(card50, card51, card52, card54, card55, card56, card58, card59, card60, card61);
    gameBoard46.trashCard(card55);
    gameBoard43.returnCard(card55);
    player5.gainCardToHand(card40, gameBoard43);
    java.util.List<Card> list_card66 = player5.getDiscard();
    int i67 = player5.getNumActions();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.baron + "'", card40.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.duchy + "'", card50.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.gold + "'", card51.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.baron + "'", card52.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 4);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.silver + "'", card54.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.gold + "'", card55.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.baron + "'", card56.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 4);
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.ambassador + "'", card58.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.feast + "'", card60.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNumActions();
    GameBoard gameBoard41 = new GameBoard((int)(short)0, 100);
    player5.playCard((int)(byte)1, gameBoard41);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    Card card38 = Card.copper;
    GameBoard gameBoard41 = new GameBoard((int)'#', (int)(short)0);
    gameBoard41.opponentDraw((int)(byte)100);
    player5.gainCardToHand(card38, gameBoard41);
    gameBoard41.opponentDraw(10);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.copper + "'", card38.equals(Card.copper));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    java.util.List<Card> list_card39 = player5.getDiscard();
    int i40 = player5.getTotalCards();
    GameBoard gameBoard44 = new GameBoard(10, 6);
    // The following exception was thrown during execution in test generation
    try {
    player5.playCard(11, gameBoard44);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    Card card0 = Card.adventurer;
    card0.setVictory(6);
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.adventurer + "'", card0.equals(Card.adventurer));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', (int)(short)0);
    int i3 = gameBoard2.getTotalEmbargoTokens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.baron;
    boolean b4 = gameBoard2.placeEmbargo(card3);
    card3.setVictory((int)(short)0);
    java.util.List<java.lang.String> list_str7 = card3.getTypes();
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.baron + "'", card3.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getBuys();
    int i70 = player5.getNum();
    int i71 = player5.getCoins();
    int i72 = player5.getNumActions();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    GameBoard gameBoard32 = new GameBoard(10, "hi!");
    Card card33 = Card.remodel;
    int i34 = gameBoard32.numEmbargoTokens(card33);
    GameBoard gameBoard37 = new GameBoard((int)(byte)1, 10);
    Card card38 = Card.baron;
    boolean b39 = gameBoard37.placeEmbargo(card38);
    player5.gainCardToHand(card33, gameBoard37);
    int i41 = gameBoard37.play();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.remodel + "'", card33.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    int i38 = player5.getBuys();
    java.util.List<Card> list_card39 = player5.getDiscard();
    java.util.List<java.lang.Integer> list_i40 = player5.getActionCardIndices();
    Card card41 = Card.silver;
    java.util.List<java.lang.String> list_str42 = card41.getTypes();
    player5.Discard(card41);
    java.util.List<java.lang.Integer> list_i44 = player5.getActionCardIndices();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i40);
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.silver + "'", card41.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i44);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    player5.initPlayerTurn();
    int i39 = player5.getTotalCards();
    java.util.List<Card> list_card40 = player5.getDiscard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    Card card0 = Card.curse;
    int i1 = card0.getVictory();
    org.junit.Assert.assertTrue("'" + card0 + "' != '" + Card.curse + "'", card0.equals(Card.curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Player player9 = new Player("", (-1), gameBoard8);
    GameBoard gameBoard12 = new GameBoard((int)(byte)1, 10);
    Card card13 = Card.duchy;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.silver;
    Card card18 = Card.gold;
    Card card19 = Card.baron;
    int i20 = card19.getCost();
    Card card21 = Card.ambassador;
    Card card22 = null;
    Card card23 = Card.feast;
    Card card24 = null;
    java.util.List<Card> list_card25 = gameBoard12.kingdomCards(card13, card14, card15, card17, card18, card19, card21, card22, card23, card24);
    GameBoard gameBoard30 = new GameBoard((int)(byte)1, 10);
    Player player31 = new Player("", (-1), gameBoard30);
    player9.buyCard(card13, gameBoard30);
    int i33 = player9.getBuys();
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Player player39 = new Player("", (-1), gameBoard38);
    GameBoard gameBoard42 = new GameBoard((int)(byte)1, 10);
    Card card43 = Card.duchy;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.silver;
    Card card48 = Card.gold;
    Card card49 = Card.baron;
    int i50 = card49.getCost();
    Card card51 = Card.ambassador;
    Card card52 = null;
    Card card53 = Card.feast;
    Card card54 = null;
    java.util.List<Card> list_card55 = gameBoard42.kingdomCards(card43, card44, card45, card47, card48, card49, card51, card52, card53, card54);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    player39.buyCard(card43, gameBoard60);
    GameBoard gameBoard65 = new GameBoard(10, "hi!");
    player9.buyCard(card43, gameBoard65);
    GameBoard gameBoard69 = new GameBoard((int)(byte)1, 10);
    Card card70 = Card.duchy;
    Card card71 = Card.gold;
    Card card72 = Card.baron;
    int i73 = card72.getCost();
    Card card74 = Card.silver;
    Card card75 = Card.gold;
    Card card76 = Card.baron;
    int i77 = card76.getCost();
    Card card78 = Card.ambassador;
    Card card79 = null;
    Card card80 = Card.feast;
    Card card81 = null;
    java.util.List<Card> list_card82 = gameBoard69.kingdomCards(card70, card71, card72, card74, card75, card76, card78, card79, card80, card81);
    GameBoard gameBoard85 = new GameBoard((int)(byte)10, (int)(byte)0);
    player9.gainCardToHand(card72, gameBoard85);
    gameBoard2.opponentGainCard((int)' ', card72);
    java.util.List<Card> list_card88 = gameBoard2.getAllKingdomCards();
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.duchy + "'", card13.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.silver + "'", card17.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.gold + "'", card18.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.baron + "'", card19.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.ambassador + "'", card21.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.feast + "'", card23.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.duchy + "'", card43.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.silver + "'", card47.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.gold + "'", card48.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.baron + "'", card49.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 4);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.ambassador + "'", card51.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.feast + "'", card53.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.duchy + "'", card70.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.baron + "'", card72.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 4);
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.silver + "'", card74.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.gold + "'", card75.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.baron + "'", card76.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 4);
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.ambassador + "'", card78.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card80 + "' != '" + Card.feast + "'", card80.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card88);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)10, 3);
    java.util.List<Player> list_player3 = gameBoard2.getPlayers();
    Card card4 = Card.embargo;
    boolean b5 = gameBoard2.hasCardsAvailable(card4);
    java.util.List<Card> list_card7 = gameBoard2.kingdomCards((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player3);
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.embargo + "'", card4.equals(Card.embargo));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getBuys();
    java.util.List<Card> list_card70 = player5.getDiscard();
    int i71 = player5.getCoins();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    int i30 = player5.getCoins();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    int i30 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i67 = player5.getBuys();
    player5.addActions((int)(short)1);
    Card card70 = Card.great_hall;
    boolean b71 = player5.hasCard(card70);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.great_hall + "'", card70.equals(Card.great_hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard43 = new GameBoard((int)(byte)1, 10);
    Player player44 = new Player("", (-1), gameBoard43);
    Card card45 = Card.baron;
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Player player51 = new Player("", (-1), gameBoard50);
    GameBoard gameBoard54 = new GameBoard((int)(byte)1, 10);
    Card card55 = Card.duchy;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.silver;
    Card card60 = Card.gold;
    Card card61 = Card.baron;
    int i62 = card61.getCost();
    Card card63 = Card.ambassador;
    Card card64 = null;
    Card card65 = Card.feast;
    Card card66 = null;
    java.util.List<Card> list_card67 = gameBoard54.kingdomCards(card55, card56, card57, card59, card60, card61, card63, card64, card65, card66);
    GameBoard gameBoard72 = new GameBoard((int)(byte)1, 10);
    Player player73 = new Player("", (-1), gameBoard72);
    player51.buyCard(card55, gameBoard72);
    player44.gainCard(card45, gameBoard72);
    boolean b76 = player5.hasCard(card45);
    java.util.List<Card> list_card77 = player5.getPlayedCards();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.duchy + "'", card55.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.silver + "'", card59.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.gold + "'", card60.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.baron + "'", card61.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 4);
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.ambassador + "'", card63.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.feast + "'", card65.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getCoins();
    Card card38 = player5.drawCard();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.copper + "'", card38.equals(Card.copper));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i38 = player5.getNumberInHand("hi!");
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    GameBoard gameBoard59 = new GameBoard(10, "");
    Player player60 = new Player("hi!", (int)(short)100, gameBoard59);
    player5.gainCard(card47, gameBoard59);
    java.util.List<Card> list_card63 = gameBoard59.getPurchaseableCards((int)(short)100);
    int i64 = gameBoard59.getTotalEmbargoTokens();
    gameBoard59.displayFinalScores();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    GameBoard gameBoard2 = new GameBoard(1, "hi!");
    gameBoard2.opponentDiscardCopper(10);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    Card card3 = Card.duchy;
    Card card4 = Card.gold;
    Card card5 = Card.baron;
    int i6 = card5.getCost();
    Card card7 = Card.silver;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.ambassador;
    Card card12 = null;
    Card card13 = Card.feast;
    Card card14 = null;
    java.util.List<Card> list_card15 = gameBoard2.kingdomCards(card3, card4, card5, card7, card8, card9, card11, card12, card13, card14);
    gameBoard2.displayFinalScores();
    java.util.List<Card> list_card17 = gameBoard2.getActiveSupplyPiles();
    int i18 = gameBoard2.getTotalEmbargoTokens();
    GameBoard gameBoard21 = new GameBoard((int)'#', "hi!");
    Card card22 = Card.gardens;
    gameBoard21.takeCard(card22);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Card card30 = Card.duchy;
    Card card31 = Card.gold;
    Card card32 = Card.baron;
    int i33 = card32.getCost();
    Card card34 = Card.silver;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.ambassador;
    Card card39 = null;
    Card card40 = Card.feast;
    Card card41 = null;
    java.util.List<Card> list_card42 = gameBoard29.kingdomCards(card30, card31, card32, card34, card35, card36, card38, card39, card40, card41);
    gameBoard26.trashCard(card35);
    int i44 = gameBoard21.numEmbargoTokens(card35);
    int i45 = gameBoard2.numEmbargoTokens(card35);
    gameBoard2.opponentDraw(0);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.duchy + "'", card3.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.gold + "'", card4.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card5 + "' != '" + Card.baron + "'", card5.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 4);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.silver + "'", card7.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.ambassador + "'", card11.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.feast + "'", card13.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.gardens + "'", card22.equals(Card.gardens));
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.duchy + "'", card30.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.gold + "'", card31.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.baron + "'", card32.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.silver + "'", card34.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.ambassador + "'", card38.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.feast + "'", card40.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    java.util.List<Card> list_card7 = player5.getDiscard();
    int i8 = player5.getCoins();
    Card card9 = player5.drawCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.copper + "'", card9.equals(Card.copper));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    Card card70 = player5.drawCard();
    int i71 = card70.getCost();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.copper + "'", card70.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Player player7 = new Player("", (-1), gameBoard6);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.duchy;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.silver;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.ambassador;
    Card card20 = null;
    Card card21 = Card.feast;
    Card card22 = null;
    java.util.List<Card> list_card23 = gameBoard10.kingdomCards(card11, card12, card13, card15, card16, card17, card19, card20, card21, card22);
    GameBoard gameBoard28 = new GameBoard((int)(byte)1, 10);
    Player player29 = new Player("", (-1), gameBoard28);
    player7.buyCard(card11, gameBoard28);
    gameBoard28.opponentDraw(0);
    Player player33 = new Player("hi!", (int)' ', gameBoard28);
    gameBoard28.displayFinalScores();
    java.util.List<Card> list_card36 = gameBoard28.getPurchaseableCards(6);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.duchy + "'", card11.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.ambassador + "'", card19.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.feast + "'", card21.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    boolean b19 = gameBoard2.placeEmbargo(card6);
    java.util.List<Player> list_player20 = gameBoard2.getPlayers();
    java.util.List<Player> list_player21 = gameBoard2.getPlayers();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player21);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    Card card70 = player5.drawCard();
    int i71 = player5.getNum();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.copper + "'", card70.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == (-1));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasActions();
    boolean b68 = player5.hasBuys();
    player5.countTreasure();
    boolean b70 = player5.hasActions();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    gameBoard2.opponentDiscardCopper((int)'#');
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    int i3 = gameBoard2.play();
    java.util.List<Card> list_card5 = gameBoard2.getPurchaseableCards((int)(byte)-1);
    java.util.List<Card> list_card7 = gameBoard2.getPurchaseableCards(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getBuys();
    java.util.List<Card> list_card70 = player5.getDiscard();
    int i71 = player5.getTotalVictoryPoints();
    GameBoard gameBoard74 = new GameBoard((int)(byte)1, 10);
    Card card75 = player5.getRandomBuyCard(gameBoard74);
    int i76 = player5.getTotalVictoryPoints();
    java.util.List<Card> list_card77 = player5.getPlayedCards();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 3);
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.copper + "'", card75.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    int i7 = player5.getNumActions();
    java.lang.String str8 = player5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Player player7 = new Player("", (-1), gameBoard6);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.duchy;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.silver;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.ambassador;
    Card card20 = null;
    Card card21 = Card.feast;
    Card card22 = null;
    java.util.List<Card> list_card23 = gameBoard10.kingdomCards(card11, card12, card13, card15, card16, card17, card19, card20, card21, card22);
    GameBoard gameBoard28 = new GameBoard((int)(byte)1, 10);
    Player player29 = new Player("", (-1), gameBoard28);
    player7.buyCard(card11, gameBoard28);
    gameBoard28.opponentDraw(0);
    Player player33 = new Player("hi!", (int)' ', gameBoard28);
    player33.countTreasure();
    boolean b35 = player33.hasActions();
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    java.util.List<java.lang.Integer> list_i42 = player41.getActionCardIndices();
    int i43 = player41.getNumActions();
    Card card44 = player41.drawCard();
    GameBoard gameBoard47 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard51 = new GameBoard((int)(byte)1, 10);
    Card card52 = Card.duchy;
    Card card53 = Card.gold;
    Card card54 = Card.baron;
    int i55 = card54.getCost();
    Card card56 = Card.silver;
    Card card57 = Card.gold;
    Card card58 = Card.baron;
    int i59 = card58.getCost();
    Card card60 = Card.ambassador;
    Card card61 = null;
    Card card62 = Card.feast;
    Card card63 = null;
    java.util.List<Card> list_card64 = gameBoard51.kingdomCards(card52, card53, card54, card56, card57, card58, card60, card61, card62, card63);
    gameBoard47.opponentGainCard((int)'#', card58);
    player33.buyCard(card44, gameBoard47);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.duchy + "'", card11.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.ambassador + "'", card19.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.feast + "'", card21.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.copper + "'", card44.equals(Card.copper));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.duchy + "'", card52.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.gold + "'", card53.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.baron + "'", card54.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 4);
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.silver + "'", card56.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.gold + "'", card57.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.baron + "'", card58.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 4);
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.ambassador + "'", card60.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.feast + "'", card62.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card64);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    Card card37 = player5.drawCard();
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Card card41 = Card.duchy;
    Card card42 = Card.gold;
    Card card43 = Card.baron;
    int i44 = card43.getCost();
    Card card45 = Card.silver;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.ambassador;
    Card card50 = null;
    Card card51 = Card.feast;
    Card card52 = null;
    java.util.List<Card> list_card53 = gameBoard40.kingdomCards(card41, card42, card43, card45, card46, card47, card49, card50, card51, card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    gameBoard82.opponentDraw(0);
    Player player87 = new Player("hi!", (int)' ', gameBoard82);
    int i88 = gameBoard82.getTotalEmbargoTokens();
    player5.gainCard(card41, gameBoard82);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.copper + "'", card37.equals(Card.copper));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.duchy + "'", card41.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.gold + "'", card42.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.baron + "'", card43.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 4);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.silver + "'", card45.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.ambassador + "'", card49.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.feast + "'", card51.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card53);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard13 = new GameBoard((int)(byte)1, 10);
    Player player14 = new Player("", (-1), gameBoard13);
    Card card15 = Card.silver;
    java.util.List<java.lang.String> list_str16 = card15.getTypes();
    Card card17 = Card.adventurer;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    GameBoard gameBoard22 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard25 = new GameBoard((int)(byte)1, 10);
    Card card26 = Card.baron;
    boolean b27 = gameBoard25.placeEmbargo(card26);
    gameBoard22.takeCard(card26);
    GameBoard gameBoard31 = new GameBoard((int)(byte)1, 10);
    Card card32 = Card.duchy;
    Card card33 = Card.gold;
    Card card34 = Card.baron;
    int i35 = card34.getCost();
    Card card36 = Card.silver;
    Card card37 = Card.gold;
    Card card38 = Card.baron;
    int i39 = card38.getCost();
    Card card40 = Card.ambassador;
    Card card41 = null;
    Card card42 = Card.feast;
    Card card43 = null;
    java.util.List<Card> list_card44 = gameBoard31.kingdomCards(card32, card33, card34, card36, card37, card38, card40, card41, card42, card43);
    Card card45 = Card.remodel;
    Card card46 = Card.silver;
    java.util.List<java.lang.String> list_str47 = card46.getTypes();
    GameBoard gameBoard50 = new GameBoard((int)(byte)1, 10);
    Card card51 = Card.duchy;
    Card card52 = Card.gold;
    Card card53 = Card.baron;
    int i54 = card53.getCost();
    Card card55 = Card.silver;
    Card card56 = Card.gold;
    Card card57 = Card.baron;
    int i58 = card57.getCost();
    Card card59 = Card.ambassador;
    Card card60 = null;
    Card card61 = Card.feast;
    Card card62 = null;
    java.util.List<Card> list_card63 = gameBoard50.kingdomCards(card51, card52, card53, card55, card56, card57, card59, card60, card61, card62);
    Card card64 = Card.gold;
    GameBoard gameBoard67 = new GameBoard((int)(byte)1, 10);
    Card card68 = Card.duchy;
    Card card69 = Card.gold;
    Card card70 = Card.baron;
    int i71 = card70.getCost();
    Card card72 = Card.silver;
    Card card73 = Card.gold;
    Card card74 = Card.baron;
    int i75 = card74.getCost();
    Card card76 = Card.ambassador;
    Card card77 = null;
    Card card78 = Card.feast;
    Card card79 = null;
    java.util.List<Card> list_card80 = gameBoard67.kingdomCards(card68, card69, card70, card72, card73, card74, card76, card77, card78, card79);
    java.util.List<Card> list_card81 = gameBoard13.kingdomCards(card15, card17, card18, card26, card37, card45, card46, card56, card64, card74);
    boolean b82 = gameBoard2.placeEmbargo(card26);
    Card card83 = Card.remodel;
    gameBoard2.trashCard(card83);
    Card card85 = Card.remodel;
    gameBoard2.takeCard(card85);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.silver + "'", card15.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.adventurer + "'", card17.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.baron + "'", card26.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.duchy + "'", card32.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.gold + "'", card33.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.baron + "'", card34.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4);
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.silver + "'", card36.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.gold + "'", card37.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.baron + "'", card38.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 4);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.ambassador + "'", card40.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.feast + "'", card42.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.remodel + "'", card45.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.duchy + "'", card51.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.gold + "'", card52.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.baron + "'", card53.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 4);
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.silver + "'", card55.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.gold + "'", card56.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.baron + "'", card57.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.ambassador + "'", card59.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.feast + "'", card61.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.duchy + "'", card68.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.gold + "'", card69.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.baron + "'", card70.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 4);
    org.junit.Assert.assertTrue("'" + card72 + "' != '" + Card.silver + "'", card72.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.gold + "'", card73.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card74 + "' != '" + Card.baron + "'", card74.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 4);
    org.junit.Assert.assertTrue("'" + card76 + "' != '" + Card.ambassador + "'", card76.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card78 + "' != '" + Card.feast + "'", card78.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + card83 + "' != '" + Card.remodel + "'", card83.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card85 + "' != '" + Card.remodel + "'", card85.equals(Card.remodel));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    java.util.List<Card> list_card7 = gameBoard2.getPurchaseableCards((int)'a', "");
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    player5.Discard(card29);
    int i32 = player5.getTotalVictoryPoints();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 3);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    player5.initPlayerTurn();
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Card card11 = Card.baron;
    boolean b12 = gameBoard10.placeEmbargo(card11);
    player5.playCard((int)(short)1, gameBoard10);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    gameBoard2.opponentGainCard((int)'#', card13);
    Card card21 = Card.silver;
    int i22 = gameBoard2.numCardsAvailable(card21);
    java.util.List<Card> list_card24 = gameBoard2.kingdomCards((int)(short)10);
    Card card25 = Card.gardens;
    gameBoard2.returnCard(card25);
    java.util.List<Card> list_card27 = gameBoard2.getActiveSupplyPiles();
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.silver + "'", card21.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.gardens + "'", card25.equals(Card.gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    Card card10 = Card.baron;
    int i11 = player5.getNumberInHand(card10);
    boolean b12 = player5.hasActionCard();
    int i13 = player5.getCoins();
    boolean b14 = player5.hasBuys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.baron + "'", card10.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    GameBoard gameBoard6 = new GameBoard(10, "");
    Player player7 = new Player("hi!", (int)(short)100, gameBoard6);
    Player player8 = new Player("", (int)(short)100, gameBoard6);
    int i9 = player8.getNumActions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    int i70 = player5.getCoins();
    Card card71 = Card.gold;
    GameBoard gameBoard74 = new GameBoard((int)(short)1, "");
    player5.gainCardToHand(card71, gameBoard74);
    boolean b76 = player5.hasActions();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.gold + "'", card71.equals(Card.gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    boolean b3 = gameBoard2.gameDone();
    Card card4 = Card.feast;
    boolean b5 = gameBoard2.hasCardsAvailable(card4);
    GameBoard gameBoard10 = new GameBoard((int)(byte)1, 10);
    Player player11 = new Player("", (-1), gameBoard10);
    GameBoard gameBoard14 = new GameBoard((int)(byte)1, 10);
    Card card15 = Card.duchy;
    Card card16 = Card.gold;
    Card card17 = Card.baron;
    int i18 = card17.getCost();
    Card card19 = Card.silver;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.ambassador;
    Card card24 = null;
    Card card25 = Card.feast;
    Card card26 = null;
    java.util.List<Card> list_card27 = gameBoard14.kingdomCards(card15, card16, card17, card19, card20, card21, card23, card24, card25, card26);
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Player player33 = new Player("", (-1), gameBoard32);
    player11.buyCard(card15, gameBoard32);
    int i35 = player11.getBuys();
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    GameBoard gameBoard67 = new GameBoard(10, "hi!");
    player11.buyCard(card45, gameBoard67);
    int i69 = gameBoard2.numCardsAvailable(card45);
    java.util.List<java.lang.String> list_str70 = card45.getTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + card4 + "' != '" + Card.feast + "'", card4.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.duchy + "'", card15.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.gold + "'", card16.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.baron + "'", card17.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.silver + "'", card19.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.ambassador + "'", card23.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.feast + "'", card25.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    GameBoard gameBoard2 = new GameBoard((int)(short)10, (int)(byte)100);
    java.util.List<Player> list_player3 = gameBoard2.getPlayers();
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Player player9 = new Player("", (-1), gameBoard8);
    Card card10 = Card.silver;
    java.util.List<java.lang.String> list_str11 = card10.getTypes();
    Card card12 = Card.adventurer;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    GameBoard gameBoard17 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard20 = new GameBoard((int)(byte)1, 10);
    Card card21 = Card.baron;
    boolean b22 = gameBoard20.placeEmbargo(card21);
    gameBoard17.takeCard(card21);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Card card27 = Card.duchy;
    Card card28 = Card.gold;
    Card card29 = Card.baron;
    int i30 = card29.getCost();
    Card card31 = Card.silver;
    Card card32 = Card.gold;
    Card card33 = Card.baron;
    int i34 = card33.getCost();
    Card card35 = Card.ambassador;
    Card card36 = null;
    Card card37 = Card.feast;
    Card card38 = null;
    java.util.List<Card> list_card39 = gameBoard26.kingdomCards(card27, card28, card29, card31, card32, card33, card35, card36, card37, card38);
    Card card40 = Card.remodel;
    Card card41 = Card.silver;
    java.util.List<java.lang.String> list_str42 = card41.getTypes();
    GameBoard gameBoard45 = new GameBoard((int)(byte)1, 10);
    Card card46 = Card.duchy;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.silver;
    Card card51 = Card.gold;
    Card card52 = Card.baron;
    int i53 = card52.getCost();
    Card card54 = Card.ambassador;
    Card card55 = null;
    Card card56 = Card.feast;
    Card card57 = null;
    java.util.List<Card> list_card58 = gameBoard45.kingdomCards(card46, card47, card48, card50, card51, card52, card54, card55, card56, card57);
    Card card59 = Card.gold;
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Card card63 = Card.duchy;
    Card card64 = Card.gold;
    Card card65 = Card.baron;
    int i66 = card65.getCost();
    Card card67 = Card.silver;
    Card card68 = Card.gold;
    Card card69 = Card.baron;
    int i70 = card69.getCost();
    Card card71 = Card.ambassador;
    Card card72 = null;
    Card card73 = Card.feast;
    Card card74 = null;
    java.util.List<Card> list_card75 = gameBoard62.kingdomCards(card63, card64, card65, card67, card68, card69, card71, card72, card73, card74);
    java.util.List<Card> list_card76 = gameBoard8.kingdomCards(card10, card12, card13, card21, card32, card40, card41, card51, card59, card69);
    card12.setVictory((int)(short)0);
    int i79 = card12.getCost();
    boolean b80 = gameBoard2.hasCardsAvailable(card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player3);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.adventurer + "'", card12.equals(Card.adventurer));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.duchy + "'", card27.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.gold + "'", card28.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.baron + "'", card29.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.silver + "'", card31.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.gold + "'", card32.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.baron + "'", card33.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 4);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.ambassador + "'", card35.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.feast + "'", card37.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.remodel + "'", card40.equals(Card.remodel));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.silver + "'", card41.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str42);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.duchy + "'", card46.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.silver + "'", card50.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.gold + "'", card51.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.baron + "'", card52.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 4);
    org.junit.Assert.assertTrue("'" + card54 + "' != '" + Card.ambassador + "'", card54.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.feast + "'", card56.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    org.junit.Assert.assertTrue("'" + card59 + "' != '" + Card.gold + "'", card59.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card63 + "' != '" + Card.duchy + "'", card63.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.gold + "'", card64.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.baron + "'", card65.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 4);
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.silver + "'", card67.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card68 + "' != '" + Card.gold + "'", card68.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.baron + "'", card69.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 4);
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.ambassador + "'", card71.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.feast + "'", card73.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    GameBoard gameBoard4 = new GameBoard((int)'#', "hi!");
    boolean b5 = gameBoard4.gameDone();
    Card card6 = Card.feast;
    boolean b7 = gameBoard4.hasCardsAvailable(card6);
    Player player8 = new Player("", 4, gameBoard4);
    java.util.List<Card> list_card9 = player8.getPlayedCards();
    boolean b10 = player8.hasActionCard();
    int i11 = player8.getTotalCards();
    GameBoard gameBoard14 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard18 = new GameBoard((int)(byte)1, 10);
    Card card19 = Card.duchy;
    Card card20 = Card.gold;
    Card card21 = Card.baron;
    int i22 = card21.getCost();
    Card card23 = Card.silver;
    Card card24 = Card.gold;
    Card card25 = Card.baron;
    int i26 = card25.getCost();
    Card card27 = Card.ambassador;
    Card card28 = null;
    Card card29 = Card.feast;
    Card card30 = null;
    java.util.List<Card> list_card31 = gameBoard18.kingdomCards(card19, card20, card21, card23, card24, card25, card27, card28, card29, card30);
    gameBoard14.opponentGainCard((int)'#', card25);
    Card card33 = Card.silver;
    int i34 = gameBoard14.numCardsAvailable(card33);
    java.util.List<Card> list_card36 = gameBoard14.kingdomCards((int)(short)10);
    Card card37 = Card.gardens;
    gameBoard14.returnCard(card37);
    GameBoard gameBoard41 = new GameBoard((int)'#', "hi!");
    Card card42 = Card.gardens;
    gameBoard41.takeCard(card42);
    int i44 = gameBoard14.numCardsAvailable(card42);
    player8.Discard(card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.feast + "'", card6.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.duchy + "'", card19.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.gold + "'", card20.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.baron + "'", card21.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.silver + "'", card23.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.gold + "'", card24.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card25 + "' != '" + Card.baron + "'", card25.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4);
    org.junit.Assert.assertTrue("'" + card27 + "' != '" + Card.ambassador + "'", card27.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card29 + "' != '" + Card.feast + "'", card29.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.silver + "'", card33.equals(Card.silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    org.junit.Assert.assertTrue("'" + card37 + "' != '" + Card.gardens + "'", card37.equals(Card.gardens));
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.gardens + "'", card42.equals(Card.gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 11);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getBuys();
    GameBoard gameBoard34 = new GameBoard((int)(byte)1, 10);
    Player player35 = new Player("", (-1), gameBoard34);
    GameBoard gameBoard38 = new GameBoard((int)(byte)1, 10);
    Card card39 = Card.duchy;
    Card card40 = Card.gold;
    Card card41 = Card.baron;
    int i42 = card41.getCost();
    Card card43 = Card.silver;
    Card card44 = Card.gold;
    Card card45 = Card.baron;
    int i46 = card45.getCost();
    Card card47 = Card.ambassador;
    Card card48 = null;
    Card card49 = Card.feast;
    Card card50 = null;
    java.util.List<Card> list_card51 = gameBoard38.kingdomCards(card39, card40, card41, card43, card44, card45, card47, card48, card49, card50);
    GameBoard gameBoard56 = new GameBoard((int)(byte)1, 10);
    Player player57 = new Player("", (-1), gameBoard56);
    player35.buyCard(card39, gameBoard56);
    GameBoard gameBoard61 = new GameBoard(10, "hi!");
    player5.buyCard(card39, gameBoard61);
    java.util.List<Card> list_card63 = player5.getDiscard();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    org.junit.Assert.assertTrue("'" + card39 + "' != '" + Card.duchy + "'", card39.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.gold + "'", card40.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card41 + "' != '" + Card.baron + "'", card41.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 4);
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.silver + "'", card43.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.gold + "'", card44.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.baron + "'", card45.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4);
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.ambassador + "'", card47.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.feast + "'", card49.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    int i29 = player5.getNumActions();
    GameBoard gameBoard32 = new GameBoard((int)(byte)1, 10);
    Card card33 = Card.baron;
    boolean b34 = gameBoard32.placeEmbargo(card33);
    card33.setVictory((int)(short)0);
    int i37 = player5.getNumberInHand(card33);
    int i38 = player5.getNumActions();
    java.lang.String str39 = player5.getName();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.baron + "'", card33.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    GameBoard gameBoard4 = new GameBoard((int)(short)10, (int)(short)1);
    Player player5 = new Player("", (int)(short)-1, gameBoard4);
    int i7 = player5.getNumberInHand("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    java.util.List<java.lang.Integer> list_i6 = player5.getActionCardIndices();
    Card card7 = Card.baron;
    int i8 = card7.getCost();
    boolean b9 = player5.hasCard(card7);
    java.util.List<java.lang.Integer> list_i10 = player5.getActionCardIndices();
    java.util.LinkedList<Card> linkedlist_card11 = player5.getDeck();
    boolean b12 = player5.hasActionCard();
    java.util.List<Card> list_card13 = player5.getPlayedCards();
    boolean b14 = player5.hasActions();
    GameBoard gameBoard17 = new GameBoard((int)(byte)1, 10);
    Card card18 = Card.duchy;
    Card card19 = Card.gold;
    Card card20 = Card.baron;
    int i21 = card20.getCost();
    Card card22 = Card.silver;
    Card card23 = Card.gold;
    Card card24 = Card.baron;
    int i25 = card24.getCost();
    Card card26 = Card.ambassador;
    Card card27 = null;
    Card card28 = Card.feast;
    Card card29 = null;
    java.util.List<Card> list_card30 = gameBoard17.kingdomCards(card18, card19, card20, card22, card23, card24, card26, card27, card28, card29);
    int i31 = card22.getCost();
    boolean b32 = player5.hasCard(card22);
    Card card33 = player5.drawCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.baron + "'", card7.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedlist_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.duchy + "'", card18.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.gold + "'", card19.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.baron + "'", card20.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4);
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.silver + "'", card22.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card23 + "' != '" + Card.gold + "'", card23.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.baron + "'", card24.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4);
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.ambassador + "'", card26.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card28 + "' != '" + Card.feast + "'", card28.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    org.junit.Assert.assertTrue("'" + card33 + "' != '" + Card.copper + "'", card33.equals(Card.copper));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    player5.countTreasure();
    player5.initPlayerTurn();
    int i69 = player5.getTotalCards();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 11);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    boolean b67 = player5.hasActions();
    boolean b68 = player5.hasBuys();
    player5.countTreasure();
    GameBoard gameBoard72 = new GameBoard((int)'#', "hi!");
    Card card73 = Card.gardens;
    gameBoard72.takeCard(card73);
    int i75 = card73.getCost();
    player5.Discard(card73);
    card73.setVictory((int)(short)0);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.gardens + "'", card73.equals(Card.gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 4);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    boolean b37 = player5.hasActions();
    int i38 = player5.getTotalVictoryPoints();
    GameBoard gameBoard41 = new GameBoard((int)(byte)1, 10);
    Card card42 = Card.duchy;
    Card card43 = Card.gold;
    Card card44 = Card.baron;
    int i45 = card44.getCost();
    Card card46 = Card.silver;
    Card card47 = Card.gold;
    Card card48 = Card.baron;
    int i49 = card48.getCost();
    Card card50 = Card.ambassador;
    Card card51 = null;
    Card card52 = Card.feast;
    Card card53 = null;
    java.util.List<Card> list_card54 = gameBoard41.kingdomCards(card42, card43, card44, card46, card47, card48, card50, card51, card52, card53);
    int i55 = player5.getNumberInHand(card52);
    GameBoard gameBoard60 = new GameBoard((int)(byte)1, 10);
    Player player61 = new Player("", (-1), gameBoard60);
    GameBoard gameBoard64 = new GameBoard((int)(byte)1, 10);
    Card card65 = Card.duchy;
    Card card66 = Card.gold;
    Card card67 = Card.baron;
    int i68 = card67.getCost();
    Card card69 = Card.silver;
    Card card70 = Card.gold;
    Card card71 = Card.baron;
    int i72 = card71.getCost();
    Card card73 = Card.ambassador;
    Card card74 = null;
    Card card75 = Card.feast;
    Card card76 = null;
    java.util.List<Card> list_card77 = gameBoard64.kingdomCards(card65, card66, card67, card69, card70, card71, card73, card74, card75, card76);
    GameBoard gameBoard82 = new GameBoard((int)(byte)1, 10);
    Player player83 = new Player("", (-1), gameBoard82);
    player61.buyCard(card65, gameBoard82);
    GameBoard gameBoard87 = new GameBoard((int)'#', "hi!");
    player5.buyCard(card65, gameBoard87);
    gameBoard87.displayFinalScores();
    Card card90 = Card.embargo;
    gameBoard87.returnCard(card90);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    org.junit.Assert.assertTrue("'" + card42 + "' != '" + Card.duchy + "'", card42.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card43 + "' != '" + Card.gold + "'", card43.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card44 + "' != '" + Card.baron + "'", card44.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 4);
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.silver + "'", card46.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.gold + "'", card47.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card48 + "' != '" + Card.baron + "'", card48.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 4);
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.ambassador + "'", card50.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card52 + "' != '" + Card.feast + "'", card52.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    org.junit.Assert.assertTrue("'" + card65 + "' != '" + Card.duchy + "'", card65.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.gold + "'", card66.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card67 + "' != '" + Card.baron + "'", card67.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 4);
    org.junit.Assert.assertTrue("'" + card69 + "' != '" + Card.silver + "'", card69.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card70 + "' != '" + Card.gold + "'", card70.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card71 + "' != '" + Card.baron + "'", card71.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 4);
    org.junit.Assert.assertTrue("'" + card73 + "' != '" + Card.ambassador + "'", card73.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card75 + "' != '" + Card.feast + "'", card75.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    org.junit.Assert.assertTrue("'" + card90 + "' != '" + Card.embargo + "'", card90.equals(Card.embargo));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    java.util.List<Card> list_card3 = gameBoard2.getTrash();
    GameBoard gameBoard6 = new GameBoard((int)(byte)1, 10);
    Card card7 = Card.duchy;
    Card card8 = Card.gold;
    Card card9 = Card.baron;
    int i10 = card9.getCost();
    Card card11 = Card.silver;
    Card card12 = Card.gold;
    Card card13 = Card.baron;
    int i14 = card13.getCost();
    Card card15 = Card.ambassador;
    Card card16 = null;
    Card card17 = Card.feast;
    Card card18 = null;
    java.util.List<Card> list_card19 = gameBoard6.kingdomCards(card7, card8, card9, card11, card12, card13, card15, card16, card17, card18);
    int i20 = card11.getCost();
    boolean b21 = gameBoard2.hasCardsAvailable(card11);
    card11.setVictory((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.duchy + "'", card7.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.gold + "'", card8.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.baron + "'", card9.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.silver + "'", card11.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.gold + "'", card12.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.baron + "'", card13.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.ambassador + "'", card15.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.feast + "'", card17.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard29 = new GameBoard((int)(byte)1, 10);
    Card card30 = Card.duchy;
    Card card31 = Card.gold;
    Card card32 = Card.baron;
    int i33 = card32.getCost();
    Card card34 = Card.silver;
    Card card35 = Card.gold;
    Card card36 = Card.baron;
    int i37 = card36.getCost();
    Card card38 = Card.ambassador;
    Card card39 = null;
    Card card40 = Card.feast;
    Card card41 = null;
    java.util.List<Card> list_card42 = gameBoard29.kingdomCards(card30, card31, card32, card34, card35, card36, card38, card39, card40, card41);
    gameBoard26.trashCard(card35);
    boolean b44 = gameBoard2.placeEmbargo(card35);
    Card card45 = Card.remodel;
    java.util.List<java.lang.String> list_str46 = card45.getTypes();
    int i47 = gameBoard2.numCardsAvailable(card45);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card30 + "' != '" + Card.duchy + "'", card30.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card31 + "' != '" + Card.gold + "'", card31.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card32 + "' != '" + Card.baron + "'", card32.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 4);
    org.junit.Assert.assertTrue("'" + card34 + "' != '" + Card.silver + "'", card34.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.gold + "'", card35.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card36 + "' != '" + Card.baron + "'", card36.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 4);
    org.junit.Assert.assertTrue("'" + card38 + "' != '" + Card.ambassador + "'", card38.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card40 + "' != '" + Card.feast + "'", card40.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.remodel + "'", card45.equals(Card.remodel));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 10);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.duchy;
    Card card7 = Card.gold;
    Card card8 = Card.baron;
    int i9 = card8.getCost();
    Card card10 = Card.silver;
    Card card11 = Card.gold;
    Card card12 = Card.baron;
    int i13 = card12.getCost();
    Card card14 = Card.ambassador;
    Card card15 = null;
    Card card16 = Card.feast;
    Card card17 = null;
    java.util.List<Card> list_card18 = gameBoard5.kingdomCards(card6, card7, card8, card10, card11, card12, card14, card15, card16, card17);
    gameBoard2.trashCard(card11);
    java.util.List<Card> list_card20 = gameBoard2.getAllKingdomCards();
    java.util.List<Player> list_player21 = gameBoard2.getPlayers();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.duchy + "'", card6.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card7 + "' != '" + Card.gold + "'", card7.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card8 + "' != '" + Card.baron + "'", card8.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.silver + "'", card10.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.gold + "'", card11.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.ambassador + "'", card14.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.feast + "'", card16.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player21);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    GameBoard gameBoard2 = new GameBoard((int)(byte)10, (int)(byte)0);
    Card card3 = Card.copper;
    gameBoard2.returnCard(card3);
    gameBoard2.opponentDraw((int)(byte)100);
    org.junit.Assert.assertTrue("'" + card3 + "' != '" + Card.copper + "'", card3.equals(Card.copper));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    GameBoard gameBoard26 = new GameBoard((int)(byte)1, 10);
    Player player27 = new Player("", (-1), gameBoard26);
    player5.buyCard(card9, gameBoard26);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    Card card35 = Card.baron;
    GameBoard gameBoard40 = new GameBoard((int)(byte)1, 10);
    Player player41 = new Player("", (-1), gameBoard40);
    GameBoard gameBoard44 = new GameBoard((int)(byte)1, 10);
    Card card45 = Card.duchy;
    Card card46 = Card.gold;
    Card card47 = Card.baron;
    int i48 = card47.getCost();
    Card card49 = Card.silver;
    Card card50 = Card.gold;
    Card card51 = Card.baron;
    int i52 = card51.getCost();
    Card card53 = Card.ambassador;
    Card card54 = null;
    Card card55 = Card.feast;
    Card card56 = null;
    java.util.List<Card> list_card57 = gameBoard44.kingdomCards(card45, card46, card47, card49, card50, card51, card53, card54, card55, card56);
    GameBoard gameBoard62 = new GameBoard((int)(byte)1, 10);
    Player player63 = new Player("", (-1), gameBoard62);
    player41.buyCard(card45, gameBoard62);
    player34.gainCard(card35, gameBoard62);
    player5.Discard(card35);
    int i68 = player5.getNumberInHand("");
    boolean b69 = player5.hasBuys();
    boolean b70 = player5.hasBuys();
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    org.junit.Assert.assertTrue("'" + card35 + "' != '" + Card.baron + "'", card35.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.duchy + "'", card45.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card46 + "' != '" + Card.gold + "'", card46.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card47 + "' != '" + Card.baron + "'", card47.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);
    org.junit.Assert.assertTrue("'" + card49 + "' != '" + Card.silver + "'", card49.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card50 + "' != '" + Card.gold + "'", card50.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card51 + "' != '" + Card.baron + "'", card51.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 4);
    org.junit.Assert.assertTrue("'" + card53 + "' != '" + Card.ambassador + "'", card53.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card55 + "' != '" + Card.feast + "'", card55.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard8 = new GameBoard((int)(byte)1, 10);
    Card card9 = Card.duchy;
    Card card10 = Card.gold;
    Card card11 = Card.baron;
    int i12 = card11.getCost();
    Card card13 = Card.silver;
    Card card14 = Card.gold;
    Card card15 = Card.baron;
    int i16 = card15.getCost();
    Card card17 = Card.ambassador;
    Card card18 = null;
    Card card19 = Card.feast;
    Card card20 = null;
    java.util.List<Card> list_card21 = gameBoard8.kingdomCards(card9, card10, card11, card13, card14, card15, card17, card18, card19, card20);
    gameBoard5.trashCard(card14);
    gameBoard2.returnCard(card14);
    int i24 = card14.getVictory();
    card14.setVictory((int)(byte)10);
    org.junit.Assert.assertTrue("'" + card9 + "' != '" + Card.duchy + "'", card9.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card10 + "' != '" + Card.gold + "'", card10.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card11 + "' != '" + Card.baron + "'", card11.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    org.junit.Assert.assertTrue("'" + card13 + "' != '" + Card.silver + "'", card13.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card14 + "' != '" + Card.gold + "'", card14.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card15 + "' != '" + Card.baron + "'", card15.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.ambassador + "'", card17.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card19 + "' != '" + Card.feast + "'", card19.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', (int)(short)0);
    java.util.List<Card> list_card4 = gameBoard2.getPurchaseableCards((int)'#');
    int i5 = gameBoard2.getTotalEmbargoTokens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    GameBoard gameBoard2 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard5 = new GameBoard((int)(byte)1, 10);
    Card card6 = Card.baron;
    boolean b7 = gameBoard5.placeEmbargo(card6);
    gameBoard2.takeCard(card6);
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Card card12 = Card.baron;
    boolean b13 = gameBoard11.placeEmbargo(card12);
    card12.setVictory((int)(short)0);
    boolean b16 = gameBoard2.placeEmbargo(card12);
    java.util.List<Card> list_card18 = gameBoard2.kingdomCards((int)(short)0);
    gameBoard2.displayFinalScores();
    java.util.List<Player> list_player20 = gameBoard2.getPlayers();
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + card12 + "' != '" + Card.baron + "'", card12.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player20);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    GameBoard gameBoard4 = new GameBoard((int)(byte)1, 10);
    Player player5 = new Player("", (-1), gameBoard4);
    Card card6 = Card.baron;
    GameBoard gameBoard11 = new GameBoard((int)(byte)1, 10);
    Player player12 = new Player("", (-1), gameBoard11);
    GameBoard gameBoard15 = new GameBoard((int)(byte)1, 10);
    Card card16 = Card.duchy;
    Card card17 = Card.gold;
    Card card18 = Card.baron;
    int i19 = card18.getCost();
    Card card20 = Card.silver;
    Card card21 = Card.gold;
    Card card22 = Card.baron;
    int i23 = card22.getCost();
    Card card24 = Card.ambassador;
    Card card25 = null;
    Card card26 = Card.feast;
    Card card27 = null;
    java.util.List<Card> list_card28 = gameBoard15.kingdomCards(card16, card17, card18, card20, card21, card22, card24, card25, card26, card27);
    GameBoard gameBoard33 = new GameBoard((int)(byte)1, 10);
    Player player34 = new Player("", (-1), gameBoard33);
    player12.buyCard(card16, gameBoard33);
    player5.gainCard(card6, gameBoard33);
    int i37 = player5.getNum();
    boolean b38 = player5.hasActions();
    GameBoard gameBoard43 = new GameBoard((int)(short)10, (int)(short)1);
    Player player44 = new Player("", (int)(short)-1, gameBoard43);
    Card card45 = Card.gold;
    player44.Discard(card45);
    GameBoard gameBoard49 = new GameBoard((int)'#', "hi!");
    GameBoard gameBoard52 = new GameBoard((int)(byte)1, 10);
    GameBoard gameBoard55 = new GameBoard((int)(byte)1, 10);
    Card card56 = Card.duchy;
    Card card57 = Card.gold;
    Card card58 = Card.baron;
    int i59 = card58.getCost();
    Card card60 = Card.silver;
    Card card61 = Card.gold;
    Card card62 = Card.baron;
    int i63 = card62.getCost();
    Card card64 = Card.ambassador;
    Card card65 = null;
    Card card66 = Card.feast;
    Card card67 = null;
    java.util.List<Card> list_card68 = gameBoard55.kingdomCards(card56, card57, card58, card60, card61, card62, card64, card65, card66, card67);
    gameBoard52.trashCard(card61);
    gameBoard49.returnCard(card61);
    java.util.List<Card> list_card71 = gameBoard49.getAllKingdomCards();
    player5.buyCard(card45, gameBoard49);
    org.junit.Assert.assertTrue("'" + card6 + "' != '" + Card.baron + "'", card6.equals(Card.baron));
    org.junit.Assert.assertTrue("'" + card16 + "' != '" + Card.duchy + "'", card16.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card17 + "' != '" + Card.gold + "'", card17.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card18 + "' != '" + Card.baron + "'", card18.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);
    org.junit.Assert.assertTrue("'" + card20 + "' != '" + Card.silver + "'", card20.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card21 + "' != '" + Card.gold + "'", card21.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card22 + "' != '" + Card.baron + "'", card22.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    org.junit.Assert.assertTrue("'" + card24 + "' != '" + Card.ambassador + "'", card24.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card26 + "' != '" + Card.feast + "'", card26.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    org.junit.Assert.assertTrue("'" + card45 + "' != '" + Card.gold + "'", card45.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card56 + "' != '" + Card.duchy + "'", card56.equals(Card.duchy));
    org.junit.Assert.assertTrue("'" + card57 + "' != '" + Card.gold + "'", card57.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card58 + "' != '" + Card.baron + "'", card58.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 4);
    org.junit.Assert.assertTrue("'" + card60 + "' != '" + Card.silver + "'", card60.equals(Card.silver));
    org.junit.Assert.assertTrue("'" + card61 + "' != '" + Card.gold + "'", card61.equals(Card.gold));
    org.junit.Assert.assertTrue("'" + card62 + "' != '" + Card.baron + "'", card62.equals(Card.baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 4);
    org.junit.Assert.assertTrue("'" + card64 + "' != '" + Card.ambassador + "'", card64.equals(Card.ambassador));
    org.junit.Assert.assertTrue("'" + card66 + "' != '" + Card.feast + "'", card66.equals(Card.feast));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);

  }

}
