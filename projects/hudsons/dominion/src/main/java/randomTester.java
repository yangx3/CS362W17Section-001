import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by samuelhudson on 2/27/17.
 */
public class randomTester {
    ArrayList<Player> random_players;
    ArrayList<Card> kingdoms_in_play;
    randomTester() {
        this.random_players = new ArrayList<Player>();
        this.kingdoms_in_play = new ArrayList<Card>();
        //Creating random players
        int number_of_players = this.random_range(2,4);
        System.out.println("number_of_players: "+number_of_players);
        for(int i=0;i<number_of_players;i++) {
            String name = "Player "+Integer.toString(i+1);
            this.random_players.add(new Player(name));
            System.out.println(this.random_players.get(i).name);
        }
        //Creating random kingdom cards
        this.kingdoms_in_play = random_kingdoms();
        for(int i=0;i<10;i++) {
            System.out.println(this.kingdoms_in_play.get(i).name);
        }

    }

    public static void main(String args[]) {
        randomTester test = new randomTester();
        Board the_board = new Board(test.kingdoms_in_play);
        for(int i=0;i<the_board.on_board.size();i++) {
            System.out.println(the_board.on_board.get(i).name);
        }

        //Shuffling the players decks
        for(int i=0;i<test.random_players.size();i++) {
            test.random_players.get(i).shuffle_deck();
        }


        //play
        for(int i=0;i<10000;i++) {
            if(the_board.time_to_end()==1) {
                ArrayList<Integer> victory_list =  new ArrayList<Integer>();
                for(int is=0; is<test.random_players.size();is++) {
                    victory_list.add(test.random_players.get(is).calculate_victory());
                }
                int winner_position=victory_list.indexOf(Collections.max(victory_list));
                System.out.println(test.random_players.get(winner_position).name+" has won with: "+victory_list.get(winner_position)+" points!");
                break;
            }
            System.out.println("\n\nRound Number:"+(i+1)+"\n\n");
            //Cycling through players in list
            for(int is2=0;is2<test.random_players.size();is2++) {
                System.out.println(the_board.on_board.size());
                //System.out.println("\nIt's "+test.random_players.get(is2).name+"'s turn\n");
                //System.out.println("\n"+test.random_players.get(is2).name+"'s result after draw\n");
                test.random_players.get(is2).draw_from_deck();
                test.random_players.get(is2).print_hand();
                //System.out.println("\n" + test.random_players.get(is2).name + " is now in buying phase.\n");
                test.random_players.get(is2).buy_phase(the_board);
                //System.out.println("\n" + test.random_players.get(is2).name + " is now in action phase.\n");
                //Let's randomize the to player to act upon.
                int opponent = is2;
                while(opponent==is2) {
                    opponent = Player.random_range(0, test.random_players.size()-1);
                }
                //System.out.println(opponent);
                test.random_players.get(is2).action_phase(the_board, test.random_players.get(opponent));
                //System.out.println("\n" + test.random_players.get(is2).name + " is now in clean-up phase.\n");
                test.random_players.get(is2).clean_up_phase();
                //System.out.println("\nPrinting " + test.random_players.get(is2).name + "'s piles after clean-up phase.\n");
                test.random_players.get(is2).print_deck();
                test.random_players.get(is2).print_discard();
                test.random_players.get(is2).print_hand();
                test.random_players.get(is2).print_in_play();
                the_board.print_in_trash();
            }
        }
    }
    static ArrayList<Card> random_kingdoms() {
        //Creating kingdom card list
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ArrayList<Card> all_kingdom_cards = new ArrayList<Card>();
        ArrayList<Card> selected_kingdom_cards = new ArrayList<Card>();

        //adding all kingdom cards
        all_kingdom_cards.add(new VictoryCard("gardens", "victory", 4, 1));
        all_kingdom_cards.add(new ActionCard("adventurer", "action", 6, 0));
        all_kingdom_cards.add(new ActionCard("bureaucrat", "action", 4, 0));
        all_kingdom_cards.add(new ActionCard("cellar", "action", 2, 0));
        all_kingdom_cards.add(new ActionCard("chancellor", "action", 3, 0));
        all_kingdom_cards.add(new ActionCard("chapel", "action", 2, 0));
        all_kingdom_cards.add(new ActionCard("council_room", "action", 5, 0));
        all_kingdom_cards.add(new ActionCard("feast", "action", 4, 0));
        all_kingdom_cards.add(new ActionCard("festival", "action", 5, 0));
        all_kingdom_cards.add(new ActionCard("laboratory", "action", 5, 0));
        all_kingdom_cards.add(new ActionCard("smithy", "action", 5, 0));
        all_kingdom_cards.add(new ActionCard("market", "action", 5, 0));
        all_kingdom_cards.add(new ActionCard("village", "action", 4, 0));
        //creating random list of 13
        for (int i = 0; i < 13; i++)
            ids.add(i);
        Collections.shuffle(ids,new Random(10));

        for (int i = 0; i < 10; i++)
            selected_kingdom_cards.add(all_kingdom_cards.get(ids.get(i)));
        return selected_kingdom_cards;
    }
    static int random_range(int min, int max) {
        Random rand = new Random(10);
        return rand.nextInt(max+1-min)+min;
    }
}
