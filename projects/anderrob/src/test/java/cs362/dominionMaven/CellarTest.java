package cs362.dominionMaven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

public class CellarTest extends TestCase {

	public static HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	List<Card> cards =new ArrayList<Card>(Card.createCards());
	
	Player p = new Player(null, "celtic");
	Player j = new Player(null, "Jay");
	GameState game = new GameState(cards); 
	
	public void test() {
		game.addPlayer(p);
		game.addPlayer(j);
		game.initializeGame();
		int x = p.numActions;
		System.out.println("actions before = " + x);
		Card temp = Card.getCard(cards, Card.CardName.cellar);
		temp.play(p, game);
		int y = p.numActions;
		System.out.println("actions after = " + y);
	}
}
