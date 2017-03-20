/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 23:35:50 GMT 2017
 */

package maven.dominion_v2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import maven.dominion_v2.Card;
import maven.dominion_v2.GameState;
import maven.dominion_v2.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Dutchy;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 5, 5, 0);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      int int0 = card0.playerScore(player0);
      assertEquals(0, card0.getTreasure());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Laboratory;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 9, (-6903), 13);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "RandomNum: ");
      int int0 = card0.playerScore(player0);
      assertEquals((-6903), int0);
      assertEquals(13, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Dutchy;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 5, 5, 0);
      card0.getType();
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getTreasure();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 7, 7, 7);
      int int0 = card0.getTreasure();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 19, 0, (-1537));
      card0.getCardName();
      assertEquals(-1537, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, (-1298), 15, (-1298));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add(card0);
      Card card1 = Card.getCard(linkedList0, card_CardName0);
      assertEquals(-1298, card1.getTreasure());
      assertNotNull(card1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.Action;
      Stack<Card> stack0 = new Stack<Card>();
      List<Card> list0 = Card.filter(stack0, card_Type0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Laboratory;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      Card.CardName card_CardName1 = Card.CardName.Cellar;
      Card card1 = new Card(card_CardName1, card_Type0, 0, 0, 0);
      int int0 = card0.compareTo(card1);
      assertEquals(6, int0);
      assertEquals(0, card1.getTreasure());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 19, 0, (-1537));
      Card.CardName card_CardName1 = Card.CardName.Province;
      Card card1 = new Card(card_CardName1, card_Type0, 3731, 3731, 0);
      int int0 = card0.compareTo(card1);
      assertEquals((-3), int0);
      assertEquals(-1537, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "?t6|G{}$Mnm+oRCaq#");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Bureaucrat;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("maven.dominion_v2.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.Victory;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("maven.dominion_v2.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 911);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("maven.dominion_v2.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Bureaucrat;
      Card.getCard(list0, card_CardName0);
      Card.Type card_Type0 = Card.Type.Treasure;
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.Treasure;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      card0.getType();
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cellar;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 18, 18, 20);
      boolean boolean0 = card0.equals(card0);
      assertTrue(boolean0);
      assertEquals(20, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.Victory;
      List<Card> list1 = Card.filter(list0, card_Type0);
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card card0 = Card.getCard(arrayList0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Library;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 1679, 5, 9);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Treasure");
      card0.play(player0, gameState0);
      card0.play(player0, gameState0);
      assertEquals(9, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Dutchy;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 5, 5, 0);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Woodcutter;
      Card.Type card_Type0 = Card.Type.Treasure;
      Card card0 = new Card(card_CardName0, card_Type0, 10, 10, 10);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " Woodcutter-Treasure  Cost: 10  Score: 10  Treasure Value: 10\n");
      card0.play(player0, gameState0);
      assertEquals(10, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 596, 596, 17);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, (String) null);
      card0.play(player0, gameState0);
      assertEquals(17, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Market;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Laboratory;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "Jq*");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Festival;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 813, 8, 813);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(813, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.Treasure;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Aa~=(3;PW");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Chapel;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 46, (-373), (-1777));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "maven.dominion_v2.Card$CardName");
      card0.play(player0, gameState0);
      assertEquals(-1777, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Chancellor;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "q>I=&c8");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cellar;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 18, 18, 20);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "q>I=&c8");
      card0.play(player0, gameState0);
      assertEquals(20, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "?t6|G{}$Mnm+oRCaq#");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Bureaucrat;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "A}n");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.Treasure;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Bought Smithy");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cellar;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " Cellar-Victory  Cost: 0  Score: 0  Treasure Value: 0\n");
      int int0 = card0.playerScore(player0);
      assertEquals(0, card0.getTreasure());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.Victory;
      Card card0 = new Card(card_CardName0, card_Type0, 19, 0, (-1537));
      card0.compareTo(card0);
      assertEquals(-1537, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Chapel;
      Card.Type card_Type0 = Card.Type.Action;
      Card card0 = new Card(card_CardName0, card_Type0, 46, (-373), (-1777));
      int int0 = card0.getTreasure();
      assertEquals((-1777), int0);
  }
}
