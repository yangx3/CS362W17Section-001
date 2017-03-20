package dominion.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    java.util.List<dominion.Card> list_card0 = dominion.Card.createCards();
    dominion.GameState gameState1 = new dominion.GameState(list_card0);
    dominion.GameState gameState2 = null;
    dominion.Player player4 = new dominion.Player(gameState2, "hi!");
    dominion.Card card5 = null;
    player4.addHand(card5);
    player4.playKingdomCard();
    dominion.Card card8 = null;
    player4.discard(card8);
    gameState1.addPlayer(player4);
    java.util.List<dominion.Card> list_card11 = dominion.Card.createCards();
    dominion.GameState gameState12 = new dominion.GameState(list_card11);
    dominion.Card.CardName cardName13 = dominion.Card.CardName.Smithy;
    dominion.Card card14 = dominion.Card.getCard(list_card11, cardName13);
    java.lang.String str15 = card14.toString();
    player4.addHand(card14);
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    dominion.Card card20 = null;
    player19.addHand(card20);
    player19.playKingdomCard();
    dominion.Card card23 = null;
    player19.discard(card23);
    player19.playTtreasureCard();
    dominion.Card card26 = null;
    player19.addHand(card26);
    java.util.List<dominion.Card> list_card28 = dominion.Card.createCards();
    dominion.GameState gameState29 = new dominion.GameState(list_card28);
    dominion.Card.CardName cardName30 = dominion.Card.CardName.Smithy;
    dominion.Card card31 = dominion.Card.getCard(list_card28, cardName30);
    java.lang.String str32 = card31.toString();
    dominion.Card.CardName cardName33 = card31.getCardName();
    player19.discard(card31);
    player4.discard(card31);
    player4.playKingdomCard();
    
    // Checks the contract:  compareTo-equals on card14 and card31
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card14 and card31", (card14.compareTo(card31) == 0) == card14.equals(card31));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    java.util.List<dominion.Card> list_card0 = dominion.Card.createCards();
    dominion.GameState gameState1 = new dominion.GameState(list_card0);
    dominion.GameState gameState2 = null;
    dominion.Player player4 = new dominion.Player(gameState2, "hi!");
    dominion.Card card5 = null;
    player4.addHand(card5);
    player4.playKingdomCard();
    dominion.Card card8 = null;
    player4.discard(card8);
    gameState1.addPlayer(player4);
    java.util.List<dominion.Card> list_card11 = dominion.Card.createCards();
    dominion.GameState gameState12 = new dominion.GameState(list_card11);
    dominion.Card.CardName cardName13 = dominion.Card.CardName.Smithy;
    dominion.Card card14 = dominion.Card.getCard(list_card11, cardName13);
    java.lang.String str15 = card14.toString();
    player4.addHand(card14);
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    dominion.Card card20 = null;
    player19.addHand(card20);
    player19.playKingdomCard();
    dominion.Card card23 = null;
    player19.discard(card23);
    player19.playTtreasureCard();
    dominion.Card card26 = null;
    player19.discard(card26);
    dominion.Card card28 = null;
    player19.addHand(card28);
    java.util.List<dominion.Card> list_card30 = dominion.Card.createCards();
    dominion.GameState gameState31 = new dominion.GameState(list_card30);
    dominion.Card.CardName cardName32 = dominion.Card.CardName.Smithy;
    dominion.Card card33 = dominion.Card.getCard(list_card30, cardName32);
    player19.addHand(card33);
    player4.discard(card33);
    java.util.List<dominion.Card> list_card36 = dominion.Card.createCards();
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    dominion.GameState gameState38 = null;
    dominion.Player player40 = new dominion.Player(gameState38, "hi!");
    dominion.Card card41 = null;
    player40.addHand(card41);
    player40.playKingdomCard();
    dominion.Card card44 = null;
    player40.discard(card44);
    gameState37.addPlayer(player40);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    player40.addHand(card50);
    dominion.GameState gameState53 = null;
    dominion.Player player55 = new dominion.Player(gameState53, "hi!");
    dominion.Card card56 = null;
    player55.addHand(card56);
    player55.playKingdomCard();
    dominion.Card card59 = null;
    player55.discard(card59);
    player55.playTtreasureCard();
    dominion.Card card62 = null;
    player55.addHand(card62);
    java.util.List<dominion.Card> list_card64 = dominion.Card.createCards();
    dominion.GameState gameState65 = new dominion.GameState(list_card64);
    dominion.Card.CardName cardName66 = dominion.Card.CardName.Smithy;
    dominion.Card card67 = dominion.Card.getCard(list_card64, cardName66);
    java.lang.String str68 = card67.toString();
    dominion.Card.CardName cardName69 = card67.getCardName();
    player55.discard(card67);
    player40.discard(card67);
    int i72 = card33.compareTo(card67);
    
    // Checks the contract:  compareTo-equals on card50 and card14
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card50 and card14", (card50.compareTo(card14) == 0) == card50.equals(card14));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Smithy;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.GameState gameState5 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState6 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState6.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState6.play();
    dominion.GameState gameState9 = null;
    dominion.Player player11 = new dominion.Player(gameState9, "hi!");
    dominion.Card card12 = null;
    player11.addHand(card12);
    player11.playKingdomCard();
    player11.playKingdomCard();
    gameState6.addPlayer(player11);
    boolean b17 = gameState6.isGameOver();
    gameState6.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState6.gameBoard;
    java.util.List<dominion.Card> list_card20 = gameState6.cards;
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Minion;
    dominion.Card card22 = dominion.Card.getCard(list_card20, cardName21);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.Card.CardName cardName26 = dominion.Card.CardName.Smithy;
    dominion.Card card27 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName26);
    dominion.GameState gameState28 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState29.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i31 = gameState29.play();
    dominion.GameState gameState32 = null;
    dominion.Player player34 = new dominion.Player(gameState32, "hi!");
    dominion.Card card35 = null;
    player34.addHand(card35);
    player34.playKingdomCard();
    player34.playKingdomCard();
    gameState29.addPlayer(player34);
    dominion.GameState gameState40 = null;
    dominion.Player player42 = new dominion.Player(gameState40, "hi!");
    dominion.Card card43 = null;
    player42.addHand(card43);
    player42.playKingdomCard();
    dominion.Card card46 = null;
    player42.discard(card46);
    player42.playTtreasureCard();
    dominion.Card card49 = null;
    player42.discard(card49);
    gameState29.addPlayer(player42);
    java.util.List<dominion.Card> list_card52 = dominion.Card.createCards();
    dominion.GameState gameState53 = new dominion.GameState(list_card52);
    dominion.Card.CardName cardName54 = dominion.Card.CardName.Smithy;
    dominion.Card card55 = dominion.Card.getCard(list_card52, cardName54);
    java.lang.String str56 = card55.toString();
    dominion.Card.CardName cardName57 = card55.getCardName();
    player42.discard(card55);
    java.util.List<dominion.Card> list_card59 = dominion.Card.createCards();
    dominion.GameState gameState60 = new dominion.GameState(list_card59);
    dominion.Card.CardName cardName61 = dominion.Card.CardName.Smithy;
    dominion.Card card62 = dominion.Card.getCard(list_card59, cardName61);
    java.lang.String str63 = card62.toString();
    int i64 = card55.compareTo(card62);
    dominion.Card.Type type65 = card55.getType();
    java.util.List<dominion.Card> list_card66 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card20, type65);
    
    // Checks the contract:  compareTo-equals on card55 and card62
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card55 and card62", (card55.compareTo(card62) == 0) == card55.equals(card62));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "");
    dominion.Card card3 = null;
    player2.addHand(card3);
    dominion.GameState gameState5 = null;
    dominion.Player player7 = new dominion.Player(gameState5, "hi!");
    dominion.Card card8 = null;
    player7.addHand(card8);
    player7.playKingdomCard();
    dominion.Card card11 = null;
    player7.discard(card11);
    player7.playTtreasureCard();
    dominion.Card card14 = null;
    player7.discard(card14);
    dominion.Card card16 = null;
    player7.addHand(card16);
    java.util.List<dominion.Card> list_card18 = dominion.Card.createCards();
    dominion.GameState gameState19 = new dominion.GameState(list_card18);
    dominion.Card.CardName cardName20 = dominion.Card.CardName.Smithy;
    dominion.Card card21 = dominion.Card.getCard(list_card18, cardName20);
    player7.addHand(card21);
    dominion.Card[] card_array23 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card24 = new java.util.ArrayList<dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card24, card_array23);
    dominion.Card.CardName cardName26 = dominion.Card.CardName.Smithy;
    dominion.Card card27 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card24, cardName26);
    dominion.GameState gameState28 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    dominion.GameState gameState29 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card24);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i30 = gameState29.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i31 = gameState29.play();
    dominion.GameState gameState32 = null;
    dominion.Player player34 = new dominion.Player(gameState32, "hi!");
    dominion.Card card35 = null;
    player34.addHand(card35);
    player34.playKingdomCard();
    player34.playKingdomCard();
    gameState29.addPlayer(player34);
    dominion.GameState gameState40 = null;
    dominion.Player player42 = new dominion.Player(gameState40, "hi!");
    dominion.Card card43 = null;
    player42.addHand(card43);
    player42.playKingdomCard();
    dominion.Card card46 = null;
    player42.discard(card46);
    player42.playTtreasureCard();
    dominion.Card card49 = null;
    player42.discard(card49);
    gameState29.addPlayer(player42);
    java.util.List<dominion.Card> list_card52 = dominion.Card.createCards();
    dominion.GameState gameState53 = new dominion.GameState(list_card52);
    dominion.Card.CardName cardName54 = dominion.Card.CardName.Smithy;
    dominion.Card card55 = dominion.Card.getCard(list_card52, cardName54);
    java.lang.String str56 = card55.toString();
    dominion.Card.CardName cardName57 = card55.getCardName();
    player42.discard(card55);
    int i59 = card55.score();
    player7.addHand(card55);
    player2.discard(card55);
    java.util.List<dominion.Card> list_card62 = dominion.Card.createCards();
    dominion.GameState gameState63 = new dominion.GameState(list_card62);
    dominion.Card.CardName cardName64 = dominion.Card.CardName.Smithy;
    dominion.Card card65 = dominion.Card.getCard(list_card62, cardName64);
    dominion.Card[] card_array66 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card67 = new java.util.ArrayList<dominion.Card>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card67, card_array66);
    dominion.Card.CardName cardName69 = dominion.Card.CardName.Smithy;
    dominion.Card card70 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card67, cardName69);
    dominion.GameState gameState71 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card67);
    dominion.GameState gameState72 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card67);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i73 = gameState72.play();
    java.util.List<dominion.Player> list_player74 = gameState72.players;
    boolean b75 = card65.equals((java.lang.Object)list_player74);
    int i76 = card65.getCost();
    player2.addHand(card65);
    
    // Checks the contract:  compareTo-equals on card21 and card55
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card21 and card55", (card21.compareTo(card55) == 0) == card21.equals(card55));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Smithy;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.GameState gameState5 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState6 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState6.play();
    dominion.Player player9 = new dominion.Player(gameState6, "hi!");
    dominion.Player player11 = new dominion.Player(gameState6, "");
    dominion.GameState gameState12 = null;
    dominion.Player player14 = new dominion.Player(gameState12, "hi!");
    dominion.Card card15 = null;
    player14.addHand(card15);
    player14.playKingdomCard();
    dominion.Card card18 = null;
    player14.discard(card18);
    player14.playTtreasureCard();
    dominion.Card card21 = null;
    player14.discard(card21);
    dominion.Card card23 = null;
    player14.addHand(card23);
    java.util.List<dominion.Card> list_card25 = dominion.Card.createCards();
    dominion.GameState gameState26 = new dominion.GameState(list_card25);
    dominion.Card.CardName cardName27 = dominion.Card.CardName.Smithy;
    dominion.Card card28 = dominion.Card.getCard(list_card25, cardName27);
    player14.addHand(card28);
    dominion.Card[] card_array30 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card31 = new java.util.ArrayList<dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card31, card_array30);
    dominion.Card.CardName cardName33 = dominion.Card.CardName.Smithy;
    dominion.Card card34 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card31, cardName33);
    dominion.GameState gameState35 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    dominion.GameState gameState36 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card31);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i37 = gameState36.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i38 = gameState36.play();
    dominion.GameState gameState39 = null;
    dominion.Player player41 = new dominion.Player(gameState39, "hi!");
    dominion.Card card42 = null;
    player41.addHand(card42);
    player41.playKingdomCard();
    player41.playKingdomCard();
    gameState36.addPlayer(player41);
    dominion.GameState gameState47 = null;
    dominion.Player player49 = new dominion.Player(gameState47, "hi!");
    dominion.Card card50 = null;
    player49.addHand(card50);
    player49.playKingdomCard();
    dominion.Card card53 = null;
    player49.discard(card53);
    player49.playTtreasureCard();
    dominion.Card card56 = null;
    player49.discard(card56);
    gameState36.addPlayer(player49);
    java.util.List<dominion.Card> list_card59 = dominion.Card.createCards();
    dominion.GameState gameState60 = new dominion.GameState(list_card59);
    dominion.Card.CardName cardName61 = dominion.Card.CardName.Smithy;
    dominion.Card card62 = dominion.Card.getCard(list_card59, cardName61);
    java.lang.String str63 = card62.toString();
    dominion.Card.CardName cardName64 = card62.getCardName();
    player49.discard(card62);
    int i66 = card62.score();
    player14.addHand(card62);
    player11.addHand(card62);
    player11.printStateGame();
    
    // Checks the contract:  compareTo-equals on card62 and card28
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card62 and card28", (card62.compareTo(card28) == 0) == card62.equals(card28));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.discard(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    java.util.List<dominion.Card> list_card13 = dominion.Card.createCards();
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Smithy;
    dominion.Card card16 = dominion.Card.getCard(list_card13, cardName15);
    player2.addHand(card16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Smithy;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState24.play();
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    player29.playKingdomCard();
    gameState24.addPlayer(player29);
    dominion.GameState gameState35 = null;
    dominion.Player player37 = new dominion.Player(gameState35, "hi!");
    dominion.Card card38 = null;
    player37.addHand(card38);
    player37.playKingdomCard();
    dominion.Card card41 = null;
    player37.discard(card41);
    player37.playTtreasureCard();
    dominion.Card card44 = null;
    player37.discard(card44);
    gameState24.addPlayer(player37);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    dominion.Card.CardName cardName52 = card50.getCardName();
    player37.discard(card50);
    int i54 = card50.score();
    player2.addHand(card50);
    java.util.List<dominion.Card> list_card56 = dominion.Card.createCards();
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Card.CardName cardName58 = dominion.Card.CardName.Smithy;
    dominion.Card card59 = dominion.Card.getCard(list_card56, cardName58);
    java.lang.String str60 = card59.toString();
    dominion.Card.CardName cardName61 = card59.getCardName();
    java.lang.String str62 = card59.toString();
    int i63 = card59.score();
    int i64 = card50.compareTo(card59);
    dominion.Card.CardName cardName65 = card50.getCardName();
    
    // Checks the contract:  compareTo-equals on card59 and card16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card59 and card16", (card59.compareTo(card16) == 0) == card59.equals(card16));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.discard(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    java.util.List<dominion.Card> list_card13 = dominion.Card.createCards();
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Smithy;
    dominion.Card card16 = dominion.Card.getCard(list_card13, cardName15);
    player2.addHand(card16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Smithy;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState24.play();
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    player29.playKingdomCard();
    gameState24.addPlayer(player29);
    dominion.GameState gameState35 = null;
    dominion.Player player37 = new dominion.Player(gameState35, "hi!");
    dominion.Card card38 = null;
    player37.addHand(card38);
    player37.playKingdomCard();
    dominion.Card card41 = null;
    player37.discard(card41);
    player37.playTtreasureCard();
    dominion.Card card44 = null;
    player37.discard(card44);
    gameState24.addPlayer(player37);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    dominion.Card.CardName cardName52 = card50.getCardName();
    player37.discard(card50);
    int i54 = card50.score();
    player2.addHand(card50);
    java.util.List<dominion.Card> list_card56 = dominion.Card.createCards();
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Card.CardName cardName58 = dominion.Card.CardName.Smithy;
    dominion.Card card59 = dominion.Card.getCard(list_card56, cardName58);
    java.lang.String str60 = card59.toString();
    dominion.Card.CardName cardName61 = card59.getCardName();
    java.lang.String str62 = card59.toString();
    int i63 = card59.score();
    int i64 = card50.compareTo(card59);
    int i65 = card50.score();
    
    // Checks the contract:  compareTo-equals on card59 and card16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card59 and card16", (card59.compareTo(card16) == 0) == card59.equals(card16));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Smithy;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.GameState gameState5 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState6 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState6.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState6.play();
    dominion.GameState gameState9 = null;
    dominion.Player player11 = new dominion.Player(gameState9, "hi!");
    dominion.Card card12 = null;
    player11.addHand(card12);
    player11.playKingdomCard();
    player11.playKingdomCard();
    gameState6.addPlayer(player11);
    dominion.GameState gameState17 = null;
    dominion.Player player19 = new dominion.Player(gameState17, "hi!");
    dominion.Card card20 = null;
    player19.addHand(card20);
    player19.playKingdomCard();
    dominion.Card card23 = null;
    player19.discard(card23);
    player19.playTtreasureCard();
    dominion.Card card26 = null;
    player19.discard(card26);
    gameState6.addPlayer(player19);
    java.util.List<dominion.Card> list_card29 = dominion.Card.createCards();
    dominion.GameState gameState30 = new dominion.GameState(list_card29);
    dominion.Card.CardName cardName31 = dominion.Card.CardName.Smithy;
    dominion.Card card32 = dominion.Card.getCard(list_card29, cardName31);
    java.lang.String str33 = card32.toString();
    dominion.Card.CardName cardName34 = card32.getCardName();
    player19.discard(card32);
    java.util.List<dominion.Card> list_card36 = dominion.Card.createCards();
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    dominion.Card.CardName cardName38 = dominion.Card.CardName.Smithy;
    dominion.Card card39 = dominion.Card.getCard(list_card36, cardName38);
    java.lang.String str40 = card39.toString();
    int i41 = card32.compareTo(card39);
    dominion.GameState gameState42 = null;
    dominion.Player player44 = new dominion.Player(gameState42, "hi!");
    dominion.Card card45 = null;
    player44.addHand(card45);
    player44.playKingdomCard();
    dominion.Card card48 = null;
    player44.discard(card48);
    player44.playTtreasureCard();
    dominion.Card card51 = null;
    player44.discard(card51);
    dominion.Card card53 = null;
    player44.addHand(card53);
    java.util.List<dominion.Card> list_card55 = dominion.Card.createCards();
    dominion.GameState gameState56 = new dominion.GameState(list_card55);
    dominion.Card.CardName cardName57 = dominion.Card.CardName.Smithy;
    dominion.Card card58 = dominion.Card.getCard(list_card55, cardName57);
    player44.addHand(card58);
    dominion.Card[] card_array60 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card61 = new java.util.ArrayList<dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card61, card_array60);
    dominion.Card.CardName cardName63 = dominion.Card.CardName.Smithy;
    dominion.Card card64 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card61, cardName63);
    dominion.GameState gameState65 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    dominion.GameState gameState66 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card61);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i67 = gameState66.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i68 = gameState66.play();
    dominion.GameState gameState69 = null;
    dominion.Player player71 = new dominion.Player(gameState69, "hi!");
    dominion.Card card72 = null;
    player71.addHand(card72);
    player71.playKingdomCard();
    player71.playKingdomCard();
    gameState66.addPlayer(player71);
    dominion.GameState gameState77 = null;
    dominion.Player player79 = new dominion.Player(gameState77, "hi!");
    dominion.Card card80 = null;
    player79.addHand(card80);
    player79.playKingdomCard();
    dominion.Card card83 = null;
    player79.discard(card83);
    player79.playTtreasureCard();
    dominion.Card card86 = null;
    player79.discard(card86);
    gameState66.addPlayer(player79);
    java.util.List<dominion.Card> list_card89 = dominion.Card.createCards();
    dominion.GameState gameState90 = new dominion.GameState(list_card89);
    dominion.Card.CardName cardName91 = dominion.Card.CardName.Smithy;
    dominion.Card card92 = dominion.Card.getCard(list_card89, cardName91);
    java.lang.String str93 = card92.toString();
    dominion.Card.CardName cardName94 = card92.getCardName();
    player79.discard(card92);
    int i96 = card92.score();
    player44.addHand(card92);
    boolean b98 = card39.equals((java.lang.Object)card92);
    
    // Checks the contract:  compareTo-equals on card58 and card32
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card58 and card32", (card58.compareTo(card32) == 0) == card58.equals(card32));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.addHand(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    dominion.Card[] card_array13 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card14 = new java.util.ArrayList<dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card14, card_array13);
    dominion.Card.CardName cardName16 = dominion.Card.CardName.Smithy;
    dominion.Card card17 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card14, cardName16);
    dominion.GameState gameState18 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card14);
    dominion.GameState gameState19 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card14);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i20 = gameState19.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i21 = gameState19.play();
    dominion.GameState gameState22 = null;
    dominion.Player player24 = new dominion.Player(gameState22, "hi!");
    dominion.Card card25 = null;
    player24.addHand(card25);
    player24.playKingdomCard();
    player24.playKingdomCard();
    gameState19.addPlayer(player24);
    dominion.GameState gameState30 = null;
    dominion.Player player32 = new dominion.Player(gameState30, "hi!");
    dominion.Card card33 = null;
    player32.addHand(card33);
    player32.playKingdomCard();
    dominion.Card card36 = null;
    player32.discard(card36);
    player32.playTtreasureCard();
    dominion.Card card39 = null;
    player32.discard(card39);
    gameState19.addPlayer(player32);
    java.util.List<dominion.Card> list_card42 = dominion.Card.createCards();
    dominion.GameState gameState43 = new dominion.GameState(list_card42);
    dominion.Card.CardName cardName44 = dominion.Card.CardName.Smithy;
    dominion.Card card45 = dominion.Card.getCard(list_card42, cardName44);
    java.lang.String str46 = card45.toString();
    dominion.Card.CardName cardName47 = card45.getCardName();
    player32.discard(card45);
    java.util.List<dominion.Card> list_card49 = dominion.Card.createCards();
    dominion.GameState gameState50 = new dominion.GameState(list_card49);
    dominion.Card.CardName cardName51 = dominion.Card.CardName.Smithy;
    dominion.Card card52 = dominion.Card.getCard(list_card49, cardName51);
    java.lang.String str53 = card52.toString();
    int i54 = card45.compareTo(card52);
    dominion.Card.Type type55 = card45.getType();
    player2.addHand(card45);
    dominion.Card[] card_array57 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card58 = new java.util.ArrayList<dominion.Card>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card58, card_array57);
    dominion.Card.CardName cardName60 = dominion.Card.CardName.Smithy;
    dominion.Card card61 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card58, cardName60);
    dominion.GameState gameState62 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card58);
    dominion.GameState gameState63 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card58);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i64 = gameState63.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i65 = gameState63.play();
    dominion.GameState gameState66 = null;
    dominion.Player player68 = new dominion.Player(gameState66, "hi!");
    dominion.Card card69 = null;
    player68.addHand(card69);
    player68.playKingdomCard();
    player68.playKingdomCard();
    gameState63.addPlayer(player68);
    dominion.GameState gameState74 = null;
    dominion.Player player76 = new dominion.Player(gameState74, "hi!");
    dominion.Card card77 = null;
    player76.addHand(card77);
    player76.playKingdomCard();
    dominion.Card card80 = null;
    player76.discard(card80);
    player76.playTtreasureCard();
    dominion.Card card83 = null;
    player76.discard(card83);
    gameState63.addPlayer(player76);
    java.util.List<dominion.Card> list_card86 = dominion.Card.createCards();
    dominion.GameState gameState87 = new dominion.GameState(list_card86);
    dominion.Card.CardName cardName88 = dominion.Card.CardName.Smithy;
    dominion.Card card89 = dominion.Card.getCard(list_card86, cardName88);
    java.lang.String str90 = card89.toString();
    dominion.Card.CardName cardName91 = card89.getCardName();
    player76.discard(card89);
    java.util.List<dominion.Card> list_card93 = dominion.Card.createCards();
    dominion.GameState gameState94 = new dominion.GameState(list_card93);
    dominion.Card.CardName cardName95 = dominion.Card.CardName.Smithy;
    dominion.Card card96 = dominion.Card.getCard(list_card93, cardName95);
    java.lang.String str97 = card96.toString();
    int i98 = card89.compareTo(card96);
    player2.addHand(card96);
    
    // Checks the contract:  compareTo-equals on card52 and card45
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card52 and card45", (card52.compareTo(card45) == 0) == card52.equals(card45));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.discard(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    java.util.List<dominion.Card> list_card13 = dominion.Card.createCards();
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Smithy;
    dominion.Card card16 = dominion.Card.getCard(list_card13, cardName15);
    player2.addHand(card16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Smithy;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState24.play();
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    player29.playKingdomCard();
    gameState24.addPlayer(player29);
    dominion.GameState gameState35 = null;
    dominion.Player player37 = new dominion.Player(gameState35, "hi!");
    dominion.Card card38 = null;
    player37.addHand(card38);
    player37.playKingdomCard();
    dominion.Card card41 = null;
    player37.discard(card41);
    player37.playTtreasureCard();
    dominion.Card card44 = null;
    player37.discard(card44);
    gameState24.addPlayer(player37);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    dominion.Card.CardName cardName52 = card50.getCardName();
    player37.discard(card50);
    int i54 = card50.score();
    player2.addHand(card50);
    java.util.List<dominion.Card> list_card56 = dominion.Card.createCards();
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Card.CardName cardName58 = dominion.Card.CardName.Smithy;
    dominion.Card card59 = dominion.Card.getCard(list_card56, cardName58);
    java.lang.String str60 = card59.toString();
    dominion.Card.CardName cardName61 = card59.getCardName();
    java.lang.String str62 = card59.toString();
    player2.addHand(card59);
    
    // Checks the contract:  compareTo-equals on card16 and card50
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card16 and card50", (card16.compareTo(card50) == 0) == card16.equals(card50));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.discard(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    java.util.List<dominion.Card> list_card13 = dominion.Card.createCards();
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Smithy;
    dominion.Card card16 = dominion.Card.getCard(list_card13, cardName15);
    player2.addHand(card16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Smithy;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState24.play();
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    player29.playKingdomCard();
    gameState24.addPlayer(player29);
    dominion.GameState gameState35 = null;
    dominion.Player player37 = new dominion.Player(gameState35, "hi!");
    dominion.Card card38 = null;
    player37.addHand(card38);
    player37.playKingdomCard();
    dominion.Card card41 = null;
    player37.discard(card41);
    player37.playTtreasureCard();
    dominion.Card card44 = null;
    player37.discard(card44);
    gameState24.addPlayer(player37);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    dominion.Card.CardName cardName52 = card50.getCardName();
    player37.discard(card50);
    int i54 = card50.score();
    player2.addHand(card50);
    dominion.Card[] card_array56 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card57 = new java.util.ArrayList<dominion.Card>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card57, card_array56);
    dominion.Card.CardName cardName59 = dominion.Card.CardName.Smithy;
    dominion.Card card60 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card57, cardName59);
    dominion.GameState gameState61 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card57);
    dominion.GameState gameState62 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card57);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i63 = gameState62.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i64 = gameState62.play();
    dominion.GameState gameState65 = null;
    dominion.Player player67 = new dominion.Player(gameState65, "hi!");
    dominion.Card card68 = null;
    player67.addHand(card68);
    player67.playKingdomCard();
    player67.playKingdomCard();
    gameState62.addPlayer(player67);
    dominion.GameState gameState73 = null;
    dominion.Player player75 = new dominion.Player(gameState73, "hi!");
    dominion.Card card76 = null;
    player75.addHand(card76);
    player75.playKingdomCard();
    dominion.Card card79 = null;
    player75.discard(card79);
    player75.playTtreasureCard();
    dominion.Card card82 = null;
    player75.discard(card82);
    gameState62.addPlayer(player75);
    java.util.List<dominion.Card> list_card85 = dominion.Card.createCards();
    dominion.GameState gameState86 = new dominion.GameState(list_card85);
    dominion.Card.CardName cardName87 = dominion.Card.CardName.Smithy;
    dominion.Card card88 = dominion.Card.getCard(list_card85, cardName87);
    java.lang.String str89 = card88.toString();
    dominion.Card.CardName cardName90 = card88.getCardName();
    player75.discard(card88);
    java.util.List<dominion.Card> list_card92 = dominion.Card.createCards();
    dominion.GameState gameState93 = new dominion.GameState(list_card92);
    dominion.Card.CardName cardName94 = dominion.Card.CardName.Smithy;
    dominion.Card card95 = dominion.Card.getCard(list_card92, cardName94);
    java.lang.String str96 = card95.toString();
    int i97 = card88.compareTo(card95);
    player2.addHand(card88);
    
    // Checks the contract:  compareTo-equals on card16 and card50
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card16 and card50", (card16.compareTo(card50) == 0) == card16.equals(card50));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.discard(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    java.util.List<dominion.Card> list_card13 = dominion.Card.createCards();
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Smithy;
    dominion.Card card16 = dominion.Card.getCard(list_card13, cardName15);
    player2.addHand(card16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Smithy;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState24.play();
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    player29.playKingdomCard();
    gameState24.addPlayer(player29);
    dominion.GameState gameState35 = null;
    dominion.Player player37 = new dominion.Player(gameState35, "hi!");
    dominion.Card card38 = null;
    player37.addHand(card38);
    player37.playKingdomCard();
    dominion.Card card41 = null;
    player37.discard(card41);
    player37.playTtreasureCard();
    dominion.Card card44 = null;
    player37.discard(card44);
    gameState24.addPlayer(player37);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    dominion.Card.CardName cardName52 = card50.getCardName();
    player37.discard(card50);
    int i54 = card50.score();
    player2.addHand(card50);
    java.util.List<dominion.Card> list_card56 = dominion.Card.createCards();
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Card.CardName cardName58 = dominion.Card.CardName.Smithy;
    dominion.Card card59 = dominion.Card.getCard(list_card56, cardName58);
    java.lang.String str60 = card59.toString();
    dominion.Card.CardName cardName61 = card59.getCardName();
    java.lang.String str62 = card59.toString();
    int i63 = card59.score();
    int i64 = card50.compareTo(card59);
    dominion.Card[] card_array65 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card66 = new java.util.ArrayList<dominion.Card>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card66, card_array65);
    dominion.Card.CardName cardName68 = dominion.Card.CardName.Smithy;
    dominion.Card card69 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card66, cardName68);
    dominion.GameState gameState70 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card66);
    dominion.GameState gameState71 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card66);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i72 = gameState71.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i73 = gameState71.play();
    dominion.GameState gameState74 = null;
    dominion.Player player76 = new dominion.Player(gameState74, "hi!");
    dominion.Card card77 = null;
    player76.addHand(card77);
    player76.playKingdomCard();
    player76.playKingdomCard();
    gameState71.addPlayer(player76);
    boolean b82 = gameState71.isGameOver();
    gameState71.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i84 = gameState71.gameBoard;
    java.util.List<dominion.Card> list_card85 = gameState71.cards;
    dominion.GameState gameState86 = new dominion.GameState(list_card85);
    java.util.List<dominion.Card> list_card87 = dominion.Card.createCards();
    dominion.GameState gameState88 = new dominion.GameState(list_card87);
    dominion.Card.CardName cardName89 = dominion.Card.CardName.Smithy;
    dominion.Card card90 = dominion.Card.getCard(list_card87, cardName89);
    dominion.Card.Type type91 = card90.getType();
    java.util.List<dominion.Card> list_card92 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card85, type91);
    dominion.GameState gameState93 = new dominion.GameState(list_card85);
    dominion.Card.Type type94 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card95 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card85, type94);
    dominion.Card.Type type96 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card97 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card95, type96);
    boolean b98 = card50.equals((java.lang.Object)type96);
    
    // Checks the contract:  compareTo-equals on card16 and card90
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card16 and card90", (card16.compareTo(card90) == 0) == card16.equals(card90));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    dominion.Card[] card_array8 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card9 = new java.util.ArrayList<dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card9, card_array8);
    dominion.Card.CardName cardName11 = dominion.Card.CardName.Smithy;
    dominion.Card card12 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card9, cardName11);
    dominion.GameState gameState13 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card9);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState13.play();
    java.util.List<dominion.Player> list_player15 = gameState13.players;
    player2.buyCard(gameState13);
    java.util.List<dominion.Card> list_card17 = dominion.Card.createCards();
    dominion.GameState gameState18 = new dominion.GameState(list_card17);
    dominion.Card.CardName cardName19 = dominion.Card.CardName.Smithy;
    dominion.Card card20 = dominion.Card.getCard(list_card17, cardName19);
    java.lang.String str21 = card20.toString();
    dominion.Card.CardName cardName22 = card20.getCardName();
    int i23 = card20.getTreasureValue();
    player2.addHand(card20);
    java.util.List<dominion.Card> list_card25 = dominion.Card.createCards();
    dominion.GameState gameState26 = new dominion.GameState(list_card25);
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    dominion.Card card33 = null;
    player29.discard(card33);
    gameState26.addPlayer(player29);
    java.util.List<dominion.Card> list_card36 = dominion.Card.createCards();
    dominion.GameState gameState37 = new dominion.GameState(list_card36);
    dominion.Card.CardName cardName38 = dominion.Card.CardName.Smithy;
    dominion.Card card39 = dominion.Card.getCard(list_card36, cardName38);
    java.lang.String str40 = card39.toString();
    player29.addHand(card39);
    dominion.GameState gameState42 = null;
    dominion.Player player44 = new dominion.Player(gameState42, "hi!");
    dominion.Card card45 = null;
    player44.addHand(card45);
    player44.playKingdomCard();
    dominion.Card card48 = null;
    player44.discard(card48);
    player44.playTtreasureCard();
    dominion.Card card51 = null;
    player44.addHand(card51);
    java.util.List<dominion.Card> list_card53 = dominion.Card.createCards();
    dominion.GameState gameState54 = new dominion.GameState(list_card53);
    dominion.Card.CardName cardName55 = dominion.Card.CardName.Smithy;
    dominion.Card card56 = dominion.Card.getCard(list_card53, cardName55);
    java.lang.String str57 = card56.toString();
    dominion.Card.CardName cardName58 = card56.getCardName();
    player44.discard(card56);
    player29.discard(card56);
    player2.addHand(card56);
    
    // Checks the contract:  compareTo-equals on card20 and card39
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card20 and card39", (card20.compareTo(card39) == 0) == card20.equals(card39));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    dominion.Card[] card_array0 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card1 = new java.util.ArrayList<dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card1, card_array0);
    dominion.Card.CardName cardName3 = dominion.Card.CardName.Smithy;
    dominion.Card card4 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName3);
    dominion.GameState gameState5 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.GameState gameState6 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card1);
    dominion.Card.CardName cardName7 = dominion.Card.CardName.Gardens;
    dominion.Card card8 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card1, cardName7);
    dominion.Card[] card_array9 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card10 = new java.util.ArrayList<dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card10, card_array9);
    dominion.Card.CardName cardName12 = dominion.Card.CardName.Smithy;
    dominion.Card card13 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card10, cardName12);
    dominion.GameState gameState14 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    dominion.GameState gameState15 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card10);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState15.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState15.play();
    dominion.GameState gameState18 = null;
    dominion.Player player20 = new dominion.Player(gameState18, "hi!");
    dominion.Card card21 = null;
    player20.addHand(card21);
    player20.playKingdomCard();
    player20.playKingdomCard();
    gameState15.addPlayer(player20);
    boolean b26 = gameState15.isGameOver();
    gameState15.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i28 = gameState15.gameBoard;
    java.util.List<dominion.Card> list_card29 = gameState15.cards;
    dominion.GameState gameState30 = new dominion.GameState(list_card29);
    java.util.List<dominion.Card> list_card31 = dominion.Card.createCards();
    dominion.GameState gameState32 = new dominion.GameState(list_card31);
    dominion.Card.CardName cardName33 = dominion.Card.CardName.Smithy;
    dominion.Card card34 = dominion.Card.getCard(list_card31, cardName33);
    dominion.Card.Type type35 = card34.getType();
    java.util.List<dominion.Card> list_card36 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card29, type35);
    dominion.GameState gameState37 = new dominion.GameState(list_card29);
    dominion.Card.Type type38 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card39 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card29, type38);
    java.util.List<dominion.Card> list_card40 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card1, type38);
    java.util.List<dominion.Card> list_card41 = dominion.Card.createCards();
    dominion.GameState gameState42 = new dominion.GameState(list_card41);
    dominion.Card.CardName cardName43 = dominion.Card.CardName.Smithy;
    dominion.Card card44 = dominion.Card.getCard(list_card41, cardName43);
    dominion.Card.CardName cardName45 = card44.getCardName();
    dominion.Card.CardName cardName46 = card44.getCardName();
    dominion.Card card47 = dominion.Card.getCard(list_card40, cardName46);
    
    // Checks the contract:  compareTo-equals on card34 and card44
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card34 and card44", (card34.compareTo(card44) == 0) == card34.equals(card44));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.addHand(card6);
    java.util.List<dominion.Card> list_card8 = dominion.Card.createCards();
    dominion.GameState gameState9 = new dominion.GameState(list_card8);
    dominion.Card.CardName cardName10 = dominion.Card.CardName.Smithy;
    dominion.Card card11 = dominion.Card.getCard(list_card8, cardName10);
    java.lang.String str12 = card11.toString();
    dominion.Card.CardName cardName13 = card11.getCardName();
    java.lang.String str14 = card11.toString();
    player2.discard(card11);
    java.util.List<dominion.Card> list_card16 = dominion.Card.createCards();
    dominion.GameState gameState17 = new dominion.GameState(list_card16);
    boolean b18 = card11.equals((java.lang.Object)list_card16);
    dominion.Card[] card_array19 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card20 = new java.util.ArrayList<dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card20, card_array19);
    dominion.Card.CardName cardName22 = dominion.Card.CardName.Smithy;
    dominion.Card card23 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card20, cardName22);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card20);
    dominion.GameState gameState25 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card20);
    dominion.Card.CardName cardName26 = dominion.Card.CardName.Gardens;
    dominion.Card card27 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card20, cardName26);
    dominion.Card[] card_array28 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card29 = new java.util.ArrayList<dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card29, card_array28);
    dominion.Card.CardName cardName31 = dominion.Card.CardName.Smithy;
    dominion.Card card32 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card29, cardName31);
    dominion.GameState gameState33 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    dominion.GameState gameState34 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card29);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i35 = gameState34.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i36 = gameState34.play();
    dominion.GameState gameState37 = null;
    dominion.Player player39 = new dominion.Player(gameState37, "hi!");
    dominion.Card card40 = null;
    player39.addHand(card40);
    player39.playKingdomCard();
    player39.playKingdomCard();
    gameState34.addPlayer(player39);
    boolean b45 = gameState34.isGameOver();
    gameState34.initializeGame();
    java.util.HashMap<dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState34.gameBoard;
    java.util.List<dominion.Card> list_card48 = gameState34.cards;
    dominion.GameState gameState49 = new dominion.GameState(list_card48);
    java.util.List<dominion.Card> list_card50 = dominion.Card.createCards();
    dominion.GameState gameState51 = new dominion.GameState(list_card50);
    dominion.Card.CardName cardName52 = dominion.Card.CardName.Smithy;
    dominion.Card card53 = dominion.Card.getCard(list_card50, cardName52);
    dominion.Card.Type type54 = card53.getType();
    java.util.List<dominion.Card> list_card55 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card48, type54);
    dominion.GameState gameState56 = new dominion.GameState(list_card48);
    dominion.Card.Type type57 = dominion.Card.Type.TREASURE;
    java.util.List<dominion.Card> list_card58 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card48, type57);
    java.util.List<dominion.Card> list_card59 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)arraylist_card20, type57);
    java.util.List<dominion.Card> list_card60 = dominion.Card.filter((java.lang.Iterable<dominion.Card>)list_card16, type57);
    
    // Checks the contract:  compareTo-equals on card53 and card11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card53 and card11", (card53.compareTo(card11) == 0) == card53.equals(card11));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    dominion.GameState gameState0 = null;
    dominion.Player player2 = new dominion.Player(gameState0, "hi!");
    dominion.Card card3 = null;
    player2.addHand(card3);
    player2.playKingdomCard();
    dominion.Card card6 = null;
    player2.discard(card6);
    player2.playTtreasureCard();
    dominion.Card card9 = null;
    player2.discard(card9);
    dominion.Card card11 = null;
    player2.addHand(card11);
    java.util.List<dominion.Card> list_card13 = dominion.Card.createCards();
    dominion.GameState gameState14 = new dominion.GameState(list_card13);
    dominion.Card.CardName cardName15 = dominion.Card.CardName.Smithy;
    dominion.Card card16 = dominion.Card.getCard(list_card13, cardName15);
    player2.addHand(card16);
    dominion.Card[] card_array18 = new dominion.Card[] {  };
    java.util.ArrayList<dominion.Card> arraylist_card19 = new java.util.ArrayList<dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dominion.Card>)arraylist_card19, card_array18);
    dominion.Card.CardName cardName21 = dominion.Card.CardName.Smithy;
    dominion.Card card22 = dominion.Card.getCard((java.util.List<dominion.Card>)arraylist_card19, cardName21);
    dominion.GameState gameState23 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    dominion.GameState gameState24 = new dominion.GameState((java.util.List<dominion.Card>)arraylist_card19);
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i25 = gameState24.play();
    java.util.HashMap<dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState24.play();
    dominion.GameState gameState27 = null;
    dominion.Player player29 = new dominion.Player(gameState27, "hi!");
    dominion.Card card30 = null;
    player29.addHand(card30);
    player29.playKingdomCard();
    player29.playKingdomCard();
    gameState24.addPlayer(player29);
    dominion.GameState gameState35 = null;
    dominion.Player player37 = new dominion.Player(gameState35, "hi!");
    dominion.Card card38 = null;
    player37.addHand(card38);
    player37.playKingdomCard();
    dominion.Card card41 = null;
    player37.discard(card41);
    player37.playTtreasureCard();
    dominion.Card card44 = null;
    player37.discard(card44);
    gameState24.addPlayer(player37);
    java.util.List<dominion.Card> list_card47 = dominion.Card.createCards();
    dominion.GameState gameState48 = new dominion.GameState(list_card47);
    dominion.Card.CardName cardName49 = dominion.Card.CardName.Smithy;
    dominion.Card card50 = dominion.Card.getCard(list_card47, cardName49);
    java.lang.String str51 = card50.toString();
    dominion.Card.CardName cardName52 = card50.getCardName();
    player37.discard(card50);
    int i54 = card50.score();
    player2.addHand(card50);
    java.util.List<dominion.Card> list_card56 = dominion.Card.createCards();
    dominion.GameState gameState57 = new dominion.GameState(list_card56);
    dominion.Card.CardName cardName58 = dominion.Card.CardName.Smithy;
    dominion.Card card59 = dominion.Card.getCard(list_card56, cardName58);
    java.lang.String str60 = card59.toString();
    dominion.Card.CardName cardName61 = card59.getCardName();
    java.lang.String str62 = card59.toString();
    int i63 = card59.score();
    int i64 = card50.compareTo(card59);
    dominion.GameState gameState65 = null;
    dominion.Player player67 = new dominion.Player(gameState65, "hi!");
    dominion.Card card68 = null;
    player67.addHand(card68);
    player67.playKingdomCard();
    dominion.Card card71 = null;
    player67.discard(card71);
    player67.playTtreasureCard();
    player67.playKingdomCard();
    dominion.Card card75 = null;
    player67.discard(card75);
    java.util.List<dominion.Card> list_card77 = dominion.Card.createCards();
    dominion.GameState gameState78 = new dominion.GameState(list_card77);
    dominion.Card.CardName cardName79 = dominion.Card.CardName.Smithy;
    dominion.Card card80 = dominion.Card.getCard(list_card77, cardName79);
    dominion.Card.CardName cardName81 = card80.getCardName();
    java.lang.String str82 = card80.toString();
    player67.discard(card80);
    dominion.Card.CardName cardName84 = card80.getCardName();
    int i85 = card59.compareTo(card80);
    
    // Checks the contract:  compareTo-equals on card50 and card16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card50 and card16", (card50.compareTo(card16) == 0) == card50.equals(card16));

  }

}
