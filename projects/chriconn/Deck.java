import java.util.*;

public class Deck {

    private ArrayList<Card> deck;

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
            if (x < 9) {
                System.out.println("Card #0" + (x+1) + ": " + deck.get(x).getName());
            }
            else {
                System.out.println("Card #" + (x+1) + ": " + deck.get(x).getName());
            }
        }
    }

    public void printType(String type) {
        type = type.toLowerCase();
        if (type == "action") {
            for (int x = 0; x < deck.size(); x++) {
                if (deck.get(x).getHasAction()) {
                    if (x < 9) {
                        System.out.println("Card #0" + (x+1) + ": " + deck.get(x).getName());
                    }
                    else {
                        System.out.println("Card #" + (x+1) + ": " + deck.get(x).getName());
                    }
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck, new Random(System.nanoTime()));
    };

    public void addCard(Card card) {
        deck.add(0, card);
    };

    public void addBottomCard(Card card) {
        deck.add(card);
    };

    public Card drawCard() {
        if (deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    };

    public boolean empty() {
        if (deck.size() == 0) {
            return true;
        }
        return false;
    };

    public int numCards() {
        return deck.size();
    };

    //not done
    public boolean containsActions() {
        if (this.empty()) {
            return false;
        }
        return true;
    }

    public void addNumberOfCardType(int number, Card card) {
        for (int x = 0; x < number; x++) {
            this.addCard(card);
        }
    }
}
