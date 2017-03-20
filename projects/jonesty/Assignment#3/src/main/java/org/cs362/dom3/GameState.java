package dom3;

import java.util.ArrayList;

import java.util.HashMap;
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

public class GameState {
	   public final List<Player> players = new ArrayList<Player>(); ;
	   public final List<Card> cards ;
	   public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	   public int [] piles = new int[17];
	   public int my_nums[]=new int[4];
	   
	   
	   
	   public GameState(List<Card> cards, int [] piles) {
		   this.cards=cards;
		   this.piles=piles;
	   }
	   public void addPlayer(Player player) {
		      players.add(player);
	   }  
	   public HashMap<Card, Integer> getGamestate(){
		   return gameBoard;
	   }
	   public void updateTable(Card c, int dir){
		   int c_val = gameBoard.get(c);
		   gameBoard.replace(c, c_val+dir);
		   //System.out.println("Updated " +c+", Value: "+c_val+dir);
	   }

	   /*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/
	   
	   public void initializeGame(){		


			      //initialize supply 

			   //check number of players
		       //int my_nums[]=new int[4];
			   if (players.size() > 4 || players.size() < 2)
			    {
				   
				  System.err.println("the number of players mus be between 2 and 4 ");
			      return ;
			    }
			   else{
				   if(players.size()==2){
					   my_nums[0]=10; //set curse limit
					   my_nums[1]=8;
					   
					   
				   }
				   if(players.size()==3){
					   my_nums[0]=20;
					   my_nums[1]=12;
				   }
				   if(players.size()==4){
					   my_nums[0]=30;
					   my_nums[1]=12;
				   }
			   }
			 //initialize supply for only two players
				  int selectedKindom=0;
		      while (selectedKindom < 13) {
			         int random = (int)  Randomness.random.nextInt(cards.size());//
			         Card tmp = cards.get(random);
			         if(tmp.getType()!=Card.Type.ACTION) continue;
			         if(gameBoard.containsKey(tmp)) continue;
			         gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      gameBoard.put(Card.getCard(cards, Card.CardName.Curse), my_nums[0]);
		      
		      //set number of Victory cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Province), my_nums[1]);
		      
		      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), my_nums[1]);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), my_nums[1]);
		    //set number of Treasure cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 60);
		      
		      piles[0]=30;
		      piles[1]=40;
		      piles[2]=60;
		      piles[3]=8;
		      piles[4]=8;
		      piles[5]=8;
		      piles[6]=10;
		      piles[7]=10;
		      piles[8]=10;
		      piles[9]=10;
		      piles[10]=10;
		      piles[11]=10;
		      piles[12]=10;
		      piles[13]=10;
		      piles[14]=10;
		      piles[15]=10;
		      piles[16]=10;
		   

		      for (Player player : players) {
			         for (int i = 0; i < 7; i++){
			            player.gain(Card.getCard(cards, Card.CardName.Copper));
			            piles[2]= piles[2]-1;
			         }	
			         for (int i = 0; i < 3; i++){
			            player.gain(Card.getCard(cards,Card.CardName.Estate));
			         	piles[5]= piles[5]-1;
			         }
			         player.numActions = 1;
			         player.coins = 0;
			         player.numBuys = 1;
		      }
	   
		   
		   
	   }
	   
	   public HashMap<Player, Integer>  play(GameState gamestate) {
			 
		   	  //int turn =0;	
		      while (!isGameOver()) {
		    	  //turn++;
		         for (Player player : players) {
		        	 	player.initializePlayerTurn();
		        	 	//System.out.println("Player: "+ player.player_username + " is playing");
		        	    player.playKingdomCard();
		        	    player.buyCard(gamestate);
		        	    player.endTurn();
		        	 

		         }
		      }
		      

		      //System.out.println(gameBoard.values()); 
		      
		      return this.getWinners();
		   }
	   
	   public boolean isGameOver() {
		 //if stack of Province cards is empty, the game ends

		 //if three supply pile are at 0, the game ends
/*		   int emptySupplyPile = 0;
		      for (int i=0; i<piles.length; i++){
		         if (piles[i]==0)
		        	 emptySupplyPile++;
		         if (i == 3){
		        	 if(gamestate.get(Card.getCard(cards, Card.CardName.Province))==0){
		        		 System.out.println("province pile is empty");
		        		 return true;
		        	 }
		         }
		         if ( emptySupplyPile >= 3)
		         {
		           System.out.println("3 piles are empty");
		           return true;
		         }
		      }
		         return false;*/

		   int emptySupplyPile = 0; 	  
		   if(gameBoard.get(Card.getCard(cards, Card.CardName.Province))==0){
			   //System.out.println("province pile is empty teehee");
			   return true;
		   }
		   else{
			   for(Integer val: gameBoard.values()){
				   if(val==0){
					   emptySupplyPile++;
				   }
			   }
			   if(emptySupplyPile==3){
				   //System.out.println("3 piles are empty fo real shawty");
				   return true;
			   }
			   else{
				   return false;
			   }
		   }
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
			sb.append("The board game is embty you need to intialize the game!!!!");
		else {
			for (Player player : players)
				sb.append(" --- " + player.toString() + "\n");
			sb.append(" --- gameBoard --- \n");
			sb.append("Cards on the table: \n");
			sb.append("Card Name \t\t NumberCards: \n");
			Map<Card, Integer> treeMap = new TreeMap<Card, Integer>(gameBoard);
			for (Card card : treeMap.keySet())
				sb.append("\t " + card.getCardName() + "\t\t "
						+ treeMap.get(card) + "\t\t " + treeMap.values() + "\n");
		}
		return sb.toString();
	}   
	   
}
