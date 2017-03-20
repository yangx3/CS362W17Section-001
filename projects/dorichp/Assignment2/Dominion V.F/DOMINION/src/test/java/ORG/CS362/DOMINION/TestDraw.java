package ORG.CS362.DOMINION;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDraw {

	@Test
	public void test() {
		
		List<Card> cards;
	    GameState state;
		
	    cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
	    
	    Player player = new Player(state, "player-1");
	    
	//    player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));		
      //  player.hand.add(Card.getCard(cards,Card.CardName.Smithy));	
        state.players.add(player);
        
        player = new Player(state, "player-2");
//        player.hand.add(Card.getCard(cards,Card.CardName.Smithy));			
  //      player.hand.add(Card.getCard(cards,Card.CardName.Village));	
        state.players.add(player);
        
        
        state.initializeGame();
        int temp;
		System.out.println("The amount of cards in the gameBoard deck is: " + state.gameBoard.size());

//        temp = (int)  Randomness.random.nextInt(state.gameBoard.size());		//chooses random number between 1 and the max deck size?
        
      //  state.gameBoard.get(temp);
        
		System.out.println("The amount of cards in the player's hand is: " + player.hand.size());
		
		
		
	}

}
