/*
Class Player
    Variables:
        Private:
            Deck drawDeck
            Deck hand
            Deck discard

            String  name
            int     actions
            int     value
            int     buys

    Functions:
        Private:

        Public:
            void    showHand()
            void    playCard(String)
            void    buy()
            void    draw()
            void    discard()
            void    draw(int)
            void    recycle()
            String  getName()
            int     getActions()
            int     getValues()
            int     getBuys()
            boolean hasActions()
            boolean hasMoves()


        ShowHand:


        PlayCard:


        Buy:


        Draw:


        Discard:


        Draw:
            Description: draws a certain number of cards and adds it to hand
            Input:  number of cards to draw
            Output: none
            Potential Errors:
                - Draws more cards than are in the drawDeck
                - Number exceeds the number of cards in the deck
                - Number is negative

        Recycle:


        GetName:


        GetActions:


        GetValues:


        GetBuys:


        HasActions:


        HasMoves:

*/

public class Player {

    public Deck drawDeck;
    public Deck hand;
    public Deck discard;

    //the name of the player
    private String name;
    //number of actions the player has left in the turn
    private int actions;
    //purchasing power of the players hand
    private int value;
    //how many buys you can use
    private int buys;

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

    public Player(String playerName) {
        drawDeck = new Deck("starter");
        hand = new Deck();
        discard = new Deck();
        actions = 0;
        value = 0;
        buys = 0;
        name = playerName;
        drawDeck.shuffle();
    }

    public void showHand() {
        hand.printDeck();
    }

    public boolean playCard(String cardName) {
        if (hand.indexOf(cardName) >= 0) {
            Card temp = new Card(cardName);
            if (!temp.getHasAction()) {
                System.out.println("Error. " + cardName + " is not an action card.");
                return false;
            }
            else {
                applyCardActions(temp);
                discard(cardName);
                decrementActions();
                return true;
            }
        }
        else {
            System.out.println("Error. That card does not exist");
            return false;
        }
    }

    public String getMoves() {
        return "You have:\n\t" + actions + " action(s)\n\t" + buys + " pruchase(s)\n\t" + value + " coin(s)";
    }

    public void buy(Deck type) {
        discard.addCard(type.drawCard());
    }

    public Card draw() {
        if (drawDeck.empty()) {
            recycle();
        }
        //the hand is drawing a card from the drawCard deck
        Card temp = drawDeck.drawCard();
        hand.addBottomCard(temp);
        return temp;
    }

    public void discard() {
        if (!hand.empty()) {
            //the discard deck is drawing from the hand
            discard.addCard(hand.drawCard());
        }
    }

    public void discard(String cardName) {
        discard.addCard(hand.drawCard(cardName));
    }

    public void discardAll() {
        while (!hand.empty()) {
            discard.addCard(hand.drawCard());
        }
    }

    public void draw(int number) {
        for (int x = 0; x < number; x++) {
            draw();
        }
    }

    public void recycle() {
        while (!discard.empty()) {
            drawDeck.addCard(discard.drawCard());
        }
        drawDeck.shuffle();
    }

    public String getName() {return name;}
    public int getActions() {return actions;}
    public int getValues()  {return value;}
    public int getBuys()    {return buys;}

    public boolean hasActions() {
        if (actions > 0 && hand.hasActions()) {
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

    public void applyCardActions(Card card) {
        actions += card.getActions();
        value += card.getValue();
        buys += card.getBuys();
        if (card.getCards() > 0) {
            draw(card.getCards());
        }
        if (card.getSpecialAction()) {
            if (card.getName().equals("adventurer")) {
                int numTreasures = 0;
                if (drawDeck.indexOf("tresure") >= 0) {
                    System.out.println(drawDeck.indexOf("tresure"));
                    printAllDecks();
                }
            }
        }
    }

    public void starterPoints() {
        actions = 1;
        buys = 1;
        value = 0;
    }

    public void sumTreasure() {
        for (int x = 0; x < hand.numCards(); x++) {
            if (hand.cardInfo(x).isTreasureCard()) {
                value += hand.cardInfo(x).getValue();
            }
        }
    }

    public boolean handContainsActions() {
        return hand.hasActions();
    }

    public void endTurn() {
        buys = 0;
        actions = 0;
        value = 0;
    }

    public void printHandType(String type) {
        hand.printType(type);
    }

    public void skipActionsPhase() {
        actions = 0;
    }

    public void decrementActions() {
        actions = actions - 1;
    }

    public void printAllDecks() {
        String name = getName();
        System.out.println("\n" + name + "'s draw deck: ");
        drawDeck.printDeck();
        System.out.println("\n" +  name + "'s hand:");
        showHand();
        System.out.println("\n" + name + "'s discarded deck: ");
        discard.printDeck();
    }
}
