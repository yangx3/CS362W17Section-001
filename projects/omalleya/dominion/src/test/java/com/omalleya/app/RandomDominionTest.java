package com.omalleya.app;

import java.util.*;

import org.junit.*;

import com.omalleya.app.Card.CardName;
import com.omalleya.app.Card.Type;

public class RandomDominionTest {

    @Test
    public void test0() {
        List<Card> cards = Card.createCards();
        GameState gs = new GameState(cards);

        //random int decides number of players        
        int random = (int)  Randomness.random.nextInt(3) + 2;
        for(int i=0; i<random; i++)
        {
            Player p = new Player(gs, "player " + (i+1));
            gs.addPlayer(p);
        }

        gs.initializeGame();

        //test for number of cards depending on players
        if(random == 4)
        {
            System.out.println("Number of curse cards on board: " + gs.gameBoard.get(Card.getCard(cards, CardName.Curse)));
            assertTrue(gs.gameBoard.get(Card.getCard(cards, CardName.Curse)) == 30);
        }else if(random == 3)
        {
            System.out.println("Number of curse cards on board: " + gs.gameBoard.get(Card.getCard(cards, CardName.Curse)));
            assertTrue(gs.gameBoard.get(Card.getCard(cards, CardName.Curse)) == 20);
        }else if(random == 2)
        {
            System.out.println("Number of curse cards on board: " + gs.gameBoard.get(Card.getCard(cards, CardName.Curse)));
            assertTrue(gs.gameBoard.get(Card.getCard(cards, CardName.Curse)) == 10);
        }

        //test to make sure there are only 17 different types of cards on the board
        //this sort of checks that there are only 10 different kingdom cards
        assertTrue(gs.gameBoard.keySet().size() == 17);

        //gs.play() function below
        //we don't call gs.play() so that we can test in here
        GameState testState = new GameState(cards);
        Player testPlayer = new Player(gs, "");
        int turns = 0;
        while(!gs.endGame()) {
            turns++;
            for(Player p : gs.players) {
                p.initializePlayerTurn();
                try{
                    testState = (GameState) gs.clone();
                    testPlayer = (Player) p.clone();
                }
                catch(CloneNotSupportedException e)
                {
                    System.out.println(e);
                }
                p.action();
                //checks that the last action card played did what was intended
                checkCard(testState, testPlayer, gs, p, cards);
                p.buy(gs);
                assertTrue(testPlayer.discarded.size() < p.discarded.size());
                p.cleanUp();
                //5 cards as your starting hand
                for (int i = 0; i < 5; i++) {
                    p.drawCard();
                }
            }
            if(turns==3)
                break;
        }

        System.out.println ("Finished game.\n");
    
        for(Player p: gs.getWinners().keySet()){
            System.out.println ("Player name: "+p.player_name + " , Score: "+ gs.getWinners().get(p) );
        }
    }

