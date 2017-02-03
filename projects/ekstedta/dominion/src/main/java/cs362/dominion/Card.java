package cs362.dominion;

public enum Card {
    // cost, score, coin value, is action
    Curse(0, -1, 0, false),
    Estate(2, 1, 0, false),
    Duchy(5, 3, 0, false),
    Province(8, 6, 0, false),

    Copper(0, 0, 1, false),
    Silver(3, 0, 2, false),
    Gold(6, 0, 3, false),

    // Required to implement:
    //
    // Adventurer
    // Ambassador
    // Baron
    // CouncilRoom
    // Cutpurse
    // Embargo
    // Feast
    // Gardens
    // GreatHall
    // Mine

    // My optional cards
    // Market
    // Smithy
    // Village

    // Base set
    Adventurer(6), /* If no/only 1 treasure found, stop when full deck seen */
    CouncilRoom(5),
    Feast(4), /* choice1 is supply # of card gained) */
    Gardens(4, 0, 0, false),
    Market(5),
    Mine(5), /* choice1 is hand# of money to trash, choice2 is supply# of money to put in hand */
    Smithy(4),
    Village(3),

    // Intrigue expansion
    Baron(4), /* choice1: boolean for discard of estate. Discard is always of first (lowest index) estate */
    GreatHall(3, 1, 0, true),

    // Seaside expansion
    Ambassador(3), /* choice1 = hand#, choice2 = number to return to supply */
    Cutpurse(4),
    Embargo(2); /* choice1 = supply# */

    int cost;
    int score;
    int coins;
    boolean isAction;

    Card(int cost) {
        this.cost = cost;
        this.score = 0;
        this.coins = 0;
        this.isAction = true;
    }

    Card(int cost, int score, int coins, boolean isAction) {
        this.cost = cost;
        this.score = score;
        this.coins = coins;
        this.isAction = isAction;
    }

    public int cost() { return this.cost; }
    public int score() { return this.score; }
    public int coins() { return this.coins; }
    public boolean isAction() { return this.isAction; }
    public boolean isTreasure() { return this.coins != 0; }
}
