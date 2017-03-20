package goertzel;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTestDominion {

    @Test
    public void runRandTest() {
        int seed = 10;
        boolean useSeed = true;
        boolean testSupplysInitial;



        Random randNumGen = new Random(seed);

        // Set Up Game Board
        int numPlayers = randNumGen.nextInt((4-2)+1)+2;
//        System.out.println(numPlayers);


        String[] newPlayers = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++)
            newPlayers[i] = "Player" + (i+1);

        GameState board;
        if (useSeed) board = new GameState(newPlayers, seed);
        else board = new GameState(newPlayers);



        int cardCount = totalCards(board);
        testSupplysInitial = verifyStacksInitial(board);



        // Run Game with Tests
        board.printBoardInfo();
        while (!board.gameOver()){
            board.playOneTurn();
            System.out.println("\n============================================================\n");
            board.printBoardInfo();


        }




        // Print Game End Info
        System.out.println("\n\n============================================================\n");
        System.out.println("GAME END\n");

        board.printBoardInfo();

        System.out.println("\n\nRESULTS");
        for (Player p : board.players) {
            System.out.println("\t" + p.getPlayerName() + "\tVP: " + p.calcVP());
        }

        board.winners = board.determineWinners();
        if (board.winners.size() == 2) {
            System.out.println("THERE WAS A TIE:");
        } else {
            System.out.println("THE WINNER IS:");
            System.out.println("\t" + board.winners.get(0).getPlayerName());
        }



        // Test Results
        System.out.println("\n\n\n============================================================");
        System.out.println("============================================================");
        System.out.println("\t\t\tTEST RESULTS");
        System.out.println("============================================================");
        System.out.println("============================================================\n");

        System.out.println("* VALID CARD COUNTS: " +  verifyCardCount(board, cardCount));
        System.out.println("* VALID STARTING SUPPLIES: " + testSupplysInitial);
        System.out.println("* CORRECT WIN CONDITION: " + verifyStackFinal(board));
        System.out.println("* VALID GAME WINNER: " + (board.getWinners() != null));

        System.out.println("\n");
    }




    static int totalCards(GameState board){
        List<Supply_Stack> supplyPiles = new ArrayList<Supply_Stack>();
        supplyPiles.addAll(board.victory_supply);
        supplyPiles.addAll(board.treasure_supply);
        supplyPiles.addAll(board.kingdom_supply);

        int cardCount = 0;
        for (Supply_Stack s : supplyPiles)
            cardCount += s.cardsRemaining();

        for (Player p : board.players)
            cardCount += p.getCardCount();

        return cardCount;
    }

    static boolean verifyCardCount(GameState board, int expected){
        if (totalCards(board) <= expected) return true;
        else return false;
    }

    static boolean verifyStacksInitial(GameState board){
        List<Supply_Stack> supplyPiles = new ArrayList<Supply_Stack>();
        supplyPiles.addAll(board.victory_supply);
        supplyPiles.addAll(board.treasure_supply);
        supplyPiles.addAll(board.kingdom_supply);

        for (Supply_Stack s : supplyPiles)
            if (s.isEmpty() || s.isEmbargoed())
                return false;
        return true;
    }

    static boolean verifyStackFinal(GameState board){
        if (board.findSupplyStack(Card.CardName.PROVINCE).isEmpty()) {return true;}

        List<Supply_Stack> supplyPiles = new ArrayList<Supply_Stack>();
        supplyPiles.addAll(board.victory_supply);
        supplyPiles.addAll(board.treasure_supply);
        supplyPiles.addAll(board.kingdom_supply);

        int emptyCount = 0;
        for (Supply_Stack s : supplyPiles)
            if (s.isEmpty())
                emptyCount++;

        return (emptyCount == 3);
    }
}
