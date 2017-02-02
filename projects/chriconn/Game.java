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

public class Game {
    public static void main(String[] args) {
        System.out.print("Do you want to run this program with pretty printing? (yes/no): ");
        String pretty = scanner.nextLine();
        pretty = pretty.toLowerCase();

        if (pretty.equals("yes")) {
            setSleepTime(500);
            setPrintTime(40);
        }
        else {
            setSleepTime(0);
            setPrintTime(0);
        }

        //creates three players
        Game dominion = new Game("Connor", "Billy", "Lily");

        //prints an empty line
        System.out.println();
        //prints the whole bank for testing
        dominion.printBank();

        for (int x = 0; x < 20; x++) {
            dominion.playerTurn(0);
        }


        // for (int x = 0; x < 3; x++) {
        //     dominion.playerTurn(x);
        // }
    }

    //array of all decks the game owns
    ArrayList<Deck> bank;
    ArrayList<Deck> trash;
    int numPlayers;
    ArrayList<Player> players;
    static int printTime;
    static int sleepTime;

    public static void setPrintTime(int number) {
        printTime = number;
    }

    public static void setSleepTime(int number) {
        sleepTime = number;
    }

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
        // bank.add(new Deck(10, new Card("village")));
        // bank.add(new Deck(10, new Card("smithy")));
        // bank.add(new Deck(10, new Card("adventurer")));
        // bank.add(new Deck(10, new Card("curse")));
        // bank.add(new Deck(10, new Card("witch")));
        // bank.add(new Deck(10, new Card("cellar")));
        // bank.add(new Deck(10, new Card("market")));

        String[] decksToImplement = {"adventurer", "ambassador", "baron", "council room", "cutpurse", "embargo", "feast", "gardens", "great hall", "mine", "curse"};

        for (String deckName: decksToImplement) {
            bank.add(new Deck(10, new Card(deckName)));
        }
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
        // bank.add(new Deck(10, new Card("village")));
        // bank.add(new Deck(10, new Card("smithy")));
        // bank.add(new Deck(10, new Card("adventurer")));
        // bank.add(new Deck(10, new Card("curse")));
        // bank.add(new Deck(10, new Card("witch")));
        // bank.add(new Deck(10, new Card("cellar")));
        // bank.add(new Deck(10, new Card("market")));

        //build the action decks
        String[] decksToImplement = {"adventurer", "ambassador", "baron", "council room", "cutpurse", "embargo", "feast", "gardens", "great hall", "mine", "curse", "smithy", "village"};
        for (String deckName: decksToImplement) {
            bank.add(new Deck(10, new Card(deckName)));
        }

