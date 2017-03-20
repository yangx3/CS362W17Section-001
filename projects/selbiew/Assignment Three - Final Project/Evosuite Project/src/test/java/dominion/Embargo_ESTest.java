package dominion;

/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:08:17 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Embargo_ESTest extends Embargo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom(10);
      Embargo embargo0 = new Embargo();
      DomGame domGame0 = new DomGame((-1382));
      // Undeclared exception!
      try { 
        embargo0.play(domGame0, 10, (-1382));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         //assertThrownBy("Embargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Embargo embargo0 = new Embargo();
      // Undeclared exception!
      try { 
        embargo0.play((DomGame) null, 0, 2824);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("Embargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Random.setNextRandom((-1338));
      Embargo embargo0 = new Embargo();
      DomGame domGame0 = new DomGame((-1338));
      // Undeclared exception!
      try { 
        embargo0.play(domGame0, 1, (-1338));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Embargo embargo0 = new Embargo();
      DomGame domGame0 = new DomGame((-1));
      // Undeclared exception!
      try { 
        embargo0.play(domGame0, 0, 135);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 135, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Embargo embargo0 = new Embargo();
      DomGame domGame0 = new DomGame((-1338));
      Player player0 = domGame0.getWinner();
      float float0 = embargo0.dynamicValue(domGame0, player0);
      assertEquals(0.5F, float0, 0.01F);
      assertEquals(0.0F, embargo0.dynamicValue(), 0.01F);
  }
}
