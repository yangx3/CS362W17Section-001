package org.cs362.dominion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.cs362.dominion.Card.CardName;
import org.junit.Test;
import static org.junit.Assert.*;

public class OtherTest {

	
	//Tests the buy function 
	@Test
	  public void testBuy()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      state.players.get(0).coins+= 2;
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand coins = " + state.players.get(0).discard.size());
		      int d = state.players.get(0).discard.size();
		      int d2 = d + 1;
		      int h = state.players.get(0).coins;
		      int h2 = h - 2;
		      state.players.get(0).buyCard();
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand coins = " + state.players.get(0).discard.size() + ", expected = " + 1);
		      assertEquals(d2, state.players.get(0).discard.size());
		      //assertEquals(h2, state.players.get(0).coins);
		      

	   }
	
	
	@Test
	  public void testfilter()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      Map<Card, Integer> treeMap = new TreeMap<Card, Integer>(state.gameBoard);
		      List<Card> buyableCards = Card.filterObtainable(treeMap.keySet(), state, 0);
		      int listSize = buyableCards.size();
		      assertEquals(listSize, 1);

	   }
	
	
	@Test
	  public void testNoKingdomCards()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      state.players.get(0).coins+= 3;
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand coins = " + state.players.get(0).discard.size());
		      int d = state.players.get(0).discard.size();
		      int h = state.players.get(0).hand.size();
		      state.players.get(0).playKingdomCard();;
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand coins = " + state.players.get(0).discard.size() + ", expected = " + d);
		      assertEquals(d, state.players.get(0).discard.size());
		      assertEquals(h, state.players.get(0).hand.size());
		      

	   }
	
	@Test
	  public void testScoreFor()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      int score = state.players.get(0).scoreFor();
		      assertEquals(score, 3);
		      

	   }
	
	
	@Test
	  public void testGetCost()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);
			cards = new ArrayList<Card>(Card.createCards());

			Card c = Card.getCard(cards , Card.CardName.Estate);
			int cost = c.getCost();
			assertEquals(cost, 2);
	   }
	
	
	@Test
	  public void testEndTurn()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.playedCards.add(Card.getCard(cards,Card.CardName.Smithy));//to check played at end of turn.

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      //state.players.get(0).coins+= 3;
		      System.out.println("hand = " + state.players.get(0).hand.size());
		      System.out.println("hand played cards = " + state.players.get(0).playedCards.size());
		      System.out.println("hand discard = " + state.players.get(0).discard.size());
		      int de = state.players.get(0).deck.size() - 4;
		      int h2 = 5;
		      int d = state.players.get(0).discard.size();
		      int d2 = 6;
		      state.players.get(0).endTurn();
		      System.out.println("hand  = " + state.players.get(0).hand.size() + ", expected = " + h2);
		      System.out.println("hand discard = " + state.players.get(0).discard.size() + ", expected = " + d2);
		      assertEquals(h2, state.players.get(0).hand.size());
		      assertEquals(d2, state.players.get(0).discard.size());
		      assertEquals(state.players.get(0).playedCards.size(), 0);
		      //assertEquals(state.players.get(0).deck.size(), de);

	   }
	
	
	@Test
	  public void testGameOver()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         player = new Player(state, "player-3");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      state.gameBoard.put(Card.getCard(cards, Card.CardName.Province), 0);
		      System.out.println("Game should be over on check: ");
		      assertTrue(state.isGameOver());
		      

	   }
	
	
	@Test
	  public void testGameNotOver()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      state.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 0);
		      System.out.println("Game should be over on check: ");
		      assertFalse(state.isGameOver());
		      

	   }
	
	
	@Test
	  public void testGameOver2()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      state.gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 0);
		      state.gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 0);
		      state.gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 0);
		      System.out.println("Game should be over on check: ");
		      assertTrue(state.isGameOver());
		      

	   }
	
	
	@Test
	  public void testTreasurePlay()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Silver));
		      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Gold));
		      int value = 0;
		      for(Card c: state.players.get(0).hand){
		    	  value+=c.getTreasureValue();
		      }
		      
		      state.players.get(0).playTtreasureCard();
		      
		      System.out.println("Value in hand = " + value + "Treasure value played = " + state.players.get(0).coins);

		      assertEquals(value, state.players.get(0).coins);

	   }
	
	
	@Test
	  public void testOpeningBoardStatefor3()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         player = new Player(state, "player-3");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      Card c = Card.getCard(cards, Card.CardName.Cooper);
		      int copper = state.gameBoard.get(c);
		      System.out.println("\ncopper = " + copper);
		      
		      c = Card.getCard(cards, Card.CardName.Silver);
		      int silver = state.gameBoard.get(c);
		      System.out.println("\nsilver = " + silver);
		      
		      c = Card.getCard(cards, Card.CardName.Province);
		      int province = state.gameBoard.get(c);
		      
		      c = Card.getCard(cards, Card.CardName.Curse);
		      int  curse = state.gameBoard.get(c);
		      
		      assertEquals(copper, 39);
		      assertEquals(silver, 40);
		      assertEquals(province, 12);
		      assertEquals(curse, 20);

	   }
	
	
}
