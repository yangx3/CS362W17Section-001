/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:42:37 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import org.cs362.dominion.board;
import org.cs362.dominion.gardens;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class gardens_ESTest extends gardens_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      gardens gardens0 = new gardens();
      gardens0.description();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      gardens gardens0 = new gardens();
      player[] playerArray0 = new player[1];
      board board0 = new board();
      gardens0.perform_attack(playerArray0, 0, board0);
  }
}
