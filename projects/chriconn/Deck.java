import java.util.*;

/*
Class Deck
    Variables:
        Private:
            Deck deck

    Functions:
        Private:

        Public:
            Deck()
            Deck(String)
            Deck(int, Card)
            void      printDeck()
            void      printType(String type)
            void      shuffle()
            void      addBottomCard(Card card)
            Card      drawCard()
            boolean   empty()
            int       numCards()
            boolean   hasActions()
            void      addNumberOfCardType(int number, Card card)
            Card      cardInfo(int index)
            int       indexOf(String cardName)

        Deck:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        Deck(String):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        Deck(int, Card):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        printDeck:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        printType(String type):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        shuffle:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        addBottomCard(Card card):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        drawCard:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        empty:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        numCards:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        hasActions:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        addNumberOfCardType(int number, Card card):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        cardInfo(int index):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        indexOf(String cardName):
            Description:
            Input:
            Output:
            Potential Errors:
                -

*/

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
    }

    public Deck(String type) {
        deck = new ArrayList<Card>();
        type = type.toLowerCase();

        if (type == "starter") {
            for (int x = 0; x < 7; x++) {
                deck.add(new Card("copper"));
            }

            for (int x = 0; x < 3; x++) {
                deck.add(new Card("estate"));
            }
        }
    }

    public Deck(int number, Card card) {
        deck = new ArrayList<Card>();
        for (int x = 0; x < number; x++) {
            this.addCard(card);
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
                        System.out.printf("Card #0%d: %-15sDescription: %s\n",(x+1), deck.get(x).getName(), deck.get(x).getDescription());
                    }
                    else {
                        System.out.printf("Card #%d:%-15s\tDescription: %s\n",(x+1), deck.get(x).getName(), deck.get(x).getDescription());
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

    public Card drawCard(String name) {
        for (int x = 0; x < deck.size(); x++) {
            if (this.cardInfo(x).getName().equals(name)) {
                return deck.remove(x);
            }
        }
        return null;
    }

    public boolean empty() {
        if (deck.size() == 0) {
            return true;
        }
        return false;
    };

    public int numCards() {
        return deck.size();
    };

    public boolean hasActions() {
        if (this.empty()) {
            return false;
        }
        for (int x = 0; x < deck.size(); x++) {
            if (cardInfo(x).getHasAction()) {
                return true;
            }
        }
        return false;
    }

    public void addNumberOfCardType(int number, Card card) {
        for (int x = 0; x < number; x++) {
            this.addCard(card);
        }
    }

    public Card cardInfo(int index) {
        return deck.get(index);
    }

    public int indexOf(String cardName) {
        if (cardName.equals("treasure")) {
            for (int x = 0; x < deck.size(); x++) {
                if (cardInfo(x).isTreasureCard()) {
                    return x;
                }
            }
            return -1;
        }
        for (int x = 0; x < deck.size(); x++) {
            if (cardInfo(x).getName().equals(cardName)) {
                return x;
            }
        }
        return -1;
    }
}
