package org.cs362.dominion;

import static org.junit.Assert.*;
import org.junit.Test;

public class test_silver{
	@Test
	public void test_initiate(){
		card dummy_silver = new silver();
		assertEquals("Name is not equal!", "silver", dummy_silver.name);
		assertEquals("Cost is not equal!", 2, dummy_silver.cost);
		assertEquals("Gold is not equal!", 2, dummy_silver.gold);
	}
}
