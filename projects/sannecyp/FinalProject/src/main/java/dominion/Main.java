/**
 * 
 */
package dominion;

/**
 * @author sannecyp
 *
 */

class intWrapper{
	public int int_wrapped;
}

enum CARD
{
	curse(0),
	estate(1),
	duchy(2),
	province(3),
	copper(4),
	silver(5),
	gold(6),
	adventurer(7),
	/* If no/only 1 treasure found, stop when full deck seen */
	council_room(8),
	feast(9), /* choice1 is supply # of card gained) */
	gardens(10),
	mine(11), /* choice1 is hand# of money to trash, choice2 is supply# of
	oney to put in hand */
	
	
	
		 baron(12), /* choice1: boolean for discard of estate */
	/* Discard is always of first (lowest index) estate */
	great_hall(13),
	
	
	
		 ambassador(14), /* choice1 = hand#, choice2 = number to return to supply */
	cutpurse(15),
	embargo(16), /* choice1 = supply# */
	outpost(17),
	salvager(18), /* choice1 = hand# to trash */
	sea_hag(19);
	
	
	private final int value;
	private CARD(int value){this.value=value;}
	public int get_CARD(){return value;} 
	
	
}

class Player{
	int[] hand=new int[500];
	int handcount;
	int[] deck=new int[500];
	int deckCount;
	int[] discard=new int[500];
	int discardCount;
	int MAX_HAND=500;
	int MAX_DECK=500;
	
	boolean DEBUG=true;
	
	static int[] sortArrayAsc(int[] arr, int initial,int finalvalue)
	  {

	  //   System.out.println("initial="+initial+" "+"final="+finalvalue);

	       while(initial!=finalvalue)
	       {
	           int index=findMinimum(arr,initial,finalvalue);
//	         System.out.println("index="+index);
//	         System.out.println("arr value at index="+arr[index]);
	           int temp=arr[initial];
	           arr[initial]=arr[index];
	           arr[index]=temp; 
	           initial++;
	       }

	       return arr;
	  }
	  
	  static int findMinimum(int[] arr,int initial,int finalvalue)
	  {
	      int index = initial;
	      int minimum=initial;
	      while(index!=finalvalue-1)
	      {
	          if(arr[index+1]<arr[minimum])
	          {
	              minimum=index+1;
	          }
	          index++;
	      }

	      return minimum;
	  }
	
	int shuffle() {
		 
		  int[] newDeck=new int[MAX_DECK];
		  int newDeckPos = 0;
		  int card;
		  int i;
		  
		  if (deckCount< 1)
		    return -1;
		  
		  deck=sortArrayAsc(deck,0,deckCount);
		  		  
		  /* SORT CARDS IN DECK TO ENSURE DETERMINISM! */

		  while (deckCount > 0) {
			card = (int)java.lang.Math.floor(Math.random() * deckCount);
		    newDeck[newDeckPos] = deck[card];
		    newDeckPos++;
		    for (i = card; i < deckCount-1; i++) {
		      deck[i] = deck[i+1];
		    }
		    deckCount--;
		  }
		  for (i = 0; i < newDeckPos; i++) {
		    deck[i] = newDeck[i];
		    deckCount++;
		  }

		  return 0;
		}
	
	int fullDeckCount(int card) {
		  int i;
		  int count = 0;

		  for (i = 0; i < deckCount; i++)
		    {
		      if (deck[i] == card) count++;
		    }

		  for (i = 0; i < handcount; i++)
		    {
		      if (hand[i] == card) count++;
		    }

		  for (i = 0; i < discardCount; i++)
		    {
		      if (discard[i] == card) count++;
		    }

		  return count;
		}
	
