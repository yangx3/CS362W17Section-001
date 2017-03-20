import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by samhudson on 2/8/17.
 */
class Card {
    String name;
    String type;
    int cost;
    int value;
}
class TreasureCard extends Card {

    TreasureCard(String name, String type, int cost, int value) {
        super();
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.value = value;

    }
}
class VictoryCard extends Card {
    VictoryCard(String name, String type, int cost, int value) {
        super();
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.value = value;
    }
}
class CurseCard extends Card {
    CurseCard(String name, String type, int cost, int value) {
        super();
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.value = value;
    }
}
class ActionCard extends Card {
    ActionCard(String name, String type, int cost, int value) {
        super();
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.value = value;
    }
    int play(Player the_player, Player other_player, Board the_board) {
        if(this.name=="adventurer") {
            return this.adventurer(the_player, other_player, the_board);
        }
        else if(this.name=="bureaucrat") {
            return this.bureaucrat(the_player,other_player,the_board);
        }
        else if(this.name=="cellar") {
            return this.cellar(the_player,other_player,the_board);
        }
        else if(this.name=="chancellor") {
            return this.chancellor(the_player,other_player,the_board);
        }
        else if(this.name=="chapel") {
            return this.chapel(the_player,other_player,the_board);
        }
        else if(this.name=="council_room") {
            return this.council_room(the_player,other_player,the_board);
        }
        else if(this.name=="feast") {
            return this.feast(the_player,other_player,the_board);
        }
        else if(this.name=="festival") {
            return this.festival(the_player,other_player,the_board);
        }
        else if(this.name=="laboratory") {
            return this.laboratory(the_player,other_player,the_board);
        }
        else if(this.name=="smithy") {
            return this.smithy(the_player,other_player,the_board);
        }
        else if(this.name=="market") {
            return this.market(the_player,other_player,the_board);
        }
        else if(this.name=="village") {
            return this.village(the_player,other_player,the_board);
        }
        else {
            System.out.println("Action card doesn't exist.");
            return 0;

        }

    }
    int adventurer(Player the_player, Player other_player, Board the_board) {
        System.out.println("\nPlaying adventurer card.\n");
        int deck_size = the_player.deck.size();
        int treasure_found = 0;
        for(int i=0; i<deck_size; i++) {
            if(the_player.deck.get(i).type=="treasure") {
                System.out.println("Position: "+i+" Found Treasure: "+the_player.deck.get(i).name);
                the_player.hand.add(the_player.deck.get(i));
                the_player.deck.remove(i);
                i=i-1;
                treasure_found++;
            } else {
                System.out.println("Position: "+i+" Not Treasure: "+the_player.deck.get(i).name);
                the_player.discard.add(the_player.deck.get(i));
                the_player.deck.remove(i);
                i=i-1;
            }
            if(treasure_found==2)
                break;

        }
        return treasure_found;
    }
    int bureaucrat(Player the_player, Player other_player, Board the_board) {
        int action_count = 0;
        System.out.println("\nPlaying bureaucrat card.\n");
        int position = the_board.on_board("silver");
        if(position!=-1)
            the_player.draw_from_board_to_deck(the_board, position);
        action_count++;
        ArrayList<Integer> positions = other_player.in_hand("victory");
        if(positions.size()>0) {
            position = positions.get(0);
            other_player.draw_from_hand_to_deck(position);
            action_count++;
        }
        return action_count;
    }
    int cellar(Player the_player, Player other_player, Board the_board) {
        int action_count = 1;
        System.out.println("\nPlaying cellar card.\n");
        the_player.action_phase(the_board, other_player);
        if(the_player.deck.size()>=the_player.hand.size()) {
            int hand_size = the_player.hand.size();
            int number_to_discard = the_player.random_range(1, hand_size);
            for (int i = 0; i < number_to_discard; i++) {
                the_player.discard.add(the_player.hand.get(i));
                the_player.draw_from_deck_to_hand();
            }
            action_count++;
        }
        return action_count;
    }
    int chancellor(Player the_player, Player other_player, Board the_board) {
        int action_count = 0;
        System.out.println("\nPlaying chancellor card.\n");
        for(int i=0;i<2;i++) {
            int position = the_board.on_board("copper");
            if (position > 0) {
                the_player.draw_from_board_to_discard(the_board, position);

            }
        }
        int should_i = the_player.random_range(0,1);
        if(should_i==1) {
            int deck_count = the_player.deck.size();
            for (int i = 0; i < deck_count; i++) {
                the_player.discard.add(the_player.deck.get(i));
            }
            the_player.deck.clear();
            action_count++;
        }
        return action_count;
    }
    int chapel(Player the_player, Player other_player, Board the_board) {
        int action_count = 1;
        System.out.println("\nPlaying chapel card.\n");
        int up_to = the_player.random_range(1,4);
        for(int i=0;i<up_to;i++) {
            if(the_player.hand.size()>=1) {
                int position = the_player.random_range(0, the_player.hand.size() - 1);
                the_player.draw_from_hand_to_trash(the_board, position);
            }

        }

        return action_count;
    }
    int council_room(Player the_player, Player other_player, Board the_board) {
        int action_count = 3;
        System.out.println("\nPlaying council_room card.\n");
        for(int i=0;i<4;i++) {
            the_player.draw_from_deck_to_hand();
        }
        the_player.buy_phase(the_board);
        other_player.draw_from_deck_to_hand();
        return action_count;
    }
    int feast(Player the_player, Player other_player, Board the_board) {
        int action_count = 2;
        System.out.println("\nPlaying feast card.\n");
        the_player.print_in_play();
        System.out.println(the_player.in_play_by_name("feast"));
        int position = the_player.in_play_by_name("feast").get(0);
        the_player.draw_from_in_play_to_trash(the_board,position);
        position = the_board.on_board_by_value(5);
        the_player.draw_from_board_to_deck(the_board, position);
        return action_count;
    }
    int festival(Player the_player, Player other_player, Board the_board) {
        int action_count = 3;
        System.out.println("\nPlaying festival card.\n");
        for(int i=0; i<2;i++) {
            the_player.action_phase(the_board,other_player);
        }
        the_player.buy_phase(the_board);
        for(int i=0;i<2;i++) {
            int position = the_board.on_board("copper");
            if (position > 0) {
                the_player.draw_from_board_to_discard(the_board, position);

            }
        }

        return action_count;
    }
    int laboratory(Player the_player, Player other_player, Board the_board) {
        int action_count = 2;
        System.out.println("\nPlaying laboratory card.\n");
        for(int i=0;i<2;i++) {
            the_player.draw_from_deck_to_hand();
        }
        the_player.action_phase(the_board,other_player);
        return action_count;
    }
    int smithy(Player the_player, Player other_player, Board the_board) {
        int action_count = 1;
        System.out.println("\nPlaying smithy card.\n");
        for(int i=0;i<3;i++) {
            the_player.draw_from_deck_to_hand();
        }
        return action_count;
    }
    int market(Player the_player, Player other_player, Board the_board) {
        int action_count = 4;
        System.out.println("\nPlaying market card.\n");
        //+1 Card
        the_player.draw_from_deck_to_hand();
        //+1 Action
        the_player.action_phase(the_board,other_player);
        //+1 Buy
        the_player.buy_phase(the_board);
        //+1 Copper
        int position = the_board.on_board("copper");
        if (position > 0) {
            the_player.draw_from_board_to_discard(the_board, position);

        }

        return action_count;
    }
    int village(Player the_player, Player other_player, Board the_board) {
        int action_count = 3;
        System.out.println("\nPlaying village card.\n");
        //+1 Card
        the_player.draw_from_deck_to_hand();
        //+2 Action
        for(int i=0;i<2;i++)
            the_player.action_phase(the_board,other_player);

        return action_count;
    }


}