package cs362.dominionMaven;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(BureaucratTest.class);
		suite.addTestSuite(CellarTest.class);
		suite.addTestSuite(ChancellorTest.class);
		suite.addTestSuite(ChapelTest.class);
		suite.addTestSuite(CouncilRoomTest.class);
		suite.addTestSuite(FeastTest.class);
		suite.addTestSuite(FestivalTest.class);
		suite.addTestSuite(LabratoryTest.class);
		suite.addTestSuite(LibraryTest.class);
		suite.addTestSuite(SmithyTest.class);
		suite.addTestSuite(TurnTest.class);
		suite.addTestSuite(VillageTest.class);
		//$JUnit-END$
		return suite;
	}

}
