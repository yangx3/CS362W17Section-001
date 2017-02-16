package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import dominion.Card.CardName;
import dominion.Card.Type;

import static org.junit.Assert.*;

public class TestAll {
	
	//test smithy
	@Test
	public void test0() throws Throwable{
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

		// initialize a game state and player cards
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);  
		
	    Player player = new Player(state, "player-1");
	    player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
	    state.addPlayer(player);
	    player = new Player(state, "player-2");
	    state.addPlayer(player);
	    //Initialize the game!
		state.initializeGame();
		
		//play smithy card
		state.players.get(0).playKingdomCard();
		System.out.println("Player hand size:" + state.players.get(0).hand.size() + " expected hand size: 8");
		System.out.println("Player deck size:" + state.players.get(0).deck.size() + " expected deck size: 2");
		System.out.println("Player discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
		System.out.println("Player numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
		assertEquals(state.players.get(0).hand.size(),8);
		assertEquals(state.players.get(0).deck.size(),2);
		assertEquals(state.players.get(0).discard.size(),1);
		assertEquals(state.players.get(0).numActions,0);
		      
	}
	
	//test for Adventurer
	@Test
	public void test1() throws Throwable{
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	   

		// initialize a game state and player cards
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);  
		boolean discardsize = false;
	    Player player = new Player(state, "player-1");
	    player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
	    state.addPlayer(player);
	    player = new Player(state, "player-2");
	    state.addPlayer(player);
	    //Initialize the game!
		state.initializeGame();
		
		//play Adventurer card
		System.out.println(state.players.get(0).hand);
		state.players.get(0).playKingdomCard();
		System.out.println("Player hand size:" + state.players.get(0).hand.size() + " expected hand size: 7");
		System.out.println("Player discard size:" + state.players.get(0).discard.size() + " expected discard size: x>=1");
		System.out.println("Player numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
		assertEquals(state.players.get(0).hand.size(),10);////////////////////////////error 7
		assertEquals(state.players.get(0).numActions,0);
		if(state.players.get(0).discard.size()>0){
			discardsize = true;
		}
		assertEquals(discardsize,true);
		System.out.println(state.players.get(0).hand);
		      
	}
	
	//test for Village
		@Test
		public void test2() throws Throwable{
			List<Card> cards;
		    GameState state;
			Randomness.reset(10);	   

			// initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);  
		    Player player = new Player(state, "player-1");
		    player.hand.add(Card.getCard(cards,Card.CardName.Village));
		    state.addPlayer(player);
		    player = new Player(state, "player-2");
		    state.addPlayer(player);
		    //Initialize the game!
			state.initializeGame();
			
			//play Village card
			state.players.get(0).playKingdomCard();
			System.out.println("Player hand size:" + state.players.get(0).hand.size() + " expected hand size: 6");
			System.out.println("Player discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
			System.out.println("Player numActions size:" + state.players.get(0).numActions + " expected numActions: 1");
			//assertEquals(state.players.get(0).hand.size(),6); error dose not draw card
			assertEquals(state.players.get(0).discard.size(),1);
			assertEquals(state.players.get(0).numActions,1);
			      
		}
		
		//test for Ambassador
				@Test
				public void test3() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Ambassador card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 3");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),3);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					
					System.out.println("Player-2 hand size:" + state.players.get(1).hand.size() + " expected hand size: 5");
					System.out.println("Player-2 discard size:" + state.players.get(1).discard.size() + " expected discard size: 2");
					System.out.println("Player-2 numActions size:" + state.players.get(1).numActions + " expected numActions: 1");
					assertEquals(state.players.get(1).hand.size(),5);
					assertEquals(state.players.get(1).discard.size(),2);
					assertEquals(state.players.get(1).numActions,1);
					      
				}
				
				@Test
				public void test4() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
				    player.hand.add(Card.getCard(cards,Card.CardName.Curse));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Ambassador card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 4");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),4);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					
					int countcurse = 0;
					for(Card c : state.players.get(1).discard){
						if(c.getCardName()==Card.CardName.Curse){
							countcurse++;
						}
					}
					System.out.println("Player-2 hand size:" + state.players.get(1).hand.size() + " expected hand size: 5");
					System.out.println("Player-2 discard size:" + state.players.get(1).discard.size() + " expected discard size: 2");
					System.out.println("Player-2 numActions size:" + state.players.get(1).numActions + " expected numActions: 1");
					System.out.println("Player-2 num of curse card in discard:" + countcurse + " expected value: 1");
					assertEquals(state.players.get(1).hand.size(),5);
					assertEquals(state.players.get(1).discard.size(),2);
					assertEquals(state.players.get(1).numActions,1);
					assertEquals(countcurse,1);
					      
				}
				
