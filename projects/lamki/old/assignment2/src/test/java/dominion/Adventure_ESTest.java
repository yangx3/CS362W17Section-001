/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 19 18:46:29 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Adventure;
import dominion.Game;
import dominion.Player;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Adventure_ESTest extends Adventure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Adventure adventure0 = new Adventure(10);
      MockRandom mockRandom0 = new MockRandom(1L);
      Player player0 = new Player("=r$XjOH2!^Wx<-C.");
      adventure0.play((-1), mockRandom0, 0, player0, (Game) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Adventure adventure0 = new Adventure(1638);
      MockRandom mockRandom0 = new MockRandom();
      Player player0 = new Player("v%");
      Game game0 = new Game();
      adventure0.play(15, mockRandom0, 1638, player0, game0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Adventure adventure0 = new Adventure(1638);
      MockRandom mockRandom0 = new MockRandom();
      Player player0 = new Player("v%");
      Game game0 = new Game();
      adventure0.play(14, mockRandom0, 14, player0, game0);
      adventure0.play(7, mockRandom0, 7, player0, game0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Adventure adventure0 = new Adventure(8);
      Player player0 = new Player("Name: ");
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        adventure0.play(13, mockRandom0, 13, player0, (Game) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Adventure", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((long) 12);
      Game game0 = new Game();
      Adventure adventure0 = new Adventure(12);
      Player player0 = new Player("/=oHp7j#\"Kw.\"a");
      adventure0.play(12, mockRandom0, 12, player0, game0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adventure adventure0 = new Adventure(8);
      Player player0 = new Player("Name: ");
      Game game0 = new Game();
      MockRandom mockRandom0 = new MockRandom();
      adventure0.play(11, mockRandom0, 11, player0, game0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adventure adventure0 = new Adventure(1638);
      MockRandom mockRandom0 = new MockRandom();
      Player player0 = new Player("v%");
      Game game0 = new Game();
      adventure0.play(9, mockRandom0, 7, player0, game0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Adventure adventure0 = new Adventure(2766);
      Player player0 = new Player("");
      Game game0 = new Game();
      adventure0.play(8, (Random) null, 8, player0, game0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Game game0 = new Game();
      Adventure adventure0 = new Adventure(7);
      Player player0 = new Player(" cards");
      adventure0.play(7, mockRandom0, 7, player0, game0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Adventure adventure0 = new Adventure(10);
      MockRandom mockRandom0 = new MockRandom(1L);
      Player player0 = new Player("=r$XjOH2!^Wx<-C.");
      adventure0.play(10, mockRandom0, 2438, player0, (Game) null);
      adventure0.play(6, mockRandom0, 0, player0, (Game) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Adventure adventure0 = new Adventure(10);
      MockRandom mockRandom0 = new MockRandom(1L);
      Player player0 = new Player("=r$XjOH2!^Wx<-C.");
      adventure0.play(6, mockRandom0, 0, player0, (Game) null);
  }
}
