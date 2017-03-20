package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.Type;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayDominionTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   
		  int i=0;
		    
		   	List<Card> cards;
		    GameState state;
			Randomness.reset(10);
			List<String> playerNames = new ArrayList<String>();;
			
			playerNames.add("Player 1");
			playerNames.add("Player 2");
			playerNames.add("Player 3");
			playerNames.add("Player 4");
			
			while(i<500){
			
			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			
			int random = 0;
			while((random < 2) || (random>4 )){
					random = (int)  Randomness.random.nextInt(5);}
			
			
			
		    for (int mn = 0; mn<random; mn++){
		      Player player = new Player(state, playerNames.get(mn));
		      state.addPlayer(player);		      
		    }
		  
		      
		      state.initializeGame();
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
		      }
		      
	//	      player.printStateGame();
		      
		      
		      i += 1;

		    }
		      
		      

	   }
	
	
}
