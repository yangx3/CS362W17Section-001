/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dimc_dominion;

import static com.mycompany.dimc_dominion.PlayDominion.main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

/**
 *
 * @author San Dim
 */
public class PlayDominionTest {
    
    public PlayDominionTest() {
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
  public void playGame(){
    Random rand = new Random(10);
    for(int j=0; j<5; j++){
      int numPlayers = rand.nextInt(3)+2; // 2-4 players
      assert(numPlayers<=4 && numPlayers>=2);

      int numKingdomCards=rand.nextInt(14);
      
      main(numPlayers,numKingdomCards);

      
    }
  }
    
}
