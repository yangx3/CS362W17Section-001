package org.cs362.dominion;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Austin Hodgin on 2/13/2017.
 */


public class GameState_Test {
    private GameState curent_state_1; //set up

    private GameState curent_state_2; //set up

    private Player player_1;
    private Player player_2;

    private Player player_3;
    private Player player_4;

    private List<Card> cards;


    @Before
    public void initializeGame() {

        cards = new ArrayList<Card>(Card.createCards()); //list of all the cards
        curent_state_1 = new GameState(cards); //current game state
        curent_state_2 = new GameState(cards); //current game state

    }


    @Test
    public void testinitializeGame() {

        player_1 = new Player(curent_state_1, "player 1"); //creat player 1
        curent_state_1.addPlayer(player_1); //add player 1 to game
        player_2 = new Player(curent_state_1, "player 2"); // creat player 2
        curent_state_1.addPlayer(player_2); // add player 2


        //make sure that these were created and not set yet for player 1
        assertEquals(player_1.deck.size(), 0);
        assertEquals(player_1.hand.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.discard.size(), 0);


        //make sure that these were created and not set yet for player 2
        assertEquals(player_2.deck.size(), 0);
        assertEquals(player_2.hand.size(), 0);
        assertEquals(player_2.playedCards.size(), 0);
        assertEquals(player_2.discard.size(), 0);


        curent_state_1.initializeGame();

        //make sure that these were created and  set yet for player 1
        assertEquals(player_1.deck.size(), 0);
        assertEquals(player_1.hand.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.discard.size(), 10);


        //make sure that these were created and  set yet for player 2
        assertEquals(player_2.deck.size(), 0);
        assertEquals(player_2.hand.size(), 0);
        assertEquals(player_2.playedCards.size(), 0);
        assertEquals(player_2.discard.size(), 10);

    }

    @Test
    public void testAddPlayer() {
        player_1 = new Player(curent_state_1, "player 1"); //create player 1
        curent_state_1.addPlayer(player_1); //add player 1
        player_2 = new Player(curent_state_1, "player 2"); //create player 2
        curent_state_1.addPlayer(player_2); //add player 2

        int num_players = 0; //num of plyers to keep track

        for (Player p : curent_state_1.players) { //for each player add 1 to num plyers
            num_players++;
        }
        assertEquals(num_players, 2); //make sure it counted 2 players
    }

    @Test
    public void testIsGameOver() {
        //checking the victory condictions of if all 8 provinces are gone
        player_1 = new Player(curent_state_1, "player 1"); //create player 1
        curent_state_1.addPlayer(player_1); //add player 1
        player_2 = new Player(curent_state_1, "player 2"); //create player 2
        curent_state_1.addPlayer(player_2); //add player 2
        curent_state_1.initializeGame();//set up the game board


        for (int i = 0; i < 8; i++) { //remove all the provance fromt he game board
            player_1.hand.add(Card.getCard(curent_state_1.cards, Card.CardName.Province)); //add a province to your hand 8 times
            //remove that card from the game board
            curent_state_1.gameBoard.put(Card.getCard(curent_state_1.cards, Card.CardName.Province), curent_state_1.gameBoard.get(Card.getCard(curent_state_1.cards, Card.CardName.Province)) - 1);
        }

        assertTrue(curent_state_1.isGameOver()); //check the game is over


        //checking the second victory condition of if 3 supplies are gone
       /* player_3 = new Player(curent_state_2, "player 3"); //create player 1
        curent_state_2.addPlayer(player_3); //add player 1
        player_4 = new Player(curent_state_2, "player 4"); //create player 2
        curent_state_2.addPlayer(player_4); //add player 2
        curent_state_2.initializeGame();//set up the game board

        for (int i = 0; i < 10; i++) {

            player_3.deck.add(cards.get(0));
            curent_state_2.gameBoard.put(cards.get(0) - 1);

           // player_3.deck.add(cards.get(1));
            //curent_state_2.gameBoard.put(Card.getCard(cards.get(1), cards.get(1).getCardName()), curent_state_2.gameBoard.get(1) - 1);


            //player_3.deck.add(cards.get(2));
            //curent_state_2.gameBoard.put(Card.getCard(cards.get(2), cards.get(2).getCardName()), curent_state_2.gameBoard.get(2) - 1);

        }
*/
    }

}
