/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 25 10:06:13 PST 2017
 */

package com.tris;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Game_ESTest extends Game_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Player player0 = new Player((Game) null, "`e|`1XT1X`0 ");
      List<Card> list0 = player0.played;
      Game game0 = new Game(list0);
      HashMap<Card, Integer> hashMap0 = game0.board;
      Integer integer0 = new Integer(3);
      hashMap0.put((Card) null, integer0);
      game0.getRemaining((Card) null);
  }

  @Test
  public void test01()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game(arrayList0);
      HashMap<Card, Integer> hashMap0 = game0.embargo;
      Integer integer0 = Integer.valueOf((-549));
      hashMap0.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        game0.listEmbargo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Card", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      HashMap<Card, Integer> hashMap0 = game0.board;
      hashMap0.put((Card) null, (Integer) null);
      // Undeclared exception!
      try { 
        game0.listBoard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Game", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Game game0 = new Game((List<Card>) null);
      // Undeclared exception!
      try { 
        game0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game(arrayList0);
      game0.isGameOver();
  }

  @Test
  public void test05()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game(arrayList0);
      game0.initGame();
      game0.isGameOver();
  }

  @Test
  public void test06()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      Game game0 = new Game(stack0);
      Player player0 = new Player(game0, "");
      game0.addPlayer(player0);
      game0.getWinners();
  }

  @Test
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      game0.initGame();
      game0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        game0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Game", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player((Game) null, "R6e3q4Ecr6)#(Vr");
      List<Card> list0 = player0.hand;
      Game game0 = new Game(list0);
      game0.play();
  }

  @Test
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      game0.initGame();
      // Undeclared exception!
      try { 
        game0.play();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Game game0 = new Game(arrayList0);
      game0.initGame();
      List<Card> list0 = game0.listBoard();
      assertEquals(1, list0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      game0.initGame();
      List<Card> list1 = game0.listEmbargo();
      assertEquals(10, list1.size());
  }

  @Test
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.generate();
      Game game0 = new Game(list0);
      game0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        game0.initGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Game", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Player player0 = new Player((Game) null, "`e|`1XT1X`0 ");
      List<Card> list0 = player0.played;
      Game game0 = new Game(list0);
      // Undeclared exception!
      try { 
        game0.getRemaining((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.tris.Game", e);
      }
  }
}
