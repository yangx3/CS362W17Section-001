package org.cs362.dominion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type1);
    org.cs362.dominion.Card.Type type3 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type3);
    org.cs362.dominion.Card card5 = org.cs362.dominion.Randomness.randomMember(list_card0);
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card6, type7);
    org.cs362.dominion.Card.Type type9 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card6, type9);
    org.cs362.dominion.Card card11 = org.cs362.dominion.Randomness.randomMember(list_card6);
    int i12 = card5.compareTo(card11);
    org.cs362.dominion.Card[] card_array13 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card14, card_array13);
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card14);
    org.cs362.dominion.Player player18 = new org.cs362.dominion.Player(gameState16, "The board game is empty, you need to intialize the game!");
    player18.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName21 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card22 = org.cs362.dominion.Card.getCard(list_card20, cardName21);
    player18.discard(card22);
    int i24 = card22.getTreasureValue();
    org.cs362.dominion.Card[] card_array25 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card26 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card26, card_array25);
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card26);
    java.util.List<org.cs362.dominion.Card> list_card29 = gameState28.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i30 = gameState28.gameBoard;
    java.lang.String str31 = gameState28.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState28.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card33 = gameState28.cards;
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    org.cs362.dominion.GameState gameState37 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card35);
    org.cs362.dominion.Player player39 = new org.cs362.dominion.Player(gameState37, "The board game is empty, you need to intialize the game!");
    player39.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card41 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName42 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card43 = org.cs362.dominion.Card.getCard(list_card41, cardName42);
    player39.discard(card43);
    gameState28.addPlayer(player39);
    org.cs362.dominion.Card[] card_array46 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card47 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card47, card_array46);
    org.cs362.dominion.GameState gameState49 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card47);
    java.util.List<org.cs362.dominion.Card> list_card50 = gameState49.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState49.gameBoard;
    card22.play(player39, gameState49);
    org.cs362.dominion.Card[] card_array53 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card54 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card54, card_array53);
    org.cs362.dominion.GameState gameState56 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card54);
    java.util.List<org.cs362.dominion.Card> list_card57 = gameState56.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i58 = gameState56.gameBoard;
    java.lang.String str59 = gameState56.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i60 = gameState56.gameBoard;
    card11.play(player39, gameState56);
    
    // Checks the contract:  compareTo-equals on card22 and card43
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card22 and card43", (card22.compareTo(card43) == 0) == card22.equals(card43));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }

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
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card13);
    java.util.List<org.cs362.dominion.Card> list_card16 = gameState15.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    java.lang.String str18 = gameState15.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState15.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card20 = gameState15.cards;
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "The board game is empty, you need to intialize the game!");
    player26.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName29 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card30 = org.cs362.dominion.Card.getCard(list_card28, cardName29);
    player26.discard(card30);
    gameState15.addPlayer(player26);
    org.cs362.dominion.Card[] card_array33 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card34, card_array33);
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card34);
    java.util.List<org.cs362.dominion.Card> list_card37 = gameState36.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState36.gameBoard;
    card9.play(player26, gameState36);
    org.cs362.dominion.Card[] card_array40 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card41, card_array40);
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card41);
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState43, "The board game is empty, you need to intialize the game!");
    player45.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card47 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName48 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card49 = org.cs362.dominion.Card.getCard(list_card47, cardName48);
    player45.discard(card49);
    org.cs362.dominion.Card[] card_array51 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card52 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card52, card_array51);
    org.cs362.dominion.GameState gameState54 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card52);
    java.util.List<org.cs362.dominion.Card> list_card55 = gameState54.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i56 = gameState54.gameBoard;
    java.util.List<org.cs362.dominion.Player> list_player57 = gameState54.players;
    card9.play(player45, gameState54);
    
    // Checks the contract:  compareTo-equals on card30 and card49
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card30 and card49", (card30.compareTo(card49) == 0) == card30.equals(card49));

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test3"); }

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
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card13);
    java.util.List<org.cs362.dominion.Card> list_card16 = gameState15.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    java.lang.String str18 = gameState15.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState15.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card20 = gameState15.cards;
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "The board game is empty, you need to intialize the game!");
    player26.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName29 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card30 = org.cs362.dominion.Card.getCard(list_card28, cardName29);
    player26.discard(card30);
    gameState15.addPlayer(player26);
    org.cs362.dominion.Card[] card_array33 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card34, card_array33);
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card34);
    java.util.List<org.cs362.dominion.Card> list_card37 = gameState36.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState36.gameBoard;
    card9.play(player26, gameState36);
    org.cs362.dominion.Card[] card_array40 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card41, card_array40);
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card41);
    java.util.List<org.cs362.dominion.Card> list_card44 = gameState43.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i45 = gameState43.gameBoard;
    java.lang.String str46 = gameState43.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState43.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card48 = gameState43.cards;
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    org.cs362.dominion.GameState gameState52 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card50);
    org.cs362.dominion.Player player54 = new org.cs362.dominion.Player(gameState52, "The board game is empty, you need to intialize the game!");
    player54.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card56 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName57 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card58 = org.cs362.dominion.Card.getCard(list_card56, cardName57);
    player54.discard(card58);
    gameState43.addPlayer(player54);
    org.cs362.dominion.Player[] player_array61 = new org.cs362.dominion.Player[] { player54 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player62 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player62, player_array61);
    org.cs362.dominion.Player player64 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player62);
    gameState36.players = arraylist_player62;
    
    // Checks the contract:  compareTo-equals on card58 and card30
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card58 and card30", (card58.compareTo(card30) == 0) == card58.equals(card30));

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test4"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.GameState gameState3 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card1);
    org.cs362.dominion.Player player5 = new org.cs362.dominion.Player(gameState3, "The board game is empty, you need to intialize the game!");
    org.cs362.dominion.Card[] card_array6 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card7, card_array6);
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card7);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "The board game is empty, you need to intialize the game!");
    player11.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName14 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card15 = org.cs362.dominion.Card.getCard(list_card13, cardName14);
    player11.discard(card15);
    int i17 = card15.getTreasureValue();
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    org.cs362.dominion.GameState gameState21 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card19);
    java.util.List<org.cs362.dominion.Card> list_card22 = gameState21.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i23 = gameState21.gameBoard;
    java.lang.String str24 = gameState21.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState21.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState21.cards;
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    org.cs362.dominion.GameState gameState30 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card28);
    org.cs362.dominion.Player player32 = new org.cs362.dominion.Player(gameState30, "The board game is empty, you need to intialize the game!");
    player32.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName35 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card36 = org.cs362.dominion.Card.getCard(list_card34, cardName35);
    player32.discard(card36);
    gameState21.addPlayer(player32);
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card40);
    java.util.List<org.cs362.dominion.Card> list_card43 = gameState42.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i44 = gameState42.gameBoard;
    card15.play(player32, gameState42);
    player5.discard(card15);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    org.cs362.dominion.GameState gameState50 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card48);
    java.util.List<org.cs362.dominion.Card> list_card51 = gameState50.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState50.gameBoard;
    java.lang.String str53 = gameState50.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState50.gameBoard;
    org.cs362.dominion.Card[] card_array55 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card56 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card56, card_array55);
    org.cs362.dominion.GameState gameState58 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card56);
    java.util.List<org.cs362.dominion.Card> list_card59 = gameState58.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i60 = gameState58.gameBoard;
    java.lang.String str61 = gameState58.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i62 = gameState58.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card63 = gameState58.cards;
    org.cs362.dominion.Card[] card_array64 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card65 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card65, card_array64);
    org.cs362.dominion.GameState gameState67 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card65);
    org.cs362.dominion.Player player69 = new org.cs362.dominion.Player(gameState67, "The board game is empty, you need to intialize the game!");
    player69.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card71 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName72 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card73 = org.cs362.dominion.Card.getCard(list_card71, cardName72);
    player69.discard(card73);
    gameState58.addPlayer(player69);
    gameState50.addPlayer(player69);
    player69.playTreasureCard();
    org.cs362.dominion.Card[] card_array78 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card79 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card79, card_array78);
    org.cs362.dominion.GameState gameState81 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card79);
    java.util.List<org.cs362.dominion.Card> list_card82 = gameState81.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i83 = gameState81.gameBoard;
    java.lang.String str84 = gameState81.toString();
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.Type type86 = org.cs362.dominion.Card.Type.TREASURE;
    java.util.List<org.cs362.dominion.Card> list_card87 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card85, type86);
    gameState81.cards = list_card85;
    card15.play(player69, gameState81);
    
    // Checks the contract:  compareTo-equals on card73 and card36
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card73 and card36", (card73.compareTo(card36) == 0) == card73.equals(card36));

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test5"); }

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
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card13);
    java.util.List<org.cs362.dominion.Card> list_card16 = gameState15.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState15.gameBoard;
    java.lang.String str18 = gameState15.toString();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState15.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card20 = gameState15.cards;
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card22);
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "The board game is empty, you need to intialize the game!");
    player26.buyCard();
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName29 = org.cs362.dominion.Card.CardName.Copper;
    org.cs362.dominion.Card card30 = org.cs362.dominion.Card.getCard(list_card28, cardName29);
    player26.discard(card30);
    gameState15.addPlayer(player26);
    org.cs362.dominion.Card[] card_array33 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card34, card_array33);
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card34);
    java.util.List<org.cs362.dominion.Card> list_card37 = gameState36.cards;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState36.gameBoard;
    card9.play(player26, gameState36);
    player26.printStateGame();
    
    // Checks the contract:  compareTo-equals on card9 and card30
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card9 and card30", (card9.compareTo(card30) == 0) == card9.equals(card30));

  }

}
