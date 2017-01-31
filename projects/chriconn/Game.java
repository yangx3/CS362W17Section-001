import java.io.*;

public class Game {
    public static void main(String[] args) {
        //clear the screen
        System.out.print("\033[2J\033[K\033[H");

        Player connor = new Player("Connor");

        /*
            Example of getting the user for inut
        // Reading from System.in
        Scanner reader = new Scanner(System.in);
        // Scans the next token of the input as an int.
        int n = reader.nextInt();
        */

        connor.draw(5);
        System.out.println("Player "+connor.getName());
        connor.showHand();

        System.out.println("\n\n");
        connor.hand.addCard(new Card("smithy"));


        // connor.hand.printType("action");


        connor.hand.addCard(new Card("gold"));
        connor.showHand();
        // while (connor.hasActions()) {
        //
        // }
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
