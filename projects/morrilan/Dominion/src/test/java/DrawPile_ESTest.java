/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:47:48 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DrawPile_ESTest extends DrawPile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreasureCard treasureCard0 = new TreasureCard("5\"!q|f_;", 0, "5\"!q|f_;", 0);
      Card[] cardArray0 = new Card[6];
      cardArray0[1] = (Card) treasureCard0;
      cardArray0[2] = (Card) treasureCard0;
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.drawCard();
      drawPile0.drawCard();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card[] cardArray0 = new Card[1];
      VictoryCard victoryCard0 = new VictoryCard("", 1887, ":p #7@UB-^tgD}=>", 1887);
      cardArray0[0] = (Card) victoryCard0;
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.setDeck(cardArray0, 20);
      drawPile0.drawCard();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card[] cardArray0 = new Card[1];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.cardsRemaining();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DrawPile.getScaledImage((Image) null, 932290458, 16);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DrawPile.getScaledImage((Image) null, 932290458, 35);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.image.DataBufferInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DrawPile.getScaledImage((Image) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (0) cannot be <= 0
         //
         assertThrownBy("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card[] cardArray0 = new Card[1];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.setScale(126.0321);
      // Undeclared exception!
      try { 
        drawPile0.draw();
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.setScale(1502.92734);
      // Undeclared exception!
      try { 
        drawPile0.draw();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.image.DataBufferInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card[] cardArray0 = new Card[21];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.setScale(1887.9636);
      // Undeclared exception!
      try { 
        drawPile0.draw();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimensions (width=377592 height=604148) are too large
         //
         assertThrownBy("java.awt.image.SampleModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DrawPile drawPile0 = null;
      try {
        drawPile0 = new DrawPile((Card[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("DrawPile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.shuffle();
      assertEquals(0, drawPile0.cardsRemaining());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.setDeck(cardArray0, 370);
      // Undeclared exception!
      try { 
        drawPile0.shuffle();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("DrawPile", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.draw();
      assertEquals(0, drawPile0.cardsRemaining());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BufferedImage bufferedImage0 = (BufferedImage)DrawPile.getScaledImage((Image) null, 1930, 1930);
      assertEquals(2, bufferedImage0.getType());
      assertEquals(1930, bufferedImage0.getHeight());
      assertEquals(1930, bufferedImage0.getTileWidth());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card[] cardArray0 = new Card[2];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      // Undeclared exception!
      try { 
        drawPile0.setDeck((Card[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("DrawPile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card[] cardArray0 = new Card[1];
      VictoryCard victoryCard0 = new VictoryCard("", 1887, ":p #7@UB-^tgD}=>", 1887);
      cardArray0[0] = (Card) victoryCard0;
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.drawCard();
      drawPile0.drawCard();
      assertEquals(0, drawPile0.cardsRemaining());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card[] cardArray0 = new Card[1];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.drawCard();
      assertEquals(1, drawPile0.cardsRemaining());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      int int0 = drawPile0.cardsRemaining();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      JLabel jLabel0 = drawPile0.getLabel();
      assertFalse(jLabel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      DrawPile drawPile0 = new DrawPile(cardArray0);
      drawPile0.setDeck(cardArray0, (-356));
      int int0 = drawPile0.cardsRemaining();
      assertEquals((-356), int0);
  }
}
