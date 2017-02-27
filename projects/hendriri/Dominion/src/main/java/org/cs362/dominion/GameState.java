package org.cs362.dominion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;

/**
 * There is no description here either!
 * Gamestate keeps track of player turns and creates a table for the players (which there is two) and a table of the cards.
 * there is also play which then plays the game for some reason ends after 3 turns (I can't make this stuff up).
 */



public class GameState {

	   //gets a list that will be of players and cards.
	   public final List<Player> players = new ArrayList<Player>();
	   public final List<Card> cards;

	   public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();

	   //the embargo token for the embargo card
	   public int embargo =0;
	   
	   //if you give it a list of cards then gamestate will have that list of cards
	   public GameState(List<Card> cards) {
		   this.cards=cards;
		   
	   }
	   //just adds a player to the player list, i fuckin swear these are the worst names.
	   public void addPlayer(Player player) {
		      players.add(player);
	   }   

	   /*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/
	   
	   public void initializeGame(){		


			      //initialize supply 

			   //check number of players
		   		//this will never happen with the current implementation
			   if (players.size() > 4 || players.size() < 2)
			    {
				   System.err.println("the number of players mus be between 2 and 4 ");
			      return ;
			    }
			 //initialize supply for only two players
		           int selectedKindom=0;
				   int Kingdom_Cards_Selected=13;// We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
				   								// we should change 3 to the  exact of the number of 
				   								//kingdom cards. look at the requirements of the assignment-1
		      	//add the kingdom cards into the hashmap
		   		while (selectedKindom < Kingdom_Cards_Selected) {
			         int random = (int)  Randomness.random.nextInt(cards.size());//
			         Card tmp = cards.get(random);
			         if(tmp.getType()!=Card.Type.ACTION) continue;
			         if(gameBoard.containsKey(tmp)) continue;
			         gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
		      

		      //this is not the correct amount of victory cards but it is what the prof wrote so whatever
		      //set number of Victory cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
		    //set number of Treasure cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Cooper), 46);
		   
		      //draws 3 estate cards and 7 cooper cards, why cooper you ask? I'm not sure.
		      for (Player player : players) {
			         for (int i = 0; i < 7; i++)
			            player.gain(Card.getCard(cards, Card.CardName.Cooper));
			         for (int i = 0; i < 3; i++)
			            player.gain(Card.getCard(cards,Card.CardName.Estate));

			         //sets intial value of these.
			         player.numActions = 1;
			         player.coins = 0;
			         player.numBuys = 1;
				      //Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
				      //5 cards as your starting hand
				      for (int i = 0; i < 5; i++) {
				    	  player.drawCard();
				      }
			      }
	   }
	   
	   public HashMap<Player, Integer>  play() {
			 
		   	  int turn =0;	
		      while (!isGameOver()) {
		    	  turn++;
		         for (Player player : players) {
					 System.out.println("HANDO: \n" + player.hand);
					    //System.out.println(gameBoard + "\n\n\n HERERERERERERE___________________\n\n\n\n\n");
		        	 	System.out.println("Player: "+ player.player_username + " is playing");
					 	//System.out.println("Player's coins before entering playtreasure: "+ player.coins);
					 	System.out.println("Player STATS\n" + "NUMACTIONS: " + player.numActions +"\n" + "NUM COINS: " + player.coins +"\n" + "NUM BUYS: " + player.numBuys +"\n");

					 	//player x plays action card
		        	 	player.playKingdomCard();
		        	 	//player x plays treasure card
					 	System.out.println("Player's coins before entering playtreasure: "+ player.coins);
		   			    player.playTtreasureCard();
		   			    //player x buy cards
		        	    player.buyCard();
		        	  //player ends turn
		        	    player.endTurn();
		         }
		         //the game is only 3 turns long i fuckin guess.
		         //if(turn==10)
		        //	 break;
		      }
		      System.out.println("TURNS: " + turn);
		      return this.getWinners();
		   }
	   public boolean isGameOver() {
		 //if stack of Province cards is empty, the game ends
		   if((gameBoard.get(Card.getCard(cards, Card.CardName.Province))==null)||(gameBoard.get(Card.getCard(cards, Card.CardName.Province))== 0)) {
			   System.out.println("GAME ENDS DUE TO LACK OF PROVENCE CARDS\n");
			   return true;
		   }
		 //if three supply pile are at 0, the game ends
		      int emptySupplyPile = 0;
		      for (int i : gameBoard.values()){
		         if (i == 0)
		        	 emptySupplyPile++;
		         if ( emptySupplyPile >= 3)
		         {
		           return true;
		         }
		      }
		         return false;
		   }
	   
	   /* Set HashMap  of each player and the score (remember ties!) */
	   public HashMap<Player, Integer>  getWinners() {
		   HashMap<Player, Integer> playerScore = new HashMap<Player, Integer>();

		    //get score for each player
		      for (Player p : players) {
		         int score = p.scoreFor();
		         playerScore.put(p, score);
		      }

		      return playerScore;
		   }
	   
}
