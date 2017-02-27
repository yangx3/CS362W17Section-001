package cs362.dominionMaven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

public class VillageTest extends TestCase {

	public static HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	List<Card> cards =new ArrayList<Card>(Card.createCards());
	
	Player p = new Player(null, "ItTakesAVillage");
	Player j = new Player(null, "Jay");
	GameState game = new GameState(cards); 

	public void test() {
		game.addPlayer(p);
		game.addPlayer(j);
		game.initializeGame();
		int x = p.hand.size();
		int a = p.numActions;
		System.out.println("hand size before = " + x);
		System.out.println("actions before = " + a);
		Card temp = Card.getCard(cards, Card.CardName.Village);
		temp.play(p, game);
		int y = p.hand.size();
		int aa = p.numActions;
		System.out.println("hand size after = " + y);
		System.out.println("actions after = " + aa);
	}

}
