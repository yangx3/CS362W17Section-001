package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomDominionTest{
	private GameState gs;
	private List<Card> c;
	int num;

	@Before
	public void init(){
		c = new ArrayList<Card>(Card.createCards());
		gs = new GameState(c);
		
		Random rand = new Random();
		num = rand.nextInt(3) + 2;

		for(int i = 0; i < num; i++){
			gs.addPlayer(new Player(gs, 'p' + Integer.toString(i)));
		}

		gs.initializeGame();
	}

	@Test
	public void mainTest(){
		for(int i = 0; i < num; i++){
			assertEquals(5, gs.players.get(i).hand.size());
		}
		gs.play();
	}
}
