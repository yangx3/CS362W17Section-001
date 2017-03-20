package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;


public class RandomDominionTest {

	@Test
	public void test0()  throws Throwable{
		for(int j = 0; j < 5; j++){
			List<Card> cards;
		    GameState state;
			Random gwen = new Random();
			int additionalPlayers = gwen.nextInt(3);//generates a random number of players between 2 and 5

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization DominionBoard:\n " + state.toString()); 
			
		      Player player = new Player(state, "player-1");
//		      player.printStateGame();
		      int additionalCards = gwen.nextInt(5);
		      for(int l = 0; l < additionalCards; l++){
		    	   int random = gwen.nextInt(cards.size());
			        Card tmp = state.cards.get(random);//cards.get(random);
			        player.hand.add(tmp);
		       }
//		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		       for(int k = 0; k < additionalCards; k++){
		    	   int random = gwen.nextInt(cards.size());
			        Card tmp = state.cards.get(random);//cards.get(random);
			        player.hand.add(tmp);
		       }
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
//		         player.hand.add(Card.getCard(cards,Card.CardName.Village));
		      state.addPlayer(player);		      
		      //Initialize the game!
		      
		      for(int i = 0; i<additionalPlayers; i++){
		    	  player = new Player(state, "player-" + (i + 2));
		    	  state.addPlayer(player);
		      }
		      if(state.players.size() != (2+additionalPlayers)){
		    	  System.out.println("Addition of players failed!!!");//assertion to detect failures
		      }
		      
		      state.initializeGame();
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+p.player_username + " , Score: "+ winners.get(p) );
		      }
		      
//		      player.printStateGame();
		      
		      
		}
	}
}
