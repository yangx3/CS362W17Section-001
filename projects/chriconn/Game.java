import java.io.*;
import java.util.*;

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
        //clear the screen
        System.out.print("\033[2J\033[K\033[H");

        //creates three players
        Game dominion = new Game("Connor", "Billy", "Lily");
        //prints an empty line
        System.out.println();
        //prints the whole bank for testing
        dominion.printBank();

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

        getPlayer(num).draw(5);
        System.out.println("\n" +  name + "'s hand:");
        getPlayer(num).showHand();









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

    //building a scanner class that will be used for keyboard input
    private static Scanner scanner = new Scanner(System.in);

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
