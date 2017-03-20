package dominion;

/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:11:09 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Village_ESTest extends Village_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(0);
      Player player0 = new Player(0, domGame0.rand);
      Player[] playerArray0 = new Player[2];
      playerArray0[0] = player0;
      player0.takeTurn(domGame0);
      domGame0.players = playerArray0;
      village0.points = 10;
      village0.play(domGame0, 0, 28);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(0);
      Player player0 = new Player(0, domGame0.rand);
      Player[] playerArray0 = new Player[2];
      playerArray0[0] = player0;
      village0.value = 1;
      player0.takeTurn(domGame0);
      domGame0.players = playerArray0;
      village0.play(domGame0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(0);
      Player player0 = new Player(0, domGame0.rand);
      Player[] playerArray0 = new Player[2];
      playerArray0[0] = player0;
      player0.takeTurn(domGame0);
      village0.buys = 2;
      domGame0.players = playerArray0;
      village0.play(domGame0, 0, 0);
      assertEquals(0, domGame0.gameSeed);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Village village0 = new Village();
      // Undeclared exception!
      try { 
        village0.play((DomGame) null, 1439, 1439);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("Village", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(0);
      Player player0 = new Player(0, domGame0.rand);
      Player[] playerArray0 = new Player[2];
      playerArray0[0] = player0;
      player0.takeTurn(domGame0);
      player0.fillHand(domGame0.rand);
      domGame0.players = playerArray0;
      village0.play(domGame0, 0, 0);
      // Undeclared exception!
      try { 
        village0.play(domGame0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(13);
      // Undeclared exception!
      try { 
        village0.play(domGame0, 13, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         //assertThrownBy("Village", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(0);
      // Undeclared exception!
      try { 
        village0.dynamicValue(domGame0, (Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("Village", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Village village0 = new Village();
      DomGame domGame0 = new DomGame(0);
      Player player0 = new Player(0, domGame0.rand);
      float float0 = village0.dynamicValue(domGame0, player0);
      assertEquals(1.2F, float0, 0.01F);
      assertEquals(0.0F, village0.dynamicValue(), 0.01F);
  }
}
