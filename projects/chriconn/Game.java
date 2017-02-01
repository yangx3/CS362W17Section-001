import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/*
Class Game
    Variables:
        Private:

        Public:
            ArrayList   <Deck>bank;
            int         numPlayers;
            ArrayList   <Player>players;

    Functions:
        Private:

        Public:
            Game()
            Game()
            Game(String ... names)
            printBank       ()
            playerTurn      (int playerNumber):


        Game()
            Game(String ... names)
            void        printBank();
            void        playerTurn(int playerNumber);


        Game()
            Description:
            Input:
            Output:
            Potential Errors:
                -

        Game(String ... names):
            Description:
            Input:
            Output:
            Potential Errors:
                -

        printBank:
            Description:
            Input:
            Output:
            Potential Errors:
                -

        playerTurn:
            Description:
            Input:
            Output:
            Potential Errors:
                -

*/

public class Game {
    public static void main(String[] args) {
        //creates three players
        Game dominion = new Game("Connor", "Billy", "Lily");
        //prints an empty line
        System.out.println();
        //prints the whole bank for testing
        // dominion.printBank();

        //player 0 (connor) gets to go
        dominion.playerTurn(0);

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

    public void playerTurn(int num) {
        //players name
        String name = getPlayer(num).getName();
        String cardToPlay;
        int pauseTime = 400;

        printLine("Drawing 5 cards...", 50, 800);
        for (int x = 0; x < 5; x++) {
            getPlayer(num).draw();
            clearAndShowHand(num, pauseTime);
        }

        getPlayer(num).buy(getDeck("smithy"));
        clearAndShowHand(num, pauseTime);
        printLine("Discarding all cards...", 50, 800);
        getPlayer(num).discardAll();
        clearAndShowHand(num, pauseTime);
        printLine("Drawing 5 cards...", 50, 800);
        getPlayer(num).draw(5);
        clearAndShowHand(num, pauseTime);
        printLine("Printing all decks...", 50, 800);
        printAllDecks(num);

        // if (getPlayer(num).hasActions()) {
        //     System.out.println("Has Actions");
        // }
        //     System.out.printf(name + ", play an action card in your hand: ");
        //     //card they want to play
        //     cardToPlay = scanner.nextLine();
        //     cardToPlay = cardToPlay.toLowerCase();
        //     players.get(playerNumber).playCard(cardToPlay);
        // }
        // else {
        //     System.out.println(name + ", you do not have any action cards in your hand.");
        // }
        // System.out.println(name + ", please buy something.");
        // players.get(playerNumber).printMoves();
        // players.get(playerNumber).playCard(cardToPlay);
    }

    public Player getPlayer(int number) {
        return players.get(number);
    }

    public Deck getDeck(String name) {
        for(int x = 0; x < bank.size(); x++) {
            String deckName = bank.get(x).cardInfo(0).getName();
            if (deckName.equals(name)) {
                return bank.get(x);
            }
        }
        return null;
    }

    public void printAllDecks(int num) {
        String name = getPlayer(num).getName();
        System.out.println("\n" + name + "'s draw deck: ");
        getPlayer(num).drawDeck.printDeck();
        System.out.println("\n" +  name + "'s hand:");
        getPlayer(num).showHand();
        System.out.println("\n" + name + "'s discarded deck: ");
        getPlayer(num).discard.printDeck();
    }

    //building a scanner class that will be used for keyboard input
    private static Scanner scanner = new Scanner(System.in);

    public void clearScreen() {
        System.out.print("\033[2J\033[K\033[H");
    }

    public void pause(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearAndShowHand(int playerNumber, int sleepTime) {
        clearScreen();
        System.out.println(getPlayer(playerNumber).getName() + "'s hand: ");
        getPlayer(playerNumber).showHand();
        pause(500);
    }

    public void printLine(String text, int sleepTime, int endDelay) {
        char[] charArr = text.toCharArray();
        for(int i=0; i<=charArr.length-1;i++)
        {
            System.out.print(charArr[i]);
            try
            {
                Thread.sleep(sleepTime);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        pause(endDelay);
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
