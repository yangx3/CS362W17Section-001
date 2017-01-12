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
}
