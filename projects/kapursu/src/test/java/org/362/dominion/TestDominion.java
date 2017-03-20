package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random; 
import org.junit.Test;
import static org.junit.Assert.*;


public class TestDominion {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
			Random rand = new Random(); 
			int num_players = rand.nextInt(4) +2; 
			//Random rand2 = new Random(); 
		
			for (int i = 0; i < num_players; i++){
				Player player = new Player(state, "player" ); 
					for (int j = 0; j <10; j++){
						Random rand2 = new Random(); 
						int add_card = rand2.nextInt(10)+1; 
							if(add_card ==1)		
		         					player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
							if(add_card ==2)
		         					player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         				if(add_card ==3)	
								player.hand.add(Card.getCard(cards,Card.CardName.Mine));
		         				if(add_card ==4)	
								player.hand.add(Card.getCard(cards,Card.CardName.CouncilRoom));
		         				if(add_card == 5)
								player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
		         				if(add_card == 6)	
								player.hand.add(Card.getCard(cards,Card.CardName.Feast));
		        				if(add_card == 7)	
								player.hand.add(Card.getCard(cards,Card.CardName.Village));
		        				if(add_card ==8)
								player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
		         				if(add_card ==9)
								player.hand.add(Card.getCard(cards,Card.CardName.Baron));
							if(add_card == 10)
								player.hand.add(Card.getCard(cards,Card.CardName.Cutpurse));
					}
				state.addPlayer(player); 
			}
		      //Player player = new Player(state, "player-1");
		        //player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		        // state.addPlayer(player);
		      // player = new Player(state, "player-2");
		        // state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      
		      System.out.println("got here"); 
			//copy or clone the game state to a test case
		      testState=(GameState) state.clone();
			
		      System.out.println("got here"); 
  		     //	play the game 
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println("got here"); 
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

		      
		      

	   }
	
	
}
