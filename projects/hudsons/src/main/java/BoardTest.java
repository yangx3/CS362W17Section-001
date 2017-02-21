import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by samuelhudson on 2/13/17.
 */
public class BoardTest {
    @Test
    public void on_board() throws Exception {
        System.out.println("\nTesting on_board function\n");
        Board the_board = new Board();
        String item_we_know_on_board = "gardens";
        int position = the_board.on_board(item_we_know_on_board);
        assert(the_board.on_board.get(position).name==item_we_know_on_board);
        System.out.println("Test Passed: we found the item matching specified name on the board");

    }

    @Test
    public void on_board_by_value() throws Exception {
        System.out.println("\nTesting on_board_by_value function\n");
        Board the_board = new Board();
        int item_we_know_on_board = 3;
        int position = the_board.on_board_by_value(item_we_know_on_board);
        System.out.println(the_board.on_board.get(position).value);
        assert(the_board.on_board.get(position).value<=item_we_know_on_board);
        System.out.println("Test Passed: we found the item matching specified value on the board");


    }

    @Test
    public void time_to_end() throws Exception {
        System.out.println("\nTesting time_to_end() function\n");
        Board the_board = new Board();
        String item_we_know_on_board = "province";
        //Making the number of provinces equal to zero on the board.
        for(int i=0;i<8;i++) {
            int position = the_board.on_board(item_we_know_on_board);
            the_board.on_board.remove(position);
        }
        int result = the_board.time_to_end();
        assert(result==1);
        System.out.println("Test Passed: Ended when the number of provinces reached zero.");

    }


}