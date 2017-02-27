package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayDominionTest {

	@Test
	public void PlayDominion()
	{
		for(int i = 0; i < 5; i++)
		{
			try{
				PlayDominion.main();
			}catch(Exception e)
			{
				fail("Game should not fail");
			}
			
		}
	}

}
