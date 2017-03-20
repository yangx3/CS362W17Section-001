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



//NOTE: David Baugh Helped me a lot with these tests



public class Card_Test {

    private GameState curent_state; //declate the current game state
    private Player player_1;  //set up player 1
    private Player player_2; //set up player 2
    private List<Card> cards; //set up the list of cards used for the games

    @Before //This sets up the game before each test is run
    public void initializeGame() {

        cards = new ArrayList<Card>(Card.createCards()); //add the cards the the new card list
        curent_state = new GameState(cards); //create new game state
        player_1 = new Player(curent_state, "PLAYER 1"); //create player 1
        curent_state.addPlayer(player_1); //add player 1 to the game
        player_2 = new Player(curent_state, "PLAYER 2"); //create player 2
        curent_state.addPlayer(player_2); //add player 2 to the game
        curent_state.initializeGame();  //set up the game board
    }

    /**************************************************
     *                Test Treasure Card
     ************************************************/
    @Test
    public void testValuesCopper() { //test the copper values

        assertEquals(Card.getCard(cards, Card.CardName.Copper).getCost(), 0); //make sure it cost is 0
        assertEquals(Card.getCard(cards, Card.CardName.Copper).score(), 0); // make sure the score is 0
        assertEquals(Card.getCard(cards, Card.CardName.Copper).getType(), Card.Type.TREASURE); //make sure it is a TREASURE Card
    }

    @Test
    public void testPlayCopper() { //make sure the copper gives the player a coin

        assertEquals(player_1.coins, 0); //make sure the player has 0 coins starting out

        player_1.hand.add(Card.getCard(cards, Card.CardName.Copper)); //add copper to the players hand
        player_1.playTreasureCard(); //play the treasure card

        assertEquals(player_1.coins, 1); //make sure the player has 1 coin
    }

    @Test
    public void testValuesSilver() { //test the silver values

        assertEquals(Card.getCard(cards, Card.CardName.Silver).getCost(), 3); //make sure the coper has a cost of 3
        assertEquals(Card.getCard(cards, Card.CardName.Silver).score(), 0); //make sue the score is 0
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getType(), Card.Type.TREASURE); //make sure the card is a treasure card
    }

    @Test
    public void testPlaySilver() { //makes sure the player has 2 coins after is is bought

        assertEquals(player_1.coins, 0); //makes sure the player has no coins at the start

        player_1.hand.add(Card.getCard(cards, Card.CardName.Silver)); //ads silver card to plyaers hand
        player_1.playTreasureCard();//plays the silver card

        assertEquals(player_1.coins, 2); //makes sure the 2 coins were added to the player
    }

    @Test
    public void testValuesGold() { //test the gold values

        assertEquals(Card.getCard(cards, Card.CardName.Gold).getCost(), 6); //make sure the cost of the gold is 6
        assertEquals(Card.getCard(cards, Card.CardName.Gold).score(), 0); // make sure the score is 0
        assertEquals(Card.getCard(cards, Card.CardName.Gold).getType(), Card.Type.TREASURE); //make sure the card is marked as a treasure card

    }

    @Test
    public void testPlayGold() { //makes sure the player cains 3 coins when playing the gold

        assertEquals(player_1.coins, 0); //make sure the player has 0 coins

        player_1.hand.add(Card.getCard(cards, Card.CardName.Gold)); //add the gold card to the players hand
        player_1.playTreasureCard(); //play the treasure card

        assertEquals(player_1.coins, 3); //make sure the player has 3 coins after it was played
    }

    /**************************************************
     *                Test Action Card
     ************************************************/

    @Test
    public void testValuesAdventurer() { //testing the adventure values

        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getCost(), 6); //make sure that the cost is 6
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).score(), 0); //make sure the score is set to 0
        assertEquals(Card.getCard(cards, Card.CardName.Adventurer).getType(), Card.Type.ACTION); //makes sure the card is an action card
    }

    @Test
    public void testPlayAdventurer() { //test the adventure action card ability

        player_1.initializePlayerTurn(); //set up the player 1 turn

        assertEquals(player_1.coins, 0); //makes sure the player has 0 coins
        assertEquals(player_1.hand.size(), 5); // makes sure the player has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure the player has 5 cards in is deck
        assertEquals(player_1.playedCards.size(), 0); //make sure the player has not played any cards

        player_1.hand.add(Card.getCard(cards, Card.CardName.Adventurer)); //add the adventure to the players hand

        player_1.playKingdomCard(); //play the kingdom card

        assertTrue(player_1.hand.size() >= 6); //make sure the player has 6 or mroe cards in his hand
        assertTrue(player_1.deck.size() >= 1); //make sure the deck has at least 1 card in it (This is because the treasure cards could be at the bottom of the deck)
        assertEquals(player_1.playedCards.size(), 1); //make sure the player has marked the card as played

    }


    @Test
    public void testValuesAmbassador() { //test the Ambassador action card values

        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getCost(), 3); //make sure the cost is 3
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).score(), 0); //make sure the score is 0
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION); //make sure its an action card
    }

    @Test
    public void testPlayAmbassador() {//test the Ambassador action card ability

        player_1.initializePlayerTurn();  //set up player 1's turn
        player_2.initializePlayerTurn(); //set up player 2's turn

        assertEquals(player_1.hand.size(), 5); //make sure the player 1 has 5 cards in his hand
        assertEquals(player_1.deck.size(), 5); // make sure they have 5 cards in his deck
        assertEquals(player_1.discard.size(), 0); //make sure they have not discarded any cards
        assertEquals(player_1.playedCards.size(), 0); //make sure they have not played any cards
        assertEquals(player_1.discard.size(), 0); // make sure they have not discarded any cars

        player_1.hand.add(Card.getCard(cards, Card.CardName.Ambassador)); //add ambassador card the the players hand

        player_1.playKingdomCard(); //play the kingdom card

        assertEquals(player_1.hand.size(), 4); //make sure they have 4 cards in their hand after playing it
        assertEquals(player_1.deck.size(), 5); //make sure the deck has 5 cards in it
        assertEquals(player_1.discard.size(), 1); //make sure they had discarded the card
        assertEquals(player_1.playedCards.size(), 1); //make sure they marked it as played
        assertEquals(player_2.discard.size(), 1);  //make sure the player 2 has gained the card chosen

    }

    @Test
    public void testValuesBaron() { //test the baron card values

        assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4); //makes sure the card cost 4
        assertEquals(Card.getCard(cards, Card.CardName.Baron).score(), 0); //makes sure the score is set to 0
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION); //makes sure the card is an action card
    }
