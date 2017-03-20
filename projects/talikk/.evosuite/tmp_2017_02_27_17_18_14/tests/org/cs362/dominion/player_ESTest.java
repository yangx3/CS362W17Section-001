/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 01:24:19 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.cs362.dominion.card;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class player_ESTest extends player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      player player0 = new player("");
      player0.showHand();
      player0.setGold(5);
      player0.getName();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      player player0 = new player("QDrd8{t6JW<WW1a");
      player0.refillHand();
      player0.drawCardToHand();
      player0.drawCardToHand();
      player0.getDrawDeck();
      player0.getDiscardDeck();
      player player1 = new player("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      player player0 = new player("Trashing hand");
      player0.refillHand();
      player0.refillHand();
      player0.setGold(1000);
      player0.trashHand();
      player0.refillHand();
      player0.setGold(5);
      player0.getDrawDeck();
      player0.getHand();
      player0.showHand();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      player player0 = new player("k'9,DyKJkJgx");
      player0.refillHand();
      player0.setGold(3137);
      player0.getDrawDeck();
      player0.initHand();
      player0.initHand();
      player0.getGold();
      player0.initHand();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      player player0 = new player("");
      player0.setGold(793);
      player0.refillHand();
      card.CardName card_CardName0 = card.CardName.Silver;
      card.Type card_Type0 = card.Type.TREASURE;
      card card0 = new card(card_CardName0, card_Type0, 892, 0, 892);
      card.initCopperStock();
      player0.addToDiscard(card0);
      // Undeclared exception!
      try { 
        player0.countGold((List<card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      player player0 = new player("Y");
      player0.setGold((-411));
      player0.initHand();
      player0.initHand();
      player0.refillHand();
      player0.getDrawDeck();
      player0.showHand();
      player0.refillHand();
      player0.getGold();
      player0.trashHand();
      player0.getHand();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      player player0 = new player((String) null);
      player0.getName();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      player player0 = new player("| COST: ");
      player0.refillHand();
      card.CardName card_CardName0 = card.CardName.Estate;
      card.Type card_Type0 = card.Type.TREASURE;
      card card0 = new card(card_CardName0, card_Type0, 5, 3, (-662));
      card.initSilverStock();
      player0.addToDiscard(card0);
      List<card> list0 = player0.initHand();
      player0.initHand();
      player0.countGold(list0);
      List<card> list1 = player0.getDiscardDeck();
      player0.countGold(list1);
      player0.showHand();
      player0.initHand();
      player0.getHand();
      player0.getDiscardDeck();
      player0.countGold(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      player player0 = new player((String) null);
      player0.showHand();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      player player0 = new player(" L}t\"`v=");
      List<card> list0 = player0.initHand();
      player0.trashHand();
      player0.trashHand();
      player0.trashHand();
      player0.refillHand();
      player0.countGold(list0);
      player0.showHand();
      player0.setGold(10);
      player0.getDiscardDeck();
      player player1 = new player(" L}t\"`v=");
      String[] stringArray0 = new String[0];
      player.main(stringArray0);
      card.CardName card_CardName0 = card.CardName.Estate;
      card.Type card_Type0 = card.Type.TREASURE;
      card card0 = new card(card_CardName0, card_Type0, (-5161), 0, 0);
      player1.addToDiscard(card0);
      player1.setGold(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "7%(K|";
      player player0 = new player("7%(K|");
      player0.trashHand();
      player0.drawCardToHand();
      player0.trashHand();
      player0.initHand();
      player0.drawCardToHand();
      card card0 = null;
      // Undeclared exception!
      try { 
        player0.refillHand();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      player player0 = new player("V.P.: ");
      player0.trashHand();
      player0.refillHand();
      player0.initHand();
      player0.showHand();
      player0.setGold(0);
      player0.showHand();
      player0.setGold(0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "V.P.: ";
      stringArray0[1] = "V.P.: ";
      stringArray0[2] = "V.P.: ";
      stringArray0[3] = "V.P.: ";
      stringArray0[4] = "V.P.: ";
      stringArray0[5] = "|E[s9cgamnFcf";
      stringArray0[6] = "V.P.: ";
      stringArray0[7] = "V.P.: ";
      player.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      player player0 = new player("Trashing hand");
      player0.getHand();
      player0.drawCardToHand();
      player0.getName();
      player0.trashHand();
      player0.drawCardToHand();
      card.CardName card_CardName0 = card.CardName.Duchy;
      card.Type card_Type0 = card.Type.ACTION;
      card card0 = new card(card_CardName0, card_Type0, (-2331), (-2331), 1);
      player0.addToDiscard(card0);
      player0.showHand();
      player0.getDrawDeck();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      card.CardName card_CardName0 = card.CardName.Gold;
      card.Type card_Type0 = card.Type.VICTORY;
      card card0 = new card(card_CardName0, card_Type0, 0, 0, (-3180));
      card.initDeck();
      card.initCopperStock();
      card.initSilverStock();
      card.initSilverStock();
      card.initCopperStock();
      card.initSilverStock();
      card.initVictoryStock(0);
      player player0 = new player("Trashing hand");
      player0.drawCardToHand();
      player0.getGold();
      player0.getDrawDeck();
      // Undeclared exception!
      try { 
        player0.refillHand();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      player player0 = new player("Trashing hand");
      List<card> list0 = player0.initHand();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      player player0 = new player("yg5d!gpiIL9>cd ");
      player0.trashHand();
      player0.setGold((-843));
      List<card> list0 = card.initSilverStock();
      player0.drawCardToHand();
      player0.countGold(list0);
      player0.refillHand();
      player0.trashHand();
      player0.showHand();
      player0.trashHand();
      player0.initHand();
      player0.getName();
      player0.addToDiscard((card) null);
      // Undeclared exception!
      try { 
        player0.drawCardToHand();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}