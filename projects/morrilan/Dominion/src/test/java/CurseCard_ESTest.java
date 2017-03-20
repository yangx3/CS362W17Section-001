/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:48:15 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CurseCard_ESTest extends CurseCard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CurseCard curseCard0 = new CurseCard("NJ", 0, "NJ");
      assertEquals((-1), curseCard0.curseValue);
      
      curseCard0.curseValue = 0;
      int int0 = curseCard0.getValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CurseCard curseCard0 = new CurseCard("NJ", 0, "NJ");
      curseCard0.curseValue = 769;
      int int0 = curseCard0.getValue();
      assertEquals(769, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CurseCard curseCard0 = new CurseCard("NJ", 0, "NJ");
      int int0 = curseCard0.getValue();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CurseCard curseCard0 = new CurseCard("D", 11, "D");
      curseCard0.getAction();
      assertEquals((-1), curseCard0.curseValue);
  }
}
