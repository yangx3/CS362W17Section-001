package org.cs362.dominion.Dominion;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class RandomTestDominion {

	@Test(timeout =  4000)
	public void test() {
		int min = 2, max = 4, p;
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {
			p = rand.nextInt(max) + min;
			PlayDominion d = new PlayDominion();
			d.initializeGame(p, p, false);
			assertTrue(d.complete);
		}
	}

}
