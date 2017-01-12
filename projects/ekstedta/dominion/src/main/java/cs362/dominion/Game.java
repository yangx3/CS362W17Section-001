import java.util.ArrayList;
import java.util.List;

public class Game {
    private Integer numPlayers; //number of players
    private List<Integer> supplyCount;  //this is the amount of a specific type of card given a specific number.
    private List<Integer> embargoTokens;
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

    private final int treasure_count = 0; // ???

    public Game(Integer numPlayers, List<Integer> kingdomCards, Integer randomSeed) {
        this.numPlayers = numPlayers;
        this.supplyCount = new ArrayList<Integer>(treasure_count+1);
        this.embargoTokens = new ArrayList<Integer>(treasure_count+1);
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
            this.hand.set(i, new ArrayList<Card>());
            this.deck.set(i, new ArrayList<Card>());
            this.discard.set(i, new ArrayList<Card>());
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
    public int supplyCount(Card card) { return 0; }

    // Count how many cards of a certain type a player has, in total
    public int fullDeckCount(int player, Card card) { return 0; }

    // Get the current player
    public int whoseTurn() { return 0; }

    // End the current player's turn
    // Must do phase C and advance to next player;
    // do not advance whose turn if game is over
    public void endTurn() {}

    public boolean isGameOver() { return false; }

    // Scores may be negative
    public int scoreFor(int player) { return 0; }

    // Set array position of each player who won (remember ties!) to 1, others to 0
    public List<Integer> getWinners() { return new ArrayList<Integer>(); }

}
