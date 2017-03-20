package org.cs362.dominion;

import org.thenellb.*;
import org.junit.Test;

public class TestRandom {
    @Test
    public void testRandom(){
      for (int i=0; i<10; i++){
          System.out.println("random exclusive 0-10 int at index "+i+":  "+Random.getRandomInt(0,10)+"\n");
        }
    }
}