        //build the players
        players = new ArrayList<Player>();
        for (String s: names) {
            players.add(new Player(s));
        }
        numPlayers = names.length;
    }

    public void playerTurn(int num) {

        /*******************************************************/
        /*************** Variable initialization ***************/
        /*******************************************************/

        String name = getPlayer(num).getName(); //players name
        String cardToPlay;                      //card the user will want to play

        //award the player one action and one buy to start the turn
        getPlayer(num).starterPoints();


        /*******************************************************/
        /******************** Begin actions ********************/
        /*******************************************************/

        clearScreen();
        printLineDelay(name + ", the game is drawing 5 cards...");
        getPlayer(num).draw(5);
        clearAndShowHand(num, sleepTime);

        /*******************************************************/
        /******************** Action phase ********************/
        /*******************************************************/

        //if the player has action points and they have action cards in their hand
        while (getPlayer(num).hasActions()) {

            printLineDelay("Please play an action card:\n");
            //print the number of actions, buys and coins the player has
            System.out.println(getPlayer(num).getMoves());

            System.out.println("\nCards you can play:");
            //print only the action cards in their hand
            getPlayer(num).printHandType("action");
            System.out.print("Select your card: ");

            cardToPlay = scanner.nextLine();

            getPlayer(num).playCard(cardToPlay);


            if (cardToPlay.equals("skip")) {
                getPlayer(num).skipActionsPhase();
            }
        }
        //if player did not have an action card
        if (!getPlayer(num).handContainsActions()) {
            printLineDelay("You do not have an action card...");
        }
        else {
            printLineDelay("You do not have any more action points...");
        }
        printLineDelay("\nMoving on to buying phase...\n");
        printLineDelay("Press enter to continue: ");
        scanner.nextLine();


        /*******************************************************/
        /******************** Buying Phase ********************/
        /*******************************************************/

        //tally up the total treasure value
        getPlayer(num).sumTreasure();

        //set the loop to exit by default
        boolean done = true;
        boolean previousInputError = false;
        do {
            clearAndShowHand(num, sleepTime);
            System.out.println("");
            //print the moves
            printLineDelay(getPlayer(num).getMoves());
            System.out.println("\n\nHere are all the cards you can afford in the bank: ");
            //print only items in the bank that the player can afford
            printBank(getPlayer(num).getValues());

            if (!previousInputError) {
                printLineDelay("\nPlease enter a card you want to buy (or you may skip): ");
            } else {
                printLineDelay("\nThat is not a valid card. Please enter a card you want to buy (or you may skip): ");
            }
            String purchaseCard = scanner.nextLine();
            purchaseCard = purchaseCard.toLowerCase();

            /*******#### HERE IS _BUG_ ####*******/
            /*******####
                The buy function does not check the value of the card before buying
            ####*******/
            //if the getDeck function couldn't find the deck, it will return null
            //if it didn't return null, it means it found the deck.
            if (getDeck(purchaseCard) != null) {
                getPlayer(num).buy(getDeck(purchaseCard));
                System.out.println("Purchase sucessfull");
                pause(sleepTime);
                done = true;
            }
            else if (purchaseCard.equals("skip")) {
                printLineDelay("Skipped. ");
                printLineDelay("Your turn will now end...\n");
                getPlayer(num).endTurn();
                done = true;
            }
            else {
                printLineDelay("Sorry, that is not a valid card. Try again.\n");
                printLineDelay("....");
                done = false;
                previousInputError = true;
            }
        } while (!done && (getPlayer(num).getValues() > 0));

        getPlayer(num).discardAll();
        printLineDelay("You may see the deck, or just press enter to end your turn: ");

        String request = scanner.nextLine();
        request = request.toLowerCase();
        if (request.equals("deck")) {
            printBank();
            printLineDelay("Press enter to end your turn: ");
            scanner.nextLine();
        }

    }

    public void printBank() {
        for (int x = 0; x < bank.size(); x++) {
            System.out.printf("%-15s# remaining: %d\tCost: %d\tDescription: %s\n", bank.get(x).cardInfo(0).getName(), bank.get(x).numCards(), bank.get(x).cardInfo(0).getCost(), bank.get(x).cardInfo(0).getDescription());
        }
    }

    public void printBank(int coinLimit) {
        for (int x = 0; x < bank.size(); x++) {
            if (bank.get(x).cardInfo(0).getCost() <= coinLimit) {
                System.out.printf("%-15s# remaining: %d\tCost: %d\tDescription: %s\n", bank.get(x).cardInfo(0).getName(), bank.get(x).numCards(), bank.get(x).cardInfo(0).getCost(), bank.get(x).cardInfo(0).getDescription());
            }
        }
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
        } catch (InterruptedException e) {}
    }

    public void clearAndShowHand(int playerNumber, int sleepTime) {
        clearScreen();
        System.out.println(getPlayer(playerNumber).getName() + "'s hand: ");
        getPlayer(playerNumber).showHand();
        pause(sleepTime);
    }

    public void printLineDelay(String text) {
        char[] charArr = text.toCharArray();
        for(int i = 0; i <= charArr.length-1; i++) {
            System.out.print(charArr[i]);
            pause(printTime);
        }
        pause(sleepTime);
    }

    public void printLineDelay(String text, int printTime) {
        char[] charArr = text.toCharArray();
        printTime = printTime/(charArr.length-1);
        for(int i = 0; i <= charArr.length-1; i++) {
            System.out.print(charArr[i]);
            pause(printTime);
        }
        pause(sleepTime);
    }
}
