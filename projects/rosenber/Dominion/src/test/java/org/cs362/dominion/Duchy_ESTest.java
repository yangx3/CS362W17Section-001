/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:15:58 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import org.cs362.dominion.Duchy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Duchy_ESTest extends Duchy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Duchy duchy0 = new Duchy();
      assertEquals("Duchy", duchy0.getName());
  }
}
