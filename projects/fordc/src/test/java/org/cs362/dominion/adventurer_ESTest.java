/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:36:12 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.adventurer;
import org.cs362.dominion.board;
import org.cs362.dominion.hand;
import org.cs362.dominion.pile;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class adventurer_ESTest extends adventurer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      adventurer adventurer1 = new adventurer();
      adventurer adventurer2 = new adventurer();
      adventurer adventurer3 = new adventurer();
      adventurer2.description();
      adventurer adventurer4 = new adventurer();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      hand hand0 = new hand();
      player0.player_hand = hand0;
      playerArray0[1] = player1;
      player player2 = new player();
      playerArray0[2] = player2;
      board board0 = new board();
      pile pile0 = board0.village;
      board0.salvager = pile0;
      pile pile1 = board0.feast;
      board0.baron = pile1;
      adventurer4.perform_attack(playerArray0, 0, board0);
      adventurer adventurer5 = new adventurer();
      adventurer adventurer6 = new adventurer();
      adventurer6.action = 9;
      adventurer5.perform_attack(playerArray0, 0, board0);
      adventurer5.perform_attack(playerArray0, 0, board0);
      // Undeclared exception!
      try { 
        adventurer6.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      playerArray0[1] = player1;
      player player2 = new player();
      playerArray0[2] = player2;
      board board0 = new board();
      adventurer0.perform_attack(playerArray0, 2, board0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      player[] playerArray0 = new player[0];
      board board0 = new board();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      adventurer adventurer1 = new adventurer();
      adventurer adventurer2 = new adventurer();
      adventurer adventurer3 = new adventurer();
      adventurer2.description();
      adventurer adventurer4 = new adventurer();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      hand hand0 = new hand();
      player0.player_hand = hand0;
      playerArray0[1] = player1;
      player player2 = new player();
      playerArray0[2] = player2;
      board board0 = new board();
      pile pile0 = board0.village;
      board0.salvager = pile0;
      pile pile1 = board0.feast;
      board0.baron = pile1;
      adventurer4.perform_attack(playerArray0, 0, board0);
      adventurer adventurer5 = new adventurer();
      adventurer adventurer6 = new adventurer();
      adventurer5.perform_attack(playerArray0, 0, board0);
      adventurer5.perform_attack(playerArray0, 0, board0);
      // Undeclared exception!
      try { 
        adventurer6.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      adventurer0.description();
      adventurer0.victory_points = 2;
      board board0 = new board();
      // Undeclared exception!
      try { 
        adventurer0.perform_attack((player[]) null, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.adventurer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      adventurer adventurer1 = new adventurer();
      adventurer1.description();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      playerArray0[0] = player0;
      adventurer0.cost = 1;
      player0.buy = 1;
      adventurer0.name = "plg]|/";
      board board0 = new board();
      pile pile0 = board0.smithy;
      board0.province = pile0;
      adventurer0.perform_attack(playerArray0, 0, board0);
      adventurer0.description();
      adventurer adventurer1 = new adventurer();
      // Undeclared exception!
      try { 
        adventurer0.perform_attack(playerArray0, 1, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("org.cs362.dominion.adventurer", e);
      }
  }
}