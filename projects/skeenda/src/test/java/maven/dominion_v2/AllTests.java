package maven.dominion_v2;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CardTest.class);
		suite.addTestSuite(GameStateTest.class);
		//$JUnit-END$
		return suite;
	}

}
