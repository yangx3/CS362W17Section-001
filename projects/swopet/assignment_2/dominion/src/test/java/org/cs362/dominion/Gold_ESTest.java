/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:35:59 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Gold;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Gold_ESTest extends Gold_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gold gold0 = new Gold();
      // Undeclared exception!
      try { 
        gold0.play((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Gold", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gold gold0 = new Gold();
      GameState gameState0 = new GameState(2, 2);
      gameState0.phase = 1;
      Boolean boolean0 = gold0.play(gameState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Gold gold0 = new Gold();
      GameState gameState0 = new GameState(2, 2);
      Boolean boolean0 = gold0.play(gameState0);
      assertFalse(boolean0);
  }
}