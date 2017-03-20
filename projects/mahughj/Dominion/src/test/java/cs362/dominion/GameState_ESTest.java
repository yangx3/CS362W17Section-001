/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 07:26:10 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import cs362.dominion.GameState;
import cs362.dominion.Player;
import cs362.dominion.Randomness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) linkedList0, (List<Player>) arrayList0, hashMap0, hashMap0);
      GameState gameState1 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState1, "");
      player0.getContainedCard("");
      Integer integer0 = new Integer(782);
      hashMap0.put((Card) null, integer0);
      Player player1 = new Player(gameState0, "&H<6%Zo?*P4oo[");
      gameState0.playTest(101, '(');
      LinkedList<Card> linkedList1 = player0.deck;
      GameState gameState2 = new GameState((List<Card>) linkedList1);
      linkedList1.toArray();
      // Undeclared exception!
      try { 
        gameState2.isPileEmp((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.Type.values();
      Stack<Card> stack0 = new Stack<Card>();
      Stack<Player> stack1 = new Stack<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) stack0, (List<Player>) stack1, hashMap0, hashMap0);
      gameState0.play();
      GameState gameState1 = gameState0.clone();
      gameState0.initializeGame();
      Integer integer0 = new Integer(2);
      hashMap0.put((Card) null, integer0);
      Integer.getInteger("mRqz>FG]>lEx", 28);
      gameState0.embargoBoard = gameState1.gameBoard;
      hashMap0.put((Card) null, integer0);
      gameState1.toString();
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) null, (List<Player>) null, hashMap0, hashMap0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame('M', (-986));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) stack0, (List<Player>) arrayList0, hashMap0, hashMap0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, " to draw FIVE cards");
      Player player1 = player0.clone();
      gameState1.getOtherPlayers(player1);
      gameState1.cards = (List<Card>) stack0;
      player0.getContainedCard(" to draw FIVE cards");
      Integer integer0 = new Integer((-3998));
      hashMap0.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        gameState0.playTest((-3998), 'O', (-134));
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
      Randomness.reset(4L);
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1-!d?xuiSrF<?\"";
      List<Card> list0 = Card.filter(priorityQueue0, stringArray0);
      Vector<Player> vector0 = new Vector<Player>();
      priorityQueue0.clear();
      vector0.clear();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) vector0, hashMap0, hashMap0);
      vector0.remove((Object) priorityQueue0);
      gameState0.play();
      gameState0.toString();
      HashMap<Card, Integer> hashMap1 = gameState0.embargoBoard;
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer(14);
      hashMap0.put((Card) null, integer0);
      gameState0.embargo((Card) null);
      gameState0.getWinners();
      gameState0.isPileEmp((Card) null);
      gameState0.embargoBoard = hashMap1;
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) vector0, (List<Player>) null, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "");
      GameState gameState1 = new GameState(gameState0.cards);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      HashMap<Card, Integer> hashMap1 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) vector0, (List<Player>) null, hashMap0, hashMap1);
      Player player0 = new Player(gameState0, "N`AKS$e&kk{i");
      Player player1 = player0.clone();
      player1.drawCard();
      Integer integer0 = new Integer(46);
      hashMap0.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) linkedList0, hashMap0, hashMap0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState0, "y1");
      player0.getContainedCard("");
      Integer integer0 = new Integer((-1359));
      hashMap0.put((Card) null, integer0);
      Card.getCard(gameState0.cards, (String) null);
      gameState0.decrementCard((Card) null);
      Player player1 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player1);
      gameState1.initializeGame('C', (-2018));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.playTest(0, '}');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Randomness.nextRandomInt(30);
      List<Card> list0 = Card.createCards();
      Vector<Player> vector0 = new Vector<Player>();
      GameState gameState0 = new GameState(list0, (List<Player>) vector0, (HashMap<Card, Integer>) null, (HashMap<Card, Integer>) null);
      // Undeclared exception!
      try { 
        gameState0.playTest(0, 'G', 101);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) null, (List<Player>) linkedList0, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "Great_Hall");
      List<Card> list0 = player0.playedCards;
      GameState gameState1 = new GameState(list0);
      player0.drawCard();
      // Undeclared exception!
      try { 
        gameState1.embargo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((GameState) null, "~.6W)Ku&d2hptEHn");
      Player player1 = player0.clone();
      Player player2 = player0.clone();
      List<Card> list0 = player2.hand;
      Vector<Player> vector0 = new Vector<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      hashMap0.remove((Object) hashMap0, (Object) null);
      vector0.add(player1);
      GameState gameState0 = new GameState(list0, (List<Player>) vector0, hashMap0, hashMap0);
      GameState gameState1 = gameState0.clone();
      gameState1.toString();
      gameState0.toString();
      gameState1.initializeGame();
      gameState1.toString();
      gameState1.getOtherPlayers(player2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      LinkedList<Card> linkedList0 = player1.deck;
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      player0.contains("");
      GameState gameState0 = new GameState((List<Card>) linkedList0, (List<Player>) arrayList0, hashMap0, hashMap0);
      Player player2 = new Player((GameState) null, "Uo@0Vo9\u0006qE8q(e");
      gameState0.addPlayer(player2);
      gameState0.play();
      // Undeclared exception!
      try { 
        gameState0.isPileEmp("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      // Undeclared exception!
      try { 
        gameState0.isPileEmp("The board game is empty you need to intialize the game!!!!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Randomness.random = null;
      Randomness.totalCallsToRandom = 856;
      Vector<Card> vector0 = new Vector<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) vector0, (List<Player>) arrayList0, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      arrayList0.add(player1);
      Player player2 = new Player(gameState0, "lxvp%S7Lkc");
      gameState0.players = (List<Player>) arrayList0;
      arrayList0.add(player2);
      gameState0.playTest(856, 'S', 12);
      Randomness.totalCallsToRandom = 12;
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      gameState0.toString();
      gameState0.playTest(7, '5', 7);
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      gameState0.players = (List<Player>) linkedList0;
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName.valueOf("Adventurer");
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      gameState1.toString();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.Type.values();
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.getWinners();
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      List<Card> list0 = player1.playedCards;
      GameState gameState1 = new GameState(list0, gameState0.players, gameState0.embargoBoard, gameState0.gameBoard);
      player0.drawCard();
      // Undeclared exception!
      try { 
        gameState1.incrementCard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.clone();
      gameState0.getWinners();
      GameState gameState1 = new GameState(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      // Undeclared exception!
      try { 
        gameState0.randomCard((-1504));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Stack<Player> stack0 = new Stack<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) null, (List<Player>) stack0, hashMap0, hashMap0);
      // Undeclared exception!
      try { 
        gameState0.randomCard((-739));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Randomness.reset(0L);
      int int0 = 4962;
      Random.setNextRandom(4962);
      Randomness.random = null;
      Random.setNextRandom(4962);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.play();
      gameState0.isGameOver();
      gameState0.playTest((-953), 'z');
      String[] stringArray0 = new String[4];
      stringArray0[0] = " is playing";
      stringArray0[1] = "Eo-}1_s4?[Tbvw}@'}'";
      Player player0 = new Player(gameState0, " Embargo: ");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      stringArray0[2] = "Bi)=AK.r}IA";
      stringArray0[3] = "";
      List<Card> list1 = Card.filter(gameState0.cards, stringArray0);
      Card.getCard(list1, "Bi)=AK.r}IA");
      // Undeclared exception!
      try { 
        gameState0.decrementCard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) linkedList0, (List<Player>) arrayList0, hashMap0, hashMap0);
      GameState gameState1 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState1, "");
      player0.getContainedCard("");
      Integer integer0 = new Integer(782);
      hashMap0.put((Card) null, integer0);
      Player player1 = new Player(gameState0, "&H<6%Zo?*P4oo[");
      gameState0.addPlayer(player1);
      Player player2 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        gameState0.playTest(101, '(');
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) linkedList0, (List<Player>) arrayList0, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "&H<6%Zo?*P4oo[");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "");
      gameState0.playTest(101, '(');
      LinkedList<Card> linkedList1 = player1.deck;
      GameState gameState1 = new GameState((List<Card>) linkedList1);
      Card card0 = null;
      linkedList1.toArray();
      // Undeclared exception!
      try { 
        gameState1.isPileEmp((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) stack0, (List<Player>) arrayList0, hashMap0, hashMap0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, " to draw FIVE cards");
      Player player1 = player0.clone();
      gameState1.getOtherPlayers(player1);
      gameState1.cards = (List<Card>) stack0;
      player0.getContainedCard(" to draw FIVE cards");
      Integer integer0 = new Integer(40);
      hashMap0.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        gameState0.playTest((-3998), 'O', (-134));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Vector<Player> vector0 = new Vector<Player>();
      gameState0.players = (List<Player>) vector0;
      Randomness.totalCallsToRandom = 18;
      gameState0.addPlayer((Player) null);
      gameState0.initializeGame('0', (-1502));
      List<Card> list1 = Card.createCards();
      GameState gameState1 = new GameState(list1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      GameState gameState1 = gameState0.clone();
      gameState1.initializeGame();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(gameState1.cards, card_CardName0);
      stack0.add((Card) null);
      Card.createCards();
      // Undeclared exception!
      try { 
        gameState1.embargoCheck((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) stack0, (List<Player>) arrayList0, hashMap0, hashMap0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, " to draw FIVE cards");
      Player player1 = player0.clone();
      gameState1.getOtherPlayers(player1);
      gameState1.cards = (List<Card>) stack0;
      player0.getContainedCard(" to draw FIVE cards");
      Integer integer0 = new Integer(40);
      hashMap0.put((Card) null, integer0);
      gameState1.players = gameState0.players;
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 2560;
      String[] stringArray0 = new String[0];
      Card.createCards();
      Randomness.reset(1L);
      // Undeclared exception!
      try { 
        Card.CardName.valueOf("FB>A~g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant cs362.dominion.Card.CardName.FB>A~g
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Randomness.reset(4L);
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1-!d?xuiSrF<?\"";
      List<Card> list0 = Card.filter(priorityQueue0, stringArray0);
      Vector<Player> vector0 = new Vector<Player>();
      priorityQueue0.clear();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) vector0, hashMap0, hashMap0);
      vector0.remove((Object) priorityQueue0);
      gameState0.play();
      gameState0.initializeGame();
      gameState0.toString();
      HashMap<Card, Integer> hashMap1 = gameState0.embargoBoard;
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer(14);
      Integer.divideUnsigned(0, 14);
      hashMap0.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Vector<Player> vector0 = new Vector<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) vector0, hashMap0, hashMap0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "");
      Player player1 = player0.clone();
      player1.drawCard();
      Integer integer0 = new Integer(20);
      hashMap0.put((Card) null, integer0);
      Player player2 = new Player(gameState0, "");
      Player player3 = player2.clone();
      vector0.add(player3);
      int int0 = 807;
      gameState0.getWinners();
      // Undeclared exception!
      try { 
        gameState1.randomCard(807);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Stack<Player> stack0 = new Stack<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>(0, 1262.84F);
      GameState gameState0 = new GameState(list0, (List<Player>) stack0, hashMap0, hashMap0);
      List<Player> list1 = gameState0.players;
      GameState gameState1 = new GameState(list0);
      // Undeclared exception!
      try { 
        gameState1.randomCard((-146));
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}
