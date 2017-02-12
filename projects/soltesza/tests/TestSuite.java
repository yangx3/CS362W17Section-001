import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestBoard.class,
	TestCards.class,
	TestDeck.class,
	TestGameState.class,
	TestKingdomSlot.class,
	TestPlayer.class
})

public class TestSuite {} 