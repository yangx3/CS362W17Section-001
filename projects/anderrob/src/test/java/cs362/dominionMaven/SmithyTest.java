package cs362.dominionMaven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

public class SmithyTest extends TestCase {


	public static HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	List<Card> cards =new ArrayList<Card>(Card.createCards());
	
	Player p = new Player(null, "smither");
	Player j = new Player(null, "Jay");
	GameState game = new GameState(cards); 
	
	public void test() {
		game.addPlayer(p);
		game.addPlayer(j);
		game.initializeGame();
		int x = p.hand.size();
		System.out.println("hand size before = " + x);
		Card temp = Card.getCard(cards, Card.CardName.Smithy);
		temp.play(p, game);
		int y = p.hand.size();
		System.out.println("hand size after = " + y);
	}

}
