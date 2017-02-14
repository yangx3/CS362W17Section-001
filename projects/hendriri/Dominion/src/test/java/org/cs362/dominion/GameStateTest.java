package org.cs362.dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class GameStateTest {

    private GameState state;
    private Player player1;
    private Player player2;
    private List<Card> cards;

    @Before
    public void initialize() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
    }

    @Test
    public void addPlayer(){
        //referenced from play dominion
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        /*int numPlayers = 0;
        for(Player p : state.players) {
            numPlayers++;
        }
        assertEquals(numPlayers, 2);*/
        assertEquals(state.players.get(0).player_username, "player-1");
        assertEquals(state.players.get(1).player_username, "player-2");
    }


    @Test
    public void initializeGame() throws Exception {
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);

        //PRE INIT

        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 0);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);
        assertEquals(player2.hand.size(), 0);
        assertEquals(player2.deck.size(), 0);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);

        state.initializeGame();

        //POST INIT

        assertEquals(state.players.size(), 2);

        assertEquals(player2.numActions, 1);
        assertEquals(player2.numBuys, 1);
        assertEquals(player2.coins, 0);
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);

        assertEquals(player1.numActions, 1);
        assertEquals(player1.numBuys, 1);
        assertEquals(player1.coins, 0);
        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.discard.size(), 0);
        assertEquals(player1.playedCards.size(), 0);

        //GAMEBOARD CHECK
        int Temp0 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Province));
        int Temp1 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Duchy));
        int Temp2 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Estate));
        int Temp3 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Curse));
        int Temp4 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Gold));
        int temp5 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Silver));
        int Temp6 = state.gameBoard.get(Card.getCard(cards, Card.CardName.Cooper));

        assertEquals(Temp0, 8);
        assertEquals(Temp1, 8);
        assertEquals(Temp2, 8);
        assertEquals(Temp3, 10);
        assertEquals(Temp4, 30);
        assertEquals(temp5, 40);
        assertEquals(Temp6, 46);


    }

    @Test
    //this is a simple test to see if the play function executes and if winners returned a normal non-null value
    public void play() throws Exception {
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        state.initializeGame();
        HashMap<Player, Integer> winners = state.play();
        System.out.println(winners);
        assertNotEquals(winners, null);
        //assert(player1.scoreFor() < player2.scoreFor());
    }

    @Test
    public void isGameOver() throws Exception {
        player1 = new Player(state, "player-1");
        state.addPlayer(player1);
        player2 = new Player(state, "player-2");
        state.addPlayer(player2);
        state.initializeGame();

        Card Temp = Card.getCard(state.cards, Card.CardName.Province);

        for(int i = 0; i < 8; i++) {
            player1.deck.add(Card.getCard(state.cards, Card.CardName.Province));
            state.gameBoard.put(Temp, state.gameBoard.get(Temp) - 1 );
        }
        assertTrue(state.isGameOver());
    }


}
