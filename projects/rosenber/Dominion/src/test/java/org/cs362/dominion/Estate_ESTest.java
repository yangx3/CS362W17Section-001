/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:16:24 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import org.cs362.dominion.Estate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Estate_ESTest extends Estate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Estate estate0 = new Estate();
      assertEquals(1, estate0.getVictoryPoints());
  }
}
