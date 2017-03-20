
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    java.lang.Object obj4 = null;
    boolean b5 = card3.equals(obj4);
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard(list_card6, cardName8);
    int i10 = card3.compareTo(card9);
    
    // Checks the contract:  equals-hashcode on list_card6 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card6 and list_card0", list_card6.equals(list_card0) ? list_card6.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    java.lang.Object obj4 = null;
    boolean b5 = card3.equals(obj4);
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard(list_card6, cardName8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    org.cs362.dominion.Card[] card_array11 = new org.cs362.dominion.Card[] { card3, card9 };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card12, card_array11);
    org.cs362.dominion.Card.CardName cardName14 = null;
    org.cs362.dominion.Card card15 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card12, cardName14);
    
    // Checks the contract:  equals-hashcode on list_card0 and list_card6
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card0 and list_card6", list_card0.equals(list_card6) ? list_card0.hashCode() == list_card6.hashCode() : true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    int i4 = card3.getCost();
    int i5 = card3.getTreasureValue();
    int i6 = card3.getCost();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card.CardName cardName9 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card10 = org.cs362.dominion.Card.getCard(list_card7, cardName9);
    java.lang.Object obj11 = null;
    boolean b12 = card10.equals(obj11);
    int i13 = card10.getCost();
    int i14 = card3.compareTo(card10);
    
    // Checks the contract:  equals-hashcode on list_card7 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card7 and list_card0", list_card7.equals(list_card0) ? list_card7.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    int i4 = card3.getCost();
    int i5 = card3.getTreasureValue();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard(list_card6, cardName8);
    java.lang.Object obj10 = null;
    boolean b11 = card9.equals(obj10);
    int i12 = card9.getCost();
    java.lang.String str13 = card9.toString();
    int i14 = card3.compareTo(card9);
    
    // Checks the contract:  equals-hashcode on list_card6 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card6 and list_card0", list_card6.equals(list_card0) ? list_card6.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    org.cs362.dominion.Card.Type type4 = card3.getType();
    org.cs362.dominion.Card.CardName cardName5 = card3.getCardName();
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    org.cs362.dominion.GameState gameState10 = null;
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState10, "hi!");
    java.lang.String str13 = player12.toString();
    org.cs362.dominion.Player[] player_array14 = new org.cs362.dominion.Player[] { player12 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player15 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player15, player_array14);
    gameState9.players = arraylist_player15;
    org.cs362.dominion.Player player19 = new org.cs362.dominion.Player(gameState9, "hi!");
    gameState9.initializeGame();
    org.cs362.dominion.GameState gameState21 = null;
    org.cs362.dominion.Player player23 = new org.cs362.dominion.Player(gameState21, "hi!");
    gameState9.addPlayer(player23);
    java.util.List<org.cs362.dominion.Card> list_card25 = gameState9.cards;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState9.cards;
    java.lang.String str27 = gameState9.toString();
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card29);
    org.cs362.dominion.Card.Type type32 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card29, type32);
    gameState9.cards = list_card33;
    org.cs362.dominion.GameState gameState35 = new org.cs362.dominion.GameState(list_card33);
    gameState35.initializeGame();
    java.util.List<org.cs362.dominion.Card> list_card37 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card[] card_array38 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card39, card_array38);
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card39);
    org.cs362.dominion.Card.Type type42 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card39, type42);
    org.cs362.dominion.Card.Type type44 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card39, type44);
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card37, type44);
    gameState35.cards = list_card46;
    org.cs362.dominion.GameState gameState48 = gameState35.clone();
    boolean b49 = card3.equals((java.lang.Object)gameState35);
    
    // Checks the contract:  equals-hashcode on list_card37 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card37 and list_card0", list_card37.equals(list_card0) ? list_card37.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState3.play();
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState3, "hi!");
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    org.cs362.dominion.GameState gameState19 = null;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState19, "hi!");
    java.lang.String str22 = player21.toString();
    org.cs362.dominion.Player[] player_array23 = new org.cs362.dominion.Player[] { player21 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player24 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player24, player_array23);
    gameState18.players = arraylist_player24;
    org.cs362.dominion.Player player28 = new org.cs362.dominion.Player(gameState18, "hi!");
    gameState18.initializeGame();
    org.cs362.dominion.GameState gameState30 = null;
    org.cs362.dominion.Player player32 = new org.cs362.dominion.Player(gameState30, "hi!");
    gameState18.addPlayer(player32);
    player32.playKingdomCard();
    gameState3.addPlayer(player32);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i36 = gameState3.getWinners();
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card38);
    java.lang.String str41 = gameState40.toString();
    org.cs362.dominion.Card[] card_array42 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card43 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card43, card_array42);
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card43);
    java.lang.String str46 = gameState45.toString();
    java.util.List<org.cs362.dominion.Card> list_card47 = gameState45.cards;
    boolean b48 = gameState45.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    org.cs362.dominion.GameState gameState53 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card51);
    org.cs362.dominion.Card.Type type54 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card55 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card51, type54);
    org.cs362.dominion.Card.Type type56 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card57 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card51, type56);
    java.util.List<org.cs362.dominion.Card> list_card58 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card49, type56);
    gameState45.cards = list_card58;
    gameState40.cards = list_card58;
    org.cs362.dominion.Player player62 = new org.cs362.dominion.Player(gameState40, "The board game is embty you need to intialize the game!!!!");
    gameState3.addPlayer(player62);
    java.util.List<org.cs362.dominion.Card> list_card64 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState65 = new org.cs362.dominion.GameState(list_card64);
    org.cs362.dominion.Card.CardName cardName66 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card67 = org.cs362.dominion.Card.getCard(list_card64, cardName66);
    int i68 = card67.getCost();
    int i69 = card67.getTreasureValue();
    org.cs362.dominion.Card.CardName cardName70 = card67.getCardName();
    player62.discard(card67);
    
    // Checks the contract:  equals-hashcode on list_card64 and list_card49
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card64 and list_card49", list_card64.equals(list_card49) ? list_card64.hashCode() == list_card49.hashCode() : true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    org.cs362.dominion.Card.Type type4 = card3.getType();
    org.cs362.dominion.Card.CardName cardName5 = card3.getCardName();
    org.cs362.dominion.Card.Type type6 = card3.getType();
    int i7 = card3.getCost();
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    org.cs362.dominion.GameState gameState12 = null;
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "hi!");
    java.lang.String str15 = player14.toString();
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] { player14 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState11.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState11, "hi!");
    gameState11.initializeGame();
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    gameState11.cards = arraylist_card24;
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card24);
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card29);
    org.cs362.dominion.GameState gameState32 = null;
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState32, "hi!");
    java.lang.String str35 = player34.toString();
    org.cs362.dominion.Player[] player_array36 = new org.cs362.dominion.Player[] { player34 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player37 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player37, player_array36);
    gameState31.players = arraylist_player37;
    org.cs362.dominion.Player player41 = new org.cs362.dominion.Player(gameState31, "hi!");
    player41.playTtreasureCard();
    player41.playKingdomCard();
    gameState27.addPlayer(player41);
    java.lang.String str45 = player41.toString();
    org.cs362.dominion.Card card46 = null;
    player41.discard(card46);
    org.cs362.dominion.Card[] card_array48 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card49 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card49, card_array48);
    org.cs362.dominion.GameState gameState51 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card49);
    java.lang.String str52 = gameState51.toString();
    org.cs362.dominion.Card[] card_array53 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card54 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card54, card_array53);
    org.cs362.dominion.GameState gameState56 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card54);
    java.lang.String str57 = gameState56.toString();
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState56.cards;
    boolean b59 = gameState56.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card60 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card[] card_array61 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card62 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card62, card_array61);
    org.cs362.dominion.GameState gameState64 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card62);
    org.cs362.dominion.Card.Type type65 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card66 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card62, type65);
    org.cs362.dominion.Card.Type type67 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card68 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card62, type67);
    java.util.List<org.cs362.dominion.Card> list_card69 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card60, type67);
    gameState56.cards = list_card69;
    gameState51.cards = list_card69;
    org.cs362.dominion.Player player73 = new org.cs362.dominion.Player(gameState51, "The board game is embty you need to intialize the game!!!!");
    card3.play(player41, gameState51);
    
    // Checks the contract:  equals-hashcode on list_card0 and list_card60
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card0 and list_card60", list_card0.equals(list_card60) ? list_card0.hashCode() == list_card60.hashCode() : true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    int i4 = card3.getCost();
    int i5 = card3.getTreasureValue();
    org.cs362.dominion.Card.CardName cardName6 = card3.getCardName();
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card8);
    java.lang.String str11 = gameState10.toString();
    java.util.List<org.cs362.dominion.Card> list_card12 = gameState10.cards;
    org.cs362.dominion.Card.Type type13 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type13);
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState15, "hi!");
    player17.playTtreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    org.cs362.dominion.GameState gameState25 = null;
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    java.lang.String str28 = player27.toString();
    org.cs362.dominion.Player[] player_array29 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player30 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player30, player_array29);
    gameState24.players = arraylist_player30;
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState24, "hi!");
    gameState24.initializeGame();
    org.cs362.dominion.Card[] card_array36 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card37 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card37, card_array36);
    gameState24.cards = arraylist_card37;
    gameState24.initializeGame();
    org.cs362.dominion.Card[] card_array41 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card42 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card42, card_array41);
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card42);
    org.cs362.dominion.GameState gameState45 = null;
    org.cs362.dominion.Player player47 = new org.cs362.dominion.Player(gameState45, "hi!");
    java.lang.String str48 = player47.toString();
    org.cs362.dominion.Player[] player_array49 = new org.cs362.dominion.Player[] { player47 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player50 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player50, player_array49);
    gameState44.players = arraylist_player50;
    org.cs362.dominion.Player player54 = new org.cs362.dominion.Player(gameState44, "hi!");
    player54.playTtreasureCard();
    gameState24.addPlayer(player54);
    gameState20.addPlayer(player54);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i58 = gameState20.gameBoard;
    card3.play(player17, gameState20);
    
    // Checks the contract:  equals-hashcode on list_card0 and list_card19
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card0 and list_card19", list_card0.equals(list_card19) ? list_card0.hashCode() == list_card19.hashCode() : true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    gameState3.initializeGame();
    org.cs362.dominion.GameState gameState15 = null;
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState15, "hi!");
    gameState3.addPlayer(player17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    org.cs362.dominion.GameState gameState22 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card20);
    org.cs362.dominion.GameState gameState23 = null;
    org.cs362.dominion.Player player25 = new org.cs362.dominion.Player(gameState23, "hi!");
    java.lang.String str26 = player25.toString();
    org.cs362.dominion.Player[] player_array27 = new org.cs362.dominion.Player[] { player25 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player28 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player28, player_array27);
    gameState22.players = arraylist_player28;
    org.cs362.dominion.Player player32 = new org.cs362.dominion.Player(gameState22, "hi!");
    gameState22.initializeGame();
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState22.cards = arraylist_card35;
    gameState22.initializeGame();
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card40);
    org.cs362.dominion.GameState gameState43 = null;
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState43, "hi!");
    java.lang.String str46 = player45.toString();
    org.cs362.dominion.Player[] player_array47 = new org.cs362.dominion.Player[] { player45 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player48 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player48, player_array47);
    gameState42.players = arraylist_player48;
    org.cs362.dominion.Player player52 = new org.cs362.dominion.Player(gameState42, "hi!");
    player52.playTtreasureCard();
    gameState22.addPlayer(player52);
    gameState3.addPlayer(player52);
    player52.printStateGame();
    player52.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card58 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Card.CardName cardName60 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card61 = org.cs362.dominion.Card.getCard(list_card58, cardName60);
    org.cs362.dominion.Card.Type type62 = card61.getType();
    player52.discard(card61);
    org.cs362.dominion.Card[] card_array64 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card65 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card65, card_array64);
    org.cs362.dominion.GameState gameState67 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card65);
    org.cs362.dominion.GameState gameState68 = null;
    org.cs362.dominion.Player player70 = new org.cs362.dominion.Player(gameState68, "hi!");
    java.lang.String str71 = player70.toString();
    org.cs362.dominion.Player[] player_array72 = new org.cs362.dominion.Player[] { player70 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player73 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player73, player_array72);
    gameState67.players = arraylist_player73;
    org.cs362.dominion.Player player77 = new org.cs362.dominion.Player(gameState67, "hi!");
    java.lang.String str78 = gameState67.toString();
    org.cs362.dominion.Player player80 = new org.cs362.dominion.Player(gameState67, "The board game is embty you need to intialize the game!!!!");
    java.util.List<org.cs362.dominion.Card> list_card81 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card[] card_array82 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card83 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b84 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card83, card_array82);
    org.cs362.dominion.GameState gameState85 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card83);
    java.lang.String str86 = gameState85.toString();
    java.util.List<org.cs362.dominion.Card> list_card87 = gameState85.cards;
    org.cs362.dominion.Card.Type type88 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card89 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card87, type88);
    java.util.List<org.cs362.dominion.Card> list_card90 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card81, type88);
    org.cs362.dominion.GameState gameState91 = new org.cs362.dominion.GameState(list_card81);
    org.cs362.dominion.GameState gameState92 = gameState91.clone();
    card61.play(player80, gameState91);
    
    // Checks the contract:  equals-hashcode on list_card81 and list_card58
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card81 and list_card58", list_card81.equals(list_card58) ? list_card81.hashCode() == list_card58.hashCode() : true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    int i4 = card3.getCost();
    org.cs362.dominion.Card.Type type5 = card3.getType();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card9 = org.cs362.dominion.Card.getCard(list_card6, cardName8);
    org.cs362.dominion.Card.CardName cardName10 = card9.getCardName();
    int i11 = card9.getTreasureValue();
    int i12 = card3.compareTo(card9);
    
    // Checks the contract:  equals-hashcode on list_card6 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card6 and list_card0", list_card6.equals(list_card0) ? list_card6.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    gameState3.initializeGame();
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    gameState3.cards = arraylist_card16;
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card21);
    org.cs362.dominion.GameState gameState24 = null;
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "hi!");
    java.lang.String str27 = player26.toString();
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player26 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState23.players = arraylist_player29;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i32 = gameState23.play();
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState23, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i35 = gameState23.play();
    org.cs362.dominion.Player player37 = new org.cs362.dominion.Player(gameState23, "");
    org.cs362.dominion.Card[] card_array38 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card39, card_array38);
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card39);
    org.cs362.dominion.GameState gameState42 = null;
    org.cs362.dominion.Player player44 = new org.cs362.dominion.Player(gameState42, "hi!");
    java.lang.String str45 = player44.toString();
    org.cs362.dominion.Player[] player_array46 = new org.cs362.dominion.Player[] { player44 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player47 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player47, player_array46);
    gameState41.players = arraylist_player47;
    org.cs362.dominion.Player player51 = new org.cs362.dominion.Player(gameState41, "hi!");
    java.lang.String str52 = gameState41.toString();
    org.cs362.dominion.Player player54 = new org.cs362.dominion.Player(gameState41, "The board game is embty you need to intialize the game!!!!");
    gameState23.addPlayer(player54);
    gameState19.addPlayer(player54);
    java.util.List<org.cs362.dominion.Card> list_card57 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState58 = new org.cs362.dominion.GameState(list_card57);
    org.cs362.dominion.Card.CardName cardName59 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card60 = org.cs362.dominion.Card.getCard(list_card57, cardName59);
    player54.discard(card60);
    int i62 = card60.getTreasureValue();
    java.util.List<org.cs362.dominion.Card> list_card63 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState64 = new org.cs362.dominion.GameState(list_card63);
    org.cs362.dominion.Card.CardName cardName65 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card66 = org.cs362.dominion.Card.getCard(list_card63, cardName65);
    int i67 = card66.getCost();
    int i68 = card66.getTreasureValue();
    int i69 = card66.getCost();
    int i70 = card66.getCost();
    int i71 = card60.compareTo(card66);
    
    // Checks the contract:  equals-hashcode on list_card63 and list_card57
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card63 and list_card57", list_card63.equals(list_card57) ? list_card63.hashCode() == list_card57.hashCode() : true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    gameState3.initializeGame();
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    gameState3.cards = arraylist_card16;
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card16);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card21);
    org.cs362.dominion.GameState gameState24 = null;
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "hi!");
    java.lang.String str27 = player26.toString();
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player26 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState23.players = arraylist_player29;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i32 = gameState23.play();
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState23, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i35 = gameState23.play();
    org.cs362.dominion.Player player37 = new org.cs362.dominion.Player(gameState23, "");
    org.cs362.dominion.Card[] card_array38 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card39, card_array38);
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card39);
    org.cs362.dominion.GameState gameState42 = null;
    org.cs362.dominion.Player player44 = new org.cs362.dominion.Player(gameState42, "hi!");
    java.lang.String str45 = player44.toString();
    org.cs362.dominion.Player[] player_array46 = new org.cs362.dominion.Player[] { player44 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player47 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player47, player_array46);
    gameState41.players = arraylist_player47;
    org.cs362.dominion.Player player51 = new org.cs362.dominion.Player(gameState41, "hi!");
    java.lang.String str52 = gameState41.toString();
    org.cs362.dominion.Player player54 = new org.cs362.dominion.Player(gameState41, "The board game is embty you need to intialize the game!!!!");
    gameState23.addPlayer(player54);
    gameState19.addPlayer(player54);
    java.util.List<org.cs362.dominion.Card> list_card57 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState58 = new org.cs362.dominion.GameState(list_card57);
    org.cs362.dominion.Card.CardName cardName59 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card60 = org.cs362.dominion.Card.getCard(list_card57, cardName59);
    player54.discard(card60);
    int i62 = card60.getTreasureValue();
    java.util.List<org.cs362.dominion.Card> list_card63 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState64 = new org.cs362.dominion.GameState(list_card63);
    org.cs362.dominion.Card.CardName cardName65 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card66 = org.cs362.dominion.Card.getCard(list_card63, cardName65);
    java.lang.Object obj67 = null;
    boolean b68 = card66.equals(obj67);
    int i69 = card66.getCost();
    java.lang.String str70 = card66.toString();
    java.lang.String str71 = card66.toString();
    int i72 = card60.compareTo(card66);
    
    // Checks the contract:  equals-hashcode on list_card57 and list_card63
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card57 and list_card63", list_card57.equals(list_card63) ? list_card57.hashCode() == list_card63.hashCode() : true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    java.lang.Object obj4 = null;
    boolean b5 = card3.equals(obj4);
    int i6 = card3.score();
    java.lang.String str7 = card3.toString();
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card11 = org.cs362.dominion.Card.getCard(list_card8, cardName10);
    int i12 = card3.compareTo(card11);
    
    // Checks the contract:  equals-hashcode on list_card0 and list_card8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card0 and list_card8", list_card0.equals(list_card8) ? list_card0.hashCode() == list_card8.hashCode() : true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    gameState3.initializeGame();
    org.cs362.dominion.GameState gameState15 = null;
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState15, "hi!");
    gameState3.addPlayer(player17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    org.cs362.dominion.GameState gameState22 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card20);
    org.cs362.dominion.GameState gameState23 = null;
    org.cs362.dominion.Player player25 = new org.cs362.dominion.Player(gameState23, "hi!");
    java.lang.String str26 = player25.toString();
    org.cs362.dominion.Player[] player_array27 = new org.cs362.dominion.Player[] { player25 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player28 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player28, player_array27);
    gameState22.players = arraylist_player28;
    org.cs362.dominion.Player player32 = new org.cs362.dominion.Player(gameState22, "hi!");
    gameState22.initializeGame();
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState22.cards = arraylist_card35;
    gameState22.initializeGame();
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card40);
    org.cs362.dominion.GameState gameState43 = null;
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState43, "hi!");
    java.lang.String str46 = player45.toString();
    org.cs362.dominion.Player[] player_array47 = new org.cs362.dominion.Player[] { player45 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player48 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player48, player_array47);
    gameState42.players = arraylist_player48;
    org.cs362.dominion.Player player52 = new org.cs362.dominion.Player(gameState42, "hi!");
    player52.playTtreasureCard();
    gameState22.addPlayer(player52);
    gameState3.addPlayer(player52);
    player52.printStateGame();
    player52.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card58 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Card.CardName cardName60 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card61 = org.cs362.dominion.Card.getCard(list_card58, cardName60);
    org.cs362.dominion.Card.Type type62 = card61.getType();
    player52.discard(card61);
    java.util.List<org.cs362.dominion.Card> list_card64 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState65 = new org.cs362.dominion.GameState(list_card64);
    org.cs362.dominion.Card.CardName cardName66 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card67 = org.cs362.dominion.Card.getCard(list_card64, cardName66);
    java.lang.Object obj68 = null;
    boolean b69 = card67.equals(obj68);
    int i70 = card67.getCost();
    java.lang.String str71 = card67.toString();
    java.lang.String str72 = card67.toString();
    org.cs362.dominion.Card.Type type73 = card67.getType();
    int i74 = card61.compareTo(card67);
    
    // Checks the contract:  equals-hashcode on list_card64 and list_card58
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card64 and list_card58", list_card64.equals(list_card58) ? list_card64.hashCode() == list_card58.hashCode() : true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    gameState3.initializeGame();
    org.cs362.dominion.GameState gameState15 = null;
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState15, "hi!");
    gameState3.addPlayer(player17);
    java.util.List<org.cs362.dominion.Card> list_card19 = gameState3.cards;
    java.util.List<org.cs362.dominion.Card> list_card20 = gameState3.cards;
    java.lang.String str21 = gameState3.toString();
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card23);
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card23, type26);
    gameState3.cards = list_card27;
    org.cs362.dominion.GameState gameState29 = new org.cs362.dominion.GameState(list_card27);
    gameState29.initializeGame();
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card[] card_array32 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33, card_array32);
    org.cs362.dominion.GameState gameState35 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card33);
    org.cs362.dominion.Card.Type type36 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card37 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card33, type36);
    org.cs362.dominion.Card.Type type38 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card39 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card33, type38);
    java.util.List<org.cs362.dominion.Card> list_card40 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type38);
    gameState29.cards = list_card40;
    org.cs362.dominion.GameState gameState42 = gameState29.clone();
    java.util.List<org.cs362.dominion.Card> list_card43 = gameState29.cards;
    org.cs362.dominion.Card[] card_array44 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card45 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card45, card_array44);
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card45);
    java.lang.String str48 = gameState47.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i49 = gameState47.getWinners();
    org.cs362.dominion.GameState gameState50 = gameState47.clone();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState47.gameBoard;
    org.cs362.dominion.Card[] card_array52 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card53 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card53, card_array52);
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card53);
    org.cs362.dominion.GameState gameState56 = null;
    org.cs362.dominion.Player player58 = new org.cs362.dominion.Player(gameState56, "hi!");
    java.lang.String str59 = player58.toString();
    org.cs362.dominion.Player[] player_array60 = new org.cs362.dominion.Player[] { player58 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player61 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player61, player_array60);
    gameState55.players = arraylist_player61;
    org.cs362.dominion.Player player65 = new org.cs362.dominion.Player(gameState55, "hi!");
    player65.playTtreasureCard();
    player65.playKingdomCard();
    org.cs362.dominion.Card card68 = null;
    player65.discard(card68);
    player65.playTtreasureCard();
    player65.buyCard();
    player65.printStateGame();
    gameState47.addPlayer(player65);
    java.util.List<org.cs362.dominion.Card> list_card74 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState75 = new org.cs362.dominion.GameState(list_card74);
    org.cs362.dominion.Card.CardName cardName76 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card77 = org.cs362.dominion.Card.getCard(list_card74, cardName76);
    org.cs362.dominion.Card.Type type78 = card77.getType();
    org.cs362.dominion.Card.CardName cardName79 = card77.getCardName();
    player65.discard(card77);
    java.lang.String str81 = player65.toString();
    gameState29.addPlayer(player65);
    
    // Checks the contract:  equals-hashcode on list_card31 and list_card74
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card31 and list_card74", list_card31.equals(list_card74) ? list_card31.hashCode() == list_card74.hashCode() : true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    java.lang.String str4 = gameState3.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState3.getWinners();
    org.cs362.dominion.GameState gameState6 = gameState3.clone();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState3.gameBoard;
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    org.cs362.dominion.GameState gameState12 = null;
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "hi!");
    java.lang.String str15 = player14.toString();
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] { player14 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState11.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState11, "hi!");
    player21.playTtreasureCard();
    player21.playKingdomCard();
    org.cs362.dominion.Card card24 = null;
    player21.discard(card24);
    player21.playTtreasureCard();
    player21.buyCard();
    player21.printStateGame();
    gameState3.addPlayer(player21);
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card.CardName cardName32 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card33 = org.cs362.dominion.Card.getCard(list_card30, cardName32);
    org.cs362.dominion.Card.Type type34 = card33.getType();
    org.cs362.dominion.Card.CardName cardName35 = card33.getCardName();
    player21.discard(card33);
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card38);
    org.cs362.dominion.GameState gameState41 = null;
    org.cs362.dominion.Player player43 = new org.cs362.dominion.Player(gameState41, "hi!");
    java.lang.String str44 = player43.toString();
    org.cs362.dominion.Player[] player_array45 = new org.cs362.dominion.Player[] { player43 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player46 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player46, player_array45);
    gameState40.players = arraylist_player46;
    org.cs362.dominion.Player player50 = new org.cs362.dominion.Player(gameState40, "hi!");
    player50.playKingdomCard();
    java.util.List<org.cs362.dominion.Card> list_card52 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState53 = new org.cs362.dominion.GameState(list_card52);
    org.cs362.dominion.Card.CardName cardName54 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card55 = org.cs362.dominion.Card.getCard(list_card52, cardName54);
    org.cs362.dominion.Card.Type type56 = card55.getType();
    org.cs362.dominion.Card.CardName cardName57 = card55.getCardName();
    org.cs362.dominion.Card.Type type58 = card55.getType();
    int i59 = card55.getCost();
    player50.discard(card55);
    org.cs362.dominion.Card[] card_array61 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card62 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card62, card_array61);
    org.cs362.dominion.GameState gameState64 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card62);
    org.cs362.dominion.GameState gameState65 = null;
    org.cs362.dominion.Player player67 = new org.cs362.dominion.Player(gameState65, "hi!");
    java.lang.String str68 = player67.toString();
    org.cs362.dominion.Player[] player_array69 = new org.cs362.dominion.Player[] { player67 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player70 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player70, player_array69);
    gameState64.players = arraylist_player70;
    org.cs362.dominion.Player player74 = new org.cs362.dominion.Player(gameState64, "hi!");
    gameState64.initializeGame();
    org.cs362.dominion.GameState gameState76 = null;
    org.cs362.dominion.Player player78 = new org.cs362.dominion.Player(gameState76, "hi!");
    gameState64.addPlayer(player78);
    java.util.List<org.cs362.dominion.Card> list_card80 = gameState64.cards;
    java.util.List<org.cs362.dominion.Card> list_card81 = gameState64.cards;
    java.lang.String str82 = gameState64.toString();
    org.cs362.dominion.Card[] card_array83 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card84 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card84, card_array83);
    org.cs362.dominion.GameState gameState86 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card84);
    org.cs362.dominion.Card.Type type87 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card88 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card84, type87);
    gameState64.cards = list_card88;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i90 = gameState64.gameBoard;
    card33.play(player50, gameState64);
    
    // Checks the contract:  equals-hashcode on list_card30 and list_card52
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card30 and list_card52", list_card30.equals(list_card52) ? list_card30.hashCode() == list_card52.hashCode() : true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    player13.playKingdomCard();
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card15, cardName17);
    org.cs362.dominion.Card.CardName cardName19 = card18.getCardName();
    int i20 = card18.getTreasureValue();
    player13.discard(card18);
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Card.CardName cardName24 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card25 = org.cs362.dominion.Card.getCard(list_card22, cardName24);
    org.cs362.dominion.Card.CardName cardName26 = card25.getCardName();
    int i27 = card25.score();
    int i28 = card18.compareTo(card25);
    
    // Checks the contract:  equals-hashcode on list_card15 and list_card22
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card15 and list_card22", list_card15.equals(list_card22) ? list_card15.hashCode() == list_card22.hashCode() : true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.GameState gameState4 = null;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState4, "hi!");
    java.lang.String str7 = player6.toString();
    org.cs362.dominion.Player[] player_array8 = new org.cs362.dominion.Player[] { player6 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player9 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player9, player_array8);
    gameState3.players = arraylist_player9;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState3, "hi!");
    player13.playKingdomCard();
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card15, cardName17);
    org.cs362.dominion.Card.Type type19 = card18.getType();
    org.cs362.dominion.Card.CardName cardName20 = card18.getCardName();
    org.cs362.dominion.Card.Type type21 = card18.getType();
    int i22 = card18.getCost();
    player13.discard(card18);
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Card.CardName cardName26 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card27 = org.cs362.dominion.Card.getCard(list_card24, cardName26);
    int i28 = card27.getCost();
    org.cs362.dominion.Card.Type type29 = card27.getType();
    int i30 = card18.compareTo(card27);
    
    // Checks the contract:  equals-hashcode on list_card24 and list_card15
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card24 and list_card15", list_card24.equals(list_card15) ? list_card24.hashCode() == list_card15.hashCode() : true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    org.cs362.dominion.Card.CardName cardName4 = card3.getCardName();
    int i5 = card3.getTreasureValue();
    int i6 = card3.score();
    int i7 = card3.getCost();
    org.cs362.dominion.Card.Type type8 = card3.getType();
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card11);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card11, type14);
    org.cs362.dominion.Card.Type type16 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card11, type16);
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card9, type16);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState(list_card18);
    boolean b20 = card3.equals((java.lang.Object)gameState19);
    
    // Checks the contract:  equals-hashcode on list_card9 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card9 and list_card0", list_card9.equals(list_card0) ? list_card9.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    int i4 = card3.getCost();
    int i5 = card3.getTreasureValue();
    org.cs362.dominion.Card.CardName cardName6 = card3.getCardName();
    int i7 = card3.score();
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card11 = org.cs362.dominion.Card.getCard(list_card8, cardName10);
    org.cs362.dominion.Card.Type type12 = card11.getType();
    org.cs362.dominion.Card.CardName cardName13 = card11.getCardName();
    int i14 = card11.score();
    org.cs362.dominion.Card.Type type15 = card11.getType();
    int i16 = card11.score();
    int i17 = card3.compareTo(card11);
    
    // Checks the contract:  equals-hashcode on list_card8 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card8 and list_card0", list_card8.equals(list_card0) ? list_card8.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    int i4 = card3.getCost();
    org.cs362.dominion.Card.Type type5 = card3.getType();
    org.cs362.dominion.Card.Type type6 = card3.getType();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card.CardName cardName9 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card10 = org.cs362.dominion.Card.getCard(list_card7, cardName9);
    org.cs362.dominion.Card.CardName cardName11 = card10.getCardName();
    int i12 = card10.getTreasureValue();
    int i13 = card10.score();
    boolean b14 = card3.equals((java.lang.Object)i13);
    
    // Checks the contract:  equals-hashcode on list_card7 and list_card0
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card7 and list_card0", list_card7.equals(list_card0) ? list_card7.hashCode() == list_card0.hashCode() : true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName2 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card3 = org.cs362.dominion.Card.getCard(list_card0, cardName2);
    org.cs362.dominion.Card.Type type4 = card3.getType();
    org.cs362.dominion.Card.CardName cardName5 = card3.getCardName();
    int i6 = card3.score();
    org.cs362.dominion.Card.Type type7 = card3.getType();
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    org.cs362.dominion.GameState gameState12 = null;
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "hi!");
    java.lang.String str15 = player14.toString();
    org.cs362.dominion.Player[] player_array16 = new org.cs362.dominion.Player[] { player14 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player17 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player17, player_array16);
    gameState11.players = arraylist_player17;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState11, "hi!");
    gameState11.initializeGame();
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    gameState11.cards = arraylist_card24;
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card24);
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card29);
    org.cs362.dominion.GameState gameState32 = null;
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState32, "hi!");
    java.lang.String str35 = player34.toString();
    org.cs362.dominion.Player[] player_array36 = new org.cs362.dominion.Player[] { player34 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player37 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player37, player_array36);
    gameState31.players = arraylist_player37;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i40 = gameState31.play();
    org.cs362.dominion.Player player42 = new org.cs362.dominion.Player(gameState31, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i43 = gameState31.play();
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState31, "");
    org.cs362.dominion.Card[] card_array46 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card47 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card47, card_array46);
    org.cs362.dominion.GameState gameState49 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card47);
    org.cs362.dominion.GameState gameState50 = null;
    org.cs362.dominion.Player player52 = new org.cs362.dominion.Player(gameState50, "hi!");
    java.lang.String str53 = player52.toString();
    org.cs362.dominion.Player[] player_array54 = new org.cs362.dominion.Player[] { player52 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player55 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player55, player_array54);
    gameState49.players = arraylist_player55;
    org.cs362.dominion.Player player59 = new org.cs362.dominion.Player(gameState49, "hi!");
    java.lang.String str60 = gameState49.toString();
    org.cs362.dominion.Player player62 = new org.cs362.dominion.Player(gameState49, "The board game is embty you need to intialize the game!!!!");
    gameState31.addPlayer(player62);
    gameState27.addPlayer(player62);
    java.util.List<org.cs362.dominion.Card> list_card65 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState66 = new org.cs362.dominion.GameState(list_card65);
    org.cs362.dominion.Card.CardName cardName67 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card68 = org.cs362.dominion.Card.getCard(list_card65, cardName67);
    player62.discard(card68);
    org.cs362.dominion.Card.Type type70 = card68.getType();
    int i71 = card3.compareTo(card68);
    
    // Checks the contract:  equals-hashcode on list_card0 and list_card65
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on list_card0 and list_card65", list_card0.equals(list_card65) ? list_card0.hashCode() == list_card65.hashCode() : true);

  }

}
