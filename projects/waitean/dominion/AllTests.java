package waitean.DominionMaven;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ CardTest.class, GameBoardTest.class, PileTest.class,
		PlayerTest.class })
public class AllTests {

}
