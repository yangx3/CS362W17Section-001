package dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTestDominion {

    public final List<Card> cards = new ArrayList<Card>(Card.createCards());
    
    public boolean assertIntCustom(int a, int b) {
        if(a != b) {
            System.out.println("[!!!] TEST FAILURE: " + String.valueOf(b) + " expected, got " + String.valueOf(a));
            return true;
        }
        System.out.println("TEST SUCCESS~");
        return false;
    }
    
    @Test
    public void RandomTestApparatus() throws Throwable {
        int failures = 0, initPlayers, turnBound, tests;
        int handChange, deckChange, discardChange, playChange, aChange, bChange, cChange;
        int savedHand, savedDeck, savedDiscard, savedPlayed, savedA, savedB, savedC;
        boolean testFail = false;
        Random rgen = new Random();
        GameState state;
        Player player, testPlayer;
        List<Card> actionCards, testCards;
        Randomness.reset(rgen.nextInt(50)+10);
        
        tests = (int)(Randomness.nextRandomInt(100))+20;
        
        for(int testrun=0;testrun<tests;testrun++) {
            state = new GameState(cards);
            Randomness.reset(10);
            initPlayers = (int)(rgen.nextInt(4));
            turnBound = (int)(rgen.nextInt(50))+10;
            
            if(initPlayers < 2) {
                initPlayers += 2;
            }
            for (int i=0;i<initPlayers;i++) {
                player = new Player(state,"Player"+String.valueOf(i));
                state.addPlayer(player);
            }
            
            state.initializeGame();
            
            for(int i=0;i<initPlayers;i++) {
                testPlayer = state.players.get(i);
                if((testFail = assertIntCustom(testPlayer.hand.size(),5)) == true) {
                    break;
                }
                if((testFail = assertIntCustom(testPlayer.deck.size(),5)) == true) {
                    break;
                }
                if((testFail = assertIntCustom(testPlayer.discard.size(),0)) == true) {
                    break;
                }
                if((testFail = assertIntCustom(testPlayer.playedCards.size(),0)) == true) {
                    break;
                }
                if((testFail = assertIntCustom(testPlayer.coins,0)) == true) {
                    break;
                }
                if((testFail = assertIntCustom(testPlayer.actions,1)) == true) {
                    break;
                }
                if((testFail = assertIntCustom(testPlayer.buys,1)) == true) {
                    break;
                }
            }
            
            if(testFail == true) {
                failures += 1;
                testFail = false;
                continue;
            }
            
            //System.out.println("[ >>> Initialized Board <<< ]\n " + state.toString() + "\n\n");
            

            while (!state.isGameOver()) {
                for (Player selectedPlayer : state.players) {
                    if(turnBound == 0) {
                        break;
                    }
                    else {
                        turnBound--;
                    }
                    System.out.println("::TURN BEGIN: It's "+ selectedPlayer.playerName + "'s turn.\n");
                    System.out.println(selectedPlayer.toString());
                    
                    while (selectedPlayer.actions > 0) {
                        actionCards = Card.filter(selectedPlayer.hand,Card.Type.ACTION);
                        
                        if (actionCards.size() == 0)
                            break;
                        
                        Card c = (Card)actionCards.get(0);
                        
                        if (c == null)
                            break;
                        
                        if ((c.getCardName() != Card.CardName.Feast) && (c.getCardName() != Card.CardName.Embargo)) {
                            selectedPlayer.playedCards.add(c);
                        }
                    
                        savedA = selectedPlayer.actions;
                        savedB = selectedPlayer.buys;
                        savedC = selectedPlayer.coins;
                        
                        savedDeck = selectedPlayer.deck.size();
                        savedDiscard = selectedPlayer.discard.size();
                        savedHand = selectedPlayer.hand.size();
                        savedPlayed = selectedPlayer.playedCards.size();
                        
                        c.play(selectedPlayer,state);
                        System.out.println(">>>>>> ASSERTING: " + c.getCardName());
                        
                        if(c.getCardName() == Card.CardName.Adventurer) {
                            if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,2)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.Smithy) {
                            if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,3)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.Village) {
                            if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,1)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                            if((testFail = assertIntCustom(selectedPlayer.actions-savedA,2)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.Cutpurse) {
                            if((testFail = assertIntCustom(selectedPlayer.coins-savedC,2)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.Feast) {
                            if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,0)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                            if((testFail = assertIntCustom(selectedPlayer.discard.size()-savedDiscard,1)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.Baron) {
                            if((testFail = assertIntCustom(selectedPlayer.buys-savedB,1)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                            System.out.println(String.valueOf(selectedPlayer.coins)+String.valueOf(selectedPlayer.buys));
                        }
                        else if(c.getCardName() == Card.CardName.CouncilRoom) {
                            if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,4)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                            if((testFail = assertIntCustom(selectedPlayer.buys-savedB,2)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.GreatHall) {
                            if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,1)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                            if((testFail = assertIntCustom(selectedPlayer.actions-savedA,1)) == true) {
                                selectedPlayer.actions = selectedPlayer.actions;
                            }
                        }
                        else if(c.getCardName() == Card.CardName.Mine) {
                           if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,0)) == true) {
                               selectedPlayer.actions = selectedPlayer.actions;
                           }
                        }
                        else if(c.getCardName() == Card.CardName.Minion) {
                           if((testFail = assertIntCustom(selectedPlayer.hand.size()-savedHand,1)) == true) {
                               selectedPlayer.actions = selectedPlayer.actions;
                           }
                           if((testFail = assertIntCustom(selectedPlayer.actions-savedA,2)) == true) {
                               selectedPlayer.actions = selectedPlayer.actions;
                           }
                        }
                        
                        selectedPlayer.actions -= 1;
                        selectedPlayer.hand.remove(c);     // VERY IMPORTANT!!! Played card cannot be in hand and in play area at same time.
                    
                        if(testFail == true) {
                            break;
                        }
                    }
                    
                    if(testFail == true) {
                        break;
                    }
                    
                    // buy phase playing treasure cards
                    selectedPlayer.playTreasureCard();
                    
                    // buy phase buying cards
                    selectedPlayer.buyCard();
                    
                    // cleanup/end phase
                    selectedPlayer.endTurn();
                }
                
                if(testFail == true) {
                    failures += 1;
                    testFail = false;
                    break;
                }
                
                // DEV: end game
                if(turnBound == 0) {
                    System.out.println(String.valueOf(turnBound) + " turns elapsed, ending!");
                    break;
                }
            }
            
            HashMap<Player,Integer> endGameLeaderboard = state.getWinners();
            
            System.out.println("Game Completed.\n");
            
            System.out.println("Player Name\t\tVP Earned");
            for (Player p: endGameLeaderboard.keySet()){
                System.out.println("- " + p.playerName + "\t\t" + endGameLeaderboard.get(p));
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append("\n --- Final Table --- \n");
            sb.append("Card Name (Number of Cards)\n");
            Map<Card,Integer> treeMap = new TreeMap<Card, Integer>(state.gameBoard);
            for (Card card : treeMap.keySet()) {
                sb.append("- " + card.getCardName() + " (" + treeMap.get(card) + ")\n");
            }
            
            System.out.println("\n\n[RAND_TEST_DOM] Completed Test No: " + String.valueOf(testrun+1) + " of " + String.valueOf(tests));
        }
        if(failures > 0) {
            System.out.println("[RAND_TEST_DOM] Test failures. Please check for error uniqueness.");
        }
        System.out.println("\n[RAND_TEST_DOM] Results: " + String.valueOf(tests) + " tests run, " + String.valueOf(failures) + " failures.\n");
    }
}
