//Hashmap<Card,Integer> Dominionboardmap

//After each turn check if gameover
    //if province card pile is empty
    //or if any 3 supply piles are empty

    //if tie, player with less turns wins
    //if same number of turns, shared victory

package com.omalleya.app;

import java.util.List;

import com.omalleya.app.Card.CardName;
import com.omalleya.app.Card.Type;




import java.util.ArrayList;
import java.util.*;



public class GameState {
    public final List<Player> players = new ArrayList<Player>();
    public final List<Card> cards;
    public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();

    public GameState(List<Card> cards){
        this.cards = cards;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void initializeGame(){
        //check number of players    
        if (players.size() > 4 || players.size() < 2) {
            System.err.println("the number of players must be between 2 and 4");
            return;
        }else if(players.size() == 4) {
            //12 each of estate duchy and provinces
            gameBoard.put(Card.getCard(cards, CardName.Estate), 12);
            gameBoard.put(Card.getCard(cards, CardName.Duchy), 12);
            gameBoard.put(Card.getCard(cards, CardName.Province), 12);
            //30 curse cards
            gameBoard.put(Card.getCard(cards, CardName.Curse), 30);
        }else if(players.size() == 3) {
            //12 each of estate duchy and provinces
            gameBoard.put(Card.getCard(cards, CardName.Estate), 12);
            gameBoard.put(Card.getCard(cards, CardName.Duchy), 12);
            gameBoard.put(Card.getCard(cards, CardName.Province), 12);
            //20 curse cards
            gameBoard.put(Card.getCard(cards, CardName.Curse), 20);
        }else if(players.size() == 2) {
            //8 each of estate duchy and provinces
            gameBoard.put(Card.getCard(cards, CardName.Estate), 8);
            gameBoard.put(Card.getCard(cards, CardName.Duchy), 8);
            gameBoard.put(Card.getCard(cards, CardName.Province), 8);
            //10 curse cards
            gameBoard.put(Card.getCard(cards, CardName.Curse), 10);
        }

        //Put Treasure Cards on table
        gameBoard.put(Card.getCard(cards, CardName.Gold), 30);
        gameBoard.put(Card.getCard(cards, CardName.Silver), 40);
        gameBoard.put(Card.getCard(cards, CardName.Copper), 46);

        //All treasure cards
        //10 sets of 10 kingdom cards
            //if the kindom card is a victory card as well follow rules for estate, etc.
        int kingdomCount = 0;
        int kingdomSets = 3;
        while(kingdomCount < kingdomSets) {
            for(Card c : cards) {
                if(c.getType() != Type.ACTION || gameBoard.containsKey(c)) {
                    continue;
                }else {
                    gameBoard.put(Card.getCard(cards, c.getCardName()), 10);
                    kingdomCount++;
                }
            }
        }

        for(Player p : players) {
            for(int i=7; i>0; i--)
                p.gain(Card.getCard(cards, CardName.Copper));
            
            for(int i=3; i>0; i--)
                p.gain(Card.getCard(cards, CardName.Estate));
        }
    }

    public void play() {
        while(!endGame()) {
            for(Player p : players) {
                p.action();
                p.buy(this);
                p.cleanUp();
            }
        }
    }

    public Boolean endGame() {
        return false;
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
}