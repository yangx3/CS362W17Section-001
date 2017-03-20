package cs362.dominion;
//package org.cs362.dominion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;




//struct gameState {
//	  int numPlayers; //number of players
//	  int supplyCount[treasure_map+1];  //this is the amount of a specific type of card given a specific number.
//	  int embargoTokens[treasure_map+1];
//	  int outpostPlayed;
//	  int outpostTurn;
//	  int whoseTurn;
//	  int phase;
//	  int numActions; /* Starts at 1 each turn */
//	  int coins; /* Use as you see fit! */
//	  int numBuys; /* Starts at 1 each turn */
//	  int hand[MAX_PLAYERS][MAX_HAND];
//	  int handCount[MAX_PLAYERS];
//	  int deck[MAX_PLAYERS][MAX_DECK];
//	  int deckCount[MAX_PLAYERS];
//	  int discard[MAX_PLAYERS][MAX_DECK];
//	  int discardCount[MAX_PLAYERS];
//	  int playedCards[MAX_DECK];
//	  int playedCardCount;
//	};

public class GameState implements Cloneable{
	   public List<Player> players = new ArrayList<Player>(); 
	   public List<Card> cards ;
	   public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	   public HashMap<Card, Integer> embargoBoard = new HashMap<Card, Integer>();
	   
	   
	   
	   
	   public GameState(List<Card> cards) {
		   this.cards=cards;
		   
	   }
	   public void addPlayer(Player player) {
		      players.add(player);
	   }   
	   public List<Player> getOtherPlayers(Player p) {
		   int i = players.size();
		   List<Player> otPlayers = new ArrayList<Player>();
		   Player o;
		   for (int j = 0; j < i; j++){
			   o = players.get(j);
			   if (o != p){
				   otPlayers.add(o);
			   }
		   }
		   return otPlayers;
	   }
	   
	   
	   /*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/
	   
	   public void initializeGame(){		


			      //initialize supply 

			   //check number of players
		   	   int numP = players.size();
			   if (numP > 4 || numP < 2) 
			    {
				   System.err.println("the number of players must be between 2 and 4 ");
			      return ;
			    }
			 //initialize supply for only two players
				  int selectedKindom=0;
				   int Kingdom_Cards_Selected=10;// We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
				   								// we should change 3 to the  exact of the number of 
				   								//kingdom cards. look at the requirements of the assignment-1
		      while (selectedKindom < Kingdom_Cards_Selected) {
			         int random = (int)  Randomness.random.nextInt(cards.size());//
			         Card tmp = cards.get(random);
			         if(tmp.getType()!=Card.Type.ACTION && tmp.getType()!=Card.Type.ACTION_ATTACK && tmp.getType()!=Card.Type.ACTION_VICTORY && tmp.getCardName().toString() != "Gardens" ) continue;
			         if(gameBoard.containsKey(tmp)) continue;
			         if (tmp.getCardName().toString() == "Gardens" && numP == 2) {
			        	 gameBoard.put(tmp, 8);
			         } else if (tmp.getCardName().toString() == "Gardens") {
			        	 gameBoard.put(tmp,  12);
			         } else {
			        	 gameBoard.put(tmp, 10);
			         }
			         embargoBoard.put(tmp, 0);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
		      
		      //set number of Victory cards
		      if (numP == 2) {
		      gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 14);
		      }
		      else if (numP == 4) {
			      gameBoard.put(Card.getCard(cards, Card.CardName.Province), 12);
			      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 12);
			      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 28);//Added six, since intial gaining of estates should still leave 8
		      } else if (numP == 3) {
			      gameBoard.put(Card.getCard(cards, Card.CardName.Province), 12);
			      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 12);
			      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 24);//Added six, since intial gaining of estates should still leave 8
		      }
		    //set number of Treasure cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 46);
		   
		        //set number of Curse cards the default number of players is 2			   
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Curse), 0);
		      
		      //set number of Victory cards
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Province), 0);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Duchy), 0);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Estate), 0);
		    //set number of Treasure cards
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Gold), 0);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Silver), 0);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Copper), 0);

		      for (Player player : players) {
			         for (int i = 0; i < 7; i++)
			            player.gain(Card.getCard(cards, Card.CardName.Copper));
			         for (int i = 0; i < 3; i++)
			            player.gain(Card.getCard(cards,Card.CardName.Estate));
			         
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
	   
	   public void initializeGame(char x, int q){		


		      //initialize supply 

		   //check number of players
		   if (players.size() > 4 || players.size() < 2)
		    {
			   System.err.println("the number of players mus be between 2 and 4 ");
		      return ;
		    }
		 //initialize supply for only two players
			  int selectedKindom=0;
			   int Kingdom_Cards_Selected=10;// We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
			   								// we should change 3 to the  exact of the number of 
			   								//kingdom cards. look at the requirements of the assignment-1
	      while (selectedKindom < Kingdom_Cards_Selected) {
		         int random = (int)  Randomness.random.nextInt(cards.size());//
		         Card tmp = cards.get(random);
		         if(tmp.getType()!=Card.Type.ACTION && tmp.getType()!=Card.Type.ACTION_ATTACK && tmp.getType()!=Card.Type.ACTION_VICTORY && tmp.getCardName().toString() != "Gardens" ) continue;
		         if(gameBoard.containsKey(tmp)) continue;
		         gameBoard.put(tmp, 10);
		         if (x == 'e') {
		        	 embargoBoard.put(tmp, q);
		         } else { //shouldn't trigger. Function only used to test preset embargo board
		        	 embargoBoard.put(tmp, 0);
		         }
		         selectedKindom++;
		      }
	        //set number of Curse cards the default number of players is 2			   
	      gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
	      
	      //set number of Victory cards
	      gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
	      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
	      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 14); //Added six, since intial gaining of estates should still leave 8
	    //set number of Treasure cards
	      gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
	      gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
	      gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 46);
	     
	      if (x == 'e') {
		        //set number of Curse cards the default number of players is 2			   
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Curse), q);
		      
		      //set number of Victory cards
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Province), q);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Duchy), q);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Estate), q);
		    //set number of Treasure cards
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Gold), q);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Silver), q);
		      embargoBoard.put(Card.getCard(cards, Card.CardName.Copper), q);

	      } else { //Shouldn't trigger. This function only used to test a preset embargo board
	        //set number of Curse cards the default number of players is 2			   
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Curse), 0);
	      
	      //set number of Victory cards
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Province), 0);
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Duchy), 0);
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Estate), 0);
	    //set number of Treasure cards
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Gold), 0);
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Silver), 0);
	      embargoBoard.put(Card.getCard(cards, Card.CardName.Copper), 0);
	      }
	      
	      
	      for (Player player : players) {
		         for (int i = 0; i < 7; i++)
		            player.gain(Card.getCard(cards, Card.CardName.Copper));
		         for (int i = 0; i < 3; i++)
		            player.gain(Card.getCard(cards,Card.CardName.Estate));
		         
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
	   public HashMap<Player, Integer>  playTest(int i, char x, int boost) {
			 
		   	  int turn =0;	
		      while (!isGameOver()) {
		    	  turn++;
		         for (Player player : players) {
		        	 	System.out.println("Player: "+ player.player_username + " is playing");
		        	 	player.startTurn();
		        	 	System.out.println("Turn Started");
		   				//player p plays action card
		        	 	if (boost > 0) {
		        	 		player.numActions+=boost;
		        	 	}
		        	 	player.playKingdomCard();
		        	 	System.out.println("Action Phase Finished");
		        	 	if (x == 'a' && turn == i){
		        	 		break;
		        	 	}
		        	 	//player plays treasure card
		   			    player.playTtreasureCard();
		   			    System.out.println("Treasure Playing Finished");
		   			    if (x == 't' && turn == i) {
		   			    	break;
		   			    }
		   			    //player buy cards
		        	    player.buyCard();
		        	    System.out.println("Card bought, probably");
		        	    if (x == 'b' && turn == i) {
		        	    	break;
		        	    }
		        	  //player ends turn
		        	    player.endTurn();
		        	    if (x == 'e' && turn == i){
		        	    	break;
		        	    }
		        	    if (isGameOver()) {
		        	    	System.out.println(this.toString());
		        	    	break;
		        	    }
		         }
		         if(turn==i)
		        	 break;
		      }
		      return this.getWinners();
		   }
	   
	   
	   public HashMap<Player, Integer>  playTest(int i, char x) {
			 
		   	  int turn =0;	
		      while (!isGameOver()) {
		    	  turn++;
		         for (Player player : players) {
		        	 	System.out.println("Player: "+ player.player_username + " is playing");
		        	 	player.startTurn();
		        	 	System.out.println("Turn Started");
		   				//player p plays action card
		        	 	player.playKingdomCard();
		        	 	System.out.println("Action Phase Finished");
		        	 	if (x == 'a' && turn == i){
		        	 		break;
		        	 	}
		        	 	//player plays treasure card
		   			    player.playTtreasureCard();
		   			    System.out.println("Treasure Playing Finished");
		   			    if (x == 't' && turn == i) {
		   			    	break;
		   			    }
		   			    //player buy cards
		        	    player.buyCard();
		        	    System.out.println("Card bought, probably");
		        	    if (x == 'b' && turn == i) {
		        	    	break;
		        	    }
		        	  //player ends turn
		        	    player.endTurn();
		        	    if (x == 'e' && turn == i){
		        	    	break;
		        	    }
		        	    if (isGameOver()) {
		        	    	System.out.println(this.toString());
		        	    	break;
		        	    }
		         }
		         if(turn==i)
		        	 break;
		      }
		      return this.getWinners();
		   }
	   
	   
	/*   public HashMap<Player, Integer>  play(int i) {
			 
		   	  int turn =0;	
		      while (!isGameOver()) {
		    	  turn++;
		         for (Player player : players) {
		        	 	System.out.println("Player: "+ player.player_username + " is playing");
		        	 	player.startTurn();
		        	 	System.out.println("Turn Started");
		   				//player p plays action card
		        	 	player.playKingdomCard();
		        	 	System.out.println("Action Phase Finished");
		        	 	//player plays treasure card
		   			    player.playTtreasureCard();
		   			    System.out.println("Treasure Playing Finished");
		   			    //player buy cards
		        	    player.buyCard();
		        	    System.out.println("Card bought, probably");
		        	  //player ends turn
		        	    player.endTurn();
		        	    if (isGameOver()) {
		        	    	System.out.println(this.toString());
		        	    	break;
		        	    }
		         }
		         if(turn==i)
		        	 break;
		      }
		      return this.getWinners();
		   }*/
	   public HashMap<Player, Integer>  play() {
			 
		   	  int turn =0;	
		      while (!isGameOver()) {
		    	  turn++;
		         for (Player player : players) {
		        	    System.out.println("Turn " + turn + "!");
		        	    if (turn == 21) {
		        	    	System.out.println("FOR DA BREAK!");
		        	    }
		        	 	System.out.println("Player: "+ player.player_username + " is playing");
		        	 	player.startTurn();
		        	 //	System.out.println("Turn Started");
		   				//player p plays action card
		        	 	player.playKingdomCard();
		        	// 	System.out.println("Action Phase Finished");
		        	 	//player plays treasure card
		   			    player.playTtreasureCard();
		   			  //  System.out.println("Treasure Playing Finished");
		   			    //player buy cards
		        	    player.buyCard();
		        	    //System.out.println("Card bought, probably");
		        	  //player ends turn
		        	    player.endTurn();
		        	    if (isGameOver()) {
		        	    	System.out.println(this.toString());
		        	    	break;
		        	    }
		         }
		      }
		      return this.getWinners();
		   }
	   public boolean isGameOver() {
		 //if stack of Province cards is empty, the game ends
		   if((this.gameBoard.get(Card.getCard(cards, Card.CardName.Province))==null)||(this.gameBoard.get(Card.getCard(cards, Card.CardName.Province))== 0))
			   return true;
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
	   
	   @Override
	public String toString() {
		   
		StringBuilder sb = new StringBuilder();
		if (gameBoard.isEmpty())
			sb.append("The board game is empty you need to intialize the game!!!!");
		else {
			for (Player player : players)
				sb.append(" --- " + player.toString() + "\n");
			sb.append(" --- gameBoard --- \n");
			sb.append("Cards on the table: \n");
			sb.append("Card Name \t\t NumberCards: \n");
			Map<Card, Integer> treeMap = new TreeMap<Card, Integer>(gameBoard);
			for (Card card : treeMap.keySet())
				sb.append("\t " + card.getCardName() + "\t\t "
						+ treeMap.get(card) + " Embargo: " + this.embargoBoard.get(card) + "\n");
		}
		return sb.toString();
	}   
	   private GameState(List<Card> cards, List<Player> players, HashMap<Card, Integer> gameBoard) {
		   this.cards=cards;
		   this.players=players;
		   this.gameBoard=gameBoard;
		   
	   }
	   public GameState(List<Card> cards, List<Player> players, HashMap<Card, Integer> gameBoard, HashMap<Card, Integer> embargoBoard) {
		   this.cards=cards;
		   this.players=players;
		   this.gameBoard=gameBoard;
		   this.embargoBoard=embargoBoard;
		   
	   }
	   
	   public void decrementCard (Card c) {
		   int i = gameBoard.get(c);
		   i--;
		   gameBoard.put(c, i);
	   }
	   
	   public void incrementCard (Card c) {
		   int i = gameBoard.get(c);
		   i++;
		   gameBoard.put(c, i);
	   }
	   
	   
	   public boolean isPileEmp (Card c) {
		   int i = gameBoard.get(c);
		   if (i > 0) {
			   return true;
		   } else {
			   return false;
		   }
	   }
	   
	   public boolean isPileEmp (String cn) {
		   Card c = Card.getCard(cards, cn);
		   return isPileEmp(c);
		   
	   }
	   
	   public int embargoCheck (Card c) {
		   int i = embargoBoard.get(c);
		   embargoBoard.put(c, 0);
		   return i;
	   }
	   
	   public void embargo (Card c) {
		   int i = embargoBoard.get(c);
		   embargoBoard.put(c, i+1);
	   }
	   
		public Card randomCard(int cost){
			//System.out.println("-------------------GAME STATE-----------------");
			//System.out.println(this.toString());
			int k = this.cards.size();
			int ran = Randomness.nextRandomInt(k);
			boolean hasretd = false;
			do {
				/*if (cards.get(ran).getCost() != -100) {
					System.out.println("OPTION A <-----------------");
					System.out.print(ran);
					System.out.println(cards.get(ran).toString());
					System.out.println(gameBoard.toString());
					System.out.println("----------");
					System.out.println(this.cards.toString());
				}*/
				if (gameBoard.containsKey(cards.get(ran))){
					Card tmpc = cards.get(ran);
					String s = tmpc.getCardName().toString();
					//System.out.println(gameBoard.get(Card.getCard(cards, "Curse")).toString() + " "  + gameBoard.get(Card.getCard(cards, "Copper")).toString());
					if (cards.get(ran).getCost() <= cost && (gameBoard.get(cards.get(ran)) > 0)) {
						return cards.get(ran);
					} else if ((cost < 2) && (gameBoard.get(Card.getCard(cards, "Curse")) <= 0) && (gameBoard.get((Card.getCard(cards, "Copper"))) <= 0)) { //ERRORS TODO FIX PLZIRENO
						return null;
					}
					else {
						ran = Randomness.nextRandomInt(k);
					}
				} else {
					ran = Randomness.nextRandomInt(k);
				}
			} while(hasretd == false); //Infinite Loop
			return null;
		}

	   public GameState clone() throws CloneNotSupportedException {
		   List<Player> clonePlayers = new ArrayList<Player>();
		   List<Card> cloneCards = new ArrayList<Card>();
		   HashMap<Card, Integer> cloneGmeBoard = new HashMap<Card, Integer>();	
		   
		    for (Player player : players) 
		    	clonePlayers.add((Player) player.clone());
		    for (Card card : cards) 
		    	cloneCards.add((Card) card.clone());
		    for (Card card : gameBoard.keySet())
		    	cloneGmeBoard.put((Card) card.clone(),gameBoard.get(card));

		   final GameState cloneState= new GameState(cloneCards,clonePlayers,cloneGmeBoard);
	        return  cloneState;
	    }
}
