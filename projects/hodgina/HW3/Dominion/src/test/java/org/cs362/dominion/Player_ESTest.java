/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:51:39 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      Player player1 = player0.clone();
      player1.numBuys = 574;
      player1.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.endTurn();
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      Player player1 = player0.clone();
      player1.endTurn();
      player1.coins = 3120;
      List<Card> list0 = Card.createCards();
      player1.hand = list0;
      player1.playKingdomCard();
      GameState gameState0 = new GameState(player1.hand);
      // Undeclared exception!
      try { 
        player1.buyCard(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "tt&I");
      player0.coins = (-25);
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "G/cv4)q_!m");
      Player player1 = player0.clone();
      player1.numActions = (-514);
      player1.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>(15, 15);
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, ":ey8D!(n,");
      player0.discard = (List<Card>) vector0;
      vector0.add((Card) null);
      player0.coins = 15;
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "]%*e/edx,yj_");
      player0.printStateGame();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) list0);
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list1 = Card.filter(linkedList0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "hjk4%J(kDlL6W''f");
      Player player1 = player0.clone();
      player1.discard = list1;
      player1.drawCard();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "--%M%z");
      Card.CardName card_CardName0 = Card.CardName.Gardends;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.gain(card0);
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((GameState) null, "@yfphHsxj'7m;J{*");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.discard(card0);
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((GameState) null, "bus");
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.playTreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      Player player1 = player0.clone();
      player1.numActions = 574;
      List<Card> list0 = Card.createCards();
      player1.hand = list0;
      // Undeclared exception!
      try { 
        player1.playKingdomCard();
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
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "Reveal cards from the player deck until player reveal 2 Treasure cards. Put those Treasure cards into player hand and discard the other revealed cards.");
      Player player1 = player0.clone();
      player1.discard((Card) null);
      player1.hand = gameState0.cards;
      linkedList0.add((Card) null);
      // Undeclared exception!
      try { 
        player1.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, "        Playing TreasureCards      ");
      List<Card> list0 = Card.createCards();
      player0.playedCards = list0;
      List<Card> list1 = player0.discard;
      player0.gain((Card) null);
      player0.playedCards = list1;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "\"@P2^<oa");
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.endTurn();
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
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "hjk4%J(kDlL6W''f");
      GameState gameState1 = new GameState(list0);
      Player player1 = player0.clone();
      player1.hand = gameState1.cards;
      player1.discard((Card) null);
      // Undeclared exception!
      try { 
        player1.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, ";:W)Q`:Jl?j[");
      Player player1 = player0.clone();
      player1.playedCards = null;
      // Undeclared exception!
      try { 
        player1.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
/*
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      player0.discard(card0);
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.playTreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }
*/
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((GameState) null, "        Playing TreasureCards      ");
      player0.gain((Card) null);
      player0.initializePlayerTurn();
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((GameState) null, "        Playing TreasureCards      ");
      List<Card> list0 = Card.createCards();
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) list0);
      player0.playedCards = (List<Card>) linkedList0;
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, " to use in Buy Round.");
      player0.coins = 3923;
      player0.buyCard(gameState0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((GameState) null, "G/cv4)q_!m");
      player0.buyCard((GameState) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "Reveal cards from the player deck until player reveal 2 Treasure cards. Put those Treasure cards into player hand and discard the other revealed cards.");
      player0.playTreasureCard();
  }
/*
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      player0.discard(card0);
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.playTreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }
*/
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      player0.discard((Card) null);
      player0.initializePlayerTurn();
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
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      player0.initializePlayerTurn();
      int int0 = player0.scoreFor();
      assertEquals(10, int0);
  }
/*
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player((GameState) null, "@yfphHsxj'7m;J{*");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      LinkedList<Card> linkedList0 = player0.deck;
      linkedList0.add(card0);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
*/
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player((GameState) null, "G'a\"g2y^(4|");
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      int int0 = player0.scoreFor();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.endTurn();
      player0.playKingdomCard();
  }
/*
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player((GameState) null, "@yfphHsxj'7m;J{*");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      LinkedList<Card> linkedList0 = player0.deck;
      linkedList0.add(card0);
      Card card1 = player0.drawCard();
      assertNull(card1);
  }
*/
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player((GameState) null, "HMS");
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
/*
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      player0.discard(card0);
      gameState0.addPlayer(player0);
      // Undeclared exception!
      HashMap<Player, Integer> hashMap0 = null;
      try { 
        hashMap0 = gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
  */
}
