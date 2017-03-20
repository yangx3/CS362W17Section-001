/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:14:51 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.ambassador;
import org.cs362.dominion.baron;
import org.cs362.dominion.board;
import org.cs362.dominion.card;
import org.cs362.dominion.copper;
import org.cs362.dominion.deck;
import org.cs362.dominion.discard;
import org.cs362.dominion.duchy;
import org.cs362.dominion.estate;
import org.cs362.dominion.gardens;
import org.cs362.dominion.hand;
import org.cs362.dominion.pile;
import org.cs362.dominion.player;
import org.cs362.dominion.province;
import org.cs362.dominion.smithy;
import org.cs362.dominion.village;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ambassador_ESTest extends ambassador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      deck deck0 = player0.player_deck;
      estate estate0 = (estate)deck0.draw_card();
      estate0.name = "duchy";
      hand hand0 = player0.player_hand;
      hand0.add_card(estate0);
      board board0 = new board();
      board0.num_players = 60;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      discard discard0 = player0.player_discard;
      playerArray0[1] = player0;
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      hand0.add_card(ambassador0);
      ambassador0.name = "mine";
      player0.player_hand = hand0;
      player player2 = new player();
      playerArray0[2] = player2;
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      duchy duchy0 = new duchy();
      hand0.add_card(duchy0);
      hand0.add_card(duchy0);
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      ambassador0.name = "curse";
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player player0 = new player();
      board board0 = new board();
      player[] playerArray0 = new player[9];
      playerArray0[0] = player0;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         assertThrownBy("java.util.concurrent.ThreadLocalRandom", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player player0 = new player();
      deck deck0 = player0.player_deck;
      estate estate0 = (estate)deck0.draw_card();
      hand hand0 = player0.player_hand;
      hand0.add_card(estate0);
      board board0 = new board();
      board0.num_players = 60;
      player[] playerArray0 = new player[9];
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      playerArray0[2] = player0;
      playerArray0[3] = player0;
      playerArray0[4] = player0;
      playerArray0[5] = player0;
      playerArray0[6] = player0;
      playerArray0[7] = player0;
      playerArray0[8] = player0;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 3, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player player0 = new player();
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      board board0 = new board();
      board0.num_players = 91;
      player[] playerArray0 = new player[9];
      playerArray0[0] = player0;
      playerArray0[3] = player0;
      ambassador0.name = "mine";
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 3, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      village village0 = new village();
      hand0.add_card(village0);
      card[] cardArray0 = new card[7];
      gardens gardens0 = new gardens();
      cardArray0[0] = (card) gardens0;
      hand0.player_hand = cardArray0;
      board board0 = new board();
      board0.num_players = 3;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      village village0 = new village();
      hand0.add_card(village0);
      board board0 = new board();
      board0.num_players = 3;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      board board0 = new board();
      board0.num_players = 60;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player player0 = new player();
      copper copper0 = new copper();
      hand hand0 = player0.player_hand;
      hand0.add_card(copper0);
      board board0 = new board();
      pile pile0 = new pile();
      board0.copper = pile0;
      board0.num_players = 60;
      player[] playerArray0 = new player[9];
      playerArray0[0] = player0;
      playerArray0[3] = player0;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 3, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      deck deck0 = playerArray0[0].player_deck;
      estate estate0 = (estate)deck0.draw_card();
      hand hand0 = player0.player_hand;
      hand0.add_card(estate0);
      card[] cardArray0 = new card[2];
      province province0 = new province();
      cardArray0[0] = (card) province0;
      hand0.player_hand = cardArray0;
      board board0 = new board();
      board0.num_players = 60;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player player0 = new player();
      copper copper0 = new copper();
      hand hand0 = player0.player_hand;
      hand0.add_card(copper0);
      board board0 = new board();
      board0.num_players = 60;
      player[] playerArray0 = new player[9];
      playerArray0[0] = player0;
      playerArray0[3] = player0;
      // Undeclared exception!
      try { 
        ambassador0.perform_attack(playerArray0, 3, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      deck deck0 = player0.player_deck;
      estate estate0 = (estate)deck0.draw_card();
      hand hand0 = player0.player_hand;
      hand0.add_card(estate0);
      board board0 = new board();
      board0.num_players = 1;
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      player player1 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      village village0 = new village();
      hand0.add_card(village0);
      hand0.add_card(ambassador0);
      card[] cardArray0 = new card[6];
      cardArray0[0] = (card) village0;
      cardArray0[1] = (card) village0;
      cardArray0[4] = (card) ambassador0;
      hand0.player_hand = cardArray0;
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      player player1 = new player();
      ambassador0.gold = (-2136);
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      village village0 = new village();
      hand0.add_card(ambassador0);
      hand0.add_card(ambassador0);
      playerArray0[2] = player0;
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
      board0.buy_great_hall(player0, board0);
      pile pile0 = board0.copper;
      player player2 = new player();
      assertFalse(player2.equals((Object)player0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      hand0.add_card(ambassador0);
      ambassador0.name = "curse";
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
      board board1 = new board();
      pile pile0 = board1.baron;
      board1.gold = pile0;
      board1.buy_great_hall(player0, board0);
      assertNotSame(board0, board1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player player0 = new player();
      estate estate0 = new estate();
      hand hand0 = player0.player_hand;
      hand0.add_card(estate0);
      hand0.add_card(estate0);
      player0.player_hand = hand0;
      board board0 = new board();
      player[] playerArray0 = new player[9];
      playerArray0[3] = player0;
      player0.print_player();
      ambassador0.perform_attack(playerArray0, 3, board0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      smithy smithy0 = new smithy();
      hand0.add_card(smithy0);
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      card[] cardArray0 = new card[7];
      gardens gardens0 = new gardens();
      cardArray0[0] = (card) gardens0;
      hand0.player_hand = cardArray0;
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      deck deck0 = new deck();
      estate estate0 = (estate)deck0.draw_card();
      player0.player_deck = deck0;
      hand hand0 = player0.player_hand;
      hand0.add_card(estate0);
      hand0.add_card(ambassador0);
      player player1 = new player();
      playerArray0[2] = player1;
      baron baron0 = new baron();
      hand0.add_card(baron0);
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
      board0.buy_great_hall(player1, board0);
      board0.buy_mine(player0, board0);
      board0.buy_feast(playerArray0[0], board0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      hand hand0 = player0.player_hand;
      hand0.add_card(ambassador0);
      card[] cardArray0 = new card[2];
      province province0 = new province();
      cardArray0[0] = (card) province0;
      hand0.player_hand = cardArray0;
      board board0 = new board();
      ambassador0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ambassador ambassador0 = new ambassador();
      ambassador0.description();
  }
}
