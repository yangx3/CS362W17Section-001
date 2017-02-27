package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomTestDominionTest {

	@Test
	public void playRandDom() {
		for(int i = 0; i < 5; i++) {
			RandomTestDominion randGame = new RandomTestDominion();
			assertTrue(randGame.play());
		}
	}

}
