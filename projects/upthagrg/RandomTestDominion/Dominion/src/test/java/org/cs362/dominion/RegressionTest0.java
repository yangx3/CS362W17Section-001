package org.cs362.dominion;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }
    String[] in = new String[0];
    org.cs362.dominion.dominion dominion_instance0 = new org.cs362.dominion.dominion();
	dominion_instance0.main(in);
  }

}
