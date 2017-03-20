/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:56:53 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card[] cardArray0 = Card.values();
      assertNotNull(cardArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card card0 = Card.valueOf("Copper");
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      ArrayList<Card> arrayList0 = Card.list(cardArray0);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = Card.Smithy;
      boolean boolean0 = card0.isAction();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = Card.Smithy;
      int int0 = card0.coins();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant cs362.dominion.Card.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.list((Card[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card[] cardArray0 = new Card[8];
      ArrayList<Card> arrayList0 = Card.list(cardArray0);
      assertEquals(8, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = Card.Copper;
      boolean boolean0 = card0.isTreasure();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = Card.Silver;
      boolean boolean0 = card0.isTreasure();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = Card.valueOf("CouncilRoom");
      int int0 = card0.cost();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = Card.Mine;
      int int0 = card0.coins();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = Card.CouncilRoom;
      boolean boolean0 = card0.isAction();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = Card.Gardens;
      int int0 = card0.score();
      assertEquals(0, int0);
  }
}
