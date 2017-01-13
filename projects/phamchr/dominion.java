class dominionGame{

    //kingdom array
    int[] kingdom;

    //make gameState "struct" here
    private int numPlayers;
    private int[] supplyCount; //this will be needing to be init'd with treasuremap+1
    private int[] embargoTokens; //same as above but treasuremap-1
    private int outpostPlayed;
    private int outpostTurn;
    private int whoseTurn;
    private int phase;
    private int numActions;
    private int coins;
    private int numBuys;
    private int[][] hand; // maxplayers x maxhand
    private int[] handCount; //per player, hand count
    private int[][] deck; //maxplayers x maxdeck
    private int[] deckCount; //maxplayer
    private int[][] discard; //maxplayer x maxdeck
    private int[] discardCount; //maxplayers
    private int[] playedCards; //maxdeck
    private int playedCardCount;

    public dominionGame(){
        System.out.println("We be made boys.");
    }

    public static int compare(int a, int b){
        if (a > b){
            return 1;
        }
        if (a < b){
            return -1;
        }
        return 0;
    }

    public void kingdomCards(int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9, int k10){
        kingdom[0] = k1;
        kingdom[1] = k2;
        kingdom[2] = k3;
        kingdom[3] = k4;
        kingdom[4] = k5;
        kingdom[5] = k6;
        kingdom[6] = k7;
        kingdom[7] = k8;
        kingdom[8] = k9;
        kingdom[9] = k10;
    }

    public static void main(String[] args){
        dominionGame object = new dominionGame();
        System.out.println("We got past object making");
        object.kingdom = new int[10];
        object.kingdomCards(1,2,3,4,5,6,7,8,9,10);
        System.out.println(object.kingdom[1]);
    }
}