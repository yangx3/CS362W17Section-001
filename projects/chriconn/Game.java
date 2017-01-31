import java.io.*;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        //clear the screen
        System.out.print("\033[2J\033[K\033[H");

        Player connor = new Player("Connor");

        /*
        Example of getting the user for inut
        Reading from System.in
        Scanner reader = new Scanner(System.in);
        Scans the next token of the input as an int.
        int n = reader.nextInt();
        */

        connor.draw(5);
        System.out.println("Player "+connor.getName());
        connor.showHand();

        Game dominion = new Game("Connor", "Billy", "Lily");
        System.out.println();
        dominion.printBank();

    }

    //array of all decks the game owns
    ArrayList<Deck> bank;
    int numPlayers;
    ArrayList<Player> players;

    public Game() {
        bank = new ArrayList<Deck>();
        players = new ArrayList<Player>();
        //treasure
        bank.add(new Deck(30, new Card("gold")));
        bank.add(new Deck(40, new Card("silver")));
        bank.add(new Deck(60, new Card("copper")));

        //victory
        bank.add(new Deck(12, new Card("province")));
        bank.add(new Deck(12, new Card("dutchy")));
        bank.add(new Deck(24, new Card("estate")));

        //action
        bank.add(new Deck(10, new Card("village")));
        bank.add(new Deck(10, new Card("smithy")));
        bank.add(new Deck(10, new Card("adventurer")));
        bank.add(new Deck(10, new Card("curse")));
        bank.add(new Deck(10, new Card("witch")));
        bank.add(new Deck(10, new Card("cellar")));
        bank.add(new Deck(10, new Card("market")));
    }

    public Game(String ... names) {
        bank = new ArrayList<Deck>();
        //treasure
        bank.add(new Deck(30, new Card("gold")));
        bank.add(new Deck(40, new Card("silver")));
        bank.add(new Deck(60, new Card("copper")));

        //victory
        bank.add(new Deck(12, new Card("province")));
        bank.add(new Deck(12, new Card("dutchy")));
        bank.add(new Deck(24, new Card("estate")));

        //action
        bank.add(new Deck(10, new Card("village")));
        bank.add(new Deck(10, new Card("smithy")));
        bank.add(new Deck(10, new Card("adventurer")));
        bank.add(new Deck(10, new Card("curse")));
        bank.add(new Deck(10, new Card("witch")));
        bank.add(new Deck(10, new Card("cellar")));
        bank.add(new Deck(10, new Card("market")));

        players = new ArrayList<Player>();
        for (String s: names) {
            players.add(new Player(s));
        }
    }

    public void printBank() {
        System.out.println("Bank:");
        System.out.println("Number of decks left: " + bank.size());
        System.out.println("Number of decks empty: " + (13-bank.size()));
        for (int x = 0; x < bank.size(); x++) {
            System.out.printf("Deck Type: %-20s# in deck: %d\n", bank.get(x).cardInfo(0).getName(), bank.get(x).numCards());
        }
    }


}






/*
    Number of cards:
    Gold:   30
    Silver: 40
    Copper: 60

    Actions: 10

    Estate:     24
    Dutchy:     12
    Province:   12

    Curse:
    2 players: 10
    3 players: 20
    4 players: 30
*/
