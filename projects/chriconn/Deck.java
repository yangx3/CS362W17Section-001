import java.util.*;

public class Deck {

    ArrayList<Card> deck;

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public Deck() {
        deck = new ArrayList<Card>();
    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
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

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void printDeck() {
        for (int x = 0; x < deck.size(); x++) {
            System.out.println("Card #" + (x+1) + ": " + deck.get(x).getName());
        }
    }

    public void printType(String type) {
        type = type.toLowerCase();
        if (type == "action") {
            for (int x = 0; x < deck.size(); x++) {
                if (deck.get(x).getHasAction()) {
                    System.out.println("Card #" + (x+1) + ": " + deck.get(x).getName());
                }
            }
        }
    }

    /*
        Description: shuffle the deck
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void shuffle() {
        Collections.shuffle(deck, new Random(System.nanoTime()));
    };

    /*
        Description: adds the card to the top of the deck
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void addCard(Card card) {
        deck.add(0, card);
    };

    /*
        Description: adds a card to the bottom of the deck
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void addBottomCard(Card card) {
        deck.add(card);
    };

    /*
        Description: draws the card from the top of the deck
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public Card drawCard() {
        if (deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    };

    /*
        Description: checks to see if the deck is empty
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public boolean empty() {
        if (deck.size() == 0) {
            return true;
        }
        return false;
    };

    /*
        Description: returns the number of cards
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public int numCards() {
        return deck.size();
    };
}
