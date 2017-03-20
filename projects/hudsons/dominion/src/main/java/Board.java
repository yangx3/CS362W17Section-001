import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by samhudson on 2/8/17.
 */
class Board {
    ArrayList<Card> on_board;
    ArrayList<Card> in_trash;
    //constructing board
    Board(ArrayList<Card> kingdoms_in_play) {
        this.on_board = new ArrayList<Card>();
        this.in_trash = new ArrayList<Card>();
        //for random kingdoms that were selected
        for(int i=0; i<kingdoms_in_play.size();i++) {
            int r_size=0;
            if(kingdoms_in_play.get(i).type=="victory") {
                for(int j=0; j<8;j++)
                    this.on_board.add(new VictoryCard(kingdoms_in_play.get(i).name,kingdoms_in_play.get(i).type,
                            kingdoms_in_play.get(i).cost, kingdoms_in_play.get(i).value));
            }
            else {
                for(int j=0; j<10;j++)
                    this.on_board.add(new ActionCard(kingdoms_in_play.get(i).name,kingdoms_in_play.get(i).type,
                            kingdoms_in_play.get(i).cost, kingdoms_in_play.get(i).value));
            }

            }
        //8 victory cards for two players and 12 for more per pile
        for(int i=0; i<8; i++) {
            this.on_board.add(new VictoryCard("estate", "victory", 2, 1));
            this.on_board.add(new VictoryCard("duchy", "victory", 5, 3));
            this.on_board.add(new VictoryCard("province", "victory", 8, 6));
        }
        //curse cards per pile
        for(int i=0; i<10; i++)
            this.on_board.add(new CurseCard("curse", "curse", 0, -1));

        //60-14(distributed)=46 copper, 40 silver and 30 gold
        for(int i=0; i<116;i++) {

            if(i<46) {
                this.on_board.add(new TreasureCard("copper", "treasure", 0, 1));
            }
            else if(i>=46 && i<86) {
                this.on_board.add(new TreasureCard("silver", "treasure", 3, 2));
            }
            else {
                this.on_board.add(new TreasureCard("gold", "treasure", 6, 3));

            }

        }
    }
    //Check if card is on board then return position
    int on_board(String name) {
        for(int i=0; i<on_board.size();i++) {
            if(on_board.get(i).name==name)
                return i;
        }
        return -1;
    }
    int on_board_by_value(int value) {
        for(int i=0; i<this.on_board.size();i++) {
            if(this.on_board.get(i).value<=value)
                return i;
        }
        return -1;
    }
    int get_count_by_type(String type) {
        int count=0;
        for(int i=0;i<this.on_board.size();i++) {
            if(this.on_board.get(i).type==type) {
                count++;
            }
        }
        return count;
    }
    int get_count_by_name(String name) {
        int count=0;
        for(int i=0;i<this.on_board.size();i++) {
            if(this.on_board.get(i).name==name) {
                count++;
            }
        }
        return count;
    }
    void shuffle_board() {
        Collections.shuffle(this.on_board);
    }
    void print_board() {
        System.out.println("The Board:");
        for(int i=0; i<this.on_board.size();i++) {
            System.out.println("Position: "+i+" Card: "+this.on_board.get(i).type+" "+this.on_board.get(i).name);
        }
    }
    void print_in_trash() {
        System.out.println("What's in the trash?:");
        for(int i=0; i<this.in_trash.size();i++) {
            System.out.println("Position: "+i+" Card: "+this.in_trash.get(i).type+" "+this.in_trash.get(i).name);
        }
    }
    int time_to_end() {
        if(get_count_by_name("province")==0) {
            return 1;
        }
        else  if(get_count_by_type("treasure")==0) {
            return 1;
        } else if(get_count_by_type("victory")==0) {
            return 1;
        } else if(get_count_by_type("curse")==0) {
            return 1;
        }
        return 0;
    }


}

