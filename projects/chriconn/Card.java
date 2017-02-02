import java.util.*;

/*
    What I thought was required cards
    Money   - Gold, Silver, Copper
    Victory - Province, Dutchy, Estate
    Action  - Village, Smithy, Adventurer, Curse

    Required Cards:
    Adventurer
    Ambassador
    Baron
    Council room
    Cutpurse
    Embargo
    Feast
    Gardens
    Great hall
    Mine

    Custom cards
    Witch, Cellar, Market

Class Card
    Variables:
        Private:
            String  name;
            int     value;
            int     cost;
            int     victoryPoints;
            String  description;
            boolean hasAction;
            boolean treasureCard;
            boolean victoryCard;
            int     cards;
            int     actions;
            int     buys;
            int     coins;


    Functions:
        Private:

        Public:
            Card()
            Card(String setName)
            void      setName(String setName)
            void      setValue(int setValue)
            void      setCost(int setCost)
            void      setVictoryPoints(int setVictoryPoints)
            void      setDescription(String setDescription)
            void      setHasAction(boolean setHasAction)
            void      setCards(int setCards)
            void      setActions(int setActions)
            void      setBuys(int setBuys)
            void      setCoins(int setCoins)
            String    getName()
            int       getValue()
            int       getCost()
            int       getVictoryPoints()
            String    getDescription()
            boolean   getHasAction()
            boolean   isTreasureCard()
            boolean   isVictoryCard()
            int       getCards()
            int       getActions()
            int       getBuys()
            int       getCoins()
            void      printCard()



            Card():
                Description:
                Input:
                Output:
                Potential Errors:
                    -

            Card(String setName):
                Description:
                Input:
                Output:
                Potential Errors:
                    -

-- Descriptions for setters are removed, as they are fairly self explanitory --

            setName:
                Description: Sets the name of the card
                Input: A string name
                Output: None
                Potential Errors:
                    -

            setValue:
                Description: Sets the value that the card is worth when buying
                Input: An integer value
                Output: None
                Potential Errors:
                    - Negative numbers

            setCost:
                Description: Sets the value of the cost
                Input: An integer value
                Output: None
                Potential Errors:
                    - Negative numbers

            setVictoryPoints:
                Description: Sets the number of victory points the card has
                Input: An integer value
                Output: None
                Potential Errors:
                    - Negative numbers over 1

            setDescription:
                Input:
                Output:
                Potential Errors:
                    -

            setHasAction:
                Description: Sets the boolean value about whether the card
                             has an action or not
                Input:
                Output:
                Potential Errors:
                    -

            setCards:
                Input:
                Output:
                Potential Errors:
                    -

            setActions:
                Input:
                Output:
                Potential Errors:
                    -

            setBuys:
                Input:
                Output:
                Potential Errors:
                    -

            setCoins:
                Input:
                Output:
                Potential Errors:
                    -

            getName:
            getValue:
            getCost:
            getVictoryPoints:
            getDescription:
            getHasAction:
            isTreasureCard:
            isVictoryCard:
            getCards:
            getActions:
            getBuys:
            getCoins:


            printCard:
                Description:
                Input:
                Output:
                Potential Errors:
                    -
*/


public class Card {

    /* Basic card info */
    //the name of the card
    private String name;
    //if the card is a coin, it will have a value
    private int value;
    //all cards have a set cost
    private int cost;
    //if it is a victory card, it will have a victory point value
    private int victoryPoints;
    //some cards have some descriptions about specific rules
    private String description;

    /* Info about card type */
    //check to see if the card has actions (treasure and victory cards dont)
    private boolean hasAction;
    //check to see if the card is a treasure card
    private boolean treasureCard;
    //check to see if the card is a victory card
    private boolean victoryCard;

    private ArrayList<String> type;

    //Card action stats
    //Each of these stats will only be added to the user if they play the card

    //how many extra cards you may draw
    private int cards;
    //how many extra actions you may use
    private int actions;
    //how many extra buys you may have
    private int buys;
    //how many extra coins you may have
    private int coins;

