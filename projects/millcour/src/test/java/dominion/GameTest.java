package dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void playSmithy(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getDraw().getPile().remove(0);
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Smithy, Card.Type.ACTION, 4, 0, 0));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Smithy, Card.Type.ACTION, 4, 0, 0));
		game.invokeAction(0);
		assertEquals(game.getPlayers().get(0).getHand().getPile().size(), 4);
		
	}

	@Test
	public void playVillage(){
		Game game = new Game();
		game.setGame();
		while(game.getPlayers().get(0).getDraw().getPile().size() > 0){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Village, Card.Type.ACTION, 5, 0, 0));
		int compare = game.getPlayers().get(0).getHand().getPile().size();
		game.invokeAction(0);
		int compare2 = game.getPlayers().get(0).getHand().getPile().size();
		assertEquals(game.getPlayers().get(0).getNumActions(), 2);
		assertEquals(compare, compare2);
	}
	
	@Test
	public void playTribute(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(1).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		while(game.getPlayers().get(1).getDraw().getPile().size() > 0){
			game.getPlayers().get(1).getDraw().getPile().remove(0);
		}
		int compare = game.getPlayers().get(0).getDraw().getPile().size();
		game.runAction(Card.CardName.Tribute, 0);
		int compare2 = game.getPlayers().get(0).getDraw().getPile().size();
		assertEquals(compare, compare2);
		game.getPlayers().get(0).getDiscard().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		while(game.getPlayers().get(0).getDraw().getPile().size() > 0){
			game.getPlayers().get(0).getDraw().getPile().remove(0);
		}
		compare = game.getPlayers().get(1).getDraw().getPile().size();
		game.runAction(Card.CardName.Tribute, 1);
		compare2 = game.getPlayers().get(1).getDraw().getPile().size();
		assertEquals(compare, compare2);
	}
	
	@Test
	public void playMine(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Copper, Card.Type.TREASURE, 0, 0, 1));
		game.runAction(Card.CardName.Mine, 0);
	}
}
