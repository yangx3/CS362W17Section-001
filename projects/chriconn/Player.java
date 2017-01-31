public class Player {

    Deck drawDeck;
    Deck hand;
    Deck discard;

    //number of actions the player has left in the turn
    int actions;
    //purchasing power of the players hand
    int value;
    //how many buys you can use
    int buys;

    public Player() {
        //build the starter deck
        drawDeck = new Deck("starter");
        //build an empty hand
        hand = new Deck();
        //build and empty discard pile
        discard = new Deck();

        //both the actions of the player start with 0
        //the game should add and remove action ammounts
        actions = 0;
        value = 0;
        buy = 0;

        drawDeck.printDeck();
    }

    public void showHand() {
        hand.printDeck();
    }

    public void playCard() {

    }

    public void buy() {

    }

    public void draw() {

    }

    public void discard() {

    }


}
