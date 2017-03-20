/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominion;

/**
 *
 * @author Regex
 */
public class RandomTestDominion {
    public static void main(String[] args) {        
        Dominion API = new Dominion();
        int[] k = new int[]{Card.adventurer.ordinal(), Card.gardens.ordinal(), 
                Card.embargo.ordinal(), Card.village.ordinal(), Card.minion.ordinal(), 
                Card.mine.ordinal(), Card.cutpurse.ordinal(), Card.sea_hag.ordinal(), 
                Card.tribute.ordinal(), Card.smithy.ordinal()};

        System.out.println("Starting game");
        
        
        // adjusting the # nextInt() calls directly below gets us different seeds
        API.rand.nextInt();
        API.rand.nextInt();
        API.rand.nextInt();
        API.rand.nextInt();
        API.rand.nextInt();
        API.rand.nextInt();
        API.rand.nextInt();
        
        //iniialize game - between 2 and 4 players
        GameState Game = API.initializeGame(API.rand.nextInt(3)+2,k,0);
        //GameState Game = API.initializeGame(4,k,0);
        while (API.isGameOver(Game) == 0){
            // reset variables
            int who = Game.whoseTurn;
            int p = who;
            System.out.println("Player " + (who +1)  + "'s Turn ");
            
            // action            

            // check if playable card in hand
            // play it and check if predicted effects occured
            
                // reset back to initial state
                
                int failureExpected = 0;
                int expectedReturn = 0;
                int expectedBuys = 1;
                int expectedActions = 0;
                int expectedCoins = Game.coins;
                int handPos = 0;
                boolean noCard = false;
                boolean keepCoins = false;
                int choice1 = 0;
                int choice2 = 0;
                int choice3 = 0;
                int[] expectedEmbargo = new int[Card.treasure_map.ordinal()];
                for (int i = Card.curse.ordinal(); i < Card.treasure_map.ordinal(); ++i)
                    expectedEmbargo[i] = Game.embargoTokens[i];
                
                boolean suppress = false;
                
                int[] expectedHandCounts = new int[Game.numPlayers];
                int[] expectedDeckCounts = new int[Game.numPlayers];
                int[] expectedDiscardCounts = new int[Game.numPlayers];
                int expectedPlayed = 1;
                for (int i = 0; i < Game.numPlayers; ++i){
                    expectedHandCounts[i] = Game.handCount[i];
                    expectedDeckCounts[i] = Game.deckCount[i];
                    expectedDiscardCounts[i] = Game.discardCount[i];
                }
                expectedHandCounts[p] = Game.handCount[p]-1;
                
                // while haven't found card and haven't reached end of hand
                    // check if is card we can use
                        // if so make predictions
                boolean findingCard = true;
                while (findingCard){   
                    int choiceOne = API.rand.nextInt(Card.treasure_map.ordinal()); 
                    int choiceTwo = API.rand.nextInt(Card.treasure_map.ordinal());
                    int choiceThree = API.rand.nextInt(Card.treasure_map.ordinal());                   
                    
                    // this is where we make predictions for each type of card
                    switch (Card.values()[Game.hand[p][handPos]]) {
                        // adventurer: keep drawing and discarding cards until you find 2 treasure cards
                                // discard should increase by the number of non-treasure cards drawn (can't predict which/how many ahead of time- might shuffle)
                                // hand will end up with 2 more copper, silver, or gold so long as there were that many in deck to begin with
                                // deck should decrease by amount gained by hand and by the opposite of how much the discard lost
                                // does this loop infinitely if we have fewer than 2 treasure in deck+discard to start with? 
                        case adventurer:
                            // we can't actually predict this without redoing the code, basically. 
                            suppress = true;
                            findingCard = false;
                            break;
                        // ambassador - return at most 2 coppies of a card from hand to supply, and all opponents gain a copy of that card. If supply empty then cards given out via turn order starting with next player
                                // supply should change by +amount decided to discard -#other players
                                        // unless expected supply would be negative, then it should decrease to 0
                                // returns -1 if player doesn't have enough to discard
                        case ambassador:
                            choice1 = API.getRandomCard();
                            choice2 = API.rand.nextInt()%3;
                            int countCards = 0;
                            if (choice2 < 0 || choice2 > 2)
                                failureExpected = -1;
                            else {
                                for (int h = 0; h < Game.handCount[p]; h++)
                                    if (h != handPos && h == Game.hand[p][choice1] && h != choice1)
                                        countCards++;
                            }
                            if (countCards < choice2)
                                failureExpected = -1;
                            if (failureExpected != -1){
                                //Game.supplyCount[choice1] += choice2;
                                for (int player = 0; player < Game.numPlayers; ++player)
                                    if (player != p)
                                        expectedDiscardCounts[player]++;
                            }
                            
                                
                                
                            findingCard = false;
                            break;
                        // Barron - either discard an estate for +4 coins or if you don't have an estate, gain an estate.
                                // if player has estate cards in hand, then
                                        // coins should increase by 4 and hand should decrease by one estate 
                                // discard should increase by one estate regardless
                        case baron:
                            expectedBuys += 1;
                            boolean hasEstate = false;
                            for (int h =0; h < Game.handCount[p]; ++h)
                                if (Game.hand[p][h] == Card.estate.ordinal())
                                    hasEstate = true;
                            if (hasEstate == true){
                                choice1 = 1;
                                expectedCoins += 4;
                                
                            }
                            else {
                                choice1 = 0;
                                API.gainCard(Card.estate.ordinal(),Game,0,p);
                                expectedDiscardCounts[p] +=2;
                                expectedHandCounts[p]++;
                                expectedPlayed--;
                            }
                                    
                            findingCard = false;
                            break;
                        // cutpurse - gives player +2 coins and all other players either lose a copper or reveals their hands 
                                // we can't test revealing cards since that is a printed statement to the console
                                // can check 
                                        // if other player hands were reduced by a copper if and only if they had one to begin with
                                        // if coins increased by 2
                        case cutpurse:
                            findingCard = false;
                            break;
                        // council_room - +4 cards + 1 buy, all other players draw a card
                                // see if decks decreased and hands increased by amount expected
                                // see if numbuys increased as expected
                        case council_room:
                            expectedBuys += 1;
                            expectedHandCounts[p]+= 3;
                            expectedDeckCounts[p]-= 3;
                            
                            for (int i = 0; i < Game.numPlayers; ++i){
                                expectedHandCounts[i]++;                                       
                                expectedDeckCounts[i]--;
                            }
                            findingCard = false;
                            break;
                        // embargo - +2 coins, trash embargo, adds embargo token to supply pile 
                                // returns -1 if supply is card isn't in play 
                                // player's hand should lose embargo but it should not be added to deck 
                                // coins should increase by 2
                                // embargo token for selected card should increase by one
                        case embargo:
                            expectedCoins += 2;
                            keepCoins = true; // not implemented yet
                            if (Game.supplyCount[choiceOne] == -1)
                                failureExpected = -1;
                            else {
                                expectedEmbargo[choiceOne]++;
                                choice1 = choiceOne;
                            }               
                            expectedPlayed = 0;                    
                                    
                            findingCard = false;
                            break;
                        // feast - gain card costing up to 5 coins, trash feast 
                                // hand should decrease by feast 
                                // discard should increase by card if chosen one is under 5 coins and supply isn't out                        
                        case feast:     
                            choice1 = choiceOne;
                            if (5 < API.getCost(choiceOne))
                                failureExpected = -1;
                            else if (Game.supplyCount[choiceOne] <= 0)
                                failureExpected = -1;
                            else {
                                expectedDiscardCounts[p]++;
                            }
                            findingCard = false;
                            expectedPlayed = 0;
                            break;
                        // gardens
                                // return -1
                        case gardens:
                            findingCard = false;
                            
                            noCard = true;
                            break;
                        // great hall - +1 card, +1 action
                        case great_hall:
                            expectedHandCounts[p]++;
                            expectedDeckCounts[p]--;
                            expectedActions++;
                            findingCard = false;
                            break;
                        // minion - +1 action either +2 gold, or discard your hand, draw 4 cards, and everyone else with at least 5 cards in their hand discards their hands and draws 4 cards 
                        case minion:
                            expectedActions++;
                            choice1 = API.rand.nextInt()%2;
                            if (choice1 == 0)
                                expectedCoins +=2;
                            else{
                                
                                //expectedDeckCounts[p] -= 4;
                                //expectedDiscardCounts[p] += Game.handCount[p];
                                expectedHandCounts[p] = 4;
                                for (int i = 0; i < Game.numPlayers; ++i){
                                    if (Game.handCount[i]>4){                                            
                                        //expectedDeckCounts[i] -= 4;
                                        //expectedDiscardCounts[i] += Game.handCount[i];
                                        expectedHandCounts[i] = 4;
                                    }
                                }
                                
                                
                            }
                                
                            findingCard = false;
                            
                            break;
                        // smithy draw 3 cards
                        case smithy:
                            expectedHandCounts[p] += 3;
                            expectedDeckCounts[p] -= 3;
                            findingCard = false;
                        
                            break;
                        // villiage draw a card, +2 actions
                        case village:
                            expectedActions += 2;
                            expectedDeckCounts[p]--;
                            expectedHandCounts[p]++;
                            findingCard = false;
                            break;
                        // steward: draw 2 cards or +2 gold or trash two cards from hand
                        case steward:
                            choice1 = API.rand.nextInt()%3 + 1;
                            if (choice1 == 1) {
                                expectedHandCounts[p] += 2;
                                expectedDeckCounts[p] -= 2;
                            }
                            else if (choice1 == 2)
                                expectedCoins += 2;
                            else 
                                expectedHandCounts[p] -= 2;                                
                                
                            findingCard = false;
                            break;
                        default:
                            break;
                    }
                    
                    // tells us to leave loop and if we can't play any card to skip over checking the return value
                    if (handPos == Game.handCount[p]-1){
                        findingCard = false;
                        noCard = true;
                    }
                    if (findingCard == true)
                        ++handPos;
                    else
                        System.out.println(Card.values()[Game.hand[p][handPos]]);
                    //System.out.println(Game.handCount[p] + " " + handPos);
                }
                
                if (Game.phase !=0)
                    failureExpected = -1;
                if (Game.numActions < 1)
                    failureExpected = -1;
                if (Game.hand[p][handPos] < Card.adventurer.ordinal() || Game.hand[p][handPos] > Card.treasure_map.ordinal())
                    failureExpected = -1;
                if (failureExpected == -1){
                    expectedReturn = -1;
                    expectedActions = 1;
                    expectedHandCounts[p] = 5;
                    expectedPlayed = 0;
                }
                
                if (noCard == false){
                    int actualReturn = API.playCard(handPos,choice1,choice2,choice3,Game);
                    if (suppress == false)
                        API.assertEquals(expectedReturn,actualReturn, "return unexpected " + expectedReturn + " " +actualReturn );
                }
                else
                {
                    expectedActions = 1;
                    expectedPlayed = 0;
                    expectedHandCounts[p] = 5;
                    
                }                
                
                if (suppress == false){ 
                    API.assertEquals(expectedCoins,Game.coins, "coins unexpected: " + expectedCoins + " " + Game.coins );
                    API.assertEquals(expectedActions,Game.numActions, "actions unexpected " + expectedActions + " " + Game.numActions);
                    API.assertEquals(expectedPlayed,Game.playedCardCount, "played unexpected: " + expectedPlayed + " " + Game.playedCardCount);
                    for (int i = 0; i < Game.numPlayers; ++i){
                        API.assertEquals(expectedHandCounts[i],Game.handCount[i], i+ " hand unexpected: " + expectedHandCounts[i] + " " + Game.handCount[i]);
                        API.assertEquals(expectedDeckCounts[i],Game.deckCount[i], "deck unexpected "+ expectedDeckCounts[i] + " " + Game.deckCount[i]);
                        API.assertEquals(expectedDiscardCounts[i],Game.discardCount[i], "discard unexpected " + expectedDiscardCounts[i] + " " + Game.discardCount[i]);
                    }
                    for (int i = Card.curse.ordinal(); i < Card.treasure_map.ordinal(); ++i)
                        API.assertEquals(expectedEmbargo[i],Game.embargoTokens[i], "embargo unexpected: " + expectedEmbargo[i] + " " + Game.embargoTokens[i]);
                }
                
            
            
            
            
            // buy
                
            // keep trying to buy random cards until you run out of buys or 50 loops pass
            // every loop check if card actually entered hand  
            int loops = 0;
            boolean stillBuying = true;
            while (stillBuying){
                loops++;
                // exit the loop after this 
                if (Game.numBuys < 1 || Game.coins < 2 || loops >50)
                    stillBuying = false;
                
                
                // setup this buy attempt's variables 
                int cardChoice = API.getRandomCard();            
                //int[] expectedCards = API.arbitraryPileCount(Game.discard[Game.whoseTurn],Game.discardCount[Game.whoseTurn]);
                //expectedCards[cardChoice]++;
                
                expectedBuys = Game.numBuys -1;
                int expectedCount = Game.discardCount[Game.whoseTurn] +1;
                expectedCoins = Game.coins - API.getCost(cardChoice);
                expectedReturn = 0;
                int expectedSupply = Game.supplyCount[cardChoice] -1;
                
                boolean expectedFailure = false;
                
                
                // if we do the things buy is supposed to avoid we'll exppect it to fail
                if (Game.numBuys < 1 || Game.supplyCount[cardChoice] <1 || expectedCoins < 0)   
                    expectedFailure = true;
                
                // if we think it'll fail, adjust expectations
                if (expectedFailure == true){
                    expectedSupply++;
                    expectedCount--;
                    expectedReturn = -1;
                    //expectedCards[cardChoice]--;
                    expectedCoins = Game.coins;
                    expectedBuys = Game.numBuys;
                    
                }
                
                // actually running BuyCard
                
                int actualReturn = API.buyCard(cardChoice, Game);
                
                // actual values of cards
                //int[] actualCards = API.arbitraryPileCount(Game.discard[Game.whoseTurn],Game.discardCount[Game.whoseTurn]);
                int actualBuys = Game.numBuys;
                // did our expectations match the actual results? 
                //API.comparePileCounts(expectedCards,actualCards, "cards don't match");
                API.assertEquals(expectedCount, Game.discardCount[Game.whoseTurn],"counts don't match");
                API.assertEquals(expectedReturn, actualReturn,"returns don't match");
                API.assertEquals(expectedSupply, Game.supplyCount[cardChoice],"supply counts don't match");
                API.assertEquals(expectedCoins, Game.coins,"coins counts don't match");
                API.assertEquals(expectedBuys, actualBuys,"buy counts don't match: " + expectedBuys + " " + actualBuys);
                
            }
            
        
        
            // cleanup
            API.endTurn(Game);
        }
        int[] players = new int[Game.numPlayers];
        API.getWinners(players, Game);
        for (int i = 0; i < Game.numPlayers; ++i)
            System.out.println(players[i]);
        
    }
    
}
