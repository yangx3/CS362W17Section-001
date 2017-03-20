/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:53:59 GMT 2017
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
public class Remodel_ESTest extends Remodel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(0);
      domGame0.playerCount = 0;
      Player[] playerArray0 = new Player[20];
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      playerArray0[0] = player0;
      Player player1 = new Player(0, domGame0.rand);
      domGame0.kingdomCards = domGame0.basicCards;
      playerArray0[1] = player1;
      Player player2 = domGame0.getWinner();
      playerArray0[2] = player2;
      domGame0.players = playerArray0;
      Deck deck0 = player1.draw;
      deck0.actionCount = 3484;
      player2.discard = deck0;
      remodel0.play(domGame0, 0, 14);
      Random.setNextRandom(11);
      remodel0.play(domGame0, 0, (-1));
      remodel0.dynamicValue(domGame0, player0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(0);
      domGame0.turnCount = 0;
      Player[] playerArray0 = new Player[20];
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      playerArray0[0] = player0;
      Player player1 = domGame0.getWinner();
      List<Deck> list0 = domGame0.basicCards;
      domGame0.kingdomCards = domGame0.basicCards;
      playerArray0[1] = player1;
      Player player2 = new Player((-1), domGame0.rand);
      playerArray0[2] = player2;
      domGame0.players = playerArray0;
      remodel0.cardDraw = 3;
      Deck deck0 = player1.draw;
      List<Card> list1 = player1.discard.cards;
      deck0.cards = list1;
      deck0.actionCount = 3484;
      player2.discard = deck0;
      remodel0.play(domGame0, 0, 0);
      Random.setNextRandom(5);
      // Undeclared exception!
      try { 
        remodel0.dynamicValue(domGame0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(0);
      domGame0.playerCount = 0;
      Player[] playerArray0 = new Player[3];
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      playerArray0[0] = player0;
      Player player1 = domGame0.getWinner();
      LinkedList<Deck> linkedList0 = new LinkedList<Deck>();
      domGame0.kingdomCards = (List<Deck>) linkedList0;
      playerArray0[1] = player1;
      Player player2 = new Player((-1), domGame0.rand);
      playerArray0[2] = player2;
      domGame0.players = playerArray0;
      Deck deck0 = player1.draw;
      deck0.update();
      deck0.actionCount = 3484;
      player2.discard = deck0;
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.Type.values();
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(3035);
      Player player0 = new Player((-869), domGame0.rand);
      Deck deck0 = new Deck((Card) remodel0, 8);
      player0.draw = deck0;
      remodel0.dynamicValue(domGame0, player0);
      remodel0.actions = (-996);
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.Type.values();
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(50);
      remodel0.print();
      Player player0 = domGame0.getWinner();
      Deck deck0 = player0.hand;
      player0.getAverageValue();
      domGame0.turnCount = 762;
      player0.draw = deck0;
      player0.buys = 50;
      domGame0.turnCount = 1;
      player0.buys = (-2392);
      // Undeclared exception!
      try { 
        remodel0.dynamicValue(domGame0, player0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("Remodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      remodel0.print();
      DomGame domGame0 = new DomGame(1484);
      Player player0 = domGame0.getWinner();
      remodel0.dynamicValue(domGame0, player0);
      domGame0.gameSeed = (-744);
      domGame0.turnCount = (-744);
      remodel0.actions = 3;
      // Undeclared exception!
      try { 
        remodel0.dynamicValue(domGame0, (Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Remodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(961);
      Player player0 = domGame0.getWinner();
      remodel0.dynamicValue(domGame0, player0);
      Card.Type.values();
      DomGame domGame1 = new DomGame(0);
      List<Deck> list0 = domGame1.kingdomCards;
      Deck deck0 = player0.draw;
      player0.hand = deck0;
      domGame0.kingdomCards = domGame1.kingdomCards;
      domGame0.kingdomCards = list0;
      remodel0.dynamicValue(domGame0, player0);
      remodel0.dynamicValue(domGame0, player0);
      remodel0.dynamicValue((DomGame) null, player0);
      remodel0.dynamicValue((DomGame) null, player0);
      deck0.embargoes = 390;
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 1, 1);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      remodel0.description = "";
      remodel0.description = "K4&@X";
      // Undeclared exception!
      try { 
        remodel0.play((DomGame) null, (-2267), 2190);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Remodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(0);
      domGame0.playerCount = 0;
      Player[] playerArray0 = new Player[20];
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      playerArray0[0] = player0;
      Player player1 = new Player(0, domGame0.rand);
      List<Deck> list0 = domGame0.basicCards;
      domGame0.kingdomCards = list0;
      playerArray0[1] = player1;
      Player player2 = new Player((-1), domGame0.rand);
      playerArray0[2] = player2;
      domGame0.players = playerArray0;
      remodel0.cardDraw = 3;
      Deck deck0 = player1.draw;
      deck0.actionCount = 3484;
      player2.discard = deck0;
      remodel0.play(domGame0, 0, 0);
      Random.setNextRandom(10);
      remodel0.dynamicValue(domGame0, player1);
      remodel0.play(domGame0, 0, (-1));
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 50, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 50
         //
         assertThrownBy("Remodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(0);
      domGame0.turnCount = 0;
      Player[] playerArray0 = new Player[20];
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      playerArray0[0] = player0;
      Player player1 = domGame0.getWinner();
      List<Deck> list0 = domGame0.basicCards;
      domGame0.kingdomCards = list0;
      playerArray0[1] = player0;
      Player player2 = domGame0.getWinner();
      playerArray0[2] = player2;
      domGame0.players = playerArray0;
      domGame0.gameSeed = 3;
      Deck deck0 = player1.draw;
      player2.actionAI(domGame0);
      deck0.actionCount = 3443;
      player2.discard = player1.hand;
      remodel0.play(domGame0, 0, 0);
      Random.setNextRandom(5);
      remodel0.dynamicValue(domGame0, player0);
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 0, (-1));
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
      Card.Type.values();
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(3035);
      Deck deck0 = new Deck((Card) remodel0, 8);
      remodel0.actions = (-869);
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Remodel remodel0 = new Remodel();
      DomGame domGame0 = new DomGame(0);
      domGame0.playerCount = 0;
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      Player player1 = domGame0.getWinner();
      Player player2 = new Player((-1), domGame0.rand);
      domGame0.players = domGame0.players;
      Deck deck0 = player1.draw;
      deck0.actionCount = 3454;
      // Undeclared exception!
      try { 
        remodel0.play(domGame0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
