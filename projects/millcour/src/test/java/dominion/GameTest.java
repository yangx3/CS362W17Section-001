package dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void playSmithy(){
		Game game = new Game();
		game.setGame();
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Smithy, Card.Type.ACTION, 4, 0, 0));
		game.getPlayers().get(0).getHand().getPile().add(new Card(Card.CardName.Smithy, Card.Type.ACTION, 4, 0, 0));
		game.invokeAction(0);
		assertEquals(game.getPlayers().get(0).getHand().getPile().size(), 4);
		
	}

}
