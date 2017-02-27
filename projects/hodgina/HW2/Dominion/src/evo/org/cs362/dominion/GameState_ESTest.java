/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 25 01:24:32 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      GameState gameState2 = gameState0.clone();
      Player player0 = new Player(gameState1, "?'nOA");
      Player player1 = player0.clone();
      gameState1.addPlayer(player1);
      gameState1.cards = (List<Card>) arrayList0;
      GameState gameState3 = new GameState(gameState2.cards);
      Player player2 = new Player(gameState3, "ICtk'ru");
      gameState2.players = gameState0.players;
      gameState1.addPlayer(player2);
      GameState gameState4 = new GameState(gameState2.cards);
      GameState gameState5 = new GameState(gameState1.cards);
      player2.playKingdomCard();
      GameState gameState6 = gameState3.clone();
      gameState6.addPlayer(player2);
      HashMap<Card, Integer> hashMap0 = gameState6.gameBoard;
      gameState0.players = gameState1.players;
      GameState gameState7 = new GameState(gameState1.cards);
      GameState gameState8 = gameState6.clone();
      gameState8.play();
      gameState5.cards = gameState1.cards;
      gameState8.toString();
      gameState5.play();
      gameState5.initializeGame();
      gameState8.play();
      gameState2.toString();
      // Undeclared exception!
      try { 
        gameState1.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.initializeGame();
      gameState1.toString();
      gameState1.embargoTokens = list0;
      gameState0.initializeGame();
      gameState1.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState1.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      gameState0.cards = (List<Card>) linkedList0;
      Player player0 = new Player(gameState0, "cR");
      Player player1 = player0.clone();
      player0.toString();
      gameState0.addPlayer(player1);
      linkedList0.clear();
      GameState gameState1 = gameState0.clone();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.getCard(gameState0.cards, card_CardName0);
      gameState1.play();
      GameState.addEmbargo((Card) null);
      GameState gameState2 = gameState1.clone();
      GameState gameState3 = gameState2.clone();
      player0.endTurn();
      HashMap<Card, Integer> hashMap0 = gameState2.gameBoard;
      gameState1.gameBoard = hashMap0;
      gameState2.gameBoard = gameState0.gameBoard;
      GameState gameState4 = gameState2.clone();
      HashMap<Card, Integer> hashMap1 = gameState4.gameBoard;
      gameState1.addPlayer(player0);
      Card.Type.values();
      gameState4.getWinners();
      GameState gameState5 = gameState3.clone();
      gameState5.embargoTokens = gameState3.cards;
      GameState gameState6 = gameState0.clone();
      gameState6.cards = gameState0.cards;
      List<Card> list0 = null;
      try {  
      list0 = gameState6.embargoTokens;
      } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      gameState0.getWinners();
      gameState0.getWinners();
      gameState0.embargoTokens = (List<Card>) linkedList0;
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
  public void test05()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.embargoTokens = null;
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      Integer integer0 = new Integer((-2072));
      hashMap0.put((Card) null, integer0);
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
  public void test06()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.play();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.getWinners();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.toString();
      Player player0 = new Player(gameState0, "The board game is empty you need to initialize the game!!!!");
      gameState0.initializeGame();
      gameState0.toString();
      gameState0.addPlayer(player0);
      player0.playTreasureCard();
      gameState0.play();
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      gameState0.clone();
      player0.buyCard(gameState0);
      gameState0.addPlayer(player0);
      Integer integer0 = Integer.getInteger("The board game is empty you need to initialize the game!!!!", (-283));
      gameState0.gameBoard.put((Card) null, integer0);
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
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.toString();
      Player player0 = new Player(gameState0, "The board game is empty you need to initialize the game!!!!");
      gameState0.initializeGame();
      Player player1 = player0.clone();
      gameState0.addPlayer(player0);
      player0.playTreasureCard();
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      gameState0.clone();
      player1.buyCard(gameState0);
      player0.playedCards = gameState0.cards;
      gameState0.cards = list0;
      gameState0.addPlayer(player1);
      Card card0 = null;
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      GameState gameState2 = gameState1.clone();
      GameState gameState3 = new GameState(gameState2.cards);
      Player player0 = new Player(gameState3, "ICtk'ru");
      gameState2.players = gameState0.players;
      gameState1.addPlayer(player0);
      gameState0.addPlayer(player0);
      HashMap<Card, Integer> hashMap0 = gameState1.gameBoard;
      gameState0.players = gameState1.players;
      GameState gameState4 = new GameState(gameState1.cards);
      GameState gameState5 = gameState0.clone();
      gameState1.play();
      gameState1.initializeGame();
      gameState5.play();
      gameState3.players = gameState0.players;
      gameState2.toString();
      GameState gameState6 = gameState2.clone();
      gameState1.initializeGame();
      gameState6.initializeGame();
      GameState gameState7 = new GameState(gameState2.cards);
      player0.drawCard();
      GameState.addEmbargo((Card) null);
      GameState gameState8 = new GameState(gameState1.cards);
      gameState0.play();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      gameState0.gameBoard = gameState1.gameBoard;
      gameState1.gameBoard = gameState0.gameBoard;
      gameState1.cards = (List<Card>) arrayList0;
      gameState0.players = gameState1.players;
      Player player0 = new Player(gameState1, (String) null);
      player0.drawCard();
      Integer integer0 = new Integer((-2385));
      Integer.compare((-2385), 74);
      gameState0.gameBoard.put((Card) null, integer0);
      gameState1.isGameOver();
      Player player1 = player0.clone();
      Player player2 = player1.clone();
      gameState0.addPlayer(player2);
      gameState1.play();
      // Undeclared exception!
      try { 
        gameState1.clone();
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
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      gameState0.gameBoard = gameState1.gameBoard;
      gameState1.cards = (List<Card>) arrayList0;
      gameState0.players = gameState1.players;
      Player player0 = new Player(gameState1, (String) null);
      player0.drawCard();
      Integer integer0 = new Integer(3);
      gameState0.gameBoard.put((Card) null, integer0);
      gameState1.isGameOver();
      Player player1 = new Player(gameState0, "");
      Player player2 = player1.clone();
      gameState0.addPlayer(player2);
      gameState1.play();
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, (Card.CardName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}