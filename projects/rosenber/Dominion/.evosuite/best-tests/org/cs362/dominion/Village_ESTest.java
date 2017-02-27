/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:15:45 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Board;
import org.cs362.dominion.Player;
import org.cs362.dominion.Village;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Village_ESTest extends Village_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Village village0 = new Village();
      ArrayList<Player> arrayList0 = new ArrayList<Player>(83);
      Player player0 = new Player((String) null, false);
      player0.giveCard(village0);
      Board board0 = new Board();
      village0.Action(arrayList0, player0, board0);
      assertEquals(2, player0.getActions());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Village village0 = new Village();
      Board board0 = new Board();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      // Undeclared exception!
      try { 
        village0.Action(arrayList0, (Player) null, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Village", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Village village0 = new Village();
      ArrayList<Player> arrayList0 = new ArrayList<Player>(83);
      Player player0 = new Player((String) null, false);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        village0.Action(arrayList0, player0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
