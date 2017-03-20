package dominion;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Test1_2 {
	/*@Test
	public void top_test() {
		String[] pass_in={"2"};
		Main.main(pass_in);
	}*/
	
	
	@Test
	public void testSort()
	{
		int[] test_array={2,1,4,3};
		int[] result={1,2,4,3};
		//gameState test = null;
		assertEquals(Arrays.equals(Player.sortArrayAsc(test_array, 0,2), result),true);
		
	}
	
	@Test
	public void testFindMinimum()
	{
		int[] test_array={8,7,4,3};
		int result=Player.findMinimum(test_array,0,4);
		//gameState test = null;
		assertEquals(3, result);
		
	}
	
	@Test
	public void testInitializeGame()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		assertEquals(test.numPlayers,2);
		
		k[1]=CARD.adventurer.get_CARD();
		assertEquals(test.initializeGame(1, k, 2),-1);
		assertEquals(test.initializeGame(2, k, 2),-1);
		assertEquals(test.supplyCount[CARD.curse.get_CARD()],10);
		assertEquals(test.supplyCount[CARD.estate.get_CARD()],8);
		assertEquals(test.supplyCount[CARD.duchy.get_CARD()],8);
		assertEquals(test.supplyCount[CARD.province.get_CARD()],8);
		
		assertEquals(test.supplyCount[CARD.copper.get_CARD()],46);
		assertEquals(test.supplyCount[CARD.gardens.get_CARD()],8);
		
		test.initializeGame(2, k, 4);
		assertEquals(test.players[1].handcount,0);
		//assertEquals(test.initializeGame(2, k, 4),0);
		test.players[0].deckCount=0;
		assertEquals(-1,test.initializeGame(2, k, 4));
		
		test.initializeGame(3, k, 4);
		assertEquals(test.players[2].handcount,0);
		assertEquals(test.players[0].handcount,0);
		
		assertEquals(test.embargoTokens[0],0);
		assertEquals(test.embargoTokens[19],0);
		
		test.initializeGame(3, k, 4);
		
		
	}
	
	@Test
	public void testShuffle()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		test.players[0].deckCount=4;
		
		int[] check=new int[4];
		for(int i=0;i<4;i++)
		{
			test.players[0].deck[i]=i;
			check[i]=i;
		}
		int result=test.players[0].shuffle();
		if(Arrays.equals(test.players[0].deck, check))
		{
			test.players[0].shuffle();
			if(Arrays.equals(test.players[0].deck, check))
			{
				assertEquals(0,1);
			}
			else assertEquals(1,1);
		}
		else
			assertEquals(1,1);
		assertEquals(0,result);
		
		assertEquals(0,test.initializeGame(2, k, 4));
		
		test.players[0].deckCount=0;
		assertEquals(-1,test.players[0].shuffle());
		
		test.players[0].deckCount=4;
		test.players[0].shuffle();
		assertEquals(test.players[0].deckCount,4);
		
		
		test.players[0].deckCount=1;
		assertEquals(0,test.players[0].shuffle());
		
		
	}
	
	
	//HERE
	@Test
	public void testplayCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		
		
		test.numActions=1;
		test.players[0].hand[0]=CARD.adventurer.get_CARD()-1;
		assertEquals(test.playCard(0, 0, 0, 0),-1);
		
		int old_actions=test.numActions;
		test.players[0].hand[0]=1;
		test.numActions=1;
		test.players[0].hand[0]=CARD.adventurer.get_CARD()+1;
		assertEquals(test.playCard(0, 0, 0, 0),0);
		assertEquals(test.numActions, old_actions-1);
		
	}

	@Test
	public void testbuyCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.coins=150;
		test.numBuys=2;
		test.buyCard(3);
		assertEquals(test.coins,142);
		
		test.numBuys=0;
		assertEquals(test.buyCard(3),-1);
		
		test.numBuys=2;
		assertEquals(test.buyCard(3),0);
		assertEquals(test.numBuys,1);
		
		test.initializeGame(2, k, 4);
		test.supplyCount[0]=0;
		assertEquals(test.buyCard(0),-1);
		
		test.initializeGame(2, k, 4);
		test.coins=0;
		assertEquals(test.buyCard(1),-1);
		
	}
	
	@Test
	public void testnumHandCards()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		assertEquals(test.numHandCards(),5);
	}
	
	@Test
	public void testhandCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.whoseTurn=0;
		test.players[0].hand[3]=2;
		assertEquals(test.handCard(3),2);
		test.handCard(0);
	}
	
	@Test
	public void testsupplyCount()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
	
		test.supplyCount[0]=7;
		assertEquals(test.supplyCount(0),7);		
	}
	
	@Test
	public void testfullDeckCount()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
	
		test.players[0].deck[0]=1000;
		test.players[0].hand[0]=1000;
		//should be no cards in the discard pile, so it shouldn't even look in the discard pile
		test.players[0].discard[0]=1000;
		assertEquals(test.players[0].fullDeckCount(1000),2);
		
		test.players[0].deckCount=1;
		test.players[0].handcount=1;
		test.players[0].discardCount=1;
		
		assertEquals(test.players[0].fullDeckCount(1000),3);
		
	}
	
	@Test
	public void testwhoseTurn()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
	
		assertEquals(test.whoseTurn(),0);
	}
	
	@Test
	public void testendTurn()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.endTurn();
		assertEquals(test.whoseTurn(),1);
		
		test.initializeGame(2, k, 4);
		
		assertEquals(test.endTurn(),0);
		assertEquals(test.players[0].hand[0],-1);
		assertEquals(test.players[1].handcount,5);
		
		test.initializeGame(2, k, 4);
		assertEquals(test.endTurn(),0);
		assertEquals(test.whoseTurn,1);
		
		test.initializeGame(3, k, 4);
		test.whoseTurn=2;
		assertEquals(test.endTurn(),0);
		assertEquals(test.whoseTurn,0);
	}
	
	
	@Test
	public void testisGameOver()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.supplyCount[CARD.province.get_CARD()]=0;
		assertEquals(test.isGameOver(),1);
		test.supplyCount[CARD.province.get_CARD()]=1;
		assertEquals(test.isGameOver(),0);
		
		test.initializeGame(2, k, 4);
		
		
		test.supplyCount[0] = 0;
		test.supplyCount[1] = 0;
		test.supplyCount[17] = 0;
		  
		
		test.supplyCount[CARD.province.get_CARD()] = 1;
		assertEquals(test.isGameOver(),1);
		
	}
	
	@Test
	public void testscoreFor()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		int i;
		test.initializeGame(2, k, 4);
		
		for (i = 0; i < test.players[0].discardCount; i++)
	    {
	      test.players[0].deck[i] = 0;
	    }
		for (i = 0; i < test.players[0].discardCount; i++)
	    {
	      test.players[0].discard[i] = 0;
	    }
		for (i = 0; i < test.players[0].handcount; i++)
	    {
		   test.players[0].hand[i] = 0;
		}
		//All curses
		assertEquals(test.players[0].scoreFor(),-5);
		
		test.players[0].deckCount=1;
		test.players[0].handcount=1;
		test.players[0].discardCount=1;
		
		test.players[0].deck[0] = CARD.curse.get_CARD();
		test.players[0].hand[0] = CARD.curse.get_CARD();
		test.players[0].discard[0] = CARD.curse.get_CARD();
		assertEquals(test.players[0].scoreFor(),-3);
		
		test.players[0].deck[0] = CARD.estate.get_CARD();
		test.players[0].hand[0] = CARD.estate.get_CARD();
		test.players[0].discard[0] = CARD.estate.get_CARD();
		assertEquals(test.players[0].scoreFor(),3);
		
		test.players[0].deck[0] = CARD.duchy.get_CARD();
		test.players[0].hand[0] = CARD.duchy.get_CARD();
		test.players[0].discard[0] = CARD.duchy.get_CARD();
		assertEquals(test.players[0].scoreFor(),9);
		
		test.players[0].deck[0] = CARD.province.get_CARD();
		test.players[0].hand[0] = CARD.province.get_CARD();
		test.players[0].discard[0] = CARD.province.get_CARD();
		assertEquals(test.players[0].scoreFor(),18);
		
		test.players[0].deck[0] = CARD.great_hall.get_CARD();
		test.players[0].hand[0] = CARD.great_hall.get_CARD();
		test.players[0].discard[0] = CARD.great_hall.get_CARD();
		assertEquals(test.players[0].scoreFor(),3);
		
		test.players[0].deck[0] = CARD.gardens.get_CARD();
		test.players[0].hand[0] = CARD.gardens.get_CARD();
		test.players[0].discard[0] = CARD.gardens.get_CARD();
		assertEquals(test.players[0].scoreFor(),0);
		
	}
	
	@Test
	public void testdrawCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		
		assertEquals(test.players[0].drawCard(),0);
		int old_card=test.players[0].deck[test.players[0].deckCount];
		assertEquals(test.players[0].hand[test.players[0].handcount - 1], old_card);
		
		test.players[0].discardCount=1;
		test.players[0].deckCount=1;
		test.players[0].deck[0]=4;
		//assertEquals(test.players[0].hand[0], 4);
		
		test.players[0].discardCount=0;
		test.players[0].deckCount=0;
		assertEquals(test.players[0].drawCard(),-1);
		
		test.initializeGame(2, k, 4);
		test.players[0].handcount=2;
		test.players[0].discardCount=2;
		test.players[0].deckCount=-1;
		test.players[0].drawCard();
		assertEquals(test.players[0].handcount,3);
		assertEquals(test.players[0].discardCount,0);
		assertEquals(test.players[0].discard[0],-1);
		assertEquals(test.players[0].deckCount,1);
		
		test.initializeGame(2, k, 4);
		test.players[0].handcount=2;
		test.players[0].discardCount=2;
		test.players[0].deckCount=1;
		test.players[0].deck[0]=7;
		test.players[0].drawCard();
		assertEquals(test.players[0].deckCount,0);
		assertEquals(test.players[0].hand[2],7);
		
	}
	

	@Test
	public void testgetCost()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		
		for(int cardNumber=0;cardNumber<=19+1;cardNumber++)
		{
			
			
			if (cardNumber == CARD.curse.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 0);
			} else if (cardNumber == CARD.estate.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 2);
			} else if (cardNumber == CARD.duchy.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 5);
			} else if (cardNumber == CARD.province.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 8);
			} else if (cardNumber == CARD.copper.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 0);
			} else if (cardNumber == CARD.silver.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 3);
			} else if (cardNumber == CARD.gold.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 6);
			} else if (cardNumber == CARD.adventurer.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 6);
			} else if (cardNumber == CARD.council_room.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 5);
			} else if (cardNumber == CARD.feast.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 4);
			} else if (cardNumber == CARD.gardens.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 4);
			} else if (cardNumber == CARD.mine.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 5);
			} else if (cardNumber == CARD.baron.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 4);
			} else if (cardNumber == CARD.great_hall.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 3);
			} else if (cardNumber == CARD.ambassador.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 3);
			} else if (cardNumber == CARD.cutpurse.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 4);
			} else if (cardNumber == CARD.embargo.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 2);
			} else if (cardNumber == CARD.outpost.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 5);
			} else if (cardNumber == CARD.salvager.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 4);
			} else if (cardNumber == CARD.sea_hag.get_CARD()) {
				assertEquals(test.getCost(cardNumber), 4);
			}
			else
				assertEquals(test.getCost(cardNumber), -1);
			
			
		}
	}
	
	@Test
	public void testcardEffect_adventurer()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		
		test.initializeGame(2, k, 4);
		test.players[0].handcount=1;
		test.players[0].hand[0]=1;
		assertEquals(test.players[0].handcount,1);
		
		test.initializeGame(2, k, 4);
		test.players[0].deckCount=0;
		test.players[0].handcount=10;
		test.players[0].discardCount=4;
		for(int j=0;j<4;j++)
			test.players[0].hand[j]=CARD.gardens.get_CARD();
		assertEquals(0,test.cardEffect(CARD.adventurer.get_CARD(), -1, -1, -1, 0, i));
		assertEquals(test.players[0].handcount,12);
		
		test.initializeGame(2, k, 4);
		test.players[0].deckCount=4;
		test.players[0].handcount=10;
		test.players[0].discardCount=4;
		for(int j=0;j<4;j++)
			test.players[0].deck[j]=CARD.copper.get_CARD();
		assertEquals(0,test.cardEffect(CARD.adventurer.get_CARD(), -1, -1, -1, 0, i));
		assertEquals(test.players[0].handcount,12);
		
		test.initializeGame(2, k, 4);
		test.players[0].deckCount=3;
		test.players[0].handcount=5;
		test.players[0].discardCount=4;
		test.players[0].deck[2]=CARD.adventurer.get_CARD();
		test.players[0].deck[1]=CARD.copper.get_CARD();
		test.players[0].deck[0]=CARD.copper.get_CARD();
		test.cardEffect(CARD.adventurer.get_CARD(), -1, -1, -1, 0, i);
		assertEquals(test.players[0].handcount,7);
		assertEquals(test.players[0].discardCount,5);
		assertEquals(test.players[0].discard[4],CARD.adventurer.get_CARD());
		
	}
	
	@Test
	public void testcardEffect_council_room()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		
		
		
		int old_cards=test.players[0].handcount;
		test.cardEffect(0, -1, -1, -1, 0, i);
		//Draw card, then discard one
		assertEquals(old_cards,test.players[0].handcount);
		
		old_cards=test.players[0].handcount;
		test.numBuys=1;
		assertEquals(0,test.cardEffect(CARD.council_room.get_CARD(), -1, -1, -1, 0, i));
		//four cards drawn, 1 discarded
		assertEquals(old_cards+3, test.players[0].handcount);
		assertEquals(test.numBuys,2);
		
		test.initializeGame(3, k, 4);
		test.players[2].handcount=1;
		test.cardEffect(CARD.council_room.get_CARD(), -1, -1, -1, 0, i);
		
		assertEquals(test.players[2].handcount,2);
		
	}
	
	@Test
	public void testcardEffect_feast()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		assertEquals(0,test.cardEffect(CARD.feast.get_CARD(), 1, -1, -1, 0, i));

	}
	
	@Test
	public void testcardEffect_gardens()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		assertEquals(-1,test.cardEffect(CARD.gardens.get_CARD(), 1, -1, -1, 0, i));

	}
	
	@Test
	public void testcardEffect_mine()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		int[] choice=test.players[0].hand;
		test.cardEffect(CARD.mine.get_CARD(), 1, 1, -1, 0, i);
		
	    if (Arrays.equals(test.players[0].deck, choice))
	    {
	     //Make sure a card is discarded, so decks not equal
	     assertEquals(1,0);         
	          
	    }
		
		test.initializeGame(2, k, 4);
		test.players[0].hand[1]=CARD.copper.get_CARD()-1;
		assertEquals(-1,test.cardEffect(CARD.mine.get_CARD(), 1, 1, -1, 0, i));
		test.players[0].hand[1]=CARD.copper.get_CARD();
		assertEquals(0,test.cardEffect(CARD.mine.get_CARD(), 1, 1, -1, 0, i));
		
		
	}
	
	@Test
	public void testcardEffect_mine2()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		int[] choice=test.players[0].hand;
		test.cardEffect(CARD.mine.get_CARD(), 0, 0, -1, 0, i);
		

		
	}
	    
	@Test
	public void testcardEffect_ambassador()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    
	    test.initializeGame(2, k, 4);
	    int old_cards=test.players[1].handcount;
	    assertEquals(0,test.cardEffect(CARD.ambassador.get_CARD(), 1, 2, -1, 0, i));
	    
		
		assertEquals(old_cards+2,test.players[0].handcount);
		
		test.initializeGame(3, k, 4);
		test.players[1].handcount=3;
		test.players[2].handcount=3;
		test.cardEffect(CARD.ambassador.get_CARD(), 1, 2, -1, 0, i);
		assertEquals(test.players[1].handcount,3);
		assertEquals(test.players[2].handcount,3);
		
		
	}
	
	@Test
	public void testcardEffect_ambassador2()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    
	    test.initializeGame(2, k, 4);
	    test.players[0].handcount=6;
	    test.cardEffect(CARD.ambassador.get_CARD(), 1, 2, -1, 0, i);
	    //assertEquals(old_cards-1,test.handcount);
	}
	
	@Test
	public void testcardEffect_cutpurse()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    int old_coins=test.coins;
	    assertEquals(0,test.cardEffect(CARD.cutpurse.get_CARD(), 1, 2, -1, 0, i),0);
	    assertEquals(old_coins+2,test.coins);
		
		
		test.initializeGame(3, k, 4);
		test.players[1].handcount=2;
		test.players[2].handcount=2;
		test.players[1].hand[0]=CARD.embargo.get_CARD();
		test.players[2].hand[1]=CARD.embargo.get_CARD();
		test.players[1].hand[1]=CARD.copper.get_CARD();
		test.players[2].hand[0]=CARD.copper.get_CARD();
		
		assertEquals(0,test.cardEffect(CARD.cutpurse.get_CARD(), 1, 2, -1, 0, i));
		assertEquals(test.players[1].handcount,1);
		assertEquals(test.players[2].handcount,1);
	}
	
	@Test
	public void testcardEffect_embargo()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    int old_coins=test.coins;
		test.embargoTokens[1]=1;
	    assertEquals(0,test.cardEffect(CARD.embargo.get_CARD(), 1, 2, -1, 0, i));
	    assertEquals(old_coins+2,test.coins);
		assertEquals(test.embargoTokens[1],2);
		
		test.supplyCount[1]=-1;
		assertEquals(-1,test.cardEffect(CARD.embargo.get_CARD(), 1, 2, -1, 0, i));
		
	}
	
	@Test
	public void testcardEffect_outpost()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
	    int old_cards=test.players[0].handcount;
		test.outpostPlayed=1;
	    assertEquals(0,test.cardEffect(CARD.outpost.get_CARD(), 1, 1, -1, 0, i));
	    //one card discarded
	    assertEquals(old_cards-1,test.players[0].handcount);
		assertEquals(test.outpostPlayed,2);
	}
	
	@Test
	public void testcardEffect_salvager()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
	    int old_cards=test.players[0].handcount;
		test.numBuys=1;
	    assertEquals(0,test.cardEffect(CARD.salvager.get_CARD(), 1, 1, -1, 0, i));
	    //two cards discarded in total
	    assertEquals(old_cards-2,test.players[0].handcount);
		assertEquals(test.numBuys,2);
		
		/*test.initializeGame(2, k, 4);
		test.whoseTurn=1;
		test.cardEffect(CARD.sea_hag.get_CARD(), 1, 1, -1, 0, i);
		assertEquals(0, test.whoseTurn);*/
		
	}
	
	@Test
	public void testcardEffect_sea_hag()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
	    int old_cards_deck=test.players[0].deckCount;
	    int old_cards_discard=test.players[0].discardCount;
	    assertEquals(0,test.cardEffect(CARD.sea_hag.get_CARD(), 1, 1, -1, 0, i));
	    //current players's deck/discard shouldn't be changed
	    assertEquals(old_cards_deck,test.players[0].deckCount);
	    assertEquals(old_cards_discard,test.players[0].discardCount);
		
		test.initializeGame(3, k, 4);
		
		test.players[2].handcount=2;
		test.players[2].deckCount=2;
		test.players[2].discardCount=2;
		test.cardEffect(CARD.sea_hag.get_CARD(), 1, 1, -1, 0, i);
		assertEquals(test.players[2].handcount,2);
		assertEquals(test.players[2].deckCount,-1);
		assertEquals(test.players[2].discardCount,3);
	}
	
	@Test
	public void testcardEffect_estate()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
		test.players[0].hand[0]=CARD.estate.get_CARD();
	    int old_numBuys=test.numBuys;
	   int old_coins=test.coins;
	    test.cardEffect(CARD.baron.get_CARD(), 1, 1, -1, 0, i);
	    assertEquals(old_numBuys+1,test.numBuys);
	    assertEquals(old_coins+4,test.coins);
	    
	    
	}
	
	@Test
	public void testcardEffect_baron()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
		int old_numBuys=test.numBuys;
	   int old_coins=test.coins;
	    test.cardEffect(CARD.baron.get_CARD(), 1, 1, -1, 0, i);
	    
		 test.initializeGame(2, k, 4);
		test.players[0].handcount=2;
		test.players[0].hand[0]=CARD.baron.get_CARD();
		test.players[0].hand[1]=CARD.baron.get_CARD();
		test.supplyCount[CARD.estate.get_CARD()]=1;
		assertEquals(0,test.cardEffect(CARD.baron.get_CARD(), 1, 1, -1, 0, i));
		assertEquals(test.supplyCount[CARD.estate.get_CARD()],-1);
		
		test.supplyCount[CARD.estate.get_CARD()]=0;
		assertEquals(0,test.cardEffect(CARD.baron.get_CARD(), 1, 1, -1, 0, i));
		assertEquals(test.supplyCount[CARD.estate.get_CARD()],0);
	}
	
	@Test
	public void testcardEffect_great_hall()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		
		test.numActions=1;
		test.players[0].handcount=3;
		assertEquals(0,test.cardEffect(CARD.great_hall.get_CARD(), 0, 1, -1, 0, i));
		assertEquals(test.numActions,2);
		assertEquals(test.players[0].handcount,3);
		
	}
	
	@Test
	public void testcardEffect_baron2()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
		int old_numBuys=test.numBuys;
	   int old_coins=test.coins;
	    test.cardEffect(CARD.baron.get_CARD(), 0, 1, -1, 0, i);
	    
		
	}
	
	@Test
	public void testcardEffect_cutpurse2()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
	    test.initializeGame(2, k, 4);
		int old_numBuys=test.numBuys;
	   int old_coins=test.coins;
	   test.players[1].handcount=2;
	   test.players[1].hand[0]=CARD.copper.get_CARD();
	    test.cardEffect(CARD.cutpurse.get_CARD(), 0, 1, -1, 0, i);
	    
	}
	
	@Test
	public void testdiscardCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		int old_handcount=test.players[0].handcount;
		test.discardCard(0, 0, 0);
		assertEquals(test.players[0].handcount,old_handcount-1);
		
		test.initializeGame(2, k, 4);
		test.players[0].hand[0]=0;
		assertEquals(test.discardCard(0,0,0),0);
		assertEquals(test.playedCardCount,1);
		
		test.initializeGame(2, k, 4);
		test.players[0].hand[0]=0;
		test.players[0].handcount=4;
		assertEquals(test.discardCard(test.players[0].handcount-1,0,1),0);
		assertEquals(test.players[0].handcount,3);
		
		test.initializeGame(2, k, 4);
		test.players[0].hand[0]=0;
		test.players[0].handcount=1;
		assertEquals(test.discardCard(test.players[0].handcount,0,1),0);
		assertEquals(test.players[0].handcount,0);
		
		test.initializeGame(2, k, 4);
		test.players[0].hand[0]=0;
		test.players[0].handcount=4;
		assertEquals(test.discardCard(test.players[0].handcount,0,1),0);
		
		test.initializeGame(2, k, 4);
		test.players[0].hand[0]=0;
		test.players[0].handcount=4;
		int old_last=test.players[0].hand[3];
		assertEquals(test.discardCard(2,0,1),0);
		assertEquals(old_last, test.players[0].hand[ (2)]);
		
		
	}
	
	@Test
	public void testgainCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		int olddiscard=test.players[0].discardCount;
		test.gainCard(0, 0, 0);
		assertEquals(test.players[0].discardCount, olddiscard+1);
		
		int olddeck=test.players[0].deckCount;
		test.gainCard(0, 1, 0);
		assertEquals(test.players[0].deckCount, olddeck+1);
		
		int oldhand=test.players[0].handcount;
		test.gainCard(0, 2, 0);
		assertEquals(test.players[0].handcount, oldhand+1);
		
		assertEquals(test.gainCard(2, 2, 0),0);
		
		test.initializeGame(2, k, 4);
		
		int oldsupply=test.supplyCount[0];
		test.gainCard(0, 0, 0);
		assertEquals(test.supplyCount[0],oldsupply-1);
		

	}
	
	@Test
	public void testupdateCoins()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		int oldcoins=test.coins;
		intWrapper i=new intWrapper();
		i.int_wrapped=4;
		test.updateCoins(0,i);
		assertEquals(oldcoins,test.coins-4);
		
		test.initializeGame(3, k, 4);
		
		test.players[1].handcount=2;
		test.players[2].handcount=2;
		test.players[1].hand[0]=CARD.copper.get_CARD();
		test.players[1].hand[1]=CARD.silver.get_CARD();
		test.players[2].hand[0]=CARD.adventurer.get_CARD();
		test.players[2].hand[1]=CARD.gold.get_CARD();
		
		assertEquals(test.updateCoins(1, i),0);
		assertEquals(test.coins,7);
		
		assertEquals(test.updateCoins(2, i),0);
		assertEquals(test.coins,7);
		
	}
	
}
