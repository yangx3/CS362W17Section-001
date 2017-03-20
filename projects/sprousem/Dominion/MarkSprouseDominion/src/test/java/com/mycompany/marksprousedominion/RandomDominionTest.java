
/* 
 *  * To change this license header, choose License Headers in Project Properties. 
 *   * To change this template file, choose Tools | Templates 
 *    * and open the template in the editor. 
 *     */ 
package com.mycompany.marksprousedominion; 
 
import org.junit.Test; 
 
import static org.junit.Assert.fail; 
 
/** 
 *  * 
 *   * @author MarkSprouse 
 *    */ 
public class RandomDominionTest { 
     
    public RandomDominionTest() { 
    } 
     
 
    @Test 
    public void testMain() { 
         
        for(int i = 2; i < 5; i++)//All player possibilities 
        { 
            for(int j = 1; j < 50; j++) 
            { 
                try { 
                    String[] args = {Integer.toString(i), Integer.toString(j)}; 
                    main.main(args); 
                } 
                catch(Exception e) 
                { 
                    fail(); 
                } 
            } 
        } 
         
    } 
     
} 
