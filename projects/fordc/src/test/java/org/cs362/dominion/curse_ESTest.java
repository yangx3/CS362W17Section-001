/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:41:21 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import org.cs362.dominion.board;
import org.cs362.dominion.curse;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class curse_ESTest extends curse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      curse curse0 = new curse();
      board board0 = new board();
      curse0.perform_attack((player[]) null, 0, board0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      curse curse0 = new curse();
      curse0.description();
  }
}
