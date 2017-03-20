package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class cardsTest {

	//public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void SmithyTest()  throws Throwable  {	   
		  System.out.println("  *****    SMITHY TEST ***** " );
		    List<Card> cards;
		    GameState state,testState;
		    Random rand = new Random();
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		         int numPlayers = rand.nextInt(3)+2;
		 		if(numPlayers > 3){
		 			player = new Player(state, "player-3");
		 	        state.addPlayer(player);
		 		}
		 		if(numPlayers > 4){
		 			player = new Player(state, "player-4");
		 	        state.addPlayer(player);
		 		}
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      //copy or clone the game state to a test case
/*		      testState=(GameState) state.clone();

  		     //	play the game 
		      HashMap<Player, Integer> winners=state.play();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
		      
		      System.out.println("  *****    Player-2 Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards ))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
	      
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;    
*/
	   }
	  
	  @Test
	  public void AdventuerTest()  throws Throwable  {	   
		  System.out.println("  *****    ADVENTUERER TEST ***** " );
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      int hands = state.players.get(0).hand.size();
		      int result = hands + 2;
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      //testState=(GameState) state.clone();
		      //HashMap<Player, Integer> winners=state.play();
		      
		      Card c = Card.getCard(cards, Card.CardName.Adventurer);
		      c.play(state.players.get(0), state);
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( state.players.get(0).hand.size() + result ) );
		      //assertEquals(state.players.get(0).hand.size(), 10);
		      if(state.players.get(0).hand.size() == (state.players.get(0).hand.size()+result)){
		    	  System.out.println("SUCCEED")
		      }
		      else{
		    	  System.out.println("FAILED")
		      }
	  }
	  
	  @Test
	  public void VillageTest()  throws Throwable  {	  
		  System.out.println("  *****    VILLAGE TEST ***** " );
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Village));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      int hands = state.players.get(0).hand.size();
		      int actions = state.players.get(0).numActions;
		      int result1 = hands + 1;
		      int result2 = actions + 2;
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      //testState=(GameState) state.clone();
		      //HashMap<Player, Integer> winners=state.play();
		      
		      Card c = Card.getCard(cards, Card.CardName.Adventurer);
		      c.play(state.players.get(0), state);
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( state.players.get(0).hand.size() + result1 ) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( state.players.get(0).numActions - result2 ) );
		      //assertEquals(state.players.get(0).hand.size(), 10);
		      //assertEquals(state.players.get(0).numActions, 1);
		      if(state.players.get(0).hand.size() == (state.players.get(0).hand.size()+result1)){
		    	  System.out.println("SUCCEED")
		      }
		      else{
		    	  System.out.println("FAILED")
		      }
		      if(state.players.get(0).hand.size() == (state.players.get(0).numActions-result2)){
		    	  System.out.println("SUCCEED")
		      }
		      else{
		    	  System.out.println("FAILED")
		      }
	  }
	  
	  @Test
	  public void AmbassadorTest()  throws Throwable  {	   
		  System.out.println("  *****    AMBASSADOR TEST ***** " );
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      int hands = state.players.get(0).hand.size();
		      int result1 = hands - 1;
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      //testState=(GameState) state.clone();
		      //HashMap<Player, Integer> winners=state.play();
		      
		      Card c = Card.getCard(cards, Card.CardName.Adventurer);
		      c.play(state.players.get(0), state);
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( state.players.get(0).hand.size() + result1 ) );
		      //assertEquals(state.players.get(0).hand.size(), 10);
		      if(state.players.get(0).hand.size() == (state.players.get(0).hand.size()+result1)){
		    	  System.out.println("SUCCEED")
		      }
		      else{
		    	  System.out.println("FAILED")
		      }
	  }
	  
	  @Test
	  public void StewardTest()  throws Throwable  {	   
		  System.out.println("  *****    STEWARD TEST ***** " );
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Steward));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      int money = state.players.get(0).coins;
		      int result1 = + 2;
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      //testState=(GameState) state.clone();
		      //HashMap<Player, Integer> winners=state.play();
		      
		      Card c = Card.getCard(cards, Card.CardName.Adventurer);
		      c.play(state.players.get(0), state);
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( state.players.get(0).hand.size() + result1 ) );
		      //assertEquals(state.players.get(0).hand.size(), 10);
		      if(state.players.get(0).hand.size() == (state.players.get(0).hand.size()+result1)){
		    	  System.out.println("SUCCEED")
		      }
		      else{
		    	  System.out.println("FAILED")
		      }
	  }
	  
	  @Test
	  public void EmbargoTest()  throws Throwable  {	   
		  System.out.println("  *****    EMBARGO TEST ***** " );
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Embargo));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      int money = state.players.get(0).coins;
		      int result1 = + 2;
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      //testState=(GameState) state.clone();
		      //HashMap<Player, Integer> winners=state.play();
		      
		      Card c = Card.getCard(cards, Card.CardName.Adventurer);
		      c.play(state.players.get(0), state);
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( state.players.get(0).hand.size() + result1 ) );
		      //assertEquals(state.players.get(0).hand.size(), 10);
		      if(state.players.get(0).hand.size() == (state.players.get(0).hand.size()+result1)){
		    	  System.out.println("SUCCEED")
		      }
		      else{
		    	  System.out.println("FAILED")
		      }
	  }
	
}
