/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 14 17:13:45 GMT 2017
 */

package com.omalleya.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.omalleya.app.Card;
import com.omalleya.app.GameState;
import com.omalleya.app.Player;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 3, 3, 45);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card card0 = Card.sortCost(list0, list0, 15);
      assertEquals(8, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(6, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = new Card(card_CardName0, card_Type0, (-3890), 0, (-3890));
      Vector<Card> vector0 = new Vector<Card>();
      vector0.add(card0);
      Card.sortCost(vector0, vector0, 0);
      assertEquals("[ \tCopper-ACTION \t\t Cost: -3890 \t\t Score: 0 \tTreasure Value: -3890]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Duchy");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 1474, 0, 0);
      int int0 = card0.getTreasureValue();
      assertEquals(1474, card0.getCost());
      assertEquals(0, int0);
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = new Card(card_CardName0, card_Type0, (-2380), (-2380), (-2380));
      int int0 = card0.getTreasureValue();
      assertEquals(-2380, card0.getCost());
      assertEquals((-2380), int0);
      assertEquals(-2380, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayDeque<Card> arrayDeque0 = new ArrayDeque<Card>();
      List<Card> list0 = Card.createCards();
      Card card0 = Card.sortCost(arrayDeque0, list0, 0);
      int int0 = card0.getScore();
      assertEquals(0, int0);
      assertEquals(0, card0.getCost());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 2, 2, (-957));
      int int0 = card0.getScore();
      assertEquals(2, int0);
      assertEquals(2, card0.getCost());
      assertEquals(-957, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 8, 8, 8);
      int int0 = card0.getCost();
      assertEquals(8, card0.getScore());
      assertEquals(8, card0.getTreasureValue());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1860, 1860, 1860);
      card0.getCardName();
      assertEquals(1860, card0.getScore());
      assertEquals(1860, card0.getTreasureValue());
      assertEquals(1860, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      //  // Unstable assertion: assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1), (-1), (-960));
      linkedList0.add(card0);
      Card card1 = Card.getCard(linkedList0, card_CardName0);
      assertEquals(-960, card1.getTreasureValue());
      assertNotNull(card1);
      assertEquals(-1, card1.getCost());
      assertEquals(-1, card1.getScore());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.CardName card_CardName1 = Card.CardName.Mine;
      Card card0 = new Card(card_CardName1, card_Type0, 1246, 1246, 1246);
      Card card1 = new Card(card_CardName0, card_Type0, (-2380), (-2380), (-2380));
      int int0 = card0.compareTo(card1);
      assertEquals(-2380, card1.getScore());
      assertEquals(-2380, card1.getCost());
      assertEquals(-2380, card1.getTreasureValue());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1860, 1860, 1860);
      Card.CardName card_CardName1 = Card.CardName.Great_Hall;
      Card card1 = new Card(card_CardName1, card_Type0, 18, (-44), (-1666));
      int int0 = card0.compareTo(card1);
      assertEquals(-44, card1.getScore());
      assertEquals(-1666, card1.getTreasureValue());
      assertEquals((-15), int0);
      assertEquals(18, card1.getCost());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      // Undeclared exception!
      try { 
        Card.sortCost((Iterable<Card>) null, vector0, (-973));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      stack0.add((Card) null);
      // Undeclared exception!
      try { 
        Card.getCard(stack0, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1974, 1974, 1974);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.omalleya.app.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Stack<Card> stack0 = new Stack<Card>();
      Card card0 = Card.getCard(stack0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      card0.getCardName();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 3, 3, 45);
      card0.getType();
      assertEquals(3, card0.getCost());
      assertEquals(3, card0.getScore());
      assertEquals(45, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1860, 1860, 1860);
      int int0 = card0.getTreasureValue();
      assertEquals(1860, card0.getCost());
      assertEquals(1860, card0.getScore());
      assertEquals(1860, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 969);
      boolean boolean0 = card0.equals(card0);
      assertTrue(boolean0);
      assertEquals(0, card0.getScore());
      assertEquals(969, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1340, (-3890), 1340);
      Card card1 = new Card(card_CardName0, card_Type0, (-3890), 0, (-3890));
      boolean boolean0 = card0.equals(card1);
      assertEquals(-3890, card1.getCost());
      assertEquals(-3890, card0.getScore());
      assertEquals(-3890, card1.getTreasureValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>();
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>((Collection<? extends Card>) linkedHashSet0);
      List<Card> list0 = Card.filter(priorityQueue0, card_Type0);
      List<Card> list1 = Card.createCards();
      Card card0 = Card.sortCost(list1, list0, 0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card card0 = Card.sortCost(list0, list0, (-2040));
      assertNotNull(card0);
      
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(1, card0.getTreasureValue());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.filter(list0, card_Type0);
      //  // Unstable assertion: assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "fH=(Uv4>");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "ENUM$VALUES");
      card0.play(player1, gameState0);
      assertEquals(-627, card0.getCost());
      assertEquals(-2687, card0.getScore());
      assertEquals(-627, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "fH=(Uv4>");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(-627, card0.getCost());
      assertEquals(-627, card0.getTreasureValue());
      assertEquals(-2687, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-4578), (-279), (-279));
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "I*s+!#6c");
      gameState0.addPlayer(player0);
      Player player1 = player0.clone();
      card0.play(player1, gameState0);
      assertEquals(-279, card0.getScore());
      assertEquals(-279, card0.getTreasureValue());
      assertEquals(-4578, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-4578), (-279), (-279));
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "I*s+!#6c");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(-279, card0.getScore());
      assertEquals(-4578, card0.getCost());
      assertEquals(-279, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Q/[Y>I\u0006SR*{");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Q/[Y>I\u0006SR*{");
      gameState0.addPlayer(player0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " \tSilver-TREASURE \t\t Cost: 0 \t\t Score: 0 \tTreasure Value: 0");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getScore());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "ENUM$VALUES");
      card0.play(player0, gameState0);
      assertEquals(-2687, card0.getScore());
      assertEquals(-627, card0.getCost());
      assertEquals(-627, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "ENUM$VALUES");
      card0.play(player0, gameState0);
      assertEquals(-627, card0.getCost());
      assertEquals(-2687, card0.getScore());
      assertEquals(-627, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 3, 0, 3);
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field)");
      card0.play(player0, gameState0);
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getScore());
      assertEquals(3, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 5, 5, 5);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(5, card0.getScore());
      assertEquals(5, card0.getTreasureValue());
      assertEquals(5, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Duchy");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Duchy");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Duchy");
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1860, 1860, 1860);
      card0.compareTo(card0);
      assertEquals(1860, card0.getCost());
      assertEquals(1860, card0.getScore());
      assertEquals(1860, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Duchy");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      int int0 = card0.getScore();
      assertEquals(-627, card0.getTreasureValue());
      assertEquals(-627, card0.getCost());
      assertEquals((-2687), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      Card card1 = (Card)card0.clone();
      assertEquals(-2687, card1.getScore());
      assertEquals(-627, card1.getCost());
      assertEquals(-627, card1.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      String string0 = card0.toString();
      assertEquals(" \tMilitia-VICTORY \t\t Cost: -627 \t\t Score: -2687 \tTreasure Value: -627", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Militia;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-627), (-2687), (-627));
      int int0 = card0.getCost();
      assertEquals(-2687, card0.getScore());
      assertEquals(-627, card0.getTreasureValue());
      assertEquals((-627), int0);
  }
}