	int scoreFor () {

		  int i;
		  int score = 0;
		  //score from hand
		  for (i = 0; i < handcount; i++)
		    {
		      if (hand[i] == CARD.curse.get_CARD()) { score = score - 1; };
		      if (hand[i] == CARD.estate.get_CARD()) { score = score + 1; };
		      if (hand[i] == CARD.duchy.get_CARD()) { score = score + 3; };
		      if (hand[i] == CARD.province.get_CARD()) { score = score + 6; };
		      if (hand[i] == CARD.great_hall.get_CARD()) { score = score + 1; };
		      
		    }

		  //score from discard
		  for (i = 0; i < discardCount; i++)
		    {
		      if (discard[i] == CARD.curse.get_CARD()) { score = score - 1; };
		      if (discard[i] == CARD.estate.get_CARD()) { score = score + 1; };
		      if (discard[i] == CARD.duchy.get_CARD()) { score = score + 3; };
		      if (discard[i] == CARD.province.get_CARD()) { score = score + 6; };
		      if (discard[i] == CARD.great_hall.get_CARD()) { score = score + 1; };
		      
		    }

		  //score from deck
		  for (i = 0; i < discardCount; i++)
		    {
		      if (deck[i] == CARD.curse.get_CARD()) { score = score - 1; };
		      if (deck[i] == CARD.estate.get_CARD()) { score = score + 1; };
		      if (deck[i] == CARD.duchy.get_CARD()) { score = score + 3; };
		      if (deck[i] == CARD.province.get_CARD()) { score = score + 6; };
		      if (deck[i] == CARD.great_hall.get_CARD()) { score = score + 1; };
		      
		    }

		  return score;
		}
	
	int drawCard()
	{	
	  int count;
	  int deckCounter;
	  if (deckCount <= 0){//Deck is empty
	    
	    //Step 1 Shuffle the discard pile back into a deck
	    int i;
	    //Move discard to deck
	    for (i = 0; i < discardCount;i++){
	      deck[i] = discard[i];
	      discard[i] = -1;
	    }

	    deckCount = discardCount;
	    discardCount = 0;//Reset discard

	    //Shufffle the deck
	    shuffle();//Shuffle the deck up and make it so that we can draw
	   
	    
	    
	    discardCount = 0;

	    //Step 2 Draw Card
	    count = handcount;//Get current player's hand count
	    
	    
	    
	    deckCounter = deckCount;//Create a holder for the deck count

	    if (deckCounter == 0)
	      return -1;

	    hand[count] = deck[deckCounter - 1];//Add card to hand
	    deckCount--;
	    handcount++;//Increment hand count
	  }

	  else{
	    count = handcount;//Get current hand count for player
	    
	   

	    deckCounter = deckCount;//Create holder for the deck count
	    hand[count] = deck[deckCounter - 1];//Add card to the hand
	    deckCount--;
	    handcount++;//Increment hand count
	  }

	  return 0;
	}
	
	
}

class gameState {
	  int numPlayers; //number of players
	  int[] supplyCount=new int[27];  //this is the amount of a specific type of card given a specific number.
	  int[] embargoTokens=new int[27];
	  int outpostPlayed;
	  int outpostTurn;
	  int whoseTurn;
	  int phase;
	  int numActions; /* Starts at 1 each turn */
	  int coins; /* Use as you see fit! */
	  int numBuys; /* Starts at 1 each turn */
	
	  int[] playedCards=new int[500];
	  int playedCardCount;
	  int MAX_PLAYERS=4;
	  
	  int MAX_HAND=500;
	  int MAX_DECK=500;
		
	  boolean DEBUG=true;
	  
