package org.cs362.dominion;
import java.util.*;
public class Deck {

    public ArrayList<Card> deck = new ArrayList<Card>();
    int tokens = 0;
    public Card emptyDeckCard;
    public Iterator deckIterator = deck.iterator();

    public Deck() {
        emptyDeckCard = null;
    }
    public Deck(String type) {
        emptyDeckCard = null;

        type = type.toLowerCase();
        if (type == "starter") {
            this.addNumberOfCardType(7, new Card("copper"));
            this.addNumberOfCardType(3, new Card("estate"));
        }
    }
    public Deck(int number, Card card) {
        emptyDeckCard = new Card(card.getName());

        this.addNumberOfCardType(number, card);
    }
    public void printDeck() {
        for (int x = 0; x < deck.size(); x++) {
            if (this.cardInfo(x) == null) {
                System.out.printf("NULL CARD\n");
            }
            else {
                System.out.printf("Card %2d: %s\n", (x+1), this.cardInfo(x).getName());
            }
        }
    }
    public void printType(String type) {
        type = type.toLowerCase();
        for (int x = 0; x < deck.size(); x++) {
            if (this.cardInfo(x).isType(type)) {
                System.out.printf("Card #2%d: %-15sDescription: %s\n",(x+1), this.cardInfo(x).getName(), this.cardInfo(x).getDescription());
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(deck, new Random(System.nanoTime()));
    };
    public void addCard(Card card) {
        if (card != null) {
            deck.add(0, card);
        }
    }
    public void addBottomCard(Card card) {
        if (card != null) {
            deck.add(card);
        }
    }
    public String getName() {
        return this.cardInfo(0).getName();
    }
    public int getTokens()                  {return tokens;}
    public void setTokens(int number)       {tokens = number;}
    public void modifyTokens (int number)   {tokens += number;}
    public Card drawCard() {
        return (deck.size() > 0) ? deck.remove(0) : null;
    };
    public Card drawCard(String name) {
        for (int x = 0; x < deck.size(); x++) {
            if (this.cardNameEquals(x, name)) {
                return deck.remove(x);
            }
        }
        return null;
    }
    public Card drawCardAtIndex(int index) {
        if (index < deck.size()) {
            return deck.remove(index);
        }
        return null;
    }
    public boolean empty()  {return (deck.size() == 0) ? true : false;}
    public int numCards()   {return deck.size();}
    public boolean hasType(String type) {
        if (this.empty()) {
            return false;
        }
        for (int x = 0; x < deck.size(); x++) {
            if (cardInfo(x).isType(type)) {
                return true;
            }
        }
        return false;
    }
    public boolean hasCard(String name) {
        if (this.empty()) {
            return false;
        }
        for (int x = 0; x < deck.size(); x++) {
            if (cardInfo(x).getName().equals(name)) {
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
        if (this.empty() && emptyDeckCard != null) {
            return emptyDeckCard;
        }
        return deck.get(index);
    }
    public boolean cardNameEquals(int index, String name) {
        return deck.get(index).getName().equals(name);
    }

    public int indexOf(String cardName) {
        for (int x = 0; x < deck.size(); x++) {
            if (cardInfo(x).getName().equals(cardName)) {
                return x;
            }
        }
        return -1;
    }
    public int indexOfType(String type) {
        for (int x = 0; x < deck.size(); x++) {
            if (cardInfo(x).isType(type)) {
                return x;
            }
        }
        return -1;
    }
}
