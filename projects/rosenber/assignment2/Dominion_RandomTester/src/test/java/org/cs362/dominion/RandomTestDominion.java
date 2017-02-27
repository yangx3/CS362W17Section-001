package org.cs362.dominion;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
import java.util.ArrayList;

public class RandomTestDominion {

	@Test
	public void test() {
		Game test;
		Random rand = new Random(10);
		
		int numPlayers = rand.nextInt(2) + 2;
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Adventurer());
		cards.add(new Ambassador());
		cards.add(new Baron());
		cards.add(new CouncilRoom());
		cards.add(new Cutpurse());
		cards.add(new Embargo());
		cards.add(new Feast());
		cards.add(new Garden());
		cards.add(new GreatHall());
		cards.add(new Mine());
		cards.add(new Salvager());
		cards.add(new Smithy());
		cards.add(new Village());
		
		
		for(int j=0; j<3; j++){
			int choice = rand.nextInt(cards.size());
			cards.remove(choice);
		}
		cards.add(new Copper());
		cards.add(new Silver());
		cards.add(new Gold());
		cards.add(new Estate());
		cards.add(new Province());
		cards.add(new Duchy());
		
		test = new Game(numPlayers, true, cards);
		try{
			test.play();
		}
		catch(Exception e){
			fail("Random game set-up crashed hard");
		}
		
	}

}