	  public Player[] players=new Player[4];
	 
	
	  
	  
	int initializeGame(int numPlayers, int[] kingdomCards, int randomSeed) {
	
		for (int init=0;init<4;init++)
			players[init]=new Player();

	  int i;
	  int j;
	  int it;			
	  //set up random number generator
	  
	 	  
	  //check number of players
	  if (numPlayers > MAX_PLAYERS || numPlayers < 2)
	    {
		  return -1;
	    }

	  //set number of players
	  this.numPlayers = numPlayers;

	  //check selected kingdom cards are different
	  for (i = 0; i < kingdomCards.length; i++)
	    {
	      for (j = 0; j < kingdomCards.length; j++)
	        {
		  if (j != i && kingdomCards[j] == kingdomCards[i])
		    {
			  return -1;
		    }
	        }
	    }


	  //initialize supply
	  ///////////////////////////////

	  //set number of Curse cards
	  if (numPlayers == 2)
	    {
	      this.supplyCount[CARD.curse.get_CARD()] = 10;
	    }
	 

	  //set number of Victory cards
	  if (numPlayers == 2)
	    {
		  this.supplyCount[CARD.estate.get_CARD()] = 8;
	      this.supplyCount[CARD.duchy.get_CARD()] = 8;
	      this.supplyCount[CARD.province.get_CARD()] = 8;
	    }
	  else
	    {
	      this.supplyCount[CARD.estate.get_CARD()] = 12;
	      this.supplyCount[CARD.duchy.get_CARD()] = 12;
	      this.supplyCount[CARD.province.get_CARD()] = 12;
	    }

	  //set number of Treasure cards
	  this.supplyCount[CARD.copper.get_CARD()] = 60 - (7 * numPlayers);
	  this.supplyCount[CARD.silver.get_CARD()] = 40;
	  this.supplyCount[CARD.gold.get_CARD()] = 30;

	  //set number of Kingdom cards
	  for (i = CARD.adventurer.get_CARD(); i <= 19; i++)       	//loop all cards
	    {
	      for (j = 0; j < kingdomCards.length; j++)           		//loop chosen cards
		{
		  if (kingdomCards[j] == i)
		    {
		      //check if card is a 'Victory' Kingdom card
		      if (kingdomCards[j] == CARD.great_hall.get_CARD() || kingdomCards[j] == CARD.gardens.get_CARD())
			{
			  if (numPlayers == 2){ 
			    this.supplyCount[i] = 8; 
			  }
			  else{ this.supplyCount[i] = 12; }
			}
		      else
			{
			  this.supplyCount[i] = 10;
			}
		      break;
		    }
		  else    //card is not in the set choosen for the game
		    {
		      this.supplyCount[i] = -1;
		    }
		}

	    }

	  ////////////////////////
	  //supply intilization complete

	  //set player decks
	  for (i = 0; i < numPlayers; i=i+1)
	    {
	      players[i].deckCount = 0;
	      for (j = 0; j < 3; j++)
		{
	      players[i].deckCount++;
		}
	      for (j = 3; j < 10; j++)
		{
		  players[i].deck[j] = CARD.copper.get_CARD();
		  players[i].deckCount++;		
		}
	    }

	  //shuffle player decks
	  for (i = 0; i < numPlayers; i++)
	    {
			players[i].shuffle();
	      
	    }

	  

	  //initialize first player's turn
	  this.outpostPlayed = 0;
	  this.phase = 0;
	  this.numActions = 1;
	  this.numBuys = 1;
	  this.playedCardCount = 0;
	  this.whoseTurn = 0;
	  players[this.whoseTurn].handcount = 0;
	  //int it; move to top

	  //Moved draw cards to here, only drawing at the start of a turn
	  for (it = 0; it < 5; it++){
	    players[this.whoseTurn].drawCard();
	  }
	  intWrapper newbonus=new intWrapper();
	  newbonus.int_wrapped=0;
	  updateCoins(this.whoseTurn, newbonus);

	  //return 0;
	  
	  return 0;
	}
	

	int playCard(int handPos, int choice1, int choice2, int choice3) 
	{	
	  int card;
	  intWrapper coin_bonus = new intWrapper(); 		//tracks coins gain from actions
	  coin_bonus.int_wrapped=0;
	  
	  
		
	  //get card played
	  card = handCard(handPos);
		
	 
		
	  //play card
	  if ( cardEffect(card, choice1, choice2, choice3,  handPos, coin_bonus) < 0 )
	    {
	      return -1;
	    }
		
	  //reduce number of actions
	  this.numActions--;

	  //update coins (Treasure cards may be added with card draws)
	  updateCoins(this.whoseTurn,  coin_bonus);
		
	  return 0;
	}
	
