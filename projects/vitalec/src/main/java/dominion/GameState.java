package dominion;

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

    public final ArrayList<Player> players = new ArrayList <Player> ();
    public HashMap<Card, Integer> supply = new HashMap<>();


    public GameState(List<Card> kingdomCardSet) {
        List<Card> availCards = Card.createCards();
        // Set Treasure Cards
        this.supply.put(Card.getCard(availCards, Card.CardName.COPPER), 60);
        this.supply.put(Card.getCard(availCards, Card.CardName.SILVER), 40);
        this.supply.put(Card.getCard(availCards, Card.CardName.GOLD), 30);

        // Set Victory Cards
        this.supply.put(Card.getCard(availCards, Card.CardName.ESTATE), 14);
        this.supply.put(Card.getCard(availCards, Card.CardName.DUCHY), 8);
        this.supply.put(Card.getCard(availCards, Card.CardName.PROVINCE), 8);

        // Set Curse Cards
        this.supply.put(Card.getCard(availCards, Card.CardName.CURSE), 10);

        // Set Kingdom Cards
        kingdomCardSet.forEach(card -> {
            if(card.getType() == Card.Type.VICTORY) {
                this.supply.put(card, 8);
            } else {
                this.supply.put(card, 10);
            }
        });
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }


    public HashMap <Player, Integer> play() {
        // Iterate through player turns
        int turn = 0;
        while (!isGameOver()) {
            turn++;

            // Player Turn
            for (Player player: players) {
                System.out.println(player.player_username + " is playing  [Turn " + turn + "]");
                player.initializePlayerTurn();
                System.out.println("ACTION PHASE:");
                player.playKingdomCard();

                System.out.println("BUY PHASE:");

                System.out.println("CLEAN-UP PHASE:");
                player.playTreasureCard();
                player.endTurn();
            }
            if (turn == 3) {
                break;
            }
        }
        return this.getWinners();
    }

    public boolean isGameOver() {
        return false;
    }

    /* Set HashMap  of each player and the score (remember ties!) */
    public HashMap < Player, Integer > getWinners() {
        HashMap < Player, Integer > playerScore = new HashMap < Player, Integer > ();

        //get score for each player
        for (Player p: players) {
            int score = p.scoreFor();
            playerScore.put(p, score);
        }

        return playerScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.supply.isEmpty())
            sb.append("The board game is embty you need to intialize the game!!!!");
        else {
            for (Player player: players) {
                sb.append(" --- " + player.toString() + "\n");
            }
            sb.append(" --- gameBoard --- \n");
            sb.append("Cards on the table: \n");
            sb.append("Card Name \t\t NumberCards: \n");
            Map<Card, Integer> treeMap = new TreeMap <> (supply);
            for (Card card: treeMap.keySet()) {
                sb.append("\t " + card.getCardName() + "\t\t " + treeMap.get(card) + "\n");
            }
        }
        return sb.toString();
    }

}