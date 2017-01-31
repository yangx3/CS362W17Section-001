public class Player {

    Deck drawDeck;
    Deck hand;
    Deck discard;

    //the name of the player
    String name;
    //number of actions the player has left in the turn
    int actions;
    //purchasing power of the players hand
    int value;
    //how many buys you can use
    int buys;

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
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
        buys = 0;
        name = "null";
        drawDeck.shuffle();
    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public Player(String playerName) {
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
        buys = 0;
        name = playerName;
        drawDeck.shuffle();
    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void showHand() {
        hand.printDeck();
    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void playCard(String cardName) {

    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void buy() {

    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            - Tries to draw a card when there are no more
    */
    public void draw() {
        if (!drawDeck.empty()) {
            //the hand is drawing a card from the drawCard deck
            hand.addCard(drawDeck.drawCard());
        }
    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void discard() {
        if (!hand.empty()) {
            //the discard deck is drawing from the hand
            discard.addCard(hand.drawCard());
        }
    }

    /*
        Description: draws a certain number of cards and adds it to hand
        Input:  number of cards to draw
        Output: none
        Potential Errors:
            - Draws more cards than are in the drawDeck
            - Number exceeds the number of cards in the deck
            - Number is negative
    */
    public void draw(int number) {
        for (int x = 0; x < number; x++) {
            draw();
        }
    }

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void recycle() {

    }

    public String getName() {return name;}
    public int getActions() {return actions;}
    public int getValues()  {return value;}
    public int getBuys()    {return buys;}

    public boolean hasActions() {
        if (actions > 0) {
            return true;
        }
        return false;
    }

    public boolean hasMoves() {
        if (actions > 0 || buys > 0) {
            return true;
        }
        return false;
    }
}