	int buyCard(int supplyPos) {
	  int who;
	  
	
	  
	
	  who = this.whoseTurn;
	
	  if (this.numBuys < 1){
	    
	    return -1;
	  } else if (supplyCount(supplyPos) <1){
	   
	    return -1;
	  } else if (this.coins < getCost(supplyPos)){
	    
	    return -1;
	  } else {
	    this.phase=1;
	    //this.supplyCount[supplyPos]--;
	    gainCard(supplyPos, 0, who); 
	
	    this.coins = (this.coins) - (this.getCost(supplyPos));
	    this.numBuys--;
	    
	  }
		    
	  return 0;
	}


	int numHandCards() {
	  return players[ whoseTurn() ].handcount;
	}

	int handCard(int handPos) {
	  int currentPlayer = whoseTurn();
	  return players[currentPlayer].hand[handPos];
	}

	int supplyCount(int card) {
	  return this.supplyCount[card];
	}
	
	
	
	
	int whoseTurn() {
	  return this.whoseTurn;
	}
	
	int endTurn() {
	  int k;
	  int i;
	  int currentPlayer = whoseTurn();
	  
	  //Discard hand
	  for (i = 0; i < players[currentPlayer].handcount; i++){
	    players[currentPlayer].discard[players[currentPlayer].discardCount++] = players[currentPlayer].hand[i];//Discard
	    players[currentPlayer].hand[i] = -1;//Set card to -1
	  }
	  players[currentPlayer].handcount = 0;//Reset hand count
	    
	  //Code for determining the player
	  if (currentPlayer < (this.numPlayers - 1)){ 
	    this.whoseTurn = currentPlayer + 1;//Still safe to increment
	  }
	  else{
	    this.whoseTurn = 0;//Max player has been reached, loop back around to player 1
	  }

	  this.outpostPlayed = 0;
	  this.phase = 0;
	  this.numActions = 1;
	  this.coins = 0;
	  this.numBuys = 1;
	  this.playedCardCount = 0;
	  players[this.whoseTurn].handcount = 0;

	  //int k; move to top
	  //Next player draws hand
	  for (k = 0; k < 5; k++){
	    players[this.whoseTurn].drawCard();//Draw a card
	  }

	  //Update money
	  intWrapper newbonus=new intWrapper();
	  newbonus.int_wrapped=0;
	  updateCoins(this.whoseTurn, newbonus);

	  return 0;
	}
	
