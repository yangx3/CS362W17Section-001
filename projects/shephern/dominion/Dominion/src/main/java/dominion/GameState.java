package dominion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;

import dominion.Card.CardName;




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

public class GameState implements Cloneable {
	public List<Player> players = new ArrayList<Player>(); ;
	public List<Card> cards ;
	public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	public HashMap<Card, Integer> tokensPlaced = new HashMap<Card, Integer>();

	public GameState(List<Card> cards) {
		this.cards=cards;
	}
	public void addPlayer(Player player) {
		players.add(player);
	}   

	/*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/
	
	//Cheater function to help evosuite
	public void initializeGame(){
		this.initializeGame(13);
	}
	public void initializeGame(int toUseCards){		
		//initialize supply 

		//check number of players
		if (players.size() < 2 || players.size() > 4)
		{
			System.err.println("The number of players must be 2-4");
			return ;
		}
		
		//initialize supply for only two players
		int selectedKingdom=0;
		int Kingdom_Cards_Selected = toUseCards;
		List<Card> newCards = new ArrayList<Card>();
		List<Card> takeCards = new ArrayList<Card>();
		
		while (selectedKingdom < Kingdom_Cards_Selected) {
			int random = (int)  Randomness.random.nextInt(cards.size());//
			Card tmp = cards.get(random);
			//Make an exception for gardens as it is a victory kingdom card
			if(tmp.getType()!=Card.Type.ACTION && tmp.getCardName() != Card.CardName.Gardens) continue;
			if(gameBoard.containsKey(tmp)) continue;
			if(tmp.getCardName() == Card.CardName.Gardens)
				gameBoard.put(tmp, 12);
			else
				gameBoard.put(tmp, 10);
			tokensPlaced.put(tmp, 0);
			newCards.add(tmp);
			selectedKingdom++;
		}
		
		//Remove cards not used from state.cards
		for(Card c : cards){
			if(!newCards.contains(c)){
				if(c.getType() ==Card.Type.ACTION || c.getCardName() == Card.CardName.Gardens){
					//Take it out of the cards array
					takeCards.add(c);
				}
			}
		}
		cards.removeAll(takeCards);
		
		//set number of Curse cards the default number of players is 2			   
		gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
		//set number of Victory cards
		switch(players.size()){
		case 2:
			gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
			gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
			gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
			break;
		case 3:
		case 4:
			gameBoard.put(Card.getCard(cards, Card.CardName.Province), 12);
			gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 12);
			gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 12);
			break;
		}

		//set number of Treasure cards
		gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
		gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
		gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 46);

		//Set tokens on each card placed
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Curse), 0);
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Province), 0);
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Duchy), 0);		
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Estate), 0);
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Gold), 0);
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Silver), 0);
		tokensPlaced.put(Card.getCard(cards, Card.CardName.Copper), 0);

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

	public Card takeCard(Card c){
		if(gameBoard.containsKey(c)){
			int i = gameBoard.get(c) - 1;
			gameBoard.replace(c, i);
			return c;
		}
		return null;
	}
	
	public Card takeCard(Card.CardName cardName){
		Card c = Card.getCard(cards, cardName);
		if(c != null){
			int i = gameBoard.get(c) - 1;
			gameBoard.replace(c, i);
			return c;
		}
		return null;
	}
	
	public Card addCard(Card c){
		if(gameBoard.containsKey(c)){
			int i = gameBoard.get(c) + 1;
			gameBoard.replace(c, i);
			return c;
		}
		return null;
	}
	
	public HashMap<Player, Integer>  play(int turns) {

		int turn =0;
		while (!isGameOver()) {
			turn++;
			for (Player player : players) {
				System.out.print("Player: "+ player.player_username + " is playing with ");
				player.printHand();
				//player p plays action card
				player.playKingdomCard(this);
				//player plays treasure card
				player.playTreasureCard();
				//player buy cards
				player.buyCard(this, Randomness.nextRandomInt(cards.size()));				
				//player ends turn
				player.endTurn();
			}
			if(turns != 0 && turn==turns + 1)
				break;
		}
		return this.getWinners();
	}
	
	public boolean isGameOver() {
		//if stack of Province cards is empty, the game ends
		if((gameBoard.get(Card.getCard(cards, Card.CardName.Province))==null)||(gameBoard.get(Card.getCard(cards, Card.CardName.Province))== 0))
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
						+ treeMap.get(card) + "\n");
		}
		return sb.toString();
	}   

	private GameState(List<Card> cards, List<Player> players, HashMap<Card, Integer> gameBoard){
		this.cards = cards;
		this.players = players;
		this.gameBoard = gameBoard;
	}
	/* Secret bugs:
	 * Sea Hag gives curse to all players
	 * Default copper buy for 0 coins ignores tokens
	 * 
	 */
	public GameState clone() throws CloneNotSupportedException{
		//Initialize data structures for clone
		List<Player> clonePlayers = new ArrayList<Player>();
		List<Card> cloneCards = new ArrayList<Card>();
		HashMap<Card, Integer> cloneBoard = new HashMap<Card, Integer>();
		
		//Deep copy values over
		for(Player player: players)
			clonePlayers.add((Player) player.clone());
		for(Card card: cards)
			cloneCards.add((Card) card.clone());
		for(Card card: gameBoard.keySet())
			cloneBoard.put((Card) card.clone(), gameBoard.get(card));
		
		final GameState cloneState = new GameState(cloneCards, clonePlayers, cloneBoard);
		return cloneState;
	}
}
