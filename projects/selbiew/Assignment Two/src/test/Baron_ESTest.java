/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:00:14 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Baron_ESTest extends Baron_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame(11);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) baron0, 11);
      player0.hand = deck0;
      baron0.dynamicValue(domGame0, player0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame((-18));
      Player player0 = domGame0.getWinner();
      Player[] playerArray0 = new Player[5];
      playerArray0[2] = player0;
      domGame0.players = playerArray0;
      player0.takeTurn(domGame0);
      baron0.play(domGame0, 2, 2);
      assertEquals((-18), domGame0.gameSeed);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame((-2349));
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) baron0, (-2349));
      assertEquals(0, deck0.points);
      
      player0.hand = deck0;
      baron0.play(domGame0, 1, (-2349));
      assertEquals(0.0F, baron0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Baron baron0 = new Baron();
      // Undeclared exception!
      try { 
        baron0.play((DomGame) null, 888, 888);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Baron", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame(8);
      LinkedList<Deck> linkedList0 = new LinkedList<Deck>();
      domGame0.basicCards = (List<Deck>) linkedList0;
      // Undeclared exception!
      try { 
        baron0.play(domGame0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame(2385);
      // Undeclared exception!
      try { 
        baron0.play(domGame0, 2385, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2385
         //
         assertThrownBy("Baron", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Baron baron0 = new Baron();
      // Undeclared exception!
      try { 
        baron0.dynamicValue((DomGame) null, (Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Baron", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame(3);
      Player player0 = domGame0.getWinner();
      Player player1 = domGame0.getWinner();
      player0.draw = player1.discard;
      // Undeclared exception!
      try { 
        baron0.dynamicValue(domGame0, player0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("Baron", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame(11);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) baron0, 11);
      player0.hand = deck0;
      player0.actionAI(domGame0);
      assertEquals(2, domGame0.playerCount);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Baron baron0 = new Baron();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      player0.takeTurn(domGame0);
      baron0.play(domGame0, 1, 0);
      assertEquals(0.0F, baron0.dynamicValue(), 0.01F);
  }
}
