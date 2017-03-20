package maven.dominion_v2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CardTest.class, GameStateTest.class, PlayerTest.class })
public class AllTests {

}