    //The default constructor for the card
    public Card() {
        name = "null";
        value = 0;
        cost = 0;
        victoryPoints = 0;
        description = "null";
        hasAction = false;
        treasureCard = false;
        victoryCard = false;
        type = new ArrayList<String>();
        cards = 0;
        actions = 0;
        buys = 0;
        coins = 0;
    }

    public Card(String setName) {
        value = 0;
        cost = 0;
        victoryPoints = 0;
        description = "null";
        hasAction = false;
        treasureCard = false;
        victoryCard = false;
        type = new ArrayList<String>();
        cards = 0;
        actions = 0;
        buys = 0;
        coins = 0;
        setName = setName.toLowerCase();

        switch (setName) {
            case "gold":
                name           = "gold";
                value          = 3;
                cost           = 6;
                description    = "The silver card is a treasure card worth 3 coins";
                treasureCard   = true;
                type.add("treasure");
                break;

            case "silver":
                name           = "silver";
                value          = 2;
                cost           = 3;
                description    = "The silver card is a treasure card worth 2 coins";
                treasureCard   = true;
                type.add("treasure");
                break;

            case "copper":
                name           = "copper";
                value          = 1;
                cost           = 0;
                description    = "The silver card is a treasure card worth 1 coin";
                treasureCard   = true;
                type.add("treasure");
                break;

            case "province":
                name           =  "province";
                cost           =  8;
                victoryPoints  =  6;
                description    = "The province is 8 victory points";
                victoryCard    = true;
                type.add("victory");
                break;

            case "dutchy":
                name           =  "dutchy";
                cost           =  5;
                victoryPoints  =  3;
                description    = "The dutchy is 3 victory points";
                victoryCard    = true;
                type.add("victory");
                break;

            case "estate":
                name           =  "estate";
                cost           =  2;
                victoryPoints  =  1;
                description    = "The estate is 1 victory points";
                victoryCard    = true;
                type.add("victory");
                break;

            case "village":
                name           =  "village";
                cost           =  3;
                hasAction      =  true;
                cards          =  1;
                actions        =  2;
                description    = "The village card allows for two extra actions";
                type.add("action");
                break;

            case "smithy":
                name           =  "smithy";
                cost           =  4;
                hasAction      =  true;
                cards          =  3;
                description    = "The smithy card allows for three new cards";
                type.add("action");
                break;

            case "adventurer":
                name           =  "adventurer";
                cost           =  6;
                description    =  "Reveal cards from your deck until you recveal 2 treasure cards. Put those Treasure cards into your hand and discard the other realed cards.";
                hasAction      =  true;
                type.add("action");
                type.add("special action");
                break;

            case "witch":
                name           =  "witch";
                cost           =  5;
                description    =  "Each other player gains a Curse card.";
                hasAction      =  true;
                cards          =  2;
                type.add("action");
                type.add("attack");
                type.add("special action");
                break;

            case "cellar":
                name           =  "cellar";
                cost           =  2;
                description    =  "Discard any number of cards. +1 Card per card discarded.";
                hasAction      =  true;
                actions        =  1;
                type.add("action");
                type.add("special action");
                break;

            case "market":
                name           =  "market";
                cost           =  5;
                hasAction      =  true;
                cards          =  1;
                actions        =  1;
                buys           =  1;
                coins          =  1;
                description    = "Gives the player an extra card, coin, buy and action";
                type.add("action");
                break;

            case "curse":
                name           =  "curse";
                cost           =  0;
                victoryPoints  =  -1;
                description    = "Counts as a negative victory point";
                type.add("curse");
                break;

            case "ambassador":
                name           = "ambassador";
                cost           = 3;
                description    = "Reveal a card from your hand. Return up to 2 copies of it from your hand to the Supply. Then each other player gains a copy of it.";
                type.add("action");
                type.add("attack");
                type.add("special action");
                break;

            case "baron":
                name           = "baron";
                cost           = 4;
                value          = 4;
                description    = "You may discard an Estate card. If you do, +4 Coins. Otherwise, gain an Estate card.";
                type.add("action");
                type.add("special action");
                break;

            case "council room":
                name           = "council room";
                cost           = 5;
                cards          = 4;
                buys           = 1;
                description    = "Each other player draws a card";
                type.add("action");
                type.add("special action");
                break;

            case "cutpurse":
                name           = "cutpurse";
                cost           = 4;
                coins          = 2;
                description    = "Each other player discards a copper card (or reveals a hand with no copper)";
                type.add("action");
                type.add("attack");
                type.add("special action");
                break;

            case "embargo":
                name           = "embargo";
                cost           = 2;
                description    = "Trash for +2 coins. Put an Embargo token on top of a Supply pile. - A player gains a Curse card per Embargo token on that pile when a card is bought.";
                type.add("action");
                type.add("special action");
                break;

            case "feast":
                name           = "feast";
                cost           = 4;
                description    = "Trash this card. Gain a card costing up to 5 coins";
                type.add("action");
                type.add("special action");
                break;

            case "gardens":
                name           = "gardens";
                cost           = 4;
                description    = "Worth 1 victory for every 10 cards in your deck(rounded down)";
                type.add("victory");
                break;

            case "great hall":
                name           = "great hall";
                cost           = 3;
                cards          = 1;
                actions        = 1;
                description    = "Lets the player draw an extra card and have an extra action";
                type.add("action");
                type.add("victory");
                type.add("special action");
                break;

            case "mine":
                name           = "mine";
                cost           = 5;
                description    = "Trash a treasure card from your hand. Gain a treasure card costing up to 3 coins more and put that card in your hand";
                type.add("action");
                type.add("special action");
                break;

        }
    }