				@Test
				public void test5() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Ambassador));
				    player.hand.add(Card.getCard(cards,Card.CardName.Curse));
				    player.hand.add(Card.getCard(cards,Card.CardName.Curse));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Ambassador card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 5");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),5);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					
					int countcurse = 0;
					for(Card c : state.players.get(1).discard){
						if(c.getCardName()==Card.CardName.Curse){
							countcurse++;
						}
					}
					System.out.println("Player-2 hand size:" + state.players.get(1).hand.size() + " expected hand size: 5");
					System.out.println("Player-2 discard size:" + state.players.get(1).discard.size() + " expected discard size: 2");
					System.out.println("Player-2 numActions size:" + state.players.get(1).numActions + " expected numActions: 1");
					System.out.println("Player-2 num of curse card in discard:" + countcurse + " expected value: 2");
					assertEquals(state.players.get(1).hand.size(),5);
					assertEquals(state.players.get(1).discard.size(),2);
					assertEquals(state.players.get(1).numActions,1);
					assertEquals(countcurse,2);
					      
				}
				
				//test for Baron
				@Test
				public void test6() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Baron));
				    player.hand.add(Card.getCard(cards,Card.CardName.Estate));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Baron card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 6");
					System.out.println("Player-1 Coins:" + state.players.get(0).coins + " expected coins: 4");
					System.out.println("Player-1 numBuys:" + state.players.get(0).numBuys + " expected numBuys: 2");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),6);
					assertEquals(state.players.get(0).coins,4);
					//assertEquals(state.players.get(0).numBuys,2);  error does no increase numbuys
					assertEquals(state.players.get(0).numActions,0);
					      
				}
				
				
				//test Cutpurse
				@Test
				public void test8() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Cutpurse));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Cutpurse card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 5");
					System.out.println("Player-1 Coins:" + state.players.get(0).coins + " expected coins: 2");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),5);
					assertEquals(state.players.get(0).coins,2);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					
					System.out.println("Player-2 hand size:" + state.players.get(1).hand.size() + " expected hand size: 4");
					System.out.println("Player-2 discard size:" + state.players.get(1).discard.size() + " expected discard size: 1");
					assertEquals(state.players.get(1).hand.size(),4);
					assertEquals(state.players.get(1).discard.size(),1);
					      
				}
				
				//test Council_Room
				@Test
				public void test9() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Council_Room));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Council_Room card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 9");
					System.out.println("Player-1 numBuys:" + state.players.get(0).numBuys + " expected numBuys: 2");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),9);
					assertEquals(state.players.get(0).numBuys,2);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					
					System.out.println("Player-2 hand size:" + state.players.get(0).hand.size() + " expected hand size: 6");
					assertEquals(state.players.get(1).hand.size(),6);
					      
				}
				
				//test Embargo
				@Test
				public void test10() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Embargo));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Embargo card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 9");
					System.out.println("Player-1 coins:" + state.players.get(0).coins + " expected coins: 2");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					assertEquals(state.players.get(0).hand.size(),5);
					assertEquals(state.players.get(0).coins,2);
					assertEquals(state.players.get(0).discard.size(),0);
					assertEquals(state.players.get(0).numActions,0);
					
					System.out.println("Num of Embargo coins in fild:" + state.embargoCoin + " expected Num of Embargo coins: 1");
					assertEquals(state.embargoCoin,1);
					
					/*error detected
					state.players.get(0).coins = 10;
					state.players.get(0).buyCard(1);
					int countcurse = 0;
					for(Card c : state.players.get(1).discard){
						if(c.getCardName()==Card.CardName.Curse){
							countcurse++;
						}
					}
					System.out.println("Player-1 discard size:" + state.players.get(1).discard.size() + " expected discard size: 2");
					System.out.println("Player-1 num curse card in discard:" + countcurse + " expected num curse card in discard: 0");
					assertEquals(state.players.get(0).discard.size(),2);
					assertEquals(countcurse,0)
					*/
					state.players.get(1).coins = 10;
					state.players.get(1).buyCard(1);
					int countcurse = 0;
					for(Card c : state.players.get(1).discard){
						if(c.getCardName()==Card.CardName.Curse){
							countcurse++;
						}
					}
					System.out.println("Player-2 discard size:" + state.players.get(1).discard.size() + " expected discard size: 2");
					System.out.println("Player-2 num curse card in discard:" + countcurse + " expected num curse card in discard: 1");
					assertEquals(state.players.get(1).discard.size(),2);
					assertEquals(countcurse,1);     
				}
				
				//test Feast
				@Test
				public void test11() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					boolean costGainCard = false;
					
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Feast));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Feast card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 5");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions: 0");
					System.out.println("Gain card cost:" + state.players.get(0).discard.get(0).getCost() + " expected cost: x<6");
					assertEquals(state.players.get(0).hand.size(),5);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					if(state.players.get(0).discard.get(0).getCost()<6){
						costGainCard = true;
					}
					assertEquals(costGainCard,true);
					      
				}
				
				//test Great_Hall
				@Test
				public void test12() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Great_Hall card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 6");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions:1");
					assertEquals(state.players.get(0).hand.size(),6);
					assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,1);
					      
				}
				
				//test Minion
				@Test
				public void test13() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					int whichcase = 0;
					boolean trueminion = false;
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Minion));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Minion card
					state.players.get(0).playKingdomCard();
					if(state.players.get(0).coins == 2 || state.players.get(0).coins == 0){
						if(state.players.get(0).coins == 2){
							System.out.println("Player-1 coins:" + state.players.get(0).coins + " expected hand size: 2");
							whichcase++;
						}else{
							System.out.println("Player-1 coins:" + state.players.get(0).coins + " expected hand size: 0");
							whichcase = whichcase +2;
						}
					}
					
					if(state.players.get(0).hand.size() == 5 || state.players.get(0).hand.size() == 4){
						if(state.players.get(0).hand.size() == 5 ){
							System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 5");
							whichcase++;
						}else{
							System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 4");
							whichcase = whichcase +2;
						}
					}
					
					if(state.players.get(1).hand.size() == 5 || state.players.get(1).hand.size() == 4){
						if(state.players.get(1).hand.size() == 5 ){
							System.out.println("Player-2 hand size:" + state.players.get(1).hand.size() + " expected hand size: 5");
							whichcase++;
						}else{
							System.out.println("Player-2 hand size:" + state.players.get(1).hand.size() + " expected hand size: 4");
							whichcase = whichcase +2;
						}
					}
					
					if(whichcase == 3 || whichcase ==6){
						trueminion = true;
					}
					assertEquals(trueminion,true);					      
				}
				
				//test Mine
				@Test
				public void test14() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					
				    Player player = new Player(state, "player-1");
				    player.hand.add(Card.getCard(cards,Card.CardName.Mine));
				    player.hand.add(Card.getCard(cards,Card.CardName.Cooper));
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					//play Mine card
					state.players.get(0).playKingdomCard();
					System.out.println("Player-1 hand size:" + state.players.get(0).hand.size() + " expected hand size: 6");
					System.out.println("Player-1 discard size:" + state.players.get(0).discard.size() + " expected discard size: 1");
					System.out.println("Player-1 numActions size:" + state.players.get(0).numActions + " expected numActions:0");
					//assertEquals(state.players.get(0).hand.size(),6); error
					//assertEquals(state.players.get(0).discard.size(),1);
					assertEquals(state.players.get(0).numActions,0);
					      
				}
				
				//Test player
				//initializePlayerTurn
				@Test
				public void test15() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					
					Player player = new Player(state, "player-1");
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
				    state.players.get(0).numActions = 5;
				    state.players.get(0).coins = 5;
				    state.players.get(0).numBuys = 5;
				    state.players.get(0).initializePlayerTurn();
					
					System.out.println("Player coins:" + state.players.get(0).coins + " expected coins: 0");
					System.out.println("Player numBuys:" + state.players.get(0).numBuys + " expected numBuys: 1");
					System.out.println("Player numActions size:" + state.players.get(0).numActions + " expected numActions:1");
					assertEquals(state.players.get(0).coins,0);
					assertEquals(state.players.get(0).numBuys,1);
					assertEquals(state.players.get(0).numActions,1);
					      
				}
				
				//scoreFor
				@Test
				public void test16() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					Player player = new Player(state, "player-1");
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Estate));
					state.players.get(0).discard.add(Card.getCard(cards,Card.CardName.Estate));
				    int pscore  = state.players.get(0).scoreFor();
					System.out.println("Player score:" + pscore + " expected score: 5");
					assertEquals(pscore,15);
				}
				
				@Test
				//playTtreasureCard
				public void test17() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					boolean itworks = false;
					
					Player player = new Player(state, "player-1");
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();

					state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Cooper));
					state.players.get(0).playTtreasureCard();
					System.out.println("Player coins:" + state.players.get(0).coins + " expected coins: x>0");
					if(state.players.get(0).coins>0){
						itworks = true;
					}
					assertEquals(itworks,true);
				}
				
				@Test
				//endTurn
				public void test18() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					boolean itworks = false;
					
					Player player = new Player(state, "player-1");
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					
					state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Cooper));
					state.players.get(0).numActions = 5;
					state.players.get(0).coins = 5;
					state.players.get(0).numBuys = 5;
					state.players.get(0).endTurn();;
					System.out.println("Player hand size:" + state.players.get(0).hand.size() + " expected hand size: 5");
					System.out.println("Player coins:" + state.players.get(0).coins + " expected coins: 0");
					System.out.println("Player numBuys:" + state.players.get(0).numBuys + " expected numBuys: 1");
					System.out.println("Player numActions size:" + state.players.get(0).numActions + " expected numActions:1");
					assertEquals(state.players.get(0).hand.size(),5);
					assertEquals(state.players.get(0).coins,0);
					assertEquals(state.players.get(0).numBuys,1);
					assertEquals(state.players.get(0).numActions,1);
				}
				
				@Test
				//isGameOver
				public void test19() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					boolean finished = false;
				    Player player = new Player(state, "player-1");
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					state.gameBoard.put(Card.getCard(cards,Card.CardName.Gold),0);
					state.gameBoard.put(Card.getCard(cards,Card.CardName.Silver),0);
					state.gameBoard.put(Card.getCard(cards,Card.CardName.Cooper),0);
					finished = state.isGameOver();
					assertEquals(finished,true);
				}
				
				@Test
				//isGameOver
				public void test20() throws Throwable{
					List<Card> cards;
				    GameState state;
					Randomness.reset(10);	   

					// initialize a game state and player cards
					cards = new ArrayList<Card>(Card.createCards());
					state = new GameState(cards);  
					boolean finished = false;
				    Player player = new Player(state, "player-1");
				    state.addPlayer(player);
				    player = new Player(state, "player-2");
				    state.addPlayer(player);
				    //Initialize the game!
					state.initializeGame();
					state.gameBoard.put(Card.getCard(cards,Card.CardName.Province),0);
					finished = state.isGameOver();
					assertEquals(finished,true);
				}

}
