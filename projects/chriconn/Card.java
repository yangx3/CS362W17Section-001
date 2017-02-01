/*
    Required cards
    Money   - Gold, Silver, Copper
    Victory - Province, Dutchy, Estate
    Action  - Village, Smithy, Adventurer, Curse

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
        cards = 0;
        actions = 0;
        buys = 0;
        coins = 0;
    }

    public Card(String setName) {
        setName = setName.toLowerCase();

        switch (setName) {
            case "gold":
                name           =  "gold";
                value          =  3;
                cost           =  6;
                treasureCard = true;
                break;

            case "silver":
                name           =  "silver";
                value          =  2;
                cost           =  3;
                treasureCard = true;
                break;

            case "copper":
                name           =  "copper";
                value          =  1;
                cost           =  0;
                treasureCard = true;
                break;

            case "province":
                name          =  "province";
                cost          =  8;
                victoryPoints =  6;
                victoryCard = true;
                break;

            case "dutchy":
                name          =  "dutchy";
                cost          =  5;
                victoryPoints =  3;
                victoryCard = true;
                break;

            case "estate":
                name          =  "estate";
                cost          =  2;
                victoryPoints =  1;
                victoryCard = true;
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
                hasAction     =  true;
                cards         =  1;
                actions       =  1;
                buys          =  1;
                coins         =  1;
                break;

            case "curse":
                name          =  "curse";
                cost          =  0;
                victoryPoints =  -1;
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
    public boolean getHasAction()     {return hasAction;}
    public boolean isTreasureCard()   {return treasureCard;}
    public boolean isVictoryCard()    {return victoryCard;}
    public int getCards()             {return cards;}
    public int getActions()           {return actions;}
    public int getBuys()              {return buys;}
    public int getCoins()             {return coins;}

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
}
