package cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
    private Integer numPlayers; //number of players
    private Map<Card,Integer> supplyCount;  //this is the amount of a specific type of card given a specific number.
    private Map<Card,Integer> embargoTokens;
    private Integer outpostPlayed;
    private Integer outpostTurn;
    private Integer whoseTurn;
    private Integer phase;
    private Integer numActions; // Starts at 1 each turn
    private Integer coins; // Use as you see fit!
    private Integer numBuys; // Starts at 1 each turn
    private List<List<Card>> hand; // player -> hand
    private List<List<Card>> deck; // player -> deck
    private List<List<Card>> discard; // player -> discard
    private List<Card> playedCards;
    private List<Card> kingdomCards;

    private Random rng = new Random();

    public Game(Integer numPlayers, List<Card> kingdomCards, Integer randomSeed) {
        if (kingdomCards.size() != 10) {
            throw new RuntimeException("must supply 10 kingdom cards");
        }
        if (!(2 <= numPlayers && numPlayers <= 4)) {
            throw new RuntimeException("numPlayers must be between 2 and 4");
        }

        this.kingdomCards = new ArrayList<>(kingdomCards);
        this.numPlayers = numPlayers;
        this.supplyCount = new HashMap<Card,Integer>();
        this.embargoTokens = new HashMap<Card,Integer>();
        this.outpostPlayed = 0;
        this.outpostTurn = 0;
        this.whoseTurn = 0;
        this.phase = 0;
        this.numActions = 0;
        this.coins = 0;
        this.numBuys = 0;
        this.hand = new ArrayList<List<Card>>(numPlayers);
        this.deck = new ArrayList<List<Card>>(numPlayers);
        this.discard = new ArrayList<List<Card>>(numPlayers);
        this.playedCards = new ArrayList<Card>();
        for (Integer i = 0; i < numPlayers; i++) {
            this.hand.add(i, new ArrayList<Card>());
            this.deck.add(i, new ArrayList<Card>());
            this.discard.add(i, new ArrayList<Card>());
        }

        // Initialize RNG to a known seed
        rng.setSeed(randomSeed);

        // Initialize supply
        this.supplyCount.put(Card.Curse, 30);
        this.supplyCount.put(Card.Estate, 24);
        this.supplyCount.put(Card.Duchy, 12);
        this.supplyCount.put(Card.Province, 12);

        this.supplyCount.put(Card.Copper, 60);
        this.supplyCount.put(Card.Silver, 40);
        this.supplyCount.put(Card.Gold, 30);

        for (Card c : kingdomCards) {
            this.supplyCount.put(c, 10);
        }

        // Initialize decks
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < 7; j++) {
                this.deck.get(i).add(Card.Copper);
                this.supplyCount.put(Card.Copper, this.supplyCount.get(Card.Copper)-1);
            }
            for (int j = 0; j < 7; j++) {
                this.deck.get(i).add(Card.Estate);
                this.supplyCount.put(Card.Estate, this.supplyCount.get(Card.Estate)-1);
            }
        }
    }

    // Shuffle a player's deck.
    // Assumes all cards are now in deck array (or hand/played);
    // aftewards, discard is empty
    public void shuffle(int player) {}

    // Play card with index handPos from current player's hand
    public void playCard(int handPos, int choice1, int choice2, int choice3) {}

    // Buy card with supply index supplyPos
    public void buyCard(int supplyPos) {}

    // How many cards current player has in hand
    public int numHandCards() { return 0; }

    // enum value of indexed card in player's hand
    public Card handCard(int handNum) { return Card.Copper; }

    // How many of given card are left in supply
    public int supplyCount(Card card) { return supplyCount.get(card); }

    // Count how many cards of a certain type a player has, in total
    public int fullDeckCount(int player, Card card) { return 0; }

    // Get the current player
    public int whoseTurn() { return whoseTurn; }

    // End the current player's turn
    // Must do phase C and advance to next player;
    // do not advance whose turn if game is over
    public void endTurn() {}

    public boolean isGameOver() {
        // The game ends when either
        //
        // 1) The province stack is empty
        if (this.supplyCount.get(Card.Province) == 0) {
            return true;
        }

        // 2) Any three supply stacks are empty
        int empty = 0;
        for (Card c : this.kingdomCards) {
            if (this.supplyCount.get(c) == 0) {
                empty++;
            }
        }
        return empty >= 3;
    }

    // Scores may be negative
    public int scoreFor(int player) {
        int score = 0;
        for (Card c : this.hand.get(player)) {
            score += c.score();
        }
        for (Card c : this.discard.get(player)) {
            score += c.score();
        }
        for (Card c : this.deck.get(player)) {
            score += c.score();
        }
        return score;
    }

    // Set array position of each player who won (remember ties!) to 1, others to 0
    public List<Integer> getWinners() { return new ArrayList<Integer>(); }

}
