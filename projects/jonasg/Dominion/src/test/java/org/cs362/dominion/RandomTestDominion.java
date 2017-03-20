package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTestDominion {
    @Test
    public void test0() throws Throwable {
	List<Card> cards = new ArrayList<Card>(Card.createCards());
	GameState state = new GameState(cards);

	Randomness.reset(); //set random seed

	//initialize 2-4 players
	int numPlayers = Randomness.nextRandomInt(3) + 2;
	for(int i = 0; i < numPlayers; i++) {
	    Player player = new Player(state, "player" + i);
	    state.addPlayer(player);
	}

	state.initializeGame();

	//test initialization

	GameState testState = (GameState) state.clone();
	Player testPlayer = null;
	List<Player> testPlayers = state.players;
	int testCoins;

	while(!state.isGameOver()) {
	    //test if game is really over

	    for(Player player:state.players) {
		//implement the play card code here
		while(player.numActions > 0) {
		    List<Card> actionCards = Card.filter(player.hand, Card.Type.ACTION);

		    if(actionCards.size() == 0)
			break;

		    Card c = (Card)actionCards.get(0);
		    if(c == null)
			break;

		    testState = state.clone();
		    testPlayer = player.clone();
		    player.numActions -= 1;
		    player.playedCards.add(c);
		    player.hand.remove(c);
		    c.play(player, state);

		    //test each card that the player plays
		    switch(c.getCardName()) {
			case Adventurer:
			    int expect = 0, treasures = 0;
			    //bring in case for cycling through discard
			    for(Card card : player.deck) {
				if(card.getType() != Card.Type.TREASURE)
				    expect++;
				else {
				    treasures++;
				    if(treasures == 2)
					break;
				}
			    }
			    assertEquals(testPlayer.hand.size() + testPlayer.playedCards.size() + treasures,
				    player.hand.size() + player.playedCards.size());
			    assertEquals(testPlayer.deck.size() - expect - treasures,
				    player.deck.size());
			    assertEquals(player.discard.size(),
				    testPlayer.discard.size() + expect);
			    break;

			case Ambassador: //finish this to check each player gained a put back card
			    int putBack = testPlayer.hand.size() + testPlayer.playedCards.size() -
				(player.hand.size() + player.playedCards.size());
			    assertEquals(testPlayer.deck.size(), player.deck.size());
			    assertEquals(testPlayer.discard.size(), player.discard.size());
			    int statePutBack = 0;
			    int curKeya = 0;
			    for(Card card : state.gameBoard.keySet()) {
				curKeya = state.gameBoard.get(card) - testState.gameBoard.get(card);
				if(curKeya != 0) {
				    if(statePutBack > 0)
					assertEquals(1, -1);
				    statePutBack += curKeya;
				    //check if the state reduced by the amount of players
				    int testAmount = testState.gameBoard.get(card) - testState.players.size() + 1 + putBack;
				    if(testAmount < 0)
					testAmount = 0;
				    assertEquals(testAmount, (int) state.gameBoard.get(card));
				}
			    }
			    break;

			case Baron:
			    Card estate = Card.getCard(cards, Card.CardName.Estate);
			    boolean gainEstate;
			    gainEstate = true;
			    //player has an estate, so discards it
			    if(Card.getCard(testPlayer.hand, Card.CardName.Estate) != null) {
				assertEquals(testPlayer.hand.size() + testPlayer.playedCards.size() - 1,
					player.hand.size() + player.playedCards.size());
				assertEquals(player.deck.size(), testPlayer.deck.size());
				assertEquals(player.coins, testPlayer.coins + 4);
				assertEquals((int) state.gameBoard.get(estate),
					(int) testState.gameBoard.get(estate));
			    } else { //player gains an estate
				assertEquals(testPlayer.hand.size(), player.hand.size() + 1);
				assertEquals(player.deck.size(), testPlayer.deck.size());
				assertEquals(player.coins, testPlayer.coins);
				if((int) testState.gameBoard.get(estate) > 0)
				    assertEquals((int) testState.gameBoard.get(estate) - 1,
					    (int) state.gameBoard.get(estate));
				else
				    assertEquals((int) testState.gameBoard.get(estate),
					    (int) state.gameBoard.get(estate));
			    }
			    break;

			case CouncilRoom:
			    if(testPlayer.deck.size() + testPlayer.discard.size() > 4)
				assertEquals(player.hand.size() + player.playedCards.size(), testPlayer.hand.size() + 4);
			    else
				assertEquals(player.hand.size() + player.playedCards.size(), testPlayer.hand.size() +
					testPlayer.deck.size() + testPlayer.discard.size());
			    if((testPlayer.deck.size() - 4) >= 0)
				assertEquals(player.deck.size(), testPlayer.deck.size() - 4);
			    else
				assertEquals(player.deck.size(), testPlayer.deck.size() + testPlayer.discard.size() - 4);

			    assertEquals(player.numBuys, testPlayer.numBuys + 1);
			    assertEquals(player.numActions, testPlayer.numActions - 1);
			    for(int i = 0; i < numPlayers; i++) {
				if(state.players.get(i) != player) {
				    if(testState.players.get(i).deck.size() == 0)
					assertEquals(testState.players.get(i).deck.size() +
						testState.players.get(i).discard.size() - 1,
						state.players.get(i).deck.size());
				    else
					assertEquals(testState.players.get(i).deck.size() - 1,
						state.players.get(i).deck.size());
				    assertEquals(testState.players.get(i).hand.size() + 1,
					    state.players.get(i).hand.size());
				}
			    }
			    break;

			case Cutpurse:
			    assertEquals(player.deck.size(), testPlayer.deck.size());
			    assertEquals(player.numActions, testPlayer.numActions - 1);
			    assertEquals(player.coins, testPlayer.coins + 2);

			    for(int i = 0; i < numPlayers; i++) {
				if(state.players.get(i) != player) {
				    if(Card.getCard(testState.players.get(i).hand, Card.CardName.Copper) != null) {
					assertEquals(testState.players.get(i).hand.size() - 1,
						state.players.get(i).hand.size());
					assertEquals(testState.players.get(i).discard.size() + 1,
						state.players.get(i).discard.size());
				    } else {
					assertEquals(testState.players.get(i).hand.size(),
						state.players.get(i).hand.size());
					assertEquals(testState.players.get(i).discard.size(),
						state.players.get(i).discard.size());
				    }
				}
			    }
			    break;

			case Embargo:
			    assertEquals(testPlayer.hand.size() + testPlayer.playedCards.size() - 1,
				    player.hand.size() + player.playedCards.size());
			    assertEquals(player.discard.size(), testPlayer.discard.size());
			    assertEquals(player.coins, testPlayer.coins + 2);

			    int check = 0;
			    for(Card card : state.boardEmbargos.keySet()) {
				if(state.boardEmbargos.get(card) - testState.boardEmbargos.get(card) != 0) {
				    if(check != 0)
					assertEquals(1, -1);
				    check += 1;
				    assertEquals((int) state.boardEmbargos.get(card),
					    testState.boardEmbargos.get(card) + 1);
				}
			    }
			    break;

			case Feast:
			    assertEquals(testPlayer.hand.size() + testPlayer.playedCards.size()- 1,
				    player.hand.size() + player.playedCards.size());
			    assertEquals(player.deck.size(), testPlayer.deck.size());
			    assertEquals(player.discard.size(), testPlayer.discard.size() + 1);

			    int checkc = 0;
			    for(Card card : state.gameBoard.keySet()) {
				if(state.gameBoard.get(card) - testState.gameBoard.get(card) != 0) {
				    if(checkc != 0)
					assertEquals(1, -1);
				    checkc += 1;
				    //check if the state reduced by the amount of players
				    assertEquals((int) state.gameBoard.get(card),
					    testState.gameBoard.get(card) - 1);
				    assertEquals(card.getTreasureValue() <= 5, true);
				}
			    }
			    break;

			case GreatHall:
			    assertEquals(player.hand.size() + player.playedCards.size(),
				    testPlayer.hand.size() + testPlayer.playedCards.size() + 1);
			    if(testPlayer.deck.size() > 0)
				assertEquals(player.deck.size(), testPlayer.deck.size() - 1);
			    else
				assertEquals(player.deck.size(), testPlayer.discard.size() - 1);
			    assertEquals(player.numActions, testPlayer.numActions);
			    break;

			case Mine:
				//do this
				int amtCopper = 0, amtSilver = 0, amtGold = 0;

			    break;

			case Minion:
			    if(player.coins != testPlayer.coins) { //player gains 2 coins
				assertEquals(player.hand.size() + player.playedCards.size(),
					testPlayer.hand.size() + testPlayer.playedCards.size());
				assertEquals(testPlayer.deck.size(), player.deck.size());
				assertEquals(testPlayer.coins + 2, player.coins);
				assertEquals(player.numActions, testPlayer.numActions);
				for(int i = 0; i < numPlayers; i++) {
				    if(state.players.get(i) != player) {
					assertEquals(testState.players.get(i).deck.size(),
						state.players.get(i).deck.size());
					assertEquals(testState.players.get(i).hand.size(),
						state.players.get(i).hand.size());
					assertEquals(testState.players.get(i).discard.size(),
						state.players.get(i).discard.size());
				    }
				}
			    } else { // player redraws (opponents, too)
				assertEquals(4, player.hand.size());
				if(testPlayer.deck.size() >= 4) {
				    assertEquals(testPlayer.deck.size() - 4, player.deck.size());
				    assertEquals(testPlayer.discard.size() + testPlayer.hand.size(), player.discard.size());
				} else {
				    assertEquals(testPlayer.deck.size() + testPlayer.discard.size() - 4,
					    player.deck.size());
				    assertEquals(testPlayer.hand.size(), player.discard.size());
				}
				assertEquals(testPlayer.coins, player.coins);

				for(int i = 0; i < numPlayers; i++) {
				    if(state.players.get(i) != player) {
					if(testState.players.get(i).hand.size() >= 5) {
					    assertEquals(testState.players.get(i).deck.size(),
						    state.players.get(i).deck.size());
					    assertEquals(testState.players.get(i).hand.size(),
						    state.players.get(i).hand.size());
					    assertEquals(testState.players.get(i).discard.size(),
						    state.players.get(i).discard.size());
					} else {
					    assertEquals(4, state.players.get(i).hand.size());
					    if(testState.players.get(i).deck.size() >= 4) {
						assertEquals(testState.players.get(i).deck.size() - 4,
							state.players.get(i).deck.size());
						assertEquals(testState.players.get(i).discard.size() +
							testState.players.get(i).hand.size(),
							state.players.get(i).discard.size());
					    } else {
						assertEquals(testState.players.get(i).deck.size() +
							testState.players.get(i).discard.size() - 4,
							state.players.get(i).deck.size());
						assertEquals(testState.players.get(i).hand.size(),
							state.players.get(i).discard.size());
					    }
					}
				    }
				}
			    }
			    break;

			case SeaHag:
			    assertEquals(testPlayer.hand.size() + testPlayer.playedCards.size(),
				    player.hand.size() + player.playedCards.size());
			    assertEquals(testPlayer.deck.size(), player.deck.size());
			    assertEquals(testPlayer.discard.size(), player.discard.size());
			    for(int i = 0; i < numPlayers; i++) {
				if(state.players.get(i) != player) {
				    assertEquals(testState.players.get(i).deck.size(),
					    state.players.get(i).deck.size());
				    assertEquals(testState.players.get(i).hand.size(),
					    state.players.get(i).hand.size());
				    assertEquals(testState.players.get(i).discard.size() + 1,
					    state.players.get(i).discard.size());
				    assertEquals(Card.getCard(cards, Card.CardName.Curse),
					    state.players.get(i).deck.peek());
				}
			    }
			    break;

			case Smithy:
			    assertEquals(testPlayer.hand.size() + testPlayer.playedCards.size() + 3,
				    player.hand.size() + player.playedCards.size());
			    if(testPlayer.deck.size() >= 3)
				assertEquals(testPlayer.deck.size() - 3, player.deck.size());
			    else
				assertEquals(testPlayer.deck.size() + testPlayer.discard.size() - 3,
					player.deck.size());
			    break;

			case Village:
			    assertEquals(player.hand.size() + player.playedCards.size(), testPlayer.hand.size() + 1);
			    assertEquals(player.numActions, testPlayer.numActions + 1);
			    break;
		    }
		}

		testState = state.clone();
		testPlayer = player.clone();
		player.playTreasureCard();
		//assert it played all the coins
		assertEquals(0, Card.filter(player.hand, Card.Type.TREASURE).size());
		//assert it gained all the coins for copper, silver, gold
		testCoins = 0;
		testPlayer.hand = Card.filter(testPlayer.hand, Card.Type.TREASURE);
		for(Card card:testPlayer.hand)
		    testCoins += card.getTreasureValue();
		assertEquals(testPlayer.coins + testCoins, player.coins);

		testState = state.clone();
		testPlayer = player.clone();
		player.buyCard(state);
		//test buys above 0
		if(player.numBuys < 0)
		    fail("Error, buys went below 0");
		//cards above 0
		for(Card card:state.gameBoard.keySet()) {
		    if(state.gameBoard.get(card) < 0)
			fail("Error, negative card count");
		}
		//cards decremented

		testState = state.clone();
		testPlayer = player.clone();
		player.endTurn();
		assertEquals(5, player.hand.size());
		assertEquals(1, player.numBuys);
		assertEquals(1, player.numActions);
		assertEquals(0, player.coins);
		//assert
	    }
	}
    }
}