/*
    @Test
    public void testPlayBaron() { //test the baron action card ability

        player_1.initializePlayerTurn(); // set up player 1 turn

        //make sure the starting values are all set correctly
        assertEquals(player_1.numBuys, 1);
        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.coins, 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Baron)); //add baron the the players hand


        if(Card.getCard(player_1.hand, Card.CardName.Estate) != null){ //if the player has an estate in his hand

           // assertEquals(player_1.hand.size(), 5);
            //assertEquals(player_1.deck.size(), 4);
            assertEquals(player_1.discard.size(), 1);
            assertEquals(player_1.playedCards.size(), 1);
            assertEquals(player_1.numBuys, 3);
            assertEquals(player_1.coins, 4);

        } else { //else the player gains an estate

            player_1.playKingdomCard();

            assertEquals(player_1.hand.size(), 5);
            assertEquals(player_1.deck.size(), 4);
            assertEquals(player_1.discard.size(), 0);
            assertEquals(player_1.playedCards.size(), 1);
            assertEquals(player_1.numActions, 2);
            assertEquals(player_1.coins, 0);
        }
    }
*/
    @Test
    public void testValuesCouncilRoom() {

        assertEquals(Card.getCard(cards, Card.CardName.Council_room).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.Council_room).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Council_room).getType(), Card.Type.ACTION);
    }
/*
    @Test
    public void testPlayCouncilRoom() {

        player_1.initializePlayerTurn();
        player_2.initializePlayerTurn();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.numBuys, 1);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Council_room));

        player_1.playKingdomCard();

        assertEquals(player_1.hand.size(), 9);
        assertEquals(player_1.deck.size(), 1);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 1);
        assertEquals(player_1.numBuys, 2);

        for(Player p : curent_state.players){
            if(p != player_1) assertEquals(p.hand.size(), 6);
        }

    }
*/
    @Test
    public void testValuesCutpurse() {

        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Cutpurse).getType(), Card.Type.ACTION);
    }