    public void checkCard(GameState cloneState, Player clonePlayer, GameState state, Player player, List<Card> cards) {
        try {
            Card curCard = player.playedCards.get(player.playedCards.size()-1);
            if(Card.getCard(cards, CardName.Adventurer).equals(curCard)) {
                System.out.println("Adventurer");
                int initialTreasures = Collections.frequency(clonePlayer.hand, Card.getCard(cards, CardName.Copper));
                initialTreasures += Collections.frequency(clonePlayer.hand, Card.getCard(cards, CardName.Silver));
                initialTreasures += Collections.frequency(clonePlayer.hand, Card.getCard(cards, CardName.Gold));

                int treasures = Collections.frequency(player.hand, Card.getCard(cards, CardName.Copper));
                treasures += Collections.frequency(player.hand, Card.getCard(cards, CardName.Silver));
                treasures += Collections.frequency(player.hand, Card.getCard(cards, CardName.Gold));

                System.out.println("Number of initial treasures: " + initialTreasures);
                System.out.println("Number of current treasures: " + treasures);
                //must have two more treasure cards now then before
                assertTrue(treasures-2 == initialTreasures);
            }else if(Card.getCard(cards, CardName.Ambassador).equals(curCard)) {
                System.out.println("Ambassador");
                //hand sizes should be the same because the player plays the Ambassador card
                //but also draws a new card
                System.out.println("Initial Hand Size: " + clonePlayer.hand.size());
                System.out.println("Current Hand Size: " + player.hand.size());
                assertTrue(player.playedCards.contains(Card.getCard(cards, CardName.Ambassador)));
                assertTrue(player.hand.size() == clonePlayer.hand.size());
            }else if(Card.getCard(cards, CardName.Baron).equals(curCard)) {
                System.out.println("Baron");
                //check that number of buys has gone up
                assertTrue(player.numBuys-1 == clonePlayer.numBuys);
                //check how number of estates has changed.
                int initialEstates = Collections.frequency(clonePlayer.hand, Card.getCard(cards, CardName.Estate));
                int finalEstates = Collections.frequency(player.hand, Card.getCard(cards, CardName.Estate));
                if(initialEstates>finalEstates)
                {
                    System.out.println("Estate discarded");
                    assertTrue(player.coins >= clonePlayer.coins + 4);
                }else if(initialEstates == finalEstates && initialEstates != 0){
                    System.out.println("Estate gained");
                    assertTrue(player.discarded.contains(Card.getCard(cards, CardName.Estate)));
                }else {
                    System.out.println("No estates in hand");
                }
            }else if(Card.getCard(cards, CardName.Council_Room).equals(curCard)) { //needs work
                System.out.println("Council_Room");
                System.out.println("Initial cards: " + clonePlayer.hand.size());
                System.out.println("Current cards: " + player.hand.size());
                assertTrue(clonePlayer.hand.size()+3 <= player.hand.size());
            }else if(Card.getCard(cards, CardName.Cutpurse).equals(curCard)) {
                System.out.println("Cutpurse");
                System.out.println("Initial coins: " + clonePlayer.coins);
                System.out.println("Current coins: " + player.coins);
                assertTrue(player.coins >= clonePlayer.coins + 2);
            }else if(Card.getCard(cards, CardName.Embargo).equals(curCard)) {
                System.out.println("Embargo");
                System.out.println("Initial coins: " + clonePlayer.coins);
                System.out.println("Current coins: " + player.coins);
                assertTrue(player.coins >= clonePlayer.coins + 2);
            }else if(Card.getCard(cards, CardName.Feast).equals(curCard)) {
                System.out.println("Feast");
                System.out.println(clonePlayer.discarded);
                System.out.println(player.discarded);
                assertTrue(clonePlayer.discarded.size()+1 == player.discarded.size());
            }else if(Card.getCard(cards, CardName.Gardens).equals(curCard)) {
                System.out.println("Gardens");
            }else if(Card.getCard(cards, CardName.Great_Hall).equals(curCard)) {
                System.out.println("Great_Hall");
                //hand is the same size because we've drawn a card
                System.out.println("Initial Hand Size: " + clonePlayer.hand.size());
                System.out.println("Current Hand Size: " + player.hand.size());
                assertTrue(player.playedCards.contains(Card.getCard(cards, CardName.Great_Hall)));
                assertTrue(player.hand.size() == clonePlayer.hand.size());
            }else if(Card.getCard(cards, CardName.Mine).equals(curCard)) {
                System.out.println("Mine");
                System.out.println("Initial hand: " + clonePlayer.hand);
                System.out.println("Current hand: " + player.hand);
                if(clonePlayer.hand.contains(Card.getCard(cards, CardName.Silver))) {
                    assertTrue(player.discarded.contains(Card.getCard(cards, CardName.Gold)));
                    assertTrue(Collections.frequency(clonePlayer.hand, Card.getCard(cards, CardName.Silver)) -1 == 
                    Collections.frequency(player.hand, Card.getCard(cards, CardName.Silver)));
				}
				else if(clonePlayer.hand.contains(Card.getCard(cards, CardName.Copper))) {
					assertTrue(player.discarded.contains(Card.getCard(cards, CardName.Silver)));
                    assertTrue(Collections.frequency(clonePlayer.hand, Card.getCard(cards, CardName.Copper)) -1 == 
                    Collections.frequency(player.hand, Card.getCard(cards, CardName.Copper)));
				}
            }else if(Card.getCard(cards, CardName.Militia).equals(curCard)) {
                System.out.println("Militia");
                System.out.println("Initial coins: " + clonePlayer.coins);
                System.out.println("Current coins: " + player.coins);
                assertTrue(player.coins >= clonePlayer.coins + 2);
                for(Player p : state.players)
                {
                    if(p!=player)
                    {
                        assertTrue(p.hand.size() <= 3);
                    }
                }
            }else if(Card.getCard(cards, CardName.Smithy).equals(curCard)) {
                System.out.println("Smithy");
                System.out.println("Initial Hand Size: " + clonePlayer.hand.size());
                System.out.println("Current Hand Size: " + player.hand.size());
                assertTrue(player.hand.size() == clonePlayer.hand.size() + 2);
            }else if(Card.getCard(cards, CardName.Village).equals(curCard)) {
                System.out.println("Village");
                System.out.println("Initial Hand Size: " + clonePlayer.hand.size());
                System.out.println("Current Hand Size: " + player.hand.size());
                assertTrue(player.hand.size() == clonePlayer.hand.size());
            }else {
                System.out.println("Error");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //no cards played
            System.out.println("No action cards to play");
        }
        
    }

    public void assertTrue(boolean clause) {
        if(clause == true)
        {
            System.out.println("TEST SUCCESSFULLY COMPLETED");
        }else {
            System.out.println("TEST FAILED");
        }
    }
}