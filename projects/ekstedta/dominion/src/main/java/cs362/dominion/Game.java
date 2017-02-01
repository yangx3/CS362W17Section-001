package cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
    private Integer numPlayers; //number of players
    private Map<Card,Integer> supply;  //this is the amount of a specific type of card given a specific number.
    private List<Card> kingdomCards;
    private Random rng = new Random();

    private Integer whoseTurn;

    // phases
    // 0 - actions
    // 1 - buys
    private Integer phase;

    // players' cards
    private List<List<Card>> hand; // player -> hand
    private List<List<Card>> deck; // player -> deck
    private List<List<Card>> discard; // player -> discard

    // state for current turn
    private Integer actions; // Starts at 1 each turn
    private Integer coins; // Use as you see fit!
    private Integer buys; // Starts at 1 each turn
    private List<Card> playedCards;

    // card-specific state
    private Map<Card,Integer> embargoTokens;
    private Integer outpostPlayed;
    private Integer outpostTurn;

    private final int handLimit = 5;

    public Game(Integer numPlayers, List<Card> kingdomCards, Integer randomSeed) {
        if (kingdomCards.size() != 10) {
            throw new RuntimeException("must supply 10 kingdom cards");
        }
        if (!(2 <= numPlayers && numPlayers <= 4)) {
            throw new RuntimeException("numPlayers must be between 2 and 4");
        }

        this.kingdomCards = new ArrayList<>(kingdomCards);
        this.numPlayers = numPlayers;
        this.supply = new HashMap<Card,Integer>();
        this.embargoTokens = new HashMap<Card,Integer>();
        this.outpostPlayed = 0;
        this.outpostTurn = 0;
        this.whoseTurn = 0;
        this.phase = 0;
        this.actions = 0;
        this.coins = 0;
        this.buys = 0;
        this.playedCards = new ArrayList<Card>();

        this.hand = new ArrayList<List<Card>>(numPlayers);
        this.deck = new ArrayList<List<Card>>(numPlayers);
        this.discard = new ArrayList<List<Card>>(numPlayers);
        for (Integer i = 0; i < numPlayers; i++) {
            this.hand.add(i, new ArrayList<Card>());
            this.deck.add(i, new ArrayList<Card>());
            this.discard.add(i, new ArrayList<Card>());
        }

        // Initialize RNG to a known seed
        rng.setSeed(randomSeed);

        // Initialize supply
        this.supply.put(Card.Curse, 30);
        this.supply.put(Card.Estate, 24);
        this.supply.put(Card.Duchy, 12);
        this.supply.put(Card.Province, 12);

        this.supply.put(Card.Copper, 60);
        this.supply.put(Card.Silver, 40);
        this.supply.put(Card.Gold, 30);

        for (Card c : kingdomCards) {
            this.supply.put(c, 10);
        }

        // Initialize decks
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < 7; j++) {
                this.deck.get(i).add(Card.Copper);
                this.supply.put(Card.Copper, this.supply.get(Card.Copper)-1);
            }
            for (int j = 0; j < 7; j++) {
                this.deck.get(i).add(Card.Estate);
                this.supply.put(Card.Estate, this.supply.get(Card.Estate)-1);
            }
        }

        // shuffle decks
        for (int i = 0; i < numPlayers; i++) {
            this.shuffle(i);
        }

        this.startTurn();
    }

    // Shuffle a player's deck.
    // Doesn't touch the discard pile or cards in hand/played.
    public void shuffle(int player) {
        List<Card> deck = this.deck.get(player);
        for (int i = 0; i < deck.size(); i++) {
            int j = i + this.rng.nextInt(deck.size() - i);
            swap(deck, i, j);
        }
    }

    // Swap two elements in an array
    public static <T> void swap(List<T> arr, int i, int j) {
        if (i != j) {
            T a = arr.get(i);
            T b = arr.get(j);
            arr.set(i, b);
            arr.set(j, a);
        }
    }

    // Play card with index handPos from current player's hand
    public void playCard(int handPos, Object... choices) {
        List<Card> hand = this.hand.get(this.whoseTurn);
        if (!(0 <= handPos && handPos < hand.size())) {
            throw new RuntimeException("invalid handPos");
        }

        // check if card is an action
        Card card = hand.get(handPos);
        if (!card.isAction()) {
            if (card.coins() != 0) {
                // ignore played treasure cards
                return;
            }
            throw new RuntimeException("not an action");
        }

        // move card to the played cards pile
        // XXX changes hand indices
        // don't move to discard pile until turn is over
        hand.remove(handPos);
        this.playedCards.add(card);

        // do the action
        this.doCard(card, choices);

        // Reeduce number of actions left
        this.actions--;
    }

    private void doCard(Card playedCard, Object... choices) {
        if (playedCard == Card.Adventurer) {
            // Reveal cards from your deck until you reveal 2 Treasure cards.
            // Put those Treasure cards into your hand and discard the other revealed cards
            List<Card> deck = this.deck.get(this.whoseTurn);
            List<Card> hand = this.hand.get(this.whoseTurn);
            List<Card> discard = this.discard.get(this.whoseTurn);
            int treasureCards = 0;
            while (treasureCards < 2 && deck.size() >= 1) {
                Card card = deck.get(deck.size()-1);
                if (card.coins() != 0) {
                    deck.remove(deck.size()-1);
                    hand.add(card);
                    this.coins += card.coins();
                    treasureCards++;
                } else {
                    deck.remove(deck.size()-1);
                    discard.add(card);
                }
            }
        } else {
            System.out.printf("unknown card %s", playedCard);
        }
    }

    // Buy a card
    public void buyCard(Card card) {
        if (this.buys < 1) {
            throw new RuntimeException("you have no buys left");
        }
        if (this.supply.get(card) == null || this.supply.get(card) < 1) {
            throw new RuntimeException("there are no more of that card left");
        }
        if (this.coins < card.cost()) {
            throw new RuntimeException("not enough coins");
        }
        if (this.phase != 0 && this.phase != 1) {
            throw new RuntimeException("you aren't in the buy phase");
        }
        this.phase = 1;
        // card goes in the discard pile
        this.discard.get(this.whoseTurn).add(card);
        this.supply.put(card, this.supply.get(card) - 1);
        this.coins -= card.cost();
        this.buys -= 1;
    }

    // How many cards current player has in hand
    public int numHandCards() {
        return this.hand.get(this.whoseTurn).size();
    }

    // enum value of indexed card in player's hand
    public Card handCard(int handNum) {
        List<Card> hand = this.hand.get(this.whoseTurn);
        if (0 <= handNum && handNum < hand.size()) {
            return hand.get(handNum);
        } else {
            return null;
        }
    }

    // How many of given card are left in supply
    public int supply(Card card) { return supply.get(card); }

    // Count how many cards of a certain type a player has, in total
    public int fullDeckCount(int player, Card card) {
        List<Card> hand = this.hand.get(player);
        int count = 0;
        for (Card x : hand) {
            if (x == card) {
                count++;
            }
        }
        return count;
    }

    // Get the current player
    public int whoseTurn() { return whoseTurn; }

    // End the current player's turn
    // Must do phase C and advance to next player;
    // do not advance whose turn if game is over
    public void endTurn() {
        // discard hand
        this.discard.get(this.whoseTurn).addAll(this.hand.get(this.whoseTurn));
        this.hand.get(this.whoseTurn).clear();

        // move played actions to discard pile
        this.discard.get(this.whoseTurn).addAll(this.playedCards);
        this.playedCards.clear();

        // draw five cards
        this.draw(handLimit);

        // advance player
        this.whoseTurn++;
        if (this.whoseTurn >= this.numPlayers) {
            this.whoseTurn = 0;
        }

        this.startTurn();
    }

    private void startTurn() {
        this.phase = 0;
        this.actions = 1;
        this.buys = 1;
        this.coins = 0;
        for (Card c : this.hand.get(this.whoseTurn)) {
            this.coins += c.coins();
        }
        System.out.printf("coins=%d\n", this.coins);
    }

    private void draw(int n) {
        List<Card> deck = this.deck.get(this.whoseTurn);
        List<Card> hand = this.hand.get(this.whoseTurn);
        List<Card> discard = this.discard.get(this.whoseTurn);

        for (int i = 0; i < n; i++) {
            if (deck.size() < 1) {
                deck.addAll(discard);
                discard.clear();
                this.shuffle(this.whoseTurn);
            }
            if (deck.size() < 1) {
                break; // uh oh
            }
            Card card = deck.get(deck.size()-1);
            deck.remove(deck.size()-1);
            hand.add(card);
        }
    }

    public boolean isGameOver() {
        // The game ends when either
        //
        // 1) The province stack is empty
        if (this.supply.get(Card.Province) <= 0) {
            return true;
        }

        // 2) Any three supply stacks are empty
        int empty = 0;
        for (Card c : this.kingdomCards) {
            if (this.supply.get(c) <= 0) {
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
