/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 01 10:19:17 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      gameState0.clone();
      Card.CardName card_CardName1 = Card.CardName.Silver;
      Card card0 = Card.getCard(list0, card_CardName1);
      Card.getCard(gameState0.cards, card_CardName1);
      Player player0 = new Player(gameState0, "Mine");
      Player player1 = player0.clone();
      player1.gain(card0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.getCard(list0, card_CardName0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      GameState gameState0 = new GameState(list0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      gameState0.cards = (List<Card>) linkedList0;
      Player player0 = new Player(gameState0, "$r YGz>\"");
      player0.hand = gameState0.cards;
      gameState0.clone();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.players = gameState1.players;
      Player player0 = new Player(gameState1, "B");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>();
      List<Card> list0 = Card.createCards();
      Card.Type.values();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      gameState0.isGameOver();
      GameState gameState1 = gameState0.clone();
      gameState0.gameBoard = gameState1.gameBoard;
      Player player0 = new Player(gameState1, "");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.getCard(list0, card_CardName0);
      Vector<Card> vector0 = new Vector<Card>((Collection<? extends Card>) list0);
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName1 = Card.CardName.Province;
      Card.getCard(list0, card_CardName1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.getCard(list0, card_CardName0);
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Gold;
      Card.getCard(list0, card_CardName1);
      Card.CardName card_CardName2 = Card.CardName.Feast;
      Card.getCard(list0, card_CardName2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Copper;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list1 = Card.filter(list0, card_Type0);
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Duchy;
      Card.getCard(list0, card_CardName1);
      Card.createCards();
      Card.createCards();
      Card.Type card_Type1 = Card.Type.VICTORY;
      Card.filter(list1, card_Type1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.CardName.values();
      Vector<Card> vector0 = new Vector<Card>();
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(vector0, card_Type0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodel;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "C1Mz*x8/Jv'[");
      player0.hand = gameState0.cards;
      Card.CardName card_CardName0 = Card.CardName.Remodel;
      Card.getCard(list1, card_CardName0);
      GameState gameState1 = new GameState(gameState0.cards);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "C1Mz*x8/Jv'[");
      player0.hand = gameState0.cards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.getCard(list1, card_CardName0);
      GameState gameState1 = new GameState(gameState0.cards);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.getCard(list0, card_CardName0);
      Card.getCard(list0, card_CardName0);
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "]ps.l$E+nhZS,4x2F");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Copper;
      Card.getCard(list0, card_CardName1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "Ambassador");
      player0.clone();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      gameState0.clone();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.getCard(list0, card_CardName0);
      Card.Type card_Type0 = Card.Type.ACTION;
      Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "C1Mz*x8/Jv'[");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      String string0 = "$r YGz>\"";
      gameState0.clone();
      Card.CardName card_CardName1 = Card.CardName.Silver;
      Card.getCard(list0, card_CardName1);
      Card.getCard(gameState0.cards, card_CardName1);
      Player player0 = new Player(gameState0, "Mine");
      Player player1 = player0.clone();
      player1.gain(card0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "$r YGz>\"");
      player0.hand = list0;
      gameState0.clone();
      Card.CardName card_CardName1 = Card.CardName.Silver;
      Card.getCard(list0, card_CardName1);
      Card.getCard(gameState0.cards, card_CardName1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      gameState0.cards = (List<Card>) linkedList0;
      Player player0 = new Player(gameState0, "%h:%m:%s%z");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.players = gameState1.players;
      Player player0 = new Player(gameState1, "B");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "$VALUES");
      player0.discard = gameState1.cards;
  }
}
