package org.cs362.dominion;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Austin Hodgin on 2/13/2017.
 */
public class Player_Test {
    private GameState curent_state; //set up
    private Player player_1;
    private Player player_2;
    private List<Card> cards;


    @Before
    public void initializeGame() {

        cards = new ArrayList<Card>(Card.createCards());
        curent_state = new GameState(cards);
        player_1 = new Player(curent_state, "PLAYER 1");
        curent_state.addPlayer(player_1);
        player_2 = new Player(curent_state, "PLAYER 2");
        curent_state.addPlayer(player_2);
        curent_state.initializeGame();
    }

    @Test
    public void testDrawCard(){
        player_1.initializePlayerTurn(); //set up palyer 1's turn


        assertEquals(player_1.coins, 0); //makes sure the player has 0 coins
        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards

        player_1.drawCard(); //have player 1 draw a card


        assertEquals(player_1.coins, 0); //makes sure the player has 0 coins
        assertEquals(player_1.hand.size(), 6); // makes sure the player has 6 cards in his hand
        assertEquals(player_1.deck.size(), 4); // make sure the player has 4 cards in is deck
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards
    }

    @Test
    public void testInitializePlayerTurn(){
        assertEquals(player_1.coins, 0); //makes sure the player has 0 coins
        assertEquals(player_1.hand.size(), 0); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 0); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 10); //make sure all cards were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards
        assertEquals(player_1.numActions, 0); //make sure num actions was 0
        assertEquals(player_1.numBuys, 0); //make sure num buys were set to 0

        player_1.initializePlayerTurn(); //set up palyer 1's turn

        assertEquals(player_1.coins, 0); //makes sure the player has 0 coins
        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no cards were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards
        assertEquals(player_1.numActions, 1); //make sure num actions didn't change
        assertEquals(player_1.numBuys, 1); //make sure num buys didn't change

    }

    @Test
    public void testGain(){
        player_1.initializePlayerTurn(); //set up player 1's turn

        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards


        player_1.gain(Card.getCard(cards, Card.CardName.Copper));

        assertEquals(player_1.hand.size(), 5); // makes sure the player has 0 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 0 cards in is deck
        assertEquals(player_1.discard.size(), 1); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards

    }

    @Test
    public void testDiscard(){
        player_1.initializePlayerTurn(); //set up player 1's turn
        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards

        player_1.discard(Card.getCard(player_1.hand, Card.CardName.Copper));

        assertEquals(player_1.hand.size(), 4); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 1); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards
    }
    @Test
    public void testPlayKingdomCard(){
        player_1.initializePlayerTurn(); //set up player 1's turn

        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards

        player_1.hand.add(Card.getCard(cards, Card.CardName.Village));
        player_1.playKingdomCard();

        assertEquals(player_1.hand.size(), 6); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 4); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 1); //make sure the player has not played any cards

    }
    @Test
    public void testScoreFor(){
        player_1.initializePlayerTurn(); //set up player 1's turn
        int player_score = 0; //to keep track of players score

        for (Card c : player_1.hand) { //look for estate cards in player hands
            player_score += c.score();
        }
        for (Card c : player_1.deck) { //look for estate cards in player deck
            player_score += c.score(); //add up the score
        }
        assertEquals(player_score, player_1.scoreFor()); //make sure the scores are the same
    }


    @Test
    public void testPlayTreasureCard(){
        player_1.initializePlayerTurn(); //set up player 1's turn
        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded

        int player_money = 0;
                for(Card card : player_1.hand){ //for each card in the players hand add its treasure value to player_money
                    player_money = player_money + card.getTreasureValue();
                }
                player_1.playTreasureCard(); //play a treasure card

        assertEquals(player_money, player_1.coins); //make sure that the player has the same amount of coins and from the amount
    }
    @Test
    public void testBuyCard(){
        player_1.initializePlayerTurn(); //set up player 1's turn

        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded

        player_1.playTreasureCard(); //playtreasure cards to get money to buy cards

        player_1.buyCard(curent_state); //buy a random card the player can afford


        assertTrue(player_1.hand.size() < 5); // makes sure the player has less than 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 1); //make sure a card was gained from buying

    }
    @Test
    public void testEndTurn(){
        player_1.initializePlayerTurn(); //set up player 1's turn

        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 0); //make sure no card's were discarded

        player_1.endTurn();

        assertEquals(player_1.hand.size(), 0); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.discard.size(), 5); //make sure no card's were discarded
        assertEquals(player_1.playedCards.size(), 0); //make sure no cards were played


    }

}
