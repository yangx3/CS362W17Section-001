package dominion;

/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:48:27 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class DomGame_ESTest extends DomGame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DomGame domGame0 = new DomGame(0);
      domGame0.playerCount = 0;
      domGame0.play();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DomGame domGame0 = new DomGame(991);
      Player[] playerArray0 = new Player[6];
      Player player0 = domGame0.getWinner();
      playerArray0[1] = player0;
      playerArray0[1].totalPoints();
      domGame0.getWinner();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DomGame domGame0 = new DomGame(1819);
      LinkedList<Deck> linkedList0 = new LinkedList<Deck>();
      domGame0.kingdomCards = (List<Deck>) linkedList0;
      Smithy smithy0 = new Smithy();
      Deck deck0 = new Deck((Card) smithy0, (-1077));
      linkedList0.add(deck0);
      // Undeclared exception!
      try { 
        domGame0.gameOver();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DomGame domGame0 = new DomGame(0);
      DomGame domGame1 = new DomGame(1);
      // Undeclared exception!
      try { 
        domGame0.setupTable();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DomGame domGame0 = new DomGame((-323));
      domGame0.rand = null;
      // Undeclared exception!
      try { 
        domGame0.setupTable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DomGame domGame0 = new DomGame((-2424));
      domGame0.kingdomCards = null;
      // Undeclared exception!
      try { 
        domGame0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DomGame domGame0 = new DomGame(0);
      List<Deck> list0 = domGame0.basicCards;
      domGame0.kingdomCards = list0;
      // Undeclared exception!
      try { 
        domGame0.play();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 7
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DomGame domGame0 = new DomGame(1412);
      domGame0.playerCount = 1412;
      // Undeclared exception!
      try { 
        domGame0.play();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         ////assertThrownBy("DomGame", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DomGame domGame0 = new DomGame(0);
      domGame0.players = null;
      // Undeclared exception!
      try { 
        domGame0.getWinner();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         ////assertThrownBy("DomGame", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DomGame domGame0 = new DomGame(0);
      domGame0.players = domGame0.players;
      Player[] playerArray0 = new Player[0];
      domGame0.players = playerArray0;
      // Undeclared exception!
      try { 
        domGame0.getWinner();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         ////assertThrownBy("DomGame", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DomGame domGame0 = new DomGame(335);
      domGame0.basicCards = null;
      // Undeclared exception!
      try { 
        domGame0.gameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         ////assertThrownBy("DomGame", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DomGame domGame0 = new DomGame((-914));
      domGame0.setupTable();
      DomGame domGame1 = null;
      try {
        domGame1 = new DomGame(0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DomGame domGame0 = new DomGame(335);
      boolean boolean0 = domGame0.gameOver();
      assertEquals(335, domGame0.gameSeed);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DomGame domGame0 = new DomGame(17);
      assertEquals(2, domGame0.playerCount);
      
      domGame0.playerCount = (-1846);
      domGame0.play();
      assertEquals(17, domGame0.gameSeed);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DomGame domGame0 = new DomGame(1412);
      // Undeclared exception!
      try { 
        domGame0.play();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Random.setNextRandom((-681));
      DomGame domGame0 = new DomGame((-681));
      domGame0.setupTable();
      assertEquals((-681), domGame0.gameSeed);
      assertFalse(domGame0.gameOver());
      assertEquals(2, domGame0.playerCount);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DomGame domGame0 = new DomGame(335);
      LinkedList<Deck> linkedList0 = new LinkedList<Deck>();
      domGame0.kingdomCards = (List<Deck>) linkedList0;
      Deck deck0 = new Deck();
      linkedList0.add(deck0);
      // Undeclared exception!
      try { 
        domGame0.gameOver();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }
}
