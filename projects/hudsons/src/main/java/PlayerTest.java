import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by samuelhudson on 2/13/17.
 */
public class PlayerTest {
    @Test
    public void action_phase() throws Exception {
        System.out.println("\nTesting Action Phase\n");
        Board the_board = new Board();
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        test_player.shuffle_deck();
        test_player.draw_from_deck();
        ActionCard action_card = new ActionCard("cellar", "action", 2, 0);
        int pos = the_board.on_board("cellar");
        test_player.draw_from_board_to_hand(the_board, pos);
        int initial_discard = test_player.discard.size();
        ArrayList<Integer> positions = test_player.in_hand("action");
        /*If there are action cards in the players hand then the after this phase then
        the discard pile should be greater.
         */
        if(positions.size()>0) {
            test_player.action_phase(the_board, other_player);
            assert (test_player.discard.size() > initial_discard);
            System.out.println("Test Passed: The discard size is now larger.");
        } else {
            assert (test_player.discard.size()==initial_discard);
            System.out.println("Test Passed: The discard size is the same.");
        }


    }

    @Test
    public void buy_phase() throws Exception {
        System.out.println("\nTesting Buy Phase\n");
        Board the_board = new Board();
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        int pos = the_board.on_board("copper");
        test_player.draw_from_board_to_hand(the_board, pos);
        pos = the_board.on_board("copper");
        test_player.draw_from_board_to_hand(the_board, pos);
        //The player should now only have a buying power of 2.
        test_player.buy_phase(the_board);
        //Total value in discard should only be 2
        int cost_count=0;
        for(int i=0;i<test_player.discard.size();i++) {
            cost_count=cost_count+test_player.discard.get(i).cost;
        }
        System.out.println("Cost count:"+ cost_count);
        assert(cost_count<=2);

    }

    @Test
    public void clean_up_phase() throws Exception {
        System.out.println("\nTesting Clean_Up Phase\n");
        Board the_board = new Board();
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        test_player.shuffle_deck();
        test_player.draw_from_deck();
        test_player.buy_phase(the_board);
        test_player.action_phase(the_board,other_player);
        test_player.clean_up_phase();
        assert(test_player.in_play.size()==0);
        System.out.println("Test Passed: In Play pile is empty");
        assert(test_player.hand.size()==0);
        System.out.println("Test Passed: Hand pile is empty");
        assert(test_player.discard.size()>0);
        System.out.println("Test Passed: Discard pile is not empty");

    }

    @Test
    public void calculate_victory() throws Exception {
        System.out.println("\nTesting Calculate Victory Phase\n");
        System.out.println("\nTesting Buy Phase\n");
        Board the_board = new Board();
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        int pos = the_board.on_board("province");
        test_player.draw_from_board_to_hand(the_board, pos);
        pos = the_board.on_board("province");
        test_player.draw_from_board_to_in_play(the_board, pos);
        pos = the_board.on_board("province");
        test_player.draw_from_board_to_deck(the_board, pos);
        pos = the_board.on_board("province");
        test_player.draw_from_board_to_discard(the_board, pos);

        //The player should now have 24 + 3 initial victory points
        int points = test_player.calculate_victory();
        assert(points==27);
        System.out.println("Test Passed: Player has the right amount of victory points!");

    }

}