package org.cs362.dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class gameTest {
	
	@Test
	public void testBuyPhase(){
	
		player p = new player("TestName");
		board b = new board();

		game.takeTurn( p,b);

	}

}
