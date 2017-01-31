/*
    Required cards
    Money   - Gold, Silver, Copper
    Victory - Province, Dutchy, Estate
    Action  - Village, Smithy, Adventurer, Curse

    Custom cards
    Witch, Cellar, Market
*/


public class Card {

    //the name of the card
    String name;
    //if the card is a coin, it will have a value
    int value;
    //all cards have a set cost
    int cost;
    //if it is a victory card, it will have a victory point value
    int victoryPoints;
    //some cards have some descriptions about specific rules
    String description;

    //check to see if the card has actions (treasure and victory cards dont)
    boolean hasAction;
    //how many extra cards you may draw
    int cards;
    //how many extra actions you may use
    int actions;
    //how many extra buys you may have
    int buys;
    //how many extra coins you will have that turn
    int coins;

    //The default constructor for the card
    public Card() {
        name = "null";
        value = 0;
        cost = 0;
        victoryPoints = 0;
        description = "null";
        hasAction = false;
        cards = 0;
        actions = 0;
        buys = 0;
        coins = 0;
    }

    //The custom constructor. Only really meant for testing
    public Card(String setName, int setValue, int setCost, int setVictoryPoints, String setDescription, boolean setHasAction, int setCards, int setActions, int setBuys, int setCoins) {
        name          =  setName;
        value         =  setValue;
        cost          =  setCost;
        victoryPoints =  setVictoryPoints;
        description   =  setDescription;
        hasAction     =  setHasAction;
        cards         =  setCards;
        actions       =  setActions;
        buys          =  setBuys;
        coins         =  setCoins;
    }


    public Card(String setName) {
        setName = setName.toLowerCase();

        switch (setName) {
            case "gold":
                name          =  "gold";
                value         =  3;
                cost          =  6;
                break;

            case "silver":
                name          =  "silver";
                value         =  3;
                cost          =  6;
                break;

            case "copper":
                name          =  "copper";
                value         =  3;
                cost          =  6;
                break;

            case "province":
                name          =  "province";
                cost          =  8;
                victoryPoints =  6;
                break;

            case "dutchy":
                name          =  "dutchy";
                cost          =  5;
                victoryPoints =  3;
                break;

            case "estate":
                name          =  "estate";
                cost          =  2;
                victoryPoints =  1;
                break;

            case "village":
                name          =  "village";
                cost          =  3;
                hasAction     =  true;
                cards         =  1;
                actions       =  2;
                break;

            case "smithy":
                name          =  "smithy";
                cost          =  4;
                hasAction     =  true;
                cards         =  3;
                break;

            case "adventurer":
                name          =  "adventurer";
                cost          =  6;
                description   =  "Reveal cards from your deck until you recveal 2 treasure cards.\nPut those Treasure cards into your hand and discard the other realed cards.";
                hasAction     =  true;
                break;

            case "witch":
                name          =  "witch";
                cost          =  5;
                description   =  "Each other player gains a Curse card.";
                hasAction     =  true;
                cards         =  2;
                break;

            case "cellar":
                name          =  "cellar";
                cost          =  2;
                description   =  "Discard any number of cards. +1 Card per card discarded.";
                hasAction     =  true;
                actions       =  1;
                break;

            case "market":
                name          =  "market";
                cost          =  5;
                description   =  "No description available";
                hasAction     =  true;
                cards         =  1;
                actions       =  1;
                buys          =  1;
                coins         =  1;
                break;

            case "curse":
                name          =  "curse";
                cost          =  0;
                description   =  "No description available";
                victoryPoints =  -1;
                break;
        }
    }

    /******************** Automatic Card Constructors ********************/

    /*******Treasure Cards*******/
    //gold
    public void buildGold() {
        name          =  "gold";
        value         =  3;
        cost          =  6;
        description   =  "No description available";
    }

    //silver
    public void buildSilver() {
        name          =  "silver";
        value         =  3;
        cost          =  6;
        description   =  "No description available";
    }

    //copper
    public void buildCopper() {
        name          =  "copper";
        value         =  3;
        cost          =  6;
        description   =  "No description available";
    }

    /*******Victory Cards*******/
    //province
    public void buildProvince() {
        name          =  "province";
        cost          =  8;
        victoryPoints =  6;
        description   =  "No description available";
    }

    //dutchy
    public void buildDutchy() {
        name          =  "dutchy";
        cost          =  5;
        victoryPoints =  3;
        description   =  "No description available";
    }

    //estate
    public void buildEstate() {
        name          =  "estate";
        cost          =  2;
        victoryPoints =  1;
        description   =  "No description available";
    }

    /*******Action Cards*******/
    //village
    public void buildVillage() {
        name          =  "village";
        cost          =  3;
        description   =  "No description available";
        hasAction     =  true;
        cards         =  1;
        actions       =  2;
    }

    //smithy
    public void buildSmithy() {
        name          =  "smithy";
        cost          =  4;
        description   =  "No description available";
        hasAction     =  true;
        cards         =  3;
    }

    //adventurer
    public void buildAdventurer() {
        name          =  "adventurer";
        cost          =  6;
        description   =  "Reveal cards from your deck until you recveal 2 treasure cards.\nPut those Treasure cards into your hand and discard the other realed cards.";
        hasAction     =  true;
    }

    //cellar
    public void buildWitch() {
        name          =  "witch";
        cost          =  5;
        description   =  "Each other player gains a Curse card.";
        hasAction     =  true;
        cards         =  2;
    }

    //witch
    public void buildCellar() {
        name          =  "cellar";
        cost          =  2;
        description   =  "Discard any number of cards. +1 Card per card discarded.";
        hasAction     =  true;
        actions       =  1;
    }

    //market
    public void buildMarket() {
        name          =  "market";
        cost          =  5;
        description   =  "No description available";
        hasAction     =  true;
        cards         =  1;
        actions       =  1;
        buys          =  1;
        coins         =  1;
    }

    public void buildCurse() {
        name          =  "curse";
        cost          =  0;
        description   =  "No description available";
        victoryPoints =  -1;
    }

    /******************** End Automatic Card Constructors ********************/


    /******************** Individual Settings ********************/

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void setName(String setName)
    {name = setName;}
    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void setValue(int setValue)
    {value = setValue;}
    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void setCost(int setCost)
    {cost = setCost;}
    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void setVictoryPoints(int setVictoryPoints)
    {victoryPoints = setVictoryPoints;}
    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void setDescription(String setDescription)
    {description = setDescription;}
    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    public void setHasAction(boolean setHasAction)
    {hasAction = setHasAction;}


    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
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

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    //getter functions for the contents of the class
    public String getName()        {return name;}
    public int getValue()          {return value;}
    public int getCost()           {return cost;}
    public int getVictoryPoints()  {return victoryPoints;}
    public String getDescription() {return description;}
    public boolean getHasAction()  {return hasAction;}
    public int getCards()          {return cards;}
    public int getActions()        {return actions;}
    public int getBuys()           {return buys;}
    public int getCoins()          {return coins;}

    /*
        Description: -
        Input:  -
        Output: -
        Potential Errors:
            -
    */
    //printing fuction for testing
    public void printCard() {
        System.out.println("Card Info:" +
        "\nName: " + name +
        "\nValue: " + value +
        "\nCost: " + cost +
        "\nVictory Points: " + victoryPoints +
        "\nDescription: " + description +
        "\nHas Action: " + hasAction +
        "\nExtra Cards to Draw: " + cards +
        "\nExtra Actions: " + actions +
        "\nExtra buys: " + buys +
        "\nExtra Coins: " + coins +
        "\n");
    }
}
