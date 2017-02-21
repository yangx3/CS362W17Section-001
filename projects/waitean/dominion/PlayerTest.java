package waitean.DominionMaven;
import static org.junit.Assert.*;
import org.junit.Test;


public class PlayerTest {

	@Test
	public void testInitializePlayer() {
		Player newPlayer = new Player("Steve");
		assertEquals(newPlayer.getHand().size(), 5);
	}
}
