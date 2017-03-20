package com.mycompany.marksprousedominion; 

import org.junit.Test; 

import java.util.Random; 

import static org.junit.Assert.*; 

/** 
 *  * Created by MarkSprouse on 2/12/2017. 
 *   */ 
public class playDominionTest { 

	Random rand = new Random(10); 

	@Test 
		public void testGameInit() 
		{ 

			playDominion game =new playDominion(2, rand); 

			assertNotEquals(null,game.getCurrent()); 
			assertNotEquals(null,game.getPlayers()); 
			assertNotEquals(null,game.getBoard()); 
			assertNotEquals(0,game.getCurrent().getSize(0)); 
			assertNotEquals(0,game.getCurrent().getSize(2)); 
			assertNotEquals(0,game.getPlayers().get(0).getSize(0)); 
			assertNotEquals(0,game.getPlayers().get(0).getSize(2)); 
		} 

	@Test 
		public void testExecuteTurn() 
		{ 
			playDominion game = new playDominion(2, rand); 

			for (int i = 0; i < game.getCurrent().getSize(2); i ++) 
			{ 
				Card temp = game.getCurrent().getCard(2,i); 
				System.out.println(temp.getName()); 
			} 


			game.executeTurn(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			assertNotEquals(0,game.getCurrent().getSize(1)); 
		} 

	@Test 
		public void testGameDone() 
		{ 
			playDominion game = new playDominion(2, rand); 

			for(int i = 0; i < 44; i ++) 
			{ 
				game.getBoard().cardBought(10); 
			} 

			assertEquals(true,game.gameDone(game.getBoard())); 


			game = new playDominion(2, rand); 

			for (int i = 0; i < 8; i ++) 
			{ 
				game.getBoard().cardBought(0); 
			} 

			assertEquals(true,game.gameDone(game.getBoard())); 

		} 

	@Test 
		public void testSmithy() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(0, turn, game.getBoard()); 

			assertEquals(8,game.getCurrent().getSize(2)); 

		} 

	@Test 
		public void testCouncil() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(1, turn, game.getBoard()); 

