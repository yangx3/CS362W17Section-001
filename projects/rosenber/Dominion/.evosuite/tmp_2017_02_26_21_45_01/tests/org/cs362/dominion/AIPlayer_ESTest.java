/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:52:51 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.AIPlayer;
import org.cs362.dominion.Board;
import org.cs362.dominion.Card;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AIPlayer_ESTest extends AIPlayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer(840);
      aIPlayer0.hand = null;
      // Undeclared exception!
      try { 
        aIPlayer0.discardCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.AIPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer(446);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        aIPlayer0.buyCard(board0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer((-2));
      Card card0 = aIPlayer0.playCard();
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer((-2));
      aIPlayer0.addToHand((Card) null);
      // Undeclared exception!
      try { 
        aIPlayer0.playCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.AIPlayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer(446);
      aIPlayer0.discardCard();
      assertEquals(0, aIPlayer0.getMoney());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer(0);
      aIPlayer0.addToHand((Card) null);
      // Undeclared exception!
      try { 
        aIPlayer0.discardCard();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AIPlayer aIPlayer0 = new AIPlayer((-724));
      // Undeclared exception!
      try { 
        aIPlayer0.buyCard((Board) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.AIPlayer", e);
      }
  }
}