/*
    @Test
    public void testPlayCutpurse() {

        player_1.initializePlayerTurn();
        player_2.initializePlayerTurn();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.coins, 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Cutpurse));

        player_1.playKingdomCard();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 1);
        assertEquals(player_1.coins, 2);

        for(Player p : curent_state.players){
            if(p != player_1) assertEquals(p.hand.size(), 4);
        }
    }
*/
    @Test
    public void testValuesEmbargo() {

        assertEquals(Card.getCard(cards, Card.CardName.Embargo).getCost(), 2);
        assertEquals(Card.getCard(cards, Card.CardName.Embargo).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Embargo).getType(), Card.Type.ACTION);
    }

    @Test
    public void testPlayEmbargo() {

        player_1.initializePlayerTurn();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.coins, 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Embargo));

        player_1.playKingdomCard();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.coins, 2);
//

    }

    @Test
    public void testValuesFeast() {


        assertEquals(Card.getCard(cards, Card.CardName.Feast).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Feast).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Feast).getType(), Card.Type.ACTION);
    }
/*
    @Test
    public void testPlayFeast() {

        player_1.initializePlayerTurn();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);
        assertEquals(player_1.coins, 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Feast));

        player_1.playKingdomCard();

        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertTrue(player_1.coins >= 5);

    }
*/
    @Test
    public void testValuesGreatHall() {

        assertEquals(Card.getCard(cards, Card.CardName.Great_hall).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Great_hall).score(), 1);
        assertEquals(Card.getCard(cards, Card.CardName.Great_hall).getType(), Card.Type.ACTION);
    }

    @Test
    public void testPlayGreatHall() {

        player_1.initializePlayerTurn();

        assertEquals(player_1.numActions, 1);
        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Great_hall));

        player_1.playKingdomCard();

        assertEquals(player_1.hand.size(), 6);
        assertEquals(player_1.deck.size(), 4);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 1);
        assertEquals(player_1.numActions, 1);

    }
    @Test
    public void testLaboratoryValue() {

        assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.Laboratory).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Laboratory).getType(), Card.Type.ACTION);
    }

    @Test
    public void testPlayLaboratory() {

        player_1.initializePlayerTurn();

        assertEquals(player_1.numActions, 1);
        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Laboratory));

        assertEquals(player_1.numActions, 1);
        assertEquals(player_1.hand.size(), 6);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);

    }

    @Test
    public void testValuesMine() {
        //assertEquals(Card.getCard(cards, Card.CardName.Copper).getCardName(), "Copper"); //String<Copper> vs CardName<Copper>?
        assertEquals(Card.getCard(cards, Card.CardName.Mine).getCost(), 5);
        assertEquals(Card.getCard(cards, Card.CardName.Mine).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Mine).getType(), Card.Type.ACTION);
    }

    @Test
    public void testPlayMine() {

        player_1.initializePlayerTurn();

        List<Card> before = Card.filter(player_1.hand, Card.Type.TREASURE);

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Mine));



        player_1.playKingdomCard();

        List<Card> after = Card.filter(player_1.hand, Card.Type.TREASURE);

        assertEquals(player_1.hand.size(), 4);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 1);
        assertEquals(player_1.playedCards.size(), 1);
        assertTrue(before.size() != after.size());
        assertTrue(Card.getCard(player_1.discard, Card.CardName.Silver) != null);
        assertTrue(Card.getCard(player_1.discard, Card.CardName.Gold) == null);



    }

    @Test
    public void testValuesSmithy() {

        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Smithy).getType(), Card.Type.ACTION);
    }
/*
    @Test
    public void testPlaySmithy() {

        player_1.initializePlayerTurn();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);

        player_1.hand.add(Card.getCard(cards, Card.CardName.Smithy));

        player_1.playKingdomCard();

        assertEquals(player_1.hand.size(), 8);
        assertEquals(player_1.deck.size(), 2);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 1);

    }
    */
    @Test
    public void testValuesVillage() {

        assertEquals(Card.getCard(cards, Card.CardName.Village).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Village).score(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Village).getType(), Card.Type.ACTION);
    }

    @Test
    public void testPlayVillage() {

        player_1.initializePlayerTurn();

        assertEquals(player_1.hand.size(), 5);
        assertEquals(player_1.deck.size(), 5);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 0);


        player_1.hand.add(Card.getCard(cards, Card.CardName.Village));

        player_1.playKingdomCard();


        assertEquals(player_1.hand.size(), 6);
        assertEquals(player_1.deck.size(), 4);
        assertEquals(player_1.discard.size(), 0);
        assertEquals(player_1.playedCards.size(), 1);
        assertEquals(player_1.numActions, 2);

    }

}