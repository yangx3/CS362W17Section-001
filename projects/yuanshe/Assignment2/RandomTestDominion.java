package org.cs362.dominion;

/**
 * random tester that plays complete games of dominion
 * with a random number of players (2-4) and a random set
 * of kingdom cards with a seed of 10.
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class RandomTestDominion 
{
	@Test
	//public static void main(String[] argv) throws Throwable {
	public void test0()  throws Throwable  {	
		
		
		Randomness.reset(10);    // Random seed of 10
		List<Card> cards = Card.createCards();
		GameState state = new GameState(cards);  
		
		int nplayers = Randomness.nextRandomInt(3)+2;  // 2-4 players
		for (int i = 0; i < nplayers; i++) {
			Player player = new Player(state, "player-" + i);
			// a random set of kingdom cards
			int cn = Randomness.nextRandomInt(3);
			switch (cn) {
			case 0:
				player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
				break;
			case 1:
				player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
				break;
			case 2:
				player.hand.add(Card.getCard(cards,Card.CardName.Village));
				break;
			}			
			state.addPlayer(player);
		}
		
		//Initialize
		state.initializeGame();

		/*System.out.println("hand count = " + state.players.get(0).hand.size());
		System.out.println("hand deck = " + state.players.get(0).deck.size());
		System.out.println("hand coins = " + state.players.get(0).coins);
		System.out.println("hand numActions = " + state.players.get(0).numActions);
		System.out.println("hand numBuys = " + state.players.get(0).numBuys);

		System.out.println("hand hand = " + state.players.get(0).hand.size());
		System.out.println("hand deck = " + state.players.get(0).deck.size());*/
		
		//clone the game state to a test case
		GameState testState = state.clone();

		//	play the game 
		HashMap<Player, Integer> winners = state.play();
		
		for (int i = 0; i < nplayers; i++) {
			System.out.println("  *****    Player-"+ (i+1) + " Status ***** " );
			System.out.println("hand count = " + state.players.get(i).hand.size() + ", original = "+ ( testState.players.get(i).hand.size()/* + newCards*/ ) );
			System.out.println("deck count = " + state.players.get(i).deck.size() + ", original = "+ ( testState.players.get(i).deck.size()/* - newCards */) );
			System.out.println("numActions = " + state.players.get(i).numActions + ", original = "+ ( testState.players.get(i).numActions - 1 ) );
		}
		

	}

}
