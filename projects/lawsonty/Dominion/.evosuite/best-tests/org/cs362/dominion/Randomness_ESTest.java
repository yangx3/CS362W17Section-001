/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 22 23:53:50 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Randomness_ESTest extends Randomness_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Randomness.totalCallsToRandom = 1234;
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Randomness.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      String string0 = Randomness.randomMember((List<String>) linkedList0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextDouble();
      int int0 = Randomness.nextRandomInt(23);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Randomness.random = null;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(2872);
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Integer>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(1856);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Randomness.random = null;
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Randomness.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Randomness.nextRandomInt(1856);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList0);
      LinkedList linkedList1 = (LinkedList)Randomness.randomMember((List<Object>) linkedList0);
      assertEquals(1, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Randomness.reset((-1L));
  }
}
