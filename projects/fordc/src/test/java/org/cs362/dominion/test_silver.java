package org.cs362.dominion;

import static org.junit.Assert.*;
import org.junit.Test;

public class test_silver{
	@Test
	public void test_initiation(){
		card dummy_silver = new silver();
		assertEquals("The name is not correct!", "silver", dummy_silver.name);
		assertEquals("cost is not correct!", 3, dummy_silver.cost);
		assertEquals("gold is not correct!", 2, dummy_silver.gold);
	}
}
