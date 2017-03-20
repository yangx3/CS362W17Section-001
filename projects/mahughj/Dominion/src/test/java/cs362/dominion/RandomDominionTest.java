package cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;

import org.junit.Test;

public class RandomDominionTest {

	@Test
	public void test() {
		   
	    List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

		int numP = Randomness.nextRandomInt(5);
		while (numP < 2 || numP > 4) {
			numP = Randomness.nextRandomInt(5);			
		}
		//the cards  are achieved by each element/constant in the enum class 
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
//		 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
		
	      Player player = new Player(state, "player-1");
	      state.addPlayer(player);
//	      player.printStateGame();
	      //   player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
	      //   player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
	      for (int i = 1; i < numP; i++){
	    	  player = new Player(state, "player-" + (i+1));
	    	  state.addPlayer(player);		      
	    	  System.out.println("Player-" + (i+1) + " added!");
		  }
	      //Initialize the game!
	      for (Player pl : state.players) {
	    	  System.out.println(pl.player_username);
	      }
	      state.initializeGame();
	      
	      System.out.println("Initialization DominionBoard:\n " + state.toString());
	      
	      
	      
//	      player.printStateGame();

	      int actSto = 0;
	      int coinSto = 0;
	      int buySto = 0;
	      int handSto = 0;
	      int numCop = 0, numSil = 0, numGol = 0;
	      List<Card> discSto = null;
	      List<Card> handCardSto = null;
	      boolean shouldBuy = false, shouldPlay = false;
	      int discSize = 0, discSize2 = 0;
      
	   	  int turn =0;	
	      while (!state.isGameOver()) {
	    	  turn++;
	    	  if (turn == 20) {
	    		  System.out.println("BREAK!");
	    	  }
	         for (Player play : state.players) {
	        	 	shouldBuy = false;
	        	 	shouldPlay = false;
	        	 	coinSto = 0;
	        	    System.out.println("Turn " + turn + "!");
	        	    if (turn == 20) {
	        	    	System.out.println("FOR DA BREAK!");
	        	    }
	        	 	System.out.println("Player: "+ play.player_username + " is playing");
	        	 	play.startTurn();
	        	 //	System.out.println("Turn Started");
	   				//player p plays action card
	        	 	
	        	 	for (Card c : play.hand) {
	        	 		if (c.getType().toString() == "ACTION" || c.getType().toString() == "ACTION_VICTORY" || c.getType().toString() == "ACTION_ATTACK") {
	        	 			shouldPlay = true;
	        	 		}
	        	 	}
	   			    if (turn >= 20) {
	   			    	//System.out.println("1: " + play.coins + " 2 " + coinSto);
	   			    	for (Card g : play.hand) {
	   			    		String st = g.getCardName().toString();
	   			    		System.out.println(st);
	   			    	}
	   			    }
	        	 //	discSize = play.discard.size();
	        	 	play.playKingdomCard();
	        	 	//if (shouldPlay == true) {	   			    
	        	 		//if (discSize >= play.discard.size()) {
	   			    	//System.out.println("DISC COUNT FAIL");
	   			    	//System.err.println("DISC COUNT FAIL");
	   			    //}
//	        	 		assert(discSize < play.discard.size());
	//        	 	}
	        	 	//actSto = play.numActions;
	        	 	//System.out.println(actSto + " Actions left. Should be 0 most turns.");
	
	   			    if (turn >= 20) {
	   			    	//System.out.println("1: " + play.coins + " 2 " + coinSto);
	   			    	for (Card g : play.hand) {
	   			    		String st = g.getCardName().toString();
	   			    		System.out.println(st);
	   			    	}
	   			    }
	        		for (Card c : play.hand){
	        	 		if (c.getCardName().toString() == "Copper") {
	        	 			coinSto++;
	        	 		}
	        	 		else if (c.getCardName().toString() == "Silver") {
	        	 			coinSto++;
	        	 			coinSto++;
	        	 		}
	        	 		else if (c.getCardName().toString() == "Gold") {
	        	 			coinSto++;
	        	 			coinSto++;
	        	 			coinSto++;
	        	 		}
	        	 	}
	        		System.out.println(play.coins);
	        	 	coinSto += play.coins;
	   			    play.playTtreasureCard();
	   			    if (turn >= 20) {
	   			    	System.out.println("1: " + play.coins + " 2 " + coinSto);
	   			    	for (Card g : play.hand) {
	   			    		String st = g.getCardName().toString();
	   			    		System.out.println(st);
	   			    	}
	   			    }
	   			    if (play.coins != coinSto) {
	   			    	System.out.println("TREASURE COUNT FAIL");
	   			    	System.err.println("TREASURE COUNT FAIL");
	   			    }
	   			    assertEquals(play.coins, coinSto);
	   			  //  System.out.println("Treasure Playing Finished");
	   			    //player buy cards 
	   			    
	   			    discSto = play.discard;
	        	    if (play.coins > 2) {
	        	    	shouldBuy = true;
	        	    	discSize = play.discard.size();
	        	    }
	   			    play.buyCard();
	   			    if (shouldBuy == true) {
	   			    	discSize2 = play.discard.size();
	   			    	if (discSize > discSize2){
	   			    		System.out.println("Discard shrunk after purchase...");
	   			    		assert(discSize < discSize2);
	   			    	} else if (discSize == discSize2) {
	   			    		System.out.println("Nothing Bought.");
	   			    		assert(discSize < discSize2);
	   			    	} else if (discSize < discSize2) {
	   			    		assert(discSize < discSize2);
	   			    	}
	   			    }
	        	    
	        	    play.endTurn();
	        	    if (!state.isGameOver()) {
	        	    	assertEquals(5, play.hand.size());
	        	    }
	        	    if (state.isGameOver()) {
	        	    	System.out.println(state.toString());
	        	    	break;
	        	    }
	         }
	     }
	     HashMap<Player, Integer> winners=state.getWinners();	    
	     System.out.println ("Finished game.\n");
	    
	      for(Player p: winners.keySet()){
	    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
	      }
		 boolean properEnd = false;
		 Collection<Integer> myvar = state.gameBoard.values();
		 int numEmp = 0;
		 for (int num: myvar) {
		  	if (num == 0) {
		   		numEmp++;
		   	}
		 }
	     if (numEmp < 3) {
		    	if (state.gameBoard.get(Card.getCard(cards, "Province")) <= 0){
		    		properEnd = true;
		    	}
		    } else {
		    	properEnd = true;
		    }
		    assertEquals(true, properEnd);
		    System.out.println("EndGameTestConcluded");
		    
			 
		//System.exit(0); 
	}

}
