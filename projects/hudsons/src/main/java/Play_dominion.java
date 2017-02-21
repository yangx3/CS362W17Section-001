/**
 * Created by samhudson on 2/8/17.
 */
import java.util.*;
public class Play_dominion {
    public static void main(String args[]) {
        initializeGame();
    }
    static void initializeGame() {
        Board the_board = new Board();
        Player player1 = new Player("John");
        Player player2 = new Player("Andy");

        //shuffle starting decks
        player1.shuffle_deck();
        player2.shuffle_deck();
        //play
        for(int i=0;i<10000;i++) {
            if(the_board.time_to_end()==1) {
                int player1_points = player1.calculate_victory();
                int player2_points = player2.calculate_victory();
                if(player1_points>player2_points) {
                    System.out.println("Player 1 has won with: "+player1_points+" points!");
                } else if(player1_points<player2_points) {
                    System.out.println("Player 2 has won with: "+player2_points+" points!");
                } else {
                    System.out.println("Both players have tied with: "+player2_points+" points!");
                }
                break;
            }
            System.out.println("\n\nRound Number:"+(i+1)+"\n\n");
            //Player 1 turn
            System.out.println("\nIt's player 1's ("+player1.name+") turn\n");
            System.out.println("\nPlayer 1's ("+player1.name+") result after draw\n");
            player1.draw_from_deck();
            player1.print_hand();
            System.out.println("\nPlayer 1 ("+player1.name+") is now in buying phase.\n");
            player1.buy_phase(the_board);
            System.out.println("\nPlayer 1 ("+player1.name+") is now in action phase.\n");
            player1.action_phase(the_board,player2);
            System.out.println("\nPlayer 1 ("+player1.name+") is now in clean-up phase.\n");
            player1.clean_up_phase();
            System.out.println("\nPrinting Player 1's ("+player1.name+") piles after clean-up phase.\n");
            player1.print_deck();
            player1.print_discard();
            player1.print_hand();
            player1.print_in_play();
            the_board.print_in_trash();

            //Player 2 turn
            System.out.println("\nIt's player 2's ("+player2.name+") turn\n");
            System.out.println("\nPlayer 2's ("+player2.name+") result after draw\n");
            player2.draw_from_deck();
            player2.print_hand();
            System.out.println("\nPlayer 2 ("+player2.name+") is now in buying phase.\n");
            player2.buy_phase(the_board);
            System.out.println("\nPlayer 2 ("+player2.name+") is now in action phase.\n");
            player2.action_phase(the_board,player1);
            System.out.println("\nPlayer 2 ("+player2.name+") is now in clean-up phase.\n");
            player2.clean_up_phase();
            System.out.println("\nPrinting Player 2's ("+player2.name+") piles after clean-up phase.\n");
            player2.print_deck();
            player2.print_discard();
            player2.print_hand();
            player2.print_in_play();
            the_board.print_in_trash();
        }
    }

}
