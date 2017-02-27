package dominion;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class RandomTest {
	
	static public void new_element(ArrayList<Integer> cards, int[] k)
	{
		int random_add=(int)(Math.random()*6);
		while(cards.contains(random_add))
			random_add=(int)(Math.random()*6);
		cards.add(random_add);
	}
	
	@Test
	public void top_test() {
		gameState State=new gameState();
		
		int num_cards=(int)(Math.random()*6+1);
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		
		ArrayList<Integer> cards=new ArrayList<Integer>();
		
		
				
		
		System.out.printf("Starting game.\n");
		
		int money = 0;
		int smithyPos = -1;
		int adventurerPos = -1;
		int i=0;
		
		int old_cards;
	
		
		int numAdventurers = 0;
		
		int num_players=(int)(3*Math.random()+2);
		int[] j=new int[6];
		
		for(int loop=0;loop<5000;loop++)
		{
			num_cards=(int)(Math.random()*6+1);
			num_players=(int)(3*Math.random()+2);
			cards=new ArrayList<Integer>();
			
			
			for(int count=0;count<num_cards;count++)
				new_element(cards, k);
			
			j = new int[ num_cards];
			for(int count=0;count<num_cards;count++)
				j[count]=cards.get(count);
		
			
		State.initializeGame(num_players, j, 10);
		
		while (State.isGameOver()==0) {
		    money = 0;
		    smithyPos = -1;
		    adventurerPos = -1;
		    for (i = 0; i < State.numHandCards(); i++) {
		      if (State.handCard(i) == CARD.copper.get_CARD())
		    money++;
		      else if (State.handCard(i) == CARD.silver.get_CARD())
		    money += 2;
		      else if (State.handCard(i) == CARD.gold.get_CARD())
		    money += 3;
		      else if (State.handCard(i) == CARD.adventurer.get_CARD())
		    adventurerPos = i;
		}
		    
		    
		    if (State.whoseTurn() == 0) {
		        if (smithyPos != -1) {
		        	old_cards=State.players[0].handcount;
		        	//System.out.printf("0: smithy played from position %d\n", smithyPos); 
		          State.playCard(smithyPos, -1, -1, -1); 
		          assertEquals(old_cards-1, State.players[0].handcount);
		          //System.out.printf("smithy played.\n");
		  	money = 0;
		  	i=0;
		  	while(i<State.numHandCards()){
		  	  if (State.handCard(i) == CARD.copper.get_CARD()){
		  		old_cards=State.players[0].handcount;
		  		State.playCard(i, -1, -1, -1);
		  		assertEquals(old_cards-1, State.players[0].handcount);
		  		
		  	    money++;
		  	  }
		  	  else if (State.handCard(i) == CARD.silver.get_CARD()){
		  		State.playCard(i, -1, -1, -1);
		  	    money += 2;
		  	  }
		  	  else if (State.handCard(i) == CARD.gold.get_CARD()){
		  		State.playCard(i, -1, -1, -1);
		  	    money += 3;
		  	  }
		  	  
		  	  i++;
		  	}
		        }
		        
	        if (money >= 8) {
	        	//System.out.printf("0: bought province\n"); 
	        	State.buyCard(CARD.province.get_CARD());
	          }
	          else if (money >= 6) {
	        	  //System.out.printf("0: bought gold\n"); 
	        	  State.buyCard(CARD.gold.get_CARD());
	          }
	          else if (money >= 3) {
	        	  //System.out.printf("0: bought silver\n"); 
	        	  State.buyCard(CARD.silver.get_CARD());
	          }

	        //System.out.printf("0: end turn\n");
	        State.endTurn();
	        
	        assertEquals(State.whoseTurn(), 1);
	        }
		    
		    if (State.whoseTurn() == 1) {
		        if (smithyPos != -1) {
		        	old_cards=State.players[1].handcount;
		        	//System.out.printf("0: smithy played from position %d\n", smithyPos); 
		          State.playCard(smithyPos, -1, -1, -1); 
		          assertEquals(old_cards-1, State.players[1].handcount);
		  	money = 0;
		  	i=0;
		  	while(i<State.numHandCards()){
		  	  if (State.handCard(i) == CARD.copper.get_CARD()){
		  		old_cards=State.players[0].handcount;
		  		State.playCard(i, -1, -1, -1);
		  		assertEquals(old_cards-1, State.players[0].handcount);
		  	    money++;
		  	  }
		  	  else if (State.handCard(i) == CARD.silver.get_CARD()){
		  		State.playCard(i, -1, -1, -1);
		  	    money += 2;
		  	  }
		  	  else if (State.handCard(i) == CARD.gold.get_CARD()){
		  		State.playCard(i, -1, -1, -1);
		  	    money += 3;
		  	  }
		  	  
		  	  i++;
		  	}
		        }
		        
	        if (money >= 8) {
	        	//System.out.printf("0: bought province\n"); 
	        	State.buyCard(CARD.province.get_CARD());
	          }
	          else if (money >= 6) {
	        	  //System.out.printf("0: bought gold\n"); 
	        	  State.buyCard(CARD.gold.get_CARD());
	          }
	          else if (money >= 3) {
	        	  //System.out.printf("0: bought silver\n"); 
	        	  State.buyCard(CARD.silver.get_CARD());
	          }

	        //System.out.printf("0: end turn\n");
	        State.endTurn();
	        if(num_players==3)
	        	assertEquals(State.whoseTurn(), 2);
	        }
		    
		    if (State.whoseTurn() == 2) {
		        if (smithyPos != -1) {
		        	old_cards=State.players[2].handcount;
		        	//System.out.printf("0: smithy played from position %d\n", smithyPos); 
		          State.playCard(smithyPos, -1, -1, -1); 
		          assertEquals(old_cards-1, State.players[2].handcount);
		  	money = 0;
		  	i=0;
		  	while(i<State.numHandCards()){
		  	  if (State.handCard(i) == CARD.copper.get_CARD()){
		  		old_cards=State.players[0].handcount;
		  		State.playCard(i, -1, -1, -1);
		  		assertEquals(old_cards-1, State.players[0].handcount);
		  	    money++;
		  	  }
		  	  else if (State.handCard(i) == CARD.silver.get_CARD()){
		  		State.playCard(i, -1, -1, -1);
		  	    money += 2;
		  	  }
		  	  else if (State.handCard(i) == CARD.gold.get_CARD()){
		  		State.playCard(i, -1, -1, -1);
		  	    money += 3;
		  	  }
		  	  
		  	  i++;
		  	}
		        }
		        
	        if (money >= 8) {
	        	//System.out.printf("0: bought province\n"); 
	        	State.buyCard(CARD.province.get_CARD());
	          }
	          else if (money >= 6) {
	        	  //System.out.printf("0: bought gold\n"); 
	        	  State.buyCard(CARD.gold.get_CARD());
	          }
	          else if (money >= 3) {
	        	  //System.out.printf("0: bought silver\n"); 
	        	  State.buyCard(CARD.silver.get_CARD());
	          }

	        //System.out.printf("0: end turn\n");
	        State.endTurn();
	        if(num_players==4)
	        	assertEquals(State.whoseTurn(), 3);
	        }
		    
	        else {
	          if (adventurerPos != -1) {
	        	  old_cards=State.players[3].handcount;
		        	//System.out.printf("0: smithy played from position %d\n", smithyPos); 
		          State.playCard(smithyPos, -1, -1, -1); 
		          assertEquals(old_cards-1, State.players[3].handcount);
	    	money = 0;
	    	i=0;
	    	while(i<State.numHandCards()){
    		  if (State.handCard(i) == CARD.copper.get_CARD()){
    			  old_cards=State.players[0].handcount;
  		  		State.playCard(i, -1, -1, -1);
  		  		assertEquals(old_cards-1, State.players[0].handcount);
    		    money++;         
    		  }
    		  else if (State.handCard(i) == CARD.silver.get_CARD()){
    			  State.playCard(i, -1, -1, -1);
    		    money += 2;
    		  }
    		  else if (State.handCard(i) == CARD.gold.get_CARD()){
    			  State.playCard(i, -1, -1, -1);
    		    money += 3;
    		  }
    		  i++;
    		}
    	      }
	          
	          if (money >= 8) {
	        	  //System.out.printf("1: bought province\n");
	        	  State.buyCard(CARD.province.get_CARD());
	            }
	            else if ((money >= 6) && (numAdventurers < 2)) {
	            	//System.out.printf("1: bought adventurer\n");
	            	State.buyCard(CARD.adventurer.get_CARD());
	      	numAdventurers++;
	            }else if (money >= 6){
	            	//System.out.printf("1: bought gold\n");
	            	State.buyCard(CARD.gold.get_CARD());
	              }
	            else if (money >= 3){
	            	//System.out.printf("1: bought silver\n");
	            	State.buyCard(CARD.silver.get_CARD());
	            }
	          //System.out.printf("1: endTurn\n");
	            
	          State.endTurn();
	          
	          }

		    //System.out.printf ("Player 0: %d\nPlayer 1: %d\n", State.players[0].scoreFor(), State.players[1].scoreFor());
	      	    
	        } // end of While

		System.out.printf ("Finished game.\n");
		for(int r=0;r<num_players;r++)
			System.out.printf ("Player %d: %d\n", r, State.players[r].scoreFor());

	        
	}
	
	}

}
