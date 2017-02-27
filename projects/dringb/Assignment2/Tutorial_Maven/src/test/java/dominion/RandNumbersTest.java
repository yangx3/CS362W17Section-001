package dominion;

import org.junit.Assert.*;

import org.junit.*;

public class RandNumbersTest {

	@Test
	public void testGetRand() {
		RandNumbers rand = new RandNumbers();
		int ret = rand.getRand(10);
		System.out.println(ret);
	//	assertTrue( ret < 10);
	}

}
