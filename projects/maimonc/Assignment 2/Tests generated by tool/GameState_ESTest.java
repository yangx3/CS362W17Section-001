/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 22 21:25:48 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.getWinners();
      Card.CardName.values();
      gameState0.getWinners();
      Card.CardName.values();
      Player player0 = new Player(gameState0, "'s hand:");
      player0.hand = (List<Card>) arrayList0;
      player0.hand = (List<Card>) arrayList0;
      gameState0.addPlayer(player0);
      player0.printStateGame();
      gameState0.play();
      player0.numActions = 0;
      gameState0.initializeGame();
      gameState0.addPlayer(player0);
      gameState0.getWinners();
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.play();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(vector0, card_CardName0);
      Card.getCard(vector0, card_CardName0);
      Integer integer0 = new Integer((-1));
      hashMap0.put((Card) null, integer0);
      Player player0 = new Player(gameState0, "org.cs362.dominion.Card$CardName");
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      linkedList0.parallelStream();
      Integer integer0 = new Integer(60);
      Integer.getInteger(",^)J?O{~#'", 60);
      Integer.compareUnsigned(60, 30);
      hashMap0.put((Card) null, integer0);
      gameState0.isGameOver();
      // Undeclared exception!
      try { 
        Card.Type.valueOf("6(AiSh~?5`ic4^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.6(AiSh~?5`ic4^
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.initializeGame();
      gameState0.returnPlayer("X o9*?nA)^!D");
      Card.CardName card_CardName0 = Card.CardName.Salvager;
      Card.getCard(stack0, card_CardName0);
      stack0.add((Card) null);
      gameState0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.getWinners();
      gameState0.toString();
      gameState0.getWinners();
      Player player0 = new Player(gameState0, "The board game is embty you need to intialize the game!!!!");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.returnPlayer("");
      gameState0.toString();
      gameState0.returnPlayer("D\"_T8X3L&,");
      gameState0.isGameOver();
      Randomness.random = null;
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 2, 2, 980);
      Integer integer0 = new Integer(980);
      hashMap0.put(card0, integer0);
      gameState0.gameBoard = hashMap0;
      Card.CardName card_CardName1 = Card.CardName.Curse;
      Card.getCard(vector0, card_CardName1);
      Card.getCard(vector0, card_CardName1);
      gameState0.play();
      Card.Type.values();
      gameState0.isGameOver();
      gameState0.toString();
      gameState0.initializeGame();
      Randomness.reset(2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      gameState0.returnPlayer("");
      gameState0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState0.returnPlayer("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>((Map<? extends Card, ? extends Integer>) gameState0.gameBoard);
      gameState0.gameBoard = hashMap0;
      HashMap<Card, Integer> hashMap1 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.VICTORY;
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName1 = Card.CardName.Silver;
      Card.getCard(linkedList0, card_CardName1);
      hashMap1.put((Card) null, (Integer) null);
      Card card0 = new Card(card_CardName0, card_Type0, (-799), (-799), 0);
      arrayList0.add(card0);
      gameState0.gameBoard = hashMap1;
      Player player0 = new Player(gameState0, "])`WpVuaV[oYQo");
      gameState0.gameBoard.remove((Object) arrayList0);
      player0.addScore(2366);
      gameState0.addPlayer(player0);
      Randomness.reset(0L);
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.toString();
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.toString();
      gameState0.isGameOver();
      Player player0 = new Player(gameState0, "The board game is embty you need to intialize the game!!!!");
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      // Undeclared exception!
      try { 
        player0.played(card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(vector0, card_CardName0);
      Integer integer0 = new Integer((-1));
      hashMap0.put((Card) null, integer0);
      gameState0.play();
      Randomness.reset(0L);
      Card.Type.values();
      gameState0.addPlayer((Player) null);
      gameState0.isGameOver();
      Randomness.random = null;
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(vector0, card_CardName0);
      Card.getCard(vector0, card_CardName0);
      Integer integer0 = new Integer((-1));
      hashMap0.put((Card) null, integer0);
      gameState0.play();
      Randomness.reset(0L);
      Card.Type.values();
      gameState0.isGameOver();
      Randomness.random = null;
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.getWinners();
      Card.CardName.values();
      gameState0.getWinners();
      Card.CardName.values();
      Player player0 = new Player(gameState0, "'s hand:");
      player0.hand = list0;
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(player0.hand, card_CardName0);
      // Undeclared exception!
      try { 
        player0.played(card0);
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
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>((Collection<? extends Card>) arrayList0);
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.filter(linkedHashSet0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = new Card(card_CardName0, card_Type0, 2823, 2823, 0);
      Player player0 = new Player(gameState0, "ykAHL/o");
      Card.getCard(arrayList0, card_CardName0);
      GameState gameState1 = new GameState(list0);
      gameState1.getWinners();
      card0.play(player0, gameState1);
      linkedHashSet0.add(card0);
      gameState0.initializeGame();
      gameState0.getWinners();
      gameState0.play();
      gameState0.play();
      String string0 = gameState0.toString();
      assertEquals("The board game is embty you need to intialize the game!!!!", string0);
      
      boolean boolean0 = gameState0.isGameOver();
      assertTrue(boolean0);
      
      HashMap<Player, Integer> hashMap0 = gameState0.getWinners();
      GameState gameState2 = new GameState((List<Card>) arrayList0);
      Randomness.random = null;
      gameState2.play();
      gameState0.returnPlayer("The board game is embty you need to intialize the game!!!!");
      HashMap<Player, Integer> hashMap1 = gameState0.getWinners();
      assertNotSame(hashMap1, hashMap0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.valueOf("Village");
      assertEquals("Village", card_CardName0.toString());
  }
}
