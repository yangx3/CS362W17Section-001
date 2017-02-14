package dominion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.Random;


import dominion.Card.Type;

public class GameState {
	   public final List<Player> players = new ArrayList<Player>(); ;
	   public final List<Card> cards ;
	   public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	   
	   public GameState(List<Card> cards) {
		   this.cards=cards;
		   
	   }
	   public void addPlayer(Player player) {
		      players.add(player);
	   }   

	   /*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/
	   
	   public void initializeGame(){		
			      //initialize supply 

			   //check number of players
			   if (players.size() > 4 || players.size() < 2)
			    {
				   System.err.println("the number of players mus be between 2 and 4 ");
			      return ;
			    }
			 //initialize supply for only two players
				  int selectedKindom=0;
				   int Kingdom_Cards_Selected=10;
		      while (selectedKindom < Kingdom_Cards_Selected) {
			         int random = (int)  Randomness.random.nextInt(cards.size());
			         Card tmp = cards.get(random);
			         if(tmp.getType()!=Card.Type.ACTION) continue;
			         if(gameBoard.containsKey(tmp)) continue;
			         gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		      //set number of Curse cards the default number of players is 2			   
		      gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
		      //set number of Victory cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
		      //set number of Treasure cards
		      gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
		      gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 46);
		   

		      for (Player player : players) {
			         for (int i = 0; i < 7; i++)
			            player.gain(Card.getCard(cards, Card.CardName.Copper));
			         for (int i = 0; i < 3; i++)
			            player.gain(Card.getCard(cards,Card.CardName.Estate));
			      }	   
	   }
	   
	   public Card getRandCard(){
		   int found = 0, l = 0; //						 
		   while(found == 0 && l < 15){
			   l++;
				Randomness.reset(System.currentTimeMillis());	   
			   //int random = (int)  Randomness.random.nextInt(cards.size());//
			   Random r = new Random();
			   Card c = cards.get(r.nextInt(cards.size()));
			   System.out.println(c);
			   if (gameBoard.containsKey(c)){
				   if(gameBoard.get(c)>0){
					   found = 1;
					   return c;
				   }
			   }
		   }
		   return null;
	   }
	   
	   public HashMap<Player, Integer>  play() {
		   	  //int turn =0;	
		      while (!isGameOver()) {
		    	  //turn++;
		         for (Player player : players) {
		        	 	System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|Player: "+ player.player_username + " is playing|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
		        	 	player.initializePlayerTurn();
		        	 	int bought, i=0;
		        	 	this.playKingdomCard(player);
		   			    player.playTreasureCard();
		   			    if(gameBoard.get(Card.getCard(cards, Card.CardName.Province))>0){
			        	    if (player.buyCard(Card.getCard(cards, Card.CardName.Province)) == 1){
			        	    	gameBoard.put(Card.getCard(cards, Card.CardName.Province), gameBoard.get(Card.getCard(cards, Card.CardName.Province)) - 1);
			        	    }
		   			    }
		   			    while(i<5){
		   			    	bought = 0;
		   			   	  	Card cardB = getRandCard();
		   			   	  	if(cardB != null){   bought = player.buyCard(cardB);}
			        	    if (bought == 1){
			        	    	gameBoard.put(cardB, gameBoard.get(cardB) - 1);
			        	    }
			        	    i++;
		   			    }
		        	    player.endTurn();
		         }
		         //if(turn==10)
		        	// break;
		      }
		      return this.getWinners();
		   }
	   public void playKingdomCard(Player player) {
		      while (player.numActions > 0) {
		         List<Card> actionCards = Card.filter(player.hand, Type.ACTION);
		   
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("PLAY: " + c.toString());

			      player.playedCards.add(c);
			      player.numActions -= 1;
			      player.discard(c);
			      switch(c.getCardName()) {
					case Adventurer:
					      List<Card> treasureCards = Card.filter(player.deck, Type.TREASURE);
						  if (treasureCards.size() == 0){
							  return;
						  }
					      Card toDraw = treasureCards.get(0);
					      treasureCards.remove(0);
					      player.hand.add(toDraw);
						  if (treasureCards.size() == 0){
							  return;
						  }
					      System.out.println("DRAW: " + toDraw);
					      toDraw = treasureCards.get(0);
					      treasureCards.remove(0);
					      player.hand.add(toDraw);
					      System.out.println("DRAW: " + toDraw);
						return;
						
					case Ambassador:
						//Reveal a card from your hand. 
						//Return up to 2 copies of it from your hand to the Supply. 
						//Then each other player gains a copy of it.
						Card r = player.getRandHandCard();
						System.out.println("REVEAL: "+ r);
						// BUG doesn't do anything besides reveal///////////////////////////////////////////////////////////////////////////
						return;
						
					case Baron:
						player.numBuys +=1;
						// bots never choose to discard
						//You may discard an Estate card. If you do, +$4. Otherwise, gain an Estate card.
						return;
						
					case CouncilRoom:
						player.drawCard();
						player.drawCard();
						player.drawCard();
						player.numBuys+=1;
						for (Player playerCR : players){ // BUG other players hands reset to 5 at start of turn due to init
							playerCR.deck.poll();
							if(gameBoard.get(Card.getCard(cards, Card.CardName.Curse))>0){
								playerCR.drawCard();
							}	
						}
						return;
						
					case Cutpurse:
						player.coins+=2; //BUG doesnt do the next part
						//Each other player discards a Copper card (or reveals a hand with no Copper).
						return;
						
					case Embargo:
						player.coins+=2; // BUG dont want to implement this
						//Trash this card. Put an Embargo token on top of a Supply pile.
						//When a player buys a card, he gains a Curse card per Embargo token on that pile.
						return;
					
					case Feast:
						int k = 0;
						player.hand.remove(c);
						while(k==0){
							Randomness.reset(System.currentTimeMillis());	   
							Card tempp = getRandCard();
							if (tempp != null){
								if(tempp.getCost()<6 || tempp.getCost()>1){
									player.gain(tempp); // could break if everything cheap is bought
									k=1;
								}
							}
						}
						return;

					case GreatHall:
						player.score+=1;
						player.drawCard();
						player.numActions+=1;
						return;

					case Mine:
					    treasureCards = Card.filter(player.hand, Type.TREASURE);
					    if (treasureCards.size() == 0){
					    	return;
					    }
					    Card temp = treasureCards.get(0);
					    player.hand.remove(temp);
					    switch(temp.getCardName()){
					    	case Gold:
				   				return;
					    	case Silver:
					    		if (gameBoard.get(Card.getCard(cards, Card.CardName.Gold))>0){
					    			player.hand.add(Card.getCard(cards, Card.CardName.Gold));
					    			gameBoard.put(Card.getCard(cards, Card.CardName.Gold), gameBoard.get(Card.getCard(cards, Card.CardName.Gold)) - 1);
					    		}
					    		return;
					    	case Copper:
					    		if (gameBoard.get(Card.getCard(cards, Card.CardName.Silver))>0){
					    			player.hand.add(Card.getCard(cards, Card.CardName.Silver));
					    			gameBoard.put(Card.getCard(cards, Card.CardName.Silver), gameBoard.get(Card.getCard(cards, Card.CardName.Silver)) - 1);
					    		}
					    		return;
							default:
								break;				
					    }
						return;

					case Smithy:
						player.drawCard();
						player.drawCard();
						player.drawCard();
						return;
						
					case SeaHag:
						for (Player playerHag : players){
							playerHag.deck.poll();
							if(gameBoard.get(Card.getCard(cards, Card.CardName.Curse))>0){
								playerHag.deck.add(Card.getCard(cards, Card.CardName.Curse));
					        	gameBoard.put(Card.getCard(cards, Card.CardName.Curse), gameBoard.get(Card.getCard(cards, Card.CardName.Curse)) - 1);
							}	
						}
						return;
						
					case Village:
				    	  player.drawCard();
				    	  player.numActions++;
				    	  player.numActions++;
						return;
						
						
					default: return;
			      	}
		      }
		   }
	public boolean isGameOver() {
		 //if stack of Province cards is empty, the game ends
		   if((gameBoard.get(Card.getCard(cards, Card.CardName.Province))==null)||(gameBoard.get(Card.getCard(cards, Card.CardName.Province))== 0))
			   return true;
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
						+ treeMap.get(card) + "\n");
		}
		return sb.toString();
	}   
	   
}
