import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by samuelhudson on 2/13/17.
 */
public class CardTest {
    @Test
    public void testingAdventurerAction() {
        System.out.println("\nTesting Adventurer Action\n");
        randomTester test = new randomTester();
        Board the_board = new Board(test.kingdoms_in_play);
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        int treasure_found = 0;
        test_player.shuffle_deck();
        test_player.draw_from_deck();
        ActionCard action_card = new ActionCard("adventurer", "action", 6, 0);
        System.out.println("\nPrinting Piles Before\n");
        test_player.print_deck();
        test_player.print_discard();
        test_player.print_hand();
        test_player.print_in_play();
        //initial pile counts
        int i_deck_count = test_player.deck.size();
        int i_hand_count = test_player.hand.size();
        int i_discard_count = test_player.discard.size();

        treasure_found = action_card.play(test_player, other_player, the_board);
        System.out.println("\nPrinting Piles After\n");
        test_player.print_deck();
        test_player.print_discard();
        test_player.print_hand();
        test_player.print_in_play();
        if(treasure_found==0) {
            /*assert(test_player.discard.size()==i_deck_count+i_discard_count);*/
            assert(test_player.hand.size()==i_hand_count);
        }
        else if(treasure_found==1) {
            /*assert(test_player.discard.size()==(i_deck_count-1)+i_discard_count);*/
            assert(test_player.hand.size()==i_hand_count+1);
        }
        else if(treasure_found==2) {
            System.out.println("initial deck count: "+i_deck_count);
            System.out.println("initial discard count: "+i_discard_count);
            System.out.println("current discard count: "+test_player.discard.size());

            /*assert(test_player.discard.size()==(i_deck_count-2)+i_discard_count);*/
            assert(test_player.hand.size()==i_hand_count+2);
        }


    }
    @Test
    public void testingCellarAction() {
        System.out.println("\nTesting Cellar Action\n");
        randomTester test = new randomTester();
        Board the_board = new Board(test.kingdoms_in_play);
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        int action_count = 0;
        test_player.shuffle_deck();
        test_player.draw_from_deck();
        ActionCard action_card = new ActionCard("cellar", "action", 2, 0);
        int pos = the_board.on_board("cellar");
        test_player.draw_from_board_to_hand(the_board, pos);
        System.out.println("\nPrinting Piles Before\n");
        test_player.print_deck();
        test_player.print_discard();
        test_player.print_hand();
        test_player.print_in_play();
        //initial pile counts
        int i_deck_count = test_player.deck.size();
        int i_hand_count = test_player.hand.size();
        int i_discard_count = test_player.discard.size();

        action_count = action_card.play(test_player, other_player, the_board);
        System.out.println("\nPrinting Piles After\n");
        test_player.print_deck();
        test_player.print_discard();
        test_player.print_hand();
        test_player.print_in_play();



    }
    @Test
    public void testingFeastAction() {
        System.out.println("\nTesting Feast Action\n");
        randomTester test = new randomTester();
        Board the_board = new Board(test.kingdoms_in_play);
        Player test_player = new Player("John Doe");
        Player other_player = new Player("Smith Jones");
        int action_count = 0;
        test_player.shuffle_deck();
        test_player.draw_from_deck();
        ActionCard action_card = new ActionCard("feast", "action", 4, 0);
        int pos = the_board.on_board("feast");
        test_player.draw_from_board_to_in_play(the_board, pos);
        System.out.println("\nPrinting Piles Before\n");
        test_player.print_deck();
        test_player.print_discard();
        test_player.print_hand();
        test_player.print_in_play();
        //initial pile counts
        int i_deck_count = test_player.deck.size();
        int i_hand_count = test_player.hand.size();
        int i_discard_count = test_player.discard.size();

        action_count = action_card.play(test_player, other_player, the_board);
        System.out.println("\nPrinting Piles After\n");
        test_player.print_deck();
        test_player.print_discard();
        test_player.print_hand();
        test_player.print_in_play();
        the_board.print_in_trash();



    }

}