/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Kin-Ho Lam
 */
public class RandomTestDominion {

    public RandomTestDominion() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPlay() {
        for(int p = 2; p < 5; p++)
        {
        	for(int k = 0; k < 11; k++)
        	{   
        		try
        		{
                System.out.println("\n\t"+p+" players, " + k + " kingdom cards");
		        String[] args = {Integer.toString(p), Integer.toString(k)};
		        Dominion.main(args);
		        }
		        catch(Exception e)
		        {
		           fail("Should not have thrown any exception");
		        }
        	}
        }
    }
    
}