    /******************** Individual Settings ********************/

    public void setName(String setName)
    {name = setName;}
    public void setValue(int setValue)
    {value = setValue;}
    public void setCost(int setCost)
    {cost = setCost;}
    public void setVictoryPoints(int setVictoryPoints)
    {victoryPoints = setVictoryPoints;}
    public void setDescription(String setDescription)
    {description = setDescription;}
    public void setHasAction(boolean setHasAction)
    {hasAction = setHasAction;}


    public void setCards(int setCards) {
        cards = setCards;
        if (setCards > 0) {
            hasAction = true;
        }
    }

    public void setActions(int setActions) {
        actions = setActions;
        if (setActions > 0) {
            hasAction = true;
        }
    }

    public void setBuys(int setBuys) {
        buys = setBuys;
        if (setBuys > 0) {
            hasAction = true;
        }
    }

    public void setCoins(int setCoins) {
        coins = setCoins;
        if (setCoins > 0) {
            hasAction = true;
        }
    }
    /******************** End Individual Settings ********************/

    //getter functions for the contents of the class
    public String getName()           {return name;}
    public int getValue()             {return value;}
    public int getCost()              {return cost;}
    public int getVictoryPoints()     {return victoryPoints;}
    public String getDescription()    {return description;}
    public boolean isTreasureCard()   {return treasureCard;}
    public boolean isVictoryCard()    {return victoryCard;}
    public ArrayList<String> getType(){return type;}
    public int getCards()             {return cards;}
    public int getActions()           {return actions;}
    public int getBuys()              {return buys;}
    public int getCoins()             {return coins;}
    public boolean getHasAction() {
        for (int x = 0; x < type.size(); x++) {
            if (type.get(x).equals("action")) {
                return true;
            }
        }
        return false;
    }
    public boolean getSpecialAction() {
        for (int x = 0; x < type.size(); x++) {
            if (type.get(x).equals("special action")) {
                return true;
            }
        }
        return false;
    }

    //printing fuction for testing
    public void printCard() {
        System.out.println("Card Info:" +
        "\nName: " + name +
        "\nValue: " + value +
        "\nCost: " + cost +
        "\nVictory Points: " + victoryPoints +
        "\nDescription: " + description +
        "\nHas Action: " + hasAction +
        "\nTreasure Card: " + treasureCard +
        "\nVictory Card: " + victoryCard +
        "\nExtra Cards to Draw: " + cards +
        "\nExtra Actions: " + actions +
        "\nExtra buys: " + buys +
        "\nExtra Coins: " + coins +
        "\n");
    }
}
