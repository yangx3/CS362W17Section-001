/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:54:29 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Gold_ESTest extends Gold_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gold gold0 = new Gold();
      float float0 = gold0.dynamicValue((DomGame) null, (Player) null);
      assertEquals(5.0F, float0, 0.01F);
      assertEquals(3.0F, gold0.dynamicValue(), 0.01F);
  }
}
