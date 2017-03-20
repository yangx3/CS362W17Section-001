package org.cs362.dominion;

import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RunGameTest {
    private PlayGame play;
    long seed = System.nanoTime();
    Random rand = new Random();

    @Test
    public void Start() {
        for(int i = 0; i < 10; i++) {
            System.out.print("\nPlaying Game #" + i + "\n");
            int number = (rand.nextInt(4) + 1);
            if(number == 1)
                number++;
            assertTrue(number >= 2 && number <= 4);
            play.main(null, number);
        }
    }
}