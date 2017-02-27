/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 08:39:02 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.mainPlayer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class mainPlayer_ESTest extends mainPlayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom((-1250));
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        mainPlayer.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      mainPlayer.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      mainPlayer mainPlayer0 = new mainPlayer();
  }
}