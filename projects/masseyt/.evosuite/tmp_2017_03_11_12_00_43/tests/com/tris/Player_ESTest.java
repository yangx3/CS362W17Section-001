/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 11 20:07:26 GMT 2017
 */

package com.tris;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tris.Card;
import com.tris.Game;
import com.tris.Player;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, "g)'");
      player0.buys = 1;
      player0.buy();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, "You play a Council Room: +4 Cards, +1 Buy, Each other player draws a card.");
      player0.discard = list0;
      player0.coins = 5;
      Card card0 = player0.draw();
      assertEquals(Card.Name.COPPER, card0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((Game) null, "#,7B]?_");
      int int0 = player0.score();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      player0.discard = list0;
      player0.initPlayer();
      Player.listCards(list0);
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game(arrayList0);
      Player player0 = new Player(game0, "V|r9");
      player0.played = null;
      // Undeclared exception!
      try { 
        player0.score();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((Game) null, "#,7Biy_");
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.playAction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Player.listCards((List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((Game) null, (String) null);
      // Undeclared exception!
      try { 
        player0.initPlayer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((Game) null, "#,7B]?_");
      List<Card> list0 = Card.generate();
      player0.played = list0;
      player0.discard = player0.played;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game(arrayList0);
      Player player0 = new Player(game0, "|");
      // Undeclared exception!
      try { 
        player0.draw();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Game game0 = new Game(linkedList0);
      Player player0 = new Player(game0, " costs more than 5 coins.");
      // Undeclared exception!
      try { 
        player0.discard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((Game) null, "Your current hand: ");
      // Undeclared exception!
      try { 
        player0.buy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.generate();
      List<Card> list1 = Player.listCards(list0);
      assertSame(list0, list1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((Game) null, "#,7B]?_");
      List<Card> list0 = Card.generate();
      player0.played = list0;
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      player0.discard = list0;
      player0.initPlayer();
      player0.endTurn();
      assertEquals(5, list0.size());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      player0.discard = list0;
      player0.initPlayer();
      player0.buy();
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      player0.buy();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, "You play a Council Room: +4 Cards, +1 Buy, Each other player draws a card.");
      player0.discard = list0;
      int int0 = player0.score();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((Game) null, "#,7Biy_");
      List<Card> list0 = Card.generate();
      player0.played = list0;
      player0.playAction();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, "g)'");
      player0.hand = game0.cards;
      player0.playAction();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      player0.discard = list0;
      player0.initPlayer();
      player0.playAction();
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, ";1ybn0;io");
      Card.Name card_Name0 = Card.Name.REMODEL;
      Card card0 = Card.getCard(list0, card_Name0);
      // Undeclared exception!
      try { 
        player0.discard(card0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      Player player0 = new Player(game0, "You play a Council Room: +4 Cards, +1 Buy, Each other player draws a card.");
      player0.discard = list0;
      Card card0 = player0.draw();
      // Undeclared exception!
      try { 
        player0.gain(card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Player", e);
      }
  }
}