	int isGameOver() {
	  int i;
	  int j;
		
	  //if stack of Province cards is empty, the game ends
	  if (this.supplyCount[CARD.province.get_CARD()] == 0)
	    {
	      return 1;
	    }

	  //if three supply pile are at 0, the game ends
	  j = 0;
	  for (i = 0; i < 18; i++)
	    {
		  if (this.supplyCount[i] == 0)
		{
		  j++;
		}
	    }
	  if ( j >= 3)
	    {
	      return 1;
	    }

	  return 0;
	}
	
	
	
	
	
	
	int getCost(int cardNumber)
	{
	  if (cardNumber == CARD.curse.get_CARD()) {
		return 0;
	} else if (cardNumber == CARD.estate.get_CARD()) {
		return 2;
	} else if (cardNumber == CARD.duchy.get_CARD()) {
		return 5;
	} else if (cardNumber == CARD.province.get_CARD()) {
		return 8;
	} else if (cardNumber == CARD.copper.get_CARD()) {
		return 0;
	} else if (cardNumber == CARD.silver.get_CARD()) {
		return 3;
	} else if (cardNumber == CARD.gold.get_CARD()) {
		return 6;
	} else if (cardNumber == CARD.adventurer.get_CARD()) {
		return 6;
	} else if (cardNumber == CARD.council_room.get_CARD()) {
		return 5;
	} else if (cardNumber == CARD.feast.get_CARD()) {
		return 4;
	} else if (cardNumber == CARD.gardens.get_CARD()) {
		return 4;
	} else if (cardNumber == CARD.mine.get_CARD()) {
		return 5;
	} else if (cardNumber == CARD.baron.get_CARD()) {
		return 4;
	} else if (cardNumber == CARD.great_hall.get_CARD()) {
		return 3;
	} else if (cardNumber == CARD.ambassador.get_CARD()) {
		return 3;
	} else if (cardNumber == CARD.cutpurse.get_CARD()) {
		return 4;
	} else if (cardNumber == CARD.embargo.get_CARD()) {
		return 2;
	} else if (cardNumber == CARD.outpost.get_CARD()) {
		return 5;
	} else if (cardNumber == CARD.salvager.get_CARD()) {
		return 4;
	} else if (cardNumber == CARD.sea_hag.get_CARD()) {
		return 4;
	}
		return -1;
	}
	
	
	int cardEffect(int card, int choice1, int choice2, int choice3, int handPos, intWrapper bonus)
	{
	  int i;
	  int j;
	  int k;
	  int x;
	  
	  int currentPlayer = whoseTurn();
	  

	  
	  int[] temphand=new int[MAX_HAND];// moved above the if statement
	  int drawntreasure=0;
	  int cardDrawn;
	  int z = 0;// this is the counter for the temp hand
	  //if (nextPlayer > (this.numPlayers - 1)){
	  //  nextPlayer = 0;
	  //}
	  
		
	  if (card == CARD.adventurer.get_CARD()) {
		while(drawntreasure<2){
		if (players[currentPlayer].deckCount <1){//if the deck is empty we need to shuffle discard and add to deck
		  for(int r=0;r<players[currentPlayer].discardCount;r++)
		  {
			  players[currentPlayer].deck[r]=players[currentPlayer].discardCount;
		  }
		  int test=4;
		  System.out.printf("%d\n",players[currentPlayer].discardCount);
		  players[currentPlayer].deckCount=players[currentPlayer].discardCount;
		  players[currentPlayer].shuffle();
		  //System.out.printf("%d",players[currentPlayer].deckCount);
		}
		players[currentPlayer].drawCard();
		cardDrawn = players[currentPlayer].hand[players[currentPlayer].handcount-1];//top card of hand is most recently drawn card.
		if (cardDrawn == CARD.copper.get_CARD() || cardDrawn == CARD.silver.get_CARD() || cardDrawn == CARD.gold.get_CARD())
		  drawntreasure++;
		else{
		  temphand[z]=cardDrawn;
		  players[currentPlayer].handcount--; //this should just remove the top card (the most recently drawn one).
		  z++;
		}
	      }
		while(z-1>=0){
		players[currentPlayer].discard[players[currentPlayer].discardCount++]=temphand[z-1]; // discard all cards in play that have been drawn
		z=z-1;
	      }
		return 0;
	} else if (card == CARD.council_room.get_CARD()) {
		//+4 Cards
	      for (i = 0; i < 4; i++)
		{
		  players[currentPlayer].drawCard();
		}
		//+1 Buy
	      this.numBuys++;
		//Each other player draws a card
	      for (i = 0; i < this.numPlayers; i++)
		{
		  if ( i != currentPlayer )
		    {
		      players[i].drawCard();
		    }
		}
		//put played card in played card pile
	      discardCard(handPos, currentPlayer, 0);
		return 0;
	} else if (card == CARD.feast.get_CARD()) {
		
	      intWrapper newbonus=new intWrapper();
	      newbonus.int_wrapped=5;
	      updateCoins(currentPlayer, newbonus);
		  gainCard(choice1, 0, currentPlayer);//Gain the card
	
		
		return 0;
	} else if (card == CARD.gardens.get_CARD()) {
		return -1;
	} else if (card == CARD.mine.get_CARD()) {
		j = players[currentPlayer].hand[choice1];  //store card we will trash
		if (players[currentPlayer].hand[choice1] < CARD.copper.get_CARD() || players[currentPlayer].hand[choice1] > CARD.gold.get_CARD())
		{
		  return -1;
		}
		
		gainCard(choice2, 2, currentPlayer);
		//discard card from hand
	      discardCard(handPos, currentPlayer, 0);
		
		return 0;
	} else if (card == CARD.baron.get_CARD()) {
		this.numBuys++;//Increase buys by 1!
		if (choice1 > 0){//Boolean true or going to discard an estate
		int p = 0;//Iterator for hand!
		int card_not_discarded = 1;//Flag for discard set!
		while(p<players[currentPlayer].handcount)
		{
		  if (players[currentPlayer].hand[p] == CARD.estate.get_CARD()){//Found an estate card!
		    this.coins += 4;//Add 4 coins to the amount of coins
			card_not_discarded = 0;
		  }
	      p++;//Next card
		  	
	    }
				    
	      
		if ((supplyCount(CARD.estate.get_CARD()) > 0)&&(card_not_discarded==1)){
		  gainCard(CARD.estate.get_CARD(), 0, currentPlayer);//Gain an estate
		  this.supplyCount[CARD.estate.get_CARD()]--;//Decrement Estates
		}
	      }
		return 0;
	} else if (card == CARD.great_hall.get_CARD()) {
		//+1 Card
		players[currentPlayer].drawCard();
		//+1 Actions
	      this.numActions++;
		//discard card from hand
	      discardCard(handPos, currentPlayer, 0);
		return 0;
	} else if (card == CARD.ambassador.get_CARD()) {
			
		//increase supply count for choosen card by amount being discarded
	      this.supplyCount[players[currentPlayer].hand[choice1]] += choice2;
		//each other player gains a copy of revealed card
	      for (i = 0; i < this.numPlayers; i++)
		{
		  if (i != currentPlayer)
		    {
		      gainCard(players[currentPlayer].hand[choice1], 0, i);
		    }
		}
		//discard played card from hand
	      discardCard(handPos, currentPlayer, 0);
		//trash copies of cards returned to supply
	      for (j = 0; j < choice2; j++)
		{
		  for (i = 0; i < players[currentPlayer].handcount; i++)
		    {
		      if (players[currentPlayer].hand[i] == players[currentPlayer].hand[choice1])
			{
			  discardCard(i, currentPlayer, 1);
			  break;
			}
		    }
		}
		return 0;
	} else if (card == CARD.cutpurse.get_CARD()) {
		intWrapper newbonus=new intWrapper();
		newbonus.int_wrapped=2;
		updateCoins(currentPlayer, newbonus);
		for (i = 0; i < this.numPlayers; i++)
		{
		  if (i != currentPlayer)
		    {
		      for (j = 0; j < players[i].handcount; j++)
			{
			  if (players[i].hand[j] == CARD.copper.get_CARD())
			    {
			      discardCard(j, i, 0);
			      break;
			    }
			  						
		    }
			}
					
		}
		//discard played card from hand
	      discardCard(handPos, currentPlayer, 0);
		return 0;
	} else if (card == CARD.embargo.get_CARD()) {
		//+2 Coins
	      this.coins = this.coins + 2;
		//see if selected pile is in play
	      if ( this.supplyCount[choice1] == -1 )
		{
		  return -1;
		}
		//add embargo token to selected supply pile
	      this.embargoTokens[choice1]++;
		//trash card
	      discardCard(handPos, currentPlayer, 1);
		return 0;
	} else if (card == CARD.outpost.get_CARD()) {
		//set outpost flag
	      this.outpostPlayed++;
		//discard card
	      discardCard(handPos, currentPlayer, 0);
		return 0;
	} else if (card == CARD.salvager.get_CARD()) {
		//+1 buy
	      this.numBuys++;
		if (choice1==1)
		{
		  //gain coins equal to trashed card
		  this.coins = this.coins + getCost( handCard(choice1) );
		  //trash card
		  discardCard(choice1, currentPlayer, 1);	
		}
		//discard card
	      discardCard(handPos, currentPlayer, 0);
		return 0;
	} else if (card == CARD.sea_hag.get_CARD()) {
		for (i = 0; i < this.numPlayers; i++){
		if (i != currentPlayer){
			players[i].discard[players[i].discardCount] = players[i].deck[players[i].deckCount--];			    
			players[i].deckCount--;
			players[i].discardCount++;
		  players[i].deck[players[i].deckCount--] = CARD.curse.get_CARD();//Top card now a curse
		}
	      }
		return 0;
	} 
		
	  return -1;
	}

