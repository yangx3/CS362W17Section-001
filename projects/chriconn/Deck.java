import java.util.*;

public class Deck {

    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
    }

    public Deck(String type) {
        deck = new ArrayList<Card>();
        type = type.toLowerCase();

        if (type == "starter") {
            Card copperCard = new Card();
            copperCard.buildCopper();
            for (int x = 0; x < 7; x++) {
                deck.add(copperCard);
            }

            Card estateCard = new Card();
            estateCard.buildEstate();
            for (int x = 0; x < 3; x++) {
                deck.add(estateCard);
            }
        }
    }

    public void printDeck() {
        for (int x = 0; x < deck.size(); x++) {
            System.out.println("Card #" + (x+1) + ": " + deck.get(x).getName());
        }
    }

    //shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck, new Random(System.nanoTime()));
    };

    //adds the card to the top of the deck
    public void addCard(Card card) {
        deck.add(0, card);
    };

    //adds a card to the bottom of the deck
    public void addBottomCard(Card card) {
        deck.add(card);
    };

    //draws the card from the top of the deck
    public Card drawCard() {
        return deck.remove(0);
    };

    //checks to see if the deck is empty
    public boolean isEmpty() {
        if (deck.size() == 0) {
            return true;
        }
        return false;
    };

    //returns the number of cards
    public int numCards() {
        return deck.size();
    };
}
