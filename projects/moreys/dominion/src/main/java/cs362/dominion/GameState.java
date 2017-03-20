package cs362.dominion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

import cs362.dominion.Card.CardName;

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
		int Kingdom_Cards_Selected=10;// We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
		// we should change 3 to the  exact of the number of 
		//kingdom cards. look at the requirements of the assignment-1
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

		//set number of Victory cards
		gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
		gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
		gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
		//set number of Treasure cards
		gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
		gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
		gameBoard.put(Card.getCard(cards, Card.CardName.Cooper), 46);


		for (Player player : players) {
			for (int i = 0; i < 7; i++)
				player.gain(Card.getCard(cards, Card.CardName.Cooper));
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
	public int Empty_Piles() {
		int emptySupplyPile = 0;
		for (int i : gameBoard.values()){
			if (i == 0)
				emptySupplyPile++;
		}
		return emptySupplyPile;
	}

	public HashMap<Player, Integer>  play() {

		int turn =0;	
		while (!isGameOver()) {
			if(isGameOver()) {
				break;
			}
			turn++;
			for (Player player : players) {
				System.out.println("Player: "+ player.player_username + " is playing");
				//player p plays action card
				player.playKingdomCard();
				//player plays treasure card
				player.playTtreasureCard();
				//player buy cards
				player.buyCard();
				//player ends turn
				player.endTurn();
			}
			/*if(turn==40)
				System.out.println("Turns: " + turn);
				toString();
				break;*/
		}
		return this.getWinners();
	}
	public HashMap<Player, Integer>  playRandom() {

		int turn =0;	
		while (!isGameOver()) {
			if(isGameOver()) {
				break;
			}
			turn++;
			for (Player player : players) {
				System.out.println("Player: "+ player.player_username + " is playing");
				//player p plays action card
				player.playKingdomCard();
				//player plays treasure card
				player.playTtreasureCard();
				//player buy cards
				player.buyRandCard();
				//player ends turn
				player.endTurn();
			}
			/*if(turn==40)
				System.out.println("Turns: " + turn);
				toString();
				break;*/
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
