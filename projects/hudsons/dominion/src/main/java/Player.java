import java.util.*;

/**
 * Created by samhudson on 2/8/17.
 */
class Player {
    String name;
    ArrayList<Card> hand;
    ArrayList<Card> deck;
    ArrayList<Card> discard;
    ArrayList<Card> in_play;


    Player(String name) {
        this.name = name;
        this.deck = new ArrayList<Card>();
        this.discard = new ArrayList<Card>();
        this.hand = new ArrayList<Card>();
        this.in_play = new ArrayList<Card>();

        for(int i=0; i<10; i++) {
            if(i<7) {
                this.deck.add(new TreasureCard("copper", "treasure", 0, 1));
            } else {
                this.deck.add(new VictoryCard("estate", "victory", 2, 1));
            }

        }
    }

    void shuffle_deck() {
        Collections.shuffle(this.deck);
    }
    void shuffle_discard() {
        Collections.shuffle(this.discard);
    }
    void shuffle_hand() {
        Collections.shuffle(this.hand);
    }
    void shuffle_in_play() {
        Collections.shuffle(this.in_play);
    }
    void print_deck() {
        System.out.println(this.name+"'s deck pile:");
        for(int i=0; i<this.deck.size();i++) {
            System.out.println("Position: "+i+" Card: "+this.deck.get(i).type+" "+this.deck.get(i).name);
        }
    }
    void print_discard() {
        System.out.println(this.name+"'s discard pile:");
        for(int i=0; i<this.discard.size();i++) {
            System.out.println("Position: "+i+" Card: "+this.discard.get(i).type+" "+this.discard.get(i).name);
        }
    }
    void print_in_play() {
        System.out.println(this.name+"'s in_play pile:");
        for(int i=0; i<this.in_play.size();i++) {
            System.out.println("Position: "+i+" Card: "+this.in_play.get(i).type+" "+this.in_play.get(i).name);
        }
    }
    void print_hand() {
        System.out.println(this.name+"'s hand pile:");
        for(int i=0; i<this.hand.size();i++) {
            System.out.println("Position: "+i+" Card: "+this.hand.get(i).type+" "+this.hand.get(i).name);
        }
    }
    /* TODO: could be a bug here if the discard pile is less than 5 */
    void draw_from_deck() {
        int withdraw_count, remaining_count = 0;
        if(this.deck.size()>=5) {
            withdraw_count = 5;
            for(int i=0; i<withdraw_count; i++) {
                this.hand.add(this.deck.get(this.deck.size() - 1));
                this.deck.remove(this.deck.size() - 1);
            }
        } else if(this.deck.size()<5 && this.deck.size()!=0){
            withdraw_count = this.deck.size();
            remaining_count = 5-this.deck.size();
            for(int i=0; i<withdraw_count; i++) {
                this.hand.add(this.deck.get(this.deck.size() - 1));
                this.deck.remove(this.deck.size() - 1);
            }
            shuffle_discard();
            for(int i=0; i<this.discard.size();i++) {
                this.deck.add(this.discard.get(this.discard.size() - 1));
                this.discard.remove(this.discard.size() - 1);
            }
            for(int i=0; i<remaining_count; i++) {
                this.hand.add(this.deck.get(this.deck.size() - 1));
                this.deck.remove(this.deck.size() - 1);
            }

        }
        else {
            withdraw_count = 5;
            shuffle_discard();
            for(int i=0; i<this.discard.size();i++) {
                this.deck.add(this.discard.get(this.discard.size() - 1));
                this.discard.remove(this.discard.size() - 1);
            }
            for(int i=0; i<withdraw_count; i++) {
                this.hand.add(this.deck.get(this.deck.size() - 1));
                this.deck.remove(this.deck.size() - 1);
            }
        }



    }
    ArrayList<Integer> in_hand(String type) {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for(int i=0; i<this.hand.size();i++) {
            if(this.hand.get(i).type==type)
                positions.add(i);
        }
        return positions;
    }
    ArrayList<Integer> in_play_by_name(String name) {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for(int i=0; i<this.in_play.size();i++) {
            if(this.in_play.get(i).name==name)
                positions.add(i);
        }
        return positions;
    }
    void action_phase(Board the_board, Player other_player) {
        //grabbing all the positions of type action card
        ArrayList<Integer> positions = in_hand("action");
        //check if there were positions
        if(positions.size() > 0) {
            //play action in hand at index of random select from positions array
            int position = random_range(0, positions.size()-1);
            //add random action card from hand into in play
            position = positions.get(position);
            this.in_play.add(this.hand.get(position));
            this.hand.remove(position);
            //play action card in play
            ActionCard action_card = (ActionCard) this.in_play.get(this.in_play.size()-1);
            System.out.println(this.name+" has selected action card: "+ action_card.name+".");
            action_card.play(this, other_player,the_board);


        } else {
            System.out.println(this.name+" you currently have no action cards in your hand.");
        }

    }
    void buy_phase(Board the_board) {
        //grabbing all the positions of type treasure card
        ArrayList<Integer> positions = in_hand("treasure");
        //check if there were positions
        if(positions.size() > 0) {
            int buying_power = 0;
            int iterations = random_range(1, positions.size());
            for(int i=0; i<iterations; i++) {
                int position = random_range(0, positions.size()-1);
                this.in_play.add(this.hand.get(positions.get(position)));
                buying_power += this.hand.get(positions.get(position)).value;
                this.hand.remove(positions.get(position));
                positions.remove(position);
            }
            System.out.println(this.name+" is choosing to spend total treasure value of: "+buying_power+".");
            //Let's scan the board for a something to buy within the chosen buying power.
            //Just a quick shuffle to guarantee selection randomness.
            the_board.shuffle_board();
            for(int i=0; i<the_board.on_board.size();i++) {
                if(the_board.on_board.get(i).cost<=buying_power && the_board.on_board.get(i).type!="curse") {
                    String name = the_board.on_board.get(i).name;
                    draw_from_board_to_discard(the_board,i);
                    break;
                }

            }

        } else {
            System.out.println(this.name+" you currently have no treasure cards in your deck.");
        }


    }
    void clean_up_phase() {

        int in_play_count = this.in_play.size();
        int hand_count = this.hand.size();
        //shuffle in_play because it can be discarded in any order
        shuffle_in_play();
        //adding to hand and in-play to discard
        for(int i=0; i<in_play_count;i++) {
            this.discard.add(this.in_play.get(i));
        }

        for(int i=0; i<hand_count;i++) {
            this.discard.add(this.hand.get(i));
        }
        //clear all elements from in_play & hand_count
        this.in_play.clear();
        this.hand.clear();

    }