	int discardCard(int handPos, int currentPlayer,  int trashFlag)
	{
		
	  //if card is not trashed, added to Played pile 
	  if (trashFlag < 1)
	    {
	      //add card to played pile
	      this.playedCards[this.playedCardCount] = players[currentPlayer].hand[handPos]; 
	      this.playedCardCount++;
	    }
		
	  //set played card to -1
	  players[currentPlayer].hand[handPos] = -1;
		
	  //remove card from player's hand
	  if ( handPos == (players[currentPlayer].handcount - 1) ) 	//last card in hand array is played
	    {
	      //reduce number of cards in hand
		  players[currentPlayer].handcount--;
	    }
	  else if ( players[currentPlayer].handcount == 1 ) //only one card in hand
	    {
	      //reduce number of cards in hand
		  players[currentPlayer].handcount--;
	    }
	  else 	
	    {
	      //replace discarded card with last card in hand
		  players[currentPlayer].hand[handPos] = players[currentPlayer].hand[ (players[currentPlayer].handcount - 1)];
	      //set last card to -1
		  players[currentPlayer].hand[players[currentPlayer].handcount - 1] = -1;
	      //reduce number of cards in hand
		  players[currentPlayer].handcount--;
	    }
		
	  return 0;
	}

	int gainCard(int supplyPos,  int toFlag, int player)
	{
	  //Note: supplyPos is enum of choosen card
		
	 
	  //added card for [whoseTurn] current player:
	  // toFlag = 0 : add to discard
	  // toFlag = 1 : add to deck
	  // toFlag = 2 : add to hand

	  if (toFlag == 1)
	    {
	      players[player].deck[ players[player].deckCount] = supplyPos;
	      players[player].deckCount++;
	    }
	  else if (toFlag == 2)
	    {
		  players[player].hand[ players[player].handcount ] = supplyPos;
		  players[player].handcount++;
	    }
	  else
	    {
		  players[player].discard[ players[player].discardCount ] = supplyPos;
		  players[player].discardCount++;
	    }
		
	  //decrease number in supply pile
	  this.supplyCount[supplyPos]--;
		 
	  return 0;
	}
	
	int updateCoins(int player, intWrapper bonus)
	{
	  int i;
		
	  //reset coin count
	  this.coins = 0;

	  //add coins for each Treasure card in player's hand
	  for (i = 0; i < players[player].handcount; i++)
	    {
	      if (players[player].hand[i] == CARD.copper.get_CARD())
		{
		  this.coins += 1;
		}
	      else if (players[player].hand[i] == CARD.silver.get_CARD())
		{
		  this.coins += 2;
		}
	      else if (players[player].hand[i] == CARD.gold.get_CARD())
		{
		  this.coins += 3;
		}	
	    }	

	  //add bonus
	  this.coins += bonus.int_wrapped;

	  return 0;
	}

	//end of dominion.c
}
