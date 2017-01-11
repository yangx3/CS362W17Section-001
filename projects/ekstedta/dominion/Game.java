import java.util.ArrayList;
import java.util.List;

class Game {
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
    private List<List<Integer>> hand; // player -> hand
    private List<List<Integer>> deck; // player -> deck
    private List<List<Integer>> discard; // player -> discard
    private List<Integer> playedCards;

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
        this.hand = new ArrayList<List<Integer>>(numPlayers);
        this.deck = new ArrayList<List<Integer>>(numPlayers);
        this.discard = new ArrayList<List<Integer>>(numPlayers);
        this.playedCards = new ArrayList<Integer>();
        for (Integer i = 0; i < numPlayers; i++) {
            this.hand.set(i, new ArrayList<Integer>());
            this.deck.set(i, new ArrayList<Integer>());
            this.discard.set(i, new ArrayList<Integer>());
        }
    }

}