    static int random_range(int min, int max) {
        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt(max+1-min)+min;
    }


    void draw_from_board_to_discard(Board the_board, int position) {
        System.out.println(this.name+" is drawing from the board card: \n type:  "+the_board.on_board.get(position).type+
                "\n name:  "+the_board.on_board.get(position).name+"\n cost:  "+the_board.on_board.get(position).cost+
                "\n value: "+the_board.on_board.get(position).value+"\n from position:"+position);
        this.discard.add(the_board.on_board.get(position));
        the_board.on_board.remove(position);
    }
    void draw_from_board_to_deck(Board the_board, int position) {
        System.out.println(this.name+" is drawing from the board card: \n type:  "+the_board.on_board.get(position).type+
                "\n name:  "+the_board.on_board.get(position).name+"\n cost:  "+the_board.on_board.get(position).cost+
                "\n value: "+the_board.on_board.get(position).value+"\n from position:"+position);
        this.deck.add(the_board.on_board.get(position));
        the_board.on_board.remove(position);
    }
    void draw_from_board_to_hand(Board the_board, int position) {
        System.out.println(this.name+" is drawing from the board card: \n type:  "+the_board.on_board.get(position).type+
                "\n name:  "+the_board.on_board.get(position).name+"\n cost:  "+the_board.on_board.get(position).cost+
                "\n value: "+the_board.on_board.get(position).value+"\n from position:"+position);
        this.hand.add(the_board.on_board.get(position));
        the_board.on_board.remove(position);
    }
    void draw_from_board_to_in_play(Board the_board, int position) {
        System.out.println(this.name+" is drawing from the board card: \n type:  "+the_board.on_board.get(position).type+
                "\n name:  "+the_board.on_board.get(position).name+"\n cost:  "+the_board.on_board.get(position).cost+
                "\n value: "+the_board.on_board.get(position).value+"\n from position:"+position);
        this.in_play.add(the_board.on_board.get(position));
        the_board.on_board.remove(position);
    }
    void draw_from_hand_to_deck(int position) {
        this.deck.add(this.hand.get(position));
        this.hand.remove(position);
    }
    void draw_from_deck_to_hand() {
        if(this.deck.size()==0) {
            this.draw_from_deck();
        }
        this.hand.add(this.deck.get(this.deck.size()-1));
        this.deck.remove(this.deck.size()-1);
    }

    void draw_from_hand_to_trash(Board the_board, int position) {
        the_board.in_trash.add(hand.get(position));
        this.hand.remove(position);

    }
    void draw_from_in_play_to_trash(Board the_board, int position) {
        the_board.in_trash.add(in_play.get(position));
        this.in_play.remove(position);

    }

    int calculate_victory() {
        int points = 0;
        for(int i=0;i<this.in_play.size();i++) {
            if(this.in_play.get(i).type=="victory" || this.in_play.get(i).type=="curse") {
                points = points + this.in_play.get(i).value;
            }

        }
        for(int i=0;i<this.hand.size();i++) {
            if(this.hand.get(i).type=="victory"|| this.hand.get(i).type=="curse") {
                points = points + this.hand.get(i).value;
            }

        }
        for(int i=0;i<this.discard.size();i++) {
            if(this.discard.get(i).type=="victory"|| this.discard.get(i).type=="curse") {
                points = points + this.discard.get(i).value;
            }

        }
        for(int i=0;i<this.deck.size();i++) {
            if(this.deck.get(i).type=="victory"|| this.deck.get(i).type=="curse") {
                points = points + this.deck.get(i).value;
            }

        }
        return points;
    }
    //TODO Sum victory cards ** remember that garden is special and counts for 1 point per 10 cards in deck.


}