			assertEquals(9,game.getCurrent().getSize(2)); 
			assertEquals(6,game.getPlayers().get(0).getSize(2)); 

		} 

	@Test 
		public void testWitch() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(2, turn, game.getBoard()); 

			assertEquals(7,game.getCurrent().getSize(2)); 
			assertEquals("Curse",game.getPlayers().get(0).getCard(1,game.getPlayers().get(0).getSize(1) - 1).getName()); 
		} 


	@Test 
		public void testGardens() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			int tempNum = game.getCurrent().getSize(2); 
			//Empty the Hand 
			for (int i = 0; i < tempNum; i ++) 
			{ 
				Card temp = game.getCurrent().getCard(2,0); 
				//System.out.println(temp.getName()); 
				//if(temp.getName() == "Estate") 
				game.getCurrent().addCard(2,0, 0); 
			} 

			game.getCurrent().addCard(2,new kingdomCard(4,0,0,3,"Gardens")); 

			game.executeMove(game.getCurrent(),game.getPlayers(),game.getBoard(),turn); 

			//        assertEquals(1,turn.getActions());//Gardens shouldn't decrement actions in a turn 

		}
	@Test 
		public void testRemodel() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			int num = game.getBoard().getOptions(); 

			game.cardEffect(4, turn, game.getBoard()); 

			System.out.println(game.getCurrent().getCard(1,0).getName()); 


		//	assertEquals(num - 1, game.getBoard().getOptions()); 
			//BUG: A card should be grabbed from the board 
			assertEquals(1,game.getCurrent().getSize(1)); 
			//        assertEquals(4,game.getCurrent().getSize(2)); 
			//Bug, doesn't trash card 


		}

	@Test 
		public void testVillage() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 
			turn = game.cardEffect(5, turn, game.getBoard()); 

			assertEquals(6,game.getCurrent().getSize(2)); 

			assertEquals(3, turn.getActions()); 
		} 

	@Test 
		public void testMine() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(6, turn, game.getBoard()); 

			assertEquals("Silver",game.getCurrent().getCard(2,0).getName()); 
			assertEquals(3,game.getCurrent().getCard(2,0).getCost()); 
			assertEquals(2,game.getCurrent().getCard(2,0).getTreasure()); 

			game.cardEffect(6, turn, game.getBoard()); 

			assertEquals("Gold",game.getCurrent().getCard(2,0).getName()); 
			assertEquals(6,game.getCurrent().getCard(2,0).getCost()); 
			assertEquals(3,game.getCurrent().getCard(2,0).getTreasure()); 

			game.cardEffect(6, turn, game.getBoard()); 

			assertEquals("Gold",game.getCurrent().getCard(2,0).getName()); 
			assertEquals(6,game.getCurrent().getCard(2,0).getCost()); 
			assertEquals(3,game.getCurrent().getCard(2,0).getTreasure()); 


		} 

	@Test 
		public void testAdventurer() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(7, turn, game.getBoard()); 

			assertEquals(7,game.getCurrent().getSize(2)); 

			if(game.getCurrent().getSize(1) != 0) 
				assertNotEquals("Copper",game.getCurrent().getCard(1,0)); 

			game = new playDominion(2, rand); 
			turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 
			int tempNum = game.getCurrent().getSize(0);         //Empty the Deck 
			for (int i = 0; i < tempNum; i ++) 
			{ 
				Card temp = game.getCurrent().getCard(0,0); 
				game.getCurrent().addCard(0,1, 0); 
			} 


			game.cardEffect(7, turn, game.getBoard()); //        assertEquals(7,game.getCurrent().getSize(2)); 
			//BUG, doesn't properly cylcle once it hits the end of the deck 
		} 

	@Test 
		public void testFeast() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			//--------------Test the cards effect 
			game.getCurrent().addCard(3,new kingdomCard(4,0,0,8,"Feast")); 

			game.cardEffect(8, turn, game.getBoard()); 

			assertEquals(1,game.getCurrent().getSize(1)); 
			//BUG, Looking in the wrong place for the feast to become trashed 
			//        assertEquals(0,game.getCurrent().getSize(3)); 
		}

	@Test 
		public void testBaron() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 
			int tempNum = game.getCurrent().getSize(2); 
			//Empty the Hand 
			for (int i = 0; i < tempNum; i ++) 
			{ 
				Card temp = game.getCurrent().getCard(2,0); 
				//System.out.println(temp.getName()); 
				//if(temp.getName() == "Estate") 
				game.getCurrent().addCard(2,0, 0); 
			} 

			//game.getCurrent().addCard(3,new kingdomCard(4,0,0,8,"Feast")); 
			game.cardEffect(9, turn, game.getBoard()); 

			assertEquals(2,turn.getBuys()); 
			assertEquals(1,game.getCurrent().getSize(1)); 


			game.getCurrent().addCard(2,new victoryCard(2,1,"Estate")); 

			int temp = 0; 

			do //Keep running until trash option is picked 
			{ 
				temp = game.getCurrent().getSize(1); 
				game.cardEffect(9, turn, game.getBoard()); 
			}while(game.getCurrent().getSize(1) != temp); 

			assertEquals(0,game.getCurrent().getSize(2)); 
			assertEquals(4,turn.getTreasure()); 
		} 

	@Test 
		public void testGreatHall() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.getCurrent().addCard(3,new kingdomCard(0,0,1,10,"Great Hall")); 

			game.cardEffect(10, turn, game.getBoard()); 

			assertEquals(2,turn.getActions()); 
			assertEquals(6,game.getCurrent().getSize(2)); 


		} 

	@Test 
		public void testFestival() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(11, turn, game.getBoard()); 

			assertEquals(2,turn.getBuys()); 
			assertEquals(3,turn.getActions()); 
			assertEquals(2,turn.getTreasure()); 
		} 

	@Test 
		public void testLaboratory() 
		{ 
			playDominion game = new playDominion(2, rand); 
			turnState turn = new turnState(game.getCurrent(),game.getPlayers(),game.getBoard()); 

			game.cardEffect(12, turn, game.getBoard()); 

			assertEquals(2,turn.getActions()); 
			assertEquals(7,game.getCurrent().getSize(2)); 
		} 

}                                                                                        
