/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 06:27:07 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, "$$ar7+K>L#JOaV(eD");
      player0.numActions = 2;
      player0.drawCard();
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      LinkedList<Card> linkedList0 = player0.deck;
      player0.hand = (List<Card>) linkedList0;
      player0.toString();
      LinkedList<Card> linkedList1 = player0.deck;
      player0.hand = (List<Card>) linkedList1;
      player0.deck = linkedList1;
      player0.toString();
      Randomness.nextRandomInt(197);
      List<Card> list0 = player0.discard;
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.numActions = 2;
      player0.scoreFor();
      player0.coins = 2;
      Card.Type.values();
      player0.scoreFor();
      int int0 = player0.gameOver;
      player0.drawCard();
      player0.discard((Card) null);
      player0.drawCard();
      player0.discard((Card) null);
      player0.playTtreasureCard();
      // Undeclared exception!
      try { 
        Card.CardName.valueOf("left in hand:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.CardName.left in hand:
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.gameOver = 905;
      player0.player_username = "";
      Player.numPlayers = 2;
      LinkedList<Card> linkedList0 = player0.deck;
      player0.hand = (List<Card>) linkedList0;
      player0.playKingdomCard();
      String string0 = player0.player_username;
      Randomness.reset(187L);
      player0.drawCard();
      player0.discard((Card) null);
      player0.playKingdomCard();
      player0.playTtreasureCard();
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "%}Va50qkv]V#k-");
      player0.numBuys = 2;
      List<Card> list0 = player0.playedCards;
      player0.playedCards = list0;
      player0.playTtreasureCard();
      Player player1 = new Player((GameState) null, "%}Va50qkv]V#k-");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.numBuys = 6181;
      player0.gameOver = 6181;
      player0.scoreFor();
      player0.coins = (-1218);
      player0.numActions = (-1024);
      List<Card> list0 = player0.playedCards;
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.gainFromBoard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((GameState) null, "$$ar7+K>L#JOaV(eD");
      player0.numActions = (-1303);
      player0.scoreFor();
      player0.coins = 2963;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Gold");
      Player player1 = new Player((GameState) null, "Gold");
      List<Card> list0 = player1.hand;
      player1.numActions = 0;
      player0.hand = list0;
      player0.drawCard();
      player0.gain((Card) null);
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((GameState) null, "*H6bHmWl+bAl!x #{=");
      player0.playTtreasureCard();
      player0.numBuys = (-2298);
      player0.drawCard();
      player0.discard((Card) null);
      player0.discard = null;
      int int0 = player0.numBuys;
      player0.buyCard();
      Card.Type.values();
      Randomness.reset((-2298));
      LinkedList<Card> linkedList0 = player0.deck;
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.coins = 875;
      player0.drawCard();
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((GameState) null, "D&&");
      player0.numActions = (-1381);
      player0.playKingdomCard();
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((GameState) null, "A7[2!%*3");
      player0.drawCard();
      player0.gain((Card) null);
      player0.buyCard();
      Card.CardName.values();
      player0.playKingdomCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.scoreFor();
      player0.drawCard();
      player0.playedCards = null;
      player0.player_username = "c-eMI";
      player0.discard((Card) null);
      player0.buyCard();
      player0.gameOver = 1;
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.buyCard();
      player0.numPlayers = 955;
      player0.buyCard();
      player0.player_username = "";
      player0.toString();
      player0.numActions = 0;
      player0.numBuys = 955;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Randomness.totalCallsToRandom = (-19);
      Player player0 = new Player((GameState) null, "&{pV");
      player0.coins = (-1068);
      player0.drawCard();
      player0.gameOver = (-19);
      player0.gain((Card) null);
      player0.buyCard();
      Card.CardName.values();
      Randomness.nextRandomInt((-18));
      List<Card> list0 = player0.discard;
      player0.toString();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName.values();
      Player player0 = new Player((GameState) null, "");
      player0.numActions = 1049;
      player0.toString();
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Zk^@1iErT");
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Player: ");
      player0.gameOver = 10;
      player0.gameOver = (-1);
      player0.scoreFor();
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.gameOver = 905;
      player0.player_username = "";
      player0.buyCard();
      player0.buyCard();
      Player.numPlayers = 2;
      LinkedList<Card> linkedList0 = player0.deck;
      player0.hand = (List<Card>) linkedList0;
      player0.playKingdomCard();
      String string0 = player0.player_username;
      Randomness.reset(174L);
      player0.drawCard();
      player0.initializePlayerTurn();
      player0.discard((Card) null);
      player0.playKingdomCard();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GameState gameState0 = null;
      String string0 = "Market";
      Player player0 = new Player((GameState) null, "Market");
      player0.playTtreasureCard();
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      int int0 = Player.numPlayers;
      GameState gameState0 = null;
      Player player0 = new Player((GameState) null, "]");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      int int0 = Player.numPlayers;
      GameState gameState0 = null;
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.numActions = 0;
      player0.scoreFor();
      player0.coins = 0;
      Card.Type.values();
      Player player1 = new Player((GameState) null, "Reveal cards from the player deck until player reveal 2 Treasure cards. Put those Treasure cards into player hand and discard the other revealed cards.");
      player1.scoreFor();
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      LinkedList<Card> linkedList0 = player0.deck;
      player0.hand = (List<Card>) linkedList0;
      player0.scoreFor();
      player0.gain((Card) null);
      player0.initializePlayerTurn();
      player0.discard((Card) null);
      Player player1 = new Player((GameState) null, "Deck: ");
      player0.discard((Card) null);
      player1.numBuys = 2;
      Randomness.reset(2599L);
      int int0 = player1.gameOver;
      player0.gain((Card) null);
      LinkedList<Card> linkedList1 = player0.deck;
      Player player2 = new Player((GameState) null, "Deck: ");
      player2.numBuys = 0;
      List<Card> list0 = player2.hand;
      player0.playKingdomCard();
      assertFalse(player0.equals((Object)player1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((GameState) null, "NY");
      List<Card> list0 = player0.playedCards;
      player0.discard = list0;
      player0.player_username = "NY";
      List<Card> list1 = player0.hand;
      player0.playedCards = list1;
      int int0 = 10;
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, "R");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.gainFromBoard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.playTtreasureCard();
      player0.drawCard();
      player0.numBuys = 2;
      player0.gain((Card) null);
      Card.CardName.values();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }
}
